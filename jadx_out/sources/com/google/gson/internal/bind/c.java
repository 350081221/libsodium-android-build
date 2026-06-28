package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class c extends x<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f7521b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<DateFormat> f7522a;

    /* loaded from: classes2.dex */
    static class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.f() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f7522a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.internal.f.e()) {
            arrayList.add(com.google.gson.internal.l.e(2, 2));
        }
    }

    private synchronized Date j(String str) {
        Iterator<DateFormat> it = this.f7522a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return r1.a.g(str, new ParsePosition(0));
        } catch (ParseException e5) {
            throw new v(str, e5);
        }
    }

    @Override // com.google.gson.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Date e(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return j(jsonReader.nextString());
    }

    @Override // com.google.gson.x
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public synchronized void i(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.f7522a.get(0).format(date));
        }
    }
}
