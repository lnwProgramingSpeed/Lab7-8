package Lab8;

public class Circle2D {
    /*private double x;
    private double y;*/
    private double radius;

    public Circle2D(){
        /*x = 0;
        y = 0;*/
        radius = 0;
    }

    public Circle2D(double newX, double newY, double newR) // constructor with x,y and radius parameters
    {
        /*x = newX;
        y = newY;*/
        radius = newR;
    }

    //IDK why need this but keep it for later
    /*public boolean contains(double x2, double y2) { // compute the distance from x,y to x2,y2 and see if its <= radius
        if (Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2)) <= radius)
            return true;
        else
            return false;
    }*/

     public double getArea(){
         return Math.PI*radius*radius;
     }

     public double getParametre(){
         return 2 * Math.PI * radius;
     }

}
