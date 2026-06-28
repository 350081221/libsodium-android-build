package com.bytedance.pangle.plugin;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusPluginEventCallback;
import com.bytedance.pangle.a.a;
import com.bytedance.pangle.c.b;
import com.bytedance.pangle.e.f;
import com.bytedance.pangle.i;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.e;
import com.bytedance.pangle.util.g;
import com.bytedance.pangle.util.h;
import com.bytedance.pangle.util.l;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.lody.virtual.server.content.SyncStorageEngine;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final i f4483a = i.a();

    /* loaded from: classes2.dex */
    public static class a extends IOException {
        /* synthetic */ a(String str, byte b5) {
            this(str);
        }

        /* synthetic */ a(String str, Throwable th, byte b5) {
            this(str, th);
        }

        private a(String str) {
            super(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(final File file, final String str, final int i5) {
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("useOpt;");
        final boolean[] zArr = {false};
        try {
            i iVar = f4483a;
            iVar.a(1000, 0, str, i5, null);
            com.bytedance.pangle.log.a a5 = com.bytedance.pangle.log.a.a(ZeusLogger.TAG_INSTALL, "PluginInstaller", "install:".concat(String.valueOf(str)));
            a(com.bytedance.pangle.c.b.f4274e, b.a.f4300r, str, i5, -1L, null);
            int b5 = l.a().b(str, i5, "install");
            int b6 = l.a().b(str, i5, "load");
            int removeApkEntryFlag = GlobalParam.getInstance().getRemoveApkEntryFlag(str);
            if (b5 > 3 || b6 > 3) {
                removeApkEntryFlag = 0;
            }
            SharedPreferences.Editor edit = l.a().f4650a.edit();
            edit.putInt("remove_entry_flag_" + str + "_" + i5, removeApkEntryFlag);
            edit.apply();
            l.a().c(str, i5, false);
            g.a(com.bytedance.pangle.d.c.a(str, i5));
            com.bytedance.pangle.a.a.a(new a.InterfaceC0115a() { // from class: com.bytedance.pangle.plugin.b.1
                @Override // com.bytedance.pangle.a.a.InterfaceC0115a
                public final void a() {
                    b.a(file, str, i5, stringBuffer);
                }
            }, new a.InterfaceC0115a() { // from class: com.bytedance.pangle.plugin.b.2
                @Override // com.bytedance.pangle.a.a.InterfaceC0115a
                public final void a() {
                    final Map f5 = b.f(file, str, i5, stringBuffer);
                    b.c(file, str, i5, stringBuffer);
                    b.a(b.g(file, str, i5, stringBuffer), str, i5, stringBuffer);
                    if (!com.bytedance.pangle.util.i.f() && !com.bytedance.pangle.util.i.b()) {
                        b.a(str, i5, f5, stringBuffer);
                        zArr[0] = b.a(str, i5, false, stringBuffer);
                        b.a(str, i5);
                    } else {
                        final boolean[] zArr2 = {false};
                        com.bytedance.pangle.a.a.a(new a.InterfaceC0115a() { // from class: com.bytedance.pangle.plugin.b.2.1
                            @Override // com.bytedance.pangle.a.a.InterfaceC0115a
                            public final void a() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                b.a(str, i5, f5, stringBuffer);
                            }
                        }, new a.InterfaceC0115a() { // from class: com.bytedance.pangle.plugin.b.2.2
                            @Override // com.bytedance.pangle.a.a.InterfaceC0115a
                            public final void a() {
                                boolean[] zArr3 = zArr2;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                zArr3[0] = b.h(file, str, i5, stringBuffer);
                            }
                        });
                        zArr[0] = b.a(str, i5, zArr2[0], stringBuffer);
                    }
                }
            });
            g.a(file);
            a(com.bytedance.pangle.c.b.f4275f, b.a.f4301s, str, i5, a5.a(), stringBuffer.toString());
            a5.a(SyncStorageEngine.MESG_SUCCESS);
            iVar.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, 0, str, i5, null);
            return true;
        } catch (Throwable th) {
            if (th instanceof a) {
                ZeusLogger.w(ZeusLogger.TAG_INSTALL, "PluginInstaller " + str + " install failed.", th);
            } else {
                ZeusLogger.w(ZeusLogger.TAG_INSTALL, "PluginInstaller " + str + " install failed unknown error.", th);
                a(com.bytedance.pangle.c.b.f4275f, b.a.f4302t, str, i5, -1L, stringBuffer.toString());
                f4483a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -1, str, i5, th);
            }
            if (zArr[0]) {
                l.a().a(str, i5, "install");
            }
            return false;
        }
    }

    static /* synthetic */ void c(File file, String str, int i5, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        byte b5 = 0;
        try {
            try {
                PackageInfo packageInfo = Zeus.getAppApplication().getPackageManager().getPackageInfo(Zeus.getAppApplication().getPackageName(), 4096);
                PackageInfo packageArchiveInfo = Zeus.getAppApplication().getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 4096);
                List asList = Arrays.asList(packageInfo.requestedPermissions);
                String[] strArr = packageArchiveInfo.requestedPermissions;
                if (strArr != null && strArr.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : packageArchiveInfo.requestedPermissions) {
                        if (!asList.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ZeusLogger.w("PluginInstaller", "The following permissions are declared in the plugin but not in the host: ".concat(String.valueOf(arrayList)));
                        if (GlobalParam.getInstance().checkPermission()) {
                            throw new a("The following permissions are declared in the plugin but not in the host: ".concat(String.valueOf(arrayList)), b5);
                        }
                    }
                }
            } catch (Exception e5) {
                a(com.bytedance.pangle.c.b.f4275f, b.a.f4304v, str, i5, -1L, null);
                f4483a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -4, str, i5, e5);
                throw new a("安装包权限校验失败", e5, b5);
            }
        } finally {
            stringBuffer.append("checkPermissions cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(a1.i.f136b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, List<ZipEntry>> f(File file, String str, int i5, StringBuffer stringBuffer) {
        String str2 = "插件包包含so不符合宿主ABI类型";
        if (GlobalParam.getInstance().checkMatchHostAbi()) {
            long currentTimeMillis = System.currentTimeMillis();
            byte b5 = 0;
            try {
                try {
                    e<Boolean, Map<String, List<ZipEntry>>> a5 = com.bytedance.pangle.d.b.a(file);
                    boolean booleanValue = a5.f4641a.booleanValue();
                    Map<String, List<ZipEntry>> map = a5.f4642b;
                    if (booleanValue) {
                        return map;
                    }
                    throw new a(str2, b5);
                } catch (Exception e5) {
                    a(com.bytedance.pangle.c.b.f4275f, b.a.A, str, i5, -1L, null);
                    f4483a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -5, str, i5, e5);
                    throw new a(str2, e5, b5);
                }
            } finally {
                stringBuffer.append("checkMatchHostAbi cost:");
                stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
                stringBuffer.append(a1.i.f136b);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(File file, String str, int i5, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        String b5 = com.bytedance.pangle.d.c.b(str, i5);
        try {
            try {
                h.a(file.getAbsolutePath(), b5);
                return b5;
            } catch (Exception e5) {
                a(com.bytedance.pangle.c.b.f4275f, b.a.f4305w, str, i5, -1L, null);
                f4483a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -6, str, i5, e5);
                throw new a("安装包拷贝失败", e5, (byte) 0);
            }
        } finally {
            stringBuffer.append("copyApk cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(a1.i.f136b);
        }
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x023b: MOVE (r9 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:572), block:B:92:0x023b */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x023f: MOVE (r9 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:576), block:B:88:0x023f */
    public static boolean h(java.io.File r21, java.lang.String r22, int r23, java.lang.StringBuffer r24) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.plugin.b.h(java.io.File, java.lang.String, int, java.lang.StringBuffer):boolean");
    }

    private static void a(String str, int i5, @NonNull String str2, int i6, long j5, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.putOpt("status_code", com.bytedance.pangle.log.b.a(Integer.valueOf(i5)));
            jSONObject.putOpt("plugin_package_name", com.bytedance.pangle.log.b.a(str2));
            jSONObject.putOpt("version_code", com.bytedance.pangle.log.b.a(Integer.valueOf(i6)));
            jSONObject3.putOpt("duration", Integer.valueOf(com.bytedance.pangle.log.b.b(Long.valueOf(j5))));
            jSONObject2.putOpt(CrashHianalyticsData.MESSAGE, com.bytedance.pangle.log.b.a(str3));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.bytedance.pangle.c.b.a().a(str, jSONObject, jSONObject3, jSONObject2);
    }

    static /* synthetic */ void a(File file, String str, int i5, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                if (com.bytedance.pangle.g.e.a(file.getAbsolutePath(), str)) {
                } else {
                    throw new RuntimeException("安装包签名校验失败[1]");
                }
            } catch (Exception e5) {
                a(com.bytedance.pangle.c.b.f4275f, b.a.f4303u, str, i5, -1L, null);
                f4483a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -3, str, i5, e5);
                throw new a(e5.getMessage(), e5, (byte) 0);
            }
        } finally {
            stringBuffer.append("checkSignature cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(a1.i.f136b);
        }
    }

    static /* synthetic */ void a(String str, String str2, int i5, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        byte b5 = 0;
        int a5 = new com.bytedance.pangle.res.a.c().a(new File(str), false, sb);
        stringBuffer.append(a5 == 100 ? "modifyRes" : "noModifyRes");
        stringBuffer.append(" cost:");
        stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
        stringBuffer.append(a1.i.f136b);
        if (a5 == 100 || a5 == 200) {
            return;
        }
        String sb2 = sb.toString();
        a(com.bytedance.pangle.c.b.f4275f, b.a.B, str2, i5, -1L, sb2);
        f4483a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -2, str2, i5, null);
        throw new a("modifyRes failed. result = " + a5 + ", errorLog = " + sb2, b5);
    }

    static /* synthetic */ void a(String str, int i5, Map map, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                com.bytedance.pangle.d.b.a(new File(com.bytedance.pangle.d.c.b(str, i5)), new File(com.bytedance.pangle.d.c.d(str, i5)), str, (Map<String, List<ZipEntry>>) map);
            } catch (Exception e5) {
                a(com.bytedance.pangle.c.b.f4275f, b.a.f4306x, str, i5, -1L, com.bytedance.pangle.log.b.a((Object) e5));
                f4483a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -7, str, i5, e5);
                throw new a("安装包动态库拷贝失败", e5, (byte) 0);
            }
        } finally {
            stringBuffer.append("copySo cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(a1.i.f136b);
        }
    }

    static /* synthetic */ boolean a(String str, int i5, boolean z4, StringBuffer stringBuffer) {
        int b5 = l.a().b(str, i5);
        boolean z5 = (b5 & 1) != 0;
        boolean z6 = (b5 & 2) != 0;
        if (!z5 && !z6) {
            stringBuffer.append("removeEntry skip;");
            return false;
        }
        boolean z7 = z4 && z5;
        String b6 = com.bytedance.pangle.d.c.b(str, i5);
        long currentTimeMillis = System.currentTimeMillis();
        boolean a5 = com.bytedance.pangle.util.b.b.a(b6, z7, z6, str, i5, 1);
        stringBuffer.append("removeEntry cost:");
        stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
        stringBuffer.append(a1.i.f136b);
        return a5;
    }

    static /* synthetic */ void a(String str, int i5) {
        byte b5 = 0;
        try {
            if (com.bytedance.pangle.util.i.e() || com.bytedance.pangle.util.i.g()) {
                l.a().b(str, i5, false);
                com.bytedance.pangle.e.b.a(Zeus.getAppApplication()).edit().putInt(str, i5).apply();
                f.a();
            }
        } catch (Exception e5) {
            a(com.bytedance.pangle.c.b.f4275f, b.a.f4308z, str, i5, -1L, null);
            throw new a("dexOpt2失败", e5, b5);
        }
    }
}
