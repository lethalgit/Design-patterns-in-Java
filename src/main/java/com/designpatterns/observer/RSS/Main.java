package com.designpatterns.observer.RSS;

import com.designpatterns.observer.RSS.Impl.ArticleImpl;
import com.designpatterns.observer.RSS.Impl.FeedImpl;
import com.designpatterns.observer.RSS.Impl.NewsImpl;

/**
 * created by saurabhgupta on 14/12/20
 */
public class Main {
    public static void main(String[] args) {
        News news = new NewsImpl();
        Feed feed1 = new FeedImpl("feed1");
        Feed feed2 = new FeedImpl("feed2");
        Feed feed3 = new FeedImpl("feed3");
        news.addListeners(feed1);
        Article article1 = new ArticleImpl("headLine1", "data1", "me1");
        news.updateWithANewsArticle(article1);
        news.addListeners(feed2);
        news.updateWithANewsArticle(article1);
        Article article2 = new ArticleImpl("headLine2", "data2", "me2");
        news.updateWithANewsArticle(article2);
        news.addListeners(feed3);
        news.updateWithANewsArticle(article1);
        news.updateWithANewsArticle(article2);
        Article article3 = new ArticleImpl("headLine3", "data3", "me3");
        news.updateWithANewsArticle(article3);
    }
}
