package com.hillel.lecture11;

public class MessengerMain {

    public static void main(String[] args) {

        Telegram telegram = new Telegram();
        Whatsapp whatsapp = new Whatsapp();
        User user = new User("Tom");


        user.presentationOfMessangers();
        user.subscribeGroup();
        user.sayHelloOtherUsers();
        //You can use different devices for this messenger

        TypeOfMessenger typeOfMessenger = TypeOfMessenger.TELEGRAMMOBILE;


        /*telegram.nickname= "Igor";
        telegram.sayHelloOtherUsers();

        telegram.welcome();
        telegram.presentationOfMessangers();
        telegram.subscribeGroup();*/



        try {
            telegram.sendMessageToFiles(-4);
        } catch (Exception e){
            e.getMessage();
        } finally {
            System.out.println("Quantity of files must be positive");
        }
        try {
            telegram.thumbedThroughGroup(3, 0);
        } catch (Exception e){

            e.getMessage();

        }
        telegram.leaveGroup();




        //int quantity =2/0;
        // set quantity
        /*try {
          if(telegram.sendMessageToFiles(12,15)<0){

          }

        }catch (Exception e) {

            e.printStackTrace();

        }*/

        /*int quantity = -150;

        try {
            assert quantity>0;
        }catch (Exception e) {
            e.printStackTrace();

        }*/


        TypeOfMessenger typeOfMessenger1 = TypeOfMessenger.WHATSAPPMOBILE;
        whatsapp.nickname = "";

        if (whatsapp.nickname==null){
            throw new NullPointerException("Nickname is necessary");
        }
        whatsapp.sayHelloOtherUsers();
        whatsapp.welcome();
        whatsapp.presentationOfMessangers();





        };
    }

