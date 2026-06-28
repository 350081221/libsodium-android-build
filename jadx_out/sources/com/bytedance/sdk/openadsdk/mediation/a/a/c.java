package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends com.bytedance.sdk.openadsdk.g.a.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private TTAdNative.FeedAdListener f5077a;

    public c(TTAdNative.FeedAdListener feedAdListener) {
        super(feedAdListener);
        this.f5077a = feedAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.g.a.a.a.b, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 == 164102) {
            List list = (List) valueSet.objectValue(0, List.class);
            if (list == null) {
                list = new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new l((Bridge) it.next()));
            }
            TTAdNative.FeedAdListener feedAdListener = this.f5077a;
            if (feedAdListener != null) {
                feedAdListener.onFeedAdLoad(arrayList);
                return null;
            }
            return null;
        }
        return (T) super.call(i5, valueSet, cls);
    }
}
