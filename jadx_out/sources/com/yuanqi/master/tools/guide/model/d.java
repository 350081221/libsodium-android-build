package com.yuanqi.master.tools.guide.model;

import android.graphics.RectF;
import android.view.View;
import androidx.annotation.NonNull;
import com.yuanqi.master.tools.guide.model.b;

/* loaded from: classes3.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private RectF f15173a;

    /* renamed from: b, reason: collision with root package name */
    private b.a f15174b;

    /* renamed from: c, reason: collision with root package name */
    private int f15175c;

    /* renamed from: d, reason: collision with root package name */
    private c f15176d;

    public d(@NonNull RectF rectF, @NonNull b.a aVar, int i5) {
        this.f15173a = rectF;
        this.f15174b = aVar;
        this.f15175c = i5;
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public RectF a(View view) {
        return this.f15173a;
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public int b() {
        return this.f15175c;
    }

    public void c(c cVar) {
        this.f15176d = cVar;
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public c getOptions() {
        return this.f15176d;
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public float getRadius() {
        return Math.min(this.f15173a.width() / 2.0f, this.f15173a.height() / 2.0f);
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public b.a getShape() {
        return this.f15174b;
    }
}
