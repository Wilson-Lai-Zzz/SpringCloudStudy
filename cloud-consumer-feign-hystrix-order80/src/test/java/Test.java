import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/10 0:22
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Slf4j
public class Test {
    @org.junit.Test
    public void forEachTest(){
        try {
            List<String> s = new ArrayList<>();
            s.addAll(null);
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
