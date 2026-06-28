package com.google.gson;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private com.google.gson.internal.d f7497a;

    /* renamed from: b, reason: collision with root package name */
    private w f7498b;

    /* renamed from: c, reason: collision with root package name */
    private e f7499c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, h<?>> f7500d;

    /* renamed from: e, reason: collision with root package name */
    private final List<y> f7501e;

    /* renamed from: f, reason: collision with root package name */
    private final List<y> f7502f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7503g;

    /* renamed from: h, reason: collision with root package name */
    private String f7504h;

    /* renamed from: i, reason: collision with root package name */
    private int f7505i;

    /* renamed from: j, reason: collision with root package name */
    private int f7506j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7507k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7508l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7509m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f7510n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7511o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7512p;

    public g() {
        this.f7497a = com.google.gson.internal.d.f7658h;
        this.f7498b = w.DEFAULT;
        this.f7499c = d.IDENTITY;
        this.f7500d = new HashMap();
        this.f7501e = new ArrayList();
        this.f7502f = new ArrayList();
        this.f7503g = false;
        this.f7505i = 2;
        this.f7506j = 2;
        this.f7507k = false;
        this.f7508l = false;
        this.f7509m = true;
        this.f7510n = false;
        this.f7511o = false;
        this.f7512p = false;
    }

    private void c(String str, int i5, int i6, List<y> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar = new a((Class<? extends Date>) Date.class, str);
            aVar2 = new a((Class<? extends Date>) Timestamp.class, str);
            aVar3 = new a((Class<? extends Date>) java.sql.Date.class, str);
        } else if (i5 != 2 && i6 != 2) {
            a aVar4 = new a(Date.class, i5, i6);
            a aVar5 = new a(Timestamp.class, i5, i6);
            a aVar6 = new a(java.sql.Date.class, i5, i6);
            aVar = aVar4;
            aVar2 = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(com.google.gson.internal.bind.n.b(Date.class, aVar));
        list.add(com.google.gson.internal.bind.n.b(Timestamp.class, aVar2));
        list.add(com.google.gson.internal.bind.n.b(java.sql.Date.class, aVar3));
    }

    public g a(b bVar) {
        this.f7497a = this.f7497a.o(bVar, false, true);
        return this;
    }

    public g b(b bVar) {
        this.f7497a = this.f7497a.o(bVar, true, false);
        return this;
    }

    public f d() {
        List<y> arrayList = new ArrayList<>(this.f7501e.size() + this.f7502f.size() + 3);
        arrayList.addAll(this.f7501e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f7502f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        c(this.f7504h, this.f7505i, this.f7506j, arrayList);
        return new f(this.f7497a, this.f7499c, this.f7500d, this.f7503g, this.f7507k, this.f7511o, this.f7509m, this.f7510n, this.f7512p, this.f7508l, this.f7498b, this.f7504h, this.f7505i, this.f7506j, this.f7501e, this.f7502f, arrayList);
    }

    public g e() {
        this.f7509m = false;
        return this;
    }

    public g f() {
        this.f7497a = this.f7497a.c();
        return this;
    }

    public g g() {
        this.f7507k = true;
        return this;
    }

    public g h(int... iArr) {
        this.f7497a = this.f7497a.p(iArr);
        return this;
    }

    public g i() {
        this.f7497a = this.f7497a.h();
        return this;
    }

    public g j() {
        this.f7511o = true;
        return this;
    }

    public g k(Type type, Object obj) {
        boolean z4;
        boolean z5 = obj instanceof t;
        if (!z5 && !(obj instanceof k) && !(obj instanceof h) && !(obj instanceof x)) {
            z4 = false;
        } else {
            z4 = true;
        }
        com.google.gson.internal.a.a(z4);
        if (obj instanceof h) {
            this.f7500d.put(type, (h) obj);
        }
        if (z5 || (obj instanceof k)) {
            this.f7501e.add(com.google.gson.internal.bind.l.l(com.google.gson.reflect.a.c(type), obj));
        }
        if (obj instanceof x) {
            this.f7501e.add(com.google.gson.internal.bind.n.a(com.google.gson.reflect.a.c(type), (x) obj));
        }
        return this;
    }

    public g l(y yVar) {
        this.f7501e.add(yVar);
        return this;
    }

    public g m(Class<?> cls, Object obj) {
        boolean z4;
        boolean z5 = obj instanceof t;
        if (!z5 && !(obj instanceof k) && !(obj instanceof x)) {
            z4 = false;
        } else {
            z4 = true;
        }
        com.google.gson.internal.a.a(z4);
        if ((obj instanceof k) || z5) {
            this.f7502f.add(com.google.gson.internal.bind.l.m(cls, obj));
        }
        if (obj instanceof x) {
            this.f7501e.add(com.google.gson.internal.bind.n.e(cls, (x) obj));
        }
        return this;
    }

    public g n() {
        this.f7503g = true;
        return this;
    }

    public g o() {
        this.f7508l = true;
        return this;
    }

    public g p(int i5) {
        this.f7505i = i5;
        this.f7504h = null;
        return this;
    }

    public g q(int i5, int i6) {
        this.f7505i = i5;
        this.f7506j = i6;
        this.f7504h = null;
        return this;
    }

    public g r(String str) {
        this.f7504h = str;
        return this;
    }

    public g s(b... bVarArr) {
        for (b bVar : bVarArr) {
            this.f7497a = this.f7497a.o(bVar, true, true);
        }
        return this;
    }

    public g t(d dVar) {
        this.f7499c = dVar;
        return this;
    }

    public g u(e eVar) {
        this.f7499c = eVar;
        return this;
    }

    public g v() {
        this.f7512p = true;
        return this;
    }

    public g w(w wVar) {
        this.f7498b = wVar;
        return this;
    }

    public g x() {
        this.f7510n = true;
        return this;
    }

    public g y(double d5) {
        this.f7497a = this.f7497a.q(d5);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(f fVar) {
        this.f7497a = com.google.gson.internal.d.f7658h;
        this.f7498b = w.DEFAULT;
        this.f7499c = d.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f7500d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f7501e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f7502f = arrayList2;
        this.f7503g = false;
        this.f7505i = 2;
        this.f7506j = 2;
        this.f7507k = false;
        this.f7508l = false;
        this.f7509m = true;
        this.f7510n = false;
        this.f7511o = false;
        this.f7512p = false;
        this.f7497a = fVar.f7476f;
        this.f7499c = fVar.f7477g;
        hashMap.putAll(fVar.f7478h);
        this.f7503g = fVar.f7479i;
        this.f7507k = fVar.f7480j;
        this.f7511o = fVar.f7481k;
        this.f7509m = fVar.f7482l;
        this.f7510n = fVar.f7483m;
        this.f7512p = fVar.f7484n;
        this.f7508l = fVar.f7485o;
        this.f7498b = fVar.f7489s;
        this.f7504h = fVar.f7486p;
        this.f7505i = fVar.f7487q;
        this.f7506j = fVar.f7488r;
        arrayList.addAll(fVar.f7490t);
        arrayList2.addAll(fVar.f7491u);
    }
}
