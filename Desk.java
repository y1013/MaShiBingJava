public class Desk{
	public static void main(String[] args){
		int age=(int) (Math.random()*8);
		String sex=((int) (Math.random()*2))==0?"girl":"boy";
		System.out.println(age);
		System.out.println(sex);
		if(age>7){
			System.out.println("���԰ᶯ");
		}else if(age>5 && sex=="boy"){
			System.out.println("���԰ᶯ");
		}else{
			System.out.println("��̫С��");
		}
	}
}