package com.egehurturk;

public interface ITelephone {
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}

// access modifiers are not logical to use in interfaces
// you had to implement all the methods defined in the interace in a class that implements it