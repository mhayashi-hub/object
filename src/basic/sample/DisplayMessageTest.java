package basic.sample;

class DisplayMessageTest {
    static void displayMessage(String word) {
        System.out.println(word);
    }
     static void displayMessageAnswer(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        displayMessage("Hello,こんにちわ");
        displayMessageAnswer("Thank you, ありがとう");
    }
}
