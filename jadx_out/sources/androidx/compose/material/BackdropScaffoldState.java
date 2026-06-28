package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB?\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0019\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BackdropValue;", "Lkotlin/r2;", "reveal", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "conceal", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "isRevealed", "()Z", "isConcealed", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/material/SnackbarHostState;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BackdropScaffoldState extends SwipeableState<BackdropValue> {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final NestedScrollConnection nestedScrollConnection;

    @l
    private final SnackbarHostState snackbarHostState;

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BackdropValue;", "invoke", "(Landroidx/compose/material/BackdropValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<BackdropValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        @l
        public final Boolean invoke(@l BackdropValue backdropValue) {
            return Boolean.TRUE;
        }
    }

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BackdropScaffoldState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/BackdropValue;", "", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<BackdropScaffoldState, ?> Saver(@l AnimationSpec<Float> animationSpec, @l v3.l<? super BackdropValue, Boolean> lVar, @l SnackbarHostState snackbarHostState) {
            return SaverKt.Saver(BackdropScaffoldState$Companion$Saver$1.INSTANCE, new BackdropScaffoldState$Companion$Saver$2(animationSpec, lVar, snackbarHostState));
        }
    }

    public /* synthetic */ BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, v3.l lVar, SnackbarHostState snackbarHostState, int i5, w wVar) {
        this(backdropValue, (i5 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i5 & 4) != 0 ? AnonymousClass1.INSTANCE : lVar, (i5 & 8) != 0 ? new SnackbarHostState() : snackbarHostState);
    }

    @m
    public final Object conceal(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Concealed, null, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @l
    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    @l
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public final boolean isConcealed() {
        return getCurrentValue() == BackdropValue.Concealed;
    }

    public final boolean isRevealed() {
        return getCurrentValue() == BackdropValue.Revealed;
    }

    @m
    public final Object reveal(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Revealed, null, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    public BackdropScaffoldState(@l BackdropValue backdropValue, @l AnimationSpec<Float> animationSpec, @l v3.l<? super BackdropValue, Boolean> lVar, @l SnackbarHostState snackbarHostState) {
        super(backdropValue, animationSpec, lVar);
        this.snackbarHostState = snackbarHostState;
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }
}
