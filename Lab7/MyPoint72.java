package Lab7;
public class MyPoint72 {
    private double x = 0.0;
    private double y = 0.0;
    static double xToY = 0.0;

    public MyPoint72(){
    }

    public MyPoint72(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    static double distance(MyPoint72 p1, MyPoint72 p2){
        return Math.sqrt(Math.pow((p1.x-p2.x),2) + Math.pow((p1.y-p2.y),2));
    }
    public double distance(MyPoint72 p){
        return Math.sqrt(Math.pow((this.x-p.x),2) + Math.pow((this.y-p.y),2));
    }
}
