package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R&\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u0012\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "", "blurRadius", "copy-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Shadow;", "copy", "J", "getColor-0d7_KjU", "()J", "getColor-0d7_KjU$annotations", "()V", "getOffset-F1C5BW0", "getOffset-F1C5BW0$annotations", "F", "getBlurRadius", "()F", "getBlurRadius$annotations", "<init>", "(JJFLkotlin/jvm/internal/w;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class Shadow {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "()V", "None", "Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/graphics/Shadow;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @p4.l
        public final Shadow getNone() {
            return Shadow.None;
        }
    }

    private Shadow(long j5, long j6, float f5) {
        this.color = j5;
        this.offset = j6;
        this.blurRadius = f5;
    }

    public /* synthetic */ Shadow(long j5, long j6, float f5, kotlin.jvm.internal.w wVar) {
        this(j5, j6, f5);
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m4053copyqcb84PM$default(Shadow shadow, long j5, long j6, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = shadow.color;
        }
        long j7 = j5;
        if ((i5 & 2) != 0) {
            j6 = shadow.offset;
        }
        long j8 = j6;
        if ((i5 & 4) != 0) {
            f5 = shadow.blurRadius;
        }
        return shadow.m4056copyqcb84PM(j7, j8, f5);
    }

    @Stable
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @Stable
    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4054getColor0d7_KjU$annotations() {
    }

    @Stable
    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m4055getOffsetF1C5BW0$annotations() {
    }

    @p4.l
    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m4056copyqcb84PM(long j5, long j6, float f5) {
        return new Shadow(j5, j6, f5, null);
    }

    public boolean equals(@p4.m Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        if (!Color.m3735equalsimpl0(this.color, shadow.color) || !Offset.m3490equalsimpl0(this.offset, shadow.offset)) {
            return false;
        }
        if (this.blurRadius == shadow.blurRadius) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4057getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m4058getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m3741hashCodeimpl(this.color) * 31) + Offset.m3495hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    @p4.l
    public String toString() {
        return "Shadow(color=" + ((Object) Color.m3742toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m3501toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    public /* synthetic */ Shadow(long j5, long j6, float f5, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? ColorKt.Color(4278190080L) : j5, (i5 & 2) != 0 ? Offset.Companion.m3509getZeroF1C5BW0() : j6, (i5 & 4) != 0 ? 0.0f : f5, null);
    }
}
