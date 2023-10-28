package Java_Basics_One;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class NumberFormats {
    public static void main(String[] args) {

//        Locale locale = new Locale("en","US");


        double doubleValue = 1_234_567.98;

        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        NumberFormat currencyForm = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + numF.format(doubleValue));

        NumberFormat intForm = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intForm.format(doubleValue));

       String s1 = "Welcome to Lala Land";
       System.out.println("Length of string: " + s1.length());

       int position = s1.indexOf("Land");
        System.out.println("Position of substring: " + position);

        String sub = s1.substring(16);
        System.out.println(sub);

        String s2 = "California              ";
        int len1 = s2.length();
        System.out.println(len1);

        System.out.println("After trim");
        String s3 = s2.trim();
        System.out.println(s3.length());

        System.out.println("================================================");

        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2022,4,28);
        gc.add(GregorianCalendar.DATE,1);
        Date d2 = gc.getTime();
        System.out.println(d2);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("================================================");

        LocalDate ld = LocalDate.of(2023,10,27);
        System.out.println(ld);
        System.out.println("================================================");

        Date dd = new Date();
        System.out.println(d);







    }
}
