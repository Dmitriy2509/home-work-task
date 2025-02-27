package com.hillel.lecture11;

public class Telegram extends Messenger implements ISubscribe, ISendMessageToCloud {

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
    public void subscribeGroup() {

        System.out.println("Add this group to your list to see new messages");

    }

    @Override
    public int thumbedThroughGroup(int like, int dislike) {
        System.out.println("You can thumbed through messages");
        int result = like/dislike;
        return result;
    }


    @Override
    public void leaveGroup() {

        System.out.println("If You don't like this information, You can leave this group");

    }




    @Override
    public void sendMessageToFiles(int upload) {


        if(upload>0) {
            int result = upload;
            System.out.println("You upload " + result);

        }


    }
}
