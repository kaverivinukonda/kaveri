package info.Exception;

public class ExceptionDemo5 {

	public static void main(String[] args) {
try{
	int a=12/0;
}
catch(ArithmeticException e){
	System.out.println(e.toString());
}
	}

}
