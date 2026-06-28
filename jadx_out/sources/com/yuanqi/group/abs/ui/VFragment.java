package com.yuanqi.group.abs.ui;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import q2.a;

/* loaded from: classes3.dex */
public class VFragment<T extends q2.a> extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    protected T f13736a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13737b;

    protected org.jdeferred.android.b b() {
        return b.a();
    }

    public void c() {
        d();
    }

    public void d() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public T e() {
        return this.f13736a;
    }

    public boolean f() {
        return this.f13737b;
    }

    public void g(T t5) {
        this.f13736a = t5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        this.f13737b = true;
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.f13737b = false;
        super.onDetach();
    }
}
