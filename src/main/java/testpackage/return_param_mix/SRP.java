package testpackage.return_param_mix;


import javax.annotation.Nullable;

public class SRP{

    Object test(@Nullable Object b){
        if(b == null)
            return new Object();
        else return b;
    }
}
