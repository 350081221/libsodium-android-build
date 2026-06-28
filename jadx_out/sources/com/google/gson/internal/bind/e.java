package com.google.gson.internal.bind;

import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e extends JsonReader {

    /* renamed from: e, reason: collision with root package name */
    private static final Reader f7524e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f7525f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Object[] f7526a;

    /* renamed from: b, reason: collision with root package name */
    private int f7527b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f7528c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f7529d;

    /* loaded from: classes2.dex */
    static class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i5, int i6) throws IOException {
            throw new AssertionError();
        }
    }

    public e(com.google.gson.l lVar) {
        super(f7524e);
        this.f7526a = new Object[32];
        this.f7527b = 0;
        this.f7528c = new String[32];
        this.f7529d = new int[32];
        h(lVar);
    }

    private void a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    private Object b() {
        return this.f7526a[this.f7527b - 1];
    }

    private Object c() {
        Object[] objArr = this.f7526a;
        int i5 = this.f7527b - 1;
        this.f7527b = i5;
        Object obj = objArr[i5];
        objArr[i5] = null;
        return obj;
    }

    private void h(Object obj) {
        int i5 = this.f7527b;
        Object[] objArr = this.f7526a;
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[i5 * 2];
            int[] iArr = new int[i5 * 2];
            String[] strArr = new String[i5 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i5);
            System.arraycopy(this.f7529d, 0, iArr, 0, this.f7527b);
            System.arraycopy(this.f7528c, 0, strArr, 0, this.f7527b);
            this.f7526a = objArr2;
            this.f7529d = iArr;
            this.f7528c = strArr;
        }
        Object[] objArr3 = this.f7526a;
        int i6 = this.f7527b;
        this.f7527b = i6 + 1;
        objArr3[i6] = obj;
    }

    private String locationString() {
        return " at path " + getPath();
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        h(((com.google.gson.i) b()).iterator());
        this.f7529d[this.f7527b - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        h(((o) b()).F().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7526a = new Object[]{f7525f};
        this.f7527b = 1;
    }

    public void d() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) b()).next();
        h(entry.getValue());
        h(new r((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        c();
        c();
        int i5 = this.f7527b;
        if (i5 > 0) {
            int[] iArr = this.f7529d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        c();
        c();
        int i5 = this.f7527b;
        if (i5 > 0) {
            int[] iArr = this.f7529d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i5 = 0;
        while (i5 < this.f7527b) {
            Object[] objArr = this.f7526a;
            Object obj = objArr[i5];
            if (obj instanceof com.google.gson.i) {
                i5++;
                if (objArr[i5] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f7529d[i5]);
                    sb.append(']');
                }
            } else if (obj instanceof o) {
                i5++;
                if (objArr[i5] instanceof Iterator) {
                    sb.append(external.org.apache.commons.lang3.d.f15957a);
                    String str = this.f7528c[i5];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i5++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.END_OBJECT && peek != JsonToken.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean f5 = ((r) c()).f();
        int i5 = this.f7527b;
        if (i5 > 0) {
            int[] iArr = this.f7529d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return f5;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double j5 = ((r) b()).j();
        if (!isLenient() && (Double.isNaN(j5) || Double.isInfinite(j5))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j5);
        }
        c();
        int i5 = this.f7527b;
        if (i5 > 0) {
            int[] iArr = this.f7529d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return j5;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int l5 = ((r) b()).l();
        c();
        int i5 = this.f7527b;
        if (i5 > 0) {
            int[] iArr = this.f7529d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return l5;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long q5 = ((r) b()).q();
        c();
        int i5 = this.f7527b;
        if (i5 > 0) {
            int[] iArr = this.f7529d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return q5;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) b()).next();
        String str = (String) entry.getKey();
        this.f7528c[this.f7527b - 1] = str;
        h(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        a(JsonToken.NULL);
        c();
        int i5 = this.f7527b;
        if (i5 > 0) {
            int[] iArr = this.f7529d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        String t5 = ((r) c()).t();
        int i5 = this.f7527b;
        if (i5 > 0) {
            int[] iArr = this.f7529d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return t5;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f7527b == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object b5 = b();
        if (b5 instanceof Iterator) {
            boolean z4 = this.f7526a[this.f7527b - 2] instanceof o;
            Iterator it = (Iterator) b5;
            if (it.hasNext()) {
                if (z4) {
                    return JsonToken.NAME;
                }
                h(it.next());
                return peek();
            }
            if (z4) {
                return JsonToken.END_OBJECT;
            }
            return JsonToken.END_ARRAY;
        }
        if (b5 instanceof o) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (b5 instanceof com.google.gson.i) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (b5 instanceof r) {
            r rVar = (r) b5;
            if (rVar.D()) {
                return JsonToken.STRING;
            }
            if (rVar.z()) {
                return JsonToken.BOOLEAN;
            }
            if (rVar.B()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (b5 instanceof com.google.gson.n) {
            return JsonToken.NULL;
        }
        if (b5 == f7525f) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f7528c[this.f7527b - 2] = "null";
        } else {
            c();
            int i5 = this.f7527b;
            if (i5 > 0) {
                this.f7528c[i5 - 1] = "null";
            }
        }
        int i6 = this.f7527b;
        if (i6 > 0) {
            int[] iArr = this.f7529d;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return e.class.getSimpleName();
    }
}
