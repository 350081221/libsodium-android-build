.class final Landroidx/compose/material3/InternalMutatorMutex$Mutator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/material3/InternalMutatorMutex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Mutator"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/material3/InternalMutatorMutex$Mutator;",
        "",
        "other",
        "",
        "canInterrupt",
        "Lkotlin/r2;",
        "cancel",
        "Landroidx/compose/foundation/MutatePriority;",
        "priority",
        "Landroidx/compose/foundation/MutatePriority;",
        "getPriority",
        "()Landroidx/compose/foundation/MutatePriority;",
        "Lkotlinx/coroutines/l2;",
        "job",
        "Lkotlinx/coroutines/l2;",
        "getJob",
        "()Lkotlinx/coroutines/l2;",
        "<init>",
        "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/l2;)V",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final job:Lkotlinx/coroutines/l2;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final priority:Landroidx/compose/foundation/MutatePriority;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/l2;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/MutatePriority;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/l2;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material3/InternalMutatorMutex$Mutator;->priority:Landroidx/compose/foundation/MutatePriority;

    iput-object p2, p0, Landroidx/compose/material3/InternalMutatorMutex$Mutator;->job:Lkotlinx/coroutines/l2;

    return-void
.end method


# virtual methods
.method public final canInterrupt(Landroidx/compose/material3/InternalMutatorMutex$Mutator;)Z
    .locals 1
    .param p1    # Landroidx/compose/material3/InternalMutatorMutex$Mutator;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/material3/InternalMutatorMutex$Mutator;->priority:Landroidx/compose/foundation/MutatePriority;

    iget-object p1, p1, Landroidx/compose/material3/InternalMutatorMutex$Mutator;->priority:Landroidx/compose/foundation/MutatePriority;

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final cancel()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/material3/InternalMutatorMutex$Mutator;->job:Lkotlinx/coroutines/l2;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/l2$a;->b(Lkotlinx/coroutines/l2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final getJob()Lkotlinx/coroutines/l2;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/InternalMutatorMutex$Mutator;->job:Lkotlinx/coroutines/l2;

    return-object v0
.end method

.method public final getPriority()Landroidx/compose/foundation/MutatePriority;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/InternalMutatorMutex$Mutator;->priority:Landroidx/compose/foundation/MutatePriority;

    return-object v0
.end method
