package test_p47;
import java.io.*;

public class test_p47 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1號車";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
		
	}

}
class Car
{
	private int num;  
	private double gas;
	private String name;
	
	public Car()  //建構子
	{
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車為"+num+"汽油量為"+gas+"的車子");
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名改為"+name);
	}
	
	public void show()
	{
		System.out.println("車號是:"+ this.num);
		System.out.println("汽車油量:"+ this.gas);
		System.out.println("車名為"+name);
	}
}