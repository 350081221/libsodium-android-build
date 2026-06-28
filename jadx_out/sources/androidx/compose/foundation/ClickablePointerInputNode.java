package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0094@¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/ClickablePointerInputNode;", "Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "pointerInput", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "onClick", "update", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "interactionData", "<init>", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickablePointerInputNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1070:1\n157#2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickablePointerInputNode\n*L\n980#1:1071\n*E\n"})
/* loaded from: classes.dex */
final class ClickablePointerInputNode extends AbstractClickablePointerInputNode {
    public ClickablePointerInputNode(boolean z4, @p4.l MutableInteractionSource mutableInteractionSource, @p4.l v3.a<r2> aVar, @p4.l AbstractClickableNode.InteractionData interactionData) {
        super(z4, mutableInteractionSource, aVar, interactionData, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    @p4.m
    public Object pointerInput(@p4.l PointerInputScope pointerInputScope, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        AbstractClickableNode.InteractionData interactionData = getInteractionData();
        long m6220getCenterozmzZPI = IntSizeKt.m6220getCenterozmzZPI(pointerInputScope.mo296getSizeYbymL2g());
        interactionData.m174setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m6172getXimpl(m6220getCenterozmzZPI), IntOffset.m6173getYimpl(m6220getCenterozmzZPI)));
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new ClickablePointerInputNode$pointerInput$2(this, null), new ClickablePointerInputNode$pointerInput$3(this), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (detectTapAndPress == l5) {
            return detectTapAndPress;
        }
        return r2.f19517a;
    }

    public final void update(boolean z4, @p4.l MutableInteractionSource mutableInteractionSource, @p4.l v3.a<r2> aVar) {
        setEnabled(z4);
        setOnClick(aVar);
        setInteractionSource(mutableInteractionSource);
    }
}
