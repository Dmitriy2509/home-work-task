package com.hillel.lecture11;

public abstract class  Messenger {

    String nickname;
    String aboutyourself;

    public abstract void welcome();

    public void sayHelloOtherUsers(){

        System.out.println("Hey everyone. " + nickname+ " I start to use this messenger");
    }

    public abstract void presentationOfMessangers();



}
