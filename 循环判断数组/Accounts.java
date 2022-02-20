import java.util.Scanner;
public class Accounts{
	public static void main(String[] args){
	    String sign="y";
		int moneySum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请选择购买的商品编号:");
		System.out.println("1.T恤"+"\t"+"2.网球鞋"+"\t"+"3.网球拍");
		while(sign.equals("y")){
		System.out.println("请输入商品编号:");
		int goodsNum=sc.nextInt();
		System.out.println("请输入购买数量:");
		int num=sc.nextInt();
		if(goodsNum==1){
			System.out.println("T恤￥245.0"+"\t"+"数量"+num+"\t"+"合计￥"+245.0*num);
			moneySum+=245.0*num;
		}
		else if(goodsNum==2){
			System.out.println("网球鞋￥570.0"+"\t"+"数量"+num+"\t"+"合计￥"+570.0*num);
			moneySum+=570.0*num;
		}
		else if(goodsNum==3){
			System.out.println("网球拍￥320.0"+"\t"+"数量"+num+"\t"+"合计￥"+320.0*num);
			moneySum+=320.0*num;
		}
		System.out.println("是否继续(y/n)");
		sign=(String) sc.next();
		}
		System.out.println("折扣:0.8");
		System.out.println("应付金额:"+0.8*moneySum);
		System.out.println("实付金额:");
		int money=(int) sc.nextInt();
		while(money<moneySum){
			System.out.println("您输入的金额小于应付金额，请重新输入:");
			money=(int) sc.nextInt();
		}
		System.out.println("找钱:"+(money-0.8*moneySum));
		
	
	}
}
