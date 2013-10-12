package com.github.marschall.startuplogger;

import java.lang.invoke.MethodHandles;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
@Startup
public class LoggerProblem {

    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Schedule(second = "*/10", minute = "*", hour = "*", persistent = false)
    public void log() {
        LOG.info("ok");
    }

}
