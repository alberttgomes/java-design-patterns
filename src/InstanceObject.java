import java.util.Observable;

public class InstanceObject extends Observable implements Instance {
    String action = "";
    @Override
    public void active() {
        action = "active";
        this.changedState();
        System.out.println("This object it's active");
    }
    @Override
    public void inactive() {
        action = "inactive";
        this.changedState();
        System.out.println("This object it's inactive");
    }
    @SuppressWarnings("unchecked")
    public void changedState() {
        setChanged();
        notifyObservers(action);
    }

}
