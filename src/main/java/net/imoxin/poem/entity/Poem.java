package net.imoxin.poem.entity;

import java.io.Serializable;

public class Poem implements Serializable {

    private String title;
    private String content;
    private String text;

    public Poem(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}
