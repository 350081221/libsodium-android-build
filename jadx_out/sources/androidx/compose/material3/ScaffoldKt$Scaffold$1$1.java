package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "consumedWindowInsets", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScaffoldKt$Scaffold$1$1 extends kotlin.jvm.internal.n0 implements v3.l<WindowInsets, r2> {
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ MutableWindowInsets $safeInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$1$1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets) {
        super(1);
        this.$safeInsets = mutableWindowInsets;
        this.$contentWindowInsets = windowInsets;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(WindowInsets windowInsets) {
        invoke2(windowInsets);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l WindowInsets windowInsets) {
        this.$safeInsets.setInsets(WindowInsetsKt.exclude(this.$contentWindowInsets, windowInsets));
    }
}
