package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B;\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "width", "F", "getWidth", "()F", "miter", "getMiter", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "I", "getCap-KaPHkGw", "()I", "Landroidx/compose/ui/graphics/StrokeJoin;", "join", "getJoin-LxFBmk8", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "<init>", "(FFIILandroidx/compose/ui/graphics/PathEffect;Lkotlin/jvm/internal/w;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int DefaultCap = StrokeCap.Companion.m4085getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m4096getMiterLxFBmk8();
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;

    @m
    private final PathEffect pathEffect;
    private final float width;

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "()V", "DefaultCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getDefaultCap-KaPHkGw", "()I", "I", "DefaultJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getDefaultJoin-LxFBmk8", "DefaultMiter", "", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m4343getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m4344getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }
    }

    public /* synthetic */ Stroke(float f5, float f6, int i5, int i6, PathEffect pathEffect, int i7, w wVar) {
        this((i7 & 1) != 0 ? 0.0f : f5, (i7 & 2) != 0 ? 4.0f : f6, (i7 & 4) != 0 ? DefaultCap : i5, (i7 & 8) != 0 ? DefaultJoin : i6, (i7 & 16) != 0 ? null : pathEffect, null);
    }

    public /* synthetic */ Stroke(float f5, float f6, int i5, int i6, PathEffect pathEffect, w wVar) {
        this(f5, f6, i5, i6, pathEffect);
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        if (this.width == stroke.width) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.miter == stroke.miter) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && StrokeCap.m4081equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m4091equalsimpl0(this.join, stroke.join) && l0.g(this.pathEffect, stroke.pathEffect)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m4341getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m4342getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    @m
    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i5;
        int hashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + StrokeCap.m4082hashCodeimpl(this.cap)) * 31) + StrokeJoin.m4092hashCodeimpl(this.join)) * 31;
        PathEffect pathEffect = this.pathEffect;
        if (pathEffect != null) {
            i5 = pathEffect.hashCode();
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    @l
    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m4083toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m4093toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    private Stroke(float f5, float f6, int i5, int i6, PathEffect pathEffect) {
        super(null);
        this.width = f5;
        this.miter = f6;
        this.cap = i5;
        this.join = i6;
        this.pathEffect = pathEffect;
    }
}
