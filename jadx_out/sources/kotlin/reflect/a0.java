package kotlin.reflect;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J%\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000f¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0016¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "(Lkotlin/reflect/KTypeParameter;)V", "equals", "", "other", "", "getAnnotation", "T", "", "annotationClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "getAnnotations", "", "()[Ljava/lang/annotation/Annotation;", "getBounds", "Ljava/lang/reflect/Type;", "()[Ljava/lang/reflect/Type;", "getDeclaredAnnotations", "getGenericDeclaration", "getName", "", "getTypeName", TTDownloadField.TT_HASHCODE, "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.r
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
/* loaded from: classes4.dex */
public final class a0 implements TypeVariable<GenericDeclaration>, y {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final t f19587a;

    public a0(@p4.l t typeParameter) {
        l0.p(typeParameter, "typeParameter");
        this.f19587a = typeParameter;
    }

    @p4.m
    public final <T extends Annotation> T a(@p4.l Class<T> annotationClass) {
        l0.p(annotationClass, "annotationClass");
        return null;
    }

    @p4.l
    public final Annotation[] b() {
        return new Annotation[0];
    }

    @p4.l
    public final Annotation[] c() {
        return new Annotation[0];
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (l0.g(getName(), typeVariable.getName()) && l0.g(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @p4.l
    public Type[] getBounds() {
        int Y;
        Type c5;
        List<s> upperBounds = this.f19587a.getUpperBounds();
        Y = kotlin.collections.x.Y(upperBounds, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            c5 = b0.c((s) it.next(), true);
            arrayList.add(c5);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @p4.l
    public GenericDeclaration getGenericDeclaration() {
        throw new k0("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f19587a));
    }

    @Override // java.lang.reflect.TypeVariable
    @p4.l
    public String getName() {
        return this.f19587a.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.y
    @p4.l
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @p4.l
    public String toString() {
        return getTypeName();
    }
}
