/*
使用命令行的方式执行的时候，cmd的默认编码格式是GBK
因此在输入中文的时候需要设置文件的编码格式ANSI，不会出现乱码错误

注意：
    1、Java文件的名称要和 public class的名称保持一致
	2、一个Java文件中可以包含多个class，但是public class只能有一个



*/

public class HelloWorld{
	
    public static void main(String[] args){
		
		System.out.println("欢迎大家学习java");
	}
}