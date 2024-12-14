//package com.mysensei.mysensei.Service;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.springframework.stereotype.Service;
//
//@Service
//public class GoogleMeetService {
//
//    private WebDriver driver;
//
//    public void joinMeeting(String meetingUrl) {
//        // Установите путь к драйверу ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//
//        // Настройка опций Chrome
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--use-fake-ui-for-media-stream"); // Для автоматического доступа к камере и микрофону
//
//        // Инициализация WebDriver
//        driver = new ChromeDriver(options);
//
//        // Переход на страницу Google Meet
//        driver.get(meetingUrl);
//
//        // Автоматическое подключение к конференции
//        try {
//            Thread.sleep(5000); // Ожидание загрузки страницы
//            driver.findElement(By.cssSelector("div[role='button'][aria-label='Join now']")).click();
//            System.out.println("Joined the meeting: " + meetingUrl);
//        } catch (Exception e) {
//            System.err.println("Failed to join the meeting: " + e.getMessage());
//        }
//    }
//
//    public void leaveMeeting() {
//        if (driver != null) {
//            driver.quit();
//            System.out.println("Left the meeting.");
//        }
//    }
//}
