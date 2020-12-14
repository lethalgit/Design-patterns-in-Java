package com.designpatterns.observer.topicSubscribers;

import java.util.HashSet;
import java.util.Set;

/**
 * created by saurabhgupta on 14/12/20
 */
public interface Topic {
    public boolean addSubscriber(Subscriber subscriber);
    public boolean removeSubscriber(Subscriber subscriber);
    public void notifyAboutNewEvent(String newEvent);
}