package info.Exception;

public class ExceptionDemo3 {

public void stuff(){
	do_stuff();
}
public void do_stuff()
{
	int a=13/0;
	System.out.println("hello");
}
public static void main(String[] args){
	ExceptionDemo3 ed=new ExceptionDemo3();
	ed.stuff();
	}

}
