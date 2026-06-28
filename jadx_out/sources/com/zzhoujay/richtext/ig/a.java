package com.zzhoujay.richtext.ig;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.zzhoujay.richtext.c;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class a<T> implements k {

    /* renamed from: h, reason: collision with root package name */
    private static final String f15803h = "AbstractImageLoader";

    /* renamed from: a, reason: collision with root package name */
    final com.zzhoujay.richtext.c f15804a;

    /* renamed from: b, reason: collision with root package name */
    private final com.zzhoujay.richtext.g f15805b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<com.zzhoujay.richtext.drawable.c> f15806c;

    /* renamed from: d, reason: collision with root package name */
    private final o<T> f15807d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<TextView> f15808e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<e3.g> f15809f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<l> f15810g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zzhoujay.richtext.ig.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0444a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f15811a;

        RunnableC0444a(TextView textView) {
            this.f15811a = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15811a.setText(this.f15811a.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(com.zzhoujay.richtext.c cVar, com.zzhoujay.richtext.g gVar, TextView textView, com.zzhoujay.richtext.drawable.c cVar2, e3.g gVar2, o<T> oVar) {
        this.f15804a = cVar;
        this.f15805b = gVar;
        this.f15807d = oVar;
        this.f15808e = new WeakReference<>(textView);
        this.f15806c = new WeakReference<>(cVar2);
        this.f15809f = new WeakReference<>(gVar2);
        e();
    }

    private boolean a() {
        TextView textView = this.f15808e.get();
        if (textView == null) {
            com.zzhoujay.richtext.ext.c.d(f15803h, "textView is recycle");
            return true;
        }
        boolean a5 = com.zzhoujay.richtext.ext.b.a(textView.getContext());
        if (!a5) {
            com.zzhoujay.richtext.ext.c.d(f15803h, "activity is destroy");
        }
        return !a5;
    }

    private void g() {
        e3.g gVar = this.f15809f.get();
        if (gVar != null) {
            gVar.d(this);
        }
    }

    private int[] h(T t5, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        this.f15807d.d(t5, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private int i(int i5) {
        int e5 = this.f15804a.e();
        if (e5 == Integer.MAX_VALUE) {
            return k();
        }
        if (e5 != Integer.MIN_VALUE) {
            return e5;
        }
        return i5;
    }

    private int j(int i5) {
        int l5 = this.f15804a.l();
        if (l5 == Integer.MAX_VALUE) {
            return l();
        }
        if (l5 != Integer.MIN_VALUE) {
            return l5;
        }
        return i5;
    }

    private int k() {
        TextView textView = this.f15808e.get();
        if (textView == null) {
            return 0;
        }
        return (textView.getHeight() - textView.getPaddingTop()) - textView.getPaddingBottom();
    }

    private int l() {
        TextView textView = this.f15808e.get();
        if (textView == null) {
            return 0;
        }
        return (textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft();
    }

    private static int m(int i5, int i6, int i7, int i8) {
        int ceil = (int) Math.ceil(Math.max(i6 / i8, i5 / i7));
        int i9 = 1;
        int max = Math.max(1, Integer.highestOneBit(ceil));
        if (max >= ceil) {
            i9 = 0;
        }
        return max << i9;
    }

    private void n() {
        TextView textView = this.f15808e.get();
        if (textView != null) {
            textView.post(new RunnableC0444a(textView));
        }
    }

    @Override // com.zzhoujay.richtext.ig.k
    public int b(int i5, int i6) {
        int m5;
        int highestOneBit;
        com.zzhoujay.richtext.ext.c.b(f15803h, "onSizeReady > width = " + i5 + " , height = " + i6 + " , " + this.f15804a.k());
        this.f15804a.y(4);
        c.C0439c c0439c = new c.C0439c(i5, i6);
        e3.e eVar = this.f15805b.f15755j;
        if (eVar != null) {
            eVar.d(this.f15804a, i5, i6, c0439c);
        }
        if (c0439c.c()) {
            m5 = m(i5, i6, c0439c.b(), c0439c.a());
        } else {
            m5 = m(i5, i6, l(), Integer.MAX_VALUE);
        }
        if (m5 == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(m5);
        }
        return Math.max(1, highestOneBit);
    }

    @Override // com.zzhoujay.richtext.ig.k
    public void c(l lVar) {
        TextView textView;
        com.zzhoujay.richtext.ext.c.b(f15803h, "onResourceReady > " + this.f15804a.k());
        if (lVar == null) {
            onFailure(new f3.f());
            return;
        }
        com.zzhoujay.richtext.drawable.c cVar = this.f15806c.get();
        if (cVar == null || (textView = this.f15808e.get()) == null) {
            return;
        }
        this.f15810g = new WeakReference<>(lVar);
        this.f15804a.y(2);
        Drawable i5 = lVar.i(textView.getResources());
        cVar.q(i5);
        int k5 = lVar.k();
        int j5 = lVar.j();
        e3.e eVar = this.f15805b.f15755j;
        if (eVar != null) {
            eVar.a(this.f15804a, k5, j5);
        }
        if (cVar.l()) {
            i5.setBounds(cVar.getBounds());
        } else {
            cVar.r(this.f15804a.j());
            cVar.setBounds(0, 0, j(k5), i(j5));
            cVar.n(this.f15804a.c());
            cVar.a();
        }
        if (lVar.l() && this.f15804a.n()) {
            lVar.h().f(textView);
        }
        com.zzhoujay.richtext.cache.a g5 = com.zzhoujay.richtext.cache.a.g();
        String g6 = this.f15804a.g();
        if (this.f15805b.f15752g.intValue() > com.zzhoujay.richtext.b.none.intValue() && !cVar.l()) {
            g5.c(g6, cVar.k());
        }
        if (this.f15805b.f15752g.intValue() > com.zzhoujay.richtext.b.layout.intValue() && !lVar.l()) {
            g5.b(g6, lVar.g());
        }
        n();
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(T t5) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int[] h5 = h(t5, options);
        options.inSampleSize = b(h5[0], h5[1]);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        c(this.f15807d.a(this.f15804a, t5, options));
    }

    @Override // com.zzhoujay.richtext.ig.k
    public void e() {
        com.zzhoujay.richtext.drawable.c cVar;
        com.zzhoujay.richtext.ext.c.b(f15803h, "onLoading > " + this.f15804a.k());
        if (a() || (cVar = this.f15806c.get()) == null) {
            return;
        }
        this.f15804a.y(1);
        Drawable h5 = this.f15804a.h();
        Rect bounds = h5.getBounds();
        cVar.q(h5);
        e3.e eVar = this.f15805b.f15755j;
        if (eVar != null) {
            eVar.e(this.f15804a);
        }
        if (cVar.l()) {
            h5.setBounds(cVar.getBounds());
        } else {
            cVar.r(this.f15804a.j());
            cVar.n(this.f15804a.c());
            cVar.setBounds(0, 0, j(bounds.width()), i(bounds.height()));
            cVar.a();
        }
        n();
    }

    @Override // com.zzhoujay.richtext.ig.k
    public void onFailure(Exception exc) {
        com.zzhoujay.richtext.drawable.c cVar;
        com.zzhoujay.richtext.ext.c.e(f15803h, "onFailure > " + this.f15804a.k(), exc);
        if (a() || (cVar = this.f15806c.get()) == null) {
            return;
        }
        this.f15804a.y(3);
        Drawable d5 = this.f15804a.d();
        Rect bounds = d5.getBounds();
        cVar.q(d5);
        e3.e eVar = this.f15805b.f15755j;
        if (eVar != null) {
            eVar.b(this.f15804a, exc);
        }
        if (cVar.l()) {
            d5.setBounds(cVar.getBounds());
        } else {
            cVar.r(this.f15804a.j());
            cVar.setBounds(0, 0, j(bounds.width()), i(bounds.height()));
            cVar.n(this.f15804a.c());
            cVar.a();
        }
        n();
        g();
    }

    @Override // e3.m
    public void recycle() {
        l lVar;
        WeakReference<l> weakReference = this.f15810g;
        if (weakReference != null && (lVar = weakReference.get()) != null) {
            lVar.recycle();
        }
    }
}
