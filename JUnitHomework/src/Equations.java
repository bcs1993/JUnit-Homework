public class Equations {

    public static double  hypotenuseOfTriangle(double a, double b, double c) {
       a =Math.sqrt((b * b) + (c + c));
       return a;
    }
    public static double areaOfTriangle(double h, double b) {
        double area = (b * h)/2;
        return area;
    }
    public static double circumferenceOfSphere(double r){
        double area = Math.PI * (r*r);
        double circumference = Math.PI * 2*r;
        return circumference;

    }

}
