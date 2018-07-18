import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task2{
public static void main(String[] args){
Pattern compile=Pattern.compile("krishna[.][a-z]{1}@gmail[.][a-z]{3}");
Matcher matcher=compile.matcher("krishna.g@gmail.com");
while (matcher.find()){
System.out.println(matcher.group());
}
}
}
