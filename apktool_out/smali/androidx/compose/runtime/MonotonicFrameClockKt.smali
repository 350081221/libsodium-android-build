.class public final Landroidx/compose/runtime/MonotonicFrameClockKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a?\u0010\u0008\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012#\u0008\u0004\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a9\u0010\u000b\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\n\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a9\u0010\u0008\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\u000c\"\u001e\u0010\u0012\u001a\u00020\u0001*\u00020\r8FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "R",
        "Landroidx/compose/runtime/MonotonicFrameClock;",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/v0;",
        "name",
        "frameTimeMillis",
        "onFrame",
        "withFrameMillis",
        "(Landroidx/compose/runtime/MonotonicFrameClock;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "frameTimeNanos",
        "withFrameNanos",
        "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Lkotlin/coroutines/g;",
        "getMonotonicFrameClock",
        "(Lkotlin/coroutines/g;)Landroidx/compose/runtime/MonotonicFrameClock;",
        "getMonotonicFrameClock$annotations",
        "(Lkotlin/coroutines/g;)V",
        "monotonicFrameClock",
        "runtime_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"
    }
.end annotation


# direct methods
.method public static final getMonotonicFrameClock(Lkotlin/coroutines/g;)Landroidx/compose/runtime/MonotonicFrameClock;
    .locals 1
    .param p0    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/runtime/MonotonicFrameClock;->Key:Landroidx/compose/runtime/MonotonicFrameClock$Key;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lkotlin/coroutines/g;->get(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/compose/runtime/MonotonicFrameClock;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
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

.method public static synthetic getMonotonicFrameClock$annotations(Lkotlin/coroutines/g;)V
    .locals 0
    .annotation build Landroidx/compose/runtime/ExperimentalComposeApi;
    .end annotation

    return-void
.end method

.method public static final withFrameMillis(Landroidx/compose/runtime/MonotonicFrameClock;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p0    # Landroidx/compose/runtime/MonotonicFrameClock;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/MonotonicFrameClock;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+TR;>;",
            "Lkotlin/coroutines/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2;-><init>(Lv3/l;)V

    invoke-interface {p0, v0, p2}, Landroidx/compose/runtime/MonotonicFrameClock;->withFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final withFrameMillis(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+TR;>;",
            "Lkotlin/coroutines/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 2
    invoke-interface {p1}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/runtime/MonotonicFrameClockKt;->getMonotonicFrameClock(Lkotlin/coroutines/g;)Landroidx/compose/runtime/MonotonicFrameClock;

    move-result-object v0

    .line 3
    new-instance v1, Landroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2;

    invoke-direct {v1, p0}, Landroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2;-><init>(Lv3/l;)V

    invoke-interface {v0, v1, p1}, Landroidx/compose/runtime/MonotonicFrameClock;->withFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final withFrameMillis$$forInline(Landroidx/compose/runtime/MonotonicFrameClock;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/MonotonicFrameClock;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+TR;>;",
            "Lkotlin/coroutines/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2;-><init>(Lv3/l;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lkotlin/jvm/internal/i0;->e(I)V

    invoke-interface {p0, v0, p2}, Landroidx/compose/runtime/MonotonicFrameClock;->withFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p1}, Lkotlin/jvm/internal/i0;->e(I)V

    return-object p0
.end method

.method public static final withFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+TR;>;",
            "Lkotlin/coroutines/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-interface {p1}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/runtime/MonotonicFrameClockKt;->getMonotonicFrameClock(Lkotlin/coroutines/g;)Landroidx/compose/runtime/MonotonicFrameClock;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Landroidx/compose/runtime/MonotonicFrameClock;->withFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
