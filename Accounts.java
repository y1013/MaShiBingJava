import java.util.Scanner;
public class Accounts{
	public static void main(String[] args){
	    String sign="y";
		int moneySum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("��ѡ�������Ʒ���:");
		System.out.println("1.T��"+"\t"+"2.����Ь"+"\t"+"3.������");
		while(sign.equals("y")){
		System.out.println("��������Ʒ���:");
		int goodsNum=sc.nextInt();
		System.out.println("�����빺������:");
		int num=sc.nextInt();
		if(goodsNum==1){
			System.out.println("T����245.0"+"\t"+"����"+num+"\t"+"�ϼƣ�"+245.0*num);
			moneySum+=245.0*num;
		}
		else if(goodsNum==2){
			System.out.println("����Ь��570.0"+"\t"+"����"+num+"\t"+"�ϼƣ�"+570.0*num);
			moneySum+=570.0*num;
		}
		else if(goodsNum==3){
			System.out.println("�����ģ�320.0"+"\t"+"����"+num+"\t"+"�ϼƣ�"+320.0*num);
			moneySum+=320.0*num;
		}
		System.out.println("�Ƿ����(y/n)");
		sign=(String) sc.next();
		}
		System.out.println("�ۿ�:0.8");
		System.out.println("Ӧ�����:"+0.8*moneySum);
		System.out.println("ʵ�����:");
		int money=(int) sc.nextInt();
		while(money<moneySum){
			System.out.println("������Ľ��С��Ӧ��������������:");
			money=(int) sc.nextInt();
		}
		System.out.println("��Ǯ:"+(money-0.8*moneySum));
		
	
	}
}