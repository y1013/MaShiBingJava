public class Add{
	public static void main(String[] args){
		int sum=0;
		int count=1;
		for(int i=1;i<11;i++){
			count*=i;
			sum+=count;
		}
		
		System.out.println("ºÍÎª"+sum);
	}
}