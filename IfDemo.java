import java.util.Scanner;
public class IfDemo{
	public static void main(String[] args){
		double r=3;
		double PI=3.14;
		double length=PI*r*2;
		double area=PI*r*r;
		if(length>=area){
		   System.out.println("周长大于等于面积");
		}
		else{
		   System.out.println("周长小于面积"+"面积为"+area);
		}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数据");
		String sr=sc.nextLine();
		System.out.println(sr);
	}
}