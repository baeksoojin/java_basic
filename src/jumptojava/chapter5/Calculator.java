package jumptojava.chapter5;

import java.util.ArrayList;

public class Calculator {

    public int value;

    public void Calculator() {
        this.value = 0;
    }

    public void add(int val) {
        this.value += val;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isOdd(int num){
        return num%2==1;
    }

    public int avg(int[] data){
        int sum=0;
        for(int i=0; i<data.length; i++){
            sum+= data[i];
        }
        return sum/data.length;
    }

    public int avg(ArrayList<Integer> data){
        int sum=0;
        for(int i=0; i<data.size(); i++){
            sum += data.get(i);
        }
        return sum/data.size();
    }

}
