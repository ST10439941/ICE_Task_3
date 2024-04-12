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

import java.util.Iterator;
public class Question_2 implements Iterable<Integer>
{
    private int limit;

    public Question_2(int limit) {
        this.limit = limit;                                                     // allows for the set limit size                                    
    }

    
    public Iterator<Integer> iterator() {
        return new OddSquaresSumIterator(limit);
    }

    public static void main(String[] args) {
        int limit = 100;                                                        //limit is set to 100 lines
        Question_2 iterable = new Question_2(limit);
        for (int sum : iterable) {
            System.out.println(sum);
        }
        
    }
}

class OddSquaresSumIterator implements Iterator<Integer> {

    private int current = 1;                                                    // where the counter begins
    private int limit;

    public OddSquaresSumIterator(int limit) {
        this.limit = limit;
    }

    
    @Override
    public boolean hasNext() {
        return current <= limit;                                                // checks that the current is less than or equal to limit
    }

    
    @Override
    public Integer next() {
        int oddSquare = current * current;
        current += 2;                                                           // moves to the next odd number
        return oddSquare;
    }
}
