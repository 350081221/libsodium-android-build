.class public final Landroidx/compose/material3/carousel/KeylineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a1\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0008\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0008\u0007H\u0000\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00002\u0017\u0010\u0008\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0008\u0007H\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "carouselMainAxisSize",
        "Landroidx/compose/material3/carousel/CarouselAlignment;",
        "carouselAlignment",
        "Lkotlin/Function1;",
        "Landroidx/compose/material3/carousel/KeylineListScope;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "keylines",
        "Landroidx/compose/material3/carousel/KeylineList;",
        "keylineListOf",
        "",
        "pivotIndex",
        "pivotOffset",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final keylineListOf(FIFLv3/l;)Landroidx/compose/material3/carousel/KeylineList;
    .locals 1
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FIF",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/carousel/KeylineListScope;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/material3/carousel/KeylineList;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 4
    new-instance v0, Landroidx/compose/material3/carousel/KeylineListScopeImpl;

    invoke-direct {v0}, Landroidx/compose/material3/carousel/KeylineListScopeImpl;-><init>()V

    .line 5
    invoke-interface {p3, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {v0, p0, p1, p2}, Landroidx/compose/material3/carousel/KeylineListScopeImpl;->createWithPivot(FIF)Landroidx/compose/material3/carousel/KeylineList;

    move-result-object p0

    return-object p0
.end method

.method public static final keylineListOf(FLandroidx/compose/material3/carousel/CarouselAlignment;Lv3/l;)Landroidx/compose/material3/carousel/KeylineList;
    .locals 1
    .param p1    # Landroidx/compose/material3/carousel/CarouselAlignment;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Landroidx/compose/material3/carousel/CarouselAlignment;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/carousel/KeylineListScope;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/material3/carousel/KeylineList;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/carousel/KeylineListScopeImpl;

    invoke-direct {v0}, Landroidx/compose/material3/carousel/KeylineListScopeImpl;-><init>()V

    .line 2
    invoke-interface {p2, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {v0, p0, p1}, Landroidx/compose/material3/carousel/KeylineListScopeImpl;->createWithAlignment(FLandroidx/compose/material3/carousel/CarouselAlignment;)Landroidx/compose/material3/carousel/KeylineList;

    move-result-object p0

    return-object p0
.end method
