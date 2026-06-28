package com.huawei.agconnect.apms;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.huawei.agconnect.apms.klm;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.tuv;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class lmn {
    public static final AgentLog cde = AgentLogManager.getAgentLog();
    public static boolean def;
    public final Object abc = new Object();
    public Set<mno> bcd;

    public void abc(mno mnoVar) {
        synchronized (this.abc) {
            Set<mno> set = this.bcd;
            if (set == null) {
                return;
            }
            set.add(mnoVar);
        }
    }

    public void bcd(mno mnoVar) {
        synchronized (this.abc) {
            Set<mno> set = this.bcd;
            if (set == null) {
                return;
            }
            set.remove(mnoVar);
        }
    }

    public void abc() {
        synchronized (this.abc) {
            Set<mno> set = this.bcd;
            if (set == null) {
                return;
            }
            for (mno mnoVar : set) {
                if (mnoVar != null) {
                    mnoVar.abc();
                }
            }
        }
    }

    public boolean abc(String str) {
        ActivityManager activityManager;
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo;
        String sb;
        Context context = Agent.getContext();
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return false;
        }
        def = true;
        int i5 = 0;
        loop0: while (true) {
            if (i5 >= 30) {
                processErrorStateInfo = null;
                break;
            }
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                cde.debug("waiting for anr state info, check times: " + i5);
                try {
                    Thread.sleep(500L);
                } catch (Throwable unused) {
                    cde.debug("waiting to search process error info.");
                }
            } else {
                for (int i6 = 0; i6 < processesInErrorState.size(); i6++) {
                    try {
                        processErrorStateInfo = processesInErrorState.get(i6);
                        if (Process.myPid() != processErrorStateInfo.pid) {
                            cde.debug("not this application process.");
                        } else {
                            cde.info("processErrorStateInfo condition: " + processErrorStateInfo.condition);
                            if (processErrorStateInfo.condition == 2) {
                                break loop0;
                            }
                        }
                    } catch (Throwable unused2) {
                        cde.debug("the ANR process detection is interrupted.");
                    }
                }
            }
            i5++;
        }
        if (processErrorStateInfo == null) {
            AgentLog agentLog = cde;
            agentLog.error("maybe it is not an anr, continue.");
            if (!TextUtils.isEmpty(str) && !new File(str).isDirectory() && !new File(str).delete()) {
                agentLog.info("delete anrPath file failed.");
            }
            def = false;
            return false;
        }
        def = false;
        abc();
        rst rstVar = new rst();
        rstVar.def = processErrorStateInfo.longMsg;
        String str2 = processErrorStateInfo.tag;
        rstVar.bcd = str2;
        String str3 = "";
        if (TextUtils.isEmpty(str2)) {
            rstVar.bcd = "";
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        rstVar.efg = new stu(Runtime.getRuntime(), memoryInfo);
        ArrayList arrayList = new ArrayList();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Thread thread = Looper.getMainLooper().getThread();
        if (!allStackTraces.containsKey(thread)) {
            allStackTraces.put(thread, thread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            if (entry.getValue().length > 0) {
                tuv.bcd bcdVar = new tuv.bcd(entry.getKey());
                arrayList.add(new tuv(bcdVar.abc, bcdVar.bcd, bcdVar.cde, bcdVar.def, null));
            }
        }
        rstVar.cde = arrayList;
        rstVar.abc = com.huawei.secure.android.common.detect.c.h();
        int max = Math.max(153600 - new qrs(rstVar).abc().length(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(w1.abc());
        if (Build.VERSION.SDK_INT >= 29) {
            sb = "network status:\nnot supported collect network statues on Android Q (API level 29) and later.\n\n";
        } else {
            StringBuilder abc = abc.abc("/proc/self/net/icmp6", 256, abc.abc("/proc/self/net/icmp", 256, abc.abc("/proc/self/net/udp6", 1024, abc.abc("/proc/self/net/udp", 1024, abc.abc("/proc/self/net/tcp6", 1024, abc.abc("/proc/self/net/tcp", 1024, abc.abc("network status:\n IPv4-based TCP (From: /proc/PID/net/tcp)\n"), "-", "\n", " IPv6-based TCP (From: /proc/PID/net/tcp6)", "\n"), "-", "\n", " IPv4-based UDP (From: /proc/PID/net/udp)", "\n"), "-", "\n", " IPv6-based UDP (From: /proc/PID/net/udp6)", "\n"), "-", "\n", " IPv4-based ICMP (From: /proc/PID/net/icmp)", "\n"), "-", "\n", " IPv6-based ICMP (From: /proc/PID/net/icmp6)", "\n"), "-", "\n", " UNIX domain (From: /proc/PID/net/unix)", "\n");
            abc.append(w1.abc("/proc/self/net/unix", 256));
            abc.append("\n");
            sb = abc.toString();
        }
        sb2.append(sb);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("memory status:\n System Status (From: /proc/meminfo)\n");
        sb3.append(w1.abc("/proc/meminfo"));
        sb3.append("-");
        sb3.append("\n");
        sb3.append(" Process Status (From: /proc/PID/status)");
        sb3.append("\n");
        sb3.append(w1.abc("/proc/self/status"));
        sb3.append("-");
        sb3.append("\n");
        sb3.append(" Process Limits (From: /proc/PID/limits)");
        sb3.append("\n");
        sb3.append(w1.abc("/proc/self/limits"));
        sb3.append("-");
        sb3.append("\n");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(" Process Status (From: android.os.Debug.MemoryInfo)\n");
        Locale locale = Locale.ENGLISH;
        sb4.append(String.format(locale, "%21s %8s%n", "", "Pss(KB)"));
        sb4.append(String.format(locale, "%21s %8s%n", "", "------"));
        try {
            Debug.MemoryInfo memoryInfo2 = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo2);
            sb4.append(String.format(locale, "%21s %8s%n", "Java Heap:", memoryInfo2.getMemoryStat("summary.java-heap")));
            sb4.append(String.format(locale, "%21s %8s%n", "Native Heap:", memoryInfo2.getMemoryStat("summary.native-heap")));
            sb4.append(String.format(locale, "%21s %8s%n", "Code:", memoryInfo2.getMemoryStat("summary.code")));
            sb4.append(String.format(locale, "%21s %8s%n", "Stack:", memoryInfo2.getMemoryStat("summary.stack")));
            sb4.append(String.format(locale, "%21s %8s%n", "Graphics:", memoryInfo2.getMemoryStat("summary.graphics")));
            sb4.append(String.format(locale, "%21s %8s%n", "Private Other:", memoryInfo2.getMemoryStat("summary.private-other")));
            sb4.append(String.format(locale, "%21s %8s%n", "System:", memoryInfo2.getMemoryStat("summary.system")));
            sb4.append(String.format(locale, "%21s %8s %21s %8s%n", "TOTAL:", memoryInfo2.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo2.getMemoryStat("summary.total-swap")));
        } catch (Throwable th) {
            w1.abc.warn("get memory status of process failed. " + th);
        }
        sb3.append(sb4.toString());
        sb3.append("\n");
        sb2.append(sb3.toString());
        int myPid = Process.myPid();
        StringBuilder sb5 = new StringBuilder();
        if (max > 0) {
            sb5.append("logcat:\n");
            w1.abc(myPid, sb5, TTAdSdk.S_C, 2000, 'W', w1.abc(myPid, sb5, com.umeng.analytics.pro.d.ax, 50, 'I', w1.abc(myPid, sb5, "system", 50, 'W', max)));
            sb5.append("\n");
            str3 = sb5.toString();
        }
        sb2.append(str3);
        rstVar.ghi = sb2.toString();
        klm.efg.abc(context, new qrs(rstVar));
        Thread thread2 = new Thread(new klm.abc(context, str, false));
        thread2.setUncaughtExceptionHandler(new jkl());
        thread2.setName("send-anr-thread");
        thread2.start();
        try {
            thread2.join(a1.b.f90a);
        } catch (Throwable unused3) {
            klm.cde.warn("the ANR information upload failed. will upload the information again upon next startup.");
        }
        return true;
    }
}
