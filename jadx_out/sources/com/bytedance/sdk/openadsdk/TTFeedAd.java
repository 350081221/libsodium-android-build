package com.bytedance.sdk.openadsdk;

/* loaded from: classes2.dex */
public interface TTFeedAd extends TTNativeAd {

    /* loaded from: classes2.dex */
    public interface CustomizeVideo {
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

    /* loaded from: classes2.dex */
    public interface VideoAdListener {
        void onProgressUpdate(long j5, long j6);

        void onVideoAdComplete(TTFeedAd tTFeedAd);

        void onVideoAdContinuePlay(TTFeedAd tTFeedAd);

        void onVideoAdPaused(TTFeedAd tTFeedAd);

        void onVideoAdStartPlay(TTFeedAd tTFeedAd);

        void onVideoError(int i5, int i6);

        void onVideoLoad(TTFeedAd tTFeedAd);
    }

    /* loaded from: classes2.dex */
    public interface VideoRewardListener {
        void onFeedRewardCountDown(int i5);
    }

    int getAdViewHeight();

    int getAdViewWidth();

    CustomizeVideo getCustomVideo();

    double getVideoDuration();

    void setVideoAdListener(VideoAdListener videoAdListener);

    void setVideoRewardListener(VideoRewardListener videoRewardListener);
}
