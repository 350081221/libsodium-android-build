package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "Landroidx/compose/ui/unit/TextUnit;", "width", "height", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "placeholderVerticalAlign", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "copy", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "J", "getWidth-XSAIIZE", "()J", "getHeight-XSAIIZE", "I", "getPlaceholderVerticalAlign-J6kI3mc", "()I", "<init>", "(JJILkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
/* loaded from: classes.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    private Placeholder(long j5, long j6, int i5) {
        this.width = j5;
        this.height = j6;
        this.placeholderVerticalAlign = i5;
        if (!TextUnitKt.m6253isUnspecifiedR2X_6o(j5)) {
            if (!TextUnitKt.m6253isUnspecifiedR2X_6o(j6)) {
                return;
            } else {
                throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
            }
        }
        throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
    }

    public /* synthetic */ Placeholder(long j5, long j6, int i5, w wVar) {
        this(j5, j6, i5);
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m5464copyK8Q__8$default(Placeholder placeholder, long j5, long j6, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j5 = placeholder.width;
        }
        long j7 = j5;
        if ((i6 & 2) != 0) {
            j6 = placeholder.height;
        }
        long j8 = j6;
        if ((i6 & 4) != 0) {
            i5 = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m5465copyK8Q__8(j7, j8, i5);
    }

    @l
    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m5465copyK8Q__8(long j5, long j6, int i5) {
        return new Placeholder(j5, j6, i5, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        if (TextUnit.m6232equalsimpl0(this.width, placeholder.width) && TextUnit.m6232equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m5472equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign)) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m5466getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m5467getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m5468getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m6236hashCodeimpl(this.width) * 31) + TextUnit.m6236hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m5473hashCodeimpl(this.placeholderVerticalAlign);
    }

    @l
    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m6242toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m6242toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m5474toStringimpl(this.placeholderVerticalAlign)) + ')';
    }
}
