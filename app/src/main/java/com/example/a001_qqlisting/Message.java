package com.example.a001_qqlisting;

public class Message {
    private String imageView;
    private String msg_name;
    private String msg_content;
    private String msg_time;

    public String getImageView() {
        return imageView;
    }

    public void setImageView(String imageView) {
        this.imageView = imageView;
    }

    public String getMsg_name() {
        return msg_name;
    }

    public void setMsg_name(String msg_name) {
        this.msg_name = msg_name;
    }

    public String getMsg_content() {
        return msg_content;
    }

    public void setMsg_content(String msg_content) {
        this.msg_content = msg_content;
    }

    public String getMsg_time() {
        return msg_time;
    }

    public void setMsg_time(String msg_time) {
        this.msg_time = msg_time;
    }

    public Message(String imageView, String msg_name, String msg_content, String msg_time) {
        this.imageView = imageView;
        this.msg_name = msg_name;
        this.msg_content = msg_content;
        this.msg_time = msg_time;
    }
}
