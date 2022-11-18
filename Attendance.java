package jlk;

public class Attendance {
    public static void main(String []args) {

        int fullTime = 1;
        int attendance = (int) (Math.random() * 100) % 2;

        if (fullTime == attendance)
            System.out.println("Present");

        else {
            System.out.println("Absent");

        }
    }
}
