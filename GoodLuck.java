import java.util.Scanner;
public class GoodLuck{
	public static void main(String[] args){
		int random=(int)(Math.random()*10);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入会员号<4位整数>");
		int number =Integer.parseInt(sc.nextLine());
			System.out.println(number);
			if(number/100%10==random){
				System.out.println("恭喜中奖");
			}else{
			    System.out.println("谢谢支持");
			}
		
		
	}
	}
