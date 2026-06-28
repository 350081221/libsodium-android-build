package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.google.android.material.color.utilities.Contrast;
import kotlin.b1;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010<\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170=¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\nJ\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u00103\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0006R\u0011\u00105\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u0010.R\u001a\u00108\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0006R\u0011\u00109\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b9\u0010,R\u0011\u0010:\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b:\u0010,R\u0011\u0010;\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b;\u0010,¨\u0006A"}, d2 = {"Landroidx/compose/material/BottomDrawerState;", "", "Landroidx/compose/ui/unit/Density;", "requireDensity", "", "requireOffset$material_release", "()F", "requireOffset", "Lkotlin/r2;", "open", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", ILivePush.ClickType.CLOSE, "expand", "Landroidx/compose/material/BottomDrawerValue;", TypedValues.AttributesType.S_TARGET, "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;FLkotlin/coroutines/d;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/coroutines/d;)Ljava/lang/Object;", "snapTo", b.f22420d, "", "confirmStateChange$material_release", "(Landroidx/compose/material/BottomDrawerValue;)Z", "confirmStateChange", "Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "isOpenEnabled", "()Z", "getTargetValue", "()Landroidx/compose/material/BottomDrawerValue;", "targetValue", "getOffset", "getOffset$annotations", "()V", TypedValues.CycleType.S_WAVE_OFFSET, "getCurrentValue", "currentValue", "getProgress", "getProgress$annotations", "progress", "isOpen", "isClosed", "isExpanded", "initialValue", "Lkotlin/Function1;", "<init>", "(Landroidx/compose/material/BottomDrawerValue;Lv3/l;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomDrawerState {

    @l
    private final AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState;

    @m
    private Density density;

    @l
    private final NestedScrollConnection nestedScrollConnection;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomDrawerValue;", "invoke", "(Landroidx/compose/material/BottomDrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BottomDrawerState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<BottomDrawerValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        @l
        public final Boolean invoke(@l BottomDrawerValue bottomDrawerValue) {
            return Boolean.TRUE;
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007J.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\f"}, d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "density", "Landroidx/compose/ui/unit/Density;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@l Density density, @l v3.l<? super BottomDrawerValue, Boolean> lVar) {
            return SaverKt.Saver(BottomDrawerState$Companion$Saver$1.INSTANCE, new BottomDrawerState$Companion$Saver$2(density, lVar));
        }

        @l
        @k(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @b1(expression = "Saver(density, confirmValueChange)", imports = {}))
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@l v3.l<? super BottomDrawerValue, Boolean> lVar) {
            return SaverKt.Saver(BottomDrawerState$Companion$Saver$3.INSTANCE, new BottomDrawerState$Companion$Saver$4(lVar));
        }
    }

    @k(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @b1(expression = "\n            BottomDrawerState(\n                initialValue = initialValue,\n                density =,\n                confirmStateChange = confirmStateChange\n            )\n            ", imports = {}))
    public BottomDrawerState(@l BottomDrawerValue bottomDrawerValue, @l v3.l<? super BottomDrawerValue, Boolean> lVar) {
        TweenSpec tweenSpec;
        NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection;
        tweenSpec = DrawerKt.AnimationSpec;
        AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState = new AnchoredDraggableState<>(bottomDrawerValue, new BottomDrawerState$anchoredDraggableState$1(this), new BottomDrawerState$anchoredDraggableState$2(this), tweenSpec, lVar);
        this.anchoredDraggableState = anchoredDraggableState;
        ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection = DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(anchoredDraggableState);
        this.nestedScrollConnection = ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection;
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, float f5, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = bottomDrawerState.anchoredDraggableState.getLastVelocity();
        }
        return bottomDrawerState.animateTo$material_release(bottomDrawerValue, f5, dVar);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    private final boolean isOpenEnabled() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(BottomDrawerValue.Open);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BottomDrawerState (" + this + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
    }

    @m
    public final Object animateTo$material_release(@l BottomDrawerValue bottomDrawerValue, float f5, @l d<? super r2> dVar) {
        Object l5;
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomDrawerValue, f5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo == l5 ? animateTo : r2.f19517a;
    }

    @m
    public final Object close(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Closed, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    public final boolean confirmStateChange$material_release(@l BottomDrawerValue bottomDrawerValue) {
        return this.anchoredDraggableState.getConfirmValueChange$material_release().invoke(bottomDrawerValue).booleanValue();
    }

    @m
    public final Object expand(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Expanded, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @l
    public final AnchoredDraggableState<BottomDrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @l
    public final BottomDrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @m
    public final Density getDensity$material_release() {
        return this.density;
    }

    @l
    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @l
    public final BottomDrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isClosed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Closed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Expanded;
    }

    public final boolean isOpen() {
        return this.anchoredDraggableState.getCurrentValue() != BottomDrawerValue.Closed;
    }

    @m
    public final Object open(@l d<? super r2> dVar) {
        BottomDrawerValue bottomDrawerValue;
        Object l5;
        if (isOpenEnabled()) {
            bottomDrawerValue = BottomDrawerValue.Open;
        } else {
            bottomDrawerValue = BottomDrawerValue.Expanded;
        }
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, bottomDrawerValue, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo$default == l5) {
            return animateTo$default;
        }
        return r2.f19517a;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@m Density density) {
        this.density = density;
    }

    @m
    public final Object snapTo$material_release(@l BottomDrawerValue bottomDrawerValue, @l d<? super r2> dVar) {
        Object l5;
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomDrawerValue, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return snapTo == l5 ? snapTo : r2.f19517a;
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, v3.l lVar, int i5, w wVar) {
        this(bottomDrawerValue, (i5 & 2) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }
}
