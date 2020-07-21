package testpackage.mix;


import javax.annotation.Nullable;

public class SRP{

    Object test(Integer i, Object h) {
        return i;
    }

    Object test_param(@Nullable String o) {
        return test(0, o);
    }
}
