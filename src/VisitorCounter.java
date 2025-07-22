public class VisitorCounter {

    private static int totalVisitors;

    private int sessionVisits;
    private String visitorName;

    public VisitorCounter(String name) {
        this.visitorName = name;
        this.sessionVisits =0;
        totalVisitors++;

    }

    public void recordVisits(){
        sessionVisits++;
        System.out.println(visitorName+" Visited. Session Visits: "+sessionVisits);
    }

    public static void displayTotalVisitors(){

        System.out.println("Total Visitors Today: "+totalVisitors);

    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static void main(String[] args) {

    }
}
