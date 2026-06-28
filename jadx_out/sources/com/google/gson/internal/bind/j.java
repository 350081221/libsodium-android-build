package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public final class j extends x<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f7561b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f7562a = new SimpleDateFormat("MMM d, yyyy");

    /* loaded from: classes2.dex */
    static class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.f() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    @Override // com.google.gson.x
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized Date e(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.f7562a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e5) {
            throw new v(e5);
        }
    }

    @Override // com.google.gson.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized void i(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        if (date == null) {
            format = null;
        } else {
            format = this.f7562a.format((java.util.Date) date);
        }
        jsonWriter.value(format);
    }
}
