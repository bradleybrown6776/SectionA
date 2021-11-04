package SectionA;

import org.junit.Test;
import org.junit.Assert;

public class test {
    Student s1 = new Student("John", 22, 122121);
    @Test
    public void name() {
        Assert.assertEquals(22, s1.getAge());
        Assert.assertEquals(122121, s1.getID());
    }
}
