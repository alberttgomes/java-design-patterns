import java.util.Observable;

public class InstanceObject extends Observable implements Instance {
    private boolean isActiveInstance = false;
    
    @Override
    public void active(boolean actual) {
        this.isActiveInstance = actual;
    }
    @SuppressWarnings("changed state of object")
    public void changedState() {
        setChanged();
        notifyObservers(isActiveInstance);
    }

}
