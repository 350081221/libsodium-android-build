package com.bytedance.pangle.plugin;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.c.b;
import com.bytedance.pangle.f.a.e;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.g;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private File f4481a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4482b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, File file) {
        this.f4481a = file;
        this.f4482b = str;
    }

    private static File a(File file) {
        if (file.exists() || file.getParent() == null) {
            return file;
        }
        File[] listFiles = new File(file.getParent()).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.exists() && file2.getName().endsWith(".apk")) {
                return file2;
            }
        }
        return file;
    }

    private void b() {
        int i5 = 3;
        while (i5 > 0) {
            i5--;
            try {
                File file = new File(this.f4481a.getAbsolutePath() + "_unzip");
                if (file.exists()) {
                    file.delete();
                    file.mkdirs();
                }
                g.b(this.f4481a.getAbsolutePath(), file.getAbsolutePath());
                File[] listFiles = file.listFiles();
                File file2 = this.f4481a;
                if (listFiles != null && listFiles.length > 0) {
                    file2 = listFiles[0];
                }
                File a5 = a(file2);
                if (a5 != null && a5.exists() && a5.isFile()) {
                    this.f4481a = a5;
                    ZeusLogger.d("Plugin install : unZip count : " + (3 - i5));
                    return;
                }
            } catch (Exception e5) {
                ZeusLogger.errReport(ZeusLogger.TAG_INIT, "Plugin install : unZip file failed !!!", e5);
                e5.printStackTrace();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
    }

    private static void a(String str, int i5, @NonNull String str2, long j5, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.putOpt("status_code", com.bytedance.pangle.log.b.a(Integer.valueOf(i5)));
            jSONObject.putOpt("plugin_package_name", com.bytedance.pangle.log.b.a(str2));
            jSONObject.putOpt("version_code", com.bytedance.pangle.log.b.a((Object) 0));
            jSONObject3.putOpt("duration", Integer.valueOf(com.bytedance.pangle.log.b.b(Long.valueOf(j5))));
            jSONObject2.putOpt(CrashHianalyticsData.MESSAGE, com.bytedance.pangle.log.b.a(str3));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.bytedance.pangle.c.b.a().a(str, jSONObject, jSONObject3, jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        if (g.b(this.f4481a)) {
            ZeusLogger.d("Plugin install : start unZip file ~~~~");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            b();
            a(com.bytedance.pangle.c.b.f4277h, b.a.G, this.f4482b, SystemClock.elapsedRealtime() - elapsedRealtime, "");
            ZeusLogger.d("Plugin install : start install from unZip ~~~~");
        } else {
            ZeusLogger.d("Plugin install : start install without unZip ~~~~");
        }
        e a5 = com.bytedance.pangle.f.a.d.a(this.f4481a);
        if (a5 == null) {
            ZeusPluginStateListener.postStateChange(this.f4482b, 7, " read local file package info failed !!! pluginPkg = " + this.f4482b + " mApkFile.exists = " + this.f4481a.exists());
            StringBuilder sb = new StringBuilder("PluginInstallRunnable read local file package info failed !!! pluginPkg = ");
            sb.append(this.f4482b);
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, sb.toString());
            return false;
        }
        Plugin plugin = PluginManager.getInstance().getPlugin(a5.f4402a);
        if (plugin == null) {
            ZeusPluginStateListener.postStateChange(this.f4482b, 7, " plugin == null !!! pluginPkg = " + this.f4482b);
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "PluginInstallRunnable cannot query valid plugin !!! packageName = " + a5.f4402a);
            return false;
        }
        boolean install = plugin.install(this.f4481a, a5);
        if (install) {
            ZeusPluginStateListener.postStateChange(a5.f4402a, 6, new Object[0]);
        } else {
            ZeusPluginStateListener.postStateChange(a5.f4402a, 7, "Internal error.");
        }
        return install;
    }
}
