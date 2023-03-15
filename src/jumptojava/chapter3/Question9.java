package jumptojava.chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Question9 extends ArrayListQuestion{

    public void notDuplicate(){
        HashSet<Integer> hashSet = new HashSet<>(myList);
        this.myList = new ArrayList<>(hashSet);
    }

}
