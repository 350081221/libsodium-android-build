package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J$\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003JR\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR2\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/compose/animation/ChangeSize;", "", "Landroidx/compose/ui/Alignment;", "component1", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/v0;", "name", "fullSize", "component2", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "component3", "", "component4", "alignment", "size", "animationSpec", "clip", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "equals", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "Lv3/l;", "getSize", "()Lv3/l;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "Z", "getClip", "()Z", "<init>", "(Landroidx/compose/ui/Alignment;Lv3/l;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V", "animation_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class ChangeSize {
    public static final int $stable = 0;

    @l
    private final Alignment alignment;

    @l
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;

    @l
    private final v3.l<IntSize, IntSize> size;

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.ChangeSize$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<IntSize, IntSize> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m6206boximpl(m61invokemzRDjE0(intSize.m6218unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m61invokemzRDjE0(long j5) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(@l Alignment alignment, @l v3.l<? super IntSize, IntSize> lVar, @l FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z4) {
        this.alignment = alignment;
        this.size = lVar;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, v3.l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i5 & 2) != 0) {
            lVar = changeSize.size;
        }
        if ((i5 & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i5 & 8) != 0) {
            z4 = changeSize.clip;
        }
        return changeSize.copy(alignment, lVar, finiteAnimationSpec, z4);
    }

    @l
    public final Alignment component1() {
        return this.alignment;
    }

    @l
    public final v3.l<IntSize, IntSize> component2() {
        return this.size;
    }

    @l
    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    @l
    public final ChangeSize copy(@l Alignment alignment, @l v3.l<? super IntSize, IntSize> lVar, @l FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z4) {
        return new ChangeSize(alignment, lVar, finiteAnimationSpec, z4);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return l0.g(this.alignment, changeSize.alignment) && l0.g(this.size, changeSize.size) && l0.g(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    @l
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @l
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    @l
    public final v3.l<IntSize, IntSize> getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + Boolean.hashCode(this.clip);
    }

    @l
    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    public /* synthetic */ ChangeSize(Alignment alignment, v3.l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z4, int i5, w wVar) {
        this(alignment, (i5 & 2) != 0 ? AnonymousClass1.INSTANCE : lVar, finiteAnimationSpec, (i5 & 8) != 0 ? true : z4);
    }
}
