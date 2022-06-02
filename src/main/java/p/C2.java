package p;

public class C2 {
    private static final int VIDE = 0;
    private int cX;
    private int d;
    private int p;
    private int[] color;
    private int cO;
    private int xside;
    private boolean[] slide;

    void F() {

        while (true) {

            cX = f(cO, cX, d);//case suivante

            if (cX == -1) break;// is case OUT

            if (color[cX] != VIDE) {
                if (color[cX] == xside) g(cO, cX, 1); //nouveau coups prise

                break;
            }

            g(cO, cX, 0);// nouveau coups (deplacement ?)

            if (!slide[p]) break; // is case suivanye ?

        }
        //BREAK
    }

    void F2() {

        if (!slide[p]) {// Cavalier, roi
           // while ((cX = f(cO, cX, d)) != -1) {
               if ((cX = f(cO, cX, d)) != -1){

//                cX = f(cO, cX, d);//case suivante
//                if (cX == -1) break;// is case OUT

                if (color[cX] != VIDE) {
                    if (color[cX] == xside) g(cO, cX, 1); //nouveau coups prise

                   // break;
                }

                g(cO, cX, 0);// nouveau coups (deplacement ?)

                // if (!slide[p])
               // break; // is case suivanye ?

            }
        } else {
            while ((cX = f(cO, cX, d)) != -1) { // Fou,Tour,Dame

//                cX = f(cO, cX, d);//case suivante
//
//                if (cX == -1) break;// is case OUT

                if (color[cX] != VIDE) {
                    if (color[cX] == xside) g(cO, cX, 1); //nouveau coups prise

                    break;
                }

                g(cO, cX, 0);// nouveau coups (deplacement ?)
            }
        }
    }


    private void g(int cO, int cX, int code) {
    }

    private int f(int cO, int cX, int dir) {
        return cX;
    }
}
