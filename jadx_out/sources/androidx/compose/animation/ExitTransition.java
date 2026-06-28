package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.alipay.sdk.m.x.d;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", "()V", "data", "Landroidx/compose/animation/TransitionData;", "getData$animation_release", "()Landroidx/compose/animation/TransitionData;", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "plus", d.f3034z, "toString", "", "Companion", "Landroidx/compose/animation/ExitTransitionImpl;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final ExitTransition KeepUntilTransitionsFinished;

    @l
    private static final ExitTransition None;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "()V", "KeepUntilTransitionsFinished", "Landroidx/compose/animation/ExitTransition;", "getKeepUntilTransitionsFinished$animation_release", "()Landroidx/compose/animation/ExitTransition;", "None", "getNone", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final ExitTransition getKeepUntilTransitionsFinished$animation_release() {
            return ExitTransition.KeepUntilTransitionsFinished;
        }

        @l
        public final ExitTransition getNone() {
            return ExitTransition.None;
        }
    }

    static {
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        Map map = null;
        w wVar = null;
        None = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, false, map, 63, wVar));
        KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, true, map, 47, wVar));
    }

    private ExitTransition() {
    }

    public /* synthetic */ ExitTransition(w wVar) {
        this();
    }

    public boolean equals(@m Object obj) {
        return (obj instanceof ExitTransition) && l0.g(((ExitTransition) obj).getData$animation_release(), getData$animation_release());
    }

    @l
    public abstract TransitionData getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    @Stable
    @l
    public final ExitTransition plus(@l ExitTransition exitTransition) {
        boolean z4;
        Map n02;
        Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = exitTransition.getData$animation_release().getFade();
        }
        Fade fade2 = fade;
        Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = exitTransition.getData$animation_release().getSlide();
        }
        Slide slide2 = slide;
        ChangeSize changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = exitTransition.getData$animation_release().getChangeSize();
        }
        ChangeSize changeSize2 = changeSize;
        Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = exitTransition.getData$animation_release().getScale();
        }
        Scale scale2 = scale;
        if (!getData$animation_release().getHold() && !exitTransition.getData$animation_release().getHold()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z5 = z4;
        n02 = a1.n0(getData$animation_release().getEffectsMap(), exitTransition.getData$animation_release().getEffectsMap());
        return new ExitTransitionImpl(new TransitionData(fade2, slide2, changeSize2, scale2, z5, n02));
    }

    @l
    public String toString() {
        String str;
        String str2;
        String str3;
        if (l0.g(this, None)) {
            return "ExitTransition.None";
        }
        if (l0.g(this, KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        Fade fade = data$animation_release.getFade();
        String str4 = null;
        if (fade != null) {
            str = fade.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        Slide slide = data$animation_release.getSlide();
        if (slide != null) {
            str2 = slide.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = data$animation_release.getChangeSize();
        if (changeSize != null) {
            str3 = changeSize.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        Scale scale = data$animation_release.getScale();
        if (scale != null) {
            str4 = scale.toString();
        }
        sb.append(str4);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(data$animation_release.getHold());
        return sb.toString();
    }
}
