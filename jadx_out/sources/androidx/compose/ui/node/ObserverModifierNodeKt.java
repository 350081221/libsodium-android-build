package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "T", "Lkotlin/Function0;", "Lkotlin/r2;", "block", "observeReads", "(Landroidx/compose/ui/Modifier$Node;Lv3/a;)V", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(@l T t5, @l v3.a<r2> aVar) {
        ObserverNodeOwnerScope ownerScope$ui_release = t5.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new ObserverNodeOwnerScope(t5);
            t5.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        DelegatableNodeKt.requireOwner(t5).getSnapshotObserver().observeReads$ui_release(ownerScope$ui_release, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui_release(), aVar);
    }
}
