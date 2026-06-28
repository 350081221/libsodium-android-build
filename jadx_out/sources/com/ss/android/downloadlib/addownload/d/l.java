package com.ss.android.downloadlib.addownload.d;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.n;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public class l implements i {
    @Override // com.ss.android.downloadlib.addownload.d.i
    public boolean a(com.ss.android.downloadad.api.a.b bVar, int i5, h hVar) {
        DownloadInfo b5;
        if (bVar == null) {
            return false;
        }
        if (!TextUtils.isEmpty(bVar.af())) {
            b5 = com.ss.android.downloadlib.i.a((Context) null).a(bVar.af(), null, true);
        } else {
            b5 = com.ss.android.downloadlib.i.a((Context) null).b(bVar.a());
        }
        return n.a(bVar, b5, i5, hVar, false, null);
    }
}
