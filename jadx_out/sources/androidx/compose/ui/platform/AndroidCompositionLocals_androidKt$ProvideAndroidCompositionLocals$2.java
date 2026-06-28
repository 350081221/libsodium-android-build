package androidx.compose.ui.platform;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;

@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,166:1\n64#2,5:167\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n*L\n104#1:167,5\n*E\n"})
/* loaded from: classes.dex */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2 extends kotlin.jvm.internal.n0 implements v3.l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ DisposableSaveableStateRegistry $saveableStateRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        super(1);
        this.$saveableStateRegistry = disposableSaveableStateRegistry;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        final DisposableSaveableStateRegistry disposableSaveableStateRegistry = this.$saveableStateRegistry;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                DisposableSaveableStateRegistry.this.dispose();
            }
        };
    }
}
