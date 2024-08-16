public class rev2 {
    public static void main(String[] args) {
        String input = "i love programming very much";
        String str2 = "";
        int length = input.length();
        char ch;
        for (int i = length - 1; i >= 0; i--) {
            if (input.charAt(i) != ' ') {
                ch = input.charAt(i);
                str2 = ch + str2;
            } else {
                System.out.print(str2 + " ");
                str2 = "";
            }
        }
        System.out.print(str2); 
    }
}
