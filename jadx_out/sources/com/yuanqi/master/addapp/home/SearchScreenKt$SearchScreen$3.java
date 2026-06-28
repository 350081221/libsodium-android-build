package com.yuanqi.master.addapp.home;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusManager;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,447:1\n64#2,5:448\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$3\n*L\n135#1:448,5\n*E\n"})
/* loaded from: classes3.dex */
final class SearchScreenKt$SearchScreen$3 extends n0 implements v3.l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ FocusManager $focusManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchScreenKt$SearchScreen$3(FocusManager focusManager) {
        super(1);
        this.$focusManager = focusManager;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope DisposableEffect) {
        l0.p(DisposableEffect, "$this$DisposableEffect");
        final FocusManager focusManager = this.$focusManager;
        return new DisposableEffectResult() { // from class: com.yuanqi.master.addapp.home.SearchScreenKt$SearchScreen$3$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                FocusManager.clearFocus$default(FocusManager.this, false, 1, null);
            }
        };
    }
}
