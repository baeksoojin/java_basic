package baekjoon.집합과맵;

import java.util.*;
import java.util.stream.Collectors;

public class BOJ7785 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, String> hashMap = new HashMap<>();

        for (int i=0; i<n; i++){
            String name = sc.next();
            String type = sc.next();

            if (hashMap.containsKey(name) && type.equals("leave")){
                hashMap.remove(name);
            } else if ((hashMap.containsKey(name) == false) && (type.equals("enter")) ){
                hashMap.put(name, type);
            }

        }

        List<String> keys = hashMap.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (String key : keys){
            System.out.println(key);
        }
    }
}
