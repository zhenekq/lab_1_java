package zhenya.vozny.bsu.inc;

public class Apple extends Food{

    private String size;

    public String getSize(){
        return size;
    }

    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;

    }

    public void setSize(String size){
        this.size = size;
    }

    public Apple(String name) {
        super("Apple");
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " size '" + size.toUpperCase() + "'";
    }

    @Override
    public void consume() {
        System.out.println(this + " eaten");
    }
}
