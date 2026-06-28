package com.bytedance.pangle.download;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public interface IZeusDownloadListener {
    void onFailed(Throwable th, int i5, String str);

    void onProgress(long j5, long j6);

    void onStart();

    void onSuccess(String str, String str2, long j5);
}
