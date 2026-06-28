package com.google.accompanist.permissions;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "permissions", "Lcom/google/accompanist/permissions/b;", bi.ay, "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/permissions/b;", "permissions_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class c {
    @a
    @l
    @Composable
    public static final b a(@l List<String> permissions, @m Composer composer, int i5) {
        l0.p(permissions, "permissions");
        composer.startReplaceableGroup(-916785894);
        b a5 = MutableMultiplePermissionsStateKt.a(permissions, composer, 8);
        composer.endReplaceableGroup();
        return a5;
    }
}
