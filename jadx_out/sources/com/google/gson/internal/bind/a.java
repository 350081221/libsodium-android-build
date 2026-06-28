package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a<E> extends x<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final y f7515c = new C0149a();

    /* renamed from: a, reason: collision with root package name */
    private final Class<E> f7516a;

    /* renamed from: b, reason: collision with root package name */
    private final x<E> f7517b;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0149a implements y {
        C0149a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Type h5 = aVar.h();
            if (!(h5 instanceof GenericArrayType) && (!(h5 instanceof Class) || !((Class) h5).isArray())) {
                return null;
            }
            Type g5 = com.google.gson.internal.b.g(h5);
            return new a(fVar, fVar.p(com.google.gson.reflect.a.c(g5)), com.google.gson.internal.b.k(g5));
        }
    }

    public a(com.google.gson.f fVar, x<E> xVar, Class<E> cls) {
        this.f7517b = new m(fVar, xVar, cls);
        this.f7516a = cls;
    }

    @Override // com.google.gson.x
    public Object e(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f7517b.e(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f7516a, size);
        for (int i5 = 0; i5 < size; i5++) {
            Array.set(newInstance, i5, arrayList.get(i5));
        }
        return newInstance;
    }

    @Override // com.google.gson.x
    public void i(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i5 = 0; i5 < length; i5++) {
            this.f7517b.i(jsonWriter, Array.get(obj, i5));
        }
        jsonWriter.endArray();
    }
}
