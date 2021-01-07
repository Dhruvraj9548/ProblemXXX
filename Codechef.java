import java.util.Scanner;

public class Codechef {
    static String toAlphabetic(int i){
    int quot = i/26;
    int rem = i%26;
    char letter = (char)((int)'A' + rem);
    if( quot == 0 ) {
        return ""+letter;
    }
    else {
        return toAlphabetic(quot-1) + letter;
    }
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for(int I = 0; I<A ; I++){
            int B = sc.nextInt();
            Scanner st = new Scanner((System.in));
            String d = "";
            d = st.nextLine();
            if(d.length() == B) {
                int decimal = Integer.parseInt(d, 2);
                System.out.println(toAlphabetic(decimal));
            }
            else{
                System.out.println("Error");
            }
            }
    }
}
