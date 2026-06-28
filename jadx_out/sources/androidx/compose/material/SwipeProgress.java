package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import p4.l;
import p4.m;

@k(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/SwipeProgress;", "T", "", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "fraction", "", "(Ljava/lang/Object;Ljava/lang/Object;F)V", "getFraction", "()F", "getFrom", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTo", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class SwipeProgress<T> {
    public static final int $stable = 0;
    private final float fraction;
    private final T from;
    private final T to;

    public SwipeProgress(T t5, T t6, float f5) {
        this.from = t5;
        this.to = t6;
        this.fraction = f5;
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) obj;
        if (!l0.g(this.from, swipeProgress.from) || !l0.g(this.to, swipeProgress.to)) {
            return false;
        }
        if (this.fraction == swipeProgress.fraction) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final T getFrom() {
        return this.from;
    }

    public final T getTo() {
        return this.to;
    }

    public int hashCode() {
        int i5;
        T t5 = this.from;
        int i6 = 0;
        if (t5 != null) {
            i5 = t5.hashCode();
        } else {
            i5 = 0;
        }
        int i7 = i5 * 31;
        T t6 = this.to;
        if (t6 != null) {
            i6 = t6.hashCode();
        }
        return ((i7 + i6) * 31) + Float.hashCode(this.fraction);
    }

    @l
    public String toString() {
        return "SwipeProgress(from=" + this.from + ", to=" + this.to + ", fraction=" + this.fraction + ')';
    }
}
