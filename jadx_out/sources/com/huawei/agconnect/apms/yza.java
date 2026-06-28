package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.custom.CustomEvent;
import com.huawei.agconnect.apms.collect.model.event.custom.CustomHttpEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityLoadEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityRenderEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ApplicationStartEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.PageLoadEvent;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.collect.model.event.resource.CPUMemoryEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public class yza extends vwx {
    public static Future def;
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final ScheduledExecutorService bcd = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("CollectQueue"));
    public static final ConcurrentLinkedQueue<Object> cde = new ConcurrentLinkedQueue<>();
    public static final Runnable efg = new abc();

    /* loaded from: classes3.dex */
    public static class abc implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (yza.cde.size() == 0) {
                return;
            }
            while (true) {
                ConcurrentLinkedQueue<Object> concurrentLinkedQueue = yza.cde;
                if (!concurrentLinkedQueue.isEmpty()) {
                    try {
                        Object remove = concurrentLinkedQueue.remove();
                        if (remove instanceof ApplicationStartEvent) {
                            uvw.abc((ApplicationStartEvent) remove, uvw.fgh.cde.getAppStartEvents());
                        } else if (remove instanceof ActivityLoadEvent) {
                            uvw.abc((ActivityLoadEvent) remove, uvw.fgh.cde.getActivityLoadEvents());
                        } else if (remove instanceof ActivityRenderEvent) {
                            uvw.abc((ActivityRenderEvent) remove, uvw.fgh.cde.getActivityRenderEvents());
                        } else if (remove instanceof CustomHttpEvent) {
                            uvw.abc((CustomHttpEvent) remove, uvw.fgh.cde.getCustomHttpEvents());
                        } else if (remove instanceof HttpEvent) {
                            uvw.abc((HttpEvent) remove, uvw.fgh.cde.getHttpEvents());
                        } else if (remove instanceof ForeAndBackgroundEvent) {
                            uvw.abc((ForeAndBackgroundEvent) remove, uvw.fgh.cde.getForeAndBackgroundEvents());
                        } else if (remove instanceof CustomEvent) {
                            uvw.abc((CustomEvent) remove, uvw.fgh.cde.getCustomEvents());
                        } else if (remove instanceof CPUMemoryEvent) {
                            uvw.abc((CPUMemoryEvent) remove, uvw.fgh.cde.getCpuMemoryEvents());
                        } else if (remove instanceof PageLoadEvent) {
                            uvw.abc((PageLoadEvent) remove, uvw.fgh.cde.getPageLoadEvents());
                        }
                    } catch (Throwable th) {
                        AgentLog agentLog = yza.abc;
                        StringBuilder abc = com.huawei.agconnect.apms.abc.abc("exception occurred when dequeue events: ");
                        abc.append(th.toString());
                        agentLog.error(abc.toString());
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static void abc(Object obj) {
        cde.add(obj);
    }
}
