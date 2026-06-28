package kotlin.reflect;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "rawType", "Ljava/lang/Class;", "ownerType", "Ljava/lang/reflect/Type;", "typeArguments", "", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "", "[Ljava/lang/reflect/Type;", "equals", "", "other", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "getRawType", "getTypeName", "", TTDownloadField.TT_HASHCODE, "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.r
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
/* loaded from: classes4.dex */
public final class x implements ParameterizedType, y {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Class<?> f19598a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final Type f19599b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final Type[] f19600c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends h0 implements v3.l<Type, String> {
        public static final a INSTANCE = new a();

        a() {
            super(1, b0.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l Type p02) {
            String j5;
            l0.p(p02, "p0");
            j5 = b0.j(p02);
            return j5;
        }
    }

    public x(@p4.l Class<?> rawType, @p4.m Type type, @p4.l List<? extends Type> typeArguments) {
        l0.p(rawType, "rawType");
        l0.p(typeArguments, "typeArguments");
        this.f19598a = rawType;
        this.f19599b = type;
        this.f19600c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (l0.g(this.f19598a, parameterizedType.getRawType()) && l0.g(this.f19599b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @p4.l
    public Type[] getActualTypeArguments() {
        return this.f19600c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @p4.m
    public Type getOwnerType() {
        return this.f19599b;
    }

    @Override // java.lang.reflect.ParameterizedType
    @p4.l
    public Type getRawType() {
        return this.f19598a;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.y
    @p4.l
    public String getTypeName() {
        String j5;
        boolean z4;
        String j6;
        StringBuilder sb = new StringBuilder();
        Type type = this.f19599b;
        if (type != null) {
            j6 = b0.j(type);
            sb.append(j6);
            sb.append("$");
            sb.append(this.f19598a.getSimpleName());
        } else {
            j5 = b0.j(this.f19598a);
            sb.append(j5);
        }
        Type[] typeArr = this.f19600c;
        if (typeArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            kotlin.collections.p.Tg(typeArr, sb, null, "<", ">", 0, null, a.INSTANCE, 50, null);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f19598a.hashCode();
        Type type = this.f19599b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @p4.l
    public String toString() {
        return getTypeName();
    }
}
