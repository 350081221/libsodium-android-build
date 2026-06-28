package com.ss.android.downloadlib.addownload.d;

import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.n;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public class e implements g {
    @Override // com.ss.android.downloadlib.addownload.d.g
    public boolean a(com.ss.android.downloadad.api.a.b bVar, int i5, h hVar, com.ss.android.downloadlib.addownload.a.c cVar) {
        DownloadInfo b5;
        if (bVar == null) {
            return false;
        }
        if (!TextUtils.isEmpty(bVar.af())) {
            b5 = com.ss.android.downloadlib.i.a(com.ss.android.downloadlib.addownload.k.a()).a(bVar.af(), null, true);
        } else {
            b5 = com.ss.android.downloadlib.i.a(com.ss.android.downloadlib.addownload.k.a()).b(bVar.a());
        }
        return n.a(bVar, b5, i5, hVar, true, cVar);
    }
}
