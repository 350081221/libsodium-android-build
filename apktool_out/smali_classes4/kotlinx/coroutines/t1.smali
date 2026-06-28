.class public abstract Lkotlinx/coroutines/t1;
.super Lkotlinx/coroutines/r1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008 \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u000c\u001a\u00020\t8$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlinx/coroutines/t1;",
        "Lkotlinx/coroutines/r1;",
        "Lkotlin/r2;",
        "R0",
        "",
        "now",
        "Lkotlinx/coroutines/s1$c;",
        "delayedTask",
        "Q0",
        "Ljava/lang/Thread;",
        "P0",
        "()Ljava/lang/Thread;",
        "thread",
        "<init>",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/r1;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract P0()Ljava/lang/Thread;
    .annotation build Lp4/l;
    .end annotation
.end method

.method protected Q0(JLkotlinx/coroutines/s1$c;)V
    .locals 1
    .param p3    # Lkotlinx/coroutines/s1$c;
        .annotation build Lp4/l;
        .end annotation
    .end param

    sget-object v0, Lkotlinx/coroutines/y0;->g:Lkotlinx/coroutines/y0;

    invoke-virtual {v0, p1, p2, p3}, Lkotlinx/coroutines/s1;->a1(JLkotlinx/coroutines/s1$c;)V

    return-void
.end method

.method protected final R0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/t1;->P0()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Lkotlinx/coroutines/c;->b()Lkotlinx/coroutines/b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lkotlinx/coroutines/b;->g(Ljava/lang/Thread;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
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
.end method
