package androidx.compose.ui.platform;

import androidx.savedstate.SavedStateRegistry;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ SavedStateRegistry $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z4, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.$registered = z4;
        this.$androidxRegistry = savedStateRegistry;
        this.$key = str;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$registered) {
            this.$androidxRegistry.unregisterSavedStateProvider(this.$key);
        }
    }
}
