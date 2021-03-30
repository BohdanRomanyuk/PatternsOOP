package PatternsOOP;/*
  @author   Romanyuk Bohdan
  @project   Module2
  @class  RectangleFactory
  @version  1.0.0 
  @since 28.03.2021 - 19.32
*/

public class RectangleFactory {
    public static Rectangle create (int id, int length, int width) {

        // Creating Rectangle object with three parameters (id, length, width)

        Rectangle rectangle = new Rectangle(id, length, width);

        return rectangle;
    }
}
