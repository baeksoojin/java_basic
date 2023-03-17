package jumptojava.chapter4;

public class Question1 {

    //while문을 사용해서 1부터 1000까지의 자연수중 3의 배수의 합을 구하기
    public static int sumOf3x(){
        int i=3;
        int sum=0;
        while(i<1001){
            sum+=i;
            i+=3;
        }
        return sum;
    }
}
