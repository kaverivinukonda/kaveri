import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Demo{
public static void main(String[] args){
Pattern compile=Pattern.compile("[0-9]{2}[A-Z]{2}[0-9]{1}[A-Z][0-9]{2}[A-Z][0-9]{1}");
Matcher matcher=compile.matcher("16EM1A05A3");
while (matcher.find()){
System.out.println(matcher.group());
}
}
}
