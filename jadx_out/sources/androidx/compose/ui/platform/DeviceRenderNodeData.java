package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b?\b\u0080\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u000b\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\u0006\u0010.\u001a\u00020\u000b\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\u000b\u0012\u0006\u00102\u001a\u00020\u000b\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00104\u001a\u00020\u000b\u0012\u0006\u00105\u001a\u00020\u000b\u0012\u0006\u00106\u001a\u00020\u000b\u0012\u0006\u00107\u001a\u00020\u0019\u0012\u0006\u00108\u001a\u00020\u0019\u0012\u0006\u00109\u001a\u00020\u000b\u0012\b\u0010:\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010;\u001a\u00020\u001f¢\u0006\u0004\b|\u0010}J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0016\u0010\"\u001a\u00020\u001fHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u008f\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u00192\b\b\u0002\u00108\u001a\u00020\u00192\b\b\u0002\u00109\u001a\u00020\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010;\u001a\u00020\u001fHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\t\u0010@\u001a\u00020?HÖ\u0001J\t\u0010A\u001a\u00020\u0004HÖ\u0001J\u0013\u0010C\u001a\u00020\u00192\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010G\u001a\u0004\bH\u0010!R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010G\u001a\u0004\bI\u0010!R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010G\u001a\u0004\bJ\u0010!R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010G\u001a\u0004\bK\u0010!R\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010G\u001a\u0004\bL\u0010!R\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010G\u001a\u0004\bM\u0010!R\"\u0010*\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010N\u001a\u0004\bS\u0010P\"\u0004\bT\u0010RR\"\u0010,\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010N\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010N\u001a\u0004\bW\u0010P\"\u0004\bX\u0010RR\"\u0010.\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010N\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010G\u001a\u0004\b[\u0010!\"\u0004\b\\\u0010]R\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010G\u001a\u0004\b^\u0010!\"\u0004\b_\u0010]R\"\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010N\u001a\u0004\b`\u0010P\"\u0004\ba\u0010RR\"\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010N\u001a\u0004\bb\u0010P\"\u0004\bc\u0010RR\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010N\u001a\u0004\bd\u0010P\"\u0004\be\u0010RR\"\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010N\u001a\u0004\bf\u0010P\"\u0004\bg\u0010RR\"\u00105\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010N\u001a\u0004\bh\u0010P\"\u0004\bi\u0010RR\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010N\u001a\u0004\bj\u0010P\"\u0004\bk\u0010RR\"\u00107\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u00108\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010l\u001a\u0004\bq\u0010n\"\u0004\br\u0010pR\"\u00109\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010N\u001a\u0004\bs\u0010P\"\u0004\bt\u0010RR$\u0010:\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR(\u0010;\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b;\u0010G\u001a\u0004\bz\u0010!\"\u0004\b{\u0010]\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006~"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "", "component21", "component22", "component23", "Landroidx/compose/ui/graphics/RenderEffect;", "component24", "Landroidx/compose/ui/graphics/CompositingStrategy;", "component25--NrFUSI", "()I", "component25", "uniqueId", "left", "top", "right", "bottom", "width", "height", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "clipToOutline", "clipToBounds", "alpha", "renderEffect", "compositingStrategy", "copy-fuCbV5c", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;I)Landroidx/compose/ui/platform/DeviceRenderNodeData;", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "other", "equals", "J", "getUniqueId", "()J", "I", "getLeft", "getTop", "getRight", "getBottom", "getWidth", "getHeight", "F", "getScaleX", "()F", "setScaleX", "(F)V", "getScaleY", "setScaleY", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "getElevation", "setElevation", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "getSpotShadowColor", "setSpotShadowColor", "getRotationZ", "setRotationZ", "getRotationX", "setRotationX", "getRotationY", "setRotationY", "getCameraDistance", "setCameraDistance", "getPivotX", "setPivotX", "getPivotY", "setPivotY", "Z", "getClipToOutline", "()Z", "setClipToOutline", "(Z)V", "getClipToBounds", "setClipToBounds", "getAlpha", "setAlpha", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;

    @p4.m
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    private DeviceRenderNodeData(long j5, int i5, int i6, int i7, int i8, int i9, int i10, float f5, float f6, float f7, float f8, float f9, int i11, int i12, float f10, float f11, float f12, float f13, float f14, float f15, boolean z4, boolean z5, float f16, RenderEffect renderEffect, int i13) {
        this.uniqueId = j5;
        this.left = i5;
        this.top = i6;
        this.right = i7;
        this.bottom = i8;
        this.width = i9;
        this.height = i10;
        this.scaleX = f5;
        this.scaleY = f6;
        this.translationX = f7;
        this.translationY = f8;
        this.elevation = f9;
        this.ambientShadowColor = i11;
        this.spotShadowColor = i12;
        this.rotationZ = f10;
        this.rotationX = f11;
        this.rotationY = f12;
        this.cameraDistance = f13;
        this.pivotX = f14;
        this.pivotY = f15;
        this.clipToOutline = z4;
        this.clipToBounds = z5;
        this.alpha = f16;
        this.renderEffect = renderEffect;
        this.compositingStrategy = i13;
    }

    public /* synthetic */ DeviceRenderNodeData(long j5, int i5, int i6, int i7, int i8, int i9, int i10, float f5, float f6, float f7, float f8, float f9, int i11, int i12, float f10, float f11, float f12, float f13, float f14, float f15, boolean z4, boolean z5, float f16, RenderEffect renderEffect, int i13, kotlin.jvm.internal.w wVar) {
        this(j5, i5, i6, i7, i8, i9, i10, f5, f6, f7, f8, f9, i11, i12, f10, f11, f12, f13, f14, f15, z4, z5, f16, renderEffect, i13);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    @p4.m
    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* renamed from: component25--NrFUSI, reason: not valid java name */
    public final int m5312component25NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    @p4.l
    /* renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m5313copyfuCbV5c(long j5, int i5, int i6, int i7, int i8, int i9, int i10, float f5, float f6, float f7, float f8, float f9, int i11, int i12, float f10, float f11, float f12, float f13, float f14, float f15, boolean z4, boolean z5, float f16, @p4.m RenderEffect renderEffect, int i13) {
        return new DeviceRenderNodeData(j5, i5, i6, i7, i8, i9, i10, f5, f6, f7, f8, f9, i11, i12, f10, f11, f12, f13, f14, f15, z4, z5, f16, renderEffect, i13, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && kotlin.jvm.internal.l0.g(this.renderEffect, deviceRenderNodeData.renderEffect) && CompositingStrategy.m3818equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m5314getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    @p4.m
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Boolean.hashCode(this.clipToOutline)) * 31) + Boolean.hashCode(this.clipToBounds)) * 31) + Float.hashCode(this.alpha)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((hashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + CompositingStrategy.m3819hashCodeimpl(this.compositingStrategy);
    }

    public final void setAlpha(float f5) {
        this.alpha = f5;
    }

    public final void setAmbientShadowColor(int i5) {
        this.ambientShadowColor = i5;
    }

    public final void setCameraDistance(float f5) {
        this.cameraDistance = f5;
    }

    public final void setClipToBounds(boolean z4) {
        this.clipToBounds = z4;
    }

    public final void setClipToOutline(boolean z4) {
        this.clipToOutline = z4;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m5315setCompositingStrategyaDBOjCE(int i5) {
        this.compositingStrategy = i5;
    }

    public final void setElevation(float f5) {
        this.elevation = f5;
    }

    public final void setPivotX(float f5) {
        this.pivotX = f5;
    }

    public final void setPivotY(float f5) {
        this.pivotY = f5;
    }

    public final void setRenderEffect(@p4.m RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f5) {
        this.rotationX = f5;
    }

    public final void setRotationY(float f5) {
        this.rotationY = f5;
    }

    public final void setRotationZ(float f5) {
        this.rotationZ = f5;
    }

    public final void setScaleX(float f5) {
        this.scaleX = f5;
    }

    public final void setScaleY(float f5) {
        this.scaleY = f5;
    }

    public final void setSpotShadowColor(int i5) {
        this.spotShadowColor = i5;
    }

    public final void setTranslationX(float f5) {
        this.translationX = f5;
    }

    public final void setTranslationY(float f5) {
        this.translationY = f5;
    }

    @p4.l
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", compositingStrategy=" + ((Object) CompositingStrategy.m3820toStringimpl(this.compositingStrategy)) + ')';
    }
}
