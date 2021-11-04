import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a = "richa";
        a.concat("asdf");
        System.out.println(a.concat(" whatever"));



        String s = new String("viikram");
        System.out.println(s.charAt(4));
char x =s.charAt(2);
        String jk = String.valueOf(x);
        System.out.println(jk);
        boolean f = s.contains("j");
        System.out.println(f);

        String JB = "KevinJohn";
        char[] chara = JB.toCharArray();
        System.out.println(Arrays.toString(chara));




    }




    
}
