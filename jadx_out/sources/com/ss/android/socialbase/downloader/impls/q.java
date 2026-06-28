package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.s;

/* loaded from: classes3.dex */
public class q implements s {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f11044a;

    public q(String str) {
        this.f11044a = a(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.s
    public long a(int i5, int i6) {
        long[] jArr = this.f11044a;
        if (jArr == null || jArr.length <= 0) {
            return 0L;
        }
        int i7 = i5 - 1;
        if (i7 < 0) {
            i7 = 0;
        }
        if (i7 > jArr.length - 1) {
            i7 = jArr.length - 1;
        }
        return jArr[i7];
    }

    private long[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length == 0) {
                return null;
            }
            long[] jArr = new long[split.length];
            for (int i5 = 0; i5 < split.length; i5++) {
                jArr[i5] = Long.parseLong(split[i5]);
            }
            return jArr;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
