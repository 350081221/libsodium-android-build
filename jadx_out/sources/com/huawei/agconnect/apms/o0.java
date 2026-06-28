package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.Stack;

/* loaded from: classes3.dex */
public class o0 {
    public static final AgentLog def = AgentLogManager.getAgentLog();
    public ThreadLocal<c> abc = new ThreadLocal<>();
    public ThreadLocal<bcd<c>> bcd = new ThreadLocal<>();
    public c cde = null;

    /* loaded from: classes3.dex */
    public static class bcd<E> extends Stack<E> {
        public bcd() {
        }

        public /* synthetic */ bcd(abc abcVar) {
        }
    }

    public c abc() {
        return this.abc.get();
    }

    public void abc(c cVar, boolean z4) {
        if (cVar == null) {
            return;
        }
        bcd<c> bcdVar = this.bcd.get();
        if (bcdVar == null) {
            bcdVar = new bcd<>(null);
        }
        if (bcdVar.isEmpty() || bcdVar.peek() != cVar) {
            bcdVar.push(cVar);
            AgentLog agentLog = def;
            StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("push stack: ");
            abc2.append(cVar.efg);
            abc2.append(", metricName: ");
            abc2.append(cVar.def);
            abc2.append(", stack size: ");
            abc2.append(bcdVar.size());
            agentLog.debug(abc2.toString());
        }
        this.bcd.set(bcdVar);
        this.abc.set(cVar);
        if (z4) {
            this.cde = cVar;
        }
    }
}
