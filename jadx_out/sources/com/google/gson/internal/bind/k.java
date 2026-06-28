package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class k extends x<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f7563b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f7564a = new SimpleDateFormat("hh:mm:ss a");

    /* loaded from: classes2.dex */
    static class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.f() == Time.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // com.google.gson.x
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized Time e(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f7564a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e5) {
            throw new v(e5);
        }
    }

    @Override // com.google.gson.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized void i(JsonWriter jsonWriter, Time time) throws IOException {
        String format;
        if (time == null) {
            format = null;
        } else {
            format = this.f7564a.format((Date) time);
        }
        jsonWriter.value(format);
    }
}
