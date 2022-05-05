package com.company;

interface camera2{
    void takeSnap();
    void RecordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k... ");
    }
}

interface wifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phonenumber){
        System.out.println("Calling" + phonenumber);
    }
    void pickCall(){
        System.out.println("Picking Call");
    }


}
class MySmartPhone2 extends MyCellPhone2 implements wifi2,camera2{
    public void takeSnap(){
        System.out.println("Takeing Snap");
    }


//    public void record4kVideo(){
//        System.out.println("Takeing Snap");
//    }
    public  String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Kush","Anuj"};
        return networkList;
    }
    public void connectToNetwork(String network ){
        System.out.println("Connecting to"+network);
    }
}


public class kush_code_polymor {
    public static void main(String[] args) {
        camera2 cam2 = new MySmartPhone2();
        cam2.record4kvideo();
    }
}
