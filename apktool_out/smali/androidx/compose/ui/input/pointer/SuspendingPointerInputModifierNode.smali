.class public interface abstract Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/PointerInputModifierNode;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H&R=\u0010\r\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00a2\u0006\u0002\u0008\u00088&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0001\u000e\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000f\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;",
        "Landroidx/compose/ui/node/PointerInputModifierNode;",
        "Lkotlin/r2;",
        "resetPointerInputHandler",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "Lkotlin/coroutines/d;",
        "",
        "Lkotlin/u;",
        "getPointerInputHandler",
        "()Lv3/p;",
        "setPointerInputHandler",
        "(Lv3/p;)V",
        "pointerInputHandler",
        "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;",
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
.method public abstract getPointerInputHandler()Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/p<",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract resetPointerInputHandler()V
.end method

.method public abstract setPointerInputHandler(Lv3/p;)V
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method
