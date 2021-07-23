package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {

        super(side, side);
    }

    public double getPerimeter(){
        return super.length * 4;
    }

    public double getArea(){
        return Math.pow(super.length, 2);
    }

    public void setLength(double side){
        super.width = side;
        super.length = side;
    }

    public void setWidth(double side){
        super.width = side;
        super.length = side;
    }




//    public static void main(String[] args) {
//
//    }
//    private int side;
//
//    public Square(int side){
//        this.length = side;
//        this.width = side;
//        this.side = side;
//    }
//
//    public int getSide(){
//        return side;
//    }
//
//    public void getSide(int side){
//        this.side = side;
//    }
//
//    @Override
//    public int getArea(){
//        return side * side;
//    }
//
//    public int getPerimeter(){
//        return side * 4;
//    }

}
