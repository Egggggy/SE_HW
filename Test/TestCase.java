import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class TestCase {
    @Test
    public void Test1(){
        Assert.assertEquals('X',Main.letterGrade(-5));
    }
    @Test
    public void Test2(){
        Assert.assertEquals('F',Main.letterGrade(20));
    }
    @Test
    public void Test3(){
        Assert.assertEquals('D',Main.letterGrade(65));
    }
    @Test
    public void Test4(){
        Assert.assertEquals('C',Main.letterGrade(73));
    }
    @Test
    public void Test5(){
        Assert.assertEquals('B',Main.letterGrade(84));
    }
    @Test
    public void Test6(){
        Assert.assertEquals('A',Main.letterGrade(97));
    }
    @Test
    public void Test7(){
        Assert.assertEquals('X',Main.letterGrade(105));
    }

    @Test
    public void Test8(){
        Assert.assertEquals('X',Main.letterGrade(-1));
    }
    @Test
    public void Test9(){
        Assert.assertEquals('F',Main.letterGrade(0));
    }
    @Test
    public void Test10(){
        Assert.assertEquals('F',Main.letterGrade(59));
    }
    @Test
    public void Test11(){
        Assert.assertEquals('D',Main.letterGrade(60));
    }
    @Test
    public void Test12(){
        Assert.assertEquals('D',Main.letterGrade(69));
    }
    @Test
    public void Test13(){
        Assert.assertEquals('C',Main.letterGrade(70));
    }
    @Test
    public void Test14(){
        Assert.assertEquals('C',Main.letterGrade(79));
    }
    @Test
    public void Test15(){
        Assert.assertEquals('B',Main.letterGrade(80));
    }
    @Test
    public void Test16(){
        Assert.assertEquals('B',Main.letterGrade(89));
    }
    @Test
    public void Test17(){
        Assert.assertEquals('A',Main.letterGrade(90));
    }
    @Test
    public void Test18(){
        Assert.assertEquals('A',Main.letterGrade(100));
    }
    @Test
    public void Test19(){
        Assert.assertEquals('X',Main.letterGrade(101));
    }
}
