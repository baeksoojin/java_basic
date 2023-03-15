package jumptojava.chapter3;

public class Question5 {

    public String str;

    public void setStr(String str){
        this.str = str;
    }

    public String getStr(){
        return this.str;
    }

    public String replaceStr(){
        return str.replace(":","#");
    }


}
