package Singleton;



public class main {
    public static void main(String[] args) {
    DbConnect d1 = DbConnect.getInstance();
    DbConnect d2 = DbConnect.getInstance();
System.out.println(d1);
System.out.println(d2);
    }
}
