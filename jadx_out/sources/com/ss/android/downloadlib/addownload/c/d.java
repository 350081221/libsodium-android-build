package com.ss.android.downloadlib.addownload.c;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f9690a;

    /* renamed from: b, reason: collision with root package name */
    private long f9691b = 0;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, e> f9692c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, Integer> f9693d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private List<String> f9694e = new CopyOnWriteArrayList();

    public static d a() {
        if (f9690a == null) {
            synchronized (d.class) {
                if (f9690a == null) {
                    f9690a = new d();
                }
            }
        }
        return f9690a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b() {
        return this.f9691b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f9691b = System.currentTimeMillis();
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (this.f9693d == null) {
            this.f9693d = new HashMap<>();
        }
        if (this.f9693d.containsKey(str)) {
            return this.f9693d.get(str).intValue();
        }
        return 0;
    }

    public void a(String str, e eVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f9692c.put(str, eVar);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f9692c.remove(str);
    }

    @WorkerThread
    public static void a(com.ss.android.downloadad.api.a.b bVar) {
        DownloadInfo downloadInfo;
        if (bVar == null || bVar.b() <= 0 || (downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(bVar.s())) == null) {
            return;
        }
        a(downloadInfo);
    }

    @WorkerThread
    public static void a(DownloadInfo downloadInfo) {
        if (downloadInfo == null || com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("delete_file_after_install", 0) == 0) {
            return;
        }
        try {
            String str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                file.delete();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
