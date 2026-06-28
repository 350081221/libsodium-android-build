package com.airbnb.lottie.compose;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\f\u0010\u0018\u001a\u00020\u0016*\u00020\u0019H\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "create", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimationSizeElement extends ModifierNodeElement<LottieAnimationSizeNode> {

    /* renamed from: a, reason: collision with root package name */
    private final int f1167a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1168b;

    public LottieAnimationSizeElement(int i5, int i6) {
        this.f1167a = i5;
        this.f1168b = i6;
    }

    public static /* synthetic */ LottieAnimationSizeElement b(LottieAnimationSizeElement lottieAnimationSizeElement, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = lottieAnimationSizeElement.f1167a;
        }
        if ((i7 & 2) != 0) {
            i6 = lottieAnimationSizeElement.f1168b;
        }
        return lottieAnimationSizeElement.a(i5, i6);
    }

    @p4.l
    public final LottieAnimationSizeElement a(int i5, int i6) {
        return new LottieAnimationSizeElement(i5, i6);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public LottieAnimationSizeNode create() {
        return new LottieAnimationSizeNode(this.f1167a, this.f1168b);
    }

    public final int component1() {
        return this.f1167a;
    }

    public final int component2() {
        return this.f1168b;
    }

    public final int d() {
        return this.f1168b;
    }

    public final int e() {
        return this.f1167a;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        if (this.f1167a == lottieAnimationSizeElement.f1167a && this.f1168b == lottieAnimationSizeElement.f1168b) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void update(@p4.l LottieAnimationSizeNode node) {
        l0.p(node, "node");
        node.d(this.f1167a);
        node.c(this.f1168b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Integer.hashCode(this.f1167a) * 31) + Integer.hashCode(this.f1168b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        l0.p(inspectorInfo, "<this>");
        inspectorInfo.setName("Lottie Size");
        inspectorInfo.getProperties().set("width", Integer.valueOf(this.f1167a));
        inspectorInfo.getProperties().set("height", Integer.valueOf(this.f1168b));
    }

    @p4.l
    public String toString() {
        return "LottieAnimationSizeElement(width=" + this.f1167a + ", height=" + this.f1168b + ")";
    }
}
