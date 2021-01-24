package kr.ac.gwnu.com.ch5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalendarTest {
    private Calendar calendar;

    @Before
    public void setUp() {
        calendar = new Calendar();
    }

    @After
    public void tearDown() {
        calendar = null;
    }

    @Test
    public void test_constructor() {
        assertNotNull(calendar);
    }

    @Test
    public void test_askDay_00010101() {
        assertEquals("월요일", calendar.askDay(1, 1, 1));
    }

    @Test
    public void test_askDay_00010102() {
        assertEquals("화요일", calendar.askDay(1, 1, 2));
    }

    @Test
    public void test_askDay_00010103() {
        assertEquals("수요일", calendar.askDay(1, 1, 3));
    }

    @Test
    public void test_askDay_00010104() {
        assertEquals("목요일", calendar.askDay(1, 1, 4));
    }

    @Test
    public void test_askDay_00010108() {
        assertEquals("월요일", calendar.askDay(1, 1, 8));
    }

    @Test
    public void test_askDay_00010131() {
        assertEquals("수요일", calendar.askDay(1, 1, 31));
    }

    @Test
    public void test_askDay_00010201() {
        assertEquals("목요일", calendar.askDay(1, 2, 1));
    }

    @Test
    public void test_askDay_00010228() {
        assertEquals("수요일", calendar.askDay(1, 2, 28));
    }

    @Test
    public void test_askDay_00010301() {
        assertEquals("목요일", calendar.askDay(1, 3, 1));
    }

    @Test
    public void test_askDay_00010308() {
        assertEquals("목요일", calendar.askDay(1, 3, 8));
    }

    @Test
    public void test_askDay_00011231() {
        assertEquals("월요일", calendar.askDay(1, 12, 31));
    }

    @Test
    public void test_askDay_00020101() {
        assertEquals("화요일", calendar.askDay(2, 1, 1));
    }

    @Test
    public void test_askDay_00021231() {
        assertEquals("화요일", calendar.askDay(2, 12, 31));
    }

    @Test
    public void test_askDay_00030101() {
        assertEquals("수요일", calendar.askDay(3, 1, 1));
    }

    @Test
    public void test_askDay_20200929() {
        assertEquals("화요일", calendar.askDay(2020, 9, 29));
    }

    @Test
    public void test_askDay_20191201() {
        assertEquals("일요일", calendar.askDay(2019, 12, 1));
    }

    @Test
    public void test_askDay_20200201() {
        assertEquals("토요일", calendar.askDay(2020, 2, 1));
    }
}
