import java.util.Scanner;
public class Vip{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username=(String) (sc.nextLine());
		System.out.println("请输入密码:");
		int password=Integer.valueOf(sc.nextLine());
		if(username.equals("青") && password==123){
				System.out.println("欢迎您青");
		}else{
			System.out.println("对不起，您不是会员");
		}
	}
}
