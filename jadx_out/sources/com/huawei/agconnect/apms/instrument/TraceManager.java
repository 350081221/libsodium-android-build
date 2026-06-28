package com.huawei.agconnect.apms.instrument;

import android.os.Looper;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.b;
import com.huawei.agconnect.apms.c;
import com.huawei.agconnect.apms.g0;
import com.huawei.agconnect.apms.i0;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.m0;
import com.huawei.agconnect.apms.n0;
import com.huawei.agconnect.apms.t0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class TraceManager {
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public static List<b> traceEventListeners = new CopyOnWriteArrayList();

    public static void addListener(b bVar) {
        if (bVar != null && !traceEventListeners.contains(bVar)) {
            traceEventListeners.add(bVar);
        }
    }

    public static void clearListener() {
        if (traceEventListeners.isEmpty()) {
            return;
        }
        traceEventListeners.clear();
    }

    public static void enterMethod(String str, i0 i0Var) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                notifyToEnterMethod(new c(str, i0Var.abc));
            } else {
                notifyToAsyncEnterMethod(new c(str, i0Var.abc));
            }
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("something error happened in enter method: "), LOG);
        }
    }

    public static void exitMethod() {
        try {
            notifyToExitMethod();
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("something error happened in exit method: "), LOG);
        }
    }

    public static void notifyToAddNetworkInfoToTrace(t0 t0Var) {
        Iterator<b> it = traceEventListeners.iterator();
        while (it.hasNext()) {
            m0 m0Var = ((n0) it.next()).abc;
            if (m0Var != null && (!m0Var.def || !m0Var.bcd())) {
                c abc = m0Var.abc.abc();
                if (abc != null) {
                    abc.jkl = t0Var;
                    m0Var.abc(abc);
                    if (m0Var.def && m0Var.cde == g0.PAGE_LOADING) {
                        abc.abc(true);
                    }
                }
            }
        }
    }

    public static void notifyToAsyncEnterMethod(c cVar) {
        for (b bVar : traceEventListeners) {
            c cVar2 = new c(cVar.def, cVar.klm);
            m0 m0Var = ((n0) bVar).abc;
            if (m0Var != null) {
                m0Var.bcd(cVar2);
            }
        }
    }

    public static void notifyToEnterMethod(c cVar) {
        for (b bVar : traceEventListeners) {
            c cVar2 = new c(cVar.def, cVar.klm);
            m0 m0Var = ((n0) bVar).abc;
            if (m0Var != null) {
                m0Var.cde(cVar2);
            }
        }
    }

    public static void notifyToExitMethod() {
        Iterator<b> it = traceEventListeners.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).abc();
        }
    }

    public static void startActivityTrace(String str) {
        AppInstrumentation.onActivityCreateBegin(str);
    }
}
