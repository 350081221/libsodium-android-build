package kotlin.reflect;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "upperBound", "Ljava/lang/reflect/Type;", "lowerBound", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "equals", "", "other", "", "getLowerBounds", "", "()[Ljava/lang/reflect/Type;", "getTypeName", "", "getUpperBounds", TTDownloadField.TT_HASHCODE, "", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.r
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
/* loaded from: classes4.dex */
public final class c0 implements WildcardType, y {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static final a f19589c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final c0 f19590d = new c0(null, null);

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final Type f19591a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final Type f19592b;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "()V", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final c0 a() {
            return c0.f19590d;
        }
    }

    public c0(@p4.m Type type, @p4.m Type type2) {
        this.f19591a = type;
        this.f19592b = type2;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @p4.l
    public Type[] getLowerBounds() {
        Type type = this.f19592b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.y
    @p4.l
    public String getTypeName() {
        String j5;
        String j6;
        if (this.f19592b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("? super ");
            j6 = b0.j(this.f19592b);
            sb.append(j6);
            return sb.toString();
        }
        Type type = this.f19591a;
        if (type != null && !l0.g(type, Object.class)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? extends ");
            j5 = b0.j(this.f19591a);
            sb2.append(j5);
            return sb2.toString();
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    @p4.l
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f19591a;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @p4.l
    public String toString() {
        return getTypeName();
    }
}
