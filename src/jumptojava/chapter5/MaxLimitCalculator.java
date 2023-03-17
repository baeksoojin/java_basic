package jumptojava.chapter5;

public class MaxLimitCalculator extends Calculator{

    public int getValue(){
        if(this.value>100){
            return 100;
        }
        else{
            return this.value;
        }
    }
}
