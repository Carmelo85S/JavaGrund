package week3.OwnException;

import java.util.Scanner;

public class StringValidationUsername {
    public static void validateUserame(Scanner scanner, String prompt){
        while(true){
            System.out.println(prompt);
                String userInput = scanner.nextLine().trim();
                if(userInput.isEmpty()){
                    throw new InvalidUserException("Input is empty");
                }
                else if(!userInput.equals("carmelo")){
                    throw new InvalidUserException("Wrong username");
                }
            System.out.println("Welcome back "+ userInput);
                return;
        }
    }
}
