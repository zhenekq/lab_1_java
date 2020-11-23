package zhenya.vozny.bsu.inc;

public abstract class Food implements Consumable {
    String name = null;

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object arg0) {
        if(!(arg0 instanceof Food )) return false;
        if(name == null || ((Food)arg0).name == null) return false;
        return name.equals(((Food)arg0).name);
    }

    public void setName(String name){
        this.name = name;
    }

    public Food(String name){
        this.name = name;
    }

    @Override
    public void consume() {
    ///
    }
}
