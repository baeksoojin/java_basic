package jumptojava.chapter7.thread;

public class NonThread {

        int threadId;
        public long time;

        public NonThread(int threadID){
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
