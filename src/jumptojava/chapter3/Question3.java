package jumptojava.chapter3;

public class Question3 extends PkNum{

    public String[] pkNums = new String[2];

    public void splitPkNum(){
        String firstPkNum = pkNum.substring(0,6);
        String lastPkNum = pkNum.substring(7);
        pkNums[0] = firstPkNum;
        pkNums[1] = lastPkNum;
    }

    public String[] getPkNums(){
        return pkNums;
    }


}
