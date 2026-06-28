package t2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.remote.VAppInstallerResult;
import com.orhanobut.logger.j;
import com.yuanqi.group.home.models.AppInfoLite;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jdeferred.p;

/* loaded from: classes3.dex */
public class f implements a {

    /* renamed from: c, reason: collision with root package name */
    private static final Collator f22472c = Collator.getInstance(Locale.CHINA);

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f22473d = Arrays.asList(".", "Download", "HonorBrowser", "backups/apps", "wandoujia/app", "tencent/tassistant/apk", "BaiduAsa9103056", "360Download", "pp/downloader", "pp/downloader/apk", "pp/downloader/silent/apk");

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f22474a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Context f22475b;

    public f(Context context) {
        this.f22475b = context;
    }

    private List<com.yuanqi.group.home.models.c> k(Context context, List<PackageInfo> list, boolean z4, boolean z5) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList(list.size());
        for (PackageInfo packageInfo : list) {
            if (!StubManifest.isHostPackageName(packageInfo.packageName) && (!z4 || !m(packageInfo))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if ((applicationInfo.flags & 4) != 0) {
                    String str = applicationInfo.publicSourceDir;
                    if (str == null) {
                        str = applicationInfo.sourceDir;
                    }
                    if (str != null) {
                        InstalledAppInfo installedAppInfo = VirtualCore.get().getInstalledAppInfo(packageInfo.packageName, 0);
                        com.yuanqi.group.home.models.c cVar = new com.yuanqi.group.home.models.c();
                        cVar.f14012a = packageInfo.packageName;
                        cVar.f14014c = z4;
                        cVar.f14013b = str;
                        cVar.f14015d = applicationInfo.loadIcon(packageManager);
                        cVar.f14016e = applicationInfo.loadLabel(packageManager);
                        cVar.f14019h = packageInfo.applicationInfo.targetSdkVersion;
                        cVar.f14020i = packageInfo.requestedPermissions;
                        if (installedAppInfo != null) {
                            cVar.f14013b = installedAppInfo.getApkPath();
                            cVar.f14018g = installedAppInfo.getInstalledUsers().length;
                        }
                        arrayList.add(cVar);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: t2.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int n5;
                n5 = f.n((com.yuanqi.group.home.models.c) obj, (com.yuanqi.group.home.models.c) obj2);
                return n5;
            }
        });
        return arrayList;
    }

    private List<PackageInfo> l(Context context, File file, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (String str : list) {
            j.e(str, new Object[0]);
            File[] listFiles = new File(file, str).listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().toLowerCase().endsWith(".apk")) {
                        PackageInfo packageInfo = null;
                        try {
                            packageInfo = context.getPackageManager().getPackageArchiveInfo(file2.getAbsolutePath(), 4096);
                            packageInfo.applicationInfo.sourceDir = file2.getAbsolutePath();
                            packageInfo.applicationInfo.publicSourceDir = file2.getAbsolutePath();
                        } catch (Exception unused) {
                        }
                        if (packageInfo != null) {
                            arrayList.add(packageInfo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static boolean m(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo.uid >= 10000) {
            int i5 = applicationInfo.flags;
            if ((i5 & 1) == 0 && (i5 & 128) == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int n(com.yuanqi.group.home.models.c cVar, com.yuanqi.group.home.models.c cVar2) {
        int compare = Integer.compare(cVar.f14018g, cVar2.f14018g);
        if (compare != 0) {
            return -compare;
        }
        return f22472c.compare(cVar.f14016e, cVar2.f14016e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o(Context context) throws Exception {
        return k(context, context.getPackageManager().getInstalledPackages(4096), true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List p(Context context, List list) throws Exception {
        return k(context, list, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (InstalledAppInfo installedAppInfo : VirtualCore.get().getInstalledApps(0)) {
            if (VirtualCore.get().isPackageLaunchable(installedAppInfo.packageName) && !installedAppInfo.packageName.equals(GmsSupport.VENDING_PKG) && !installedAppInfo.packageName.equals("com.android.settings")) {
                com.yuanqi.group.home.models.i iVar = new com.yuanqi.group.home.models.i(this.f22475b, installedAppInfo);
                if (VirtualCore.get().isAppInstalledAsUser(0, installedAppInfo.packageName)) {
                    arrayList.add(iVar);
                }
                this.f22474a.put(installedAppInfo.packageName, iVar.f14034b);
                for (int i5 : installedAppInfo.getInstalledUsers()) {
                    if (i5 != 0) {
                        arrayList.add(new com.yuanqi.group.home.models.h(iVar, i5));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // t2.a
    public String a(String str) {
        String str2 = this.f22474a.get(str);
        return str2 == null ? str : str2;
    }

    @Override // t2.a
    public p<List<com.yuanqi.group.home.models.c>, Throwable, Void> b(final Context context) {
        return com.yuanqi.group.abs.ui.b.a().h(new Callable() { // from class: t2.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List o5;
                o5 = f.this.o(context);
                return o5;
            }
        });
    }

    @Override // t2.a
    public boolean c(String str, int i5) {
        return VirtualCore.get().uninstallPackageAsUser(str, i5);
    }

    @Override // t2.a
    public VAppInstallerResult d(AppInfoLite appInfoLite) {
        return VirtualCore.get().installPackage(appInfoLite.a(), new VAppInstallerParams());
    }

    @Override // t2.a
    public p<List<com.yuanqi.group.home.models.c>, Throwable, Void> e(final Context context, File file) {
        final ArrayList arrayList = new ArrayList();
        r(context, file, arrayList);
        return com.yuanqi.group.abs.ui.b.a().h(new Callable() { // from class: t2.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List p5;
                p5 = f.this.p(context, arrayList);
                return p5;
            }
        });
    }

    @Override // t2.a
    public p<List<com.yuanqi.group.home.models.b>, Throwable, Void> f() {
        return com.yuanqi.group.abs.ui.b.a().h(new Callable() { // from class: t2.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List q5;
                q5 = f.this.q();
                return q5;
            }
        });
    }

    public List<PackageInfo> r(Context context, File file, List<PackageInfo> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File[] listFiles = ((File) linkedList.poll()).listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        linkedList.add(file2);
                    } else if (file2.getName().endsWith(".apk")) {
                        try {
                            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file2.getAbsolutePath(), 4096);
                            if (packageArchiveInfo != null) {
                                packageArchiveInfo.applicationInfo.sourceDir = file2.getAbsolutePath();
                                packageArchiveInfo.applicationInfo.publicSourceDir = file2.getAbsolutePath();
                                if (!com.yuanqi.group.utils.c.a(packageArchiveInfo.packageName)) {
                                    list.add(packageArchiveInfo);
                                }
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        }
        return list;
    }
}
