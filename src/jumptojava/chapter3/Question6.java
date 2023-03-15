package jumptojava.chapter3;
import java.util.Comparator;

public class Question6 extends ArrayListQuestion{

    public void sortReverse(){
        myList.sort(Comparator.reverseOrder());
    }
}
