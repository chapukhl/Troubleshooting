package com.epam.mp.deadlock.service;

import com.epam.mp.deadlock.entity.Friend;
import org.springframework.stereotype.Component;

@Component
public class FriendsBowerImpl implements FriendsBower {

    synchronized public void bow(Friend firstBower, Friend secondBower) {
        System.out.format("%s: %s"
                        + "  has bowed to me!%n",
                secondBower.getName(), firstBower.getName());
        this.bowBack(secondBower, firstBower);
    }

    synchronized public void bowBack(Friend firstBower, Friend secondBower) {
        System.out.format("%s: %s"
                        + " has bowed back to me!%n",
                secondBower.getName(), firstBower.getName());
    }
}
