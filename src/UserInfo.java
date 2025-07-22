public class UserInfo {

    private String name;
    private int age;
    private String email;
    private boolean isActive;


    public UserInfo(String name,int age, String email,boolean isActive ){
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean getisActive() {
        return isActive;
    }

    public void displyInfo(){

        System.out.println("User info: \n"+ "Name: "+getName()+"\n"+"Age: "+getAge()
        + "\n"+"Email: "+getEmail()+"\n"+"Is Active: "+getisActive());
    }


    public static void main(String[] args) {
        UserInfo User1 = new UserInfo("Ahmed",22,"ahmed99@gmail.com",true);
        UserInfo User2 = new UserInfo("muhammad",35,"muhammadQ8@gmail.com",false);
        UserInfo User3 = new UserInfo("Salman",28,"salmanqat007@gmail.com",true);


        User1.displyInfo();
        System.out.println("Active Status: "+User1.getisActive());
        User1.setActive(false);
        System.out.println("New Active Status: "+User1.getisActive());

        System.out.println("--------------------------------------------");
        User2.displyInfo();
        System.out.println("Name: "+User2.getName());
        User2.setName("hamad");
        System.out.println("Changed Name: "+User2.getName());

        System.out.println("--------------------------------------------");
        User3.displyInfo();
        System.out.println("Age: "+User3.getAge());
        User3.setAge(77);
        System.out.println("Changed Age: "+User3.getAge());
    }




}
