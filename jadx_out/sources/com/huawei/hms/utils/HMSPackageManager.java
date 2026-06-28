package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z.c;

/* loaded from: classes3.dex */
public class HMSPackageManager {

    /* renamed from: l, reason: collision with root package name */
    public static HMSPackageManager f8829l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f8830m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f8831n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final Object f8832o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f8833a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageManagerHelper f8834b;

    /* renamed from: c, reason: collision with root package name */
    public String f8835c;

    /* renamed from: d, reason: collision with root package name */
    public String f8836d;

    /* renamed from: e, reason: collision with root package name */
    public int f8837e;

    /* renamed from: f, reason: collision with root package name */
    public String f8838f;

    /* renamed from: g, reason: collision with root package name */
    public String f8839g;

    /* renamed from: h, reason: collision with root package name */
    public String f8840h;

    /* renamed from: i, reason: collision with root package name */
    public int f8841i;

    /* renamed from: j, reason: collision with root package name */
    public int f8842j;

    /* renamed from: k, reason: collision with root package name */
    public long f8843k;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            Iterator<ResolveInfo> it = HMSPackageManager.this.f8833a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128).iterator();
            while (it.hasNext()) {
                if ("com.huawei.hwid".equals(it.next().serviceInfo.applicationInfo.packageName)) {
                    HMSPackageManager.this.c();
                }
            }
            HMSLog.i("HMSPackageManager", "quit asyncOnceCheckMDMState");
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public String f8845a;

        /* renamed from: b, reason: collision with root package name */
        public String f8846b;

        /* renamed from: c, reason: collision with root package name */
        public String f8847c;

        /* renamed from: d, reason: collision with root package name */
        public String f8848d;

        /* renamed from: e, reason: collision with root package name */
        public String f8849e;

        /* renamed from: f, reason: collision with root package name */
        public Long f8850f;

        public b(String str, String str2, String str3, String str4, String str5, long j5) {
            this.f8845a = str;
            this.f8846b = str2;
            this.f8847c = str3;
            this.f8848d = str4;
            this.f8849e = str5;
            this.f8850f = Long.valueOf(j5);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (TextUtils.equals(this.f8849e, bVar.f8849e)) {
                return this.f8850f.compareTo(bVar.f8850f);
            }
            return this.f8849e.compareTo(bVar.f8849e);
        }
    }

    public HMSPackageManager(Context context) {
        this.f8833a = context;
        this.f8834b = new PackageManagerHelper(context);
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f8830m) {
            if (f8829l == null) {
                if (context.getApplicationContext() != null) {
                    f8829l = new HMSPackageManager(context.getApplicationContext());
                } else {
                    f8829l = new HMSPackageManager(context);
                }
                f8829l.j();
                f8829l.a();
            }
        }
        return f8829l;
    }

    public final int c() {
        boolean z4;
        synchronized (f8832o) {
            HMSLog.i("HMSPackageManager", "enter checkHmsIsSpoof");
            long packageFirstInstallTime = this.f8834b.getPackageFirstInstallTime("com.huawei.hwid");
            int i5 = 1;
            if (this.f8842j != 3 && this.f8843k == packageFirstInstallTime) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + a(this.f8842j));
                return this.f8842j;
            }
            if (b()) {
                i5 = 2;
            }
            this.f8842j = i5;
            this.f8843k = this.f8834b.getPackageFirstInstallTime("com.huawei.hwid");
            HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof state: " + a(this.f8842j));
            return this.f8842j;
        }
    }

    public final void d() {
        synchronized (f8831n) {
            this.f8838f = null;
            this.f8839g = null;
            this.f8840h = null;
            this.f8841i = 0;
        }
    }

    public final void e() {
        synchronized (f8831n) {
            this.f8835c = null;
            this.f8836d = null;
            this.f8837e = 0;
        }
    }

    public final Pair<String, String> f() {
        List<ResolveInfo> queryIntentServices = this.f8833a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
        if (queryIntentServices.size() == 0) {
            return null;
        }
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            String str = serviceInfo.applicationInfo.packageName;
            Bundle bundle = serviceInfo.metaData;
            if (bundle == null) {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for metadata is null");
            } else if (!bundle.containsKey("hms_app_signer")) {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for no signer");
            } else if (!bundle.containsKey("hms_app_cert_chain")) {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for no cert chain");
            } else {
                String packageSignature = this.f8834b.getPackageSignature(str);
                if (!a(str + "&" + packageSignature, bundle.getString("hms_app_signer"), bundle.getString("hms_app_cert_chain"))) {
                    HMSLog.e("HMSPackageManager", "checkSigner failed");
                } else {
                    return new Pair<>(str, packageSignature);
                }
            }
        }
        return null;
    }

    public final Pair<String, String> g() {
        Pair<String, String> f5 = f();
        if (f5 != null) {
            HMSLog.i("HMSPackageManager", "aidlService pkgName: " + ((String) f5.first));
            this.f8840h = "com.huawei.hms.core.aidlservice";
            return f5;
        }
        ArrayList<b> h5 = h();
        if (h5 == null) {
            HMSLog.e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        Iterator<b> it = h5.iterator();
        while (it.hasNext()) {
            b next = it.next();
            String str = next.f8845a;
            String str2 = next.f8846b;
            String str3 = next.f8847c;
            String str4 = next.f8848d;
            String packageSignature = this.f8834b.getPackageSignature(str);
            if (a(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                HMSLog.i("HMSPackageManager", "result: " + str + ", " + str2 + ", " + next.f8850f);
                this.f8840h = PackageConstants.GENERAL_SERVICES_ACTION;
                b(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    public String getHMSFingerprint() {
        String str = this.f8836d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.f8835c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f8834b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                i();
            }
            String str2 = this.f8835c;
            if (str2 != null) {
                return str2;
            }
        }
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f8834b.getPackageStates("com.huawei.hwid"))) {
            "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(this.f8834b.getPackageSignature("com.huawei.hwid"));
        }
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f8838f;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f8834b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                j();
            }
            String str2 = this.f8838f;
            if (str2 != null) {
                return str2;
            }
            return "com.huawei.hwid";
        }
        return "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        boolean z4;
        synchronized (f8830m) {
            refresh();
            PackageManagerHelper.PackageStates packageStates = this.f8834b.getPackageStates(this.f8835c);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                e();
                return packageStates2;
            }
            boolean z5 = false;
            if ("com.huawei.hwid".equals(this.f8835c) && c() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            if (packageStates == PackageManagerHelper.PackageStates.ENABLED && !this.f8836d.equals(this.f8834b.getPackageSignature(this.f8835c))) {
                z5 = true;
            }
            if (z5) {
                return packageStates2;
            }
            return packageStates;
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        boolean z4;
        synchronized (f8830m) {
            refreshForMultiService();
            PackageManagerHelper.PackageStates packageStates = this.f8834b.getPackageStates(this.f8838f);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                d();
                return packageStates2;
            }
            boolean z5 = false;
            if ("com.huawei.hwid".equals(this.f8838f) && c() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            if (packageStates == PackageManagerHelper.PackageStates.ENABLED && !this.f8839g.equals(this.f8834b.getPackageSignature(this.f8838f))) {
                z5 = true;
            }
            if (z5) {
                return packageStates2;
            }
            return packageStates;
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.f8834b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.f8834b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        if (!TextUtils.isEmpty(this.f8840h)) {
            return this.f8840h;
        }
        return "com.huawei.hms.core.aidlservice";
    }

    public final ArrayList<b> h() {
        List<ResolveInfo> queryIntentServices = this.f8833a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ArrayList<b> arrayList = new ArrayList<>();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                long packageFirstInstallTime = this.f8834b.getPackageFirstInstallTime(str);
                Bundle bundle = resolveInfo.serviceInfo.metaData;
                if (bundle == null) {
                    HMSLog.e("HMSPackageManager", "package " + str + " get metaData is null");
                } else {
                    String a5 = a(bundle, "hms_app_checker_config");
                    String a6 = a(a5);
                    if (TextUtils.isEmpty(a6)) {
                        HMSLog.i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + a5);
                    } else {
                        String a7 = a(bundle, "hms_app_signer_v2");
                        if (TextUtils.isEmpty(a7)) {
                            HMSLog.i("HMSPackageManager", "get signerV2 fail.");
                        } else {
                            String a8 = a(bundle, "hms_app_cert_chain");
                            if (TextUtils.isEmpty(a8)) {
                                HMSLog.i("HMSPackageManager", "get certChain fail.");
                            } else {
                                HMSLog.i("HMSPackageManager", "add: " + str + ", " + a5 + ", " + packageFirstInstallTime);
                                arrayList.add(new b(str, a5, a7, a8, a6, packageFirstInstallTime));
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        }
        HMSLog.e("HMSPackageManager", "resolveInfoList is null or empty");
        return null;
    }

    public boolean hmsVerHigherThan(int i5) {
        if (this.f8837e >= i5 || !k()) {
            return true;
        }
        int packageVersionCode = this.f8834b.getPackageVersionCode(getHMSPackageName());
        this.f8837e = packageVersionCode;
        if (packageVersionCode >= i5) {
            return true;
        }
        return false;
    }

    public final void i() {
        synchronized (f8831n) {
            Pair<String, String> f5 = f();
            if (f5 == null) {
                HMSLog.e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                e();
                return;
            }
            this.f8835c = (String) f5.first;
            this.f8836d = (String) f5.second;
            this.f8837e = this.f8834b.getPackageVersionCode(getHMSPackageName());
            HMSLog.i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.f8835c + " version: " + this.f8837e);
        }
    }

    public boolean isApkNeedUpdate(int i5) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i5);
        if (hmsVersionCode < i5) {
            return true;
        }
        return false;
    }

    public boolean isApkUpdateNecessary(int i5) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i5);
        if (k() && hmsVersionCode < i5) {
            return true;
        }
        return false;
    }

    public final void j() {
        synchronized (f8831n) {
            Pair<String, String> g5 = g();
            if (g5 == null) {
                HMSLog.e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                d();
                return;
            }
            this.f8838f = (String) g5.first;
            this.f8839g = (String) g5.second;
            this.f8841i = this.f8834b.getPackageVersionCode(getHMSPackageNameForMultiService());
            HMSLog.i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f8838f + " version: " + this.f8841i);
        }
    }

    public final boolean k() {
        Bundle bundle;
        PackageManager packageManager = this.f8833a.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e5) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e5);
        }
        if (!TextUtils.isEmpty(this.f8840h) && (this.f8840h.equals(PackageConstants.GENERAL_SERVICES_ACTION) || this.f8840h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            HMSLog.i("HMSPackageManager", "action = " + this.f8840h + " exist");
            return false;
        }
        ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
            HMSLog.i("HMSPackageManager", "MinApkVersion is disabled.");
            return false;
        }
        return true;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f8835c) || TextUtils.isEmpty(this.f8836d)) {
            i();
        }
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f8838f) || TextUtils.isEmpty(this.f8839g)) {
            j();
        }
    }

    public void resetMultiServiceState() {
        d();
    }

    public final String a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            HMSLog.e("HMSPackageManager", "no " + str + " in metaData");
            return null;
        }
        return bundle.getString(str);
    }

    public final void b(String str) {
        String a5 = a(str);
        if (TextUtils.isEmpty(a5)) {
            return;
        }
        a5.substring(9);
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("priority=");
        if (indexOf == -1) {
            HMSLog.e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int indexOf2 = str.indexOf(",", indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(indexOf, indexOf2);
    }

    public final boolean b() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f8833a);
        if (hmsPath == null) {
            HMSLog.i("HMSPackageManager", "hmsPath is null!");
            return false;
        }
        if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        }
        if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.i("HMSPackageManager", "checkSignature fail!");
            return false;
        }
        if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        }
        HMSLog.i("HMSPackageManager", "verifyApkHash fail!");
        return false;
    }

    public final boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            List<X509Certificate> b5 = com.huawei.hms.device.a.b(str3);
            if (b5.size() == 0) {
                HMSLog.e("HMSPackageManager", "certChain is empty");
                return false;
            }
            if (!com.huawei.hms.device.a.a(com.huawei.hms.device.a.a(this.f8833a), b5)) {
                HMSLog.e("HMSPackageManager", "failed to verify cert chain");
                return false;
            }
            X509Certificate x509Certificate = b5.get(b5.size() - 1);
            if (!com.huawei.hms.device.a.a(x509Certificate, "Huawei CBG HMS")) {
                HMSLog.e("HMSPackageManager", "CN is invalid");
                return false;
            }
            if (!com.huawei.hms.device.a.b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                HMSLog.e("HMSPackageManager", "OU is invalid");
                return false;
            }
            if (com.huawei.hms.device.a.a(x509Certificate, str, str2)) {
                return true;
            }
            HMSLog.e("HMSPackageManager", "signature is invalid: " + str);
            return false;
        }
        HMSLog.e("HMSPackageManager", "args is invalid");
        return false;
    }

    public final void a() {
        new Thread(new a(), "Thread-asyncOnceCheckMDMState").start();
    }

    public static String a(int i5) {
        if (i5 == 1) {
            return "SPOOFED";
        }
        if (i5 == 2) {
            return c.f22689p;
        }
        if (i5 == 3) {
            return "UNCHECKED";
        }
        HMSLog.e("HMSPackageManager", "invalid checkMDM state: " + i5);
        return "";
    }
}
