package com.bytedance.sdk.openadsdk.g.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.c.a.a.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4984a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdNative.DrawFeedAdListener f4985b;

    public a(TTAdNative.DrawFeedAdListener drawFeedAdListener) {
        this.f4985b = drawFeedAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f4985b == null) {
            return null;
        }
        switch (i5) {
            case 172101:
                this.f4985b.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 172102:
                List list = (List) valueSet.objectValue(0, List.class);
                if (list == null) {
                    list = new ArrayList(0);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new j((Bridge) it.next()));
                }
                this.f4985b.onDrawFeedAdLoad(arrayList);
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4984a;
    }
}
