public class Mobile {
    String companyName;
    short storage;
    long serialNum;
    String name;
    boolean dualSim;
    boolean support4K;

    public void call() {
        System.out.println("Calling");
    }

    public void sendMessage() {
        System.out.println("Sending a message");
    }

    public void playMedia() {
        System.out.println("Playing media");
    }
}
