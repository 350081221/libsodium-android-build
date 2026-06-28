package com.google.accompanist.permissions;

import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import com.umeng.analytics.pro.bi;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "permissions", "Lcom/google/accompanist/permissions/b;", bi.ay, "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/permissions/b;", "Lcom/google/accompanist/permissions/e;", "b", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "permissions_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class MutableMultiplePermissionsStateKt {

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends n0 implements l<Map<String, Boolean>, r2> {
        final /* synthetic */ d $multiplePermissionsState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.$multiplePermissionsState = dVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Map<String, Boolean> map) {
            invoke2(map);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Boolean> permissionsResult) {
            d dVar = this.$multiplePermissionsState;
            l0.o(permissionsResult, "permissionsResult");
            dVar.j(permissionsResult);
            this.$multiplePermissionsState.i(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends n0 implements l<Boolean, r2> {
        final /* synthetic */ e $permissionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar) {
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
        }
    }

    @com.google.accompanist.permissions.a
    @p4.l
    @Composable
    public static final com.google.accompanist.permissions.b a(@p4.l List<String> permissions, @m Composer composer, int i5) {
        l0.p(permissions, "permissions");
        composer.startReplaceableGroup(-1585749351);
        List<e> b5 = b(permissions, composer, 8);
        PermissionsUtilKt.e(b5, null, composer, 8, 2);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(permissions);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d(b5);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        d dVar = (d) rememberedValue;
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new a(dVar), composer, 8);
        EffectsKt.DisposableEffect(dVar, rememberLauncherForActivityResult, new MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1(dVar, rememberLauncherForActivityResult), composer, ManagedActivityResultLauncher.$stable << 3);
        composer.endReplaceableGroup();
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L6;
     */
    @com.google.accompanist.permissions.a
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<com.google.accompanist.permissions.e> b(java.util.List<java.lang.String> r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            r7 = -1458104751(0xffffffffa9171651, float:-3.3548092E-14)
            r6.startReplaceableGroup(r7)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r7 = r6.consume(r7)
            android.content.Context r7 = (android.content.Context) r7
            android.app.Activity r0 = com.google.accompanist.permissions.PermissionsUtilKt.h(r7)
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r6.startReplaceableGroup(r1)
            boolean r2 = r6.changed(r5)
            java.lang.Object r3 = r6.rememberedValue()
            if (r2 != 0) goto L2c
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L55
        L2c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.u.Y(r5, r2)
            r3.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.accompanist.permissions.e r4 = new com.google.accompanist.permissions.e
            r4.<init>(r2, r7, r0)
            r3.add(r4)
            goto L3d
        L52:
            r6.updateRememberedValue(r3)
        L55:
            r6.endReplaceableGroup()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r5 = r3.iterator()
        L5e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Laf
            java.lang.Object r7 = r5.next()
            com.google.accompanist.permissions.e r7 = (com.google.accompanist.permissions.e) r7
            java.lang.String r0 = r7.d()
            r2 = -1458104231(0xffffffffa9171859, float:-3.3549854E-14)
            r6.startMovableGroup(r2, r0)
            androidx.activity.result.contract.ActivityResultContracts$RequestPermission r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestPermission
            r0.<init>()
            r6.startReplaceableGroup(r1)
            boolean r2 = r6.changed(r7)
            java.lang.Object r4 = r6.rememberedValue()
            if (r2 != 0) goto L8e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r4 != r2) goto L96
        L8e:
            com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$b r4 = new com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$b
            r4.<init>(r7)
            r6.updateRememberedValue(r4)
        L96:
            r6.endReplaceableGroup()
            v3.l r4 = (v3.l) r4
            r2 = 8
            androidx.activity.compose.ManagedActivityResultLauncher r0 = androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(r0, r4, r6, r2)
            com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1 r2 = new com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1
            r2.<init>(r7, r0)
            int r7 = androidx.activity.compose.ManagedActivityResultLauncher.$stable
            androidx.compose.runtime.EffectsKt.DisposableEffect(r0, r2, r6, r7)
            r6.endMovableGroup()
            goto L5e
        Laf:
            r6.endReplaceableGroup()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt.b(java.util.List, androidx.compose.runtime.Composer, int):java.util.List");
    }
}
