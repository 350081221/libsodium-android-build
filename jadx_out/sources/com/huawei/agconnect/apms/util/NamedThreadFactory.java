package com.huawei.agconnect.apms.util;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class NamedThreadFactory implements ThreadFactory {
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public ThreadGroup group;
    public String namePrefix;
    public AtomicInteger threadNumber = new AtomicInteger(1);

    /* loaded from: classes3.dex */
    public static class bcd implements Thread.UncaughtExceptionHandler {
        public /* synthetic */ bcd(abc abcVar) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            AgentLog agentLog = NamedThreadFactory.LOG;
            StringBuilder abc = com.huawei.agconnect.apms.abc.abc("uncaught exception ");
            abc.append(th.getMessage());
            abc.append(" occurred in thread [");
            abc.append(thread.getName());
            abc.append("].");
            agentLog.error(abc.toString());
        }
    }

    public NamedThreadFactory(String str) {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.group = threadGroup;
        this.namePrefix = "APMS_" + str + "-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.group, runnable, this.namePrefix + this.threadNumber.getAndIncrement(), 0L);
        thread.setUncaughtExceptionHandler(new bcd(null));
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
