public class Baj4673 {
    public static void main(String[] args){
        boolean[] isNotSelfNumber = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int dn = d(i);
            if (dn <= 10000) {
                isNotSelfNumber[dn] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!isNotSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        int dn = n;
        while (n > 0) {
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
}
