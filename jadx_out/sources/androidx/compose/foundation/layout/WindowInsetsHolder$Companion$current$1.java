package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,785:1\n64#2,5:786\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n633#1:786,5\n*E\n"})
/* loaded from: classes.dex */
final class WindowInsetsHolder$Companion$current$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ WindowInsetsHolder $insets;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsHolder$Companion$current$1(WindowInsetsHolder windowInsetsHolder, View view) {
        super(1);
        this.$insets = windowInsetsHolder;
        this.$view = view;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        this.$insets.incrementAccessors(this.$view);
        final WindowInsetsHolder windowInsetsHolder = this.$insets;
        final View view = this.$view;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                WindowInsetsHolder.this.decrementAccessors(view);
            }
        };
    }
}
