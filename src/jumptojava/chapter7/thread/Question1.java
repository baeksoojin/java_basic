package jumptojava.chapter7.thread;

import java.util.ArrayList;

public class Question1 {//thread를 사용해서 병렬처리

    public long nonThread(){

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {  // 총 5개의 쓰레드를 생성하여 실행한다.
            NonThread nt = new NonThread(i);
            nt.run();
        }

        long end = System.currentTimeMillis();

        return end-start;
    }

    //여러개는 병렬처리로 시간단축
    public long thread() throws InterruptedException {

        long start = System.currentTimeMillis();

        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=0; i<5; i++){
            Thread t = new Thread(new ThreadWork(i));
            t.start();
            threads.add(t);
        }

        for(int i=0; i< threads.size(); i++) {
            Thread t = threads.get(i);
            t.join();//thread가 종료되기를 대기
        }

        long end = System.currentTimeMillis();
        return end-start;
    }

}
