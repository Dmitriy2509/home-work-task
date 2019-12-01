package com.hillel.lecture11;

public class Whatsapp extends Messenger implements ISendMessageToCloud {

    public void sayHelloOtherUsers(){

        System.out.println("Hey everyone. " + nickname+ " starts to use this messenger");
    }

    @Override
    public void welcome() {
        System.out.println("Hey a new user");

    }

    @Override
    public void presentationOfMessangers() {

        System.out.println("You can type messages, record video and etc. with this messenger");

    }

    @Override
    public void sendMessageToFiles() {
        System.out.println("Use the cloud for saving files");
    }
}
