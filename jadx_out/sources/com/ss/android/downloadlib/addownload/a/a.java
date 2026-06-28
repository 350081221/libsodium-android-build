package com.ss.android.downloadlib.addownload.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.l;
import com.ss.android.download.api.model.b;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.b.f;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.downloadlib.i;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9584a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static a f9585b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.b.a> f9586c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9587d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f9588e;

    /* renamed from: f, reason: collision with root package name */
    private b f9589f;

    /* renamed from: com.ss.android.downloadlib.addownload.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0183a {
        void a();
    }

    private a() {
        b bVar = new b();
        this.f9589f = bVar;
        this.f9586c = bVar.a("sp_ad_install_back_dialog", "key_uninstalled_list");
    }

    public static a a() {
        if (f9585b == null) {
            f9585b = new a();
        }
        return f9585b;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f9588e = "";
        } else if (TextUtils.equals(this.f9588e, str)) {
            this.f9588e = "";
        }
    }

    private boolean a(Activity activity, DownloadInfo downloadInfo, boolean z4, InterfaceC0183a interfaceC0183a) {
        if (downloadInfo == null) {
            try {
                if (this.f9586c.isEmpty()) {
                    return false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (activity != null && !activity.isFinishing()) {
            boolean z5 = true;
            if (downloadInfo != null && this.f9586c.isEmpty()) {
                a(activity, new com.ss.android.downloadlib.addownload.b.a(downloadInfo.getId(), 0L, 0L, downloadInfo.getPackageName(), downloadInfo.getTitle(), null, downloadInfo.getTargetFilePath()), z4, interfaceC0183a);
                return true;
            }
            long lastModified = downloadInfo != null ? new File(downloadInfo.getTargetFilePath()).lastModified() : 0L;
            CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.b.a> copyOnWriteArrayList = this.f9586c;
            ListIterator<com.ss.android.downloadlib.addownload.b.a> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    z5 = false;
                    break;
                }
                com.ss.android.downloadlib.addownload.b.a previous = listIterator.previous();
                if (previous != null && !m.e(k.a(), previous.f9626d) && m.a(previous.f9629g)) {
                    if (new File(previous.f9629g).lastModified() >= lastModified) {
                        a(activity, previous, z4, interfaceC0183a);
                    } else {
                        a(activity, new com.ss.android.downloadlib.addownload.b.a(downloadInfo.getId(), 0L, 0L, downloadInfo.getPackageName(), downloadInfo.getTitle(), null, downloadInfo.getTargetFilePath()), z4, interfaceC0183a);
                    }
                }
            }
            com.ss.android.downloadlib.g.k.a(f9584a, "tryShowInstallDialog isShow:" + z5, null);
            return z5;
        }
        return false;
    }

    @MainThread
    public boolean a(Activity activity, boolean z4, InterfaceC0183a interfaceC0183a) {
        if (k.j().optInt("disable_install_app_dialog") == 1 || this.f9587d) {
            return false;
        }
        return a(activity, a(activity), z4, interfaceC0183a);
    }

    public void a(Context context, com.ss.android.downloadlib.addownload.b.a aVar, boolean z4, InterfaceC0183a interfaceC0183a) {
        this.f9586c.clear();
        a(context, aVar, interfaceC0183a, z4);
        this.f9587d = true;
        i.a(context).c();
        this.f9589f.b("sp_ad_install_back_dialog", "key_uninstalled_list");
        com.ss.android.downloadlib.g.k.a(f9584a, "tryShowInstallDialog isShow:true", null);
    }

    public DownloadInfo a(Context context) {
        long b5;
        List<DownloadInfo> successedDownloadInfosWithMimeType;
        DownloadInfo downloadInfo = null;
        try {
            b5 = i.a(context).b();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (k.j().optInt("enable_miniapp_dialog", 0) != 0 && (successedDownloadInfosWithMimeType = Downloader.getInstance(context).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive")) != null && !successedDownloadInfosWithMimeType.isEmpty()) {
            long j5 = 0;
            for (DownloadInfo downloadInfo2 : successedDownloadInfosWithMimeType) {
                if (downloadInfo2 != null && !m.e(context, downloadInfo2.getPackageName()) && m.a(downloadInfo2.getTargetFilePath())) {
                    long lastModified = new File(downloadInfo2.getTargetFilePath()).lastModified();
                    if (lastModified >= b5 && downloadInfo2.getExtra() != null) {
                        try {
                            if (new JSONObject(downloadInfo2.getExtra()).has("isMiniApp") && (j5 == 0 || lastModified > j5)) {
                                downloadInfo = downloadInfo2;
                                j5 = lastModified;
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            }
            return downloadInfo;
        }
        return null;
    }

    public void a(long j5, long j6, long j7, String str, String str2, String str3, String str4) {
        for (int i5 = 0; i5 < this.f9586c.size(); i5++) {
            com.ss.android.downloadlib.addownload.b.a aVar = this.f9586c.get(i5);
            if (aVar != null && aVar.f9624b == j6) {
                this.f9586c.set(i5, new com.ss.android.downloadlib.addownload.b.a(j5, j6, j7, str, str2, str3, str4));
                this.f9589f.a("sp_ad_install_back_dialog", "key_uninstalled_list", this.f9586c);
                return;
            }
        }
        this.f9586c.add(new com.ss.android.downloadlib.addownload.b.a(j5, j6, j7, str, str2, str3, str4));
        this.f9589f.a("sp_ad_install_back_dialog", "key_uninstalled_list", this.f9586c);
    }

    private void a(final Context context, final com.ss.android.downloadlib.addownload.b.a aVar, final InterfaceC0183a interfaceC0183a, boolean z4) {
        final com.ss.android.downloadad.api.a.b d5 = f.a().d(aVar.f9624b);
        if (d5 == null) {
            com.ss.android.downloadlib.e.c.a().a("showBackInstallDialog nativeModel null");
            return;
        }
        l d6 = k.d();
        b.a a5 = new b.a(context).a(z4 ? "应用安装确认" : "退出确认");
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(aVar.f9627e) ? "刚刚下载的应用" : aVar.f9627e;
        d6.b(a5.b(String.format("%1$s下载完成，是否立即安装？", objArr)).c("立即安装").d(z4 ? "暂不安装" : String.format("退出%1$s", context.getResources().getString(context.getApplicationContext().getApplicationInfo().labelRes))).a(false).a(m.a(context, aVar.f9629g)).a(new b.InterfaceC0178b() { // from class: com.ss.android.downloadlib.addownload.a.a.1
            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void a(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.d.a.a().b("backdialog_install", d5);
                com.ss.android.socialbase.appdownloader.d.a(context, (int) aVar.f9623a);
                dialogInterface.dismiss();
            }

            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void b(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.d.a.a().b("backdialog_exit", d5);
                InterfaceC0183a interfaceC0183a2 = interfaceC0183a;
                if (interfaceC0183a2 != null) {
                    interfaceC0183a2.a();
                }
                a.this.b("");
                dialogInterface.dismiss();
            }

            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void c(DialogInterface dialogInterface) {
                a.this.b("");
            }
        }).a(1).a());
        com.ss.android.downloadlib.d.a.a().b("backdialog_show", d5);
        this.f9588e = aVar.f9626d;
    }

    public boolean a(String str) {
        return TextUtils.equals(this.f9588e, str);
    }

    public void a(com.ss.android.downloadad.api.a.b bVar) {
        if (k.j().optInt("enable_open_app_dialog", 0) == 1 && !bVar.Z() && bVar.q() && Build.VERSION.SDK_INT < 34) {
            bVar.k(true);
            TTDelegateActivity.a(bVar);
        }
    }
}
