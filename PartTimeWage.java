package jlk;

public class PartTimeWage {
    public static void main(String []args) {

        int fullTime = 1;
        int partTime = 2;
        int wagePerHour = 20;
        int workingHour = 8;
        String a = "";

        int attendance = (int) (Math.random() * 100) % 3;

        if (fullTime == attendance) {
            System.out.println("Fulltime");
            workingHour = 8;
            a = "Fulltime";

        } else if (partTime == attendance) {
            System.out.println("Parttime");
            workingHour = 8;
            a = "Partime";

        }
        int wage = wagePerHour * workingHour;
        System.out.println( a + " Employee daily wage: " + wage + " Rupees.");

    }

}

