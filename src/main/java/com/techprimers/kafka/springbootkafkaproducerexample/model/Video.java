package com.techprimers.kafka.springbootkafkaproducerexample.model;

import javax.validation.constraints.NotNull;

public class Video {

    private String id;
    private String topic;
    private String audio;

    public Video() {}

    public Video(String id, String topic, String audio) {
        this.id = id;
        this.topic = topic;
        this.audio = audio;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAudio() {
        return audio;
    }
    public void setAudio(String audio) {
        this.audio = audio;
    }
}
