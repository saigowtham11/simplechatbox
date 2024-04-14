import java.util.Scanner;

public class SampleChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm a Sample Chatbot. What's your name?");
        String name = scanner.nextLine();

        System.out.println("Nice to meet you, " + name + "! How can I assist you today?");
        System.out.println("You can type 'bye' to exit the chat.");

        String userInput;
        do {
            System.out.print("You: ");
            userInput = scanner.nextLine();
            System.out.println("Chatbot: " + userInput);
        } while (!userInput.equalsIgnoreCase("bye"));

        System.out.println("Chatbot: Goodbye, " + name + "! Have a great day.");
        scanner.close();
    }
}