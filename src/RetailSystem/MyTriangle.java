//Main Class

package src.RetailSystem;


import javax.swing.*;
import java.awt.*;



public class MyTriangle {
    MyTriangle array_of_point [] = new MyTriangle[4];
    MyCircle array_of_point2 [] = new MyCircle[3];
    MyPoint points[] = new MyPoint[6];

    public void example(){

        points[0]=new MyPoint(1,0);
        points[1]=new MyPoint(7,0);
        points[2]=new MyPoint(4,5);
        points[3]=new MyPoint(3,2);
        points[4]=new MyPoint(11,2);
        points[5]=new MyPoint(7,0);
        array_of_point[0]=new MyTriangle(points[0],points[1],points[2]);
        array_of_point[1] = new  MyTriangle(points[3],points[4],points[5]);
        array_of_point[2] = new  MyTriangle(1,0,7,0,4,5);
        array_of_point[3] = new  MyTriangle(3,2,11,2,7,0);

        array_of_point2[0] =new MyCircle(2,1,5);
        array_of_point2[1] =new MyCircle(points[5],14);
        array_of_point2[2] =new MyCircle(points[4],7);

    }
    public  void  show_triangle(){

        JOptionPane.showMessageDialog(null,array_of_point[0].toString());
        JOptionPane.showMessageDialog(null,"The perimeter of triangle :"+array_of_point[0].getPerimeter());
        JOptionPane.showMessageDialog(null,"The type of triangle :"+array_of_point[0].getType());

        JOptionPane.showMessageDialog(null,array_of_point[3].toString());
        JOptionPane.showMessageDialog(null,"The perimeter of triangle :"+array_of_point[3].getPerimeter());
        JOptionPane.showMessageDialog(null,"The type of triangle :"+array_of_point[3].getType());

        JOptionPane.showMessageDialog(null,array_of_point2[0].toString());
        JOptionPane.showMessageDialog(null,"The Area of circle :"+array_of_point2[0].getArea());
        JOptionPane.showMessageDialog(null,"The circumference of circle :"+array_of_point2[0].getCircumference());
        JOptionPane.showMessageDialog(null,array_of_point2[1].toString());
        JOptionPane.showMessageDialog(null,"The Area of circle :"+array_of_point2[1].getArea());
        JOptionPane.showMessageDialog(null,"The circumference of circle :"+array_of_point2[1].getCircumference());
        JOptionPane.showMessageDialog(null,"The distance between two circle :"+array_of_point2[1].distance(array_of_point2[2]));


    }

    private  MyPoint v1;
    private  MyPoint v2;
    private  MyPoint v3;
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;
    public MyTriangle(){
    }

  public   MyTriangle(int x1,int y1, int x2, int y2, int x3,int y3 ){
this.x1 = x1;
this.x2 = x2;
this.x3 = x3;
this.y1 = y1;
this.y2 = y2;
this.y3 = y3;
    }
public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
    this.x1 = v1.getX();
    this.x2 = v2.getX();
    this.x3 = v3.getX();
    this.y1 = v1.getY();
    this.y2 = v2.getY();
    this.y3 = v3.getY();
    }

    public  String toString(){
        return  "My Triangle [v1("+x1+","+y1+"),v2("+x2+","+y2+"),v2("+x3+","+y3+") ]";
    }

    public double getPerimeter(){
       double side1=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
       double side2=Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
       double side3=Math.sqrt(((x3-x2)*(3-x2))+((y3-y2)*(y3-y2)));
       double perimeter = side1 + side2 + side3;
       return  perimeter;

    }
    public  String getType(){
        double side1=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        double side2=Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
        double side3=Math.sqrt(((x3-x2)*(3-x2))+((y3-y2)*(y3-y2)));
        if((side1==side2)&&(side2==side3)){
            return "Equilateral";
        }
        else if((side1==side2)||(side2==side3)){
            return "Isoscalence";
        }
        return "Scalence";

    }

}
//MyPoint Class




