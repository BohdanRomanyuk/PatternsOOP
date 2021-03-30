package PatternsOOP;/*
  @author   Romanyuk Bohdan
  @project   Module2
  @class  Quadrat
  @version  1.0.0 
  @since 28.03.2021 - 19.34
*/

public class Quadrat extends Rectangle {
    // Constructor

    public Quadrat(int id, int length) {
        super(id, length, length);
    }


    // toString() method

    @Override
    public String toString() {
        return "Quadrat{}";
    }
}
