package com.google.accompanist.permissions;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
final class MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ManagedActivityResultLauncher<String[], Map<String, Boolean>> $launcher;
    final /* synthetic */ d $multiplePermissionsState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1(d dVar, ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher) {
        super(1);
        this.$multiplePermissionsState = dVar;
        this.$launcher = managedActivityResultLauncher;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope DisposableEffect) {
        l0.p(DisposableEffect, "$this$DisposableEffect");
        this.$multiplePermissionsState.h(this.$launcher);
        final d dVar = this.$multiplePermissionsState;
        return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                d.this.h(null);
            }
        };
    }
}
