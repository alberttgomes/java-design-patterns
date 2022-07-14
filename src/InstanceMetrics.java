import java.util.Observable;
import java.util.Observer;

public class InstanceMetrics implements Observer, Instance {
    private boolean isActiveInstance = false;

    @Override
    public void active(boolean actual) {
        this.isActiveInstance = actual;
    }

    @Override
    public void update(Observable object, Object argument) {
        boolean action = boolean.valueOf(argument);
        if (action) {
            this.active();
        } 
    }
}
