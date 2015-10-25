public class Box {
    public int x, y;
    public static final int BOX_SIZE = 20;
    public Box(int x, int y){

        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "[x=" + x + ", y=" + y +"]";
    }

    public boolean equals(Object obj){
        if(obj instanceof Box){
            Box b = (Box)obj;
            return (this.x == b.x && this.y == b.y);
        }
        return false;
    }
}
