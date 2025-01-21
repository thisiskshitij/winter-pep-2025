class Father{
    public Father(){
        System.out.println("Constructor of Base");
    }
    // Parameterized base constructor in this parent class
    public Father(String msg){
        System.out.println(msg);
    }
    void foodHabit(String msg){
        System.out.println("I like salty");
    }
}

// If calling construtor of derived class , first constructor of parent class
// is called then constructor of derived class in called.

class Son extends Father{
    public Son(){
        // super is used to call parameterized base constructor of parent class
        super("Calling Parameterized Base constructor");
        System.out.println("Constructor of Derived");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Son dheeraj = new Son();
        dheeraj.foodHabit("Dear");
    }
}
