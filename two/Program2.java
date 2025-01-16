package two;
public class Program2 {
    public static void main(String[] args) {
        
        Student rahul = new Student("Rahul");
        Student sameer = new Student("Sameer");
        Student priya = new Student("Priya");

        rahul.score = 10;
        sameer.score = 10;
        priya.score = rahul.score + sameer.score;

        System.out.println(rahul);
        System.out.println(sameer);
        System.out.println(priya);

        // overriding object value
        Student deepu = rahul;
        deepu.score = 1000;
        System.out.println(rahul);
    }
}


class Student{

    public String name;
    Student(String name){
        this.name = name;
    }

    public int score = 0;

    public String toString(){
        return this.name+" Score: "+String.valueOf(this.score);
    }
}