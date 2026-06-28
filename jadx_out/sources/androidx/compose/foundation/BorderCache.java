package androidx.compose.foundation;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b(\u0010)J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÂ\u0003J@\u0010\u0016\u001a\u00020\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0017\u001a\u00020\bJ9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/foundation/BorderCache;", "", "Landroidx/compose/ui/graphics/ImageBitmap;", "component1", "Landroidx/compose/ui/graphics/Canvas;", "component2", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "component3", "Landroidx/compose/ui/graphics/Path;", "component4", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/IntSize;", "borderSize", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "Lkotlin/u;", "block", "drawBorderCache-EMwLDEs", "(Landroidx/compose/ui/draw/CacheDrawScope;JILv3/l;)Landroidx/compose/ui/graphics/ImageBitmap;", "drawBorderCache", "obtainPath", "imageBitmap", "canvas", "canvasDrawScope", "borderPath", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/Path;", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,516:1\n1#2:517\n542#3,17:518\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n413#1:518,17\n*E\n"})
/* loaded from: classes.dex */
final class BorderCache {

    @p4.m
    private Path borderPath;

    @p4.m
    private Canvas canvas;

    @p4.m
    private CanvasDrawScope canvasDrawScope;

    @p4.m
    private ImageBitmap imageBitmap;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    public BorderCache(@p4.m ImageBitmap imageBitmap, @p4.m Canvas canvas, @p4.m CanvasDrawScope canvasDrawScope, @p4.m Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    private final ImageBitmap component1() {
        return this.imageBitmap;
    }

    private final Canvas component2() {
        return this.canvas;
    }

    private final CanvasDrawScope component3() {
        return this.canvasDrawScope;
    }

    private final Path component4() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache borderCache, ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            imageBitmap = borderCache.imageBitmap;
        }
        if ((i5 & 2) != 0) {
            canvas = borderCache.canvas;
        }
        if ((i5 & 4) != 0) {
            canvasDrawScope = borderCache.canvasDrawScope;
        }
        if ((i5 & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap, canvas, canvasDrawScope, path);
    }

    @p4.l
    public final BorderCache copy(@p4.m ImageBitmap imageBitmap, @p4.m Canvas canvas, @p4.m CanvasDrawScope canvasDrawScope, @p4.m Path path) {
        return new BorderCache(imageBitmap, canvas, canvasDrawScope, path);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m3948equalsimpl(r31, r3) != false) goto L17;
     */
    @p4.l
    /* renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.graphics.ImageBitmap m209drawBorderCacheEMwLDEs(@p4.l androidx.compose.ui.draw.CacheDrawScope r28, long r29, int r31, @p4.l v3.l<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.r2> r32) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderCache.m209drawBorderCacheEMwLDEs(androidx.compose.ui.draw.CacheDrawScope, long, int, v3.l):androidx.compose.ui.graphics.ImageBitmap");
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        return l0.g(this.imageBitmap, borderCache.imageBitmap) && l0.g(this.canvas, borderCache.canvas) && l0.g(this.canvasDrawScope, borderCache.canvasDrawScope) && l0.g(this.borderPath, borderCache.borderPath);
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.imageBitmap;
        int hashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        Canvas canvas = this.canvas;
        int hashCode2 = (hashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int hashCode3 = (hashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.borderPath;
        return hashCode3 + (path != null ? path.hashCode() : 0);
    }

    @p4.l
    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    @p4.l
    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : imageBitmap, (i5 & 2) != 0 ? null : canvas, (i5 & 4) != 0 ? null : canvasDrawScope, (i5 & 8) != 0 ? null : path);
    }
}
