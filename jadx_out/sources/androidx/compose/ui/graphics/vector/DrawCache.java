package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010!J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002JI\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016R*\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u001c\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010(R\u001c\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/ui/graphics/vector/DrawCache;", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "clear", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "Landroidx/compose/ui/unit/IntSize;", "size", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "Lkotlin/u;", "block", "drawCachedImage-FqjB98A", "(IJLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lv3/l;)V", "drawCachedImage", TypedValues.AttributesType.S_TARGET, "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "drawInto", "Landroidx/compose/ui/graphics/ImageBitmap;", "mCachedImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "getMCachedImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setMCachedImage", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "getMCachedImage$annotations", "()V", "Landroidx/compose/ui/graphics/Canvas;", "cachedCanvas", "Landroidx/compose/ui/graphics/Canvas;", "scopeDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "J", "I", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "cacheScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,112:1\n542#2,17:113\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n81#1:113,17\n*E\n"})
/* loaded from: classes.dex */
public final class DrawCache {
    public static final int $stable = 8;

    @m
    private Canvas cachedCanvas;

    @m
    private ImageBitmap mCachedImage;

    @m
    private Density scopeDensity;

    @l
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.Companion.m6219getZeroYbymL2g();
    private int config = ImageBitmapConfig.Companion.m3954getArgb8888_sVssgQ();

    @l
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    private final void clear(DrawScope drawScope) {
        DrawScope.m4272drawRectnJ9OG0$default(drawScope, Color.Companion.m3760getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m3649getClear0nO6VwU(), 62, null);
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f5, ColorFilter colorFilter, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = 1.0f;
        }
        if ((i5 & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f5, colorFilter);
    }

    @a1
    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    /* renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m4354drawCachedImageFqjB98A(int i5, long j5, @l Density density, @l LayoutDirection layoutDirection, @l v3.l<? super DrawScope, r2> lVar) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ImageBitmap imageBitmap = this.mCachedImage;
        Canvas canvas = this.cachedCanvas;
        if (imageBitmap == null || canvas == null || IntSize.m6214getWidthimpl(j5) > imageBitmap.getWidth() || IntSize.m6213getHeightimpl(j5) > imageBitmap.getHeight() || !ImageBitmapConfig.m3949equalsimpl0(this.config, i5)) {
            imageBitmap = ImageBitmapKt.m3959ImageBitmapx__hDU$default(IntSize.m6214getWidthimpl(j5), IntSize.m6213getHeightimpl(j5), i5, false, null, 24, null);
            canvas = CanvasKt.Canvas(imageBitmap);
            this.mCachedImage = imageBitmap;
            this.cachedCanvas = canvas;
            this.config = i5;
        }
        this.size = j5;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long m6224toSizeozmzZPI = IntSizeKt.m6224toSizeozmzZPI(j5);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m4198component4NHjbRc = drawParams.m4198component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m4201setSizeuvyYCjk(m6224toSizeozmzZPI);
        canvas.save();
        clear(canvasDrawScope);
        lVar.invoke(canvasDrawScope);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m4201setSizeuvyYCjk(m4198component4NHjbRc);
        imageBitmap.prepareToDraw();
    }

    public final void drawInto(@l DrawScope drawScope, float f5, @m ColorFilter colorFilter) {
        boolean z4;
        ImageBitmap imageBitmap = this.mCachedImage;
        if (imageBitmap != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            DrawScope.m4261drawImageAZ2fEMs$default(drawScope, imageBitmap, 0L, this.size, 0L, 0L, f5, null, colorFilter, 0, 0, 858, null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }

    @m
    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(@m ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }
}
