import java.util.Scanner;
public class Vip{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���:");
		String username=(String) (sc.nextLine());
		System.out.println("����������:");
		int password=Integer.valueOf(sc.nextLine());
		if(username.equals("��") && password==123){
				System.out.println("��ӭ����");
		}else{
			System.out.println("�Բ��������ǻ�Ա");
		}
	}
}
