//package com.mysensei.mysensei.Controller;
//
//import com.mysensei.mysensei.Service.ZoomService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ZoomController {
//
//    @Autowired
//    private ZoomService zoomService;
//
//    @PostMapping("/create-zoom-meeting")
//    public String createZoomMeeting(@RequestParam String topic, @RequestParam String startTime) {
//        return zoomService.createMeeting(topic, startTime);
//    }
//}
