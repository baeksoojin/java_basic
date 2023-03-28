package jumptojava.chapter8;

public class Question2 {
    //게시판 페이징하기
    public int totalPage;

    public int getTotalPage(int m, int n) {
        if(m%n==0) {
            totalPage = m / n;
        }else {
            totalPage = m / n + 1;
        }
        return totalPage;
    }


}
