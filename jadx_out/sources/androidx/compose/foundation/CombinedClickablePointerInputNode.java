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

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0094@¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/CombinedClickablePointerInputNode;", "Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "pointerInput", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "onClick", "onLongClick", "onDoubleClick", "update", "Lv3/a;", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "interactionData", "<init>", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lv3/a;Lv3/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickablePointerInputNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1070:1\n157#2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickablePointerInputNode\n*L\n1018#1:1071\n*E\n"})
/* loaded from: classes.dex */
public final class CombinedClickablePointerInputNode extends AbstractClickablePointerInputNode {

    @p4.m
    private v3.a<r2> onDoubleClick;

    @p4.m
    private v3.a<r2> onLongClick;

    public CombinedClickablePointerInputNode(boolean z4, @p4.l MutableInteractionSource mutableInteractionSource, @p4.l v3.a<r2> aVar, @p4.l AbstractClickableNode.InteractionData interactionData, @p4.m v3.a<r2> aVar2, @p4.m v3.a<r2> aVar3) {
        super(z4, mutableInteractionSource, aVar, interactionData, null);
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    @p4.m
    public Object pointerInput(@p4.l PointerInputScope pointerInputScope, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        CombinedClickablePointerInputNode$pointerInput$2 combinedClickablePointerInputNode$pointerInput$2;
        CombinedClickablePointerInputNode$pointerInput$3 combinedClickablePointerInputNode$pointerInput$3;
        Object l5;
        AbstractClickableNode.InteractionData interactionData = getInteractionData();
        long m6220getCenterozmzZPI = IntSizeKt.m6220getCenterozmzZPI(pointerInputScope.mo296getSizeYbymL2g());
        interactionData.m174setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m6172getXimpl(m6220getCenterozmzZPI), IntOffset.m6173getYimpl(m6220getCenterozmzZPI)));
        if (getEnabled() && this.onDoubleClick != null) {
            combinedClickablePointerInputNode$pointerInput$2 = new CombinedClickablePointerInputNode$pointerInput$2(this);
        } else {
            combinedClickablePointerInputNode$pointerInput$2 = null;
        }
        if (getEnabled() && this.onLongClick != null) {
            combinedClickablePointerInputNode$pointerInput$3 = new CombinedClickablePointerInputNode$pointerInput$3(this);
        } else {
            combinedClickablePointerInputNode$pointerInput$3 = null;
        }
        Object detectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, combinedClickablePointerInputNode$pointerInput$2, combinedClickablePointerInputNode$pointerInput$3, new CombinedClickablePointerInputNode$pointerInput$4(this, null), new CombinedClickablePointerInputNode$pointerInput$5(this), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (detectTapGestures == l5) {
            return detectTapGestures;
        }
        return r2.f19517a;
    }

    public final void update(boolean z4, @p4.l MutableInteractionSource mutableInteractionSource, @p4.l v3.a<r2> aVar, @p4.m v3.a<r2> aVar2, @p4.m v3.a<r2> aVar3) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        setOnClick(aVar);
        setInteractionSource(mutableInteractionSource);
        boolean z9 = true;
        boolean z10 = false;
        if (getEnabled() != z4) {
            setEnabled(z4);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.onLongClick == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (aVar2 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z6 != z7) {
            z5 = true;
        }
        this.onLongClick = aVar2;
        if (this.onDoubleClick == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (aVar3 == null) {
            z10 = true;
        }
        if (z8 == z10) {
            z9 = z5;
        }
        this.onDoubleClick = aVar3;
        if (z9) {
            resetPointerInputHandler();
        }
    }
}
