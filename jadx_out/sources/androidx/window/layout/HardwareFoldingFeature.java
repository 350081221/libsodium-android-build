package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0002#$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature;", "Landroidx/window/layout/FoldingFeature;", "featureBounds", "Landroidx/window/core/Bounds;", "type", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "state", "Landroidx/window/layout/FoldingFeature$State;", "(Landroidx/window/core/Bounds;Landroidx/window/layout/HardwareFoldingFeature$Type;Landroidx/window/layout/FoldingFeature$State;)V", "bounds", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "isSeparating", "", "()Z", "occlusionType", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "orientation", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "getType$window_release", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "Companion", "Type", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HardwareFoldingFeature implements FoldingFeature {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final Bounds featureBounds;

    @l
    private final FoldingFeature.State state;

    @l
    private final Type type;

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Companion;", "", "Landroidx/window/core/Bounds;", "bounds", "Lkotlin/r2;", "validateFeatureBounds$window_release", "(Landroidx/window/core/Bounds;)V", "validateFeatureBounds", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final void validateFeatureBounds$window_release(@l Bounds bounds) {
            boolean z4;
            l0.p(bounds, "bounds");
            boolean z5 = false;
            if (bounds.getWidth() == 0 && bounds.getHeight() == 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                if (bounds.getLeft() == 0 || bounds.getTop() == 0) {
                    z5 = true;
                }
                if (z5) {
                    return;
                } else {
                    throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
                }
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type;", "", DownloadProviderHook.COLUMN_DESCRIPTION, "", "(Ljava/lang/String;)V", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Type {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        private static final Type FOLD = new Type("FOLD");

        @l
        private static final Type HINGE = new Type("HINGE");

        @l
        private final String description;

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type$Companion;", "", "()V", "FOLD", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "getFOLD", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "HINGE", "getHINGE", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            @l
            public final Type getFOLD() {
                return Type.FOLD;
            }

            @l
            public final Type getHINGE() {
                return Type.HINGE;
            }
        }

        private Type(String str) {
            this.description = str;
        }

        @l
        public String toString() {
            return this.description;
        }
    }

    public HardwareFoldingFeature(@l Bounds featureBounds, @l Type type, @l FoldingFeature.State state) {
        l0.p(featureBounds, "featureBounds");
        l0.p(type, "type");
        l0.p(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        Companion.validateFeatureBounds$window_release(featureBounds);
    }

    public boolean equals(@m Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!l0.g(HardwareFoldingFeature.class, cls)) {
            return false;
        }
        if (obj != null) {
            HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
            if (l0.g(this.featureBounds, hardwareFoldingFeature.featureBounds) && l0.g(this.type, hardwareFoldingFeature.type) && l0.g(getState(), hardwareFoldingFeature.getState())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    @Override // androidx.window.layout.DisplayFeature
    @l
    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    @l
    public FoldingFeature.OcclusionType getOcclusionType() {
        if (this.featureBounds.getWidth() != 0 && this.featureBounds.getHeight() != 0) {
            return FoldingFeature.OcclusionType.FULL;
        }
        return FoldingFeature.OcclusionType.NONE;
    }

    @Override // androidx.window.layout.FoldingFeature
    @l
    public FoldingFeature.Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return FoldingFeature.Orientation.HORIZONTAL;
        }
        return FoldingFeature.Orientation.VERTICAL;
    }

    @Override // androidx.window.layout.FoldingFeature
    @l
    public FoldingFeature.State getState() {
        return this.state;
    }

    @l
    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        Type type = this.type;
        Type.Companion companion = Type.Companion;
        if (l0.g(type, companion.getHINGE())) {
            return true;
        }
        if (l0.g(this.type, companion.getFOLD()) && l0.g(getState(), FoldingFeature.State.HALF_OPENED)) {
            return true;
        }
        return false;
    }

    @l
    public String toString() {
        return ((Object) HardwareFoldingFeature.class.getSimpleName()) + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
