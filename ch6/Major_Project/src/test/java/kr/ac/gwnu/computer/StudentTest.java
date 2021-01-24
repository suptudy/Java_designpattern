package kr.ac.gwnu.computer;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class StudentTest {
    @Test
    public void test_constructor() {
        Student student = new Student("0001", "홍길동");
        assertNotNull(student);
    }
}
