import java.util.*;
public class ComputeAngleTriangle{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("ENTER THE THREE POINTS");
double x1 = input.nextDouble();
double  y1 = input.nextDouble();
double  x2 = input.nextDouble();
double  y2  = input.nextDouble();
double  x3 = input.nextDouble();
double  y3 = input.nextDouble();

double a = Math.sqrt((x2 - x3)* (x2 - x3) + (y2 - y3) * (y2 -y3));
double b = Math.sqrt((x2 - x3)* (x2 - x3) + (y2 - y3) * (y2 -y3));
double a = Math.sqrt((x2 - x3)* (x2 - x3) + (y2 - y3) * (y2 -y3));

}
}