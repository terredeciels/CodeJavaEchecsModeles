package p;

import static org.junit.jupiter.api.Assertions.*;

class CTest {

    @org.junit.jupiter.api.Test
    void f() {
       C c = new C();
        for (int i = 0; i < 64; i++) {
            assertEquals(c.mailbox64[i],c.f(i));
        }
    }
}