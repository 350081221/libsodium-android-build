package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b*\u0010+J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\u0016\u0010\b\u001a\u00020\u0005HÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\f\u001a\u00020\u000bHÂ\u0003J\u0016\u0010\u0010\u001a\u00020\rHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\f\u0010\u0016\u001a\u00020\u0013*\u00020\u0015H\u0016JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\rHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010!\u001a\u00020 HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u001a\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u001a\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010)\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MarqueeModifierNode;", "", "component1", "Landroidx/compose/foundation/MarqueeAnimationMode;", "component2-ZbEOnfQ", "()I", "component2", "component3", "component4", "Landroidx/compose/foundation/MarqueeSpacing;", "component5", "Landroidx/compose/ui/unit/Dp;", "component6-D9Ej5fM", "()F", "component6", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "iterations", "animationMode", "delayMillis", "initialDelayMillis", "spacing", "velocity", "copy-lWfNwf4", "(IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/foundation/MarqueeModifierElement;", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "I", "Landroidx/compose/foundation/MarqueeSpacing;", "F", "<init>", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;

    @p4.l
    private final MarqueeSpacing spacing;
    private final float velocity;

    private MarqueeModifierElement(int i5, int i6, int i7, int i8, MarqueeSpacing marqueeSpacing, float f5) {
        this.iterations = i5;
        this.animationMode = i6;
        this.delayMillis = i7;
        this.initialDelayMillis = i8;
        this.spacing = marqueeSpacing;
        this.velocity = f5;
    }

    public /* synthetic */ MarqueeModifierElement(int i5, int i6, int i7, int i8, MarqueeSpacing marqueeSpacing, float f5, w wVar) {
        this(i5, i6, i7, i8, marqueeSpacing, f5);
    }

    private final int component1() {
        return this.iterations;
    }

    /* renamed from: component2-ZbEOnfQ, reason: not valid java name */
    private final int m283component2ZbEOnfQ() {
        return this.animationMode;
    }

    private final int component3() {
        return this.delayMillis;
    }

    private final int component4() {
        return this.initialDelayMillis;
    }

    private final MarqueeSpacing component5() {
        return this.spacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m284component6D9Ej5fM() {
        return this.velocity;
    }

    /* renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m285copylWfNwf4$default(MarqueeModifierElement marqueeModifierElement, int i5, int i6, int i7, int i8, MarqueeSpacing marqueeSpacing, float f5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = marqueeModifierElement.iterations;
        }
        if ((i9 & 2) != 0) {
            i6 = marqueeModifierElement.animationMode;
        }
        int i10 = i6;
        if ((i9 & 4) != 0) {
            i7 = marqueeModifierElement.delayMillis;
        }
        int i11 = i7;
        if ((i9 & 8) != 0) {
            i8 = marqueeModifierElement.initialDelayMillis;
        }
        int i12 = i8;
        if ((i9 & 16) != 0) {
            marqueeSpacing = marqueeModifierElement.spacing;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i9 & 32) != 0) {
            f5 = marqueeModifierElement.velocity;
        }
        return marqueeModifierElement.m286copylWfNwf4(i5, i10, i11, i12, marqueeSpacing2, f5);
    }

    @p4.l
    /* renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m286copylWfNwf4(int i5, int i6, int i7, int i8, @p4.l MarqueeSpacing marqueeSpacing, float f5) {
        return new MarqueeModifierElement(i5, i6, i7, i8, marqueeSpacing, f5, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.iterations == marqueeModifierElement.iterations && MarqueeAnimationMode.m275equalsimpl0(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && l0.g(this.spacing, marqueeModifierElement.spacing) && Dp.m6049equalsimpl0(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((Integer.hashCode(this.iterations) * 31) + MarqueeAnimationMode.m276hashCodeimpl(this.animationMode)) * 31) + Integer.hashCode(this.delayMillis)) * 31) + Integer.hashCode(this.initialDelayMillis)) * 31) + this.spacing.hashCode()) * 31) + Dp.m6050hashCodeimpl(this.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.iterations));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m272boximpl(this.animationMode));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        inspectorInfo.getProperties().set("spacing", this.spacing);
        inspectorInfo.getProperties().set("velocity", Dp.m6042boximpl(this.velocity));
    }

    @p4.l
    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + ((Object) MarqueeAnimationMode.m277toStringimpl(this.animationMode)) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + ((Object) Dp.m6055toStringimpl(this.velocity)) + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l MarqueeModifierNode marqueeModifierNode) {
        marqueeModifierNode.m289updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }
}
