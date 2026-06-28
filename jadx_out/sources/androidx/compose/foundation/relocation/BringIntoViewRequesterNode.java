package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/foundation/relocation/BringIntoViewChildNode;", "Lkotlin/r2;", "disposeRequester", "onAttach", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "requester", "updateRequester", "onDetach", "Landroidx/compose/ui/geometry/Rect;", "rect", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,197:1\n728#2,2:198\n735#2,2:200\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n*L\n168#1:198,2\n175#1:200,2\n*E\n"})
/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode extends BringIntoViewChildNode {
    public static final int $stable = 8;

    @l
    private BringIntoViewRequester requester;

    public BringIntoViewRequesterNode(@l BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    private final void disposeRequester() {
        BringIntoViewRequester bringIntoViewRequester = this.requester;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            l0.n(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().remove(this);
        }
    }

    @m
    public final Object bringIntoView(@m Rect rect, @l d<? super r2> dVar) {
        Object l5;
        BringIntoViewParent parent = getParent();
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return r2.f19517a;
        }
        Object bringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new BringIntoViewRequesterNode$bringIntoView$2(rect, this), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return bringChildIntoView == l5 ? bringChildIntoView : r2.f19517a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.requester);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeRequester();
    }

    public final void updateRequester(@l BringIntoViewRequester bringIntoViewRequester) {
        disposeRequester();
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().add(this);
        }
        this.requester = bringIntoViewRequester;
    }
}
