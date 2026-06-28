package kotlin.reflect;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/GenericArrayTypeImpl;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/TypeImpl;", "elementType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "equals", "", "other", "", "getGenericComponentType", "getTypeName", "", TTDownloadField.TT_HASHCODE, "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.r
/* loaded from: classes4.dex */
public final class a implements GenericArrayType, y {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Type f19586a;

    public a(@p4.l Type elementType) {
        l0.p(elementType, "elementType");
        this.f19586a = elementType;
    }

    public boolean equals(@p4.m Object obj) {
        return (obj instanceof GenericArrayType) && l0.g(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @p4.l
    public Type getGenericComponentType() {
        return this.f19586a;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.y
    @p4.l
    public String getTypeName() {
        String j5;
        StringBuilder sb = new StringBuilder();
        j5 = b0.j(this.f19586a);
        sb.append(j5);
        sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        return sb.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @p4.l
    public String toString() {
        return getTypeName();
    }
}
