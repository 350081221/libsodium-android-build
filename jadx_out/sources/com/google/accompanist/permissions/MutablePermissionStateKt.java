package com.google.accompanist.permissions;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "permission", "Lcom/google/accompanist/permissions/e;", bi.ay, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/permissions/e;", "permissions_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class MutablePermissionStateKt {

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends n0 implements l<Boolean, r2> {
        final /* synthetic */ e $permissionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.$permissionState = eVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke2(bool);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            e eVar = this.$permissionState;
            l0.o(it, "it");
            eVar.j(it.booleanValue());
            this.$permissionState.l(true);
        }
    }

    @com.google.accompanist.permissions.a
    @p4.l
    @Composable
    public static final e a(@p4.l String permission, @m Composer composer, int i5) {
        l0.p(permission, "permission");
        composer.startReplaceableGroup(-1903070366);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(permission);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new e(permission, context, PermissionsUtilKt.h(context));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        e eVar = (e) rememberedValue;
        PermissionsUtilKt.c(eVar, null, composer, 0, 2);
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new a(eVar), composer, 8);
        EffectsKt.DisposableEffect(eVar, rememberLauncherForActivityResult, new MutablePermissionStateKt$rememberMutablePermissionState$1(eVar, rememberLauncherForActivityResult), composer, ManagedActivityResultLauncher.$stable << 3);
        composer.endReplaceableGroup();
        return eVar;
    }
}
