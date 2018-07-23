package info.thiss;

public class My_Yeilds1 {
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			try{
				Thread.yield();
			}
			catch(Exception x){
				x.printStackTrace();
			}
		}
	}

	public static void main(String[] args)throws InterruptedException {
		My_Yeilds my=new My_Yeilds();
		Thread t1=new Thread(my);
		t1.start();
		t1.join();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}
	}

