package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.b1;
import kotlin.r2;

@Stable
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B;\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u00108\u001a\u00020\f\u0012\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001809\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b;\u0010<BC\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u00108\u001a\u00020\f\u0012\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001809\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b;\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\bJ\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00100\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0011\u00102\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b1\u0010\u001cR\u0011\u00104\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b3\u0010\u001cR\u0016\u00107\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006?"}, d2 = {"Landroidx/compose/material3/SheetState;", "", "Landroidx/compose/ui/unit/Density;", "requireDensity", "", "requireOffset", "Lkotlin/r2;", "expand", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "partialExpand", "show", "hide", "Landroidx/compose/material3/SheetValue;", "targetValue", "velocity", "animateTo$material3_release", "(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/d;)Ljava/lang/Object;", "animateTo", "snapTo$material3_release", "(Landroidx/compose/material3/SheetValue;Lkotlin/coroutines/d;)Ljava/lang/Object;", "snapTo", "settle$material3_release", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "settle", "", "skipPartiallyExpanded", "Z", "getSkipPartiallyExpanded$material3_release", "()Z", "skipHiddenState", "getSkipHiddenState$material3_release", "Landroidx/compose/material3/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material3/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/AnchoredDraggableState;", "setAnchoredDraggableState$material3_release", "(Landroidx/compose/material3/AnchoredDraggableState;)V", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "getCurrentValue", "()Landroidx/compose/material3/SheetValue;", "currentValue", "getTargetValue", "isVisible", "getHasExpandedState", "hasExpandedState", "getHasPartiallyExpandedState", "hasPartiallyExpandedState", "getOffset$material3_release", "()Ljava/lang/Float;", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Lkotlin/Function1;", "confirmValueChange", "<init>", "(ZLandroidx/compose/material3/SheetValue;Lv3/l;Z)V", "(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lv3/l;Z)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SheetState {
    public static final int $stable = 0;

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;

    @p4.m
    private Density density;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SheetValue;", "invoke", "(Landroidx/compose/material3/SheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SheetState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<SheetValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l SheetValue sheetValue) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SheetValue;", "invoke", "(Landroidx/compose/material3/SheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SheetState$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.l<SheetValue, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l SheetValue sheetValue) {
            return Boolean.TRUE;
        }
    }

    @kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\nH\u0007J6\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", "Landroidx/compose/material3/SheetValue;", "skipPartiallyExpanded", "", "confirmValueChange", "Lkotlin/Function1;", "density", "Landroidx/compose/ui/unit/Density;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final Saver<SheetState, SheetValue> Saver(boolean z4, @p4.l v3.l<? super SheetValue, Boolean> lVar, @p4.l Density density) {
            return SaverKt.Saver(SheetState$Companion$Saver$1.INSTANCE, new SheetState$Companion$Saver$2(z4, density, lVar));
        }

        @p4.l
        @kotlin.k(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @b1(expression = "Saver(skipPartiallyExpanded, confirmValueChange, LocalDensity.current)", imports = {}))
        public final Saver<SheetState, SheetValue> Saver(boolean z4, @p4.l v3.l<? super SheetValue, Boolean> lVar) {
            return SaverKt.Saver(SheetState$Companion$Saver$3.INSTANCE, new SheetState$Companion$Saver$4(z4, lVar));
        }
    }

    @kotlin.k(message = "This constructor is deprecated. Please use the constructor that provides a [Density]", replaceWith = @b1(expression = "SheetState(skipPartiallyExpanded, LocalDensity.current, initialValue, confirmValueChange, skipHiddenState)", imports = {}))
    public SheetState(boolean z4, @p4.l SheetValue sheetValue, @p4.l v3.l<? super SheetValue, Boolean> lVar, boolean z5) {
        this.skipPartiallyExpanded = z4;
        this.skipHiddenState = z5;
        if (z4) {
            if (!(sheetValue != SheetValue.PartiallyExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
            }
        }
        if (z5) {
            if (!(sheetValue != SheetValue.Hidden)) {
                throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
            }
        }
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new SheetState$anchoredDraggableState$1(this), new SheetState$anchoredDraggableState$2(this), AnchoredDraggableDefaults.INSTANCE.getAnimationSpec(), lVar);
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f5, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = sheetState.anchoredDraggableState.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f5, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?".toString());
    }

    @p4.m
    public final Object animateTo$material3_release(@p4.l SheetValue sheetValue, float f5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, sheetValue, f5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo == l5 ? animateTo : r2.f19517a;
    }

    @p4.m
    public final Object expand(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SheetValue.Expanded, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @p4.l
    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    @p4.l
    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @p4.m
    public final Density getDensity$material3_release() {
        return this.density;
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    @p4.m
    public final Float getOffset$material3_release() {
        return Float.valueOf(this.anchoredDraggableState.getOffset());
    }

    public final boolean getSkipHiddenState$material3_release() {
        return this.skipHiddenState;
    }

    public final boolean getSkipPartiallyExpanded$material3_release() {
        return this.skipPartiallyExpanded;
    }

    @p4.l
    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @p4.m
    public final Object hide(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (!this.skipHiddenState) {
            Object animateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, dVar, 2, null);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (animateTo$material3_release$default == l5) {
                return animateTo$material3_release$default;
            }
            return r2.f19517a;
        }
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    @p4.m
    public final Object partialExpand(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (!this.skipPartiallyExpanded) {
            Object animateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, dVar, 2, null);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (animateTo$material3_release$default == l5) {
                return animateTo$material3_release$default;
            }
            return r2.f19517a;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableState$material3_release(@p4.l AnchoredDraggableState<SheetValue> anchoredDraggableState) {
        this.anchoredDraggableState = anchoredDraggableState;
    }

    public final void setDensity$material3_release(@p4.m Density density) {
        this.density = density;
    }

    @p4.m
    public final Object settle$material3_release(float f5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object obj = this.anchoredDraggableState.settle(f5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return obj == l5 ? obj : r2.f19517a;
    }

    @p4.m
    public final Object show(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        SheetValue sheetValue;
        Object l5;
        if (getHasPartiallyExpandedState()) {
            sheetValue = SheetValue.PartiallyExpanded;
        } else {
            sheetValue = SheetValue.Expanded;
        }
        Object animateTo$material3_release$default = animateTo$material3_release$default(this, sheetValue, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo$material3_release$default == l5) {
            return animateTo$material3_release$default;
        }
        return r2.f19517a;
    }

    @p4.m
    public final Object snapTo$material3_release(@p4.l SheetValue sheetValue, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, sheetValue, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return snapTo == l5 ? snapTo : r2.f19517a;
    }

    public /* synthetic */ SheetState(boolean z4, SheetValue sheetValue, v3.l lVar, boolean z5, int i5, kotlin.jvm.internal.w wVar) {
        this(z4, (i5 & 2) != 0 ? SheetValue.Hidden : sheetValue, (i5 & 4) != 0 ? AnonymousClass1.INSTANCE : lVar, (i5 & 8) != 0 ? false : z5);
    }

    public /* synthetic */ SheetState(boolean z4, Density density, SheetValue sheetValue, v3.l lVar, boolean z5, int i5, kotlin.jvm.internal.w wVar) {
        this(z4, density, (i5 & 4) != 0 ? SheetValue.Hidden : sheetValue, (i5 & 8) != 0 ? AnonymousClass2.INSTANCE : lVar, (i5 & 16) != 0 ? false : z5);
    }

    @ExperimentalMaterial3Api
    public SheetState(boolean z4, @p4.l Density density, @p4.l SheetValue sheetValue, @p4.l v3.l<? super SheetValue, Boolean> lVar, boolean z5) {
        this(z4, sheetValue, lVar, z5);
        this.density = density;
    }
}
