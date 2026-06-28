package androidx.compose.ui.text.font;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "", "name", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
@r1({"SMAP\nDeviceFontFamilyNameFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes.dex */
public final class DeviceFontFamilyName {

    @l
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m5619boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m5620constructorimpl(@l String str) {
        if (str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5621equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && l0.g(str, ((DeviceFontFamilyName) obj).m5625unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5622equalsimpl0(String str, String str2) {
        return l0.g(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5623hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5624toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m5621equalsimpl(this.name, obj);
    }

    @l
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m5623hashCodeimpl(this.name);
    }

    public String toString() {
        return m5624toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m5625unboximpl() {
        return this.name;
    }
}
