package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LoveLetterMystery {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> nameList=new ArrayList<String>();
		String line;
		int count;
		String countStr = br.readLine();
		count=Integer.parseInt(countStr);
		System.out.println("count"+Integer.parseInt(countStr));
		 while((line=br.readLine())!=null)
		{
			 nameList.add(line);
		} 
		 for(int i=0;i<count;i++)
		 {
			 int sum=0;
			String name=nameList.get(i);
			int len=name.length();
			for(int j=0;j<len/2;j++)
			{
				System.out.println("sum"+""+j+":"+sum);
				sum+=Math.abs(name.charAt(j)-name.charAt(len-1-j));
				
			}
			System.out.println(sum);
			
		 }
	}

}
