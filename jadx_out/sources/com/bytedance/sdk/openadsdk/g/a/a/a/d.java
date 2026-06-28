package com.bytedance.sdk.openadsdk.g.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.c.a.a.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class d implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4990a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdNative.NativeAdListener f4991b;

    public d(TTAdNative.NativeAdListener nativeAdListener) {
        this.f4991b = nativeAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f4991b == null) {
            return null;
        }
        switch (i5) {
            case 143101:
                this.f4991b.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 143102:
                List list = (List) valueSet.objectValue(0, List.class);
                if (list == null) {
                    list = new ArrayList(0);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n((Bridge) it.next()));
                }
                this.f4991b.onNativeAdLoad(arrayList);
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4990a;
    }
}
