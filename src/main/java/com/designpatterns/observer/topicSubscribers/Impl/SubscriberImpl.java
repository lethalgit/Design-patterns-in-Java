package com.designpatterns.observer.topicSubscribers.Impl;

import com.designpatterns.observer.topicSubscribers.Subscriber;
import com.designpatterns.observer.topicSubscribers.Topic;

/**
 * created by saurabhgupta on 14/12/20
 */
public class SubscriberImpl implements Subscriber {
    final private String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    @Override
    public void updateDetails(String newEvent) {
        System.out.println("New event - " + newEvent);
    }


}
