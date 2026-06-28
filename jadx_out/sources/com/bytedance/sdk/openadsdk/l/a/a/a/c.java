package com.bytedance.sdk.openadsdk.l.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;

/* loaded from: classes2.dex */
public class c implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5015a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTNativeExpressAd.ExpressVideoAdListener f5016b;

    public c(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f5016b = expressVideoAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener = this.f5016b;
        if (expressVideoAdListener == null) {
            return null;
        }
        switch (i5) {
            case 152101:
                expressVideoAdListener.onVideoLoad();
                break;
            case 152102:
                this.f5016b.onVideoError(valueSet.intValue(0), valueSet.intValue(1));
                break;
            case 152103:
                expressVideoAdListener.onVideoAdStartPlay();
                break;
            case 152104:
                expressVideoAdListener.onVideoAdPaused();
                break;
            case 152105:
                expressVideoAdListener.onVideoAdContinuePlay();
                break;
            case 152106:
                this.f5016b.onProgressUpdate(valueSet.longValue(0), valueSet.longValue(1));
                break;
            case 152107:
                expressVideoAdListener.onVideoAdComplete();
                break;
            case 152108:
                expressVideoAdListener.onClickRetry();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5015a;
    }
}
