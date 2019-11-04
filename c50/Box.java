public class Box
{
  // Instance Variables
  private double length ;
  private double width  ;
  private double height ;


  // Constructors
  public Box ( double width, double height, double length )
  {
    this.width  = width ;
    this.height = height ;
    this.length = length ;
  }

  public Box ( double side )
  {
    width  = side ;
    height = side ;
    length = side ;
  }

  // Methods
  public double volume()
  {
    return width * height * length ;
  }

  public double area()
  {
    return 2 * (  width * height + width * length + height * length  ) ;
  }

  public double yeetArea() {
    return 2 * faceArea() + 2 * topArea() + 2 * sideArea();

  }

  private double faceArea() {
    return height * length;
  }

  private double topArea() {
    return width * length;
  }

  private double sideArea() {
    return width * height;
  }

}