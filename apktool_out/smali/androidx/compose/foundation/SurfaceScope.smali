.class public interface abstract Landroidx/compose/foundation/SurfaceScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001JO\u0010\u000b\u001a\u00020\t*\u00020\u00022A\u0010\u000b\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0005\u0012\u0008\u0008\u0006\u0012\u0004\u0008\u0008(\u0007\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0005\u0012\u0008\u0008\u0006\u0012\u0004\u0008\u0008(\u0008\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\u0002\u0008\nH&J%\u0010\r\u001a\u00020\t*\u00020\u00022\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000c\u00a2\u0006\u0002\u0008\nH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/SurfaceScope;",
        "",
        "Landroid/view/Surface;",
        "Lkotlin/Function3;",
        "",
        "Lkotlin/v0;",
        "name",
        "width",
        "height",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "onChanged",
        "Lkotlin/Function1;",
        "onDestroyed",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract onChanged(Landroid/view/Surface;Lv3/q;)V
    .param p1    # Landroid/view/Surface;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            "Lv3/q<",
            "-",
            "Landroid/view/Surface;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onDestroyed(Landroid/view/Surface;Lv3/l;)V
    .param p1    # Landroid/view/Surface;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            "Lv3/l<",
            "-",
            "Landroid/view/Surface;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method
