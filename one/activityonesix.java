package one;
public class activityonesix{
    public static void main(String[] args) {
        String scientists = "Issac Newton, Neils Bohr & Rutherford, Robert Brown, George Simon Ohm";

        String[] scientistArray = scientists.split(", | & ");

        for (String scientist : scientistArray) {
            
            String[] nameParts = scientist.split(" ");

            String lastName = nameParts[nameParts.length - 1];
            char firstInitial = nameParts[0].charAt(0);

            String invitation = "Dear Mr. " + lastName + "." + firstInitial;

            System.out.println(invitation);
        }
    }
}

