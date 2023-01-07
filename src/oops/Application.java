package oops;

public class Application {
    public static void main(String[] args) {
        //Syntax of objects
        //ClassName objectName = new ClassName();

        Marker marker = new Marker();

        //Access members of an object

        //objectName.memberName -- data members
        marker.brand = "Camline";
        marker.type = "WhiteBoardMarker";
        marker.color = "Blue";
        marker.price = 145.23;

        //objectName.memberMethod()
        marker.refill();
        marker.write("I am learning OOPs in Java");
        marker.print();
        System.out.println();


        Car car = new Car();

        car.color = "Black";
        car.model = "BMW Z4";
        car.brand_name = "BMW";
        car.lights = 4;
        car.seats = 2;
        car.fuel_type = "Petrol";

        car.startEngine();
        car.stopEngine();
        car.move();
        car.print();

        System.out.println();

        College college = new College();

        college.clgName = "K.D.K. College of Engineering, Nagpur";
        college.address = "Great Nag Road, Nandanvan, Nagpur";
        college.isAICTEApproved = false;
        college.autonomyStatus = "Non-Autonomous";
        college.ratings = 4;

        college.checkClgInfo();

        System.out.println();



    }
}
