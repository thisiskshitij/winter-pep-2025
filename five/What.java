public class What {

    public static void main(String[] args) {

        User nishant = new User();
        User rajan = new User();

        nishant.sendText("hurray! i am learning Java");

        rajan.getLastSentMessage();
        nishant.getLastSentMessage();
    }
}

class User {
    String msg;

    void sendText(String msg) {
        this.msg = msg;
        System.out.println("Message Sent " + this.msg);
    }

    void getLastSentMessage() {
        System.out.println(this.msg);
    }

}
