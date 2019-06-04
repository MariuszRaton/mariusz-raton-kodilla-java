package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void addLogs() {
        Logger.getInstance().log("log1");
        Logger.getInstance().log("log2");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("lastLog = " + lastLog);
        //Then
        Assert.assertEquals("log2", lastLog);
    }
}