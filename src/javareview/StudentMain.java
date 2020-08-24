package javareview;

import java.sql.SQLOutput;

public class StudentMain {
     //Shortcut : psvm
    public static void main(String[] args) {
        Student kwan = new Student(1, "Kwan");
        Student kate = new Student(2, "Kate");
//        Student kate = new Student();
//        kate.id = 2;
//        kate.name = "Kate";
//        System.out.println(kwan.getId() + ": "+ kwan.getName());
//        System.out.println(kate.getId() + ": "+ kate.getName());
//        System.out.println(kwan.toString());
//        System.out.println(kate.toString());
        System.out.println(kwan);
        System.out.println(kate);

        kwan.setMidtermScore(10);
        kwan.setFinalScore(8);
        System.out.println("Kwan's total = "+ kwan.getTotalScore());
//
//        Student s = kwan;
//        s.id = 100;
//        System.out.println(kwan.id + ":" + kwan.name);
    }

}
