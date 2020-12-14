package com.designpatterns.observer.RSS.Impl;

import com.designpatterns.observer.RSS.Article;
import com.designpatterns.observer.RSS.Feed;

import java.util.HashSet;
import java.util.Set;

/**
 * created by saurabhgupta on 14/12/20
 */
public class FeedImpl implements Feed {
    Set<Article> articleSet;
    String name;

    public FeedImpl(String name) {
        this.name = name;
        this.articleSet = new HashSet<>();
    }

    @Override
    public void updateFeed(Article article) {
        articleSet.add(article);
        displayThisArticle(article);
    }

    public void displayThisArticle(Article article) {
        System.out.println("Feed - " + name);
        article.displayAll();
    }

    public void displayAllArticles() {
        System.out.println("Feed - " + name);
        for(Article article: articleSet)
            article.displayHeadLine();
    }
}
