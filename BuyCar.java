public class BuyCar{
	public static void main(String[] args){
		int money=(int) (Math.random()*8000000);
		System.out.println(money);
		if(money>5000000){
			System.out.println("�򿭵�����");
		}else if(money>1000000){
			System.out.println("��������");
		}else if(money>500000){
			System.out.println("������");
	    }else if(money>100000){
			System.out.println("����");
		}else{
			System.out.println("�ݰ���");
		}
	}
}