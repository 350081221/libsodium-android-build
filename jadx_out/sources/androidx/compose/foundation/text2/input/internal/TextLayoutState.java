package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bM\u0010NJ\u0016\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ0\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010 \u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'RC\u0010+\u001a#\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170)\u0012\u0004\u0012\u00020\r\u0018\u00010(¢\u0006\u0002\b*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001d\u00104\u001a\u0004\u0018\u00010\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R/\u0010=\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R/\u0010A\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R/\u0010E\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\bC\u0010:\"\u0004\bD\u0010<R1\u0010L\u001a\u00020F2\u0006\u00106\u001a\u00020F8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bG\u00108\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "", "Landroidx/compose/ui/geometry/Offset;", "coercedInVisibleBoundsOfInputText-MK-Hz9U", "(J)J", "coercedInVisibleBoundsOfInputText", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "softWrap", "Lkotlin/r2;", "updateNonMeasureInputs", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutWithNewMeasureInputs--hBUhpc", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "layoutWithNewMeasureInputs", "position", "coerceInVisibleBounds", "", "getOffsetForPosition-3MmeM6k", "(JZ)I", "getOffsetForPosition", TypedValues.CycleType.S_WAVE_OFFSET, "isPositionOnText-k-4lQ0M", "(J)Z", "isPositionOnText", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;", "layoutCache", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lkotlin/u;", "onTextLayout", "Lv3/p;", "getOnTextLayout", "()Lv3/p;", "setOnTextLayout", "(Lv3/p;)V", "layoutResult$delegate", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<set-?>", "textLayoutNodeCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "getTextLayoutNodeCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setTextLayoutNodeCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "textLayoutNodeCoordinates", "coreNodeCoordinates$delegate", "getCoreNodeCoordinates", "setCoreNodeCoordinates", "coreNodeCoordinates", "decoratorNodeCoordinates$delegate", "getDecoratorNodeCoordinates", "setDecoratorNodeCoordinates", "decoratorNodeCoordinates", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField$delegate", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n154#2:234\n81#3:235\n81#3:236\n107#3,2:237\n81#3:239\n107#3,2:240\n81#3:242\n107#3,2:243\n81#3:245\n107#3,2:246\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutState\n*L\n79#1:234\n45#1:235\n72#1:236\n72#1:237,2\n73#1:239\n73#1:240,2\n74#1:242\n74#1:243,2\n79#1:245\n79#1:246,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutState {
    public static final int $stable = 8;

    @l
    private final MutableState coreNodeCoordinates$delegate;

    @l
    private final MutableState decoratorNodeCoordinates$delegate;

    @l
    private TextFieldLayoutStateCache layoutCache;

    @l
    private final TextFieldLayoutStateCache layoutResult$delegate;

    @l
    private final MutableState minHeightForSingleLineField$delegate;

    @m
    private p<? super Density, ? super v3.a<TextLayoutResult>, r2> onTextLayout;

    @l
    private final MutableState textLayoutNodeCoordinates$delegate;

    public TextLayoutState() {
        MutableState mutableStateOf$default;
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult$delegate = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6042boximpl(Dp.m6044constructorimpl(0)), null, 2, null);
        this.minHeightForSingleLineField$delegate = mutableStateOf$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r2 == null) goto L11;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m1129coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.getTextLayoutNodeCoordinates()
            if (r0 == 0) goto L22
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L1a
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.getDecoratorNodeCoordinates()
            r2 = 0
            if (r1 == 0) goto L20
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L20
        L1a:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L20:
            if (r2 != 0) goto L28
        L22:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L28:
            long r6 = androidx.compose.foundation.text2.input.internal.TextLayoutStateKt.m1136coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.TextLayoutState.m1129coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m1130getOffsetForPosition3MmeM6k$default(TextLayoutState textLayoutState, long j5, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return textLayoutState.m1132getOffsetForPosition3MmeM6k(j5, z4);
    }

    @m
    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates) this.coreNodeCoordinates$delegate.getValue();
    }

    @m
    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates$delegate.getValue();
    }

    @m
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m1131getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m6058unboximpl();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m1132getOffsetForPosition3MmeM6k(long j5, boolean z4) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z4) {
            j5 = m1129coercedInVisibleBoundsOfInputTextMKHz9U(j5);
        }
        return layoutResult.m5517getOffsetForPositionk4lQ0M(TextLayoutStateKt.m1137fromDecorationToTextLayoutUv8p0NA(this, j5));
    }

    @m
    public final p<Density, v3.a<TextLayoutResult>, r2> getOnTextLayout() {
        return this.onTextLayout;
    }

    @m
    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates$delegate.getValue();
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m1133isPositionOnTextk4lQ0M(long j5) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long m1137fromDecorationToTextLayoutUv8p0NA = TextLayoutStateKt.m1137fromDecorationToTextLayoutUv8p0NA(this, m1129coercedInVisibleBoundsOfInputTextMKHz9U(j5));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(Offset.m3494getYimpl(m1137fromDecorationToTextLayoutUv8p0NA));
        if (Offset.m3493getXimpl(m1137fromDecorationToTextLayoutUv8p0NA) < layoutResult.getLineLeft(lineForVerticalPosition) || Offset.m3493getXimpl(m1137fromDecorationToTextLayoutUv8p0NA) > layoutResult.getLineRight(lineForVerticalPosition)) {
            return false;
        }
        return true;
    }

    @l
    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m1134layoutWithNewMeasureInputshBUhpc(@l Density density, @l LayoutDirection layoutDirection, @l FontFamily.Resolver resolver, long j5) {
        TextLayoutResult m1123layoutWithNewMeasureInputshBUhpc = this.layoutCache.m1123layoutWithNewMeasureInputshBUhpc(density, layoutDirection, resolver, j5);
        p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar = this.onTextLayout;
        if (pVar != null) {
            pVar.invoke(density, new TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1(this));
        }
        return m1123layoutWithNewMeasureInputshBUhpc;
    }

    public final void setCoreNodeCoordinates(@m LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void setDecoratorNodeCoordinates(@m LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m1135setMinHeightForSingleLineField0680j_4(float f5) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m6042boximpl(f5));
    }

    public final void setOnTextLayout(@m p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar) {
        this.onTextLayout = pVar;
    }

    public final void setTextLayoutNodeCoordinates(@m LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void updateNonMeasureInputs(@l TransformedTextFieldState transformedTextFieldState, @l TextStyle textStyle, boolean z4, boolean z5) {
        this.layoutCache.updateNonMeasureInputs(transformedTextFieldState, textStyle, z4, z5);
    }
}
