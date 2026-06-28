package com.yuanqi.master.tools.guide.model;

import android.graphics.RectF;
import android.view.View;
import com.yuanqi.master.tools.guide.model.b;

/* loaded from: classes3.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private View f15177a;

    /* renamed from: b, reason: collision with root package name */
    private b.a f15178b;

    /* renamed from: c, reason: collision with root package name */
    private int f15179c;

    /* renamed from: d, reason: collision with root package name */
    private int f15180d;

    /* renamed from: e, reason: collision with root package name */
    private c f15181e;

    /* renamed from: f, reason: collision with root package name */
    private RectF f15182f;

    public e(View view, b.a aVar, int i5, int i6) {
        this.f15177a = view;
        this.f15178b = aVar;
        this.f15179c = i5;
        this.f15180d = i6;
    }

    private RectF c(View view) {
        RectF rectF = new RectF();
        int i5 = z2.c.a(view, this.f15177a).left;
        int i6 = this.f15180d;
        rectF.left = i5 - i6;
        rectF.top = r4.top - i6;
        rectF.right = r4.right + i6;
        rectF.bottom = r4.bottom + i6;
        return rectF;
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public RectF a(View view) {
        if (this.f15177a != null) {
            if (this.f15182f == null) {
                this.f15182f = c(view);
            } else {
                c cVar = this.f15181e;
                if (cVar != null && cVar.f15171d) {
                    this.f15182f = c(view);
                }
            }
            z2.a.f(this.f15177a.getClass().getSimpleName() + "'s location:" + this.f15182f);
            return this.f15182f;
        }
        throw new IllegalArgumentException("the highlight view is null!");
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public int b() {
        return this.f15179c;
    }

    public void d(c cVar) {
        this.f15181e = cVar;
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public c getOptions() {
        return this.f15181e;
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public float getRadius() {
        if (this.f15177a != null) {
            return Math.max(r0.getWidth() / 2, this.f15177a.getHeight() / 2) + this.f15180d;
        }
        throw new IllegalArgumentException("the highlight view is null!");
    }

    @Override // com.yuanqi.master.tools.guide.model.b
    public b.a getShape() {
        return this.f15178b;
    }
}
