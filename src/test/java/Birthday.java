import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Birthday {
    @Test
    public void shengri(){
        System.out.println(wangwei.util.Birthday.calculateAge("2003-10-23"));
        System.out.println(wangwei.util.Birthday.calculateZodiac("2003-10-23"));
        System.out.println(wangwei.util.Birthday.calculateConstellation("2003-10-23"));
    }
    @Test
    public void tiqu(){
        String str="1#1";
        System.out.println(str.substring(0,str.indexOf("#")));
        System.out.println(str.substring(str.indexOf("#")+1));
    }
    @Test
    public void date(){
        String input="2002-10-23";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println(date);
    }
}
