package kr.ac.gwnu.com.adaptor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProfessorAdaptorTest {
    ProfessorAdaptor pa;

    @Before
    public void setUp() {
        new ProfessorAdaptor("p0001", "이몽룡", "원주");
    }

    @After
    public void tearDown() {
        pa = null;
    }

    @Test
    public void test_constructor() {
        assertNotNull(pa);
    }

    @Test
    public void test_getID() {
        assertEquals("p0001", pa.getID());
    }

    @Test
    public void test_getName() {
        assertEquals("이몽룡", pa.getName());
    }

    @Test
    public void test_getAddress() {
        assertEquals("원주", pa.getAddress());
    }
}
