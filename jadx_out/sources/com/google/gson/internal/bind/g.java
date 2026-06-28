package com.google.gson.internal.bind;

import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g implements y {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f7535a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f7536b;

    /* loaded from: classes2.dex */
    private final class a<K, V> extends x<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private final x<K> f7537a;

        /* renamed from: b, reason: collision with root package name */
        private final x<V> f7538b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.gson.internal.k<? extends Map<K, V>> f7539c;

        public a(com.google.gson.f fVar, Type type, x<K> xVar, Type type2, x<V> xVar2, com.google.gson.internal.k<? extends Map<K, V>> kVar) {
            this.f7537a = new m(fVar, xVar, type);
            this.f7538b = new m(fVar, xVar2, type2);
            this.f7539c = kVar;
        }

        private String j(com.google.gson.l lVar) {
            if (lVar.x()) {
                r p5 = lVar.p();
                if (p5.B()) {
                    return String.valueOf(p5.r());
                }
                if (p5.z()) {
                    return Boolean.toString(p5.f());
                }
                if (p5.D()) {
                    return p5.t();
                }
                throw new AssertionError();
            }
            if (lVar.v()) {
                return "null";
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<K, V> e(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> a5 = this.f7539c.a();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K e5 = this.f7537a.e(jsonReader);
                    if (a5.put(e5, this.f7538b.e(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new v("duplicate key: " + e5);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    com.google.gson.internal.g.INSTANCE.promoteNameToValue(jsonReader);
                    K e6 = this.f7537a.e(jsonReader);
                    if (a5.put(e6, this.f7538b.e(jsonReader)) != null) {
                        throw new v("duplicate key: " + e6);
                    }
                }
                jsonReader.endObject();
            }
            return a5;
        }

        @Override // com.google.gson.x
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            boolean z4;
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!g.this.f7536b) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f7538b.i(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i5 = 0;
            boolean z5 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.l h5 = this.f7537a.h(entry2.getKey());
                arrayList.add(h5);
                arrayList2.add(entry2.getValue());
                if (!h5.u() && !h5.w()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                z5 |= z4;
            }
            if (z5) {
                jsonWriter.beginArray();
                int size = arrayList.size();
                while (i5 < size) {
                    jsonWriter.beginArray();
                    com.google.gson.internal.n.b((com.google.gson.l) arrayList.get(i5), jsonWriter);
                    this.f7538b.i(jsonWriter, arrayList2.get(i5));
                    jsonWriter.endArray();
                    i5++;
                }
                jsonWriter.endArray();
                return;
            }
            jsonWriter.beginObject();
            int size2 = arrayList.size();
            while (i5 < size2) {
                jsonWriter.name(j((com.google.gson.l) arrayList.get(i5)));
                this.f7538b.i(jsonWriter, arrayList2.get(i5));
                i5++;
            }
            jsonWriter.endObject();
        }
    }

    public g(com.google.gson.internal.c cVar, boolean z4) {
        this.f7535a = cVar;
        this.f7536b = z4;
    }

    private x<?> b(com.google.gson.f fVar, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return fVar.p(com.google.gson.reflect.a.c(type));
        }
        return n.f7586f;
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Type h5 = aVar.h();
        if (!Map.class.isAssignableFrom(aVar.f())) {
            return null;
        }
        Type[] j5 = com.google.gson.internal.b.j(h5, com.google.gson.internal.b.k(h5));
        return new a(fVar, j5[0], b(fVar, j5[0]), j5[1], fVar.p(com.google.gson.reflect.a.c(j5[1])), this.f7535a.a(aVar));
    }
}
