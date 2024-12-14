// Функция для распознавания речи
function startSpeechRecognition() {
    const recognition = new (window.SpeechRecognition || window.webkitSpeechRecognition)();
    recognition.lang = 'ru-RU';
    recognition.interimResults = false;
    recognition.maxAlternatives = 1;

    recognition.start();

    recognition.onresult = (event) => {
        const transcript = event.results[0][0].transcript;
        console.log('Распознанный текст:', transcript);
        sendQuestionToServer(transcript);
    };

    recognition.onerror = (event) => {
        console.error('Ошибка распознавания речи:', event.error);
    };
}

// Отправка вопроса на сервер
function sendQuestionToServer(question) {
    const socket = new WebSocket("ws://localhost:8080/ws");

    socket.onopen = () => {
        socket.send(question);
    };

    socket.onmessage = (event) => {
        const chatBox = document.getElementById("chat-box");
        chatBox.innerHTML += `<p><strong>AI:</strong> ${event.data}</p>`;
        chatBox.scrollTop = chatBox.scrollHeight;
        hideLoading();
    };

    showLoading();
}

// Анимация загрузки
function showLoading() {
    const chatBox = document.getElementById("chat-box");
    chatBox.innerHTML += `<p class="loading"><strong>AI:</strong> Loading...</p>`;
    chatBox.scrollTop = chatBox.scrollHeight;
}

function hideLoading() {
    const loadingMessage = document.querySelector(".loading");
    if (loadingMessage) {
        loadingMessage.remove();
    }
}

// Запуск распознавания речи
document.getElementById('start-recognition').addEventListener('click', startSpeechRecognition);