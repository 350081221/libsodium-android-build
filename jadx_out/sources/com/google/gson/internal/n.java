package com.google.gson.internal;

import com.google.gson.p;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import com.google.gson.v;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class n {
    private n() {
        throw new UnsupportedOperationException();
    }

    public static com.google.gson.l a(JsonReader jsonReader) throws p {
        boolean z4;
        try {
            try {
                jsonReader.peek();
                z4 = false;
            } catch (EOFException e5) {
                e = e5;
                z4 = true;
            }
            try {
                return com.google.gson.internal.bind.n.X.e(jsonReader);
            } catch (EOFException e6) {
                e = e6;
                if (z4) {
                    return com.google.gson.n.f7725a;
                }
                throw new v(e);
            }
        } catch (MalformedJsonException e7) {
            throw new v(e7);
        } catch (IOException e8) {
            throw new com.google.gson.m(e8);
        } catch (NumberFormatException e9) {
            throw new v(e9);
        }
    }

    public static void b(com.google.gson.l lVar, JsonWriter jsonWriter) throws IOException {
        com.google.gson.internal.bind.n.X.i(jsonWriter, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* loaded from: classes2.dex */
    private static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f7713a;

        /* renamed from: b, reason: collision with root package name */
        private final C0152a f7714b = new C0152a();

        /* renamed from: com.google.gson.internal.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0152a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            char[] f7715a;

            C0152a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i5) {
                return this.f7715a[i5];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f7715a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i5, int i6) {
                return new String(this.f7715a, i5, i6 - i5);
            }
        }

        a(Appendable appendable) {
            this.f7713a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i5, int i6) throws IOException {
            C0152a c0152a = this.f7714b;
            c0152a.f7715a = cArr;
            this.f7713a.append(c0152a, i5, i6 + i5);
        }

        @Override // java.io.Writer
        public void write(int i5) throws IOException {
            this.f7713a.append((char) i5);
        }
    }
}
