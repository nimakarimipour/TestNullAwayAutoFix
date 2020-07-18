package testpackage.return_param_mix;


public class CRP extends SRP {

    Object test(Object b){
        if(b.toString().startsWith("c")){
            return new Object();
        }
        else return null;
    }
}
