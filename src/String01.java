public class String01 {
    public static void main(String[] args) {
        String s1 = "24562137";
        int sum = 0;
        for(int i=0 ; i<s1.length();i++){
            char c = s1.charAt(i);
            sum+=(c-'0');

        }
        System.out.println("ADDITION OF THE NUMBER IS "+sum);
    }
}
