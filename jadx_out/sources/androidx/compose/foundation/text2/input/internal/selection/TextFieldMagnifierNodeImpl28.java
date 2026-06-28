package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\f\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\f\u0010\u0015\u001a\u00020\u0003*\u00020\u0014H\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019R1\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNodeImpl28;", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Lkotlin/r2;", "restartAnimationJob", "onAttach", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textLayoutState", "", "isFocused", "update", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "Z", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", "magnifierSize$delegate", "Landroidx/compose/runtime/MutableState;", "getMagnifierSize-YbymL2g", "()J", "setMagnifierSize-ozmzZPI", "(J)V", "magnifierSize", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/animation/core/AnimationVector2D;", "animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/foundation/MagnifierNode;", "magnifierNode", "Landroidx/compose/foundation/MagnifierNode;", "Lkotlinx/coroutines/l2;", "animationJob", "Lkotlinx/coroutines/l2;", "<init>", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidTextFieldMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNodeImpl28\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n81#2:196\n107#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNodeImpl28\n*L\n52#1:196\n52#1:197,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;

    @l
    private final Animatable<Offset, AnimationVector2D> animatable;

    @m
    private l2 animationJob;
    private boolean isFocused;

    @l
    private final MagnifierNode magnifierNode;

    @l
    private final MutableState magnifierSize$delegate;

    @l
    private TextFieldSelectionState textFieldSelectionState;

    @l
    private TransformedTextFieldState textFieldState;

    @l
    private TextLayoutState textLayoutState;

    public TextFieldMagnifierNodeImpl28(@l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l TextLayoutState textLayoutState, boolean z4) {
        MutableState mutableStateOf$default;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.isFocused = z4;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m6206boximpl(IntSize.Companion.m6219getZeroYbymL2g()), null, 2, null);
        this.magnifierSize$delegate = mutableStateOf$default;
        this.animatable = new Animatable<>(Offset.m3482boximpl(TextFieldMagnifierKt.m1157calculateSelectionMagnifierCenterAndroidhUlJWOE(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, m1160getMagnifierSizeYbymL2g())), SelectionMagnifierKt.getUnspecifiedSafeOffsetVectorConverter(), Offset.m3482boximpl(SelectionMagnifierKt.getOffsetDisplacementThreshold()), null, 8, null);
        this.magnifierNode = (MagnifierNode) delegate(new MagnifierNode(new TextFieldMagnifierNodeImpl28$magnifierNode$1(this), null, new TextFieldMagnifierNodeImpl28$magnifierNode$2(this), 0.0f, true, 0L, 0.0f, 0.0f, false, null, 1002, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMagnifierSize-YbymL2g, reason: not valid java name */
    public final long m1160getMagnifierSizeYbymL2g() {
        return ((IntSize) this.magnifierSize$delegate.getValue()).m6218unboximpl();
    }

    private final void restartAnimationJob() {
        l2 f5;
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.animationJob = null;
        if (this.isFocused && Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            f5 = k.f(getCoroutineScope(), null, null, new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this, null), 3, null);
            this.animationJob = f5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMagnifierSize-ozmzZPI, reason: not valid java name */
    public final void m1161setMagnifierSizeozmzZPI(long j5) {
        this.magnifierSize$delegate.setValue(IntSize.m6206boximpl(j5));
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.magnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.magnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimationJob();
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@l LayoutCoordinates layoutCoordinates) {
        this.magnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode
    public void update(@l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l TextLayoutState textLayoutState, boolean z4) {
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z5 = this.isFocused;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.isFocused = z4;
        if (!l0.g(transformedTextFieldState, transformedTextFieldState2) || !l0.g(textFieldSelectionState, textFieldSelectionState2) || !l0.g(textLayoutState, textLayoutState2) || z4 != z5) {
            restartAnimationJob();
        }
    }
}
