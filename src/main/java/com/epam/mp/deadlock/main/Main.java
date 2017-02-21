package com.epam.mp.deadlock.main;

import com.epam.mp.deadlock.entity.Friend;
import com.epam.mp.deadlock.service.FriendsBower;
import com.epam.mp.deadlock.service.FriendsBowerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    @Autowired
    private FriendsBower friendsBower;

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.epam.mp.*");
        FriendsBower friendsBower = ctx.getBean(FriendsBowerImpl.class);

        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");
        new Thread(() -> friendsBower.bow(gaston, alphonse)).start();
        new Thread(() -> friendsBower.bow(gaston, alphonse)).start();
    }
}
