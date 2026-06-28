package com.huawei.agconnect.apms.instrument;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.collect.model.event.interaction.PageLoadEvent;
import com.huawei.agconnect.apms.k0;
import com.huawei.agconnect.apms.l0;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.w0;
import com.huawei.agconnect.apms.yza;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class FragmentInstrumentation {
    public static final String FRAGMENT_METHOD_ON_CREATE_VIEW = "#onCreateView";
    public static final String FRAGMENT_METHOD_ON_RESUME = "#onResume";
    public static final String FRAGMENT_METHOD_ON_START = "#onStart";
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public static ConcurrentHashMap<String, k0> fragmentTraces = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public static class abc implements Runnable {
        public final /* synthetic */ String abc;
        public final /* synthetic */ l0 bcd;

        public abc(String str, l0 l0Var) {
            this.abc = str;
            this.bcd = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            yza.abc(new PageLoadEvent(this.abc, this.bcd));
        }
    }

    public static void onCreateViewFragmentBegin(String str, String str2) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            w0 w0Var = new w0();
            w0Var.cde.abc(str, str2);
            w0Var.bcd(str, FRAGMENT_METHOD_ON_CREATE_VIEW);
            fragmentTraces.put(str, w0Var);
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("fragment onCreateView method begin error: "), LOG);
        }
    }

    public static void onCreateViewFragmentEnd(String str, String str2) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            w0 w0Var = (w0) fragmentTraces.get(str);
            if (w0Var == null) {
                return;
            }
            w0Var.cde.abc(str, str2);
            w0Var.abc();
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("fragment onCreateView method end error: "), LOG);
        }
    }

    public static void onResumeFragmentBegin(String str, String str2) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            w0 w0Var = (w0) fragmentTraces.get(str);
            if (w0Var == null) {
                return;
            }
            w0Var.efg.abc(str, str2);
            w0Var.cde(str, "#onResume");
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("fragment onResume method begin error: "), LOG);
        }
    }

    public static void onResumeFragmentEnd(String str, String str2) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            w0 w0Var = (w0) fragmentTraces.get(str);
            if (w0Var == null) {
                return;
            }
            w0Var.efg.abc(str, str2);
            l0 bcd = w0Var.bcd();
            if (bcd == null) {
                return;
            }
            Agent.getExecutor().execute(new abc(str, bcd));
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("fragment onResume method end error: "), LOG);
        }
    }

    public static void onStartFragmentBegin(String str, String str2) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            w0 w0Var = (w0) fragmentTraces.get(str);
            if (w0Var == null) {
                return;
            }
            w0Var.def.abc(str, str2);
            w0Var.abc(str, "#onStart");
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("fragment onStart method begin error: "), LOG);
        }
    }

    public static void onStartFragmentEnd(String str, String str2) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            w0 w0Var = (w0) fragmentTraces.get(str);
            if (w0Var == null) {
                return;
            }
            w0Var.def.abc(str, str2);
            w0Var.cde();
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("fragment onStart method end error: "), LOG);
        }
    }
}
