.class public interface abstract Landroidx/compose/ui/window/PopupLayoutHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008a\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H&J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/window/PopupLayoutHelper;",
        "",
        "Landroid/view/View;",
        "composeView",
        "Landroid/graphics/Rect;",
        "outRect",
        "Lkotlin/r2;",
        "getWindowVisibleDisplayFrame",
        "",
        "width",
        "height",
        "setGestureExclusionRects",
        "Landroid/view/WindowManager;",
        "windowManager",
        "popupView",
        "Landroid/view/ViewGroup$LayoutParams;",
        "params",
        "updateViewLayout",
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
.method public abstract getWindowVisibleDisplayFrame(Landroid/view/View;Landroid/graphics/Rect;)V
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract setGestureExclusionRects(Landroid/view/View;II)V
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract updateViewLayout(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .param p1    # Landroid/view/WindowManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
