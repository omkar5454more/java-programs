import java.util.Locale;

public class String03 {
    public static void main(String[] args) {
        String str = "this is core java batch";
        String[] arr = str.split(" ");

        String ans  = "";
        for( String s : str.split(" ")) {
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length() - 1);
            String s1 = s.toUpperCase().substring(1 , s.length()-1);
            ans = ans.concat( c1+s1+c2+" ");


        }

        ans=ans.trim();
        System.out.println(ans);

    }
}
