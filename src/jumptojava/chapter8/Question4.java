package jumptojava.chapter8;

import java.util.ArrayList;

public class Question4 {

    public int getCharCount(String s){
        int result=0;

        String[] stringTemp = s.split(" ");
        for(int i=0; i< stringTemp.length; i++){
            result+=stringTemp[i].length();
        }
        return result;
    }
}
