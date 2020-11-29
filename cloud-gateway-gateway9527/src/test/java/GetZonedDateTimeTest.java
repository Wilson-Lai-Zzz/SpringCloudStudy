import lombok.extern.slf4j.Slf4j;

import java.time.ZonedDateTime;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/21 16:36
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Slf4j
public class GetZonedDateTimeTest {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
    }


}
