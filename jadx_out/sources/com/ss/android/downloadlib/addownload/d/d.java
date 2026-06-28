package com.ss.android.downloadlib.addownload.d;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f9843a;

    /* renamed from: b, reason: collision with root package name */
    private List<g> f9844b;

    private d() {
        ArrayList arrayList = new ArrayList();
        this.f9844b = arrayList;
        arrayList.add(new e());
        this.f9844b.add(new b());
        this.f9844b.add(new c());
    }

    public static d a() {
        if (f9843a == null) {
            synchronized (k.class) {
                if (f9843a == null) {
                    f9843a = new d();
                }
            }
        }
        return f9843a;
    }

    public void a(com.ss.android.downloadad.api.a.b bVar, int i5, h hVar, com.ss.android.downloadlib.addownload.a.c cVar) {
        DownloadInfo b5;
        List<g> list = this.f9844b;
        if (list == null || list.size() == 0 || bVar == null) {
            hVar.a(bVar);
        }
        if (!TextUtils.isEmpty(bVar.af())) {
            b5 = com.ss.android.downloadlib.i.a(com.ss.android.downloadlib.addownload.k.a()).a(bVar.af(), null, true);
        } else {
            b5 = com.ss.android.downloadlib.i.a(com.ss.android.downloadlib.addownload.k.a()).b(bVar.a());
        }
        if (b5 == null) {
            b5 = Downloader.getInstance(com.ss.android.downloadlib.addownload.k.a()).getDownloadInfo(bVar.s());
        }
        if (b5 != null && "application/vnd.android.package-archive".equals(b5.getMimeType())) {
            if (new j().a(bVar, i5, hVar)) {
                return;
            }
            Iterator<g> it = this.f9844b.iterator();
            while (it.hasNext()) {
                if (it.next().a(bVar, i5, hVar, cVar)) {
                    return;
                }
            }
            hVar.a(bVar);
            return;
        }
        hVar.a(bVar);
    }
}
