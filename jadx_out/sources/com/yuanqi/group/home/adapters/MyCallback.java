package com.yuanqi.group.home.adapters;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;

/* loaded from: classes3.dex */
public class MyCallback extends DiffUtil.Callback {

    /* renamed from: a, reason: collision with root package name */
    private List<com.yuanqi.group.home.models.b> f13889a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.yuanqi.group.home.models.b> f13890b;

    public MyCallback(List<com.yuanqi.group.home.models.b> list, List<com.yuanqi.group.home.models.b> list2) {
        this.f13889a = list;
        this.f13890b = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i5, int i6) {
        return this.f13889a.get(i5).equals(this.f13890b.get(i6));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i5, int i6) {
        return this.f13889a.get(i5).equals(this.f13890b.get(i6));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f13890b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f13889a.size();
    }
}
