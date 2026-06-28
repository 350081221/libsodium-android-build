package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,740:1\n64#2,5:741\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5\n*L\n153#1:741,5\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ MutableIntState $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5(View view, Ref<LayoutCoordinates> ref, int i5, MutableIntState mutableIntState) {
        super(1);
        this.$view = view;
        this.$coordinates = ref;
        this.$verticalMarginInPx = i5;
        this.$menuHeight$delegate = mutableIntState;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        View view = this.$view;
        final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view, new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$listener$1(view, this.$coordinates, this.$verticalMarginInPx, this.$menuHeight$delegate));
        return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                OnGlobalLayoutListener.this.dispose();
            }
        };
    }
}
