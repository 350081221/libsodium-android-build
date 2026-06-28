package com.google.gson.internal.bind;

import com.google.gson.t;
import com.google.gson.x;
import com.google.gson.y;

/* loaded from: classes2.dex */
public final class d implements y {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f7523a;

    public d(com.google.gson.internal.c cVar) {
        this.f7523a = cVar;
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        q1.b bVar = (q1.b) aVar.f().getAnnotation(q1.b.class);
        if (bVar == null) {
            return null;
        }
        return (x<T>) b(this.f7523a, fVar, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x<?> b(com.google.gson.internal.c cVar, com.google.gson.f fVar, com.google.gson.reflect.a<?> aVar, q1.b bVar) {
        t tVar;
        x<?> lVar;
        Object a5 = cVar.a(com.google.gson.reflect.a.b(bVar.value())).a();
        if (a5 instanceof x) {
            lVar = (x) a5;
        } else if (a5 instanceof y) {
            lVar = ((y) a5).a(fVar, aVar);
        } else {
            boolean z4 = a5 instanceof t;
            if (!z4 && !(a5 instanceof com.google.gson.k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a5.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            com.google.gson.k kVar = null;
            if (z4) {
                tVar = (t) a5;
            } else {
                tVar = null;
            }
            if (a5 instanceof com.google.gson.k) {
                kVar = (com.google.gson.k) a5;
            }
            lVar = new l<>(tVar, kVar, fVar, aVar, null);
        }
        if (lVar != null && bVar.nullSafe()) {
            return lVar.d();
        }
        return lVar;
    }
}
