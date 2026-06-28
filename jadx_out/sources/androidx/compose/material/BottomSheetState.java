package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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

@Stable
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B7\b\u0007\u0012\u0006\u0010/\u001a\u00020\n\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\b00\u0012\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#02¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0006\u0010\t\u001a\u00020\bJ\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0080@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010$\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u001a\u0010+\u001a\u00020\b8GX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010(¨\u00067"}, d2 = {"Landroidx/compose/material/BottomSheetState;", "", "Landroidx/compose/ui/unit/Density;", "requireDensity", "Lkotlin/r2;", "expand", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "collapse", "", "requireOffset", "Landroidx/compose/material/BottomSheetValue;", TypedValues.AttributesType.S_TARGET, "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomSheetValue;FLkotlin/coroutines/d;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/BottomSheetValue;Lkotlin/coroutines/d;)Ljava/lang/Object;", "snapTo", "Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "getCurrentValue", "()Landroidx/compose/material/BottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "", "isExpanded", "()Z", "isCollapsed", "getProgress", "()F", "getProgress$annotations", "()V", "progress", "getOffset", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "confirmValueChange", "<init>", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomSheetState {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final AnchoredDraggableState<BottomSheetValue> anchoredDraggableState;

    @m
    private Density density;

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomSheetValue;", "invoke", "(Landroidx/compose/material/BottomSheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<BottomSheetValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        @l
        public final Boolean invoke(@l BottomSheetValue bottomSheetValue) {
            return Boolean.TRUE;
        }
    }

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/BottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/BottomSheetValue;", "", "density", "Landroidx/compose/ui/unit/Density;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<BottomSheetState, ?> Saver(@l AnimationSpec<Float> animationSpec, @l v3.l<? super BottomSheetValue, Boolean> lVar, @l Density density) {
            return SaverKt.Saver(BottomSheetState$Companion$Saver$1.INSTANCE, new BottomSheetState$Companion$Saver$2(density, animationSpec, lVar));
        }

        @l
        @k(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @b1(expression = "Saver(animationSpec, confirmStateChange, density)", imports = {}))
        public final Saver<BottomSheetState, ?> Saver(@l AnimationSpec<Float> animationSpec, @l v3.l<? super BottomSheetValue, Boolean> lVar) {
            return SaverKt.Saver(BottomSheetState$Companion$Saver$3.INSTANCE, new BottomSheetState$Companion$Saver$4(animationSpec, lVar));
        }
    }

    @k(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @b1(expression = "\n            BottomSheetState(\n                initialValue = initialValue,\n                density = LocalDensity.current,\n                animationSpec = animationSpec,\n                confirmValueChange = confirmValueChange\n            )\n            ", imports = {}))
    public BottomSheetState(@l BottomSheetValue bottomSheetValue, @l AnimationSpec<Float> animationSpec, @l v3.l<? super BottomSheetValue, Boolean> lVar) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(bottomSheetValue, new BottomSheetState$anchoredDraggableState$1(this), new BottomSheetState$anchoredDraggableState$2(this), animationSpec, lVar);
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f5, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = bottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return bottomSheetState.animateTo$material_release(bottomSheetValue, f5, dVar);
    }

    @k(message = "Use requireOffset() to access the offset.", replaceWith = @b1(expression = "requireOffset()", imports = {}))
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BottomSheetState (" + this + ") was not set. Did you use BottomSheetState with the BottomSheetScaffold composable?").toString());
    }

    @m
    public final Object animateTo$material_release(@l BottomSheetValue bottomSheetValue, float f5, @l d<? super r2> dVar) {
        Object l5;
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomSheetValue, f5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo == l5 ? animateTo : r2.f19517a;
    }

    @m
    public final Object collapse(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomSheetValue.Collapsed, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @m
    public final Object expand(@l d<? super r2> dVar) {
        Object l5;
        DraggableAnchors<BottomSheetValue> anchors = this.anchoredDraggableState.getAnchors();
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!anchors.hasAnchorFor(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, bottomSheetValue, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo$default == l5) {
            return animateTo$default;
        }
        return r2.f19517a;
    }

    @l
    public final AnchoredDraggableState<BottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @l
    public final BottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @m
    public final Density getDensity$material_release() {
        return this.density;
    }

    public final float getOffset() {
        throw new IllegalStateException("Use requireOffset() to access the offset.".toString());
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @l
    public final BottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isCollapsed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Collapsed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Expanded;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@m Density density) {
        this.density = density;
    }

    @m
    public final Object snapTo$material_release(@l BottomSheetValue bottomSheetValue, @l d<? super r2> dVar) {
        Object l5;
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomSheetValue, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return snapTo == l5 ? snapTo : r2.f19517a;
    }

    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, v3.l lVar, int i5, w wVar) {
        this(bottomSheetValue, (i5 & 2) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i5 & 4) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }
}
