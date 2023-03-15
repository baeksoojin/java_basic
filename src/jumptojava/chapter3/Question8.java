package jumptojava.chapter3;

import java.util.HashMap;

public class Question8 {

    public HashMap<String, Integer> grade;

    public void setGrade(HashMap<String, Integer> myHashMap){
        this.grade = myHashMap;
    }

    public HashMap<String, Integer> getGrade(){
        return grade;
    }

    public Integer getScore(String target){
        return grade.remove(target);
    }

}
