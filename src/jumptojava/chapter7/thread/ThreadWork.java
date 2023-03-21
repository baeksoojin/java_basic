package jumptojava.chapter7.thread;

public class ThreadWork implements Runnable{
    int threadId;
    public long time;

    public ThreadWork(int threadID){
        this.threadId = threadID;
    }

    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
