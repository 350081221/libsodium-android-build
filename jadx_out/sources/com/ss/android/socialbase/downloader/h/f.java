package com.ss.android.socialbase.downloader.h;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.i;

/* loaded from: classes3.dex */
public interface f {
    com.ss.android.socialbase.downloader.exception.h a(BaseException baseException, long j5);

    com.ss.android.socialbase.downloader.exception.h a(com.ss.android.socialbase.downloader.model.b bVar, BaseException baseException, long j5);

    com.ss.android.socialbase.downloader.model.b a(int i5);

    void a(long j5) throws BaseException;

    void a(BaseException baseException, boolean z4);

    void a(b bVar);

    void a(com.ss.android.socialbase.downloader.network.g gVar);

    void a(String str, com.ss.android.socialbase.downloader.network.g gVar, long j5) throws BaseException, i;

    boolean a(BaseException baseException);

    void b(BaseException baseException);

    boolean b(long j5) throws BaseException;

    void c(BaseException baseException);
}
