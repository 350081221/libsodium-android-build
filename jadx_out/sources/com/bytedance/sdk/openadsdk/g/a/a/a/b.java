package com.bytedance.sdk.openadsdk.g.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.c.a.a.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4986a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdNative.FeedAdListener f4987b;

    public b(TTAdNative.FeedAdListener feedAdListener) {
        this.f4987b = feedAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f4987b == null) {
            return null;
        }
        switch (i5) {
            case 164101:
                this.f4987b.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 164102:
                List list = (List) valueSet.objectValue(0, List.class);
                if (list == null) {
                    list = new ArrayList(0);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new k((Bridge) it.next()));
                }
                this.f4987b.onFeedAdLoad(arrayList);
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4986a;
    }
}
