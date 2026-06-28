package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
public final class n {
    public static final com.google.gson.x<String> A;
    public static final com.google.gson.x<BigDecimal> B;
    public static final com.google.gson.x<BigInteger> C;
    public static final com.google.gson.y D;
    public static final com.google.gson.x<StringBuilder> E;
    public static final com.google.gson.y F;
    public static final com.google.gson.x<StringBuffer> G;
    public static final com.google.gson.y H;
    public static final com.google.gson.x<URL> I;
    public static final com.google.gson.y J;
    public static final com.google.gson.x<URI> K;
    public static final com.google.gson.y L;
    public static final com.google.gson.x<InetAddress> M;
    public static final com.google.gson.y N;
    public static final com.google.gson.x<UUID> O;
    public static final com.google.gson.y P;
    public static final com.google.gson.x<Currency> Q;
    public static final com.google.gson.y R;
    public static final com.google.gson.y S;
    public static final com.google.gson.x<Calendar> T;
    public static final com.google.gson.y U;
    public static final com.google.gson.x<Locale> V;
    public static final com.google.gson.y W;
    public static final com.google.gson.x<com.google.gson.l> X;
    public static final com.google.gson.y Y;
    public static final com.google.gson.y Z;

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.x<Class> f7581a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.y f7582b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.x<BitSet> f7583c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.y f7584d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.gson.x<Boolean> f7585e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.gson.x<Boolean> f7586f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.gson.y f7587g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.gson.x<Number> f7588h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.gson.y f7589i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.gson.x<Number> f7590j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.gson.y f7591k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.google.gson.x<Number> f7592l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.gson.y f7593m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.gson.x<AtomicInteger> f7594n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.gson.y f7595o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.gson.x<AtomicBoolean> f7596p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.gson.y f7597q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.gson.x<AtomicIntegerArray> f7598r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.gson.y f7599s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.gson.x<Number> f7600t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.gson.x<Number> f7601u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.gson.x<Number> f7602v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.google.gson.x<Number> f7603w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.google.gson.y f7604x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.google.gson.x<Character> f7605y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.google.gson.y f7606z;

    /* loaded from: classes2.dex */
    static class a extends com.google.gson.x<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray e(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e5) {
                    throw new com.google.gson.v(e5);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i5 = 0; i5 < size; i5++) {
                atomicIntegerArray.set(i5, ((Integer) arrayList.get(i5)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                jsonWriter.value(atomicIntegerArray.get(i5));
            }
            jsonWriter.endArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a0 implements com.google.gson.y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f7607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f7608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f7609c;

        a0(Class cls, Class cls2, com.google.gson.x xVar) {
            this.f7607a = cls;
            this.f7608b = cls2;
            this.f7609c = xVar;
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> f5 = aVar.f();
            if (f5 != this.f7607a && f5 != this.f7608b) {
                return null;
            }
            return this.f7609c;
        }

        public String toString() {
            return "Factory[type=" + this.f7607a.getName() + org.slf4j.d.ANY_NON_NULL_MARKER + this.f7608b.getName() + ",adapter=" + this.f7609c + "]";
        }
    }

    /* loaded from: classes2.dex */
    static class b extends com.google.gson.x<Number> {
        b() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e5) {
                throw new com.google.gson.v(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b0 implements com.google.gson.y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f7610a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f7611b;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* loaded from: classes2.dex */
        class a<T1> extends com.google.gson.x<T1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f7612a;

            a(Class cls) {
                this.f7612a = cls;
            }

            @Override // com.google.gson.x
            public T1 e(JsonReader jsonReader) throws IOException {
                T1 t12 = (T1) b0.this.f7611b.e(jsonReader);
                if (t12 != null && !this.f7612a.isInstance(t12)) {
                    throw new com.google.gson.v("Expected a " + this.f7612a.getName() + " but was " + t12.getClass().getName());
                }
                return t12;
            }

            @Override // com.google.gson.x
            public void i(JsonWriter jsonWriter, T1 t12) throws IOException {
                b0.this.f7611b.i(jsonWriter, t12);
            }
        }

        b0(Class cls, com.google.gson.x xVar) {
            this.f7610a = cls;
            this.f7611b = xVar;
        }

        @Override // com.google.gson.y
        public <T2> com.google.gson.x<T2> a(com.google.gson.f fVar, com.google.gson.reflect.a<T2> aVar) {
            Class<? super T2> f5 = aVar.f();
            if (!this.f7610a.isAssignableFrom(f5)) {
                return null;
            }
            return new a(f5);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f7610a.getName() + ",adapter=" + this.f7611b + "]";
        }
    }

    /* loaded from: classes2.dex */
    static class c extends com.google.gson.x<Number> {
        c() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class c0 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7614a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f7614a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7614a[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7614a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7614a[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7614a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7614a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7614a[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7614a[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7614a[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7614a[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes2.dex */
    static class d extends com.google.gson.x<Number> {
        d() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes2.dex */
    static class d0 extends com.google.gson.x<Boolean> {
        d0() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean e(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (peek == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            }
            return Boolean.valueOf(jsonReader.nextBoolean());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }
    }

    /* loaded from: classes2.dex */
    static class e extends com.google.gson.x<Number> {
        e() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            int i5 = c0.f7614a[peek.ordinal()];
            if (i5 != 1 && i5 != 3) {
                if (i5 == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                throw new com.google.gson.v("Expecting number, got: " + peek);
            }
            return new com.google.gson.internal.h(jsonReader.nextString());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes2.dex */
    static class e0 extends com.google.gson.x<Boolean> {
        e0() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(jsonReader.nextString());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Boolean bool) throws IOException {
            String bool2;
            if (bool == null) {
                bool2 = "null";
            } else {
                bool2 = bool.toString();
            }
            jsonWriter.value(bool2);
        }
    }

    /* loaded from: classes2.dex */
    static class f extends com.google.gson.x<Character> {
        f() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Character e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new com.google.gson.v("Expecting character, got: " + nextString);
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Character ch) throws IOException {
            jsonWriter.value(ch == null ? null : String.valueOf(ch));
        }
    }

    /* loaded from: classes2.dex */
    static class f0 extends com.google.gson.x<Number> {
        f0() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e5) {
                throw new com.google.gson.v(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes2.dex */
    static class g extends com.google.gson.x<String> {
        g() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String e(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (peek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            }
            return jsonReader.nextString();
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    /* loaded from: classes2.dex */
    static class g0 extends com.google.gson.x<Number> {
        g0() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e5) {
                throw new com.google.gson.v(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes2.dex */
    static class h extends com.google.gson.x<BigDecimal> {
        h() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e5) {
                throw new com.google.gson.v(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    }

    /* loaded from: classes2.dex */
    static class h0 extends com.google.gson.x<Number> {
        h0() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e5) {
                throw new com.google.gson.v(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes2.dex */
    static class i extends com.google.gson.x<BigInteger> {
        i() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public BigInteger e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e5) {
                throw new com.google.gson.v(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    }

    /* loaded from: classes2.dex */
    static class i0 extends com.google.gson.x<AtomicInteger> {
        i0() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicInteger e(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e5) {
                throw new com.google.gson.v(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    /* loaded from: classes2.dex */
    static class j extends com.google.gson.x<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public StringBuilder e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuilder(jsonReader.nextString());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
            jsonWriter.value(sb == null ? null : sb.toString());
        }
    }

    /* loaded from: classes2.dex */
    static class j0 extends com.google.gson.x<AtomicBoolean> {
        j0() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean e(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    /* loaded from: classes2.dex */
    static class k extends com.google.gson.x<Class> {
        k() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Class e(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes2.dex */
    private static final class k0<T extends Enum<T>> extends com.google.gson.x<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, T> f7615a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<T, String> f7616b = new HashMap();

        public k0(Class<T> cls) {
            try {
                for (T t5 : cls.getEnumConstants()) {
                    String name = t5.name();
                    q1.c cVar = (q1.c) cls.getField(name).getAnnotation(q1.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f7615a.put(str, t5);
                        }
                    }
                    this.f7615a.put(name, t5);
                    this.f7616b.put(t5, name);
                }
            } catch (NoSuchFieldException e5) {
                throw new AssertionError(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public T e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return this.f7615a.get(jsonReader.nextString());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, T t5) throws IOException {
            jsonWriter.value(t5 == null ? null : this.f7616b.get(t5));
        }
    }

    /* loaded from: classes2.dex */
    static class l extends com.google.gson.x<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public StringBuffer e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuffer(jsonReader.nextString());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* loaded from: classes2.dex */
    static class m extends com.google.gson.x<URL> {
        m() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public URL e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if ("null".equals(nextString)) {
                return null;
            }
            return new URL(nextString);
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.internal.bind.n$n, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0150n extends com.google.gson.x<URI> {
        C0150n() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public URI e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URI(nextString);
            } catch (URISyntaxException e5) {
                throw new com.google.gson.m(e5);
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    }

    /* loaded from: classes2.dex */
    static class o extends com.google.gson.x<InetAddress> {
        o() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public InetAddress e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return InetAddress.getByName(jsonReader.nextString());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* loaded from: classes2.dex */
    static class p extends com.google.gson.x<UUID> {
        p() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public UUID e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return UUID.fromString(jsonReader.nextString());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    }

    /* loaded from: classes2.dex */
    static class q extends com.google.gson.x<Currency> {
        q() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Currency e(JsonReader jsonReader) throws IOException {
            return Currency.getInstance(jsonReader.nextString());
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes2.dex */
    static class r implements com.google.gson.y {

        /* loaded from: classes2.dex */
        class a extends com.google.gson.x<Timestamp> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.gson.x f7617a;

            a(com.google.gson.x xVar) {
                this.f7617a = xVar;
            }

            @Override // com.google.gson.x
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Timestamp e(JsonReader jsonReader) throws IOException {
                Date date = (Date) this.f7617a.e(jsonReader);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // com.google.gson.x
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void i(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                this.f7617a.i(jsonWriter, timestamp);
            }
        }

        r() {
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.f() != Timestamp.class) {
                return null;
            }
            return new a(fVar.q(Date.class));
        }
    }

    /* loaded from: classes2.dex */
    static class s extends com.google.gson.x<Calendar> {

        /* renamed from: a, reason: collision with root package name */
        private static final String f7619a = "year";

        /* renamed from: b, reason: collision with root package name */
        private static final String f7620b = "month";

        /* renamed from: c, reason: collision with root package name */
        private static final String f7621c = "dayOfMonth";

        /* renamed from: d, reason: collision with root package name */
        private static final String f7622d = "hourOfDay";

        /* renamed from: e, reason: collision with root package name */
        private static final String f7623e = "minute";

        /* renamed from: f, reason: collision with root package name */
        private static final String f7624f = "second";

        s() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Calendar e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if (f7619a.equals(nextName)) {
                    i5 = nextInt;
                } else if (f7620b.equals(nextName)) {
                    i6 = nextInt;
                } else if (f7621c.equals(nextName)) {
                    i7 = nextInt;
                } else if (f7622d.equals(nextName)) {
                    i8 = nextInt;
                } else if (f7623e.equals(nextName)) {
                    i9 = nextInt;
                } else if (f7624f.equals(nextName)) {
                    i10 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i5, i6, i7, i8, i9, i10);
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(f7619a);
            jsonWriter.value(calendar.get(1));
            jsonWriter.name(f7620b);
            jsonWriter.value(calendar.get(2));
            jsonWriter.name(f7621c);
            jsonWriter.value(calendar.get(5));
            jsonWriter.name(f7622d);
            jsonWriter.value(calendar.get(11));
            jsonWriter.name(f7623e);
            jsonWriter.value(calendar.get(12));
            jsonWriter.name(f7624f);
            jsonWriter.value(calendar.get(13));
            jsonWriter.endObject();
        }
    }

    /* loaded from: classes2.dex */
    static class t extends com.google.gson.x<Locale> {
        t() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Locale e(JsonReader jsonReader) throws IOException {
            String str;
            String str2;
            String str3 = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    }

    /* loaded from: classes2.dex */
    static class u extends com.google.gson.x<com.google.gson.l> {
        u() {
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l e(JsonReader jsonReader) throws IOException {
            switch (c0.f7614a[jsonReader.peek().ordinal()]) {
                case 1:
                    return new com.google.gson.r((Number) new com.google.gson.internal.h(jsonReader.nextString()));
                case 2:
                    return new com.google.gson.r(Boolean.valueOf(jsonReader.nextBoolean()));
                case 3:
                    return new com.google.gson.r(jsonReader.nextString());
                case 4:
                    jsonReader.nextNull();
                    return com.google.gson.n.f7725a;
                case 5:
                    com.google.gson.i iVar = new com.google.gson.i();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        iVar.y(e(jsonReader));
                    }
                    jsonReader.endArray();
                    return iVar;
                case 6:
                    com.google.gson.o oVar = new com.google.gson.o();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        oVar.y(jsonReader.nextName(), e(jsonReader));
                    }
                    jsonReader.endObject();
                    return oVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, com.google.gson.l lVar) throws IOException {
            if (lVar != null && !lVar.v()) {
                if (lVar.x()) {
                    com.google.gson.r p5 = lVar.p();
                    if (p5.B()) {
                        jsonWriter.value(p5.r());
                        return;
                    } else if (p5.z()) {
                        jsonWriter.value(p5.f());
                        return;
                    } else {
                        jsonWriter.value(p5.t());
                        return;
                    }
                }
                if (lVar.u()) {
                    jsonWriter.beginArray();
                    Iterator<com.google.gson.l> it = lVar.m().iterator();
                    while (it.hasNext()) {
                        i(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (lVar.w()) {
                    jsonWriter.beginObject();
                    for (Map.Entry<String, com.google.gson.l> entry : lVar.o().F()) {
                        jsonWriter.name(entry.getKey());
                        i(jsonWriter, entry.getValue());
                    }
                    jsonWriter.endObject();
                    return;
                }
                throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
            }
            jsonWriter.nullValue();
        }
    }

    /* loaded from: classes2.dex */
    static class v extends com.google.gson.x<BitSet> {
        v() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        
            if (r8.nextInt() != 0) goto L23;
         */
        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet e(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.beginArray()
                com.google.gson.stream.JsonToken r1 = r8.peek()
                r2 = 0
                r3 = r2
            Le:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.internal.bind.n.c0.f7614a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.nextString()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = r2
                goto L69
            L30:
                com.google.gson.v r8 = new com.google.gson.v
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.v r8 = new com.google.gson.v
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.nextBoolean()
                goto L69
            L63:
                int r1 = r8.nextInt()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r8.peek()
                goto Le
            L75:
                r8.endArray()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.n.v.e(com.google.gson.stream.JsonReader):java.util.BitSet");
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i5 = 0; i5 < length; i5++) {
                jsonWriter.value(bitSet.get(i5) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    /* loaded from: classes2.dex */
    static class w implements com.google.gson.y {
        w() {
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> f5 = aVar.f();
            if (Enum.class.isAssignableFrom(f5) && f5 != Enum.class) {
                if (!f5.isEnum()) {
                    f5 = f5.getSuperclass();
                }
                return new k0(f5);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static class x implements com.google.gson.y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f7625a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f7626b;

        x(com.google.gson.reflect.a aVar, com.google.gson.x xVar) {
            this.f7625a = aVar;
            this.f7626b = xVar;
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.equals(this.f7625a)) {
                return this.f7626b;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class y implements com.google.gson.y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f7627a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f7628b;

        y(Class cls, com.google.gson.x xVar) {
            this.f7627a = cls;
            this.f7628b = xVar;
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.f() == this.f7627a) {
                return this.f7628b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f7627a.getName() + ",adapter=" + this.f7628b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class z implements com.google.gson.y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f7629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f7630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f7631c;

        z(Class cls, Class cls2, com.google.gson.x xVar) {
            this.f7629a = cls;
            this.f7630b = cls2;
            this.f7631c = xVar;
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> f5 = aVar.f();
            if (f5 != this.f7629a && f5 != this.f7630b) {
                return null;
            }
            return this.f7631c;
        }

        public String toString() {
            return "Factory[type=" + this.f7630b.getName() + org.slf4j.d.ANY_NON_NULL_MARKER + this.f7629a.getName() + ",adapter=" + this.f7631c + "]";
        }
    }

    static {
        com.google.gson.x<Class> d5 = new k().d();
        f7581a = d5;
        f7582b = b(Class.class, d5);
        com.google.gson.x<BitSet> d6 = new v().d();
        f7583c = d6;
        f7584d = b(BitSet.class, d6);
        d0 d0Var = new d0();
        f7585e = d0Var;
        f7586f = new e0();
        f7587g = c(Boolean.TYPE, Boolean.class, d0Var);
        f0 f0Var = new f0();
        f7588h = f0Var;
        f7589i = c(Byte.TYPE, Byte.class, f0Var);
        g0 g0Var = new g0();
        f7590j = g0Var;
        f7591k = c(Short.TYPE, Short.class, g0Var);
        h0 h0Var = new h0();
        f7592l = h0Var;
        f7593m = c(Integer.TYPE, Integer.class, h0Var);
        com.google.gson.x<AtomicInteger> d7 = new i0().d();
        f7594n = d7;
        f7595o = b(AtomicInteger.class, d7);
        com.google.gson.x<AtomicBoolean> d8 = new j0().d();
        f7596p = d8;
        f7597q = b(AtomicBoolean.class, d8);
        com.google.gson.x<AtomicIntegerArray> d9 = new a().d();
        f7598r = d9;
        f7599s = b(AtomicIntegerArray.class, d9);
        f7600t = new b();
        f7601u = new c();
        f7602v = new d();
        e eVar = new e();
        f7603w = eVar;
        f7604x = b(Number.class, eVar);
        f fVar = new f();
        f7605y = fVar;
        f7606z = c(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = b(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = b(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = b(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = b(URL.class, mVar);
        C0150n c0150n = new C0150n();
        K = c0150n;
        L = b(URI.class, c0150n);
        o oVar = new o();
        M = oVar;
        N = e(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = b(UUID.class, pVar);
        com.google.gson.x<Currency> d10 = new q().d();
        Q = d10;
        R = b(Currency.class, d10);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = d(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = b(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = e(com.google.gson.l.class, uVar);
        Z = new w();
    }

    private n() {
        throw new UnsupportedOperationException();
    }

    public static <TT> com.google.gson.y a(com.google.gson.reflect.a<TT> aVar, com.google.gson.x<TT> xVar) {
        return new x(aVar, xVar);
    }

    public static <TT> com.google.gson.y b(Class<TT> cls, com.google.gson.x<TT> xVar) {
        return new y(cls, xVar);
    }

    public static <TT> com.google.gson.y c(Class<TT> cls, Class<TT> cls2, com.google.gson.x<? super TT> xVar) {
        return new z(cls, cls2, xVar);
    }

    public static <TT> com.google.gson.y d(Class<TT> cls, Class<? extends TT> cls2, com.google.gson.x<? super TT> xVar) {
        return new a0(cls, cls2, xVar);
    }

    public static <T1> com.google.gson.y e(Class<T1> cls, com.google.gson.x<T1> xVar) {
        return new b0(cls, xVar);
    }
}
