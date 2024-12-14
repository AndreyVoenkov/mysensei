//package com.mysensei.mysensei.Controller;
//
//import com.mysensei.mysensei.Service.GoogleMeetService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class GoogleMeetController {
//
//    @Autowired
//    private GoogleMeetService googleMeetService;
//
//    @PostMapping("/join-google-meet")
//    public String joinGoogleMeet(@RequestParam String meetingUrl) {
//        googleMeetService.joinMeeting(meetingUrl);
//        return "Joined Google Meet: " + meetingUrl;
//    }
//
//    @PostMapping("/leave-google-meet")
//    public String leaveGoogleMeet() {
//        googleMeetService.leaveMeeting();
//        return "Left Google Meet.";
//    }
//}
