package androidx.compose.foundation.relocation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0011J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0096@¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/foundation/relocation/BringIntoViewChildNode;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "Lkotlin/r2;", "bringChildIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "responder", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "getResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setResponder", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends BringIntoViewChildNode implements BringIntoViewParent {
    public static final int $stable = 8;

    @l
    private final ModifierLocalMap providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(q1.a(BringIntoViewKt.getModifierLocalBringIntoViewParent(), this));

    @l
    private BringIntoViewResponder responder;

    public BringIntoViewResponderNode(@l BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringChildIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar) {
        Rect invoke;
        LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderNode.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (invoke = aVar.invoke()) == null) {
            return null;
        }
        return BringIntoViewResponderKt.access$localRectOf(layoutCoordinates2, layoutCoordinates, invoke);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    @m
    public Object bringChildIntoView(@l LayoutCoordinates layoutCoordinates, @l a<Rect> aVar, @l d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new BringIntoViewResponderNode$bringChildIntoView$2(this, layoutCoordinates, aVar, new BringIntoViewResponderNode$bringChildIntoView$parentRect$1(this, layoutCoordinates, aVar), null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (g5 == l5) {
            return g5;
        }
        return r2.f19517a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @l
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @l
    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    public final void setResponder(@l BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }
}
