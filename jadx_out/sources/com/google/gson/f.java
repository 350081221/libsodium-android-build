package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class f {
    static final boolean A = false;
    static final boolean B = false;
    private static final com.google.gson.reflect.a<?> C = com.google.gson.reflect.a.b(Object.class);
    private static final String D = ")]}'\n";

    /* renamed from: v, reason: collision with root package name */
    static final boolean f7466v = false;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f7467w = false;

    /* renamed from: x, reason: collision with root package name */
    static final boolean f7468x = false;

    /* renamed from: y, reason: collision with root package name */
    static final boolean f7469y = true;

    /* renamed from: z, reason: collision with root package name */
    static final boolean f7470z = false;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, C0147f<?>>> f7471a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<com.google.gson.reflect.a<?>, x<?>> f7472b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.internal.c f7473c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.d f7474d;

    /* renamed from: e, reason: collision with root package name */
    final List<y> f7475e;

    /* renamed from: f, reason: collision with root package name */
    final com.google.gson.internal.d f7476f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.gson.e f7477g;

    /* renamed from: h, reason: collision with root package name */
    final Map<Type, h<?>> f7478h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f7479i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f7480j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f7481k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f7482l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f7483m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f7484n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f7485o;

    /* renamed from: p, reason: collision with root package name */
    final String f7486p;

    /* renamed from: q, reason: collision with root package name */
    final int f7487q;

    /* renamed from: r, reason: collision with root package name */
    final int f7488r;

    /* renamed from: s, reason: collision with root package name */
    final w f7489s;

    /* renamed from: t, reason: collision with root package name */
    final List<y> f7490t;

    /* renamed from: u, reason: collision with root package name */
    final List<y> f7491u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends x<Number> {
        a() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Double e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                f.d(number.doubleValue());
                jsonWriter.value(number);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends x<Number> {
        b() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                f.d(number.floatValue());
                jsonWriter.value(number);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c extends x<Number> {
        c() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Long.valueOf(jsonReader.nextLong());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d extends x<AtomicLong> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f7494a;

        d(x xVar) {
            this.f7494a = xVar;
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicLong e(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f7494a.e(jsonReader)).longValue());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
            this.f7494a.i(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class e extends x<AtomicLongArray> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f7495a;

        e(x xVar) {
            this.f7495a = xVar;
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray e(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f7495a.e(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i5 = 0; i5 < size; i5++) {
                atomicLongArray.set(i5, ((Long) arrayList.get(i5)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                this.f7495a.i(jsonWriter, Long.valueOf(atomicLongArray.get(i5)));
            }
            jsonWriter.endArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.f$f, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0147f<T> extends x<T> {

        /* renamed from: a, reason: collision with root package name */
        private x<T> f7496a;

        C0147f() {
        }

        @Override // com.google.gson.x
        public T e(JsonReader jsonReader) throws IOException {
            x<T> xVar = this.f7496a;
            if (xVar != null) {
                return xVar.e(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.x
        public void i(JsonWriter jsonWriter, T t5) throws IOException {
            x<T> xVar = this.f7496a;
            if (xVar != null) {
                xVar.i(jsonWriter, t5);
                return;
            }
            throw new IllegalStateException();
        }

        public void j(x<T> xVar) {
            if (this.f7496a == null) {
                this.f7496a = xVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public f() {
        this(com.google.gson.internal.d.f7658h, com.google.gson.d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, w.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e5) {
                throw new v(e5);
            } catch (IOException e6) {
                throw new m(e6);
            }
        }
    }

    private static x<AtomicLong> b(x<Number> xVar) {
        return new d(xVar).d();
    }

    private static x<AtomicLongArray> c(x<Number> xVar) {
        return new e(xVar).d();
    }

    static void d(double d5) {
        if (!Double.isNaN(d5) && !Double.isInfinite(d5)) {
            return;
        }
        throw new IllegalArgumentException(d5 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    private x<Number> e(boolean z4) {
        if (z4) {
            return com.google.gson.internal.bind.n.f7602v;
        }
        return new a();
    }

    private x<Number> h(boolean z4) {
        if (z4) {
            return com.google.gson.internal.bind.n.f7601u;
        }
        return new b();
    }

    private static x<Number> t(w wVar) {
        if (wVar == w.DEFAULT) {
            return com.google.gson.internal.bind.n.f7600t;
        }
        return new c();
    }

    public String A(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        F(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void B(l lVar, JsonWriter jsonWriter) throws m {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f7482l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f7479i);
        try {
            try {
                com.google.gson.internal.n.b(lVar, jsonWriter);
            } catch (IOException e5) {
                throw new m(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e6.getMessage(), e6);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void C(l lVar, Appendable appendable) throws m {
        try {
            B(lVar, w(com.google.gson.internal.n.c(appendable)));
        } catch (IOException e5) {
            throw new m(e5);
        }
    }

    public void D(Object obj, Appendable appendable) throws m {
        if (obj != null) {
            F(obj, obj.getClass(), appendable);
        } else {
            C(n.f7725a, appendable);
        }
    }

    public void E(Object obj, Type type, JsonWriter jsonWriter) throws m {
        x p5 = p(com.google.gson.reflect.a.c(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f7482l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f7479i);
        try {
            try {
                p5.i(jsonWriter, obj);
            } catch (IOException e5) {
                throw new m(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e6.getMessage(), e6);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void F(Object obj, Type type, Appendable appendable) throws m {
        try {
            E(obj, type, w(com.google.gson.internal.n.c(appendable)));
        } catch (IOException e5) {
            throw new m(e5);
        }
    }

    public l G(Object obj) {
        if (obj == null) {
            return n.f7725a;
        }
        return H(obj, obj.getClass());
    }

    public l H(Object obj, Type type) {
        com.google.gson.internal.bind.f fVar = new com.google.gson.internal.bind.f();
        E(obj, type, fVar);
        return fVar.a();
    }

    public com.google.gson.internal.d f() {
        return this.f7476f;
    }

    public com.google.gson.e g() {
        return this.f7477g;
    }

    public <T> T i(l lVar, Class<T> cls) throws v {
        return (T) com.google.gson.internal.m.e(cls).cast(j(lVar, cls));
    }

    public <T> T j(l lVar, Type type) throws v {
        if (lVar == null) {
            return null;
        }
        return (T) k(new com.google.gson.internal.bind.e(lVar), type);
    }

    public <T> T k(JsonReader jsonReader, Type type) throws m, v {
        boolean isLenient = jsonReader.isLenient();
        boolean z4 = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z4 = false;
                    return p(com.google.gson.reflect.a.c(type)).e(jsonReader);
                } catch (IOException e5) {
                    throw new v(e5);
                } catch (IllegalStateException e6) {
                    throw new v(e6);
                }
            } catch (EOFException e7) {
                if (z4) {
                    jsonReader.setLenient(isLenient);
                    return null;
                }
                throw new v(e7);
            } catch (AssertionError e8) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e8.getMessage(), e8);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    public <T> T l(Reader reader, Class<T> cls) throws v, m {
        JsonReader v4 = v(reader);
        Object k5 = k(v4, cls);
        a(k5, v4);
        return (T) com.google.gson.internal.m.e(cls).cast(k5);
    }

    public <T> T m(Reader reader, Type type) throws m, v {
        JsonReader v4 = v(reader);
        T t5 = (T) k(v4, type);
        a(t5, v4);
        return t5;
    }

    public <T> T n(String str, Class<T> cls) throws v {
        return (T) com.google.gson.internal.m.e(cls).cast(o(str, cls));
    }

    public <T> T o(String str, Type type) throws v {
        if (str == null) {
            return null;
        }
        return (T) m(new StringReader(str), type);
    }

    public <T> x<T> p(com.google.gson.reflect.a<T> aVar) {
        Object obj;
        boolean z4;
        Map<com.google.gson.reflect.a<?>, x<?>> map = this.f7472b;
        if (aVar == null) {
            obj = C;
        } else {
            obj = aVar;
        }
        x<T> xVar = (x) map.get(obj);
        if (xVar != null) {
            return xVar;
        }
        Map<com.google.gson.reflect.a<?>, C0147f<?>> map2 = this.f7471a.get();
        if (map2 == null) {
            map2 = new HashMap<>();
            this.f7471a.set(map2);
            z4 = true;
        } else {
            z4 = false;
        }
        C0147f<?> c0147f = map2.get(aVar);
        if (c0147f != null) {
            return c0147f;
        }
        try {
            C0147f<?> c0147f2 = new C0147f<>();
            map2.put(aVar, c0147f2);
            Iterator<y> it = this.f7475e.iterator();
            while (it.hasNext()) {
                x<T> a5 = it.next().a(this, aVar);
                if (a5 != null) {
                    c0147f2.j(a5);
                    this.f7472b.put(aVar, a5);
                    return a5;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map2.remove(aVar);
            if (z4) {
                this.f7471a.remove();
            }
        }
    }

    public <T> x<T> q(Class<T> cls) {
        return p(com.google.gson.reflect.a.b(cls));
    }

    public <T> x<T> r(y yVar, com.google.gson.reflect.a<T> aVar) {
        if (!this.f7475e.contains(yVar)) {
            yVar = this.f7474d;
        }
        boolean z4 = false;
        for (y yVar2 : this.f7475e) {
            if (!z4) {
                if (yVar2 == yVar) {
                    z4 = true;
                }
            } else {
                x<T> a5 = yVar2.a(this, aVar);
                if (a5 != null) {
                    return a5;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean s() {
        return this.f7482l;
    }

    public String toString() {
        return "{serializeNulls:" + this.f7479i + ",factories:" + this.f7475e + ",instanceCreators:" + this.f7473c + a1.i.f138d;
    }

    public g u() {
        return new g(this);
    }

    public JsonReader v(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f7484n);
        return jsonReader;
    }

    public JsonWriter w(Writer writer) throws IOException {
        if (this.f7481k) {
            writer.write(D);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f7483m) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f7479i);
        return jsonWriter;
    }

    public boolean x() {
        return this.f7479i;
    }

    public String y(l lVar) {
        StringWriter stringWriter = new StringWriter();
        C(lVar, stringWriter);
        return stringWriter.toString();
    }

    public String z(Object obj) {
        if (obj == null) {
            return y(n.f7725a);
        }
        return A(obj, obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(com.google.gson.internal.d dVar, com.google.gson.e eVar, Map<Type, h<?>> map, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, w wVar, String str, int i5, int i6, List<y> list, List<y> list2, List<y> list3) {
        this.f7471a = new ThreadLocal<>();
        this.f7472b = new ConcurrentHashMap();
        this.f7476f = dVar;
        this.f7477g = eVar;
        this.f7478h = map;
        com.google.gson.internal.c cVar = new com.google.gson.internal.c(map);
        this.f7473c = cVar;
        this.f7479i = z4;
        this.f7480j = z5;
        this.f7481k = z6;
        this.f7482l = z7;
        this.f7483m = z8;
        this.f7484n = z9;
        this.f7485o = z10;
        this.f7489s = wVar;
        this.f7486p = str;
        this.f7487q = i5;
        this.f7488r = i6;
        this.f7490t = list;
        this.f7491u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.n.Y);
        arrayList.add(com.google.gson.internal.bind.h.f7541b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.n.D);
        arrayList.add(com.google.gson.internal.bind.n.f7593m);
        arrayList.add(com.google.gson.internal.bind.n.f7587g);
        arrayList.add(com.google.gson.internal.bind.n.f7589i);
        arrayList.add(com.google.gson.internal.bind.n.f7591k);
        x<Number> t5 = t(wVar);
        arrayList.add(com.google.gson.internal.bind.n.c(Long.TYPE, Long.class, t5));
        arrayList.add(com.google.gson.internal.bind.n.c(Double.TYPE, Double.class, e(z10)));
        arrayList.add(com.google.gson.internal.bind.n.c(Float.TYPE, Float.class, h(z10)));
        arrayList.add(com.google.gson.internal.bind.n.f7604x);
        arrayList.add(com.google.gson.internal.bind.n.f7595o);
        arrayList.add(com.google.gson.internal.bind.n.f7597q);
        arrayList.add(com.google.gson.internal.bind.n.b(AtomicLong.class, b(t5)));
        arrayList.add(com.google.gson.internal.bind.n.b(AtomicLongArray.class, c(t5)));
        arrayList.add(com.google.gson.internal.bind.n.f7599s);
        arrayList.add(com.google.gson.internal.bind.n.f7606z);
        arrayList.add(com.google.gson.internal.bind.n.F);
        arrayList.add(com.google.gson.internal.bind.n.H);
        arrayList.add(com.google.gson.internal.bind.n.b(BigDecimal.class, com.google.gson.internal.bind.n.B));
        arrayList.add(com.google.gson.internal.bind.n.b(BigInteger.class, com.google.gson.internal.bind.n.C));
        arrayList.add(com.google.gson.internal.bind.n.J);
        arrayList.add(com.google.gson.internal.bind.n.L);
        arrayList.add(com.google.gson.internal.bind.n.P);
        arrayList.add(com.google.gson.internal.bind.n.R);
        arrayList.add(com.google.gson.internal.bind.n.W);
        arrayList.add(com.google.gson.internal.bind.n.N);
        arrayList.add(com.google.gson.internal.bind.n.f7584d);
        arrayList.add(com.google.gson.internal.bind.c.f7521b);
        arrayList.add(com.google.gson.internal.bind.n.U);
        arrayList.add(com.google.gson.internal.bind.k.f7563b);
        arrayList.add(com.google.gson.internal.bind.j.f7561b);
        arrayList.add(com.google.gson.internal.bind.n.S);
        arrayList.add(com.google.gson.internal.bind.a.f7515c);
        arrayList.add(com.google.gson.internal.bind.n.f7582b);
        arrayList.add(new com.google.gson.internal.bind.b(cVar));
        arrayList.add(new com.google.gson.internal.bind.g(cVar, z5));
        com.google.gson.internal.bind.d dVar2 = new com.google.gson.internal.bind.d(cVar);
        this.f7474d = dVar2;
        arrayList.add(dVar2);
        arrayList.add(com.google.gson.internal.bind.n.Z);
        arrayList.add(new com.google.gson.internal.bind.i(cVar, eVar, dVar, dVar2));
        this.f7475e = Collections.unmodifiableList(arrayList);
    }
}
