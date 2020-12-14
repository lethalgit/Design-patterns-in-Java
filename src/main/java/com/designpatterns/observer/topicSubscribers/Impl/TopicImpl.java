package com.designpatterns.observer.topicSubscribers.Impl;

import com.designpatterns.observer.topicSubscribers.Subscriber;
import com.designpatterns.observer.topicSubscribers.Topic;

import java.util.HashSet;
import java.util.Set;

/**
 * created by saurabhgupta on 14/12/20
 */
public class TopicImpl implements Topic {
    String event;
    Set<Subscriber> subscriberSet;

    public TopicImpl() {
        subscriberSet = new HashSet<>();
        event = null;
    }

    @Override
    public boolean addSubscriber(Subscriber subscriber) {
        return subscriberSet.add(subscriber);
    }

    @Override
    public boolean removeSubscriber(Subscriber subscriber) {
        return subscriberSet.remove(subscriber);
    }

    @Override
    public void notifyAboutNewEvent(String newEvent) {
        event = newEvent;
        for(Subscriber subscriber: subscriberSet) {
            subscriber.updateDetails(event);
        }
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Set<Subscriber> getSubscriberSet() {
        return subscriberSet;
    }

    public void setSubscriberSet(Set<Subscriber> subscriberSet) {
        this.subscriberSet = subscriberSet;
    }
}
