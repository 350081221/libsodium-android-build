package androidx.compose.foundation.draganddrop;

import android.graphics.Picture;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "Lkotlin/r2;", "drawDragShadow", "Landroidx/compose/ui/draw/CacheDrawScope;", "scope", "Landroidx/compose/ui/draw/DrawResult;", "cachePicture", "Landroid/graphics/Picture;", "cachedPicture", "Landroid/graphics/Picture;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,146:1\n246#2:147\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n*L\n118#1:147\n*E\n"})
/* loaded from: classes.dex */
public final class CacheDrawScopeDragShadowCallback {

    @m
    private Picture cachedPicture;

    @l
    public final DrawResult cachePicture(@l CacheDrawScope cacheDrawScope) {
        Picture picture = new Picture();
        this.cachedPicture = picture;
        return cacheDrawScope.onDrawWithContent(new CacheDrawScopeDragShadowCallback$cachePicture$1$1(picture, (int) Size.m3562getWidthimpl(cacheDrawScope.m3400getSizeNHjbRc()), (int) Size.m3559getHeightimpl(cacheDrawScope.m3400getSizeNHjbRc())));
    }

    public final void drawDragShadow(@l DrawScope drawScope) {
        Picture picture = this.cachedPicture;
        if (picture != null) {
            AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()).drawPicture(picture);
            return;
        }
        throw new IllegalArgumentException("No cached drag shadow. Check if Modifier.cacheDragShadow(painter) was called.");
    }
}
