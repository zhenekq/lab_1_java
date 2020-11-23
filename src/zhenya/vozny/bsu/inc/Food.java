package zhenya.vozny.bsu.inc;

public abstract class Food implements Consumable {
    String name = null;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void consume() {
    ///
    }
}
