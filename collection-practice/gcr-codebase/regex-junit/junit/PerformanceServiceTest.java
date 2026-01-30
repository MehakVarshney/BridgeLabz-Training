package com.junit.practice.junitTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static java.util.concurrent.TimeUnit.SECONDS;

public class PerformanceServiceTest {
	private final PerformanceService service = new PerformanceService();

    @Test
    @Timeout(value = 2, unit = SECONDS)
    void testTimeout() throws InterruptedException {
        service.longRunningTask();
    }
}
