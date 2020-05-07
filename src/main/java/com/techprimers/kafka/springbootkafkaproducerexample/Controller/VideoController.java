package com.techprimers.kafka.springbootkafkaproducerexample.Controller;

import com.techprimers.kafka.springbootkafkaproducerexample.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class VideoController {

    @Autowired
    private KafkaTemplate<String, Video> kafkaTemplate;
//    private static final String TOPIC = "test";

    @CrossOrigin
    @PostMapping("/publish")
    public Video publishApi(@RequestBody Video video) {
        //Video video= new Video("session id", "test", "base64");
        System.out.println( " id: " +  video.getId() +
                ", topic: " + video.getTopic() +
                ", audio: " + video.getAudio()
        );

        kafkaTemplate.send(video.getTopic(), video);
        return video;
    }

    @GetMapping("/test")
    public String test() {

        return "test successfully";
    }

}
