package com.google.gson.internal.bind;

import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends JsonWriter {

    /* renamed from: d, reason: collision with root package name */
    private static final Writer f7530d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final r f7531e = new r("closed");

    /* renamed from: a, reason: collision with root package name */
    private final List<com.google.gson.l> f7532a;

    /* renamed from: b, reason: collision with root package name */
    private String f7533b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.gson.l f7534c;

    /* loaded from: classes2.dex */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i5, int i6) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f7530d);
        this.f7532a = new ArrayList();
        this.f7534c = com.google.gson.n.f7725a;
    }

    private com.google.gson.l b() {
        return this.f7532a.get(r0.size() - 1);
    }

    private void c(com.google.gson.l lVar) {
        if (this.f7533b != null) {
            if (!lVar.v() || getSerializeNulls()) {
                ((o) b()).y(this.f7533b, lVar);
            }
            this.f7533b = null;
            return;
        }
        if (this.f7532a.isEmpty()) {
            this.f7534c = lVar;
            return;
        }
        com.google.gson.l b5 = b();
        if (b5 instanceof com.google.gson.i) {
            ((com.google.gson.i) b5).y(lVar);
            return;
        }
        throw new IllegalStateException();
    }

    public com.google.gson.l a() {
        if (this.f7532a.isEmpty()) {
            return this.f7534c;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f7532a);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        com.google.gson.i iVar = new com.google.gson.i();
        c(iVar);
        this.f7532a.add(iVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        o oVar = new o();
        c(oVar);
        this.f7532a.add(oVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f7532a.isEmpty()) {
            this.f7532a.add(f7531e);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (!this.f7532a.isEmpty() && this.f7533b == null) {
            if (b() instanceof com.google.gson.i) {
                this.f7532a.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (!this.f7532a.isEmpty() && this.f7533b == null) {
            if (b() instanceof o) {
                this.f7532a.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (!this.f7532a.isEmpty() && this.f7533b == null) {
            if (b() instanceof o) {
                this.f7533b = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        c(com.google.gson.n.f7725a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        c(new r(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z4) throws IOException {
        c(new r(Boolean.valueOf(z4)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        c(new r(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d5) throws IOException {
        if (!isLenient() && (Double.isNaN(d5) || Double.isInfinite(d5))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d5);
        }
        c(new r((Number) Double.valueOf(d5)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j5) throws IOException {
        c(new r((Number) Long.valueOf(j5)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c(new r(number));
        return this;
    }
}
