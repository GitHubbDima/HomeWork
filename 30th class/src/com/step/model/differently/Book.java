package com.step.model.differently;

public class Book {
    private String title;
    private String  author;

    public void setAuthor_Title(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle_Author() {
        return "author. " + this.author + ", title. " + this.title;
    }
}
