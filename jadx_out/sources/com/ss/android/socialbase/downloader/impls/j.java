package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.s;
import com.tendcloud.tenddata.ab;

/* loaded from: classes3.dex */
public class j implements s {
    @Override // com.ss.android.socialbase.downloader.downloader.s
    public long a(int i5, int i6) {
        if (i5 == 1) {
            return a1.b.f90a;
        }
        if (i5 == 2) {
            return 15000L;
        }
        return i5 == 3 ? ab.aa : i5 > 3 ? 300000L : 0L;
    }
}
