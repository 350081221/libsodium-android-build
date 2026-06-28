package k1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f19052a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f19053b;

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f19054c;

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f19055d;

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f19056e;

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f19057f;

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f19058g;

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f19059h;

    /* renamed from: i, reason: collision with root package name */
    private static final List<String> f19060i;

    static {
        ArrayList arrayList = new ArrayList();
        f19052a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f19053b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        f19054c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        f19055d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        f19056e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        f19057f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        f19058g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        f19059h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        f19060i = arrayList9;
        arrayList.add("onRewardVideoAdLoad");
        arrayList.add("onRewardVideoLoadFail");
        arrayList.add("onRewardVideoCached");
        arrayList.add("onRewardedAdShow");
        arrayList.add("onRewardedAdShowFail");
        arrayList.add("onRewardClick");
        arrayList.add("onVideoComplete");
        arrayList.add("onRewardVerify");
        arrayList.add("onRewardedAdClosed");
        arrayList.add("onVideoError");
        arrayList.add("onSkippedVideo");
        arrayList2.add("onFullVideoAdLoad");
        arrayList2.add("onFullVideoLoadFail");
        arrayList2.add("onFullVideoCached");
        arrayList2.add("onFullVideoAdShow");
        arrayList2.add("onFullVideoAdShowFail");
        arrayList2.add("onFullVideoAdClick");
        arrayList2.add("onVideoComplete");
        arrayList2.add("onSkippedVideo");
        arrayList2.add("onFullVideoAdClosed");
        arrayList2.add("onVideoError");
        arrayList2.add("onRewardVerify");
        arrayList3.add("onAdLoaded");
        arrayList3.add("onAdFailedToLoad");
        arrayList3.add("onAdShow");
        arrayList3.add("onAdShowFail");
        arrayList3.add("onAdClicked");
        arrayList3.add("onAdClosed");
        arrayList4.add("onInterstitialLoad");
        arrayList4.add("onInterstitialLoadFail");
        arrayList4.add("onInterstitialShow");
        arrayList4.add("onInterstitialShowFail");
        arrayList4.add("onInterstitialAdClick");
        arrayList4.add("onInterstitialClosed");
        arrayList4.add("onAdOpened");
        arrayList4.add("onAdLeftApplication");
        arrayList5.add("onSplashAdLoadSuccess");
        arrayList5.add("onSplashAdLoadFail");
        arrayList5.add("onAdLoadTimeout");
        arrayList5.add("onAdClicked");
        arrayList5.add("onAdShow");
        arrayList5.add("onAdShowFail");
        arrayList5.add("onAdSkip");
        arrayList5.add("onAdDismiss");
        arrayList6.add("onAdLoaded");
        arrayList6.add("onAdLoadedFial");
        arrayList6.add("onAdShow");
        arrayList6.add("onAdClick");
        arrayList6.add("onVideoStart");
        arrayList6.add("onVideoPause");
        arrayList6.add("onVideoResume");
        arrayList6.add("onVideoCompleted");
        arrayList6.add("onVideoError");
        arrayList7.add("onAdLoaded");
        arrayList7.add("onAdLoadedFial");
        arrayList7.add("onAdShow");
        arrayList7.add("onAdClick");
        arrayList7.add("onVideoStart");
        arrayList7.add("onVideoPause");
        arrayList7.add("onVideoResume");
        arrayList7.add("onVideoCompleted");
        arrayList7.add("onVideoError");
        arrayList7.add("onRenderSuccess");
        arrayList7.add("onRenderFail");
        arrayList8.add("onInterstitialFullAdLoad");
        arrayList8.add("onInterstitialFullLoadFail");
        arrayList8.add("onInterstitialFullCached");
        arrayList8.add("onInterstitialFullShow");
        arrayList8.add("onInterstitialFullShowFail");
        arrayList8.add("onInterstitialFullClick");
        arrayList8.add("onInterstitialFullClosed");
        arrayList8.add("onVideoComplete");
        arrayList8.add("onVideoError");
        arrayList8.add("onSkippedVideo");
        arrayList8.add("onAdOpened");
        arrayList8.add("onAdLeftApplication");
        arrayList8.add("onRewardVerify");
        arrayList9.add("onAdLoadSuccess");
        arrayList9.add("onAdLoadFail");
        arrayList9.add("onAdShow");
        arrayList9.add("onAdClick");
        arrayList9.add("onVideoStart");
        arrayList9.add("onVideoPause");
        arrayList9.add("onVideoResume");
        arrayList9.add("onVideoCompleted");
        arrayList9.add("onVideoError");
        arrayList9.add("onRenderSuccess");
        arrayList9.add("onRenderFail");
    }

    public static List<j1.b> a(int i5, int i6) {
        List<String> b5 = b(i5, i6);
        if (b5 != null && b5.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : b5) {
                j1.b bVar = new j1.b();
                bVar.a(str);
                bVar.a(false);
                arrayList.add(bVar);
            }
            return arrayList;
        }
        return null;
    }

    private static List<String> b(int i5, int i6) {
        switch (i5) {
            case 1:
                return f19054c;
            case 2:
                return f19055d;
            case 3:
                return f19056e;
            case 4:
            case 6:
            default:
                return null;
            case 5:
                return f19058g;
            case 7:
                return f19052a;
            case 8:
                return f19053b;
            case 9:
                return f19060i;
            case 10:
                return f19059h;
        }
    }
}
