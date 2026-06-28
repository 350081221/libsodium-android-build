.class public interface abstract Landroidx/compose/ui/platform/DeviceRenderNode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000c\n\u0002\u0010\u0007\n\u0002\u00085\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J(\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH&J\u0008\u0010\"\u001a\u00020!H&J\u0008\u0010#\u001a\u00020\u0004H&R\u0014\u0010\'\u001a\u00020$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0014\u0010\u0008\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010)R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010)R\u0014\u0010\n\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010)R\u0014\u0010.\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010)R\u0014\u00100\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010)R\u001c\u00106\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R\u001c\u00109\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u00087\u00103\"\u0004\u00088\u00105R\u001c\u0010<\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008:\u00103\"\u0004\u0008;\u00105R\u001c\u0010?\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008=\u00103\"\u0004\u0008>\u00105R\u001c\u0010B\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008@\u00103\"\u0004\u0008A\u00105R\u001c\u0010F\u001a\u00020\u00068&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008C\u0010)\"\u0004\u0008D\u0010ER\u001c\u0010I\u001a\u00020\u00068&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008G\u0010)\"\u0004\u0008H\u0010ER\u001c\u0010L\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008J\u00103\"\u0004\u0008K\u00105R\u001c\u0010O\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008M\u00103\"\u0004\u0008N\u00105R\u001c\u0010R\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008P\u00103\"\u0004\u0008Q\u00105R\u001c\u0010U\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008S\u00103\"\u0004\u0008T\u00105R\u001c\u0010X\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008V\u00103\"\u0004\u0008W\u00105R\u001c\u0010[\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Y\u00103\"\u0004\u0008Z\u00105R\u001c\u0010`\u001a\u00020\u000b8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\\\u0010]\"\u0004\u0008^\u0010_R\u001c\u0010c\u001a\u00020\u000b8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008a\u0010]\"\u0004\u0008b\u0010_R\u001c\u0010f\u001a\u0002018&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008d\u00103\"\u0004\u0008e\u00105R\u001e\u0010l\u001a\u0004\u0018\u00010g8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008h\u0010i\"\u0004\u0008j\u0010kR\u0014\u0010n\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008m\u0010]R\"\u0010r\u001a\u00020o8&@&X\u00a6\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\u001a\u0004\u0008p\u0010)\"\u0004\u0008q\u0010E\u00f8\u0001\u0002\u0082\u0002\u0011\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\n\u0004\u0008!0\u0001\u00a8\u0006s\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/platform/DeviceRenderNode;",
        "",
        "Landroid/graphics/Outline;",
        "outline",
        "Lkotlin/r2;",
        "setOutline",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "",
        "setPosition",
        "offset",
        "offsetLeftAndRight",
        "offsetTopAndBottom",
        "Landroidx/compose/ui/graphics/CanvasHolder;",
        "canvasHolder",
        "Landroidx/compose/ui/graphics/Path;",
        "clipPath",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/graphics/Canvas;",
        "drawBlock",
        "record",
        "Landroid/graphics/Matrix;",
        "matrix",
        "getMatrix",
        "getInverseMatrix",
        "Landroid/graphics/Canvas;",
        "canvas",
        "drawInto",
        "hasOverlappingRendering",
        "setHasOverlappingRendering",
        "Landroidx/compose/ui/platform/DeviceRenderNodeData;",
        "dumpRenderNodeData",
        "discardDisplayList",
        "",
        "getUniqueId",
        "()J",
        "uniqueId",
        "getLeft",
        "()I",
        "getTop",
        "getRight",
        "getBottom",
        "getWidth",
        "width",
        "getHeight",
        "height",
        "",
        "getScaleX",
        "()F",
        "setScaleX",
        "(F)V",
        "scaleX",
        "getScaleY",
        "setScaleY",
        "scaleY",
        "getTranslationX",
        "setTranslationX",
        "translationX",
        "getTranslationY",
        "setTranslationY",
        "translationY",
        "getElevation",
        "setElevation",
        "elevation",
        "getAmbientShadowColor",
        "setAmbientShadowColor",
        "(I)V",
        "ambientShadowColor",
        "getSpotShadowColor",
        "setSpotShadowColor",
        "spotShadowColor",
        "getRotationZ",
        "setRotationZ",
        "rotationZ",
        "getRotationX",
        "setRotationX",
        "rotationX",
        "getRotationY",
        "setRotationY",
        "rotationY",
        "getCameraDistance",
        "setCameraDistance",
        "cameraDistance",
        "getPivotX",
        "setPivotX",
        "pivotX",
        "getPivotY",
        "setPivotY",
        "pivotY",
        "getClipToOutline",
        "()Z",
        "setClipToOutline",
        "(Z)V",
        "clipToOutline",
        "getClipToBounds",
        "setClipToBounds",
        "clipToBounds",
        "getAlpha",
        "setAlpha",
        "alpha",
        "Landroidx/compose/ui/graphics/RenderEffect;",
        "getRenderEffect",
        "()Landroidx/compose/ui/graphics/RenderEffect;",
        "setRenderEffect",
        "(Landroidx/compose/ui/graphics/RenderEffect;)V",
        "renderEffect",
        "getHasDisplayList",
        "hasDisplayList",
        "Landroidx/compose/ui/graphics/CompositingStrategy;",
        "getCompositingStrategy--NrFUSI",
        "setCompositingStrategy-aDBOjCE",
        "compositingStrategy",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract discardDisplayList()V
.end method

.method public abstract drawInto(Landroid/graphics/Canvas;)V
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract dumpRenderNodeData()Landroidx/compose/ui/platform/DeviceRenderNodeData;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getAlpha()F
.end method

.method public abstract getAmbientShadowColor()I
.end method

.method public abstract getBottom()I
.end method

.method public abstract getCameraDistance()F
.end method

.method public abstract getClipToBounds()Z
.end method

.method public abstract getClipToOutline()Z
.end method

.method public abstract getCompositingStrategy--NrFUSI()I
.end method

.method public abstract getElevation()F
.end method

.method public abstract getHasDisplayList()Z
.end method

.method public abstract getHeight()I
.end method

.method public abstract getInverseMatrix(Landroid/graphics/Matrix;)V
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract getLeft()I
.end method

.method public abstract getMatrix(Landroid/graphics/Matrix;)V
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract getPivotX()F
.end method

.method public abstract getPivotY()F
.end method

.method public abstract getRenderEffect()Landroidx/compose/ui/graphics/RenderEffect;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getRight()I
.end method

.method public abstract getRotationX()F
.end method

.method public abstract getRotationY()F
.end method

.method public abstract getRotationZ()F
.end method

.method public abstract getScaleX()F
.end method

.method public abstract getScaleY()F
.end method

.method public abstract getSpotShadowColor()I
.end method

.method public abstract getTop()I
.end method

.method public abstract getTranslationX()F
.end method

.method public abstract getTranslationY()F
.end method

.method public abstract getUniqueId()J
.end method

.method public abstract getWidth()I
.end method

.method public abstract offsetLeftAndRight(I)V
.end method

.method public abstract offsetTopAndBottom(I)V
.end method

.method public abstract record(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lv3/l;)V
    .param p1    # Landroidx/compose/ui/graphics/CanvasHolder;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/graphics/CanvasHolder;",
            "Landroidx/compose/ui/graphics/Path;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/graphics/Canvas;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setAlpha(F)V
.end method

.method public abstract setAmbientShadowColor(I)V
.end method

.method public abstract setCameraDistance(F)V
.end method

.method public abstract setClipToBounds(Z)V
.end method

.method public abstract setClipToOutline(Z)V
.end method

.method public abstract setCompositingStrategy-aDBOjCE(I)V
.end method

.method public abstract setElevation(F)V
.end method

.method public abstract setHasOverlappingRendering(Z)Z
.end method

.method public abstract setOutline(Landroid/graphics/Outline;)V
    .param p1    # Landroid/graphics/Outline;
        .annotation build Lp4/m;
        .end annotation
    .end param
.end method

.method public abstract setPivotX(F)V
.end method

.method public abstract setPivotY(F)V
.end method

.method public abstract setPosition(IIII)Z
.end method

.method public abstract setRenderEffect(Landroidx/compose/ui/graphics/RenderEffect;)V
    .param p1    # Landroidx/compose/ui/graphics/RenderEffect;
        .annotation build Lp4/m;
        .end annotation
    .end param
.end method

.method public abstract setRotationX(F)V
.end method

.method public abstract setRotationY(F)V
.end method

.method public abstract setRotationZ(F)V
.end method

.method public abstract setScaleX(F)V
.end method

.method public abstract setScaleY(F)V
.end method

.method public abstract setSpotShadowColor(I)V
.end method

.method public abstract setTranslationX(F)V
.end method

.method public abstract setTranslationY(F)V
.end method
