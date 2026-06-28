package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@Stable
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\b\u0001\u0018\u0000 52\u00020\u0001:\u00015B\u0019\u0012\u0006\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u000b¢\u0006\u0004\b2\u00103B\t\b\u0016¢\u0006\u0004\b2\u00104J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J'\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010!\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010$\u001a\u00020\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "Lkotlin/r2;", "update", "", "cursorStart", "cursorEnd", "coerceOffset$foundation_release", "(FFI)V", "coerceOffset", "Landroidx/compose/ui/text/TextRange;", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "getOffsetToFollow", "<set-?>", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "()F", "setOffset", "(F)V", TypedValues.CycleType.S_WAVE_OFFSET, "maximum$delegate", "getMaximum", "setMaximum", "maximum", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "J", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "orientation$delegate", "Landroidx/compose/runtime/MutableState;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "initialOrientation", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,371:1\n76#2:372\n109#2,2:373\n76#2:375\n109#2,2:376\n81#3:378\n107#3,2:379\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n254#1:372\n254#1:373,2\n260#1:375\n260#1:376,2\n275#1:378\n275#1:379,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(TextFieldScrollerPosition$Companion$Saver$1.INSTANCE, TextFieldScrollerPosition$Companion$Saver$2.INSTANCE);

    @l
    private final MutableFloatState maximum$delegate;

    @l
    private final MutableFloatState offset$delegate;

    @l
    private final MutableState orientation$delegate;

    @l
    private Rect previousCursorRect;
    private long previousSelection;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }
    }

    public TextFieldScrollerPosition(@l Orientation orientation, float f5) {
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m5550getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    private final void setMaximum(float f5) {
        this.maximum$delegate.setFloatValue(f5);
    }

    public final void coerceOffset$foundation_release(float f5, float f6, int i5) {
        float f7;
        float offset = getOffset();
        float f8 = i5;
        float f9 = offset + f8;
        if (f6 > f9 || (f5 < offset && f6 - f5 > f8)) {
            f7 = f6 - f9;
        } else if (f5 < offset && f6 - f5 <= f8) {
            f7 = f5 - offset;
        } else {
            f7 = 0.0f;
        }
        setOffset(getOffset() + f7);
    }

    public final float getMaximum() {
        return this.maximum$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m916getOffsetToFollow5zctL8(long j5) {
        if (TextRange.m5545getStartimpl(j5) != TextRange.m5545getStartimpl(this.previousSelection)) {
            return TextRange.m5545getStartimpl(j5);
        }
        if (TextRange.m5540getEndimpl(j5) != TextRange.m5540getEndimpl(this.previousSelection)) {
            return TextRange.m5540getEndimpl(j5);
        }
        return TextRange.m5543getMinimpl(j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m917getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final void setOffset(float f5) {
        this.offset$delegate.setFloatValue(f5);
    }

    public final void setOrientation(@l Orientation orientation) {
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m918setPreviousSelection5zctL8(long j5) {
        this.previousSelection = j5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(@p4.l androidx.compose.foundation.gestures.Orientation r5, @p4.l androidx.compose.ui.geometry.Rect r6, int r7, int r8) {
        /*
            r4 = this;
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.setMaximum(r8)
            float r0 = r6.getLeft()
            androidx.compose.ui.geometry.Rect r1 = r4.previousCursorRect
            float r1 = r1.getLeft()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L2d
            float r0 = r6.getTop()
            androidx.compose.ui.geometry.Rect r3 = r4.previousCursorRect
            float r3 = r3.getTop()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L2a
            r0 = r1
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 != 0) goto L4e
        L2d:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r5 != r0) goto L32
            goto L33
        L32:
            r1 = r2
        L33:
            if (r1 == 0) goto L3a
            float r5 = r6.getTop()
            goto L3e
        L3a:
            float r5 = r6.getLeft()
        L3e:
            if (r1 == 0) goto L45
            float r0 = r6.getBottom()
            goto L49
        L45:
            float r0 = r6.getRight()
        L49:
            r4.coerceOffset$foundation_release(r5, r0, r7)
            r4.previousCursorRect = r6
        L4e:
            float r5 = r4.getOffset()
            r6 = 0
            float r5 = kotlin.ranges.s.H(r5, r6, r8)
            r4.setOffset(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollerPosition.update(androidx.compose.foundation.gestures.Orientation, androidx.compose.ui.geometry.Rect, int, int):void");
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f5, int i5, w wVar) {
        this(orientation, (i5 & 2) != 0 ? 0.0f : f5);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
