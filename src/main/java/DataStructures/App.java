package DataStructures;

public class App {

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(10);

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.println("Value is: " + value);
        }

        System.out.println(reverseString("reversethis"));
    }

    public static String reverseString(String word) throws Exception {
        int stackSize = word.length(); //todo Get Max Stack Size
        Stack wordStack = new Stack(stackSize); //todo Initialize stack to amount of letters in Word

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i); //todo Getting a Character from the Word
            wordStack.push(character);
        }

        String reversedWord = "";
        while (!wordStack.isEmpty()) {
            char reversedLetterOfWord = wordStack.pop();
            reversedWord = reversedWord + reversedLetterOfWord;
        }

        return reversedWord;
    }
}
