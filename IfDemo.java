import java.util.Scanner;
public class IfDemo{
	public static void main(String[] args){
		double r=3;
		double PI=3.14;
		double length=PI*r*2;
		double area=PI*r*r;
		if(length>=area){
		   System.out.println("�ܳ����ڵ������");
		}
		else{
		   System.out.println("�ܳ�С�����"+"���Ϊ"+area);
		}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		String sr=sc.nextLine();
		System.out.println(sr);
	}
}