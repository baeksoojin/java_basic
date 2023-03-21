package jumptojava.chapter7;

import jumptojava.chapter7.fucntionalprogramming.Question2;
import jumptojava.chapter7.fucntionalprogramming.Question3;
import jumptojava.chapter7.thread.Question1;
import jumptojava.utils.PrintDivLine;

import java.util.Arrays;

public class Chapter7Answer {

    public static void answer(){

        //question1
        Question1 question1 = new Question1();
        System.out.printf("elapsed time:%s ms\n", question1.nonThread());
        try {
            System.out.printf("elapsed time:%s ms\n", question1.thread());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        PrintDivLine.divQuestion();

        //question2 -> stream사용
        System.out.println(Arrays.toString(Question2.answer()));
        PrintDivLine.divQuestion();

        //question3 -> stream사용
        System.out.println(Arrays.toString(Question3.answer()));


    }

}
