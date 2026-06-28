package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class h extends x<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f7541b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f7542a;

    /* loaded from: classes2.dex */
    static class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.f() == Object.class) {
                return new h(fVar);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7543a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f7543a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7543a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7543a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7543a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7543a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7543a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    h(com.google.gson.f fVar) {
        this.f7542a = fVar;
    }

    @Override // com.google.gson.x
    public Object e(JsonReader jsonReader) throws IOException {
        switch (b.f7543a[jsonReader.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(e(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
                com.google.gson.internal.j jVar = new com.google.gson.internal.j();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    jVar.put(jsonReader.nextName(), e(jsonReader));
                }
                jsonReader.endObject();
                return jVar;
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.x
    public void i(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        x q5 = this.f7542a.q(obj.getClass());
        if (q5 instanceof h) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        } else {
            q5.i(jsonWriter, obj);
        }
    }
}
