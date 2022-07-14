import org.omg.CORBA.Object;

import java.util.Observable;
import java.util.Observer;

public class InstanceMetrics implements Observer, Instance {
    private boolean isActiveInstance = false;
    public int metricsActive;
    public int metricsInactive;

    @Override
    public void active(boolean actual) {
        this.isActiveInstance = actual;

        if(actual == true) {
            metricsActive++;
        } else {
            metricsInactive++;
        }
    }
    @Override
    public void update(Observable object, java.lang.Object argument) {
        boolean action = Boolean.parseBoolean(String.valueOf(argument));
        if (action) {
            this.active(action);
        }
    }
}
