package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import t0.b;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B(\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\u0002\b\u0014¢\u0006\u0004\b(\u0010)J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\f\u0010\f\u001a\u00020\u0007*\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012RL\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\u0002\b\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\u0002\b\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020$8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/draw/DrawResult;", "getOrBuildCachedDrawBlock", "Lkotlin/r2;", "onMeasureResultChanged", "onObservedReadsChanged", "invalidateDrawCache", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/draw/CacheDrawScope;", "cacheDrawScope", "Landroidx/compose/ui/draw/CacheDrawScope;", "", "isCacheValid", "Z", "Lkotlin/Function1;", "Lkotlin/u;", b.f22420d, "block", "Lv3/l;", "getBlock", "()Lv3/l;", "setBlock", "(Lv3/l;)V", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "<init>", "(Landroidx/compose/ui/draw/CacheDrawScope;Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,312:1\n84#2:313\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n*L\n190#1:313\n*E\n"})
/* loaded from: classes.dex */
public final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {

    @l
    private v3.l<? super CacheDrawScope, DrawResult> block;

    @l
    private final CacheDrawScope cacheDrawScope;
    private boolean isCacheValid;

    public CacheDrawModifierNodeImpl(@l CacheDrawScope cacheDrawScope, @l v3.l<? super CacheDrawScope, DrawResult> lVar) {
        this.cacheDrawScope = cacheDrawScope;
        this.block = lVar;
        cacheDrawScope.setCacheParams$ui_release(this);
    }

    private final DrawResult getOrBuildCachedDrawBlock() {
        if (!this.isCacheValid) {
            CacheDrawScope cacheDrawScope = this.cacheDrawScope;
            cacheDrawScope.setDrawResult$ui_release(null);
            ObserverModifierNodeKt.observeReads(this, new CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(this, cacheDrawScope));
            if (cacheDrawScope.getDrawResult$ui_release() != null) {
                this.isCacheValid = true;
            } else {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
        }
        DrawResult drawResult$ui_release = this.cacheDrawScope.getDrawResult$ui_release();
        l0.m(drawResult$ui_release);
        return drawResult$ui_release;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        getOrBuildCachedDrawBlock().getBlock$ui_release().invoke(contentDrawScope);
    }

    @l
    public final v3.l<CacheDrawScope, DrawResult> getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @l
    public Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @l
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo3399getSizeNHjbRc() {
        return IntSizeKt.m6224toSizeozmzZPI(DelegatableNodeKt.m5101requireCoordinator64DMado(this, NodeKind.m5204constructorimpl(128)).mo5005getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.draw.CacheDrawModifierNode
    public void invalidateDrawCache() {
        this.isCacheValid = false;
        this.cacheDrawScope.setDrawResult$ui_release(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    public final void setBlock(@l v3.l<? super CacheDrawScope, DrawResult> lVar) {
        this.block = lVar;
        invalidateDrawCache();
    }
}
