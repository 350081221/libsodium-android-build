package com.yuanqi.master.tools.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f15073a;

    /* renamed from: b, reason: collision with root package name */
    private final Window f15074b;

    /* renamed from: c, reason: collision with root package name */
    private c f15075c;

    /* renamed from: com.yuanqi.master.tools.dialog.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0433a {

        /* renamed from: a, reason: collision with root package name */
        public Context f15076a;

        /* renamed from: b, reason: collision with root package name */
        public int f15077b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15078c;

        /* renamed from: d, reason: collision with root package name */
        public DialogInterface.OnCancelListener f15079d;

        /* renamed from: e, reason: collision with root package name */
        public DialogInterface.OnDismissListener f15080e;

        /* renamed from: f, reason: collision with root package name */
        public DialogInterface.OnKeyListener f15081f;

        /* renamed from: m, reason: collision with root package name */
        public int f15088m;

        /* renamed from: n, reason: collision with root package name */
        public View f15089n;

        /* renamed from: o, reason: collision with root package name */
        public int f15090o;

        /* renamed from: p, reason: collision with root package name */
        public int f15091p;

        /* renamed from: q, reason: collision with root package name */
        public int f15092q;

        /* renamed from: r, reason: collision with root package name */
        public int f15093r;

        /* renamed from: s, reason: collision with root package name */
        public int f15094s;

        /* renamed from: g, reason: collision with root package name */
        public SparseArray<Integer> f15082g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public SparseArray<CharSequence> f15083h = new SparseArray<>();

        /* renamed from: i, reason: collision with root package name */
        public SparseArray<View.OnClickListener> f15084i = new SparseArray<>();

        /* renamed from: j, reason: collision with root package name */
        public SparseArray<View.OnLongClickListener> f15085j = new SparseArray<>();

        /* renamed from: k, reason: collision with root package name */
        public SparseArray<Integer> f15086k = new SparseArray<>();

        /* renamed from: l, reason: collision with root package name */
        public SparseArray<Bitmap> f15087l = new SparseArray<>();

        /* renamed from: t, reason: collision with root package name */
        public int f15095t = 17;

        public C0433a(Context context, int i5) {
            this.f15076a = context;
            this.f15077b = i5;
        }

        public void a(a aVar) {
            c cVar;
            int i5 = this.f15088m;
            if (i5 != 0) {
                cVar = new c(this.f15076a, i5);
            } else {
                cVar = null;
            }
            if (this.f15089n != null) {
                cVar = new c();
                cVar.c(this.f15089n);
            }
            if (cVar != null) {
                aVar.a().setContentView(cVar.a());
                aVar.d(cVar);
                for (int i6 = 0; i6 < this.f15083h.size(); i6++) {
                    aVar.g(this.f15083h.keyAt(i6), this.f15083h.valueAt(i6));
                }
                for (int i7 = 0; i7 < this.f15086k.size(); i7++) {
                    aVar.e(this.f15086k.keyAt(i7), this.f15086k.valueAt(i7).intValue());
                }
                for (int i8 = 0; i8 < this.f15084i.size(); i8++) {
                    aVar.f(this.f15084i.keyAt(i8), this.f15084i.valueAt(i8));
                }
                Window c5 = aVar.c();
                c5.setGravity(this.f15095t);
                int i9 = this.f15094s;
                if (i9 != 0) {
                    c5.setWindowAnimations(i9);
                }
                WindowManager.LayoutParams attributes = c5.getAttributes();
                attributes.width = this.f15090o;
                attributes.height = this.f15091p;
                attributes.verticalMargin = this.f15092q;
                attributes.horizontalMargin = this.f15093r;
                c5.setAttributes(attributes);
                return;
            }
            throw new IllegalArgumentException("please set layout");
        }
    }

    public a(b bVar, Window window) {
        this.f15073a = bVar;
        this.f15074b = window;
    }

    public b a() {
        return this.f15073a;
    }

    public <T extends View> T b(int i5) {
        return (T) this.f15075c.b(i5);
    }

    public Window c() {
        return this.f15074b;
    }

    public void d(c cVar) {
        this.f15075c = cVar;
    }

    public void e(int i5, int i6) {
        this.f15075c.d(i5, i6);
    }

    public void f(int i5, View.OnClickListener onClickListener) {
        this.f15075c.e(i5, onClickListener);
    }

    public void g(int i5, CharSequence charSequence) {
        this.f15075c.f(i5, charSequence);
    }
}
