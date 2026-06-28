package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\rHÆ\u0003Ja\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Landroidx/compose/animation/TransitionData;", "", "fade", "Landroidx/compose/animation/Fade;", "slide", "Landroidx/compose/animation/Slide;", "changeSize", "Landroidx/compose/animation/ChangeSize;", "scale", "Landroidx/compose/animation/Scale;", "hold", "", "effectsMap", "", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;ZLjava/util/Map;)V", "getChangeSize", "()Landroidx/compose/animation/ChangeSize;", "getEffectsMap", "()Ljava/util/Map;", "getFade", "()Landroidx/compose/animation/Fade;", "getHold", "()Z", "getScale", "()Landroidx/compose/animation/Scale;", "getSlide", "()Landroidx/compose/animation/Slide;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class TransitionData {
    public static final int $stable = 0;

    @m
    private final ChangeSize changeSize;

    @l
    private final Map<Object, ModifierNodeElement<? extends Modifier.Node>> effectsMap;

    @m
    private final Fade fade;
    private final boolean hold;

    @m
    private final Scale scale;

    @m
    private final Slide slide;

    public TransitionData() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(@m Fade fade, @m Slide slide, @m ChangeSize changeSize, @m Scale scale, boolean z4, @l Map<Object, ? extends ModifierNodeElement<? extends Modifier.Node>> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z4;
        this.effectsMap = map;
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z4, Map map, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i5 & 2) != 0) {
            slide = transitionData.slide;
        }
        Slide slide2 = slide;
        if ((i5 & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        ChangeSize changeSize2 = changeSize;
        if ((i5 & 8) != 0) {
            scale = transitionData.scale;
        }
        Scale scale2 = scale;
        if ((i5 & 16) != 0) {
            z4 = transitionData.hold;
        }
        boolean z5 = z4;
        if ((i5 & 32) != 0) {
            map = transitionData.effectsMap;
        }
        return transitionData.copy(fade, slide2, changeSize2, scale2, z5, map);
    }

    @m
    public final Fade component1() {
        return this.fade;
    }

    @m
    public final Slide component2() {
        return this.slide;
    }

    @m
    public final ChangeSize component3() {
        return this.changeSize;
    }

    @m
    public final Scale component4() {
        return this.scale;
    }

    public final boolean component5() {
        return this.hold;
    }

    @l
    public final Map<Object, ModifierNodeElement<? extends Modifier.Node>> component6() {
        return this.effectsMap;
    }

    @l
    public final TransitionData copy(@m Fade fade, @m Slide slide, @m ChangeSize changeSize, @m Scale scale, boolean z4, @l Map<Object, ? extends ModifierNodeElement<? extends Modifier.Node>> map) {
        return new TransitionData(fade, slide, changeSize, scale, z4, map);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return l0.g(this.fade, transitionData.fade) && l0.g(this.slide, transitionData.slide) && l0.g(this.changeSize, transitionData.changeSize) && l0.g(this.scale, transitionData.scale) && this.hold == transitionData.hold && l0.g(this.effectsMap, transitionData.effectsMap);
    }

    @m
    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    @l
    public final Map<Object, ModifierNodeElement<? extends Modifier.Node>> getEffectsMap() {
        return this.effectsMap;
    }

    @m
    public final Fade getFade() {
        return this.fade;
    }

    public final boolean getHold() {
        return this.hold;
    }

    @m
    public final Scale getScale() {
        return this.scale;
    }

    @m
    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return ((((hashCode3 + (scale != null ? scale.hashCode() : 0)) * 31) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    @l
    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z4, Map map, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : fade, (i5 & 2) != 0 ? null : slide, (i5 & 4) != 0 ? null : changeSize, (i5 & 8) == 0 ? scale : null, (i5 & 16) != 0 ? false : z4, (i5 & 32) != 0 ? a1.z() : map);
    }
}
