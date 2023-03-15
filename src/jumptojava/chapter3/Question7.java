package jumptojava.chapter3;

public class Question7 extends ArrayListQuestion{

   public String myString;

   public void listToString(){
      myString = String.join(" ",myList);
   }

   public String getMyString() {
      return myString;
   }
}
