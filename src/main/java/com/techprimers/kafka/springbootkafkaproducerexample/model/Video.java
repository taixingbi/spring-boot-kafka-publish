package com.techprimers.kafka.springbootkafkaproducerexample.model;

import javax.validation.constraints.NotNull;

public class Video {

    @NotNull(message = "key:id not Found")
    private String id;

    @NotNull(message = "key:topic not Found")
    private String topic;

    @NotNull(message = "key:video not Found")
    private String video;

    @NotNull(message = "key:timestamp not Found")
    private String timestamp;

    public Video() {}

    public Video(String id, String topic, String video, String timestamp) {
        this.id = id;
        this.topic = topic;
        this.video = video;
        this.timestamp = timestamp;
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

    public String getVideo() {
        return video;
    }
    public void setVideo(String video) {
        this.video = video;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
