package jumptojava.chapter5.Mineral;

public class MineralCalculator {
    public int value=0;

    public void add(Mineral mineral){
        this.value += mineral.getValue();
    }

    public int getValue(){
        return this.value;
    }
}
