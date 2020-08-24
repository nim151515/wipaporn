package javareview;

public class Student {

    //----access specifier / access modifier -----
    // ตัวระบุการเข้าถึงตัวแปรและเมทอต มี 4 ระดับ
    // private,public,package (default),protected

    //----1. field,attribute,instance variavle---
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;
    //---- 2. constructor ----
    // ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    public Student(int id, String name){
        this.id = id;
        this.name = name;

    }

    //----3. method (คล้ายฟังก์ชั่น)----
    public double getTotalScore() {
        double total = midtermScore + finalScore;
        return total;
    }
    // getters คืนค่า
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    //  setters ตั้งค่า

    public void  setName(String name){
        this.name = name;
    }
    public void setMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;
    }
    public void setFinalScore(double finalScore){
        this.finalScore = finalScore;
    }

    // toString method
    public String toString(){
        return id + "=>" + name;
    }
}