package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0016\u0010\u0007\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b \u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "", "", "component1", "Landroidx/compose/ui/geometry/Offset;", "component2-F1C5BW0", "()J", "component2", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "component3", "component4", "visible", "position", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "handlesCrossed", "copy-ubNVwUQ", "(ZJLandroidx/compose/ui/text/style/ResolvedTextDirection;Z)Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "equals", "Z", "getVisible", "()Z", "J", "getPosition-F1C5BW0", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getDirection", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getHandlesCrossed", "<init>", "(ZJLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLkotlin/jvm/internal/w;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldHandleState {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final TextFieldHandleState Hidden = new TextFieldHandleState(false, Offset.Companion.m3508getUnspecifiedF1C5BW0(), ResolvedTextDirection.Ltr, false, null);

    @l
    private final ResolvedTextDirection direction;
    private final boolean handlesCrossed;
    private final long position;
    private final boolean visible;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;", "", "()V", "Hidden", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "getHidden", "()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final TextFieldHandleState getHidden() {
            return TextFieldHandleState.Hidden;
        }
    }

    private TextFieldHandleState(boolean z4, long j5, ResolvedTextDirection resolvedTextDirection, boolean z5) {
        this.visible = z4;
        this.position = j5;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z5;
    }

    public /* synthetic */ TextFieldHandleState(boolean z4, long j5, ResolvedTextDirection resolvedTextDirection, boolean z5, w wVar) {
        this(z4, j5, resolvedTextDirection, z5);
    }

    /* renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldHandleState m1153copyubNVwUQ$default(TextFieldHandleState textFieldHandleState, boolean z4, long j5, ResolvedTextDirection resolvedTextDirection, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = textFieldHandleState.visible;
        }
        if ((i5 & 2) != 0) {
            j5 = textFieldHandleState.position;
        }
        long j6 = j5;
        if ((i5 & 4) != 0) {
            resolvedTextDirection = textFieldHandleState.direction;
        }
        ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
        if ((i5 & 8) != 0) {
            z5 = textFieldHandleState.handlesCrossed;
        }
        return textFieldHandleState.m1155copyubNVwUQ(z4, j6, resolvedTextDirection2, z5);
    }

    public final boolean component1() {
        return this.visible;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1154component2F1C5BW0() {
        return this.position;
    }

    @l
    public final ResolvedTextDirection component3() {
        return this.direction;
    }

    public final boolean component4() {
        return this.handlesCrossed;
    }

    @l
    /* renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final TextFieldHandleState m1155copyubNVwUQ(boolean z4, long j5, @l ResolvedTextDirection resolvedTextDirection, boolean z5) {
        return new TextFieldHandleState(z4, j5, resolvedTextDirection, z5, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.visible == textFieldHandleState.visible && Offset.m3490equalsimpl0(this.position, textFieldHandleState.position) && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    @l
    public final ResolvedTextDirection getDirection() {
        return this.direction;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1156getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.visible) * 31) + Offset.m3495hashCodeimpl(this.position)) * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.handlesCrossed);
    }

    @l
    public String toString() {
        return "TextFieldHandleState(visible=" + this.visible + ", position=" + ((Object) Offset.m3501toStringimpl(this.position)) + ", direction=" + this.direction + ", handlesCrossed=" + this.handlesCrossed + ')';
    }
}
