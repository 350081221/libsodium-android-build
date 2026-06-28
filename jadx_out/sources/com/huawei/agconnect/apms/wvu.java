package com.huawei.agconnect.apms;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.hilog.HiLogAbility;
import com.huawei.agconnect.apms.hilog.task.FetchTask;
import com.huawei.agconnect.apms.hilog.task.HiLogConfig;
import com.huawei.agconnect.apms.hilog.task.TaskInfo;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.uts;
import com.huawei.agconnect.apms.wvu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class wvu {
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static onm bcd = new nml();

    public static void abc(int i5, String str, String str2) {
        onm onmVar = bcd;
        if (onmVar != null) {
            onmVar.abc(i5, str, str2);
        }
    }

    public static void bcd() {
        onm onmVar = bcd;
        if (onmVar != null) {
            onmVar.flush();
        }
    }

    public static /* synthetic */ void cde(TaskInfo taskInfo) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(0);
        jSONArray.put(System.currentTimeMillis());
        jSONArray.put("0:0");
        jSONArray.put("V");
        jSONArray.put("CONFIRM:REJECT");
        jSONArray.put("");
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        HiAnalyticsManager.getInstance().onEvent("APMS_LOG", ihg.abc(taskInfo, jSONArray2.toString(), ""));
        jih.abc(taskInfo, 1);
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
            abc.warn("HiLog deny InterruptedException");
        }
        HiAnalyticsManager.getInstance().onReport();
    }

    public static /* synthetic */ void def(TaskInfo taskInfo) {
        ihg ihgVar = new ihg(taskInfo);
        AgentLog agentLog = ihg.bcd;
        agentLog.info("UploadTask execute");
        TaskInfo taskInfo2 = ihgVar.abc;
        if (taskInfo2 != null) {
            int abc2 = jih.abc(taskInfo2);
            if (abc2 != 0) {
                StringBuilder abc3 = abc.abc("UploadTask taskId ");
                abc3.append(ihgVar.abc.getTaskId());
                abc3.append(", state ");
                abc3.append(abc2);
                abc3.append(", return");
                agentLog.info(abc3.toString());
            } else {
                List<File> abc4 = ihgVar.abc();
                StringBuilder abc5 = abc.abc("UploadTask upload file size ");
                abc5.append(abc4.size());
                agentLog.debug(abc5.toString());
                if (abc4.isEmpty()) {
                    agentLog.info("UploadTask upload log line 0");
                } else {
                    HiAnalyticsManager.getInstance().onReport();
                    ihgVar.bcd();
                    long j5 = 0;
                    for (File file : abc4) {
                        try {
                            String canonicalPath = file.getCanonicalPath();
                            ihg.bcd.debug("UploadTask upload file " + file.getName());
                            BufferedReader bufferedReader = new BufferedReader(new FileReader(canonicalPath));
                            long j6 = j5 + 1;
                            try {
                                JSONArray jSONArray = new JSONArray();
                                int i5 = 0;
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    i5 += readLine.length();
                                    if (i5 >= 30720) {
                                        ihgVar.abc(jSONArray.toString(), file.getName());
                                        jSONArray = new JSONArray();
                                        i5 = 0;
                                    }
                                    JSONArray abc6 = ihgVar.abc(j6, readLine);
                                    if (abc6 != null) {
                                        j6++;
                                        jSONArray.put(abc6);
                                    }
                                }
                                if (jSONArray.length() > 0) {
                                    ihgVar.abc(jSONArray.toString(), file.getName());
                                }
                                j5 = j6 - 1;
                                bufferedReader.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                    break;
                                } catch (Throwable th2) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                    throw th2;
                                    break;
                                }
                            }
                        } catch (IOException unused) {
                            ihg.bcd.warn("UploadTask uploadFile IOException");
                        }
                        HiAnalyticsManager.getInstance().onReport();
                        ihgVar.bcd();
                    }
                    ihg.bcd.info("UploadTask upload log line " + j5);
                    HiAnalyticsManager.getInstance().onReport();
                }
            }
        }
        jih.abc(taskInfo, 2);
    }

    public static void abc(final Context context, final ijk ijkVar) {
        if (context == null) {
            abc.warn("HiLog init context is null");
        } else {
            hgf.abc(new Runnable() { // from class: s1.e
                @Override // java.lang.Runnable
                public final void run() {
                    wvu.bcd(context, ijkVar);
                }
            });
        }
    }

    public static /* synthetic */ void bcd(Context context, ijk ijkVar) {
        mlk mlkVar = new mlk(context);
        mlkVar.bcd = ijkVar;
        mlk.cde.info("InitTask execute");
        HiLogConfig hiLogConfig = HiLogConfig.ghi;
        hiLogConfig.abc(mlkVar.abc, mlkVar.bcd);
        uts.abc abcVar = new uts.abc();
        abcVar.bcd = hiLogConfig.def();
        abcVar.abc = hiLogConfig.bcd();
        abcVar.def = 8192;
        abcVar.cde = 2;
        abcVar.fgh = new srq();
        abcVar.ghi = false;
        if (!TextUtils.isEmpty(abcVar.bcd)) {
            if (!TextUtils.isEmpty(abcVar.abc)) {
                if (abcVar.fgh == null) {
                    abcVar.fgh = new srq();
                }
                uts utsVar = new uts(abcVar);
                pon ponVar = new pon();
                ponVar.abc(utsVar);
                bcd = ponVar;
                return;
            }
            throw new IllegalArgumentException("bufferFilePath cannot be null");
        }
        throw new IllegalArgumentException("logFilePath cannot be null");
    }

    public static void abc(final FetchTask.FetchCallback fetchCallback) {
        if (fetchCallback == null) {
            abc.warn("HiLog fetch callback is null");
        } else {
            hgf.abc(new Runnable() { // from class: s1.f
                @Override // java.lang.Runnable
                public final void run() {
                    new FetchTask(FetchTask.FetchCallback.this).abc();
                }
            });
        }
    }

    public static void abc() {
        HiLogAbility.enableDebugNative();
    }

    public static void abc(final TaskInfo taskInfo) {
        AgentLog agentLog = abc;
        agentLog.info("HiLog deny");
        if (taskInfo == null) {
            agentLog.warn("HiLog deny taskInfo is null");
        } else {
            hgf.abc(new Runnable() { // from class: s1.c
                @Override // java.lang.Runnable
                public final void run() {
                    wvu.cde(TaskInfo.this);
                }
            });
        }
    }

    public static void bcd(final TaskInfo taskInfo) {
        AgentLog agentLog = abc;
        agentLog.info("HiLog grant");
        if (taskInfo == null) {
            agentLog.warn("HiLog grant taskInfo is null");
        } else {
            hgf.bcd(new Runnable() { // from class: s1.d
                @Override // java.lang.Runnable
                public final void run() {
                    wvu.def(TaskInfo.this);
                }
            });
        }
    }
}
