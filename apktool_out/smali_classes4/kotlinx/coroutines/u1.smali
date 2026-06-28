.class public final Lkotlinx/coroutines/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0008\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0008\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0019\u0010\u0007\u001a\u00020\u00052\u000e\u0008\u0004\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\u0008\u001a\u0008\u0010\u0008\u001a\u00020\u0002H\u0001\u001a\u000c\u0010\u000b\u001a\u00020\n*\u00020\tH\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlinx/coroutines/r1;",
        "a",
        "",
        "d",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "block",
        "c",
        "e",
        "Ljava/lang/Thread;",
        "",
        "b",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a()Lkotlinx/coroutines/r1;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlinx/coroutines/h;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlinx/coroutines/h;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/Thread;)Z
    .locals 1
    .param p0    # Ljava/lang/Thread;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lkotlinx/coroutines/f1;
    .end annotation

    .annotation build Lkotlinx/coroutines/g2;
    .end annotation

    .line 1
    instance-of v0, p0, Lkotlinx/coroutines/scheduling/a$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p0, Lkotlinx/coroutines/scheduling/a$c;

    .line 8
    .line 9
    invoke-virtual {p0}, Lkotlinx/coroutines/scheduling/a$c;->p()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
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

.method public static final c(Lv3/a;)V
    .locals 0
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Lv3/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final d()J
    .locals 2
    .annotation build Lkotlinx/coroutines/g2;
    .end annotation

    sget-object v0, Lkotlinx/coroutines/p3;->a:Lkotlinx/coroutines/p3;

    invoke-virtual {v0}, Lkotlinx/coroutines/p3;->a()Lkotlinx/coroutines/r1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlinx/coroutines/r1;->M0()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    :goto_0
    return-wide v0
.end method

.method public static final e()J
    .locals 4
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lkotlinx/coroutines/f1;
    .end annotation

    .annotation build Lkotlinx/coroutines/g2;
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lkotlinx/coroutines/scheduling/a$c;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lkotlinx/coroutines/scheduling/a$c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/a$c;->t()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v3, "Expected CoroutineScheduler.Worker, but got "

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
