.class final Landroidx/compose/material/SliderDraggableState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/DraggableState;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\u0004\u0008\"\u0010#JA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\'\u0010\n\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004\u00a2\u0006\u0002\u0008\tH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R+\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/material/SliderDraggableState;",
        "Landroidx/compose/foundation/gestures/DraggableState;",
        "Landroidx/compose/foundation/MutatePriority;",
        "dragPriority",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/gestures/DragScope;",
        "Lkotlin/coroutines/d;",
        "Lkotlin/r2;",
        "",
        "Lkotlin/u;",
        "block",
        "drag",
        "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "",
        "delta",
        "dispatchRawDelta",
        "Lkotlin/Function1;",
        "onDelta",
        "Lv3/l;",
        "getOnDelta",
        "()Lv3/l;",
        "",
        "<set-?>",
        "isDragging$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "isDragging",
        "()Z",
        "setDragging",
        "(Z)V",
        "dragScope",
        "Landroidx/compose/foundation/gestures/DragScope;",
        "Landroidx/compose/foundation/MutatorMutex;",
        "scrollMutex",
        "Landroidx/compose/foundation/MutatorMutex;",
        "<init>",
        "(Lv3/l;)V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1195:1\n81#2:1196\n107#2,2:1197\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n*L\n1173#1:1196\n1173#1:1197,2\n*E\n"
    }
.end annotation


# instance fields
.field private final dragScope:Landroidx/compose/foundation/gestures/DragScope;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final isDragging$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final onDelta:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final scrollMutex:Landroidx/compose/foundation/MutatorMutex;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv3/l;)V
    .locals 2
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material/SliderDraggableState;->onDelta:Lv3/l;

    .line 5
    .line 6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Landroidx/compose/material/SliderDraggableState;->isDragging$delegate:Landroidx/compose/runtime/MutableState;

    .line 15
    .line 16
    new-instance p1, Landroidx/compose/material/SliderDraggableState$dragScope$1;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Landroidx/compose/material/SliderDraggableState$dragScope$1;-><init>(Landroidx/compose/material/SliderDraggableState;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroidx/compose/material/SliderDraggableState;->dragScope:Landroidx/compose/foundation/gestures/DragScope;

    .line 22
    .line 23
    new-instance p1, Landroidx/compose/foundation/MutatorMutex;

    .line 24
    .line 25
    invoke-direct {p1}, Landroidx/compose/foundation/MutatorMutex;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/compose/material/SliderDraggableState;->scrollMutex:Landroidx/compose/foundation/MutatorMutex;

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
.end method

.method public static final synthetic access$getDragScope$p(Landroidx/compose/material/SliderDraggableState;)Landroidx/compose/foundation/gestures/DragScope;
    .locals 0

    iget-object p0, p0, Landroidx/compose/material/SliderDraggableState;->dragScope:Landroidx/compose/foundation/gestures/DragScope;

    return-object p0
.end method

.method public static final synthetic access$getScrollMutex$p(Landroidx/compose/material/SliderDraggableState;)Landroidx/compose/foundation/MutatorMutex;
    .locals 0

    iget-object p0, p0, Landroidx/compose/material/SliderDraggableState;->scrollMutex:Landroidx/compose/foundation/MutatorMutex;

    return-object p0
.end method

.method public static final synthetic access$setDragging(Landroidx/compose/material/SliderDraggableState;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/material/SliderDraggableState;->setDragging(Z)V

    return-void
.end method

.method private final setDragging(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/SliderDraggableState;->isDragging$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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


# virtual methods
.method public dispatchRawDelta(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/material/SliderDraggableState;->onDelta:Lv3/l;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

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
            "Landroidx/compose/foundation/gestures/DragScope;",
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

    new-instance v0, Landroidx/compose/material/SliderDraggableState$drag$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/compose/material/SliderDraggableState$drag$2;-><init>(Landroidx/compose/material/SliderDraggableState;Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)V

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
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material/SliderDraggableState;->onDelta:Lv3/l;

    return-object v0
.end method

.method public final isDragging()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/SliderDraggableState;->isDragging$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method
