package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1091:1\n64#2,5:1092\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1\n*L\n221#1:1092,5\n*E\n"})
/* loaded from: classes.dex */
final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1 extends kotlin.jvm.internal.n0 implements v3.l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ v3.a<r2> $onKeyboardVisibilityChange;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1(View view, v3.a<r2> aVar) {
        super(1);
        this.$view = view;
        this.$onKeyboardVisibilityChange = aVar;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(this.$view, this.$onKeyboardVisibilityChange);
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.this.dispose();
            }
        };
    }
}
