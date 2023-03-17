package jumptojava.chapter5;

public class Question6 {

    public Integer value;

    public Question6(int value) {
        this.value = value;
    }

    public void add(int val){
        this.value += val;
    }
    public Integer getValue(){
        return this.value;
    }


}
