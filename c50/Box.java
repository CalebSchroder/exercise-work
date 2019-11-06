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

  public Box( Box oldBox ) {
    this.width = oldBox.width;
    this.length = oldBox.length;
    this.height = oldBox.height;
  }
 


  //Getters + Setters

  public double getLength() {
    return this.length;
  }
  
  public double getHeight() {
    return this.height;
  }
  
  public double getWidth() {
    return this.width;
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

  public Box biggerBox( Box oldBox ) {

  return new Box( 1.25*oldBox.getWidth(), 1.25*oldBox.getLength(), 1.25*oldBox.getHeight() );
  
  }
  public Box smallerBox( Box oldBox ) {

  return new Box( 0.75*oldBox.getWidth(), 0.75*oldBox.getLength(), 0.75*oldBox.getHeight() );
  
  }
  public boolean nests( Box outsideBox ) {
    if (outsideBox.width >= width && outsideBox.length >= length && outsideBox.height >= height) {
      return true;
    } else {
      return false;
    }
  }

}