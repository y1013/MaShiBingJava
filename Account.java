public class Account{
	public static void main(String[] args){
		int money=(int) (Math.random()*300);
		String vip=((int) (Math.random()*2))==0?"false":"true";
		System.out.println(vip);
		System.out.println(money);
		if(vip=="true"){
			if(money>100 && money<200){
				System.out.println("��8��");
			}
			if(money>200){
				System.out.println("��7.5��");
			}
			if(money<100){
				System.out.println("������");
			}
		}else{
			if(money>100){
				System.out.println("��9��");
			}else{
				System.out.println("������");
			}
		}
		
	}
}