package com.yuanqi.master.tools.dialog;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private View f15098a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<WeakReference<View>> f15099b;

    public c(Context context, int i5) {
        this();
        this.f15098a = LayoutInflater.from(context).inflate(i5, (ViewGroup) null);
    }

    public View a() {
        return this.f15098a;
    }

    public <T extends View> T b(int i5) {
        T t5;
        WeakReference<View> weakReference = this.f15099b.get(i5);
        if (weakReference != null) {
            t5 = (T) weakReference.get();
        } else {
            t5 = null;
        }
        if (t5 == null && (t5 = (T) this.f15098a.findViewById(i5)) != null) {
            this.f15099b.put(i5, new WeakReference<>(t5));
        }
        return t5;
    }

    public void c(View view) {
        this.f15098a = view;
    }

    public void d(int i5, int i6) {
        ImageView imageView = (ImageView) b(i5);
        if (imageView != null) {
            imageView.setImageResource(i6);
        }
    }

    public void e(int i5, View.OnClickListener onClickListener) {
        View b5 = b(i5);
        if (b5 != null) {
            b5.setOnClickListener(onClickListener);
        }
    }

    public <T extends View> void f(int i5, CharSequence charSequence) {
        TextView textView = (TextView) b(i5);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public c() {
        this.f15099b = new SparseArray<>();
    }
}
