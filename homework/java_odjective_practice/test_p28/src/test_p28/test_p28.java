package test_p28;


public class test_p28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		// 建立新物件就會呼叫建構子
		car1 = new Car();
		
		car1.show();
		
		Car car2;
		car2 = new Car(1234,25.0);
		
		car2.show();
	}

}
class Car
{
	//Car 類別
	private int num;  //外部無法直接存取　
	private double gas;
	
	//運算子多載
	public Car()  //被呼叫的建構式（建構子（與類別（class）一樣名稱）
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car(int n, double g)  //被呼叫的建構式（建構子）
	{
		this(); ////呼叫沒有帶參數的建構式（this一定要在第一行）
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