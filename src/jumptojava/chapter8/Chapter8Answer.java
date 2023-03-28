package jumptojava.chapter8;

import jumptojava.utils.PrintDivLine;

public class Chapter8Answer {

    public static void answer(){

        Question1 question1 = new Question1();
        int answer1 = question1.question1();
        System.out.println(answer1);
        PrintDivLine.divQuestion();

        Question2 question2 = new Question2();
        int answer2 = question2.getTotalPage(25,10);
        System.out.println(answer2);
        PrintDivLine.divQuestion();

        Question3 question3 = new Question3();
        int answer3 = question3.getDigitCount(33);
        System.out.println(answer3);
        PrintDivLine.divQuestion();

        Question4 question4 = new Question4();
        int answer4 =question4.getCharCount("asdf asd");
        System.out.println(answer4);
        PrintDivLine.divQuestion();



    }
}
