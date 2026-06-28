package com.google.accompanist.permissions;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
final class PermissionsUtilKt$PermissionLifecycleCheckerEffect$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ LifecycleEventObserver $permissionCheckerObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsUtilKt$PermissionLifecycleCheckerEffect$1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        super(1);
        this.$lifecycle = lifecycle;
        this.$permissionCheckerObserver = lifecycleEventObserver;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope DisposableEffect) {
        l0.p(DisposableEffect, "$this$DisposableEffect");
        this.$lifecycle.addObserver(this.$permissionCheckerObserver);
        final Lifecycle lifecycle = this.$lifecycle;
        final LifecycleEventObserver lifecycleEventObserver = this.$permissionCheckerObserver;
        return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Lifecycle.this.removeObserver(lifecycleEventObserver);
            }
        };
    }
}
