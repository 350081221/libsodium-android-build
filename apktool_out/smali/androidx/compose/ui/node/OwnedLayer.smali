.class public interface abstract Landroidx/compose/ui/node/OwnedLayer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008`\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0010H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0008\u0010\u001b\u001a\u00020\u0008H&J\u0008\u0010\u001c\u001a\u00020\u0008H&J\u0008\u0010\u001d\u001a\u00020\u0008H&J\"\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000cH&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010%\u001a\u00020\u00082\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u000cH&J*\u0010*\u001a\u00020\u00082\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00080&2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00080(H&J\u001a\u0010/\u001a\u00020\u00082\u0006\u0010,\u001a\u00020+H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u00020\u00082\u0006\u0010,\u001a\u00020+H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u0010.\u00f8\u0001\u0001\u0082\u0002\r\n\u0005\u0008\u00a1\u001e0\u0001\n\u0004\u0008!0\u0001\u00a8\u00062\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/node/OwnedLayer;",
        "",
        "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;",
        "scope",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Lkotlin/r2;",
        "updateLayerProperties",
        "Landroidx/compose/ui/geometry/Offset;",
        "position",
        "",
        "isInLayer-k-4lQ0M",
        "(J)Z",
        "isInLayer",
        "Landroidx/compose/ui/unit/IntOffset;",
        "move--gyyYBs",
        "(J)V",
        "move",
        "Landroidx/compose/ui/unit/IntSize;",
        "size",
        "resize-ozmzZPI",
        "resize",
        "Landroidx/compose/ui/graphics/Canvas;",
        "canvas",
        "drawLayer",
        "updateDisplayList",
        "invalidate",
        "destroy",
        "point",
        "inverse",
        "mapOffset-8S9VItk",
        "(JZ)J",
        "mapOffset",
        "Landroidx/compose/ui/geometry/MutableRect;",
        "rect",
        "mapBounds",
        "Lkotlin/Function1;",
        "drawBlock",
        "Lkotlin/Function0;",
        "invalidateParentLayer",
        "reuseLayer",
        "Landroidx/compose/ui/graphics/Matrix;",
        "matrix",
        "transform-58bKbWc",
        "([F)V",
        "transform",
        "inverseTransform-58bKbWc",
        "inverseTransform",
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
.method public abstract destroy()V
.end method

.method public abstract drawLayer(Landroidx/compose/ui/graphics/Canvas;)V
    .param p1    # Landroidx/compose/ui/graphics/Canvas;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract invalidate()V
.end method

.method public abstract inverseTransform-58bKbWc([F)V
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract isInLayer-k-4lQ0M(J)Z
.end method

.method public abstract mapBounds(Landroidx/compose/ui/geometry/MutableRect;Z)V
    .param p1    # Landroidx/compose/ui/geometry/MutableRect;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract mapOffset-8S9VItk(JZ)J
.end method

.method public abstract move--gyyYBs(J)V
.end method

.method public abstract resize-ozmzZPI(J)V
.end method

.method public abstract reuseLayer(Lv3/l;Lv3/a;)V
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/graphics/Canvas;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract transform-58bKbWc([F)V
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract updateDisplayList()V
.end method

.method public abstract updateLayerProperties(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V
    .param p1    # Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
