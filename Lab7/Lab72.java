package Lab7;
public class Lab72 {
    public static void main(String[] args) {
        MyPoint72 p1 = new MyPoint72(0.0,0.0);
        MyPoint72 p2 = new MyPoint72(10.0, 30.8);
        System.out.println(p1.distance(p2));
        System.out.println(MyPoint72.distance(p1,p2));
    }
}
