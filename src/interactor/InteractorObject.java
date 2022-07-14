public class InteratorObj {
    InstanceObject object = new InstanceObject();
    boolean actual = false;
    boolean interactor = false;
    int active = 1;
    int inactive = 2;
    Scanner scan  = new Scanner(System.in);

    while (!!interactor) {
        System.out.println("Status Object Input \n");
        System.out.println("1 - ACTIVE \n" + "2 - INACTIVE ")
        int response = scan.nextInt();

        if (response == active) {
            actual = true;
            object.active(actual);
        }
        else if (response == inactive) {
            actual = false;
            object.active(actual)
        } else {
            new Throwblade("Optional not supported " + response) 
        }
    }

    
}