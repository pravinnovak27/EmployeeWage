package jlk;

public class DailyWage {
    public static void main(String []args) {

        int fullTime = 1;
        int wagePerHour = 20;
        int workingHour = 8;

        int attendance = (int) (Math.random() * 100) % 2;

        if (fullTime == attendance) {
            System.out.println("Present");
            workingHour = 8;

        }
        int wage = wagePerHour * workingHour;
        System.out.println("Fulltime Employee daily wage: " + wage + " Rupees.");

    }

}

