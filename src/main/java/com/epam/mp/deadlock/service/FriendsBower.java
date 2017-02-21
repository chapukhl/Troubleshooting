package com.epam.mp.deadlock.service;

import com.epam.mp.deadlock.entity.Friend;

public interface FriendsBower {

    void bow(Friend firstBower, Friend secondBower);

    void bowBack(Friend firstBower, Friend secondBower);
}
