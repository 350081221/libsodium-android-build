package com.ss.android.downloadlib.addownload.d;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static k f9849a;

    /* renamed from: b, reason: collision with root package name */
    private List<i> f9850b;

    private k() {
        ArrayList arrayList = new ArrayList();
        this.f9850b = arrayList;
        arrayList.add(new j());
        this.f9850b.add(new l());
        this.f9850b.add(new f());
        this.f9850b.add(new a());
    }

    public static k a() {
        if (f9849a == null) {
            synchronized (k.class) {
                if (f9849a == null) {
                    f9849a = new k();
                }
            }
        }
        return f9849a;
    }

    public void a(com.ss.android.downloadad.api.a.b bVar, int i5, h hVar) {
        DownloadInfo b5;
        List<i> list = this.f9850b;
        if (list != null && list.size() != 0 && bVar != null) {
            if (!TextUtils.isEmpty(bVar.af())) {
                b5 = com.ss.android.downloadlib.i.a((Context) null).a(bVar.af(), null, true);
            } else {
                b5 = com.ss.android.downloadlib.i.a((Context) null).b(bVar.a());
            }
            if (b5 != null && "application/vnd.android.package-archive".equals(b5.getMimeType())) {
                boolean z4 = com.ss.android.socialbase.downloader.g.a.a(bVar.s()).a("pause_optimise_switch", 0) == 1;
                for (i iVar : this.f9850b) {
                    if (z4 || (iVar instanceof l)) {
                        if (iVar.a(bVar, i5, hVar)) {
                            return;
                        }
                    }
                }
                hVar.a(bVar);
                return;
            }
            hVar.a(bVar);
            return;
        }
        hVar.a(bVar);
    }
}
