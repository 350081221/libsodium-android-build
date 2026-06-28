package androidx.compose.material3;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class CheckboxKt$Checkbox$2$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ v3.l<Boolean, r2> $onCheckedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckboxKt$Checkbox$2$1(v3.l<? super Boolean, r2> lVar, boolean z4) {
        super(0);
        this.$onCheckedChange = lVar;
        this.$checked = z4;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onCheckedChange.invoke(Boolean.valueOf(!this.$checked));
    }
}
