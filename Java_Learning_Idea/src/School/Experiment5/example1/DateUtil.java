package School.Experiment5.example1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    /**
     * 获取时间差（以分钟为单位）
     * @param startTime 开始时间
     * @param endTime  结束时间
     * @return 时间差
     */
    public static long getIntervalsByMin(
            LocalDateTime startTime, LocalDateTime endTime){
        Duration duration = Duration.between(startTime,endTime);
        long minsDiff = duration.toMinutes();
        return minsDiff;
    }

    /**
     * 格式化为“yyyy-MM-dd HH:mm:ss”形式
     * @param dateTime 日期时间对象
     * @return 格式化后的日期时间字符串
     */
    public static String formatDate(LocalDateTime dateTime){
        String time = dateTime.format(
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return time;
    }
}
