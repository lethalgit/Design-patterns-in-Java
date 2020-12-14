package com.designpatterns.observer.RSS.Impl;

import com.designpatterns.observer.RSS.Article;

/**
 * created by saurabhgupta on 14/12/20
 */
public class ArticleImpl implements Article {
    String headLine;
    String data;
    String author;

    public ArticleImpl(String headLine, String data, String author) {
        this.headLine = headLine;
        this.data = data;
        this.author = author;
    }

    @Override
    public String displayHeadLine() {
        return headLine;
    }

    @Override
    public String displayData() {
        return data;
    }

    @Override
    public void displayAll() {
        System.out.println("HeadLine - " + headLine);
        System.out.println("Details - " + data);
        System.out.println("Authored by - " + author);
    }

    @Override
    public String displayAuthor() {
        return author;
    }
}
