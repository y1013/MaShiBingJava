import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û�����");
		String username=sc.nextLine();
		char[] username1=username.toCharArray();
		Scanner sc1=new Scanner(System.in);
		System.out.println("���������룺");
		int password=Integer.parseInt(sc1.nextLine());
		if(Strcmp(username1,'��')==0){
			if(password==123){
				System.out.println("��ӭ����");
			}
			
		}
		else{
			System.out.println("�Բ��������ǻ�Ա");
		}
	}
}