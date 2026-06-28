package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends com.bytedance.sdk.openadsdk.g.a.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    private TTAdNative.DrawFeedAdListener f5066a;

    public b(TTAdNative.DrawFeedAdListener drawFeedAdListener) {
        super(drawFeedAdListener);
        this.f5066a = drawFeedAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.g.a.a.a.a, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 == 172102) {
            List list = (List) valueSet.objectValue(0, List.class);
            if (list == null) {
                list = new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new k((Bridge) it.next()));
            }
            TTAdNative.DrawFeedAdListener drawFeedAdListener = this.f5066a;
            if (drawFeedAdListener != null) {
                drawFeedAdListener.onDrawFeedAdLoad(arrayList);
                return null;
            }
            return null;
        }
        return (T) super.call(i5, valueSet, cls);
    }
}
