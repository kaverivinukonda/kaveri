import java.io.*;
public class FileMerge{
public static void main(String[] args)throws IOException{
PrintWriter pw=new PrintWriter("output.txt");
BufferedReader br3=new BufferedReader(new FileReader("abc.txt"));
BufferedReader br4=new BufferedReader(new FileReader("def.txt"));
String l1=br3.readLine();
String l2=br4.readLine();
while(l1!=null||l2!=null)
{
if(l1!=null){
pw.println(l1);
l1=br3.readLine();
}
if(l2!=null){
pw.println(l2);
l2=br4.readLine();
}
pw.flush();
br3.close();
br4.close();
System.out.println("file merged successfully");
}
}
}
