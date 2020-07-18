package testpackage.return_nullable;

public class CReturn extends SReturn{

    Object test(boolean b){
        if(b){
            return new Object();
        }
        else return null;
    }
}
