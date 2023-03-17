package jumptojava.chapter3;

import jumptojava.chapter3.*;

import java.util.ArrayList;
import java.util.HashMap;

import static jumptojava.chapter3.Question10.getCoffeePrice;
import static jumptojava.chapter3.Question10.setCoffeePrice;

public class Chapter3Answer{

    public void Answer(){
        //Q1
        Question1 question1 = new Question1();
        System.out.println(question1.getAvg(80,75,55));

        //Q2
        Question2 question2 = new Question2();
        question2.setNum(13);
        System.out.println(question2.isOdd());

        //Q3
        Question3 question3 = new Question3();
        question3.setPkNum("881120-1068234");
        question3.splitPkNum();
        String[] pkNums = question3.getPkNums();
        System.out.println(pkNums[0] + " " + pkNums[1]);

        //Q4
        Question4 question4 = new Question4();
        question4.setPkNum("881120-1068234");
        System.out.println(question4.getSexNum());

        //Q5
        Question5 question5 = new Question5();
        question5.setStr("a:b:c:d");
        question5.replaceStr();
        System.out.println(question5.getStr());

        //Q6
        Question6 question6 = new Question6();
        ArrayList<Integer> myList = question6.getMyList();
        myList.add(1);
        myList.add(3);
        myList.add(2);

        question6.setMyList(myList);
        question6.sortReverse();
        System.out.println(question6.getMyList());

        //Q7
        Question7 question7 = new Question7();
        ArrayList<String> myList2 = question7.getMyList();
        myList2.add("a");
        myList2.add("b");
        myList2.add("c");

        question7.setMyList(myList2);
        question7.listToString();
        System.out.println(question7.getMyString());

        //Q8
        Question8 question8 = new Question8();
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        question8.setGrade(grade);
        question8.getScore("B");
        System.out.println(question8.getGrade());

        //Q9
        Question9 question9 = new Question9();
        ArrayList<Integer> myList3 = question9.getMyList();
        myList3.add(1);
        myList3.add(1);
        myList3.add(1);
        myList3.add(2);
        myList3.add(3);
        myList3.add(3);

        question9.setMyList(myList3);
        question9.notDuplicate();
        System.out.println(question9.getMyList());

        //Q10
        setCoffeePrice(Question10.CoffeeType.AMERICANO);
        System.out.println(String.format("가격은 %d원 입니다.", getCoffeePrice()));

    }
}
