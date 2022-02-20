public class Account{
	public static void main(String[] args){
		int money=(int) (Math.random()*300);
		String vip=((int) (Math.random()*2))==0?"false":"true";
		System.out.println(vip);
		System.out.println(money);
		if(vip=="true"){
			if(money>100 && money<200){
				System.out.println("打8折");
			}
			if(money>200){
				System.out.println("打7.5折");
			}
			if(money<100){
				System.out.println("不打折");
			}
		}else{
			if(money>100){
				System.out.println("打9折");
			}else{
				System.out.println("不打折");
			}
		}
		
	}
}