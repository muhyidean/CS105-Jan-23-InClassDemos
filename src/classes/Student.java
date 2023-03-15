package classes;

public class Student {

    int id;
    String name;
    double gpa;

    public void printInfo(){
        System.out.println(this.id + " " + this.name + " " + this.gpa);
    }

    public void updateGpa(double g){
        this.gpa = g;
    }

    public static int calcSum(int x, int y){
        return x + y;
    }


}
