package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidDialog_androidKt$Dialog$2 extends n0 implements v3.a<r2> {
    final /* synthetic */ DialogWrapper $dialog;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ v3.a<r2> $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$2(DialogWrapper dialogWrapper, v3.a<r2> aVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        super(0);
        this.$dialog = dialogWrapper;
        this.$onDismissRequest = aVar;
        this.$properties = dialogProperties;
        this.$layoutDirection = layoutDirection;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dialog.updateParameters(this.$onDismissRequest, this.$properties, this.$layoutDirection);
    }
}
