package test_p37;

import java.io.*;
public class test_p37 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("請輸入英文字母");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String strl = str.toLowerCase();
		
		System.out.println("轉換成大寫為"+ stru);
		System.out.println("轉換成小寫為"+ strl);
	}

}
