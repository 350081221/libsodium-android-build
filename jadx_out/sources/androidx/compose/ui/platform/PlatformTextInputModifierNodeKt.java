package androidx.compose.ui.platform;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.InternalComposeUiApi;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\b\u001a\u00020\u0004*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t\"(\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/d;", "", "", "Lkotlin/u;", "block", "establishTextInputSession", "(Landroidx/compose/ui/platform/PlatformTextInputModifierNode;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;", "LocalPlatformTextInputMethodOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPlatformTextInputMethodOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPlatformTextInputMethodOverride$annotations", "()V", "ui_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt {

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final ProvidableCompositionLocal<PlatformTextInputSessionHandler> LocalPlatformTextInputMethodOverride = CompositionLocalKt.staticCompositionLocalOf(PlatformTextInputModifierNodeKt$LocalPlatformTextInputMethodOverride$1.INSTANCE);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object establishTextInputSession(@p4.l androidx.compose.ui.platform.PlatformTextInputModifierNode r4, @p4.l v3.p<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.d<?>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<?> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            kotlin.e1.n(r6)
            goto L5d
        L31:
            kotlin.e1.n(r6)
            androidx.compose.ui.Modifier$Node r6 = r4.getNode()
            boolean r6 = r6.isAttached()
            if (r6 == 0) goto L63
            androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r4)
            androidx.compose.runtime.CompositionLocalMap r6 = r6.getCompositionLocalMap()
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.PlatformTextInputSessionHandler> r2 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.LocalPlatformTextInputMethodOverride
            java.lang.Object r6 = r6.get(r2)
            androidx.compose.ui.platform.PlatformTextInputSessionHandler r6 = (androidx.compose.ui.platform.PlatformTextInputSessionHandler) r6
            if (r6 != 0) goto L54
            androidx.compose.ui.node.Owner r6 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r4)
        L54:
            r0.label = r3
            java.lang.Object r4 = r6.textInputSession(r5, r0)
            if (r4 != r1) goto L5d
            return r1
        L5d:
            kotlin.y r4 = new kotlin.y
            r4.<init>()
            throw r4
        L63:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.establishTextInputSession(androidx.compose.ui.platform.PlatformTextInputModifierNode, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalComposeUiApi
    public static final ProvidableCompositionLocal<PlatformTextInputSessionHandler> getLocalPlatformTextInputMethodOverride() {
        return LocalPlatformTextInputMethodOverride;
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getLocalPlatformTextInputMethodOverride$annotations() {
    }
}
