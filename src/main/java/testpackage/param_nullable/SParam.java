package testpackage.param_nullable;

import javax.annotation.Nullable;

public class SParam {

    @Nullable
    String test(@Nullable Object b){
        if(b != null) return b.toString();
        else return null;
    }
}
