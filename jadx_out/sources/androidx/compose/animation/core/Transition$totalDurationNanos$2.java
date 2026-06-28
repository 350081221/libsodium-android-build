package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "S", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1382:1\n33#2,6:1383\n33#2,6:1389\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n*L\n469#1:1383,6\n472#1:1389,6\n*E\n"})
/* loaded from: classes.dex */
public final class Transition$totalDurationNanos$2 extends n0 implements v3.a<Long> {
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition<S> transition) {
        super(0);
        this.this$0 = transition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.a
    @l
    public final Long invoke() {
        SnapshotStateList snapshotStateList;
        SnapshotStateList snapshotStateList2;
        snapshotStateList = ((Transition) this.this$0)._animations;
        int size = snapshotStateList.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j5 = Math.max(j5, ((Transition.TransitionAnimationState) snapshotStateList.get(i5)).getDurationNanos$animation_core_release());
        }
        snapshotStateList2 = ((Transition) this.this$0)._transitions;
        int size2 = snapshotStateList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            j5 = Math.max(j5, ((Transition) snapshotStateList2.get(i6)).getTotalDurationNanos());
        }
        return Long.valueOf(j5);
    }
}
