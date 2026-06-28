package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements Bridge, FilterWord {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4895a;

    /* renamed from: b, reason: collision with root package name */
    private FilterWord f4896b;

    public f(FilterWord filterWord) {
        this.f4896b = filterWord;
        this.f4895a = com.bykv.a.a.a.a.b.f3107d;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public void addOption(FilterWord filterWord) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new f(filterWord));
        this.f4895a.call(241101, b5.k(), Void.class);
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        FilterWord filterWord = this.f4896b;
        if (filterWord == null) {
            return null;
        }
        switch (i5) {
            case 241101:
                this.f4896b.addOption(new f((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 241102:
                this.f4896b.setIsSelected(valueSet.booleanValue(0));
                break;
            case 241103:
                return (T) filterWord.getId();
            case 241104:
                return (T) filterWord.getName();
            case 241105:
                return (T) Boolean.class.cast(Boolean.valueOf(filterWord.getIsSelected()));
            case 241106:
                return (T) Boolean.class.cast(Boolean.valueOf(filterWord.hasSecondOptions()));
            case 241107:
                return (T) Boolean.class.cast(Boolean.valueOf(filterWord.isValid()));
            case 241108:
                return (T) filterWord.getOptions();
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public String getId() {
        return (String) this.f4895a.call(241103, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public boolean getIsSelected() {
        return ((Boolean) this.f4895a.call(241105, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public String getName() {
        return (String) this.f4895a.call(241104, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public List<FilterWord> getOptions() {
        List list = (List) this.f4895a.call(241108, com.bykv.a.a.a.a.b.b(0).k(), List.class);
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

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public boolean hasSecondOptions() {
        return ((Boolean) this.f4895a.call(241106, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public boolean isValid() {
        return ((Boolean) this.f4895a.call(241107, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public void setIsSelected(boolean z4) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.i(0, z4);
        this.f4895a.call(241102, b5.k(), Void.class);
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bykv.a.a.a.a.b.f3106c;
    }

    public f(Bridge bridge) {
        this.f4895a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }
}
