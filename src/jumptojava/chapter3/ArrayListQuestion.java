package jumptojava.chapter3;

import java.util.ArrayList;

public class ArrayListQuestion<T> {

    public ArrayList<T> myList = new ArrayList<>();

    public void setMyList(ArrayList<T> myList){
        this.myList = myList;
    }

    public ArrayList<T> getMyList(){
        return myList;
    }

}
