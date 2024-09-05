import java.util.*;
public class FormatDemo {
   public static void main(String[] args) {
	   System.out.printf("%-10%-10%-10%-10%\n", "Degrees","Radian","Cosine","Tnagent");
	   
	   //DISPLAY VALUES FOR 30 DEGREE
	   int degrees = 30;
	   double radians = Math.toRadians(degrees);
	   System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));
	   
	   //DISPLAY VALUES FOR 60 DEGREE
	   degrees = 60;
	   radians = Math.toRadians(degrees);
	   System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));
	   
   }
};
