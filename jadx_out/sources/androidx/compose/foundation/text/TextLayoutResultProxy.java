package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u0016\u0010'\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", b.f22420d, "Landroidx/compose/ui/text/TextLayoutResult;", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "decorationBoxCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getDecorationBoxCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setDecorationBoxCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "innerTextFieldCoordinates", "getInnerTextFieldCoordinates", "setInnerTextFieldCoordinates", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "getLineEnd", "", "lineIndex", "visibleEnd", "", "getLineForVerticalPosition", "vertical", "", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "coerceInVisibleBounds", "getOffsetForPosition-3MmeM6k", "(JZ)I", "isPositionOnText", TypedValues.CycleType.S_WAVE_OFFSET, "isPositionOnText-k-4lQ0M", "(J)Z", "translateDecorationToInnerCoordinates", "translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release", "(J)J", "translateInnerToDecorationCoordinates", "translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release", "coercedInVisibleBoundsOfInputText", "coercedInVisibleBoundsOfInputText-MK-Hz9U", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutResultProxy {
    public static final int $stable = 8;

    @m
    private LayoutCoordinates decorationBoxCoordinates;

    @m
    private LayoutCoordinates innerTextFieldCoordinates;

    @l
    private final TextLayoutResult value;

    public TextLayoutResultProxy(@l TextLayoutResult textLayoutResult) {
        this.value = textLayoutResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2 == null) goto L11;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m927coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L24:
            long r6 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m933access$coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m927coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        return textLayoutResultProxy.getLineEnd(i5, z4);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m928getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j5, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return textLayoutResultProxy.m929getOffsetForPosition3MmeM6k(j5, z4);
    }

    @m
    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    @m
    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i5, boolean z4) {
        return this.value.getLineEnd(i5, z4);
    }

    public final int getLineForVerticalPosition(float f5) {
        return this.value.getLineForVerticalPosition(Offset.m3494getYimpl(m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m927coercedInVisibleBoundsOfInputTextMKHz9U(OffsetKt.Offset(0.0f, f5)))));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m929getOffsetForPosition3MmeM6k(long j5, boolean z4) {
        if (z4) {
            j5 = m927coercedInVisibleBoundsOfInputTextMKHz9U(j5);
        }
        return this.value.m5517getOffsetForPositionk4lQ0M(m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release(j5));
    }

    @l
    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m930isPositionOnTextk4lQ0M(long j5) {
        long m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release = m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m927coercedInVisibleBoundsOfInputTextMKHz9U(j5));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Offset.m3494getYimpl(m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release));
        if (Offset.m3493getXimpl(m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release) >= this.value.getLineLeft(lineForVerticalPosition) && Offset.m3493getXimpl(m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release) <= this.value.getLineRight(lineForVerticalPosition)) {
            return true;
        }
        return false;
    }

    public final void setDecorationBoxCoordinates(@m LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(@m LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    /* renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release(long j5) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            LayoutCoordinates layoutCoordinates3 = null;
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.decorationBoxCoordinates) != null) {
                if (layoutCoordinates.isAttached()) {
                    layoutCoordinates3 = layoutCoordinates;
                }
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates2.mo5006localPositionOfR5De75A(layoutCoordinates3, j5);
                }
                return j5;
            }
            return j5;
        }
        return j5;
    }

    /* renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release(long j5) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            LayoutCoordinates layoutCoordinates3 = null;
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.decorationBoxCoordinates) != null) {
                if (layoutCoordinates.isAttached()) {
                    layoutCoordinates3 = layoutCoordinates;
                }
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates3.mo5006localPositionOfR5De75A(layoutCoordinates2, j5);
                }
                return j5;
            }
            return j5;
        }
        return j5;
    }
}
