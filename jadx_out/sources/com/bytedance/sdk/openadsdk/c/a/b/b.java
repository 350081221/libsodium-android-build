package com.bytedance.sdk.openadsdk.c.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4913a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAppDownloadListener f4914b;

    public b(TTAppDownloadListener tTAppDownloadListener) {
        this.f4914b = tTAppDownloadListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTAppDownloadListener tTAppDownloadListener = this.f4914b;
        if (tTAppDownloadListener == null) {
            return null;
        }
        switch (i5) {
            case 221101:
                tTAppDownloadListener.onIdle();
                break;
            case 221102:
                this.f4914b.onDownloadActive(valueSet.longValue(0), valueSet.longValue(1), (String) valueSet.objectValue(2, String.class), (String) valueSet.objectValue(3, String.class));
                break;
            case 221103:
                this.f4914b.onDownloadPaused(valueSet.longValue(0), valueSet.longValue(1), (String) valueSet.objectValue(2, String.class), (String) valueSet.objectValue(3, String.class));
                break;
            case 221104:
                this.f4914b.onDownloadFailed(valueSet.longValue(0), valueSet.longValue(1), (String) valueSet.objectValue(2, String.class), (String) valueSet.objectValue(3, String.class));
                break;
            case 221105:
                this.f4914b.onDownloadFinished(valueSet.longValue(0), (String) valueSet.objectValue(1, String.class), (String) valueSet.objectValue(2, String.class));
                break;
            case 221106:
                this.f4914b.onInstalled((String) valueSet.objectValue(0, String.class), (String) valueSet.objectValue(1, String.class));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4913a;
    }
}
