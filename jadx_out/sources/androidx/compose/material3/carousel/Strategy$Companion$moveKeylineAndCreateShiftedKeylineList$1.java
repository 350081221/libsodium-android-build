package androidx.compose.material3.carousel;

import androidx.compose.material3.carousel.Strategy;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material3/carousel/KeylineListScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/Strategy$Companion$moveKeylineAndCreateShiftedKeylineList$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,509:1\n33#2,6:510\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/Strategy$Companion$moveKeylineAndCreateShiftedKeylineList$1\n*L\n362#1:510,6\n*E\n"})
/* loaded from: classes.dex */
public final class Strategy$Companion$moveKeylineAndCreateShiftedKeylineList$1 extends n0 implements l<KeylineListScope, r2> {
    final /* synthetic */ int $dstIndex;
    final /* synthetic */ KeylineList $from;
    final /* synthetic */ int $srcIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Strategy$Companion$moveKeylineAndCreateShiftedKeylineList$1(KeylineList keylineList, int i5, int i6) {
        super(1);
        this.$from = keylineList;
        this.$srcIndex = i5;
        this.$dstIndex = i6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(KeylineListScope keylineListScope) {
        invoke2(keylineListScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l KeylineListScope keylineListScope) {
        List V5;
        List move;
        Strategy.Companion companion = Strategy.Companion;
        V5 = e0.V5(this.$from);
        move = companion.move(V5, this.$srcIndex, this.$dstIndex);
        int size = move.size();
        for (int i5 = 0; i5 < size; i5++) {
            Keyline keyline = (Keyline) move.get(i5);
            keylineListScope.add(keyline.getSize(), keyline.isAnchor());
        }
    }
}
