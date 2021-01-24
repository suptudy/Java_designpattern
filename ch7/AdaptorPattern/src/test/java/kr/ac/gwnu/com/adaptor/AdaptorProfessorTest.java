package kr.ac.gwnu.com.adaptor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdaptorProfessorTest {
    Professor pf;
    AdaptorProfessor ap;

    @Before
    public void setUp() {
        pf = new Professor("p0001", "이몽룡", "원주");
        ap = new AdaptorProfessor(pf);
    }

    @After
    public void tearDown() {
        pf = null;
    }

    @Test
    public void test_constructor() {
        AdaptorProfessor ap = new AdaptorProfessor(pf);
        assertNotNull(ap);
    }

    @Test
    public void test_getID() {
        assertEquals("p0001", ap.getID());

    }

    @Test
    public void test_getName() {
        assertEquals("이몽룡", ap.getName());
    }

    @Test
    public void test_getAddress() {
        assertEquals("원주", ap.getAddress());
    }
}
