package jumptojava.chapter4;

import jumptojava.utils.PrintDivLine;

public class Chapter4Answer {

    public void answer(){

        //Question1
        int answer1 = Question1.sumOf3x();
        System.out.println(answer1);
        PrintDivLine.divQuestion();

        //Question2
        Question2 question2 = new Question2();
        question2.star(5);
        PrintDivLine.divQuestion();

        //Question3
        Question3.print1To100();
        PrintDivLine.divQuestion();

        //Question4
        Question4 question4 = new Question4();
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        question4.setScores(marks);
        double answer4 = question4.getAvg();
        System.out.println(answer4);
        PrintDivLine.divQuestion();

    }



}
