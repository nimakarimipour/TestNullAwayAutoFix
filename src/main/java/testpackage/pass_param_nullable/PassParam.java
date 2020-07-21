package testpackage.pass_param_nullable;

import javax.annotation.Nullable;
public class PassParam {

    Object test(int i, Object h) {
        return h;
    }

    Object test_param(@Nullable String o) {
        return test(0, o);
    }
}

