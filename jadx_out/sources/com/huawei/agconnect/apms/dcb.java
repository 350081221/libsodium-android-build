package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public class dcb {
    public static Future def;
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final ScheduledExecutorService bcd = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("HttpEventWaitReportQueue"));
    public static final ConcurrentLinkedQueue<Object> cde = new ConcurrentLinkedQueue<>();
    public static final Runnable efg = new abc();

    /* loaded from: classes3.dex */
    public static class abc implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            dcb.abc();
        }
    }

    public static /* synthetic */ void abc() {
        gfe pqr;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = cde.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof fed) {
                fed fedVar = (fed) next;
                if (currentTimeMillis - fedVar.cde() > 10000) {
                    arrayList.add(next);
                    if (!fedVar.fgh() && (pqr = fedVar.pqr()) != null) {
                        fedVar.abc(true);
                        yza.abc(new HttpEvent(pqr, ""));
                    }
                }
            } else {
                abc.warn("object is not a state of Http.");
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        cde.removeAll(arrayList);
    }

    public static void abc(Object obj) {
        cde.add(obj);
    }

    public static void abc(fed fedVar) {
        cde.remove(fedVar);
    }
}
