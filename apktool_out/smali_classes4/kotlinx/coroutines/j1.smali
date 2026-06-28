.class final Lkotlinx/coroutines/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016R\u0014\u0010\u000c\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlinx/coroutines/j1;",
        "Ljava/util/concurrent/Executor;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "block",
        "Lkotlin/r2;",
        "execute",
        "",
        "toString",
        "Lkotlinx/coroutines/n0;",
        "a",
        "Lkotlinx/coroutines/n0;",
        "dispatcher",
        "<init>",
        "(Lkotlinx/coroutines/n0;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lkotlinx/coroutines/n0;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/n0;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/n0;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/j1;->a:Lkotlinx/coroutines/n0;

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/j1;->a:Lkotlinx/coroutines/n0;

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/n0;->isDispatchNeeded(Lkotlin/coroutines/g;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/coroutines/j1;->a:Lkotlinx/coroutines/n0;

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Lkotlinx/coroutines/n0;->dispatch(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 18
    .line 19
    .line 20
    :goto_0
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/j1;->a:Lkotlinx/coroutines/n0;

    invoke-virtual {v0}, Lkotlinx/coroutines/n0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
