package test_p45;
public class test_p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("宣告car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		System.out.println("宣告car2");
		Car car2;
		car2 = new Car();
		
		System.out.println("將Car1指定(的參考)給car2");
		car2 = car1;//car1、car2 參考同一物件
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setCar(2345, 30.5);
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
		
	}

}
class Car
{
	private int num;  
	private double gas;
	
	public Car()  //建構子
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車為"+num+"汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是:"+ this.num);
		System.out.println("汽車油量:"+ this.gas);
	}
}