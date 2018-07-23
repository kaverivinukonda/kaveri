package info.thiss;

public class My_Yeilds4 {
	public void run(){
		for(int i=0;i<10;i++)
		{
			try{
				Thread.sleep(2000);
				System.out.println("child thread");
			}
			catch(Exception x){
				x.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		My_Yeilds my=new My_Yeilds();
		Thread t1=new Thread(my);
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}
	}

