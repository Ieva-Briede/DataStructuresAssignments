import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Assignment2 {

    public static void main(String[] args) {
        //     String sentence = "Mom";
//        String sentence = "Was it a car or a cat I saw?";
//       String sentence = "Madam, in Eden, I’m Adam.";
//        String sentence = "Yo, banana boy!";
        //String sentence = " Can't be truth";

        stackMethod("Madam, in Eden, I’m Adam.");
        queueMethod("Can't be truth");
    }

    public static void stackMethod(String sentence) {
        Stack stack = new Stack();
        String reverseSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (int i = 0; i < reverseSentence.length(); i++) {
            stack.push(reverseSentence.charAt(i));
        }
        String newSentence = "";
        while (!stack.isEmpty()) {
            newSentence = newSentence + stack.pop();
        }
        if (reverseSentence.equals(newSentence)) {
            System.out.println(sentence + " - The input String is a palindrome.");
        } else {
            System.out.println(sentence + " - The input String is not a palindrome.");
        }

    }

    public static void queueMethod(String sentence) {
        Queue queue = new LinkedList();
        String reverseSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (int i = reverseSentence.length() - 1; i >= 0; i--) {
            queue.add(reverseSentence.charAt(i));
        }
        String newSentence = "";
        while (!queue.isEmpty()) {
            newSentence = newSentence + queue.remove();
        }
        if (reverseSentence.equals(newSentence)) {
            System.out.println(sentence + " - The input String is a palindrome.");
        } else
            System.out.println(sentence + " - The input String is not a palindrome.");

    }
}
