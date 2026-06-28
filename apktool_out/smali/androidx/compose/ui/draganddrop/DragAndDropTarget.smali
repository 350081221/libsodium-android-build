.class public interface abstract Landroidx/compose/ui/draganddrop/DragAndDropTarget;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
        "",
        "Landroidx/compose/ui/draganddrop/DragAndDropEvent;",
        "event",
        "",
        "onDrop",
        "Lkotlin/r2;",
        "onStarted",
        "onEntered",
        "onMoved",
        "onExited",
        "onChanged",
        "onEnded",
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
.method public onChanged(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public abstract onDrop(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public onEnded(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public onEntered(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public onExited(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public onMoved(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public onStarted(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method
