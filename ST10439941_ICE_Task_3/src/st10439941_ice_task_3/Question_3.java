/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class Question_3 
{
    public static int greatest_common_divisor(int a, int b) 
    { 
        if (b == 0) {                                                           
            return a; 
        } 
        else {
            return greatest_common_divisor(b, a % b);                           // finding the mod of b
        }
    }

    public static void main(String[] args) 
    {
        int a = 5;                                                              // input a
        int b = 10;                                                             // input b
        int result = greatest_common_divisor(a, b);
        System.out.println("The greatest common divisor of " + a + " and " + b + " is: " + result);
    }
}
