package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import kotlin.b1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@Stable
@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u00106\u001a\u00020\u0004\u0012\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+07¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u000eJ&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0087@¢\u0006\u0004\b\u000b\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R/\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u00101\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00102\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b2\u0010-R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b3\u00100R\u0011\u00105\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b4\u0010\u0015¨\u0006<"}, d2 = {"Landroidx/compose/material3/DrawerState;", "", "Landroidx/compose/ui/unit/Density;", "requireDensity", "Landroidx/compose/material3/DrawerValue;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "velocity", "Lkotlin/r2;", "animateTo", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/d;)Ljava/lang/Object;", "open", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", ILivePush.ClickType.CLOSE, "anim", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material3/DrawerValue;Lkotlin/coroutines/d;)Ljava/lang/Object;", "requireOffset$material3_release", "()F", "requireOffset", "Landroidx/compose/material3/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material3/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/AnchoredDraggableState;", "Landroidx/compose/runtime/State;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", "()V", "<set-?>", "density$delegate", "Landroidx/compose/runtime/MutableState;", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material3/DrawerValue;", "currentValue", "isAnimationRunning", "getTargetValue", "getCurrentOffset", "currentOffset", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material3/DrawerValue;Lv3/l;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,948:1\n81#2:949\n107#2,2:950\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n*L\n228#1:949\n228#1:950,2\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;

    @p4.l
    private final MutableState density$delegate;

    @p4.l
    private final State<Float> offset;

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/DrawerValue;", "invoke", "(Landroidx/compose/material3/DrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DrawerState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<DrawerValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l DrawerValue drawerValue) {
            return Boolean.TRUE;
        }
    }

    @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DrawerState;", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final Saver<DrawerState, DrawerValue> Saver(@p4.l v3.l<? super DrawerValue, Boolean> lVar) {
            return SaverKt.Saver(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(lVar));
        }
    }

    public DrawerState(@p4.l DrawerValue drawerValue, @p4.l v3.l<? super DrawerValue, Boolean> lVar) {
        TweenSpec tweenSpec;
        MutableState mutableStateOf$default;
        tweenSpec = NavigationDrawerKt.AnimationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, DrawerState$anchoredDraggableState$1.INSTANCE, new DrawerState$anchoredDraggableState$2(this), tweenSpec, lVar);
        this.offset = new State<Float>() { // from class: androidx.compose.material3.DrawerState$offset$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.State
            @p4.l
            public Float getValue() {
                return Float.valueOf(DrawerState.this.getAnchoredDraggableState$material3_release().getOffset());
            }
        };
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.density$delegate = mutableStateOf$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object animateTo$default(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f5, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            animationSpec = NavigationDrawerKt.AnimationSpec;
        }
        if ((i5 & 4) != 0) {
            f5 = drawerState.anchoredDraggableState.getLastVelocity();
        }
        return drawerState.animateTo(drawerValue, animationSpec, f5, dVar);
    }

    @kotlin.k(message = "Please access the offset through currentOffset, which returns the value directly instead of wrapping it in a state object.", replaceWith = @b1(expression = "currentOffset", imports = {}))
    public static /* synthetic */ void getOffset$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density$material3_release = getDensity$material3_release();
        if (density$material3_release != null) {
            return density$material3_release;
        }
        throw new IllegalArgumentException(("The density on BottomDrawerState (" + this + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
    }

    @kotlin.k(message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @p4.m
    public final Object animateTo(@p4.l DrawerValue drawerValue, @p4.l AnimationSpec<Float> animationSpec, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = animateTo$default(this, drawerValue, animationSpec, 0.0f, dVar, 4, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @p4.m
    public final Object close(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = animateTo$default(this, DrawerValue.Closed, null, 0.0f, dVar, 6, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @p4.l
    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @p4.l
    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @p4.m
    public final Density getDensity$material3_release() {
        return (Density) this.density$delegate.getValue();
    }

    @p4.l
    public final State<Float> getOffset() {
        return this.offset;
    }

    @p4.l
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

    @p4.m
    public final Object open(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = animateTo$default(this, DrawerValue.Open, null, 0.0f, dVar, 6, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    public final float requireOffset$material3_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material3_release(@p4.m Density density) {
        this.density$delegate.setValue(density);
    }

    @p4.m
    public final Object snapTo(@p4.l DrawerValue drawerValue, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return snapTo == l5 ? snapTo : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, float f5, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, drawerValue, null, new DrawerState$animateTo$3(this, f5, animationSpec, null), dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return anchoredDrag$default == l5 ? anchoredDrag$default : r2.f19517a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, v3.l lVar, int i5, kotlin.jvm.internal.w wVar) {
        this(drawerValue, (i5 & 2) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }
}
