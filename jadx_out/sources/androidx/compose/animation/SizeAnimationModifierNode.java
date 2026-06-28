package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.k;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001:\u0001<BQ\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016\u0012:\b\u0002\u0010\"\u001a4\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d¢\u0006\u0004\b:\u0010;J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J&\u0010\u0011\u001a\u00020\u000e*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0005R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cRT\u0010\"\u001a4\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u00020\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00028\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010)\"\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R/\u00109\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/ui/unit/Constraints;", "default", "targetConstraints-ZezNO4M", "(J)J", "targetConstraints", "Lkotlin/r2;", "onReset", "onAttach", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "targetSize", "animateTo-mzRDjE0", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "startSize", "endSize", "listener", "Lv3/p;", "getListener", "()Lv3/p;", "setListener", "(Lv3/p;)V", "lookaheadSize", "J", b.f22420d, "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "", "lookaheadConstraintsAvailable", "Z", "Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "<set-?>", "animData$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;)V", "animData", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Lv3/p;)V", "AnimData", "animation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,237:1\n81#2:238\n107#2,2:239\n56#3,4:241\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n*L\n127#1:238\n127#1:239,2\n155#1:241,4\n*E\n"})
/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    @l
    private final MutableState animData$delegate;

    @l
    private AnimationSpec<IntSize> animationSpec;

    @m
    private p<? super IntSize, ? super IntSize, r2> listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u0016\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "component1", "component2-YbymL2g", "()J", "component2", "anim", "startSize", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Landroidx/compose/animation/core/Animatable;", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "J", "getStartSize-YbymL2g", "setStartSize-ozmzZPI", "(J)V", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/w;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class AnimData {
        public static final int $stable = 8;

        @l
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j5) {
            this.anim = animatable;
            this.startSize = j5;
        }

        public /* synthetic */ AnimData(Animatable animatable, long j5, w wVar) {
            this(animatable, j5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m100copyO0kMr_c$default(AnimData animData, Animatable animatable, long j5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i5 & 2) != 0) {
                j5 = animData.startSize;
            }
            return animData.m102copyO0kMr_c(animatable, j5);
        }

        @l
        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m101component2YbymL2g() {
            return this.startSize;
        }

        @l
        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m102copyO0kMr_c(@l Animatable<IntSize, AnimationVector2D> animatable, long j5) {
            return new AnimData(animatable, j5, null);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return l0.g(this.anim, animData.anim) && IntSize.m6212equalsimpl0(this.startSize, animData.startSize);
        }

        @l
        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m103getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m6215hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m104setStartSizeozmzZPI(long j5) {
            this.startSize = j5;
        }

        @l
        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m6217toStringimpl(this.startSize)) + ')';
        }
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, p pVar, int i5, w wVar) {
        this(animationSpec, (i5 & 2) != 0 ? null : pVar);
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m97setLookaheadConstraintsBRTryo0(long j5) {
        this.lookaheadConstraints = j5;
        this.lookaheadConstraintsAvailable = true;
    }

    /* renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m98targetConstraintsZezNO4M(long j5) {
        if (this.lookaheadConstraintsAvailable) {
            return this.lookaheadConstraints;
        }
        return j5;
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m99animateTomzRDjE0(long j5) {
        AnimData animData = getAnimData();
        if (animData != null) {
            if (!IntSize.m6212equalsimpl0(j5, animData.getAnim().getTargetValue().m6218unboximpl())) {
                animData.m104setStartSizeozmzZPI(animData.getAnim().getValue().m6218unboximpl());
                k.f(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j5, this, null), 3, null);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m6206boximpl(j5), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m6206boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), j5, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m6218unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    @l
    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    @m
    public final p<IntSize, IntSize, r2> getListener() {
        return this.listener;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0;
        if (measureScope.isLookingAhead()) {
            m97setLookaheadConstraintsBRTryo0(j5);
            mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        } else {
            mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(m98targetConstraintsZezNO4M(j5));
        }
        long IntSize = IntSizeKt.IntSize(mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight());
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = IntSize;
        } else {
            if (AnimationModifierKt.m60isValidozmzZPI(this.lookaheadSize)) {
                IntSize = this.lookaheadSize;
            }
            IntSize = ConstraintsKt.m6011constrain4WqzIAM(j5, m99animateTomzRDjE0(IntSize));
        }
        return MeasureScope.layout$default(measureScope, IntSize.m6214getWidthimpl(IntSize), IntSize.m6213getHeightimpl(IntSize), null, new SizeAnimationModifierNode$measure$2(mo4998measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        setAnimData(null);
    }

    public final void setAnimData(@m AnimData animData) {
        this.animData$delegate.setValue(animData);
    }

    public final void setAnimationSpec(@l AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setListener(@m p<? super IntSize, ? super IntSize, r2> pVar) {
        this.listener = pVar;
    }

    public SizeAnimationModifierNode(@l AnimationSpec<IntSize> animationSpec, @m p<? super IntSize, ? super IntSize, r2> pVar) {
        MutableState mutableStateOf$default;
        this.animationSpec = animationSpec;
        this.listener = pVar;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animData$delegate = mutableStateOf$default;
    }
}
