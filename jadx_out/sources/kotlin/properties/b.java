package kotlin.properties;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.o;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lkotlin/properties/NotNullVar;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "()V", t0.b.f22420d, "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class b<T> implements f<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    @m
    private T f19515a;

    @Override // kotlin.properties.f, kotlin.properties.e
    @l
    public T getValue(@m Object obj, @l o<?> property) {
        l0.p(property, "property");
        T t5 = this.f19515a;
        if (t5 != null) {
            return t5;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.f
    public void setValue(@m Object obj, @l o<?> property, @l T value) {
        l0.p(property, "property");
        l0.p(value, "value");
        this.f19515a = value;
    }

    @l
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.f19515a != null) {
            str = "value=" + this.f19515a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
