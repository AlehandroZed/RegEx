package RegEx;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "123";
        System.out.println(s.matches("\\d+"));

        String a = "-42421";
        String b = "42521";
        String c = "+2562";

        System.out.println(a.matches("(\\+|-?)\\d+"));
        System.out.println(b.matches("(\\+|-?)\\d+"));
        System.out.println(c.matches("(\\+|-?)\\d+"));


        String d = "rtyutyu646676734";
        System.out.println(d.matches("\\w+\\d+"));

        System.out.println("ktsdf".matches("[^abc]*"));

        String http = "http://www.Rutor.ru";
        String http2 = "http://www.google.com";

        System.out.println(http.matches("http://www\\..+\\.(ru|com)"));
        System.out.println(http2.matches("http://www\\..+\\.(ru|com)"));

        String sd = "1234";
        System.out.println(sd.matches("\\d{2,5}"));


        // split

        a = "Say hello Bob";
        System.out.println(Arrays.toString(a.split(" ")));

        System.out.println(a.replace(" ","-"));
        System.out.println(a.replaceFirst(" ","+"));

        a=  "erter8etdfbv99867mbnk8456kkkkd53jjjk";
        System.out.println(a.replaceAll("\\d+","-"));
        System.out.println(a.replaceAll("\\d","-"));

    }
}
