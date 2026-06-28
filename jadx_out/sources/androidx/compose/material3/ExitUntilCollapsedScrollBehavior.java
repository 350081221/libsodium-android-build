package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/material3/ExitUntilCollapsedScrollBehavior;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "Landroidx/compose/material3/TopAppBarState;", "state", "Landroidx/compose/material3/TopAppBarState;", "getState", "()Landroidx/compose/material3/TopAppBarState;", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getFlingAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "Lkotlin/Function0;", "", "canScroll", "Lv3/a;", "getCanScroll", "()Lv3/a;", "isPinned", "Z", "()Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setNestedScrollConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "<init>", "(Landroidx/compose/material3/TopAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lv3/a;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ExitUntilCollapsedScrollBehavior implements TopAppBarScrollBehavior {

    @p4.l
    private final v3.a<Boolean> canScroll;

    @p4.m
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;

    @p4.l
    private NestedScrollConnection nestedScrollConnection;

    @p4.m
    private final AnimationSpec<Float> snapAnimationSpec;

    @p4.l
    private final TopAppBarState state;

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.a<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public ExitUntilCollapsedScrollBehavior(@p4.l TopAppBarState topAppBarState, @p4.m AnimationSpec<Float> animationSpec, @p4.m DecayAnimationSpec<Float> decayAnimationSpec, @p4.l v3.a<Boolean> aVar) {
        this.state = topAppBarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this.canScroll = aVar;
        this.nestedScrollConnection = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(this);
    }

    @p4.l
    public final v3.a<Boolean> getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @p4.m
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @p4.l
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @p4.m
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @p4.l
    public TopAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(@p4.l NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public /* synthetic */ ExitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, v3.a aVar, int i5, kotlin.jvm.internal.w wVar) {
        this(topAppBarState, animationSpec, decayAnimationSpec, (i5 & 8) != 0 ? AnonymousClass1.INSTANCE : aVar);
    }
}
