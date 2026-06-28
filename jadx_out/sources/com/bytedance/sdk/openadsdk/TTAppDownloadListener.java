package com.bytedance.sdk.openadsdk;

/* loaded from: classes2.dex */
public interface TTAppDownloadListener {
    void onDownloadActive(long j5, long j6, String str, String str2);

    void onDownloadFailed(long j5, long j6, String str, String str2);

    void onDownloadFinished(long j5, String str, String str2);

    void onDownloadPaused(long j5, long j6, String str, String str2);

    void onIdle();

    void onInstalled(String str, String str2);
}
