package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.ak;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* loaded from: classes3.dex */
public interface m {
    int a(String str, String str2);

    List<DownloadInfo> a(String str);

    void a();

    void a(int i5);

    void a(int i5, int i6);

    void a(int i5, int i6, int i7, int i8);

    void a(int i5, int i6, int i7, long j5);

    void a(int i5, int i6, long j5);

    void a(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4);

    void a(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4, boolean z5);

    void a(int i5, long j5);

    void a(int i5, Notification notification);

    void a(int i5, z zVar);

    void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list);

    void a(int i5, boolean z4);

    void a(ak akVar);

    void a(DownloadTask downloadTask);

    void a(com.ss.android.socialbase.downloader.model.b bVar);

    void a(List<String> list);

    void a(boolean z4, boolean z5);

    boolean a(DownloadInfo downloadInfo);

    DownloadInfo b(String str, String str2);

    List<DownloadInfo> b(String str);

    void b(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4);

    void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list);

    void b(int i5, boolean z4);

    void b(DownloadInfo downloadInfo);

    void b(DownloadTask downloadTask);

    void b(List<String> list);

    boolean b();

    boolean b(int i5);

    List<DownloadInfo> c(String str);

    void c(int i5);

    void c(int i5, boolean z4);

    boolean c();

    boolean c(DownloadInfo downloadInfo);

    List<DownloadInfo> d();

    List<DownloadInfo> d(String str);

    void d(int i5);

    long e(int i5);

    List<DownloadInfo> e(String str);

    void e();

    int f(int i5);

    boolean f();

    void g();

    boolean g(int i5);

    DownloadInfo h(int i5);

    boolean h();

    List<com.ss.android.socialbase.downloader.model.b> i(int i5);

    void j(int i5);

    void k(int i5);

    boolean l(int i5);

    int m(int i5);

    boolean n(int i5);

    void o(int i5);

    boolean p(int i5);

    z q(int i5);

    af r(int i5);

    IDownloadFileUriProvider s(int i5);
}
