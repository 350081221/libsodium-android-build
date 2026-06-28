package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import kotlin.jvm.internal.r1;

@kotlin.k(message = "Not necessary with the introduction of Slider state")
@Stable
@kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/SliderPositions;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Lkotlin/ranges/f;", "", "<set-?>", "activeRange$delegate", "Landroidx/compose/runtime/MutableState;", "getActiveRange", "()Lkotlin/ranges/f;", "setActiveRange$material3_release", "(Lkotlin/ranges/f;)V", "activeRange", "", "tickFractions$delegate", "getTickFractions", "()[F", "setTickFractions$material3_release", "([F)V", "tickFractions", "initialActiveRange", "initialTickFractions", "<init>", "(Lkotlin/ranges/f;[F)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2151:1\n81#2:2152\n107#2,2:2153\n81#2:2155\n107#2,2:2156\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n*L\n1743#1:2152\n1743#1:2153,2\n1751#1:2155\n1751#1:2156,2\n*E\n"})
/* loaded from: classes.dex */
public final class SliderPositions {
    public static final int $stable = 0;

    @p4.l
    private final MutableState activeRange$delegate;

    @p4.l
    private final MutableState tickFractions$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderPositions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SliderPositions(@p4.l kotlin.ranges.f<Float> fVar, @p4.l float[] fArr) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fVar, null, 2, null);
        this.activeRange$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
        this.tickFractions$delegate = mutableStateOf$default2;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) obj;
        if (kotlin.jvm.internal.l0.g(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions())) {
            return true;
        }
        return false;
    }

    @p4.l
    public final kotlin.ranges.f<Float> getActiveRange() {
        return (kotlin.ranges.f) this.activeRange$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions$delegate.getValue();
    }

    public int hashCode() {
        return (getActiveRange().hashCode() * 31) + Arrays.hashCode(getTickFractions());
    }

    public final void setActiveRange$material3_release(@p4.l kotlin.ranges.f<Float> fVar) {
        this.activeRange$delegate.setValue(fVar);
    }

    public final void setTickFractions$material3_release(@p4.l float[] fArr) {
        this.tickFractions$delegate.setValue(fArr);
    }

    public /* synthetic */ SliderPositions(kotlin.ranges.f fVar, float[] fArr, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? kotlin.ranges.t.e(0.0f, 1.0f) : fVar, (i5 & 2) != 0 ? new float[0] : fArr);
    }
}
