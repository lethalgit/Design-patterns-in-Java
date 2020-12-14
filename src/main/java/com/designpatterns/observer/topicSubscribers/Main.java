package com.designpatterns.observer.topicSubscribers;

import com.designpatterns.observer.topicSubscribers.Impl.SubscriberImpl;
import com.designpatterns.observer.topicSubscribers.Impl.TopicImpl;

/**
 * created by saurabhgupta on 14/12/20
 */
public class Main {
    public static void main(String[] args) {
        Topic topic = new TopicImpl();
        Subscriber subscriber1 = new SubscriberImpl("one");
        topic.addSubscriber(subscriber1);
        topic.notifyAboutNewEvent("event1");
        Subscriber subscriber2 = new SubscriberImpl("two");
        topic.addSubscriber(subscriber2);
        topic.notifyAboutNewEvent("event2");
        Subscriber subscriber3 = new SubscriberImpl("three");
        topic.addSubscriber(subscriber3);
        topic.notifyAboutNewEvent("event3");
        topic.removeSubscriber(subscriber1);
        topic.removeSubscriber(subscriber2);
        topic.removeSubscriber(subscriber3);
    }
}
