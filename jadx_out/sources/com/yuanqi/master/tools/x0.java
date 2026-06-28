package com.yuanqi.master.tools;

import androidx.compose.runtime.internal.StabilityInferred;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J$\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0011R\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yuanqi/master/tools/MVFast;", "T", "Lkotlin/properties/ReadWriteProperty;", "", DatabaseFileArchive.COLUMN_KEY, "", "def", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", t0.b.f22420d, "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x0<T> implements kotlin.properties.f<Object, T> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f15269c = 0;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final String f15270a;

    /* renamed from: b, reason: collision with root package name */
    private final T f15271b;

    public x0(@p4.l String key, T t5) {
        kotlin.jvm.internal.l0.p(key, "key");
        this.f15270a = key;
        this.f15271b = t5;
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    public T getValue(@p4.m Object obj, @p4.l kotlin.reflect.o<?> property) {
        kotlin.jvm.internal.l0.p(property, "property");
        return (T) w0.f15264a.c(this.f15270a, this.f15271b);
    }

    @Override // kotlin.properties.f
    public void setValue(@p4.m Object obj, @p4.l kotlin.reflect.o<?> property, T t5) {
        kotlin.jvm.internal.l0.p(property, "property");
        w0.f15264a.d(this.f15270a, t5);
    }
}
