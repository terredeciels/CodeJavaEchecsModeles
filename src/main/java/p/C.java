package p;

public class C {
    public C() {
       // System.out.println(this);
      // System.out.println(mailbox64_0_63());
     // System.out.println(  mailbox_mailbox64_CasesPrint());
      // System.out.println(mailbox_mailbox64());

       // test1();
                for (int i = 0; i < 64; i++) {
           System.out.println(f(i));
        }
    }

    public static void main(String[] args) {
        new C();
    }

//    int[] mailbox = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
//            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
//            -1,  0, 1, 2, 3, 4, 5, 6, 7, -1,
//            -1,  8, 9, 10, 11, 12, 13, 14, 15, -1,
//            -1, 16, 17, 18, 19, 20, 21, 22, 23, -1,
//            -1, 24, 25, 26, 27, 28, 29, 30, 31, -1,
//            -1, 32, 33, 34, 35, 36, 37, 38, 39, -1,
//            -1, 40, 41, 42, 43, 44, 45, 46, 47, -1,
//            -1, 48, 49, 50, 51, 52, 53, 54, 55, -1,
//            -1, 56, 57, 58, 59, 60, 61, 62, 63, -1,
//            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
//            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    int[] mailbox = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, 0, 1, 2, 3, 4, 5, 6, 7, -1,
            -1, 8, 9, 10, 11, 12, 13, 14, 15, -1,
            -1, 16, 17, 18, 19, 20, 21, 22, 23, -1,
            -1, 24, 25, 26, 27, 28, 29, 30, 31, -1,
            -1, 32, 33, 34, 35, 36, 37, 38, 39, -1,
            -1, 40, 41, 42, 43, 44, 45, 46, 47, -1,
            -1, 48, 49, 50, 51, 52, 53, 54, 55, -1,
            -1, 56, 57, 58, 59, 60, 61, 62, 63, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    //    int[] mailbox64 = {21, 22, 23, 24, 25, 26, 27, 28,
//            31, 32, 33, 34, 35, 36, 37, 38,
//            41, 42, 43, 44, 45, 46, 47, 48,
//            51, 52, 53, 54, 55, 56, 57, 58,
//            61, 62, 63, 64, 65, 66, 67, 68,
//            71, 72, 73, 74, 75, 76, 77, 78,
//            81, 82, 83, 84, 85, 86, 87, 88,
//            91, 92, 93, 94, 95, 96, 97, 98};
    int[] mailbox64 = {21, 22, 23, 24, 25, 26, 27, 28,
            31, 32, 33, 34, 35, 36, 37, 38,
            41, 42, 43, 44, 45, 46, 47, 48,
            51, 52, 53, 54, 55, 56, 57, 58,
            61, 62, 63, 64, 65, 66, 67, 68,
            71, 72, 73, 74, 75, 76, 77, 78,
            81, 82, 83, 84, 85, 86, 87, 88,
            91, 92, 93, 94, 95, 96, 97, 98};

    int f(int i){
        if (i%10==8){
            i+=2;
        }else{
            i+=1;
        }
        return i;
    }

//    void test1(){
//        for (int i = 0; i < 64; i++) {
//            assert(mailbox64[i]==f(i));
//        }
//    }

    public int[] color = new int[64];
    public int[] piece = new int[64];

    {
        for (int c = 0; c < 64; ++c) {

        }
    }

    private int getMailbox(int cO, int d, int cX) {
        int p = piece[cO];
        int[] dir = offset[p];
        int DIR = dir[d];
        cX = mailbox[mailbox64[cX] + DIR];
        return cX;
    }


    int PAWN = 0, KNIGHT = 1, BISHOP = 2, ROOK = 3, QUEEN = 4, KING = 5;
    int EMPTY = 6;
    boolean[] slide = {false, false, true, true, true, false};
    int[] offsets = {0, 8, 4, 4, 8, 8};
    int[] P = {0, 0, 0, 0, 0, 0, 0, 0};
    int E = 1,N=-10;
    int[] C = {-21, -19, -12, -8, 8, 12, 19, 21};
    int[] F = {N-E, N+E, 9, 11, 0, 0, 0, 0};
    int[] T = {N, -E, E, -N, 0, 0, 0, 0};
    int[] D = {N-E, N, N+E, -E, E, -(N+E), -N, E-N};
    int[] R = {N-E, N, N+E, -E, E, -(N+E), -N, E-N};

    int[][] offset = {P, C, F, T, D, R};



    public String mailbox_mailbox64() {
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < 64; ++c) {
            sb.append(mailbox[mailbox64[c]]).append(" ");
            if (mailbox[mailbox64[c]] % 10 == 9) sb.append("\n");
        }
        return sb.toString();
    }


    public String mailbox64_0_63() {
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < 64; ++c) {
            int m64 = mailbox64[c];
            sb.append(m64).append(" ");
            if (m64 % 10 == 8) sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < 64; ++c) {
            int m64 = mailbox64[c];
            sb.append(m64).append(" ");
            if (m64 % 10 == 8) sb.append("\n");
        }
        return sb.toString();
    }
}
