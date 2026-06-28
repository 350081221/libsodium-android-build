package com.ss.android.downloadlib.addownload;

import android.content.Context;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;

/* loaded from: classes3.dex */
public interface g {
    g a(long j5);

    g a(IDownloadButtonClickListener iDownloadButtonClickListener);

    g a(OnItemClickListener onItemClickListener);

    g a(String str);

    void a();

    void a(boolean z4);

    boolean a(int i5);

    g b(int i5, DownloadStatusChangeListener downloadStatusChangeListener);

    g b(Context context);

    g b(DownloadController downloadController);

    g b(DownloadEventConfig downloadEventConfig);

    g b(DownloadModel downloadModel);

    void b(int i5);

    boolean b();

    long d();

    void h();
}
