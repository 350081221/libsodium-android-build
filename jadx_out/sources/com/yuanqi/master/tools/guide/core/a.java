package com.yuanqi.master.tools.guide.core;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import y2.e;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    Activity f15129a;

    /* renamed from: b, reason: collision with root package name */
    Fragment f15130b;

    /* renamed from: c, reason: collision with root package name */
    String f15131c;

    /* renamed from: d, reason: collision with root package name */
    boolean f15132d;

    /* renamed from: e, reason: collision with root package name */
    View f15133e;

    /* renamed from: g, reason: collision with root package name */
    y2.b f15135g;

    /* renamed from: h, reason: collision with root package name */
    e f15136h;

    /* renamed from: f, reason: collision with root package name */
    int f15134f = 1;

    /* renamed from: i, reason: collision with root package name */
    List<com.yuanqi.master.tools.guide.model.a> f15137i = new ArrayList();

    public a(Activity activity) {
        this.f15129a = activity;
    }

    private void e() {
        if (!TextUtils.isEmpty(this.f15131c)) {
            if (this.f15129a == null && this.f15130b != null) {
                throw new IllegalStateException("activity is null, please make sure that fragment is showing when call NewbieGuide");
            }
            return;
        }
        throw new IllegalArgumentException("the param 'label' is missing, please call setLabel()");
    }

    public a a(com.yuanqi.master.tools.guide.model.a aVar) {
        this.f15137i.add(aVar);
        return this;
    }

    public a b(boolean z4) {
        this.f15132d = z4;
        return this;
    }

    public a c(View view) {
        this.f15133e = view;
        return this;
    }

    public b d() {
        e();
        return new b(this);
    }

    public a f(String str) {
        this.f15131c = str;
        return this;
    }

    public a g(y2.b bVar) {
        this.f15135g = bVar;
        return this;
    }

    public a h(e eVar) {
        this.f15136h = eVar;
        return this;
    }

    public a i(int i5) {
        this.f15134f = i5;
        return this;
    }

    public b j() {
        e();
        b bVar = new b(this);
        bVar.p();
        return bVar;
    }

    public a(Fragment fragment) {
        this.f15130b = fragment;
        this.f15129a = fragment.getActivity();
    }
}
