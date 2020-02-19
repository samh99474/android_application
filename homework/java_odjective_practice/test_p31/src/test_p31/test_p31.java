package test_p31;

public class test_p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car.showSum();//不須建立物件即可呼叫類別方法
		
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car car2;
		car2 = new Car();
		car2.setCar(4567, 30.5);
	}

}
class Car
{
public static int sum = 0;//類別變數(static為關鍵字)

	private int num;  //外部無法直接存取　
	private double gas;
	
	public Car()  //（建構子）
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車為"+num+"汽油量為"+gas+"的車子");
	}
	
	public static void showSum()//類別方法
	{
		System.out.println("車子共有"+ sum + "台");
	}
	
	public void show()
	{
		System.out.println("車號是:"+ this.num);
		System.out.println("汽車油量:"+ this.gas);
	}
}