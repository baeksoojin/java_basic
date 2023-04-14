package jumptojava;

import jumptojava.chapter3.Chapter3Answer;
import jumptojava.chapter4.Chapter4Answer;
import jumptojava.chapter5.Chapter5Answer;
import jumptojava.chapter7.Chapter7Answer;
import jumptojava.chapter8.Chapter8Answer;
import jumptojava.utils.PrintDivLine;

public class JumToJava {

    public static void runJumToJava(){

        System.out.println("main application start");
        Chapter3Answer.answer();
        PrintDivLine.divChapter();

        Chapter4Answer.answer();
        PrintDivLine.divChapter();

        Chapter5Answer.answer();
        PrintDivLine.divChapter();

        //Chapter6Answer.answer();
        PrintDivLine.divChapter();

        Chapter7Answer.answer();
        PrintDivLine.divChapter();

        Chapter8Answer.answer();

    }
}
