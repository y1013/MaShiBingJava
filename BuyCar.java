public class BuyCar{
	public static void main(String[] args){
		int money=(int) (Math.random()*8000000);
		System.out.println(money);
		if(money>5000000){
			System.out.println("买凯迪拉克");
		}else if(money>1000000){
			System.out.println("买帕萨特");
		}else if(money>500000){
			System.out.println("依兰特");
	    }else if(money>100000){
			System.out.println("奥托");
		}else{
			System.out.println("捷安特");
		}
	}
}