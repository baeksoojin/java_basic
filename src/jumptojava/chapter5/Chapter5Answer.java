package jumptojava.chapter5;

import jumptojava.chapter5.Mineral.Bronze;
import jumptojava.chapter5.Mineral.Gold;
import jumptojava.chapter5.Mineral.MineralCalculator;
import jumptojava.chapter5.Mineral.Silver;
import jumptojava.utils.PrintDivLine;

import java.util.ArrayList;
import java.util.Arrays;

public class Chapter5Answer {

    public void answer(){

        //Question1 : UpgradeCalculator
        UpgradeCalculator cal1 = new UpgradeCalculator();
        cal1.add(10);
        cal1.minus(10);
        System.out.println(cal1.getValue());  // 10에서 7을 뺀 3을 출력
        PrintDivLine.divQuestion();

        //Question2 : MaxLimitCalculator
        MaxLimitCalculator cal2 = new MaxLimitCalculator();
        System.out.println(cal2.getValue());
        PrintDivLine.divQuestion();

        //Question3 : 홀수짝수 판별하기
        Calculator cal3 = new Calculator();
        System.out.println(cal3.isOdd(3)); //true
        System.out.println(cal3.isOdd(4)); //false
        PrintDivLine.divQuestion();

        //Question4 : 평균값을 구하는 메서드 -> 메서드 오버라딩을 사용
        int[] data = {1, 3, 5, 7, 9};
        Calculator cal4_1 = new Calculator();
        int result = cal4_1.avg(data);
        System.out.println(result);  // 5 출력

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator cal4_2 = new Calculator();
        int result2 = cal4_2.avg(data2);
        System.out.println(result2);  // 5 출력
        PrintDivLine.divQuestion();

        //Question5 : 출력결과를 예측하고 그 이유에 대해서 설명
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());// 4가 출력되어야함.
        //4가 출력된다. 왜냐하면 b와 a는 모두 동일한 리스트 객체를 가리키고 있기 때문이다.
        PrintDivLine.divQuestion();

        //Question6 : 생성자를 통해서 초기화작업을 하고 메서드를 실행함으로써 NullPointException을 없앤다.
        Question6 question6 = new Question6(0);
        question6.add(3);
        System.out.println(question6.getValue());//3
        PrintDivLine.divQuestion();

        //Question7 : 기존의 코드를 인터페이스를 사용하는 것으로 변경
        MineralCalculator mineralCalculator = new MineralCalculator();
        mineralCalculator.add(new Gold());
        mineralCalculator.add(new Silver());
        mineralCalculator.add(new Bronze());
        System.out.println("question7 result"+mineralCalculator.getValue());

    }


}
