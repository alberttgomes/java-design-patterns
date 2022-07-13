import java.util.Observable;
import java.util.Observer;

public class InstanceMetrics implements Observer, Instance {
    @Override
    public void active() {
        System.out.println("Objet active at Metrics");
    }
    @Override
    public void inactive() {
        System.out.println("Object inactive at Metrics");
    }

    @Override
    public void update(Observable o, Object arg) {
//        InstanceObject objectObservable = (InstanceObject)arg;
        String action = String.valueOf(arg);

        if (action.equals("active")) {
            this.active();
        }
        else if (action.equals("inactive")) {
            this.inactive();
        }
    }
}
