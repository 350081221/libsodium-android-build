package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f9619a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f9620b = null;

    public static b a() {
        if (f9619a == null) {
            synchronized (b.class) {
                if (f9619a == null) {
                    f9619a = new b();
                }
            }
        }
        return f9619a;
    }

    public boolean b() {
        return k.j().optInt("forbid_invalidte_download_file_install", 0) == 1;
    }

    public void a(Context context, DownloadInfo downloadInfo) {
        if (b() && downloadInfo != null) {
            try {
                File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                if (file.isFile() && file.exists()) {
                    file.delete();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (this.f9620b == null) {
                this.f9620b = new Handler(Looper.getMainLooper());
            }
            final String url = downloadInfo.getUrl();
            Downloader.getInstance(context).clearDownloadData(downloadInfo.getId());
            this.f9620b.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.b.1
                @Override // java.lang.Runnable
                public void run() {
                    k.d().a(3, k.a(), null, "下载失败，请重试！", null, 0);
                    e a5 = com.ss.android.downloadlib.g.a().a(url);
                    if (a5 != null) {
                        a5.g();
                    }
                }
            });
        }
    }
}
