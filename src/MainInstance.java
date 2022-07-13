public class MainInstance {
    public static void main(String[] args) {
        //Observer
        InstanceMetrics metrics = new InstanceMetrics();
        //Observable
        InstanceObject object = new InstanceObject();
        //Add instance between observer and observable
        object.addObserver(metrics);
        //Executable actions
        object.active();
        object.inactive();
        object.active();
    }
}
