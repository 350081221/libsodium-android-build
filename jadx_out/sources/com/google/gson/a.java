package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
final class a extends x<Date> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f7462c = "DefaultDateTypeAdapter";

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Date> f7463a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f7464b;

    a(Class<? extends Date> cls) {
        ArrayList arrayList = new ArrayList();
        this.f7464b = arrayList;
        this.f7463a = l(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.internal.f.e()) {
            arrayList.add(com.google.gson.internal.l.e(2, 2));
        }
    }

    private Date j(String str) {
        synchronized (this.f7464b) {
            Iterator<DateFormat> it = this.f7464b.iterator();
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
    }

    private static Class<? extends Date> l(Class<? extends Date> cls) {
        if (cls != Date.class && cls != java.sql.Date.class && cls != Timestamp.class) {
            throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
        }
        return cls;
    }

    @Override // com.google.gson.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Date e(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Date j5 = j(jsonReader.nextString());
        Class<? extends Date> cls = this.f7463a;
        if (cls == Date.class) {
            return j5;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(j5.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(j5.getTime());
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.x
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f7464b) {
            jsonWriter.value(this.f7464b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f7464b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f7464b = arrayList;
        this.f7463a = l(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    a(Class<? extends Date> cls, int i5) {
        ArrayList arrayList = new ArrayList();
        this.f7464b = arrayList;
        this.f7463a = l(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i5, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i5));
        }
        if (com.google.gson.internal.f.e()) {
            arrayList.add(com.google.gson.internal.l.d(i5));
        }
    }

    public a(int i5, int i6) {
        this(Date.class, i5, i6);
    }

    public a(Class<? extends Date> cls, int i5, int i6) {
        ArrayList arrayList = new ArrayList();
        this.f7464b = arrayList;
        this.f7463a = l(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i5, i6, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i5, i6));
        }
        if (com.google.gson.internal.f.e()) {
            arrayList.add(com.google.gson.internal.l.e(i5, i6));
        }
    }
}
