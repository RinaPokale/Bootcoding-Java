package oops;

//create a class box with 3 data members len, breadth and height and having a 3 methods a create a box
//  with 0 para and create members with 3 para and 3rd method is print box
//createBox()
//createBox(l, b, h)
//printBox()

public class Box {
    double length;
    double height;
    double breadth;

    public static Box createBox(){
       Box box = new Box();
       box.length = 10.25;
       box.breadth = 12.2;
       box.height = 11.54;
       return box;
    }

    public static Box createBox(double l, double b, double h){
       Box box = new Box();
       box.length = l;
       box.breadth = b;
       box.height = h;
       return box;
    }

    public static void printBox(Box box){
        System.out.println("Box length = " +box.length);
        System.out.println("Box breadth = " +box.breadth);
        System.out.println("Box height = " +box.height);
    }
}
