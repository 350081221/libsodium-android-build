.class final Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0003\u0018\u00002\u00020\u0001B0\u0012\'\u0010\u0008\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u00a2\u0006\u0002\u0008\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\rRC\u0010\u0008\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u00a2\u0006\u0002\u0008\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;",
        "Landroidx/compose/ui/node/DelegatingNode;",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;",
        "Lkotlin/coroutines/d;",
        "Lkotlin/r2;",
        "",
        "Lkotlin/u;",
        "dragAndDropSourceHandler",
        "Lv3/p;",
        "getDragAndDropSourceHandler",
        "()Lv3/p;",
        "setDragAndDropSourceHandler",
        "(Lv3/p;)V",
        "<init>",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private dragAndDropSourceHandler:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "-",
            "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv3/p;)V
    .locals 3
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropSourceHandler:Lv3/p;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Landroidx/compose/ui/draw/DrawModifierKt;->CacheDrawModifierNode(Lv3/l;)Landroidx/compose/ui/draw/CacheDrawModifierNode;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 21
    .line 22
    .line 23
    new-instance v0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 24
    .line 25
    new-instance v1, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$1;

    .line 26
    .line 27
    invoke-direct {v1, p1}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$1;-><init>(Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$2;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {p1, p0, v2}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$2;-><init>(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;Lkotlin/coroutines/d;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, p1}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;-><init>(Lv3/l;Lv3/p;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method


# virtual methods
.method public final getDragAndDropSourceHandler()Lv3/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/p<",
            "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;",
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

    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropSourceHandler:Lv3/p;

    return-object v0
.end method

.method public final setDragAndDropSourceHandler(Lv3/p;)V
    .locals 0
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropSourceHandler:Lv3/p;

    return-void
.end method
