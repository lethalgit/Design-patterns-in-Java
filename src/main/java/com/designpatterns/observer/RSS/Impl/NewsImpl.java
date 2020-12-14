package com.designpatterns.observer.RSS.Impl;

import com.designpatterns.observer.RSS.Article;
import com.designpatterns.observer.RSS.Feed;
import com.designpatterns.observer.RSS.News;

import java.util.HashSet;
import java.util.Set;

/**
 * created by saurabhgupta on 14/12/20
 */
public class NewsImpl implements News {
    Set<Feed> feedSet;
    Set<Article> articles;
    public NewsImpl() {
        feedSet = new HashSet<>();
        articles = new HashSet<>();
    }

    @Override
    public boolean addListeners(Feed feed) {
        return feedSet.add(feed);
    }

    @Override
    public boolean removeListeners(Feed feed) {
        return feedSet.remove(feed);
    }

    @Override
    public void updateWithANewsArticle(Article article) {
        articles.add(article);
        for(Feed feed: feedSet) {
            feed.updateFeed(article);
        }
    }
}
