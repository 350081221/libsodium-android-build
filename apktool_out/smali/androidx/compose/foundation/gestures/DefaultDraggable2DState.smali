.class final Landroidx/compose/foundation/gestures/DefaultDraggable2DState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/Draggable2DState;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\'\u0010\n\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004\u00a2\u0006\u0002\u0008\tH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/DefaultDraggable2DState;",
        "Landroidx/compose/foundation/gestures/Draggable2DState;",
        "Landroidx/compose/foundation/MutatePriority;",
        "dragPriority",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/gestures/Drag2DScope;",
        "Lkotlin/coroutines/d;",
        "Lkotlin/r2;",
        "",
        "Lkotlin/u;",
        "block",
        "drag",
        "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroidx/compose/ui/geometry/Offset;",
        "delta",
        "dispatchRawDelta-k-4lQ0M",
        "(J)V",
        "dispatchRawDelta",
        "Lkotlin/Function1;",
        "onDelta",
        "Lv3/l;",
        "getOnDelta",
        "()Lv3/l;",
        "drag2DScope",
        "Landroidx/compose/foundation/gestures/Drag2DScope;",
        "Landroidx/compose/foundation/MutatorMutex;",
        "drag2DMutex",
        "Landroidx/compose/foundation/MutatorMutex;",
        "<init>",
        "(Lv3/l;)V",
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
.field private final drag2DMutex:Landroidx/compose/foundation/MutatorMutex;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final drag2DScope:Landroidx/compose/foundation/gestures/Drag2DScope;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final onDelta:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DefaultDraggable2DState;->onDelta:Lv3/l;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/foundation/gestures/DefaultDraggable2DState$drag2DScope$1;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Landroidx/compose/foundation/gestures/DefaultDraggable2DState$drag2DScope$1;-><init>(Landroidx/compose/foundation/gestures/DefaultDraggable2DState;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DefaultDraggable2DState;->drag2DScope:Landroidx/compose/foundation/gestures/Drag2DScope;

    .line 12
    .line 13
    new-instance p1, Landroidx/compose/foundation/MutatorMutex;

    .line 14
    .line 15
    invoke-direct {p1}, Landroidx/compose/foundation/MutatorMutex;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DefaultDraggable2DState;->drag2DMutex:Landroidx/compose/foundation/MutatorMutex;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic access$getDrag2DMutex$p(Landroidx/compose/foundation/gestures/DefaultDraggable2DState;)Landroidx/compose/foundation/MutatorMutex;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/DefaultDraggable2DState;->drag2DMutex:Landroidx/compose/foundation/MutatorMutex;

    return-object p0
.end method

.method public static final synthetic access$getDrag2DScope$p(Landroidx/compose/foundation/gestures/DefaultDraggable2DState;)Landroidx/compose/foundation/gestures/Drag2DScope;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/DefaultDraggable2DState;->drag2DScope:Landroidx/compose/foundation/gestures/Drag2DScope;

    return-object p0
.end method


# virtual methods
.method public dispatchRawDelta-k-4lQ0M(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/DefaultDraggable2DState;->onDelta:Lv3/l;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object p1

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public drag(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
    .param p1    # Landroidx/compose/foundation/MutatePriority;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/MutatePriority;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/foundation/gestures/Drag2DScope;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/gestures/DefaultDraggable2DState$drag$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/compose/foundation/gestures/DefaultDraggable2DState$drag$2;-><init>(Landroidx/compose/foundation/gestures/DefaultDraggable2DState;Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)V

    invoke-static {v0, p3}, Lkotlinx/coroutines/t0;->g(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final getOnDelta()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/gestures/DefaultDraggable2DState;->onDelta:Lv3/l;

    return-object v0
.end method
