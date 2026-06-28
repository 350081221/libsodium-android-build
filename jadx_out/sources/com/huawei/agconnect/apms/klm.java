package com.huawei.agconnect.apms;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class klm {
    public static final AgentLog cde = AgentLogManager.getAgentLog();
    public static final klm def = new klm();
    public static final pqr efg = new pqr(".APMAnr");
    public static final pqr fgh = new pqr(".APMNativeAnr");
    public final Handler abc;
    public WeakReference<Context> bcd;

    /* loaded from: classes3.dex */
    public static final class abc implements Runnable {
        public final Context abc;
        public final String bcd;
        public final boolean cde;

        public abc(Context context, String str, boolean z4) {
            this.abc = context;
            this.bcd = str;
            this.cde = z4;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            if (Agent.isDisabled()) {
                return;
            }
            AgentLog agentLog = klm.cde;
            StringBuilder abc = com.huawei.agconnect.apms.abc.abc("start upload anr files isUploadNative: ");
            abc.append(this.cde);
            abc.append(", checkAnr:");
            abc.append(!lmn.def);
            agentLog.info(abc.toString());
            List arrayList = new ArrayList();
            if (this.cde && !lmn.def) {
                x1.abc(this.abc, this.bcd);
            }
            try {
                arrayList = klm.efg.abc(this.abc, false);
            } catch (Throwable th) {
                com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("load anr dir failed. "), klm.cde);
            }
            AgentLog agentLog2 = klm.cde;
            StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("AnrFileCollector fileList size is:");
            abc2.append(arrayList.size());
            agentLog2.debug(abc2.toString());
            for (Object obj : arrayList) {
                try {
                    if (!(obj instanceof File)) {
                        klm.cde.debug("file is not instanceof File！");
                    } else {
                        try {
                            String s02 = okio.y0.e(okio.y0.t((File) obj)).s0();
                            if (s02 != null) {
                                JSONObject jSONObject = new JSONObject(s02);
                                String string = jSONObject.getString("agentVersion");
                                Bundle bundle = new Bundle();
                                bundle.putString(HeaderType.AGENT_VERSION, string);
                                bundle.putString(HeaderType.USER_IDENTIFIER, Agent.getUserIdentifier());
                                bundle.putString(EventType.PLATFORM, jSONObject.getString("platformInformation"));
                                bundle.putString(EventType.USER_SETTINGS, jSONObject.getString("userSettingsInformation"));
                                bundle.putString("device", jSONObject.getString("deviceInformation"));
                                bundle.putString("app", jSONObject.getString("applicationInformation"));
                                bundle.putString("anr", jSONObject.getString("anrInfo"));
                                HiAnalyticsManager.getInstance().onEvent("APMS", bundle);
                                klm.cde.info("upload anr info success, data size: " + bundle.toString().length());
                                klm.abc((File) obj);
                                HiAnalyticsManager.getInstance().onReport();
                                if (!TextUtils.isEmpty(this.bcd) && !new File(this.bcd).isDirectory()) {
                                    klm.abc(new File(this.bcd));
                                }
                            } else {
                                klm.cde.debug("json is null!");
                            }
                        } catch (IOException unused) {
                            klm.cde.error("Okio.buffer IOException");
                        }
                    }
                } catch (Throwable th2) {
                    com.huawei.agconnect.apms.abc.bcd(th2, com.huawei.agconnect.apms.abc.abc("upload anr files failed. "), klm.cde);
                }
            }
            try {
                List abc3 = klm.efg.abc(this.abc, true);
                int size = abc3.size() - 10;
                for (int i5 = 0; i5 < size; i5++) {
                    if (abc3.get(i5) instanceof File) {
                        klm.abc((File) abc3.get(i5));
                    }
                }
            } catch (Throwable unused2) {
                klm.cde.debug("delete unused files failed. ");
            }
        }
    }

    public klm() {
        HandlerThread handlerThread = new HandlerThread("upload-anr-thread");
        handlerThread.start();
        this.abc = new Handler(handlerThread.getLooper());
    }

    public void abc(Context context) {
        this.bcd = new WeakReference<>(context);
    }

    public static /* synthetic */ void abc(File file) {
        if (file.delete()) {
            return;
        }
        cde.info("delete anr file failed.");
    }
}
