package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements y, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    private static final double f7657g = -1.0d;

    /* renamed from: h, reason: collision with root package name */
    public static final d f7658h = new d();

    /* renamed from: d, reason: collision with root package name */
    private boolean f7662d;

    /* renamed from: a, reason: collision with root package name */
    private double f7659a = f7657g;

    /* renamed from: b, reason: collision with root package name */
    private int f7660b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7661c = true;

    /* renamed from: e, reason: collision with root package name */
    private List<com.google.gson.b> f7663e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private List<com.google.gson.b> f7664f = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class a<T> extends x<T> {

        /* renamed from: a, reason: collision with root package name */
        private x<T> f7665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f7668d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f7669e;

        a(boolean z4, boolean z5, com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
            this.f7666b = z4;
            this.f7667c = z5;
            this.f7668d = fVar;
            this.f7669e = aVar;
        }

        private x<T> j() {
            x<T> xVar = this.f7665a;
            if (xVar == null) {
                x<T> r5 = this.f7668d.r(d.this, this.f7669e);
                this.f7665a = r5;
                return r5;
            }
            return xVar;
        }

        @Override // com.google.gson.x
        public T e(JsonReader jsonReader) throws IOException {
            if (this.f7666b) {
                jsonReader.skipValue();
                return null;
            }
            return j().e(jsonReader);
        }

        @Override // com.google.gson.x
        public void i(JsonWriter jsonWriter, T t5) throws IOException {
            if (this.f7667c) {
                jsonWriter.nullValue();
            } else {
                j().i(jsonWriter, t5);
            }
        }
    }

    private boolean e(Class<?> cls) {
        if (this.f7659a != f7657g && !n((q1.d) cls.getAnnotation(q1.d.class), (q1.e) cls.getAnnotation(q1.e.class))) {
            return true;
        }
        if ((!this.f7661c && j(cls)) || i(cls)) {
            return true;
        }
        return false;
    }

    private boolean f(Class<?> cls, boolean z4) {
        List<com.google.gson.b> list;
        if (z4) {
            list = this.f7663e;
        } else {
            list = this.f7664f;
        }
        Iterator<com.google.gson.b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    private boolean j(Class<?> cls) {
        return cls.isMemberClass() && !k(cls);
    }

    private boolean k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean l(q1.d dVar) {
        if (dVar != null && dVar.value() > this.f7659a) {
            return false;
        }
        return true;
    }

    private boolean m(q1.e eVar) {
        if (eVar != null && eVar.value() <= this.f7659a) {
            return false;
        }
        return true;
    }

    private boolean n(q1.d dVar, q1.e eVar) {
        return l(dVar) && m(eVar);
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        boolean z4;
        boolean z5;
        Class<? super T> f5 = aVar.f();
        boolean e5 = e(f5);
        if (!e5 && !f(f5, true)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!e5 && !f(f5, false)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z4 && !z5) {
            return null;
        }
        return new a(z5, z4, fVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public d c() {
        d clone = clone();
        clone.f7661c = false;
        return clone;
    }

    public boolean d(Class<?> cls, boolean z4) {
        if (!e(cls) && !f(cls, z4)) {
            return false;
        }
        return true;
    }

    public boolean g(Field field, boolean z4) {
        List<com.google.gson.b> list;
        q1.a aVar;
        if ((this.f7660b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f7659a != f7657g && !n((q1.d) field.getAnnotation(q1.d.class), (q1.e) field.getAnnotation(q1.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f7662d && ((aVar = (q1.a) field.getAnnotation(q1.a.class)) == null || (!z4 ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f7661c && j(field.getType())) || i(field.getType())) {
            return true;
        }
        if (z4) {
            list = this.f7663e;
        } else {
            list = this.f7664f;
        }
        if (!list.isEmpty()) {
            com.google.gson.c cVar = new com.google.gson.c(field);
            Iterator<com.google.gson.b> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a(cVar)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public d h() {
        d clone = clone();
        clone.f7662d = true;
        return clone;
    }

    public d o(com.google.gson.b bVar, boolean z4, boolean z5) {
        d clone = clone();
        if (z4) {
            ArrayList arrayList = new ArrayList(this.f7663e);
            clone.f7663e = arrayList;
            arrayList.add(bVar);
        }
        if (z5) {
            ArrayList arrayList2 = new ArrayList(this.f7664f);
            clone.f7664f = arrayList2;
            arrayList2.add(bVar);
        }
        return clone;
    }

    public d p(int... iArr) {
        d clone = clone();
        clone.f7660b = 0;
        for (int i5 : iArr) {
            clone.f7660b = i5 | clone.f7660b;
        }
        return clone;
    }

    public d q(double d5) {
        d clone = clone();
        clone.f7659a = d5;
        return clone;
    }
}
