package com.bytedance.sdk.openadsdk.c.a;

import android.util.Pair;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CSJAdError;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.g.a.a.a.f;
import com.bytedance.sdk.openadsdk.mediation.a.a.c;
import com.bytedance.sdk.openadsdk.mediation.a.a.d;
import com.bytedance.sdk.openadsdk.mediation.a.a.e;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdClassLoader;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.bytedance.sdk.openadsdk.c.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0128a implements TTAdNative {

        /* renamed from: a, reason: collision with root package name */
        private final a f4888a;

        protected C0128a(a aVar) {
            this.f4888a = aVar;
        }

        private ValueSet a(AdSlot adSlot) {
            com.bykv.a.a.a.a.b j5 = com.bykv.a.a.a.a.b.j(com.bytedance.sdk.openadsdk.c.a.c.b.b(adSlot));
            j5.g(8302, MediationAdClassLoader.getInstance());
            if (adSlot.getMediationAdSlot() != null) {
                j5.g(8260028, new e(adSlot.getMediationAdSlot()));
                j5.g(260027, adSlot.getMediationAdSlot());
            }
            return j5.k();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadBannerExpressAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            try {
                this.f4888a.i(a(adSlot), new com.bytedance.sdk.openadsdk.g.a.a.a.e(nativeExpressAdListener));
            } catch (Exception e5) {
                if (nativeExpressAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    nativeExpressAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadDrawFeedAd(AdSlot adSlot, TTAdNative.DrawFeedAdListener drawFeedAdListener) {
            try {
                this.f4888a.c(a(adSlot), new com.bytedance.sdk.openadsdk.mediation.a.a.b(drawFeedAdListener));
            } catch (Exception e5) {
                if (drawFeedAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    drawFeedAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadExpressDrawFeedAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            try {
                this.f4888a.h(a(adSlot), new com.bytedance.sdk.openadsdk.g.a.a.a.e(nativeExpressAdListener));
            } catch (Exception e5) {
                if (nativeExpressAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    nativeExpressAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadFeedAd(AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
            try {
                this.f4888a.a(a(adSlot), new c(feedAdListener));
            } catch (Exception e5) {
                if (feedAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    feedAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadFullScreenVideoAd(AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
            try {
                this.f4888a.f(a(adSlot), new d(fullScreenVideoAdListener));
            } catch (Exception e5) {
                if (fullScreenVideoAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    fullScreenVideoAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadInteractionExpressAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadNativeAd(AdSlot adSlot, TTAdNative.NativeAdListener nativeAdListener) {
            try {
                this.f4888a.d(a(adSlot), new com.bytedance.sdk.openadsdk.g.a.a.a.d(nativeAdListener));
            } catch (Exception e5) {
                if (nativeAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    nativeAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadNativeExpressAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            try {
                this.f4888a.g(a(adSlot), new com.bytedance.sdk.openadsdk.g.a.a.a.e(nativeExpressAdListener));
            } catch (Exception e5) {
                if (nativeExpressAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    nativeExpressAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadRewardVideoAd(AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
            try {
                this.f4888a.e(a(adSlot), new f(rewardVideoAdListener));
            } catch (Exception e5) {
                if (rewardVideoAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    rewardVideoAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadSplashAd(AdSlot adSlot, TTAdNative.CSJSplashAdListener cSJSplashAdListener, int i5) {
            try {
                this.f4888a.a(a(adSlot), new b(cSJSplashAdListener), i5);
            } catch (Exception e5) {
                if (cSJSplashAdListener != null) {
                    final Pair<Integer, String> a5 = this.f4888a.a(e5);
                    cSJSplashAdListener.onSplashLoadFail(new CSJAdError() { // from class: com.bytedance.sdk.openadsdk.c.a.a.a.1
                        @Override // com.bytedance.sdk.openadsdk.CSJAdError
                        public int getCode() {
                            return ((Integer) a5.first).intValue();
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJAdError
                        public String getMsg() {
                            return (String) a5.second;
                        }
                    });
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadStream(AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
            try {
                this.f4888a.b(a(adSlot), new c(feedAdListener));
            } catch (Exception e5) {
                if (feedAdListener != null) {
                    Pair<Integer, String> a5 = this.f4888a.a(e5);
                    feedAdListener.onError(((Integer) a5.first).intValue(), (String) a5.second);
                }
            }
        }
    }

    public abstract Pair<Integer, String> a(Exception exc);

    public TTAdNative a() {
        return new C0128a(this);
    }

    public abstract void a(ValueSet valueSet, Bridge bridge);

    public abstract void a(ValueSet valueSet, Bridge bridge, int i5);

    public abstract void b(ValueSet valueSet, Bridge bridge);

    public abstract void c(ValueSet valueSet, Bridge bridge);

    public abstract void d(ValueSet valueSet, Bridge bridge);

    public abstract void e(ValueSet valueSet, Bridge bridge);

    public abstract void f(ValueSet valueSet, Bridge bridge);

    public abstract void g(ValueSet valueSet, Bridge bridge);

    public abstract void h(ValueSet valueSet, Bridge bridge);

    public abstract void i(ValueSet valueSet, Bridge bridge);
}
