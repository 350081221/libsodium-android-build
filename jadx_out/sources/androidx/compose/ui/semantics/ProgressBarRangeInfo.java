package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.f;
import kotlin.ranges.t;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "current", "F", "getCurrent", "()F", "Lkotlin/ranges/f;", "range", "Lkotlin/ranges/f;", "getRange", "()Lkotlin/ranges/f;", "steps", "I", "getSteps", "()I", "<init>", "(FLkotlin/ranges/f;I)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1469:1\n1#2:1470\n*E\n"})
/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final ProgressBarRangeInfo Indeterminate;
    private final float current;

    @l
    private final f<Float> range;
    private final int steps;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo$Companion;", "", "()V", "Indeterminate", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getIndeterminate", "()Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }
    }

    static {
        f e5;
        e5 = t.e(0.0f, 0.0f);
        Indeterminate = new ProgressBarRangeInfo(0.0f, e5, 0, 4, null);
    }

    public ProgressBarRangeInfo(float f5, @l f<Float> fVar, int i5) {
        this.current = f5;
        this.range = fVar;
        this.steps = i5;
        if (!(!Float.isNaN(f5))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        if (this.current == progressBarRangeInfo.current) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && l0.g(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps) {
            return true;
        }
        return false;
    }

    public final float getCurrent() {
        return this.current;
    }

    @l
    public final f<Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((Float.hashCode(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    @l
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }

    public /* synthetic */ ProgressBarRangeInfo(float f5, f fVar, int i5, int i6, w wVar) {
        this(f5, fVar, (i6 & 4) != 0 ? 0 : i5);
    }
}
