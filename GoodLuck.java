import java.util.Scanner;
public class GoodLuck{
	public static void main(String[] args){
		int random=(int)(Math.random()*10);
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ա��<4λ����>");
		int number =Integer.parseInt(sc.nextLine());
			System.out.println(number);
			if(number/100%10==random){
				System.out.println("��ϲ�н�");
			}else{
			    System.out.println("лл֧��");
			}
		
		
	}
	}
