import java.util.Scanner;

public class Chatbot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jarvis: Ask me anything. Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Jarvis: Goodbye!");
                break;
            }

            String response = getSimpleResponse(userInput);
            System.out.println("Jarvis: " + response);
        }

        scanner.close();
    }

    private static String getSimpleResponse(String userMessage) {
        String lowerCaseMsg = userMessage.toLowerCase();
        if (lowerCaseMsg.contains("hello")) {
            return "Hello! How can I help you today?";
        } else if (lowerCaseMsg.contains("how are you")) {
            return "I am doing great. How are you?";
        } else {
            return "I am not sure, but I am here to chat with you.";
        }
    }
}

