
public class Sample5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] test;
			test = new int[5];
			
			System.out.println("將值指定給test[10]");
			
			test[10] = 80;
			System.out.println("將80指定給test[10]");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列的值了");
		}
		//不管有無例外最後一定都會做finally區塊內處裡
		finally
		{
			System.out.println("最後一定會執行這個處裡");
		}
		
		System.out.println("順利地執行萬完畢");
	}

}
