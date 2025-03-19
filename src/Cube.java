public class Cube {
    private int side;

    public Cube(){
        side = 1;
    }
    public Cube(int side){
        if (side<1){
            System.out.println("A cube’s side length cannot be less than 1!");
            throw new IllegalArgumentException();
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        if (side < 1) {
            System.out.println("A cube’s side length cannot be less than 1!");
            throw new IllegalArgumentException();
        }
        this.side = side;
    }
    public int calculateSurfaceArea(){
        return  6*(side * side);
    }
    public int calculateVolume(){
        return side*side*side;
    }
    public String toString(){
        return ("Cube{side=" + side);
    }
}

