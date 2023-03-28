package jumptojava.chapter8;

public class Question1 {

    public int question1(){

        int sum = 0;

        for(int i=1; i<1000; i++){
            if(i%3==0 || i%5==0 ){//3의배수
                 sum += i;
            }
        }

        return sum;
    }

}
