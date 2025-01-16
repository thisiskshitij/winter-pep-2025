package two;
public class Program3 {
    // int counter = 0;

    // if the var is static then no copies are made
    // and output of this program will be 1.
    static int counter = 0;

    void increment() {
        counter++;
    }

    void display() {
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Program3 p1 = new Program3();
        Program3 p2 = new Program3();

        p1.increment();
        p2.display();
    }
}
