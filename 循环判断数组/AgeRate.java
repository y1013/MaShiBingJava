import java.util.Scanner;
public class AgeRate{
	public static void main(String[] args){
		//定义Scanner对象
		Scanner sc=new Scanner(System.in);
		//储存30岁上下的人数
		int ageUp=0;
		int ageDown=0;
		
		for(int i=0;i<10;i++){
			System.out.println("请输入第"+i+"位顾客的年龄");
			int age=(int) sc.nextInt();
			if(age>30){
				ageUp++;
			}else{
				ageDown++;
			}
		}
		System.out.println("超过30岁的人数比例是"+(ageUp/10.0*100)+"%");
		System.out.println("超过30岁的人数比例是"+(ageDown/10.0*100)+"%");

	}
}
