package two;
import java.util.Scanner;


// QUESTION 01
// You are updating the username policy on your company's internal
// networking platform. According to the policy, a username is considered
// valid if all the following constraints are satisfied:

// The username consists of 8 to 30 characters inclusive. If the username
// consists of less than 8 or 30 greater than characters, then it is an
// invalid username.
// The username can only contain alphanumeric characters and underscores (_).
// Alphanumeric characters describe the character set consisting of lowercase
// characters[a-z] , uppercase characters [A-Z] , and digits [0-9].
// The first character of the username must be an alphabetic character, i.e.,
// either lowercase character [a-z] or uppercase character [A-Z].

// Kaushal
// invalid
// Kaushal_1113
// valid


// public class daytwoconeone {

//     public static boolean isValidUsername(String username) {

//         if (username.length() < 8 || username.length() > 30) {
//             return false;
//         }

//         if (!Character.isLetter(username.charAt(0))) {
//             return false;
//         }

//         for (char c : username.toCharArray()) {
//             if (!Character.isLetterOrDigit(c) && c != '_') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         String username1 = "Kaushal";
//         String username2 = "Kaushal_1113";

//         System.out.println(username1 + " is " + (isValidUsername(username1) ? "valid" : "invalid"));
//         System.out.println(username2 + " is " + (isValidUsername(username2) ? "valid" : "invalid"));
//     }
// }



// regex -  regular expressions
// ^[a-zA-Z][a-ZA-Z0-9_]{7,29}$

//if(str.matches(regularExpr))



// public class daytwoconeone {



//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         String regularExpr ="^[a-zA-Z][a-ZA-Z0-9_]{7,29}$";

//         if(str.matches(regularExpr)){
//             System.out.println("valid");
//         }
//         else{
//             System.out.println("invalid");
//         }
//     }}


//QUESTION 02 - PARANTHESIS BALANCING
import java.util.Stack;

public class daytwoconeone {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
               
                if (stack.isEmpty()) {
                    return false;
                }

                
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // Test cases
        String expr1 = "{[()]}";
        String expr2 = "{[(])}";
        String expr3 = "{{[[(())]]}}";

        System.out.println(expr1 + " is " + (isBalanced(expr1) ? "Balanced" : "Unbalanced"));
        System.out.println(expr2 + " is " + (isBalanced(expr2) ? "Balanced" : "Unbalanced"));
        System.out.println(expr3 + " is " + (isBalanced(expr3) ? "Balanced" : "Unbalanced"));
    }
}



// Teacher's solution to above problem statement

// public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);
// String str=sc.nextLine();
// Stack<Character> st = new Stack<>();
// for(char c : str.toCharArray()){ i=0 }
// if(c=='{' || c=='('|| c=='['){
// st.push(c); st=
// continue;
// }
// if(c=='}' && !st.isEmpty() && st.peek() =='{'){
// st.pop();
// continue;
// }
// if(c==')' && !st.isEmpty() && st.peek() =='('){
// st.pop();
// continue;
// }
// if(c==']' && !st.isEmpty() && st.peek() =='['){
// st.pop();
// continue;
// }

// if(c=='}' || c==']'|| c=='('){
// st.push(c);
// break;
// }



// }
// System.out.println(st.isEmpty());

// }