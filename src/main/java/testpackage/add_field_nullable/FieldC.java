package testpackage.add_field_nullable;

import javax.annotation.Nullable;

public class FieldC {
    Object h = new Object();

    public void test(@Nullable Object f){
        h = f;
    }
}
