package com.google.accompanist.permissions;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
final class MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $launcher;
    final /* synthetic */ e $permissionState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1(e eVar, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher) {
        super(1);
        this.$permissionState = eVar;
        this.$launcher = managedActivityResultLauncher;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope DisposableEffect) {
        l0.p(DisposableEffect, "$this$DisposableEffect");
        this.$permissionState.k(this.$launcher);
        final e eVar = this.$permissionState;
        return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                e.this.k(null);
            }
        };
    }
}
