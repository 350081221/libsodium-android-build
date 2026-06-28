package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.CollectData;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.collect.model.event.Events;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class uvw {
    public static final AgentLog efg = AgentLogManager.getAgentLog();
    public static uvw fgh = new uvw();
    public static final Collection<xyz> ghi = new ArrayList();
    public zyx abc;
    public zab bcd;
    public CollectData cde;
    public wxy def = wxy.cde();

    public static void abc(xyz xyzVar) {
        if (xyzVar == null) {
            return;
        }
        if (!cde()) {
            if (ghi.contains(xyzVar)) {
                return;
            }
            bcd(xyzVar);
            return;
        }
        fgh.abc.abc(xyzVar);
    }

    public static synchronized void bcd(xyz xyzVar) {
        synchronized (uvw.class) {
            if (xyzVar == null) {
                return;
            }
            ghi.add(xyzVar);
        }
    }

    public static boolean cde() {
        uvw uvwVar = fgh;
        if (uvwVar != null && uvwVar.abc != null) {
            return true;
        }
        return false;
    }

    public static synchronized void def() {
        synchronized (uvw.class) {
            Iterator it = new ArrayList(ghi).iterator();
            while (it.hasNext()) {
                abc((xyz) it.next());
            }
            ghi.clear();
        }
    }

    public static void efg() {
        uvw uvwVar = fgh;
        if (uvwVar == null) {
            return;
        }
        zab zabVar = uvwVar.bcd;
        if (zabVar == null) {
            efg.warn("the collect timer is null, can not stop timer.");
        } else {
            zabVar.cde();
        }
    }

    public static wxy bcd() {
        if (!cde()) {
            return wxy.cde();
        }
        return fgh.def;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r3 < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void abc() {
        /*
            r7 = this;
            com.huawei.agconnect.apms.uvw r0 = com.huawei.agconnect.apms.uvw.fgh
            r1 = 0
            if (r0 == 0) goto L1d
            com.huawei.agconnect.apms.zab r0 = r0.bcd
            if (r0 == 0) goto L1d
            long r3 = r0.fgh
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L12
            r3 = r1
            goto L19
        L12:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.fgh
            long r3 = r3 - r5
        L19:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1e
        L1d:
            r3 = r1
        L1e:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L29
            com.huawei.agconnect.apms.log.AgentLog r0 = com.huawei.agconnect.apms.uvw.efg
            java.lang.String r1 = "Collector: session duration is invalid."
            r0.error(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.uvw.abc():void");
    }

    public static void abc(wxy wxyVar) {
        if (!cde()) {
            efg.error("Collector: cannot configure Collector before initialization.");
            return;
        }
        uvw uvwVar = fgh;
        uvwVar.def.abc(wxyVar);
        uvwVar.bcd.cde = TimeUnit.MILLISECONDS.convert(uvwVar.def.abc(), TimeUnit.SECONDS);
        uvwVar.abc.abc(uvwVar.def);
    }

    public static <T extends Event> void abc(T t5, Events<T> events) {
        boolean z4 = false;
        if (cde()) {
            if (4 == fgh.abc.abc) {
                z4 = true;
            }
        }
        if (z4) {
            return;
        }
        int i5 = fgh.def.cde;
        if (events.count() >= i5) {
            efg.debug("Collector: events count limitation " + i5 + " reached, " + t5.getClass().getSimpleName() + " dropped.");
            return;
        }
        events.add(t5);
        AgentLog agentLog = efg;
        StringBuilder abc = abc.abc("Collector: now contains [");
        abc.append(events.count());
        abc.append("] ");
        abc.append(t5.getClass().getSimpleName());
        agentLog.debug(abc.toString());
    }
}
