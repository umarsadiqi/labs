package com.company;

/**
 * @author Rahul Kanwal 3144895
 */
class Book {
    private String title ;
    private String author;

    Book(String title , String author) {
        this.title = title ;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }

}

