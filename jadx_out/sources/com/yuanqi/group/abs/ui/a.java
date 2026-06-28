package com.yuanqi.group.abs.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a<T> extends BaseAdapter implements SpinnerAdapter {

    /* renamed from: a, reason: collision with root package name */
    protected Context f13738a;

    /* renamed from: b, reason: collision with root package name */
    private LayoutInflater f13739b;

    /* renamed from: c, reason: collision with root package name */
    protected final List<T> f13740c = new ArrayList();

    /* renamed from: com.yuanqi.group.abs.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0257a {

        /* renamed from: a, reason: collision with root package name */
        protected View f13741a;

        /* renamed from: b, reason: collision with root package name */
        protected Context f13742b;

        public C0257a(View view) {
            this.f13741a = view;
            this.f13742b = view.getContext();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(I)TT; */
        public View a(int i5) {
            return this.f13741a.findViewById(i5);
        }
    }

    public a(Context context) {
        this.f13738a = context;
        this.f13739b = LayoutInflater.from(context);
    }

    public boolean a(int i5, T t5, boolean z4) {
        if (t5 != null) {
            if (z4 && g(t5)) {
                return false;
            }
            if (i5 >= 0) {
                this.f13740c.add(i5, t5);
            } else {
                this.f13740c.add(t5);
            }
        }
        return true;
    }

    public boolean b(T t5) {
        return a(-1, t5, false);
    }

    public void c(Collection<T> collection) {
        if (collection != null) {
            this.f13740c.addAll(collection);
        }
    }

    protected abstract void d(View view, T t5, int i5);

    public void e() {
        this.f13740c.clear();
    }

    protected abstract View f(int i5, ViewGroup viewGroup);

    public boolean g(T t5) {
        if (t5 == null) {
            return false;
        }
        return this.f13740c.contains(t5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f13740c.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = f(i5, viewGroup);
        }
        d(view, getItem(i5), i5);
        return view;
    }

    @Override // android.widget.Adapter
    public final T getItem(int i5) {
        if (i5 >= 0 && i5 < getCount()) {
            return this.f13740c.get(i5);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = f(i5, viewGroup);
        }
        d(view, getItem(i5), i5);
        return view;
    }

    public int h(T t5) {
        return this.f13740c.indexOf(t5);
    }

    public Context i() {
        return this.f13738a;
    }

    public final T j(int i5) {
        return this.f13740c.get(i5);
    }

    public final T k(long j5) {
        return getItem((int) j5);
    }

    public List<T> l() {
        return this.f13740c;
    }

    protected <VW extends View> VW m(int i5, ViewGroup viewGroup) {
        return (VW) this.f13739b.inflate(i5, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <VW extends View> VW n(int i5, ViewGroup viewGroup, boolean z4) {
        return (VW) this.f13739b.inflate(i5, viewGroup, z4);
    }

    public T o(int i5) {
        return this.f13740c.remove(i5);
    }

    public void p(Collection<T> collection) {
        e();
        c(collection);
    }
}
