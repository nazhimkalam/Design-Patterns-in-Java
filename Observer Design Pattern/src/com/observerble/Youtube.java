package com.observerble;

    // Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified,
    // its dependent objects are to be notified automatically.
    // Observer pattern falls under behavioral pattern category.

public class Youtube
{
    public static void main(String[] args) {
        Channel myChannel = new Channel();

        Subscriber s1 = new Subscriber("Nazhim");
        Subscriber s2 = new Subscriber("Ammar");
        Subscriber s3 = new Subscriber("Shonny");
        Subscriber s4 = new Subscriber("Sushant");
        Subscriber s5 = new Subscriber("Sharuk");

        myChannel.subscribe(s1);
        myChannel.subscribe(s2);
        myChannel.subscribe(s3);
        myChannel.subscribe(s4);
        myChannel.subscribe(s5);

        myChannel.unSubscribe(s2);

        s1.subscribeChannel(myChannel);
        s2.subscribeChannel(myChannel);
        s3.subscribeChannel(myChannel);
        s4.subscribeChannel(myChannel);
        s5.subscribeChannel(myChannel);

        myChannel.upload("Learn how to code ....");
    }
}
