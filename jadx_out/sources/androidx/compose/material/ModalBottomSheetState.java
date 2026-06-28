package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.color.utilities.Contrast;
import kotlin.b1;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B?\b\u0007\u0012\u0006\u0010:\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e0;¢\u0006\u0004\b=\u0010>B3\b\u0017\u0012\u0006\u0010:\u001a\u00020\f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019\u0012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e0;¢\u0006\u0004\b=\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000b\u0010\u0006J\"\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u00100\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u001a\u00106\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0017R\u0011\u00107\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b7\u0010\"R\u0014\u00109\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\"¨\u0006A"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "Landroidx/compose/ui/unit/Density;", "requireDensity", "Lkotlin/r2;", "show", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "halfExpand$material_release", "halfExpand", "expand$material_release", "expand", "hide", "Landroidx/compose/material/ModalBottomSheetValue;", TypedValues.AttributesType.S_TARGET, "", "velocity", "animateTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;FLkotlin/coroutines/d;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/coroutines/d;)Ljava/lang/Object;", "snapTo", "requireOffset$material_release", "()F", "requireOffset", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "", "isSkipHalfExpanded", "Z", "isSkipHalfExpanded$material_release", "()Z", "Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "getCurrentValue", "()Landroidx/compose/material/ModalBottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "getProgress", "getProgress$annotations", "()V", "progress", "isVisible", "getHasHalfExpandedState$material_release", "hasHalfExpandedState", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;)V", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ModalBottomSheetState {

    @l
    private final AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState;

    @l
    private final AnimationSpec<Float> animationSpec;

    @m
    private Density density;
    private final boolean isSkipHalfExpanded;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\fH\u0007JB\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "skipHalfExpanded", "density", "Landroidx/compose/ui/unit/Density;", "confirmStateChange", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<ModalBottomSheetState, ?> Saver(@l AnimationSpec<Float> animationSpec, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar, boolean z4, @l Density density) {
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$1.INSTANCE, new ModalBottomSheetState$Companion$Saver$2(density, animationSpec, lVar, z4));
        }

        @l
        @k(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @b1(expression = "Saver(animationSpec, confirmValueChange, density, skipHalfExpanded)", imports = {}))
        public final Saver<ModalBottomSheetState, ?> Saver(@l AnimationSpec<Float> animationSpec, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar, boolean z4) {
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$3.INSTANCE, new ModalBottomSheetState$Companion$Saver$4(animationSpec, lVar, z4));
        }

        @l
        @k(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @b1(expression = "Saver(animationSpec, confirmStateChange, skipHalfExpanded)", imports = {}))
        public final Saver<ModalBottomSheetState, ?> Saver(@l AnimationSpec<Float> animationSpec, boolean z4, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar) {
            return Saver(animationSpec, lVar, z4);
        }
    }

    @k(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @b1(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, isSkipHalfExpanded)", imports = {}))
    public ModalBottomSheetState(@l ModalBottomSheetValue modalBottomSheetValue, @l AnimationSpec<Float> animationSpec, boolean z4, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar) {
        this.animationSpec = animationSpec;
        this.isSkipHalfExpanded = z4;
        this.anchoredDraggableState = new AnchoredDraggableState<>(modalBottomSheetValue, new ModalBottomSheetState$anchoredDraggableState$1(this), new ModalBottomSheetState$anchoredDraggableState$2(this), animationSpec, lVar);
        if (z4) {
            if (!(modalBottomSheetValue != ModalBottomSheetValue.HalfExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f5, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = modalBottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f5, dVar);
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
        throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + this + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
    }

    @m
    public final Object animateTo$material_release(@l ModalBottomSheetValue modalBottomSheetValue, float f5, @l d<? super r2> dVar) {
        Object l5;
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, modalBottomSheetValue, f5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo == l5 ? animateTo : r2.f19517a;
    }

    @m
    public final Object expand$material_release(@l d<? super r2> dVar) {
        Object l5;
        DraggableAnchors<ModalBottomSheetValue> anchors = this.anchoredDraggableState.getAnchors();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!anchors.hasAnchorFor(modalBottomSheetValue)) {
            return r2.f19517a;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo$material_release$default == l5) {
            return animateTo$material_release$default;
        }
        return r2.f19517a;
    }

    @l
    public final AnchoredDraggableState<ModalBottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @l
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @l
    public final ModalBottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @m
    public final Density getDensity$material_release() {
        return this.density;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.HalfExpanded);
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @l
    public final ModalBottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @m
    public final Object halfExpand$material_release(@l d<? super r2> dVar) {
        Object l5;
        if (!getHasHalfExpandedState$material_release()) {
            return r2.f19517a;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo$material_release$default == l5) {
            return animateTo$material_release$default;
        }
        return r2.f19517a;
    }

    @m
    public final Object hide(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$material_release$default == l5 ? animateTo$material_release$default : r2.f19517a;
    }

    public final boolean isSkipHalfExpanded$material_release() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@m Density density) {
        this.density = density;
    }

    @m
    public final Object show(@l d<? super r2> dVar) {
        ModalBottomSheetValue modalBottomSheetValue;
        Object l5;
        if (getHasHalfExpandedState$material_release()) {
            modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
        } else {
            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo$material_release$default == l5) {
            return animateTo$material_release$default;
        }
        return r2.f19517a;
    }

    @m
    public final Object snapTo$material_release(@l ModalBottomSheetValue modalBottomSheetValue, @l d<? super r2> dVar) {
        Object l5;
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, modalBottomSheetValue, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return snapTo == l5 ? snapTo : r2.f19517a;
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, boolean z4, v3.l lVar, int i5, w wVar) {
        this(modalBottomSheetValue, (i5 & 2) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i5 & 4) != 0 ? false : z4, lVar);
    }

    @k(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @b1(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    public ModalBottomSheetState(@l ModalBottomSheetValue modalBottomSheetValue, @l AnimationSpec<Float> animationSpec, @l v3.l<? super ModalBottomSheetValue, Boolean> lVar) {
        this(modalBottomSheetValue, animationSpec, false, lVar);
    }
}
