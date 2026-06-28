package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes2.dex */
public abstract class x<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends x<T> {
        a() {
        }

        @Override // com.google.gson.x
        public T e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (T) x.this.e(jsonReader);
        }

        @Override // com.google.gson.x
        public void i(JsonWriter jsonWriter, T t5) throws IOException {
            if (t5 == null) {
                jsonWriter.nullValue();
            } else {
                x.this.i(jsonWriter, t5);
            }
        }
    }

    public final T a(Reader reader) throws IOException {
        return e(new JsonReader(reader));
    }

    public final T b(String str) throws IOException {
        return a(new StringReader(str));
    }

    public final T c(l lVar) {
        try {
            return e(new com.google.gson.internal.bind.e(lVar));
        } catch (IOException e5) {
            throw new m(e5);
        }
    }

    public final x<T> d() {
        return new a();
    }

    public abstract T e(JsonReader jsonReader) throws IOException;

    public final String f(T t5) {
        StringWriter stringWriter = new StringWriter();
        try {
            g(stringWriter, t5);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public final void g(Writer writer, T t5) throws IOException {
        i(new JsonWriter(writer), t5);
    }

    public final l h(T t5) {
        try {
            com.google.gson.internal.bind.f fVar = new com.google.gson.internal.bind.f();
            i(fVar, t5);
            return fVar.a();
        } catch (IOException e5) {
            throw new m(e5);
        }
    }

    public abstract void i(JsonWriter jsonWriter, T t5) throws IOException;
}
