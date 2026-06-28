package com.google.accompanist.permissions;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "permission", "Lcom/google/accompanist/permissions/f;", bi.ay, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/permissions/f;", "permissions_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class g {
    @a
    @l
    @Composable
    public static final f a(@l String permission, @m Composer composer, int i5) {
        l0.p(permission, "permission");
        composer.startReplaceableGroup(1712149548);
        e a5 = MutablePermissionStateKt.a(permission, composer, i5 & 14);
        composer.endReplaceableGroup();
        return a5;
    }
}
