package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.Density;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.b;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0099\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u00019\u001aH\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\u001a\\\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"J\u0010#\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0012\u0004\u0018\u00010!0\u0019¢\u0006\u0002\b\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\" \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u001a\u0010-\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0014\u00102\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103\"\u001a\u00105\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "scrollable", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitScrollEvent", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "CanDragCalculation", "Lv3/l;", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/v0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "NoOpOnDragStarted", "Lv3/q;", "Landroidx/compose/foundation/gestures/ScrollScope;", "NoOpScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalScrollableContainer", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalScrollableContainer", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "NoOpFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getNoOpFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "", "DefaultScrollMotionDurationScaleFactor", "F", "Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "androidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1", "UnityDensity", "Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;

    @l
    private static final v3.l<PointerInputChange, Boolean> CanDragCalculation = ScrollableKt$CanDragCalculation$1.INSTANCE;

    @l
    private static final q<s0, Offset, d<? super r2>, Object> NoOpOnDragStarted = new ScrollableKt$NoOpOnDragStarted$1(null);

    @l
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f5) {
            return f5;
        }
    };

    @l
    private static final ProvidableModifierLocal<Boolean> ModifierLocalScrollableContainer = ModifierLocalKt.modifierLocalOf(ScrollableKt$ModifierLocalScrollableContainer$1.INSTANCE);

    @l
    private static final FlingBehavior NoOpFlingBehavior = new FlingBehavior() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpFlingBehavior$1
        @Override // androidx.compose.foundation.gestures.FlingBehavior
        @m
        public Object performFling(@l ScrollScope scrollScope, float f5, @l d<? super Float> dVar) {
            return b.e(0.0f);
        }
    };

    @l
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        public <R> R fold(R r5, @l p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r5, pVar);
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        @m
        public <E extends g.b> E get(@l g.c<E> cVar) {
            return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        @l
        public g minusKey(@l g.c<?> cVar) {
            return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
        }

        @Override // kotlin.coroutines.g
        @l
        public g plus(@l g gVar) {
            return MotionDurationScale.DefaultImpls.plus(this, gVar);
        }
    };

    @l
    private static final ScrollableKt$UnityDensity$1 UnityDensity = new Density() { // from class: androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1
        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }
    };

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerEvent> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.e1.n(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e1.n(r6)
        L38:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
            int r2 = r6.m4814getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.Companion
            int r4 = r4.m4830getScroll7fucELk()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventType.m4821equalsimpl0(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    @l
    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return ModifierLocalScrollableContainer;
    }

    @l
    public static final FlingBehavior getNoOpFlingBehavior() {
        return NoOpFlingBehavior;
    }

    @Stable
    @l
    public static final Modifier scrollable(@l Modifier modifier, @l ScrollableState scrollableState, @l Orientation orientation, boolean z4, boolean z5, @m FlingBehavior flingBehavior, @m MutableInteractionSource mutableInteractionSource) {
        return scrollable$default(modifier, scrollableState, orientation, null, z4, z5, flingBehavior, mutableInteractionSource, null, 128, null);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z4, boolean z5, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        boolean z6 = z4;
        if ((i5 & 8) != 0) {
            z5 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z6, z5, (i5 & 16) != 0 ? null : flingBehavior, (i5 & 32) != 0 ? null : mutableInteractionSource);
    }

    @Stable
    @l
    @ExperimentalFoundationApi
    public static final Modifier scrollable(@l Modifier modifier, @l ScrollableState scrollableState, @l Orientation orientation, @m OverscrollEffect overscrollEffect, boolean z4, boolean z5, @m FlingBehavior flingBehavior, @m MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec) {
        return modifier.then(new ScrollableElement(scrollableState, orientation, overscrollEffect, z4, z5, flingBehavior, mutableInteractionSource, bringIntoViewSpec));
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z4, boolean z5, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, int i5, Object obj) {
        return scrollable(modifier, scrollableState, orientation, overscrollEffect, (i5 & 8) != 0 ? true : z4, (i5 & 16) != 0 ? false : z5, (i5 & 32) != 0 ? null : flingBehavior, (i5 & 64) != 0 ? null : mutableInteractionSource, (i5 & 128) != 0 ? ScrollableDefaults.INSTANCE.bringIntoViewSpec() : bringIntoViewSpec);
    }
}
