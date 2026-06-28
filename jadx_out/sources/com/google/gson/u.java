package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class u implements Iterator<l> {

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader f7732a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7733b;

    public u(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public l next() throws p {
        if (hasNext()) {
            try {
                return com.google.gson.internal.n.a(this.f7732a);
            } catch (p e5) {
                if (e5.getCause() instanceof EOFException) {
                    throw new NoSuchElementException();
                }
                throw e5;
            } catch (OutOfMemoryError e6) {
                throw new p("Failed parsing JSON source to Json", e6);
            } catch (StackOverflowError e7) {
                throw new p("Failed parsing JSON source to Json", e7);
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z4;
        synchronized (this.f7733b) {
            try {
                try {
                    try {
                        if (this.f7732a.peek() != JsonToken.END_DOCUMENT) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } catch (IOException e5) {
                        throw new m(e5);
                    }
                } catch (MalformedJsonException e6) {
                    throw new v(e6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public u(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.f7732a = jsonReader;
        jsonReader.setLenient(true);
        this.f7733b = new Object();
    }
}
