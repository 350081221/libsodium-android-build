package com.yuanqi.master.tools.guide.model;

import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public com.yuanqi.master.tools.guide.model.b f15183a;

    /* renamed from: b, reason: collision with root package name */
    @LayoutRes
    public int f15184b;

    /* renamed from: c, reason: collision with root package name */
    public int f15185c;

    /* renamed from: d, reason: collision with root package name */
    public int f15186d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    @interface a {
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f15187a;

        /* renamed from: b, reason: collision with root package name */
        public int f15188b;

        /* renamed from: c, reason: collision with root package name */
        public int f15189c;

        /* renamed from: d, reason: collision with root package name */
        public int f15190d;

        /* renamed from: e, reason: collision with root package name */
        public int f15191e;

        public String toString() {
            return "MarginInfo{leftMargin=" + this.f15187a + ", topMargin=" + this.f15188b + ", rightMargin=" + this.f15189c + ", bottomMargin=" + this.f15190d + ", gravity=" + this.f15191e + '}';
        }
    }

    public f(@LayoutRes int i5, int i6) {
        this.f15184b = i5;
        this.f15186d = i6;
    }

    private b b(int i5, ViewGroup viewGroup, View view) {
        b bVar = new b();
        RectF a5 = this.f15183a.a(viewGroup);
        if (i5 != 3) {
            if (i5 != 5) {
                if (i5 != 48) {
                    if (i5 == 80) {
                        bVar.f15188b = (int) (a5.bottom + this.f15185c);
                        bVar.f15187a = (int) a5.left;
                    }
                } else {
                    bVar.f15191e = 80;
                    bVar.f15190d = (int) ((viewGroup.getHeight() - a5.top) + this.f15185c);
                    bVar.f15187a = (int) a5.left;
                }
            } else {
                bVar.f15187a = (int) (a5.right + this.f15185c);
                bVar.f15188b = (int) a5.top;
            }
        } else {
            bVar.f15191e = 5;
            bVar.f15189c = (int) ((viewGroup.getWidth() - a5.left) + this.f15185c);
            bVar.f15188b = (int) a5.top;
        }
        return bVar;
    }

    public final View a(ViewGroup viewGroup, com.yuanqi.master.tools.guide.core.b bVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f15184b, viewGroup, false);
        d(inflate);
        e(inflate, bVar);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
        b b5 = b(this.f15186d, viewGroup, inflate);
        z2.a.c(b5.toString());
        c(b5, viewGroup, inflate);
        layoutParams.gravity = b5.f15191e;
        layoutParams.leftMargin += b5.f15187a;
        layoutParams.topMargin += b5.f15188b;
        layoutParams.rightMargin += b5.f15189c;
        layoutParams.bottomMargin += b5.f15190d;
        inflate.setLayoutParams(layoutParams);
        return inflate;
    }

    protected void c(b bVar, ViewGroup viewGroup, View view) {
    }

    @Deprecated
    protected void d(View view) {
    }

    protected void e(View view, com.yuanqi.master.tools.guide.core.b bVar) {
    }

    public f(@LayoutRes int i5, int i6, int i7) {
        this.f15184b = i5;
        this.f15186d = i6;
        this.f15185c = i7;
    }
}
