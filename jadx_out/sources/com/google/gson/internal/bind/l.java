package com.google.gson.internal.bind;

import com.google.gson.p;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class l<T> extends x<T> {

    /* renamed from: a, reason: collision with root package name */
    private final t<T> f7565a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.k<T> f7566b;

    /* renamed from: c, reason: collision with root package name */
    final com.google.gson.f f7567c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f7568d;

    /* renamed from: e, reason: collision with root package name */
    private final y f7569e;

    /* renamed from: f, reason: collision with root package name */
    private final l<T>.b f7570f = new b();

    /* renamed from: g, reason: collision with root package name */
    private x<T> f7571g;

    /* loaded from: classes2.dex */
    private final class b implements s, com.google.gson.j {
        private b() {
        }

        @Override // com.google.gson.s
        public com.google.gson.l a(Object obj, Type type) {
            return l.this.f7567c.H(obj, type);
        }

        @Override // com.google.gson.j
        public <R> R b(com.google.gson.l lVar, Type type) throws p {
            return (R) l.this.f7567c.j(lVar, type);
        }

        @Override // com.google.gson.s
        public com.google.gson.l c(Object obj) {
            return l.this.f7567c.G(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c implements y {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f7573a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f7574b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<?> f7575c;

        /* renamed from: d, reason: collision with root package name */
        private final t<?> f7576d;

        /* renamed from: e, reason: collision with root package name */
        private final com.google.gson.k<?> f7577e;

        c(Object obj, com.google.gson.reflect.a<?> aVar, boolean z4, Class<?> cls) {
            t<?> tVar;
            boolean z5;
            if (obj instanceof t) {
                tVar = (t) obj;
            } else {
                tVar = null;
            }
            this.f7576d = tVar;
            com.google.gson.k<?> kVar = obj instanceof com.google.gson.k ? (com.google.gson.k) obj : null;
            this.f7577e = kVar;
            if (tVar == null && kVar == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            com.google.gson.internal.a.a(z5);
            this.f7573a = aVar;
            this.f7574b = z4;
            this.f7575c = cls;
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            boolean isAssignableFrom;
            com.google.gson.reflect.a<?> aVar2 = this.f7573a;
            if (aVar2 != null) {
                if (!aVar2.equals(aVar) && (!this.f7574b || this.f7573a.h() != aVar.f())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.f7575c.isAssignableFrom(aVar.f());
            }
            if (isAssignableFrom) {
                return new l(this.f7576d, this.f7577e, fVar, aVar, this);
            }
            return null;
        }
    }

    public l(t<T> tVar, com.google.gson.k<T> kVar, com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar, y yVar) {
        this.f7565a = tVar;
        this.f7566b = kVar;
        this.f7567c = fVar;
        this.f7568d = aVar;
        this.f7569e = yVar;
    }

    private x<T> j() {
        x<T> xVar = this.f7571g;
        if (xVar == null) {
            x<T> r5 = this.f7567c.r(this.f7569e, this.f7568d);
            this.f7571g = r5;
            return r5;
        }
        return xVar;
    }

    public static y k(com.google.gson.reflect.a<?> aVar, Object obj) {
        return new c(obj, aVar, false, null);
    }

    public static y l(com.google.gson.reflect.a<?> aVar, Object obj) {
        boolean z4;
        if (aVar.h() == aVar.f()) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new c(obj, aVar, z4, null);
    }

    public static y m(Class<?> cls, Object obj) {
        return new c(obj, null, false, cls);
    }

    @Override // com.google.gson.x
    public T e(JsonReader jsonReader) throws IOException {
        if (this.f7566b == null) {
            return j().e(jsonReader);
        }
        com.google.gson.l a5 = com.google.gson.internal.n.a(jsonReader);
        if (a5.v()) {
            return null;
        }
        return this.f7566b.a(a5, this.f7568d.h(), this.f7570f);
    }

    @Override // com.google.gson.x
    public void i(JsonWriter jsonWriter, T t5) throws IOException {
        t<T> tVar = this.f7565a;
        if (tVar == null) {
            j().i(jsonWriter, t5);
        } else if (t5 == null) {
            jsonWriter.nullValue();
        } else {
            com.google.gson.internal.n.b(tVar.a(t5, this.f7568d.h(), this.f7570f), jsonWriter);
        }
    }
}
