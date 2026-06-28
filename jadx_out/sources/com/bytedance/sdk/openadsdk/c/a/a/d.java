package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.DislikeInfo;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.PersonalizationPrompt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class d implements DislikeInfo {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4893a;

    public d(Bridge bridge) {
        this.f4893a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.DislikeInfo
    public List<FilterWord> getFilterWords() {
        List list = (List) this.f4893a.values().objectValue(243001, List.class);
        if (list == null) {
            list = new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f((Bridge) it.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.openadsdk.DislikeInfo
    public PersonalizationPrompt getPersonalizationPrompt() {
        return new g((Bridge) this.f4893a.values().objectValue(243002, Bridge.class));
    }
}
