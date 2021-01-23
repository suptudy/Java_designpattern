package kr.ac.gwnu.com.kwon;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ForHereTest {
    Customer customer;
    Menu menu;
    Size size;
    Topping topping;
    Ice ice;
    ArrayList<String> tempML;

    @Before
    public void setUp() throws FileNotFoundException {
        customer = new ForHere("권수빈");
        customer.setMenu(new Coffee());
        customer.menuList(new BufferedReader(new FileReader("src\\main\\resources\\Coffee.txt")));
        tempML = new ArrayList<>();
    }

    @After
    public void tearDown() {
        customer = null;
    }

    @Test
    public void test_constructor() {
        assertNotNull(customer);
    }

    @Test
    public void test_getName() {
        assertEquals("권수빈", customer.getName());
    }

    @Test
    public void test_type() {
        assertEquals("매장 손님", customer.type());
    }

    @Test
    public void test_menuList() {
        assertNotNull(tempML);
    }

    @Test
    public void test_performMenu1_1() {
        assertEquals("에스프레소    3,600", customer.performMenu1(1));
    }

    @Test
    public void test_performMenu1_2() {
        assertEquals("아메리카노    4,100", customer.performMenu1(2));
    }

    @Test
    public void test_performMenu2_1() {
        assertEquals(2, customer.performMenu2(2));
    }

    @Test
    public void test_performMenu3_1() {
        assertEquals("ICE", customer.performMenu3(true));
    }

    @Test
    public void test_clearML() {
        customer.clearML();
        assertTrue(tempML.isEmpty());
    }

    @Test
    public void test_performSize_1() {
        customer.setSize(new SizeTall());
        assertEquals("Tall 사이즈 선택", customer.performSize(1));
    }

    @Test
    public void test_performSize_2() {
        customer.setSize(new SizeGrande());
        assertEquals("Grande 사이즈 선택", customer.performSize(2));
    }

    @Test
    public void test_peformTopping_2() throws FileNotFoundException {
        customer.setTopping(new ToppingForHot());
        customer.clearML();
        customer.menuList(new BufferedReader(new FileReader("src\\main\\resources\\Topping.txt")));
        assertEquals("시럽", customer.performTopping(2));
    }

    @Test
    public void test_performIce_1() {
        customer.setIce(new IceLess());
        assertEquals("Less 선택", customer.performIce(1));
    }

    @Test
    public void test_performIce_2() {
        customer.setIce(new IceRegular());
        assertEquals("Regular 선택", customer.performIce(2));
    }
}
