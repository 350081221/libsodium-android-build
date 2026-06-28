package com.bytedance.sdk.openadsdk.mediation.bridge;

/* loaded from: classes2.dex */
public interface IMediationCustomizeVideo {
    String getVideoUrl();

    void reportVideoAutoStart();

    void reportVideoBreak(long j5);

    void reportVideoContinue(long j5);

    void reportVideoError(long j5, int i5, int i6);

    void reportVideoFinish();

    void reportVideoPause(long j5);

    void reportVideoStart();

    void reportVideoStartError(int i5, int i6);
}
