package com.shenzhenair.source.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * (用一句话描述该文件做什么)
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/7
 */
@Service
public class ScanTask {

    private Logger logger = LoggerFactory.getLogger(ScanTask.class);

    /**
     * <p>Example patterns:
     * <ul>
     * <li>"0 0 * * * *" = the top of every hour of every day.</li>
     * <li>"*&#47;10 * * * * *" = every ten seconds.</li>
     * <li>"0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.</li>
     * <li>"0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30 and 10 o'clock every day.</li>
     * <li>"0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays</li>
     * <li>"0 0 0 25 12 ?" = every Christmas Day at midnight</li>
     * </ul>
     */
    @Scheduled(cron = "0/5 * * * * *")
    public void scan() {

        logger.info("=============== the task of scanning start ===========");

    }
}
