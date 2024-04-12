/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10439941_ice_task_3;

/**
 *
 * @author shane
 */

//Code Attribution
// This method was taken from ChatGPT
// https://chat.openai.com/
// OpenAI

import java.util.Scanner;
public class Question_1 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string to check for balanced parenthesis:");
        String input = keyboard.nextLine();                                     // user input
        keyboard.close();
        
        boolean result = isValid(input);                                        // if statement outputs statement depending on parenthesis
        if (result = true){
            System.out.println(input + " is balanced");
        }
        else{
            System.out.println(input + " is unbalanced");
        }
            
        
    }
    
    
    public static boolean isValid(String input)                                 // function checks if the parenthesis match of not
    {
        StringBuilder str = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                str.append(c);
            } else if (c == ')' || c == '}' || c == ']') {
                int lastIndex = str.length() - 1;
                if (lastIndex < 0) {
                    return false;                                               
                }
                char lastChar = str.charAt(lastIndex);
                if ((c == ')' && lastChar == '(') || (c == '}' && lastChar == '{') || (c == ']' && lastChar == '[')) {
                    str.deleteCharAt(lastIndex);                                 
                } else {
                    return false;                                               // returns false if the parenthesis do not match
                }
            }
        }
        
        return str.length() < 0;                                                // If sb is empty, all parentheses are balanced
    }
}


