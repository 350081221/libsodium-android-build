package androidx.compose.foundation.selection;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ToggleableKt$toggleable$4$1 extends n0 implements a<r2> {
    final /* synthetic */ l<Boolean, r2> $onValueChange;
    final /* synthetic */ boolean $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableKt$toggleable$4$1(l<? super Boolean, r2> lVar, boolean z4) {
        super(0);
        this.$onValueChange = lVar;
        this.$value = z4;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onValueChange.invoke(Boolean.valueOf(!this.$value));
    }
}
