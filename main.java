public class Main {
    public static void main(String[] args) {
        Mobile myMobile = new Mobile();
        myMobile.companyName = "iphone";
        myMobile.storage = 128;
        myMobile.serialNum = 7349261;
        myMobile.name = "iphone 13 pro max";
        myMobile.dualSim = true;
        myMobile.support4K = true;

        myMobile.call();
        myMobile.sendMessage();
        myMobile.playMedia();
    }
}
