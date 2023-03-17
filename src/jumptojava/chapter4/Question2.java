package jumptojava.chapter4;

public class Question2 {

    //n줄에 맞춰서 별찍기문제
    public void star(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
