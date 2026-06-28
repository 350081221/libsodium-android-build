package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<com.airbnb.lottie.model.content.o, Path>> f1094a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f1095b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.i> f1096c;

    public h(List<com.airbnb.lottie.model.content.i> list) {
        this.f1096c = list;
        this.f1094a = new ArrayList(list.size());
        this.f1095b = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f1094a.add(list.get(i5).b().a());
            this.f1095b.add(list.get(i5).c().a());
        }
    }

    public List<a<com.airbnb.lottie.model.content.o, Path>> a() {
        return this.f1094a;
    }

    public List<com.airbnb.lottie.model.content.i> b() {
        return this.f1096c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f1095b;
    }
}
