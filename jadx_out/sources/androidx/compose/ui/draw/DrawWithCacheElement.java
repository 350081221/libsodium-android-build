package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fHÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R(\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/u;", "component1", "onBuildDrawCache", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Lv3/l;", "getOnBuildDrawCache", "()Lv3/l;", "<init>", "(Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {

    @l
    private final v3.l<CacheDrawScope, DrawResult> onBuildDrawCache;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(@l v3.l<? super CacheDrawScope, DrawResult> lVar) {
        this.onBuildDrawCache = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawWithCacheElement copy$default(DrawWithCacheElement drawWithCacheElement, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = drawWithCacheElement.onBuildDrawCache;
        }
        return drawWithCacheElement.copy(lVar);
    }

    @l
    public final v3.l<CacheDrawScope, DrawResult> component1() {
        return this.onBuildDrawCache;
    }

    @l
    public final DrawWithCacheElement copy(@l v3.l<? super CacheDrawScope, DrawResult> lVar) {
        return new DrawWithCacheElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && l0.g(this.onBuildDrawCache, ((DrawWithCacheElement) obj).onBuildDrawCache);
    }

    @l
    public final v3.l<CacheDrawScope, DrawResult> getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithCache");
        inspectorInfo.getProperties().set("onBuildDrawCache", this.onBuildDrawCache);
    }

    @l
    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public CacheDrawModifierNodeImpl create() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.onBuildDrawCache);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl) {
        cacheDrawModifierNodeImpl.setBlock(this.onBuildDrawCache);
    }
}
