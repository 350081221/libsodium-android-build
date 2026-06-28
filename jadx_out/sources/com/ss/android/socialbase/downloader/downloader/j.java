package com.ss.android.socialbase.downloader.downloader;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface j {
    DownloadInfo a(int i5, int i6);

    DownloadInfo a(int i5, long j5);

    DownloadInfo a(int i5, long j5, String str, String str2);

    List<DownloadInfo> a(String str);

    void a(int i5, int i6, int i7, int i8);

    void a(int i5, int i6, int i7, long j5);

    void a(int i5, int i6, long j5);

    void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list);

    void a(com.ss.android.socialbase.downloader.model.b bVar);

    boolean a(int i5, Map<Long, com.ss.android.socialbase.downloader.f.i> map);

    boolean a(DownloadInfo downloadInfo);

    DownloadInfo b(int i5);

    DownloadInfo b(int i5, long j5);

    List<DownloadInfo> b();

    List<DownloadInfo> b(String str);

    void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list);

    void b(DownloadInfo downloadInfo);

    void b(com.ss.android.socialbase.downloader.model.b bVar);

    DownloadInfo c(int i5, long j5);

    List<com.ss.android.socialbase.downloader.model.b> c(int i5);

    List<DownloadInfo> c(String str);

    void c();

    DownloadInfo d(int i5, long j5);

    List<DownloadInfo> d(String str);

    void d(int i5);

    boolean d();

    boolean e();

    boolean e(int i5);

    boolean f(int i5);

    DownloadInfo g(int i5);

    DownloadInfo h(int i5);

    DownloadInfo i(int i5);

    DownloadInfo j(int i5);

    Map<Long, com.ss.android.socialbase.downloader.f.i> l(int i5);

    void m(int i5);

    List<com.ss.android.socialbase.downloader.f.i> n(int i5);
}
