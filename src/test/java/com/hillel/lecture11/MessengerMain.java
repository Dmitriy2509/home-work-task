package com.hillel.lecture11;

public class MessengerMain {

    public static void main(String[] args) {

        Telegram telegram = new Telegram();
        Whatsapp whatsapp = new Whatsapp();

        //You can use different devices for this messenger

        TypeOfMessenger typeOfMessenger = TypeOfMessenger.TELEGRAMMOBILE;


        telegram.nickname= "Igor";
        telegram.sayHelloOtherUsers();

        telegram.welcome();
        telegram.presentationOfMessangers();
        telegram.subscribeGroup();
        telegram.thumbedThroughGroup();
        telegram.leaveGroup();
        telegram.sendMessageToFiles();

        TypeOfMessenger typeOfMessenger1 = TypeOfMessenger.WHATSAPPMOBILE;
        whatsapp.nickname = "Ann";
        whatsapp.sayHelloOtherUsers();
        whatsapp.welcome();
        whatsapp.presentationOfMessangers();
        whatsapp.sendMessageToFiles();


        };
    }

