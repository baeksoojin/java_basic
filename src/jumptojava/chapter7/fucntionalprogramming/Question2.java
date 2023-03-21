package jumptojava.chapter7.fucntionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class Question2 {

    public static int[] answer(){
        int[] members = {1,2,3,4,5};
        int[] results = Arrays.stream(members)
                .filter((a) -> a%2==0)
                .map((a) -> a*2)
                .toArray();
        return results;

    }

}
