package threejava;

public class print_03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int lines = 5;
        int startcount = 1;
        int spacecount = lines - 1;

        for (int j = 1; j <= lines; j++) {
            for (int k = 1; k <= spacecount; k++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= startcount; i++) {
                System.out.print(j);
            }
            System.out.println();
            startcount += 2;
            spacecount--;
        }
    }
}
