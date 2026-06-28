package com.yuanqi.master.tools.guide.model;

import android.view.View;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public View.OnClickListener f15168a;

    /* renamed from: b, reason: collision with root package name */
    public f f15169b;

    /* renamed from: c, reason: collision with root package name */
    public y2.c f15170c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15171d;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private c f15172a = new c();

        public c a() {
            return this.f15172a;
        }

        public a b(boolean z4) {
            this.f15172a.f15171d = z4;
            return this;
        }

        public a c(View.OnClickListener onClickListener) {
            this.f15172a.f15168a = onClickListener;
            return this;
        }

        public a d(y2.c cVar) {
            this.f15172a.f15170c = cVar;
            return this;
        }

        public a e(f fVar) {
            this.f15172a.f15169b = fVar;
            return this;
        }
    }
}
