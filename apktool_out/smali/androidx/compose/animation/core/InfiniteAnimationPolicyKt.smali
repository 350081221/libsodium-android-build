.class public final Landroidx/compose/animation/core/InfiniteAnimationPolicyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a9\u0010\u0007\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0003\u0012\u0008\u0008\u0004\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a;\u0010\n\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002#\u0008\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008\u0003\u0012\u0008\u0008\u0004\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00028\u00000\u0001H\u0086H\u00a2\u0006\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "R",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/v0;",
        "name",
        "frameTimeNanos",
        "onFrame",
        "withInfiniteAnimationFrameNanos",
        "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "frameTimeMillis",
        "withInfiniteAnimationFrameMillis",
        "animation-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final withInfiniteAnimationFrameMillis(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
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

    new-instance v0, Landroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2;

    invoke-direct {v0, p0}, Landroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2;-><init>(Lv3/l;)V

    invoke-static {v0, p1}, Landroidx/compose/animation/core/InfiniteAnimationPolicyKt;->withInfiniteAnimationFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final withInfiniteAnimationFrameMillis$$forInline(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
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

    new-instance v0, Landroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2;

    invoke-direct {v0, p0}, Landroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2;-><init>(Lv3/l;)V

    const/4 p0, 0x0

    invoke-static {p0}, Lkotlin/jvm/internal/i0;->e(I)V

    invoke-static {v0, p1}, Landroidx/compose/animation/core/InfiniteAnimationPolicyKt;->withInfiniteAnimationFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p1}, Lkotlin/jvm/internal/i0;->e(I)V

    return-object p0
.end method

.method public static final withInfiniteAnimationFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
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

    .line 1
    invoke-interface {p1}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/platform/InfiniteAnimationPolicy;->Key:Landroidx/compose/ui/platform/InfiniteAnimationPolicy$Key;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lkotlin/coroutines/g;->get(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/compose/ui/platform/InfiniteAnimationPolicy;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroidx/compose/runtime/MonotonicFrameClockKt;->withFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance v1, Landroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, p0, v2}, Landroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2;-><init>(Lv3/l;Lkotlin/coroutines/d;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, p1}, Landroidx/compose/ui/platform/InfiniteAnimationPolicy;->onInfiniteOperation(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
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
