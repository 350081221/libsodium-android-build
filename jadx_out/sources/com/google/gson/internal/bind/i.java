package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements y {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f7544a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.e f7545b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.internal.d f7546c;

    /* renamed from: d, reason: collision with root package name */
    private final d f7547d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.gson.internal.reflect.b f7548e = com.google.gson.internal.reflect.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Field f7549d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7550e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f7551f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f7552g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f7553h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f7554i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z4, boolean z5, Field field, boolean z6, x xVar, com.google.gson.f fVar, com.google.gson.reflect.a aVar, boolean z7) {
            super(str, z4, z5);
            this.f7549d = field;
            this.f7550e = z6;
            this.f7551f = xVar;
            this.f7552g = fVar;
            this.f7553h = aVar;
            this.f7554i = z7;
        }

        @Override // com.google.gson.internal.bind.i.c
        void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object e5 = this.f7551f.e(jsonReader);
            if (e5 != null || !this.f7554i) {
                this.f7549d.set(obj, e5);
            }
        }

        @Override // com.google.gson.internal.bind.i.c
        void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
            x mVar;
            Object obj2 = this.f7549d.get(obj);
            if (this.f7550e) {
                mVar = this.f7551f;
            } else {
                mVar = new m(this.f7552g, this.f7551f, this.f7553h.h());
            }
            mVar.i(jsonWriter, obj2);
        }

        @Override // com.google.gson.internal.bind.i.c
        public boolean c(Object obj) throws IOException, IllegalAccessException {
            if (!this.f7559b || this.f7549d.get(obj) == obj) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends x<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.internal.k<T> f7556a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, c> f7557b;

        b(com.google.gson.internal.k<T> kVar, Map<String, c> map) {
            this.f7556a = kVar;
            this.f7557b = map;
        }

        @Override // com.google.gson.x
        public T e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T a5 = this.f7556a.a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    c cVar = this.f7557b.get(jsonReader.nextName());
                    if (cVar != null && cVar.f7560c) {
                        cVar.a(jsonReader, a5);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a5;
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (IllegalStateException e6) {
                throw new v(e6);
            }
        }

        @Override // com.google.gson.x
        public void i(JsonWriter jsonWriter, T t5) throws IOException {
            if (t5 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (c cVar : this.f7557b.values()) {
                    if (cVar.c(t5)) {
                        jsonWriter.name(cVar.f7558a);
                        cVar.b(jsonWriter, t5);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final String f7558a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f7559b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f7560c;

        protected c(String str, boolean z4, boolean z5) {
            this.f7558a = str;
            this.f7559b = z4;
            this.f7560c = z5;
        }

        abstract void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        abstract void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public i(com.google.gson.internal.c cVar, com.google.gson.e eVar, com.google.gson.internal.d dVar, d dVar2) {
        this.f7544a = cVar;
        this.f7545b = eVar;
        this.f7546c = dVar;
        this.f7547d = dVar2;
    }

    private c b(com.google.gson.f fVar, Field field, String str, com.google.gson.reflect.a<?> aVar, boolean z4, boolean z5) {
        x<?> xVar;
        boolean z6;
        boolean b5 = com.google.gson.internal.m.b(aVar.f());
        q1.b bVar = (q1.b) field.getAnnotation(q1.b.class);
        if (bVar != null) {
            xVar = this.f7547d.b(this.f7544a, fVar, aVar, bVar);
        } else {
            xVar = null;
        }
        if (xVar != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z7 = z6;
        if (xVar == null) {
            xVar = fVar.p(aVar);
        }
        return new a(str, z4, z5, field, z7, xVar, fVar, aVar, b5);
    }

    static boolean d(Field field, boolean z4, com.google.gson.internal.d dVar) {
        return (dVar.d(field.getType(), z4) || dVar.g(field, z4)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private Map<String, c> e(com.google.gson.f fVar, com.google.gson.reflect.a<?> aVar, Class<?> cls) {
        boolean z4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type h5 = aVar.h();
        com.google.gson.reflect.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z5 = false;
            int i5 = 0;
            while (i5 < length) {
                Field field = declaredFields[i5];
                boolean c5 = c(field, true);
                boolean c6 = c(field, z5);
                if (c5 || c6) {
                    this.f7548e.b(field);
                    Type p5 = com.google.gson.internal.b.p(aVar2.h(), cls2, field.getGenericType());
                    List<String> f5 = f(field);
                    int size = f5.size();
                    c cVar = null;
                    ?? r22 = z5;
                    while (r22 < size) {
                        String str = f5.get(r22);
                        if (r22 != 0) {
                            z4 = z5;
                        } else {
                            z4 = c5;
                        }
                        int i6 = r22;
                        c cVar2 = cVar;
                        int i7 = size;
                        List<String> list = f5;
                        Field field2 = field;
                        c cVar3 = (c) linkedHashMap.put(str, b(fVar, field, str, com.google.gson.reflect.a.c(p5), z4, c6));
                        if (cVar2 == null) {
                            cVar = cVar3;
                        } else {
                            cVar = cVar2;
                        }
                        c5 = z4;
                        f5 = list;
                        size = i7;
                        field = field2;
                        z5 = false;
                        r22 = i6 + 1;
                    }
                    c cVar4 = cVar;
                    if (cVar4 != null) {
                        throw new IllegalArgumentException(h5 + " declares multiple JSON fields named " + cVar4.f7558a);
                    }
                }
                i5++;
                z5 = false;
            }
            aVar2 = com.google.gson.reflect.a.c(com.google.gson.internal.b.p(aVar2.h(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.f();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        q1.c cVar = (q1.c) field.getAnnotation(q1.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f7545b.translateName(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> f5 = aVar.f();
        if (!Object.class.isAssignableFrom(f5)) {
            return null;
        }
        return new b(this.f7544a.a(aVar), e(fVar, aVar, f5));
    }

    public boolean c(Field field, boolean z4) {
        return d(field, z4, this.f7546c);
    }
}
