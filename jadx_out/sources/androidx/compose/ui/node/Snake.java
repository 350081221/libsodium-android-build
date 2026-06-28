package androidx.compose.ui.node;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import u3.f;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0018\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\u001d\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0011\u0010\u001f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0011\u0010!\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0011\u0010$\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u0014\u0010(\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0014\u0010*\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#\u0088\u0001\u0016\u0092\u0001\u00020\u0015¨\u0006-"}, d2 = {"Landroidx/compose/ui/node/Snake;", "", "Landroidx/compose/ui/node/IntStack;", "diagonals", "Lkotlin/r2;", "addDiagonalToStack-impl", "([ILandroidx/compose/ui/node/IntStack;)V", "addDiagonalToStack", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "", "hashCode-impl", "([I)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "", "data", "[I", "getData", "()[I", "getStartX-impl", "startX", "getStartY-impl", "startY", "getEndX-impl", "endX", "getEndY-impl", "endY", "getReverse-impl", "([I)Z", "reverse", "getDiagonalSize-impl", "diagonalSize", "getHasAdditionOrRemoval-impl", "hasAdditionOrRemoval", "isAddition-impl", "isAddition", "constructor-impl", "([I)[I", "ui_release"}, k = 1, mv = {1, 8, 0})
@f
/* loaded from: classes.dex */
final class Snake {

    @l
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m5262addDiagonalToStackimpl(int[] iArr, @l IntStack intStack) {
        if (m5270getHasAdditionOrRemovalimpl(iArr)) {
            if (m5271getReverseimpl(iArr)) {
                intStack.pushDiagonal(m5272getStartXimpl(iArr), m5273getStartYimpl(iArr), m5267getDiagonalSizeimpl(iArr));
                return;
            } else if (m5275isAdditionimpl(iArr)) {
                intStack.pushDiagonal(m5272getStartXimpl(iArr), m5273getStartYimpl(iArr) + 1, m5267getDiagonalSizeimpl(iArr));
                return;
            } else {
                intStack.pushDiagonal(m5272getStartXimpl(iArr) + 1, m5273getStartYimpl(iArr), m5267getDiagonalSizeimpl(iArr));
                return;
            }
        }
        intStack.pushDiagonal(m5272getStartXimpl(iArr), m5273getStartYimpl(iArr), m5268getEndXimpl(iArr) - m5272getStartXimpl(iArr));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m5263boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m5264constructorimpl(@l int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5265equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && l0.g(iArr, ((Snake) obj).m5277unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5266equalsimpl0(int[] iArr, int[] iArr2) {
        return l0.g(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m5267getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m5268getEndXimpl(iArr) - m5272getStartXimpl(iArr), m5269getEndYimpl(iArr) - m5273getStartYimpl(iArr));
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m5268getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m5269getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m5270getHasAdditionOrRemovalimpl(int[] iArr) {
        return m5269getEndYimpl(iArr) - m5273getStartYimpl(iArr) != m5268getEndXimpl(iArr) - m5272getStartXimpl(iArr);
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m5271getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m5272getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m5273getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5274hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m5275isAdditionimpl(int[] iArr) {
        return m5269getEndYimpl(iArr) - m5273getStartYimpl(iArr) > m5268getEndXimpl(iArr) - m5272getStartXimpl(iArr);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5276toStringimpl(int[] iArr) {
        return "Snake(" + m5272getStartXimpl(iArr) + ',' + m5273getStartYimpl(iArr) + ',' + m5268getEndXimpl(iArr) + ',' + m5269getEndYimpl(iArr) + ',' + m5271getReverseimpl(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m5265equalsimpl(this.data, obj);
    }

    @l
    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m5274hashCodeimpl(this.data);
    }

    @l
    public String toString() {
        return m5276toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m5277unboximpl() {
        return this.data;
    }
}
