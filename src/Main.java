import jumptojava.chapter3.*;
import jumptojava.chapter4.Chapter4Answer;
import jumptojava.chapter5.Chapter5Answer;
import jumptojava.chapter6.Chapter6Answer;
import jumptojava.chapter6.tutorial.Console;
import jumptojava.chapter6.tutorial.Tutorial;
import jumptojava.chapter7.Chapter7Answer;
import jumptojava.utils.PrintDivLine;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
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


    }

    


}