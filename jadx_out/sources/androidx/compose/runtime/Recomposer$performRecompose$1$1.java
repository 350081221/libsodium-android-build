package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,1564:1\n108#2,7:1565\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n*L\n1152#1:1565,7\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$performRecompose$1$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ ControlledComposition $composition;
    final /* synthetic */ IdentityArraySet<Object> $modifiedValues;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(IdentityArraySet<Object> identityArraySet, ControlledComposition controlledComposition) {
        super(0);
        this.$modifiedValues = identityArraySet;
        this.$composition = controlledComposition;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IdentityArraySet<Object> identityArraySet = this.$modifiedValues;
        ControlledComposition controlledComposition = this.$composition;
        Object[] values = identityArraySet.getValues();
        int size = identityArraySet.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = values[i5];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            controlledComposition.recordWriteOf(obj);
        }
    }
}
