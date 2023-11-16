package 문법정리;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class all {

    public static void main(String[] args) {

        /**
         * 문자열
         * 문자열을 작성시, 가급적이면 literal 표기방식을 따르면 좋다. 가독성이 좋고, 컴파일 최적화에 도움을 준다.
         */

        //literal 표기법 -> new를 사용하지 않아, 객체를 새롭게 생성하지 않는다.
        String a = "Happy Day";
        String b = "hello";
        String c = "123";

        // new 키워드를 사용 -> 항상 새로운 String 객체를 생성한다.
        String a2 = new String("Happy Day");

        /**
         * 원시자료형 primitive type
         * 1. int
         * 2. long
         * 3. double
         * 4. float
         * 5. boolean.
         * 6. char
         * C언어에서는 boolean은 언시타입으로 배우지는 않았었다. header file을 추가해서 사용하는 것으로.. java는 원시! ->차이점이 존재.
         * **주의** -> String은 literal type을 지원하지만, 원시자료형은 아니다.
         * Wrapper class를 원시자료형도 지원하는데, 만약 멀티스레드 환경에서 동기화를 지원하려면 원시 자료형 대신 Wrapper 클래스를 사용해야한다.
         */

        boolean result = true;
        char char1 = 'A';
        int i = 100000;


        /**
         * 문자열 method -> ==은 2개의 자료형이 같은 객체인지를 판별할때 사용하는 연산자이다.
         * 1. equals -> 값 자체를 비교하려면 equals를 사용
         * 2. indexOf -> index를 반환하는 것으로 특정 문자열이 시작되는 index를 return
         */

        // equals -> value 비교/

        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);

        String s3 = new String("hello");

        System.out.println(s3 == s2);
        System.out.println(s3.equals(s2));

        // indexOf -> index(int)

        System.out.println(s1.indexOf("h"));
        System.out.println(s1.indexOf("l"));// 가장 처음값을 반환한다.

        // contains -> true or false

        System.out.println(s1.contains("C"));
        System.out.println(s1.contains("h"));


        //charAt(index) -> char 반환
        System.out.println(s1.charAt(1));

        // a.replaceAll("a","b")-> a문자열에서 a를 b로 반환
        System.out.println(s1.replaceAll("l","?"));
        System.out.println(s1.replaceFirst("l","?"));

        // substring
        System.out.println(s1.substring(0,3));

        //toUpperCase

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        //split
        String[] splitResult = s1.split("l"); // {"he", "l","l","o"}으로 배열로 반환된다.
        System.out.println(splitResult[0]);

        //foramtting

        System.out.println(String.format("I eat %d apples.", 3));
        System.out.println(String.format("I eat %s apples.", "2"));

        // 정렬과 공백

        System.out.println(String.format("%10s", "hi")); // 우측정렬
        System.out.println(String.format("%-10ssujin", "hi")); // -븥이면 좌측정렬되어 10칸 중 2칸 차지


        // 소수점
        System.out.println(String.format("%.4f", 3.141592)); // 반올림되어 4번째자리까지 출력

        // 문자열 합치기

        String str1 = "";
        str1 += "hello";
        str1 += "~~ bye";
        System.out.println(str1);

        /**
         * 배열
         * 초기값을 넣어줄 경우 -> String[] strList = {"123","hello");
         * 초기값을 넣어주지 않을 경우 ->new keyword를 사용! -> len을 정해주지 않으면, "오류"가 발생 -> String[] strList = new String[6];
         */
        int[] intList = {1,2,3,4,5};
        String[] strList = {"010","010"};

        // index로 접근 ex. read
        System.out.println(Integer.parseInt(strList[0],10));
        System.out.println(Integer.parseInt(strList[1],2)); // 2진수를 10진수로 parsing

        // index로 접근 ex. write

        strList[0] = "hello";


        /**
         *
         * 리스트 -> 배열과 비슷하지만 편리한 기능이 더 많음.
         * 리스트는 크기가 정해져있지 않아서 처음부터 크기를 지정할 필요가 없다.
         */


        ArrayList pitces = new ArrayList();
        pitces.add("123");
        pitces.add("456");
        pitces.add(0,"010"); // 기존의 값을 밀어냄!
        System.out.println(pitces);

        // index의 값을 get 해오기
        System.out.println(pitces.get(0));

        //size
        System.out.println(pitces.size());

        // contains

        System.out.println(pitces.contains("123"));

        // remove

        System.out.println(pitces.remove("123")); // true
        System.out.println(pitces.remove(1)); // 삭제한 값을 return

        // Comparator -> java 8이상부터 사용이 가능해졌다.

        pitces.sort(Comparator.naturalOrder());// 오름차순으로 pitces를 정렬해줌
        pitces.sort(Comparator.reverseOrder());


        /**
         * hashmap -> put, get을 사용한다.!
         */
        HashMap<String, String> map = new HashMap<>();

        map.put("people", "사람");
        map.put("baseball","야구");

        System.out.println(map.get("people"));
        System.out.println(map.get("asdf")); // null이 나온다.

        // getorDefault -> get했을 때 없다면 ? default를 출력하도록 해줄 수 있다.
        System.out.println(map.getOrDefault("person","sujin"));

        // size
        System.out.println(map.size());

        //keySet -> key만을 모아서 return -> ArrayList로 변환가능. ArrayList<String> keyList = new ArrayList<>(map.keySet());

        System.out.println(map.keySet());

        /**
         * HashSet -> 순서가 존재하지 않아서 index를 사용해 read,write가 불가능.
         * add , remove
         * s1과 s2의 교집합 구하기 => retainAll ( intersection에 s1을 복사하고 이를 사용 : intersection.retainAll(s2)) -> s1과 s2 사이의 교집합이 intersection에 저장된다.
         * s1과 s2의 교집합 구하기  => addAll ( intersection에 s1을 복사하고 이를 사용 : intersection.unionAll(s2)) -> intersection에 s1과 s2의 합집합이 저장
         */

        // retainAll
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(2,3,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합 -> " + intersection );

        // addAll
        HashSet<Integer> set3 = new HashSet<>(Arrays.asList(4,5,6));
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set3);
        System.out.println("합집합 -> " + unionSet);

        //removeAll
        HashSet<Integer> diffSet = new HashSet<>(set1);
        diffSet.removeAll(set2);
        System.out.println("차집합 -> " + diffSet);



    }
}
