package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes2.dex */
public final class q {
    public l a(JsonReader jsonReader) throws m, v {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                return com.google.gson.internal.n.a(jsonReader);
            } catch (OutOfMemoryError e5) {
                throw new p("Failed parsing JSON source: " + jsonReader + " to Json", e5);
            } catch (StackOverflowError e6) {
                throw new p("Failed parsing JSON source: " + jsonReader + " to Json", e6);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    public l b(Reader reader) throws m, v {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            l a5 = a(jsonReader);
            if (!a5.v() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new v("Did not consume the entire document.");
            }
            return a5;
        } catch (MalformedJsonException e5) {
            throw new v(e5);
        } catch (IOException e6) {
            throw new m(e6);
        } catch (NumberFormatException e7) {
            throw new v(e7);
        }
    }

    public l c(String str) throws v {
        return b(new StringReader(str));
    }
}
