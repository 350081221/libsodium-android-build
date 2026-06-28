package androidx.compose.ui.platform;

import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ ScrollObservationScope $scrollObservationScope;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = scrollObservationScope;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if ((r2 == 0.0f) == false) goto L21;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r7 = this;
            androidx.compose.ui.platform.ScrollObservationScope r0 = r7.$scrollObservationScope
            androidx.compose.ui.semantics.ScrollAxisRange r0 = r0.getHorizontalScrollAxisRange()
            androidx.compose.ui.platform.ScrollObservationScope r1 = r7.$scrollObservationScope
            androidx.compose.ui.semantics.ScrollAxisRange r1 = r1.getVerticalScrollAxisRange()
            androidx.compose.ui.platform.ScrollObservationScope r2 = r7.$scrollObservationScope
            java.lang.Float r2 = r2.getOldXValue()
            androidx.compose.ui.platform.ScrollObservationScope r3 = r7.$scrollObservationScope
            java.lang.Float r3 = r3.getOldYValue()
            r4 = 0
            if (r0 == 0) goto L31
            if (r2 == 0) goto L31
            v3.a r5 = r0.getValue()
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r2 = r2.floatValue()
            float r5 = r5 - r2
            goto L32
        L31:
            r5 = r4
        L32:
            if (r1 == 0) goto L4a
            if (r3 == 0) goto L4a
            v3.a r2 = r1.getValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            float r2 = r2 - r3
            goto L4b
        L4a:
            r2 = r4
        L4b:
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L53
            r3 = r5
            goto L54
        L53:
            r3 = r6
        L54:
            if (r3 == 0) goto L5e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5b
            goto L5c
        L5b:
            r5 = r6
        L5c:
            if (r5 != 0) goto Ldc
        L5e:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = r7.this$0
            androidx.compose.ui.platform.ScrollObservationScope r3 = r7.$scrollObservationScope
            int r3 = r3.getSemanticsNodeId()
            int r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$semanticsNodeIdToAccessibilityVirtualNodeId(r2, r3)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = r7.this$0
            java.util.Map r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getCurrentSemanticsNodes(r3)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r7.this$0
            int r4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getFocusedVirtualViewId$p(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r3
            if (r3 == 0) goto L96
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r7.this$0
            android.view.accessibility.AccessibilityNodeInfo r5 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getCurrentlyFocusedANI$p(r4)     // Catch: java.lang.IllegalStateException -> L94
            if (r5 == 0) goto L96
            android.graphics.Rect r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$boundsInScreen(r4, r3)     // Catch: java.lang.IllegalStateException -> L94
            r5.setBoundsInScreen(r3)     // Catch: java.lang.IllegalStateException -> L94
            kotlin.r2 r3 = kotlin.r2.f19517a     // Catch: java.lang.IllegalStateException -> L94
            goto L96
        L94:
            kotlin.r2 r3 = kotlin.r2.f19517a
        L96:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = r7.this$0
            androidx.compose.ui.platform.AndroidComposeView r3 = r3.getView()
            r3.invalidate()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = r7.this$0
            java.util.Map r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getCurrentSemanticsNodes(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r3.get(r4)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r3
            if (r3 == 0) goto Ldc
            androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
            if (r3 == 0) goto Ldc
            androidx.compose.ui.node.LayoutNode r3 = r3.getLayoutNode$ui_release()
            if (r3 == 0) goto Ldc
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r7.this$0
            if (r0 == 0) goto Lcc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r6 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getPendingHorizontalScrollEvents$p(r4)
            r6.put(r5, r0)
        Lcc:
            if (r1 == 0) goto Ld9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r5 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getPendingVerticalScrollEvents$p(r4)
            r5.put(r2, r1)
        Ld9:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$notifySubtreeAccessibilityStateChangedIfNeeded(r4, r3)
        Ldc:
            if (r0 == 0) goto Led
            androidx.compose.ui.platform.ScrollObservationScope r2 = r7.$scrollObservationScope
            v3.a r0 = r0.getValue()
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r2.setOldXValue(r0)
        Led:
            if (r1 == 0) goto Lfe
            androidx.compose.ui.platform.ScrollObservationScope r0 = r7.$scrollObservationScope
            v3.a r1 = r1.getValue()
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.setOldYValue(r1)
        Lfe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1.invoke2():void");
    }
}
