package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b implements y {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f7518a;

    /* loaded from: classes2.dex */
    private static final class a<E> extends x<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final x<E> f7519a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.gson.internal.k<? extends Collection<E>> f7520b;

        public a(com.google.gson.f fVar, Type type, x<E> xVar, com.google.gson.internal.k<? extends Collection<E>> kVar) {
            this.f7519a = new m(fVar, xVar, type);
            this.f7520b = kVar;
        }

        @Override // com.google.gson.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Collection<E> e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> a5 = this.f7520b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                a5.add(this.f7519a.e(jsonReader));
            }
            jsonReader.endArray();
            return a5;
        }

        @Override // com.google.gson.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f7519a.i(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public b(com.google.gson.internal.c cVar) {
        this.f7518a = cVar;
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Type h5 = aVar.h();
        Class<? super T> f5 = aVar.f();
        if (!Collection.class.isAssignableFrom(f5)) {
            return null;
        }
        Type h6 = com.google.gson.internal.b.h(h5, f5);
        return new a(fVar, h6, fVar.p(com.google.gson.reflect.a.c(h6)), this.f7518a.a(aVar));
    }
}
