package com.ss.android.downloadlib.f;

import com.ss.android.socialbase.appdownloader.c.i;
import com.ss.android.socialbase.appdownloader.c.j;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class c implements j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f10054a;

    /* renamed from: b, reason: collision with root package name */
    private List<j> f10055b;

    private c() {
        ArrayList arrayList = new ArrayList();
        this.f10055b = arrayList;
        arrayList.add(new b());
        this.f10055b.add(new a());
    }

    public static c a() {
        if (f10054a == null) {
            synchronized (c.class) {
                if (f10054a == null) {
                    f10054a = new c();
                }
            }
        }
        return f10054a;
    }

    @Override // com.ss.android.socialbase.appdownloader.c.j
    public void a(DownloadInfo downloadInfo, i iVar) {
        if (downloadInfo != null && this.f10055b.size() != 0) {
            a(downloadInfo, 0, iVar);
        } else if (iVar != null) {
            iVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final DownloadInfo downloadInfo, final int i5, final i iVar) {
        if (i5 != this.f10055b.size() && i5 >= 0) {
            this.f10055b.get(i5).a(downloadInfo, new i() { // from class: com.ss.android.downloadlib.f.c.1
                @Override // com.ss.android.socialbase.appdownloader.c.i
                public void a() {
                    c.this.a(downloadInfo, i5 + 1, iVar);
                }
            });
        } else {
            iVar.a();
        }
    }
}
