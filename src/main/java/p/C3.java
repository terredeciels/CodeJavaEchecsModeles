package p;

public class C3 {
    private static final int EMPTY = 0;// MODELE

    private int[] piece;
    private Piece[] pieces;
    private int[] offsets;
    private boolean[] slide;
    private int[] color;
    private int xside;

    private void gen(int c) {
        int p = piece[c];
        Piece q = pieces[c];

        for (int d = 0; d < offsets[p]; ++d) {
            int _c = c;
            if (!slide[p]) {// Cavalier, roi
                while ((_c = f(p, d, _c)) != -1) {
                    // if ((_c = getMailbox(p, d, _c)) != -1) {
                    //_c = getMailbox(p, d, _c);
//                if (_c == -1) {
//                    break;
//                }
                    if (color[_c] != EMPTY) {
                        if (color[_c] == xside) {
                            g(c, _c, 1);
                        }
                        break;
                    }
                    g(c, _c, 0);
                    // if (!slide[p]) {
                    break;
                    // }
                }
            } else {
                while ((_c = f(p, d, _c)) != -1) {
                    //_c = getMailbox(p, d, _c);
//                if (_c == -1) {
//                    break;
//                }
                    if (color[_c] != EMPTY) {
                        if (color[_c] == xside) {
                            g(c, _c, 1);
                        }
                        break;
                    }
                    g(c, _c, 0);
                    //if (slide[p]) {
                    //  continue;
                    // }
                    // break;
                }
            }

        }
    }

    private void g(int c, int c1, int i) {

    }

    private int f(int p, int d, int c) {
        return 0;
    }

    private class Piece {
    }
}
