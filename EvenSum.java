public class EvenSum{
	public static void main(String[] args){
		int num=1;
		int sum=0;
		while(num<=100){
			if(num%2==0){
				sum+=num;
			}
			num+=1;
		}
		System.out.println("100以内的偶数和为"+sum);
	}
}