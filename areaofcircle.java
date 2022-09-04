import java.util.Scanner;
public class areaofcircle{
       public static void main(String args[]){
	double area,r,pie = 3.14;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius :");
	r = sc.nextDouble();
	area = (r*r*pie);
	System.out.println("area of circle : "+area);
	}
}	