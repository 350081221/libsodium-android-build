package kotlin.jvm.internal;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "moduleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "getJClass", "()Ljava/lang/Class;", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.g1(version = "1.1")
/* loaded from: classes4.dex */
public final class b1 implements t {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Class<?> f19393a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final String f19394b;

    public b1(@p4.l Class<?> jClass, @p4.l String moduleName) {
        l0.p(jClass, "jClass");
        l0.p(moduleName, "moduleName");
        this.f19393a = jClass;
        this.f19394b = moduleName;
    }

    @Override // kotlin.reflect.h
    @p4.l
    public Collection<kotlin.reflect.c<?>> a() {
        throw new u3.q();
    }

    public boolean equals(@p4.m Object obj) {
        return (obj instanceof b1) && l0.g(p(), ((b1) obj).p());
    }

    public int hashCode() {
        return p().hashCode();
    }

    @Override // kotlin.jvm.internal.t
    @p4.l
    public Class<?> p() {
        return this.f19393a;
    }

    @p4.l
    public String toString() {
        return p().toString() + " (Kotlin reflection is not available)";
    }
}
