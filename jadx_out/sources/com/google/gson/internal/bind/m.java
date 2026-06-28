package com.google.gson.internal.bind;

import com.google.gson.internal.bind.i;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.x;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m<T> extends x<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f7578a;

    /* renamed from: b, reason: collision with root package name */
    private final x<T> f7579b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f7580c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(com.google.gson.f fVar, x<T> xVar, Type type) {
        this.f7578a = fVar;
        this.f7579b = xVar;
        this.f7580c = type;
    }

    private Type j(Type type, Object obj) {
        if (obj != null) {
            if (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }

    @Override // com.google.gson.x
    public T e(JsonReader jsonReader) throws IOException {
        return this.f7579b.e(jsonReader);
    }

    @Override // com.google.gson.x
    public void i(JsonWriter jsonWriter, T t5) throws IOException {
        x<T> xVar = this.f7579b;
        Type j5 = j(this.f7580c, t5);
        if (j5 != this.f7580c) {
            xVar = this.f7578a.p(com.google.gson.reflect.a.c(j5));
            if (xVar instanceof i.b) {
                x<T> xVar2 = this.f7579b;
                if (!(xVar2 instanceof i.b)) {
                    xVar = xVar2;
                }
            }
        }
        xVar.i(jsonWriter, t5);
    }
}
