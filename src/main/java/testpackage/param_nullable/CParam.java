package testpackage.param_nullable;

import javax.annotation.Nullable;

public class CParam extends SParam{

    @Nullable
    String test(Object b){
        if(b.toString().startsWith("A"))
            return b.toString();
        else return null;
    }
}
