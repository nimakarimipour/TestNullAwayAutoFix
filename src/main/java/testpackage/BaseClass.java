package testpackage;
import java.util.stream.StreamSupport;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

public class BaseClass extends SuperClass{

    @Nullable Object test(boolean b){
        if(b){
            return new Object();
        }
        else return null;
    }
}
