public class Rect{
	public static void main(String[] args){
		/*int num=0;
		for(int i=1;i<5;i++){
			for(int j=1;j<6;j++){
				System.out.print("*");
			}
				System.out.println("");
			
		}*/
		
        for (int i = 1; i <= 6; i++) {
            // 空格分布
            for (int j = 6 - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 符号分布
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
	}
}