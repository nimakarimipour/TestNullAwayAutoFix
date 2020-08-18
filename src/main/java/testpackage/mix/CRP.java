package testpackage.mix;

public class CRP extends SRP {

    @Override
    Object test(Integer i, Object h) {
        if(i > 0) return i;
        else return null;
    }
}
