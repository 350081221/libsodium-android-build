.class final Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/AnchoredDraggableKt;->snapTo(Landroidx/compose/material3/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/r<",
        "Landroidx/compose/material3/AnchoredDragScope;",
        "Landroidx/compose/material3/DraggableAnchors<",
        "TT;>;TT;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.material3.AnchoredDraggableKt$snapTo$2"
    f = "AnchoredDraggable.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"
    }
    d2 = {
        "T",
        "Landroidx/compose/material3/AnchoredDragScope;",
        "Landroidx/compose/material3/DraggableAnchors;",
        "anchors",
        "latestTarget",
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlin/coroutines/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/material3/AnchoredDragScope;Landroidx/compose/material3/DraggableAnchors;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroidx/compose/material3/AnchoredDragScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/DraggableAnchors;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/AnchoredDragScope;",
            "Landroidx/compose/material3/DraggableAnchors<",
            "TT;>;TT;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;

    invoke-direct {v0, p4}, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;-><init>(Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->L$2:Ljava/lang/Object;

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {v0, p1}, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/material3/AnchoredDragScope;

    check-cast p2, Landroidx/compose/material3/DraggableAnchors;

    check-cast p4, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->invoke(Landroidx/compose/material3/AnchoredDragScope;Landroidx/compose/material3/DraggableAnchors;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/material3/AnchoredDragScope;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->L$1:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/compose/material3/DraggableAnchors;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/material3/AnchoredDraggableKt$snapTo$2;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Landroidx/compose/material3/DraggableAnchors;->positionOf(Ljava/lang/Object;)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static {p1, v0, v3, v1, v2}, Landroidx/compose/material3/AnchoredDragScope;->dragTo$default(Landroidx/compose/material3/AnchoredDragScope;FFILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
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
