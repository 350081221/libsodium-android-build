package com.huawei.agconnect.apms;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.agconnect.apms.anr.NativeHandler;
import com.huawei.agconnect.apms.collect.model.CollectData;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.agconnect.apms.exception.APMSException;
import com.huawei.agconnect.apms.klm;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateEvent;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateListener;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.Session;
import com.huawei.agconnect.apms.zab;
import com.tendcloud.tenddata.ab;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class def implements fgh, ApplicationStateListener {
    public static final AgentLog jkl = AgentLogManager.getAgentLog();
    public final long abc = System.currentTimeMillis();
    public final Context bcd;
    public final ijk cde;
    public final efg def;
    public DeviceInformation efg;
    public PlatformInformation fgh;
    public UserSettingsInformation ghi;
    public ApplicationInformation hij;
    public String ijk;

    public def(Context context, efg efgVar, ijk ijkVar) throws Throwable {
        Context applicationContext;
        String str;
        if (context instanceof Application) {
            applicationContext = context;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.bcd = applicationContext;
        this.def = efgVar;
        this.cde = ijkVar;
        ApplicationStateMonitor.getInstance().addApplicationStateListener(this);
        x0 x0Var = new x0();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(x0Var);
        }
        context.registerComponentCallbacks(x0Var);
        if (this.hij == null) {
            this.hij = new ApplicationInformation();
            String packageName = applicationContext.getPackageName();
            this.hij.setPackageId(packageName);
            PackageManager packageManager = applicationContext.getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                if (packageInfo != null && (str = packageInfo.versionName) != null && str.length() > 0) {
                    String str2 = packageInfo.versionName;
                    AgentLog agentLog = jkl;
                    agentLog.debug("using application version " + str2);
                    this.hij.setAppVersion(str2);
                    int i5 = packageInfo.versionCode;
                    agentLog.debug("using application versionCode " + i5);
                    this.hij.setVersionCode(i5);
                    try {
                        packageName = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
                    } catch (Throwable th) {
                        abc.bcd(th, abc.abc("failed to get appName, use packageName instead: "), jkl);
                    }
                    jkl.debug("using application name " + packageName);
                    this.hij.setAppName(packageName);
                } else {
                    throw new APMSException("the app doesn't have a version defined, ensure 'versionName' has been defined in build.gradle or AndroidManifest.xml.");
                }
            } catch (Throwable th2) {
                StringBuilder abc = abc.abc("could not get package version: ");
                abc.append(th2.getMessage());
                throw new APMSException(abc.toString());
            }
        }
        this.def.abc = this.cde.abc("apms.disabled_by_user");
        this.def.bcd = this.cde.abc("apms.disabled_android");
        this.def.cde = this.cde.bcd("apms.disabled_android_app_versions");
        this.def.efg = !this.cde.abc("apms.disabled_anr_monitor");
        this.def.def = this.cde.bcd("apms.cdn_header_name");
        r1.def().cde = this.cde.abc("apms.enable.remote.config");
        r1.def().def = new bcd(this);
        new Handler().post(new cde(this));
    }

    @Override // com.huawei.agconnect.apms.fgh
    public long abc() {
        return this.abc;
    }

    @Override // com.huawei.agconnect.apms.lifestyle.ApplicationStateListener
    public void applicationBackgrounded(ApplicationStateEvent applicationStateEvent) {
        jkl.debug("APMS: application backgrounded.");
        try {
            def(true);
        } catch (Throwable unused) {
            jkl.warn("failed to stop apms agent");
        }
    }

    @Override // com.huawei.agconnect.apms.lifestyle.ApplicationStateListener
    public void applicationForegrounded(ApplicationStateEvent applicationStateEvent) {
        jkl.debug("APMS: application foregrounded.");
        cde();
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void bcd(boolean z4) {
        if (z4) {
            jkl.info("APMS: enable collection by user.");
            try {
                this.def.abc = false;
                this.cde.abc(false);
            } finally {
                cde();
                e1.cde().abc(v1.jkl().abc, ApplicationStateMonitor.getInstance().isAppInBackground());
            }
        } else {
            jkl.info("APMS: disable collection by user.");
            try {
                this.def.abc = true;
                this.cde.abc(true);
            } finally {
                def(false);
                e1.cde().bcd();
            }
        }
        r1.def().cde = z4;
        this.cde.abc("apms.enable.remote.config", z4);
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void cde() {
        try {
            if (!bcd()) {
                mno();
                uvw uvwVar = uvw.fgh;
                if (uvwVar != null) {
                    zab zabVar = uvwVar.bcd;
                    if (zabVar == null) {
                        uvw.efg.warn("the collect timer is null, can not stop timer.");
                    } else {
                        zabVar.bcd();
                    }
                }
            } else {
                def(false);
            }
        } catch (Throwable unused) {
            jkl.warn("failed to start apms agent");
        }
    }

    @Override // com.huawei.agconnect.apms.fgh
    public UserSettingsInformation def() {
        UserSettingsInformation userSettingsInformation = this.ghi;
        if (userSettingsInformation != null) {
            return userSettingsInformation;
        }
        UserSettingsInformation userSettingsInformation2 = new UserSettingsInformation();
        TimeZone timeZone = TimeZone.getDefault();
        userSettingsInformation2.setTimeZone(timeZone.getID() + "/" + timeZone.getDisplayName(false, 0));
        Context context = this.bcd;
        if (context != null && context.getResources() != null && this.bcd.getResources().getConfiguration() != null && this.bcd.getResources().getConfiguration().locale != null) {
            Locale locale = this.bcd.getResources().getConfiguration().locale;
            userSettingsInformation2.setDefaultLanguage(locale.getLanguage() + "_" + locale.getCountry());
        } else {
            userSettingsInformation2.setDefaultLanguage("");
        }
        if (APMS.getInstance().isUserPrivacyAgreed()) {
            Context context2 = this.bcd;
            userSettingsInformation2.setDns(context2 != null ? m1.abc(context2) : "");
        }
        this.ghi = userSettingsInformation2;
        return userSettingsInformation2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // com.huawei.agconnect.apms.fgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation efg() {
        /*
            r5 = this;
            com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation r0 = new com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation
            r0.<init>()
            android.content.Context r1 = r5.bcd
            boolean r1 = com.huawei.agconnect.apms.i1.def(r1)
            r0.setDeviceCharging(r1)
            android.content.Context r1 = r5.bcd
            android.content.Intent r1 = com.huawei.agconnect.apms.i1.abc(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L37
            java.lang.String r2 = "level"
            r3 = -1
            int r2 = r1.getIntExtra(r2, r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "scale"
            int r1 = r1.getIntExtra(r4, r3)     // Catch: java.lang.Throwable -> L2b
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r1
            int r1 = (int) r2
            goto L38
        L2b:
            r1 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r2 = com.huawei.agconnect.apms.i1.abc
            java.lang.String r3 = "failed to get device battery percentage: "
            java.lang.StringBuilder r3 = com.huawei.agconnect.apms.abc.abc(r3)
            com.huawei.agconnect.apms.abc.bcd(r1, r3, r2)
        L37:
            r1 = 0
        L38:
            r0.setBatteryPercentage(r1)
            android.content.Context r1 = r5.bcd
            java.lang.String r1 = com.huawei.agconnect.apms.m1.cde(r1)
            r0.setNetworkWanType(r1)
            android.content.Context r1 = r5.bcd
            if (r1 == 0) goto L69
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L69
            android.content.Context r1 = r5.bcd
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            if (r1 == 0) goto L69
            android.content.Context r1 = r5.bcd
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r0.setOrientation(r1)
        L69:
            com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor r1 = com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor.getInstance()
            boolean r1 = r1.isAppInBackground()
            r0.setAppBackgrounded(r1)
            com.huawei.agconnect.apms.util.Session r1 = r5.ijk()
            r0.addSession(r1)
            android.content.Context r1 = r5.bcd
            if (r1 != 0) goto L82
            r1 = 0
            goto L86
        L82:
            long r1 = com.huawei.agconnect.apms.j1.abc(r1)
        L86:
            r0.setMemoryUsage(r1)
            long r1 = com.huawei.agconnect.apms.j1.abc()
            r0.setDiskAvailable(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.def.efg():com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(1:7)|(6:8|9|10|11|12|13)|(3:15|16|17)|18|19|20|(2:21|22)|(2:24|25)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        com.huawei.agconnect.apms.abc.bcd(r0, com.huawei.agconnect.apms.abc.abc("failed to get EMUI version: "), com.huawei.agconnect.apms.i1.abc);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #1 {all -> 0x00e1, blocks: (B:20:0x00a6, B:24:0x00dd, B:31:0x00c0, B:22:0x00b6), top: B:19:0x00a6, inners: #6 }] */
    @Override // com.huawei.agconnect.apms.fgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.agconnect.apms.collect.model.basic.PlatformInformation fgh() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.def.fgh():com.huawei.agconnect.apms.collect.model.basic.PlatformInformation");
    }

    @Override // com.huawei.agconnect.apms.fgh
    public ApplicationInformation ghi() {
        return this.hij;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:(6:5|6|7|8|9|10)|11|(1:13)(1:126)|14|(1:16)(1:125)|17|(16:23|(2:25|(2:27|(1:(1:30))(1:121))(1:122))(1:123)|31|32|33|34|35|(3:36|37|(2:39|(1:81)(1:44))(2:83|84))|86|87|51|52|53|54|55|(8:57|58|59|60|61|62|63|64)(9:67|(7:69|59|60|61|62|63|64)|58|59|60|61|62|63|64))|124|31|32|33|34|35|(4:36|37|(0)(0)|81)|86|87|51|52|53|54|55|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:5|6|7|8|9|10|11|(1:13)(1:126)|14|(1:16)(1:125)|17|(16:23|(2:25|(2:27|(1:(1:30))(1:121))(1:122))(1:123)|31|32|33|34|35|(3:36|37|(2:39|(1:81)(1:44))(2:83|84))|86|87|51|52|53|54|55|(8:57|58|59|60|61|62|63|64)(9:67|(7:69|59|60|61|62|63|64)|58|59|60|61|62|63|64))|124|31|32|33|34|35|(4:36|37|(0)(0)|81)|86|87|51|52|53|54|55|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x010a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x010d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x010e, code lost:
    
        r3 = null;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        r1 = r8.split(":")[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015c, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015f, code lost:
    
        com.huawei.agconnect.apms.abc.bcd(r0, com.huawei.agconnect.apms.abc.abc("failed to get memory info: "), com.huawei.agconnect.apms.j1.abc);
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ef, code lost:
    
        com.huawei.agconnect.apms.j1.abc.warn("failed to close /proc/cpuinfo file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013b, code lost:
    
        com.huawei.agconnect.apms.j1.abc.warn("failed to close /proc/cpuinfo file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0135, code lost:
    
        if (r7 == null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6 A[Catch: all -> 0x0108, TryCatch #2 {all -> 0x0108, blocks: (B:37:0x00d0, B:39:0x00d6, B:42:0x00de, B:45:0x00e5), top: B:36:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157 A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #13 {all -> 0x015b, blocks: (B:55:0x014c, B:67:0x0157), top: B:54:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.huawei.agconnect.apms.fgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.agconnect.apms.collect.model.basic.DeviceInformation hij() {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.def.hij():com.huawei.agconnect.apms.collect.model.basic.DeviceInformation");
    }

    @Override // com.huawei.agconnect.apms.fgh
    public Session ijk() {
        return v1.jkl().abc;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public String jkl() {
        if (TextUtils.isEmpty(this.ijk)) {
            return "";
        }
        return this.ijk;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public Context klm() {
        return this.bcd;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public efg lmn() {
        return this.def;
    }

    public final void mno() {
        uvw.abc(this.cde);
        uvw.abc(v1.jkl());
        efg efgVar = this.def;
        uvw uvwVar = uvw.fgh;
        if (uvwVar != null) {
            if (uvwVar.cde == null) {
                uvwVar.cde = new CollectData();
            }
            if (uvwVar.abc == null) {
                zyx zyxVar = new zyx();
                uvwVar.abc = zyxVar;
                zyxVar.efg = uvwVar.cde;
            }
            if (uvwVar.bcd == null) {
                uvwVar.bcd = new zab(uvwVar.abc);
            }
            zyx zyxVar2 = uvwVar.abc;
            zyxVar2.cde = efgVar;
            zyxVar2.abc(uvw.fgh.def);
            uvw.def();
        }
        uvw.abc(this.cde.abc);
        if (yza.def == null) {
            yza.def = yza.bcd.scheduleAtFixedRate(yza.efg, 0L, 1000L, TimeUnit.MILLISECONDS);
        }
        if (dcb.def == null) {
            dcb.def = dcb.bcd.scheduleAtFixedRate(dcb.efg, 0L, 1000L, TimeUnit.MILLISECONDS);
        }
        AgentLog agentLog = jkl;
        StringBuilder abc = abc.abc("APMS v");
        abc.append(Agent.getVersion());
        agentLog.info(abc.toString());
    }

    public static void abc(Context context, efg efgVar, ijk ijkVar) {
        Context context2;
        try {
            Agent.setImpl(new def(context, efgVar, ijkVar));
            if (Agent.isDisabled()) {
                jkl.info("APMS has been disabled by remote config.");
                return;
            }
            klm klmVar = klm.def;
            klmVar.abc(context);
            WeakReference<Context> weakReference = klmVar.bcd;
            if (weakReference != null && (context2 = weakReference.get()) != null) {
                klmVar.abc.postDelayed(new klm.abc(context2, klm.fgh.abc(context2).toString(), true), ab.aa);
            }
            nop.cde().abc(efgVar.efg);
            NativeHandler.bcd().abc(efgVar.efg, x1.abc(context), klm.fgh.abc(context).toString());
            v1.jkl().bcd(false);
            Agent.start();
        } catch (Throwable th) {
            AgentLog agentLog = jkl;
            StringBuilder abc = abc.abc("failed to init APMS: ");
            abc.append(th.toString());
            agentLog.error(abc.toString());
        }
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void cde(boolean z4) {
        this.def.efg = z4;
        this.cde.abc("apms.disabled_anr_monitor", !z4);
    }

    public final void def(boolean z4) {
        if (!Agent.isDisabled() && z4) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                jkl.warn("collect on main thread.");
            }
            if (uvw.cde()) {
                uvw.fgh.abc();
                zab zabVar = uvw.fgh.bcd;
                try {
                    zabVar.abc.schedule(new zab.abc(zabVar), 0L, TimeUnit.SECONDS).get();
                } catch (Throwable th) {
                    abc.abc(th, abc.abc("exception occurred while executing tick: "), zab.hij);
                }
            }
        }
        Future future = dcb.def;
        if (future != null) {
            future.cancel(true);
            dcb.def = null;
        }
        if (uvw.cde()) {
            uvw.efg();
            uvw uvwVar = uvw.fgh;
            zab zabVar2 = uvwVar.bcd;
            if (zabVar2 != null) {
                zabVar2.abc();
                zabVar2.abc.shutdownNow();
            }
            CollectData collectData = uvwVar.cde;
            if (collectData != null) {
                collectData.shutDownCollectData();
            }
            uvwVar.bcd = null;
            uvwVar.abc = null;
            uvwVar.cde = null;
        }
        Future future2 = yza.def;
        if (future2 == null) {
            return;
        }
        future2.cancel(true);
        yza.def = null;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void abc(String str) {
        this.ijk = str;
    }

    @Override // com.huawei.agconnect.apms.fgh
    public void abc(boolean z4) {
        UserSettingsInformation userSettingsInformation;
        if (!z4 || (userSettingsInformation = this.ghi) == null) {
            return;
        }
        Context context = this.bcd;
        userSettingsInformation.setDns(context == null ? "" : m1.abc(context));
    }

    @Override // com.huawei.agconnect.apms.fgh
    public boolean bcd() {
        boolean z4;
        efg efgVar = this.def;
        boolean z5 = efgVar.abc;
        boolean z6 = efgVar.bcd;
        String str = efgVar.cde;
        String appVersion = this.hij.getAppVersion();
        if (str != null && str.length() != 0 && appVersion != null && appVersion.length() != 0) {
            for (String str2 : str.split("\u0001,")) {
                if (appVersion.trim().equalsIgnoreCase(str2.trim())) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        return z5 || z6 || z4;
    }
}
