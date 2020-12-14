package com.designpatterns.observer.RSS;

/**
 * created by saurabhgupta on 14/12/20
 */
public interface Article {
    public String displayHeadLine();
    public String displayData();
    public void displayAll();
    public String displayAuthor();
}
