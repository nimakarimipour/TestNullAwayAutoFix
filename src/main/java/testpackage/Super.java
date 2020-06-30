package testpackage;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

public class Super {
    //Test for Return Nullable

    Object test(boolean b){
        if(b){
            return new Object();
        }
        else return null;
    }
}
