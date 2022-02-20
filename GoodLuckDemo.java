import java.util.Scanner;
public class GoodLuckDemo{
	public static void main(String[] args){
		int random=(int) (Math.random()*10);
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入4位会员号码");
		int number= Integer.valueOf(sc.nextLine());
		System.out.println(random);
		System.out.println(number);
		if(number/100%10==random){
			System.out.println("恭喜中奖");
		}else{
			System.out.println("谢谢支持");
		}
	}
}