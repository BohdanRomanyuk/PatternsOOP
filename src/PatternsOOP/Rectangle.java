package PatternsOOP;/*
  @author   Romanyuk Bohdan
  @project   Module2
  @class  Rectangle
  @version  1.0.0 
  @since 28.03.2021 - 19.32
*/

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Objects;

public class Rectangle implements IGeometry {    // Parameters

    private int id;
    private int length;
    private int width;

    // Constructor FULL

    public Rectangle(int id, int length, int width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }

    // Constructor FULL without ID

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Constructor EMPTY

    public Rectangle() {
    }

    // Getters Setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    // Method which determines a Quadrate

    public boolean isQuadrate() {
        return ((this.length == this.width) ? true : false);
    }


    // ---------- IGeometry methods ---------

    // Method of calculating the Area2

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    // Method of calculating the Linear Length

    public double getLinearLength() {
        return 2 * (this.getLength() + this.getWidth());
    }


    // ---------- IPackaging methods ---------

    // Method toString()

    @Override
    public String toString() {
        return "Rectangle{" +
                "id=" + this.getId() +
                ", length=" + this.getLength() +
                ", width=" + this.getWidth() +
                ", area=" + this.getArea() +
                ", isQuadrate=" + this.isQuadrate() +
                '}';
    }

    // Method toJSON()

    public String toJSON() {
        String json = "Rectangle{"
                + "\"" + "id\":" + this.getId()
                + ", \"" + "length\":" + this.getLength()
                + ", \"" + "width\":" + this.getWidth()
                + ", \"" + "area\":" + this.getArea()
                + ", \"" + "isQuadrate\":" + this.isQuadrate()
                + "}";
        return json;

    }

    // Method toXML()

    public String toXML() {
        String xml = "<Rectangle>"
                + "<id>" + this.getId() + "</id>"
                + "<length>" + this.getLength() + "</length>"
                + "<width>" + this.getWidth() + "</width>"
                + "<area>" + this.getArea() + "</area>"
                + "<isQuadrate>" + this.isQuadrate() + "</isQuadrate>"
                + "</Rectangle>";
        return xml;
    }

    // Method toConsole()

    public String toConsole() {
        String consoleString = "Rectangle: " +
                "\nid = " + this.getId() +
                "\nlength = " + this.getLength() +
                "\nwidth = " + this.getWidth() +
                "\narea = " + this.getArea() +
                "\nisQuadrate = " + this.isQuadrate();
        return consoleString;
    }



    // Methods equals() and hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getId() == rectangle.getId() &&
                getLength() == rectangle.getLength() &&
                getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLength(), getWidth());
    }
}
