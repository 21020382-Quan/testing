import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testcase1() {
        Person p = new Person(-5, "NORMAL");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase2() {
        Person p = new Person(4, "NORMAL");
        assertEquals(300000, p.account(p));
    }

    @Test
    void testcase3() {
        Person p = new Person(20, "NORMAL");
        assertEquals(500000, p.account(p));
    }

    @Test
    void testcase4() {
        Person p = new Person(-4, "VIP");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase5() {
        Person p = new Person(3, "VIP");
        assertEquals(700000, p.account(p));
    }

    @Test
    void testcase6() {
        Person p = new Person(25, "VIP");
        assertEquals(1000000, p.account(p));
    }
}