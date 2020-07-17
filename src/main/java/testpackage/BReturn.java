package testpackage;

public class BReturn extends SReturn{

    Object test(boolean b){
        if(b){
            return new Object();
        }
        else return null;
    }
}


