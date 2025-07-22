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

        VisitorCounter v1 = new VisitorCounter("Ahmed");
        VisitorCounter v2 = new VisitorCounter("khalid");
        VisitorCounter v3 = new VisitorCounter("feras");

        v1.recordVisits();
        v1.recordVisits();

        v2.recordVisits();
        v3.recordVisits();
        v3.recordVisits();
        v3.recordVisits();


        displayTotalVisitors();

    }
}
