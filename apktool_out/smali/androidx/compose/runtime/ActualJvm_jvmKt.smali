.class public final Landroidx/compose/runtime/ActualJvm_jvmKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000D\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a,\u0010\u0008\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006H\u0081\u0008\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a*\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0002\u0008\rH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0008\rH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0010\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0000H\u0000\u001a\u0008\u0010\u0017\u001a\u00020\u0016H\u0000\u001a\u0008\u0010\u0019\u001a\u00020\u0018H\u0000*\u001e\u0008\u0000\u0010\u001c\u001a\u0004\u0008\u0000\u0010\u001a\"\u0008\u0012\u0004\u0012\u00028\u00000\u001b2\u0008\u0012\u0004\u0012\u00028\u00000\u001b*\u000c\u0008\u0000\u0010\u001e\"\u00020\u001d2\u00020\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "",
        "instance",
        "",
        "identityHashCode",
        "R",
        "lock",
        "Lkotlin/Function0;",
        "block",
        "synchronized",
        "(Ljava/lang/Object;Lv3/a;)Ljava/lang/Object;",
        "Landroidx/compose/runtime/Composer;",
        "composer",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "composable",
        "invokeComposable",
        "(Landroidx/compose/runtime/Composer;Lv3/p;)V",
        "T",
        "invokeComposableForResult",
        "(Landroidx/compose/runtime/Composer;Lv3/p;)Ljava/lang/Object;",
        "it",
        "ensureMutable",
        "",
        "currentThreadId",
        "",
        "currentThreadName",
        "V",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "AtomicReference",
        "Lp4/p;",
        "TestOnly",
        "runtime_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final currentThreadId()J
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final currentThreadName()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final ensureMutable(Ljava/lang/Object;)V
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public static final identityHashCode(Ljava/lang/Object;)I
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final invokeComposable(Landroidx/compose/runtime/Composer;Lv3/p;)V
    .locals 1
    .param p0    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u1;->q(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lv3/p;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p1, p0, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public static final invokeComposableForResult(Landroidx/compose/runtime/Composer;Lv3/p;)Ljava/lang/Object;
    .locals 1
    .param p0    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/Composer;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u1;->q(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lv3/p;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p1, p0, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public static final synchronized(Ljava/lang/Object;Lv3/a;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lv3/a<",
            "+TR;>;)TR;"
        }
    .end annotation

    .annotation build Lkotlin/a1;
    .end annotation

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lkotlin/jvm/internal/i0;->d(I)V

    monitor-exit p0

    invoke-static {v0}, Lkotlin/jvm/internal/i0;->c(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v0}, Lkotlin/jvm/internal/i0;->d(I)V

    monitor-exit p0

    invoke-static {v0}, Lkotlin/jvm/internal/i0;->c(I)V

    throw p1
.end method
