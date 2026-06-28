package com.bytedance.sdk.openadsdk.g.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.c.a.a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class e implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4992a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdNative.NativeExpressAdListener f4993b;

    public e(TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        this.f4993b = nativeExpressAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f4993b == null) {
            return null;
        }
        switch (i5) {
            case 153101:
                this.f4993b.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 153102:
                List list = (List) valueSet.objectValue(0, List.class);
                if (list == null) {
                    list = new ArrayList(0);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new o((Bridge) it.next()));
                }
                this.f4993b.onNativeExpressAdLoad(arrayList);
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4992a;
    }
}
