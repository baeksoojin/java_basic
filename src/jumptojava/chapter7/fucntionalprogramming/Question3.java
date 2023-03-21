package jumptojava.chapter7.fucntionalprogramming;

import java.util.Arrays;

public class Question3 {

    public static int[] answer(){
        int[] numbers ={1,-2,3,-5,8,-3};
        int[] results = Arrays.stream(numbers)
                .filter((a)-> a>=0)
                .toArray();
        return results;
    }
}
