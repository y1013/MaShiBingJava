import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		System.out.println("��ӭ������ʿ��������Աϵͳ");
		System.out.println("���ͬ����Ϣ");
		Scanner sc=new Scanner(System.in);
		System.out.println("�������Ա����<4λ����>");
		String number = sc.nextLine();
		System.out.println("����������<��/��>");
		String birthday = sc.nextLine();
		System.out.println("���������");
		String score = sc.nextLine();
		if(number.length()==4){
			System.out.println("��Ա��Ϣ����");
		    System.out.println(number+"\t"+birthday+"\t"+score);
		}
		else{
			System.out.println("��Ա�����������������4λ����");
		}
	}
}