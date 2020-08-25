package d13;

import com.pcschool.ocp.d13_assert.Square;
import org.junit.Assert;
import org.junit.Test;
public class TestSquare {
    
    @Test
    public void test1() { // 測試梯形面積
        // 輸入參數
        int x = 10;
        int y = 20;
        int h = 4;
        // 期望結果
        int exp = 60;
        // 實際結果
        Square sq = new Square();
        int act = sq.getArea(x, y, h);
        
        // 驗證
        Assert.assertEquals(exp, act);
    }
    
    @Test
    public void test2() { // 測試三角形面積
        int x = 10;
        int h = 2;
        int exp = 10;
        Square sq = new Square();
        int act = sq.getTriangle(x, h);
        Assert.assertEquals(exp, act);
    }
}
