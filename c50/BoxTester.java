public class BoxTester
{

  public static void main ( String[] args )
  {

     // create a box with sides= 2.5, 3.0, and 5.0

     Box box1 = new  Box( 2.5, 3.0, 5.0 );

     System.out.println( "Box1 Area: "    + box1.area() + "  Volume: " + box1.volume()  );
     System.out.println("Area of side: " + box1.yeetArea());

     // create a box with all sides = 3.0

     Box box2 = new Box (3.0);

     System.out.println( "Box2 Area: "    + box2.area() + "  Volume: " + box2.volume()  );
     


  }
}