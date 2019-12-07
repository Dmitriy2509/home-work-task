package com.hillel.lecture11;

public class User {

    private String name;


    public User(String name ){
        this.name=name;

    }

    public void sayHelloOtherUsers(){

        System.out.println("Hey everyone. " + name+ " starts to use this messenger");
    }


    public void welcome() {
        System.out.println("Hey a new user");

    }


    public void presentationOfMessangers() {

        System.out.println("You can type messages, record video and etc. with this messenger");

    }


    public void subscribeGroup() {

        System.out.println("Add this group to your list to see new messages");

    }


    public int thumbedThroughGroup(int like, int dislike) {
        System.out.println("You can thumbed through messages");
        int result = like/dislike;
        return result;
    }



    public void leaveGroup() {

        System.out.println("If You don't like this information, You can leave this group");

    }





    public void sendMessageToFiles(int upload) {


        if(upload>0) {
            int result = upload;
            System.out.println("You upload " + result);

        }


    }
}
