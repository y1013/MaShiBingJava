import java.util.Scanner;
public class AgeRate{
	public static void main(String[] args){
		//����Scanner����
		Scanner sc=new Scanner(System.in);
		//����30�����µ�����
		int ageUp=0;
		int ageDown=0;
		
		for(int i=0;i<10;i++){
			System.out.println("�������"+i+"λ�˿͵�����");
			int age=(int) sc.nextInt();
			if(age>30){
				ageUp++;
			}else{
				ageDown++;
			}
		}
		System.out.println("����30�������������"+(ageUp/10.0*100)+"%");
		System.out.println("����30�������������"+(ageDown/10.0*100)+"%");

	}
}