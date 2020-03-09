package com.service.testaaa.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestaaa {

        TestaaaDelegate testaaaDelegate = new TestaaaDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testaaaDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}