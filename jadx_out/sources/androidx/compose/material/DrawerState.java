package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B%\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0.¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J&\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0087@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0011\u0010%\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b&\u0010!R\u001a\u0010\t\u001a\u00020\b8GX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010$R\u001a\u0010,\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0012¨\u00063"}, d2 = {"Landroidx/compose/material/DrawerState;", "", "Landroidx/compose/ui/unit/Density;", "requireDensity", "Lkotlin/r2;", "open", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", ILivePush.ClickType.CLOSE, "Landroidx/compose/material/DrawerValue;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material/DrawerValue;Lkotlin/coroutines/d;)Ljava/lang/Object;", "requireOffset$material_release", "()F", "requireOffset", "Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material/DrawerValue;", "currentValue", "isAnimationRunning", "getTargetValue", "getTargetValue$annotations", "()V", "getOffset", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/DrawerValue;Lv3/l;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;

    @m
    private Density density;

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DrawerValue;", "invoke", "(Landroidx/compose/material/DrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DrawerState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<DrawerValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        @l
        public final Boolean invoke(@l DrawerValue drawerValue) {
            return Boolean.TRUE;
        }
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<DrawerState, DrawerValue> Saver(@l v3.l<? super DrawerValue, Boolean> lVar) {
            return SaverKt.Saver(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(lVar));
        }
    }

    public DrawerState(@l DrawerValue drawerValue, @l v3.l<? super DrawerValue, Boolean> lVar) {
        TweenSpec tweenSpec;
        tweenSpec = DrawerKt.AnimationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new DrawerState$anchoredDraggableState$1(this), new DrawerState$anchoredDraggableState$2(this), tweenSpec, lVar);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    @k(level = kotlin.m.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @ExperimentalMaterialApi
    @m
    public final Object animateTo(@l DrawerValue drawerValue, @l AnimationSpec<Float> animationSpec, @l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, drawerValue, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @m
    public final Object close(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Closed, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @l
    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @l
    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @m
    public final Density getDensity$material_release() {
        return this.density;
    }

    @ExperimentalMaterialApi
    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @l
    @ExperimentalMaterialApi
    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    @m
    public final Object open(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Open, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@m Density density) {
        this.density = density;
    }

    @m
    public final Object snapTo(@l DrawerValue drawerValue, @l d<? super r2> dVar) {
        Object l5;
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return snapTo == l5 ? snapTo : r2.f19517a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, v3.l lVar, int i5, w wVar) {
        this(drawerValue, (i5 & 2) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }
}
