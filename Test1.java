import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username=sc.nextLine();
		char[] username1=username.toCharArray();
		Scanner sc1=new Scanner(System.in);
		System.out.println("请输入密码：");
		int password=Integer.parseInt(sc1.nextLine());
		if(Strcmp(username1,'青')==0){
			if(password==123){
				System.out.println("欢迎您青");
			}
			
		}
		else{
			System.out.println("对不起，您不是会员");
		}
	}
}