package com.bytedance.sdk.openadsdk.i.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.c.a.a.k;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4999a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTFeedAd.VideoAdListener f5000b;

    public a(TTFeedAd.VideoAdListener videoAdListener) {
        this.f5000b = videoAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5000b == null) {
            return null;
        }
        switch (i5) {
            case 161101:
                this.f5000b.onVideoLoad(new k((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 161102:
                this.f5000b.onVideoError(valueSet.intValue(0), valueSet.intValue(1));
                break;
            case 161103:
                this.f5000b.onVideoAdPaused(new k((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 161104:
                this.f5000b.onVideoAdStartPlay(new k((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 161105:
                this.f5000b.onVideoAdContinuePlay(new k((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 161106:
                this.f5000b.onProgressUpdate(valueSet.longValue(0), valueSet.longValue(1));
                break;
            case 161107:
                this.f5000b.onVideoAdComplete(new k((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4999a;
    }
}
