import java.util.Scanner;

public class cesar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input the shift number: ");
        int i = s.nextInt();
        s.nextLine();
        System.out.print("Input the message: ");
        String m = s.nextLine();

        String hid = converter(m, i);
        String dehid = deconverter(hid, i);
        System.out.println("Original  | " + m);
        System.out.println("Encoded   | " + hid);
        System.out.println("Decoded   | " + dehid);
    }

    public static String converter(String s, int y) {
        String ne = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ne += (c == ' ') ? c : (char)(c + y);
        }
        return ne;
    }

    public static String deconverter(String s, int y) {
        String ne = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ne += (c == ' ') ? c : (char)(c - y);
        }
        return ne;
    }
}
