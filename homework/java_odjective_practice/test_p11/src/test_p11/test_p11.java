package test_p11;


public class test_p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;   
		car1 = new Car();//給car1變數建立物件
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}

}
class Car
{
	//Car 類別
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}