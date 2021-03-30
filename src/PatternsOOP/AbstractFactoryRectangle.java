package PatternsOOP;/*
  @author   Romanyuk Bohdan
  @project   Module2
  @class  AbstractFactoryRectangle
  @version  1.0.0 
  @since 28.03.2021 - 19.31
*/

import org.w3c.dom.css.Rect;

public class AbstractFactoryRectangle {

    public static Rectangle create(int a, int b){

        // if - else condition, checking for Quadrat

        if (a == b) {
            return new Quadrat(0, a);
        } else {
            return new Rectangle(a, b);
        }

    }
}
