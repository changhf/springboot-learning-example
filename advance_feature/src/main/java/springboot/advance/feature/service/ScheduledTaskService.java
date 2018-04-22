package springboot.advance.feature.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author <a href="mailto:wb-chf309549@alibaba-inc.com">常华锋</a>
 * @version V1.0.0
 * @since 2018/4/22
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("currentTime is:" + sdf.format(new Date()));
    }

    @Scheduled(cron = "0/5 30 18 22 * ? ")
    public void fixTimeException() {
        System.out.println("指定的时间:" + sdf.format(new Date()));
    }
}
