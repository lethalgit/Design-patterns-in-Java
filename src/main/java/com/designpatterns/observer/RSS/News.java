package com.designpatterns.observer.RSS;

import com.designpatterns.observer.RSS.Article;

/**
 * created by saurabhgupta on 14/12/20
 */
public interface News {
    public boolean addListeners(Feed feed);
    public boolean removeListeners(Feed feed);
    public void updateWithANewsArticle(Article article);
}
