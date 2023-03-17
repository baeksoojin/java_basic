import jumptojava.chapter3.*;
import jumptojava.chapter4.Chapter4Answer;
import jumptojava.chapter5.Chapter5Answer;
import jumptojava.utils.PrintDivLine;

public class Main {

    public static void main(String[] args) {
        System.out.println("main application start");

        Chapter3Answer chapter3Answer = new Chapter3Answer();
        chapter3Answer.answer();
        PrintDivLine.divChapter();

        Chapter4Answer chapter4Answer = new Chapter4Answer();
        chapter4Answer.answer();
        PrintDivLine.divChapter();

        Chapter5Answer chapter5Answer = new Chapter5Answer();
        chapter5Answer.answer();


    }


}