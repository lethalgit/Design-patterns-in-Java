package com.designpatterns.observer.topicSubscribers;

import com.designpatterns.observer.topicSubscribers.Impl.SubscriberImpl;

/**
 * created by saurabhgupta on 14/12/20
 */
public interface Subscriber {
    public void updateDetails(String newEvent);
}
