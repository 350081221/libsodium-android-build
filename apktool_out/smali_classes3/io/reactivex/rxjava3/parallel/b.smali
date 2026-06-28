.class public abstract Lio/reactivex/rxjava3/parallel/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static C(Lorg/reactivestreams/o;)Lio/reactivex/rxjava3/parallel/b;
    .locals 2
    .param p0    # Lorg/reactivestreams/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/reactivestreams/o<",
            "+TT;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v1

    invoke-static {p0, v0, v1}, Lio/reactivex/rxjava3/parallel/b;->E(Lorg/reactivestreams/o;II)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p0

    return-object p0
.end method

.method public static D(Lorg/reactivestreams/o;I)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p0    # Lorg/reactivestreams/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/reactivestreams/o<",
            "+TT;>;I)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-static {p0, p1, v0}, Lio/reactivex/rxjava3/parallel/b;->E(Lorg/reactivestreams/o;II)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p0

    return-object p0
.end method

.method public static E(Lorg/reactivestreams/o;II)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p0    # Lorg/reactivestreams/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/reactivestreams/o<",
            "+TT;>;II)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "source is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "parallelism"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    const-string v0, "prefetch"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/i;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/i;-><init>(Lorg/reactivestreams/o;II)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
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
.end method

.method public static varargs F([Lorg/reactivestreams/o;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p0    # [Lorg/reactivestreams/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Lorg/reactivestreams/o<",
            "TT;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "publishers is null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    array-length v0, p0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/h;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/parallel/h;-><init>([Lorg/reactivestreams/o;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "Zero publishers not supported"

    .line 22
    .line 23
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
    .line 27
.end method


# virtual methods
.method public final A(Lm3/o;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Ljava/util/stream/Stream<",
            "+TR;>;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/parallel/b;->B(Lm3/o;I)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p1

    return-object p1
.end method

.method public final B(Lm3/o;I)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Ljava/util/stream/Stream<",
            "+TR;>;>;I)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "prefetch"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/jdk8/b0;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/jdk8/b0;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final G(Lm3/o;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+TR;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/k;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/k;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final H(Lm3/o;Lio/reactivex/rxjava3/parallel/a;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/rxjava3/parallel/a;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+TR;>;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "errorHandler is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/l;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/l;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final I(Lm3/o;Lm3/c;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lm3/c;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+TR;>;",
            "Lm3/c<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ">;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "errorHandler is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/l;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/l;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final J(Lm3/o;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;",
            "Ljava/util/Optional<",
            "+TR;>;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/jdk8/c0;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lio/reactivex/rxjava3/internal/jdk8/c0;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final K(Lm3/o;Lio/reactivex/rxjava3/parallel/a;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/rxjava3/parallel/a;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;",
            "Ljava/util/Optional<",
            "+TR;>;>;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "errorHandler is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/jdk8/d0;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/jdk8/d0;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final L(Lm3/o;Lm3/c;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lm3/c;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;",
            "Ljava/util/Optional<",
            "+TR;>;>;",
            "Lm3/c<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ">;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "errorHandler is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/jdk8/d0;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/jdk8/d0;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public abstract M()I
    .annotation runtime Ll3/d;
    .end annotation
.end method

.method public final N(Lm3/c;)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .param p1    # Lm3/c;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/c<",
            "TT;TT;TT;>;)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->UNBOUNDED_IN:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "reducer is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/o;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/o;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final O(Lm3/s;Lm3/c;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/s;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lm3/c;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/s<",
            "TR;>;",
            "Lm3/c<",
            "TR;-TT;TR;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->UNBOUNDED_IN:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "initialSupplier is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "reducer is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/n;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/n;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/s;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final P(Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/core/q0;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/q0;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "custom"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/parallel/b;->Q(Lio/reactivex/rxjava3/core/q0;I)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p1

    return-object p1
.end method

.method public final Q(Lio/reactivex/rxjava3/core/q0;I)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/core/q0;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/q0;",
            "I)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "custom"
    .end annotation

    .line 1
    const-string v0, "scheduler is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "prefetch"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/p;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/p;-><init>(Lio/reactivex/rxjava3/parallel/b;Lio/reactivex/rxjava3/core/q0;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final R()Lio/reactivex/rxjava3/core/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/parallel/b;->S(I)Lio/reactivex/rxjava3/core/o;

    move-result-object v0

    return-object v0
.end method

.method public final S(I)Lio/reactivex/rxjava3/core/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "prefetch"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/j;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/parallel/j;-><init>(Lio/reactivex/rxjava3/parallel/b;IZ)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method

.method public final T()Lio/reactivex/rxjava3/core/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/parallel/b;->U(I)Lio/reactivex/rxjava3/core/o;

    move-result-object v0

    return-object v0
.end method

.method public final U(I)Lio/reactivex/rxjava3/core/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "prefetch"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/j;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/parallel/j;-><init>(Lio/reactivex/rxjava3/parallel/b;IZ)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method

.method public final V(Ljava/util/Comparator;)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .param p1    # Ljava/util/Comparator;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TT;>;)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->UNBOUNDED_IN:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    const/16 v0, 0x10

    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/parallel/b;->W(Ljava/util/Comparator;I)Lio/reactivex/rxjava3/core/o;

    move-result-object p1

    return-object p1
.end method

.method public final W(Ljava/util/Comparator;I)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .param p1    # Ljava/util/Comparator;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TT;>;I)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->UNBOUNDED_IN:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "comparator is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "capacityHint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/reactivex/rxjava3/parallel/b;->M()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    div-int/2addr p2, v0

    .line 16
    add-int/lit8 p2, p2, 0x1

    .line 17
    .line 18
    invoke-static {p2}, Lio/reactivex/rxjava3/internal/functions/a;->f(I)Lm3/s;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {}, Lio/reactivex/rxjava3/internal/util/o;->instance()Lm3/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, p2, v0}, Lio/reactivex/rxjava3/parallel/b;->O(Lm3/s;Lm3/c;)Lio/reactivex/rxjava3/parallel/b;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance v0, Lio/reactivex/rxjava3/internal/util/w;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/util/w;-><init>(Ljava/util/Comparator;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v0}, Lio/reactivex/rxjava3/parallel/b;->G(Lm3/o;)Lio/reactivex/rxjava3/parallel/b;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/q;

    .line 40
    .line 41
    invoke-direct {v0, p2, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/q;-><init>(Lio/reactivex/rxjava3/parallel/b;Ljava/util/Comparator;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
    .line 49
    .line 50
.end method

.method public abstract X([Lorg/reactivestreams/p;)V
    .param p1    # [Lorg/reactivestreams/p;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->SPECIAL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation
.end method

.method public final Y(Lio/reactivex/rxjava3/parallel/c;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/parallel/c;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/rxjava3/parallel/c<",
            "TT;TR;>;)TR;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "converter is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p1, Lio/reactivex/rxjava3/parallel/c;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/parallel/c;->a(Lio/reactivex/rxjava3/parallel/b;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public final Z(Ljava/util/Comparator;)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .param p1    # Ljava/util/Comparator;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TT;>;)",
            "Lio/reactivex/rxjava3/core/o<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->UNBOUNDED_IN:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    const/16 v0, 0x10

    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/parallel/b;->a0(Ljava/util/Comparator;I)Lio/reactivex/rxjava3/core/o;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/stream/Collector;)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .param p1    # Ljava/util/stream/Collector;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/stream/Collector<",
            "TT;TA;TR;>;)",
            "Lio/reactivex/rxjava3/core/o<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->UNBOUNDED_IN:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "collector is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/jdk8/a0;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lio/reactivex/rxjava3/internal/jdk8/a0;-><init>(Lio/reactivex/rxjava3/parallel/b;Ljava/util/stream/Collector;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final a0(Ljava/util/Comparator;I)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .param p1    # Ljava/util/Comparator;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TT;>;I)",
            "Lio/reactivex/rxjava3/core/o<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->UNBOUNDED_IN:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "comparator is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "capacityHint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/reactivex/rxjava3/parallel/b;->M()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    div-int/2addr p2, v0

    .line 16
    add-int/lit8 p2, p2, 0x1

    .line 17
    .line 18
    invoke-static {p2}, Lio/reactivex/rxjava3/internal/functions/a;->f(I)Lm3/s;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {}, Lio/reactivex/rxjava3/internal/util/o;->instance()Lm3/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, p2, v0}, Lio/reactivex/rxjava3/parallel/b;->O(Lm3/s;Lm3/c;)Lio/reactivex/rxjava3/parallel/b;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance v0, Lio/reactivex/rxjava3/internal/util/w;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/util/w;-><init>(Ljava/util/Comparator;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v0}, Lio/reactivex/rxjava3/parallel/b;->G(Lm3/o;)Lio/reactivex/rxjava3/parallel/b;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    new-instance v0, Lio/reactivex/rxjava3/internal/util/p;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/util/p;-><init>(Ljava/util/Comparator;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v0}, Lio/reactivex/rxjava3/parallel/b;->N(Lm3/c;)Lio/reactivex/rxjava3/core/o;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public final b(Lm3/s;Lm3/b;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/s;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lm3/b;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/s<",
            "+TC;>;",
            "Lm3/b<",
            "-TC;-TT;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TC;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->UNBOUNDED_IN:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "collectionSupplier is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "collector is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/a;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/a;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/s;Lm3/b;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method protected final b0([Lorg/reactivestreams/p;)Z
    .locals 5
    .param p1    # [Lorg/reactivestreams/p;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/p<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "subscribers is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/parallel/b;->M()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    array-length v1, p1

    .line 11
    if-eq v1, v0, :cond_1

    .line 12
    .line 13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v3, "parallelism = "

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, ", subscribers = "

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    array-length v0, p1

    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    array-length v0, p1

    .line 45
    const/4 v2, 0x0

    .line 46
    move v3, v2

    .line 47
    :goto_0
    if-ge v3, v0, :cond_0

    .line 48
    .line 49
    aget-object v4, p1, v3

    .line 50
    .line 51
    invoke-static {v1, v4}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    return v2

    .line 58
    :cond_1
    const/4 p1, 0x1

    .line 59
    return p1
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
.end method

.method public final c(Lio/reactivex/rxjava3/parallel/d;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/parallel/d;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/rxjava3/parallel/d<",
            "TT;TU;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TU;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "composer is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p1, Lio/reactivex/rxjava3/parallel/d;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/parallel/d;->a(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method

.method public final d(Lm3/o;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/parallel/b;->e(Lm3/o;I)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lm3/o;I)Lio/reactivex/rxjava3/parallel/b;
    .locals 2
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;I)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "prefetch"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/b;

    .line 12
    .line 13
    sget-object v1, Lio/reactivex/rxjava3/internal/util/j;->IMMEDIATE:Lio/reactivex/rxjava3/internal/util/j;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1, p2, v1}, Lio/reactivex/rxjava3/internal/operators/parallel/b;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;ILio/reactivex/rxjava3/internal/util/j;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
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
.end method

.method public final f(Lm3/o;IZ)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;IZ)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "prefetch"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/b;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    sget-object p3, Lio/reactivex/rxjava3/internal/util/j;->END:Lio/reactivex/rxjava3/internal/util/j;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object p3, Lio/reactivex/rxjava3/internal/util/j;->BOUNDARY:Lio/reactivex/rxjava3/internal/util/j;

    .line 19
    .line 20
    :goto_0
    invoke-direct {v0, p0, p1, p2, p3}, Lio/reactivex/rxjava3/internal/operators/parallel/b;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;ILio/reactivex/rxjava3/internal/util/j;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
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
.end method

.method public final g(Lm3/o;Z)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;Z)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0, p2}, Lio/reactivex/rxjava3/parallel/b;->f(Lm3/o;IZ)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lm3/g;)Lio/reactivex/rxjava3/parallel/b;
    .locals 11
    .param p1    # Lm3/g;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/g<",
            "-TT;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onAfterNext is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    sget-object v10, Lio/reactivex/rxjava3/internal/functions/a;->c:Lm3/a;

    .line 17
    .line 18
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    sget-object v9, Lio/reactivex/rxjava3/internal/functions/a;->g:Lm3/q;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    move-object v2, p0

    .line 26
    move-object v4, p1

    .line 27
    move-object v6, v10

    .line 28
    move-object v7, v10

    .line 29
    invoke-direct/range {v1 .. v10}, Lio/reactivex/rxjava3/internal/operators/parallel/m;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
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
.end method

.method public final i(Lm3/a;)Lio/reactivex/rxjava3/parallel/b;
    .locals 11
    .param p1    # Lm3/a;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/a;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onAfterTerminate is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    sget-object v10, Lio/reactivex/rxjava3/internal/functions/a;->c:Lm3/a;

    .line 21
    .line 22
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    sget-object v9, Lio/reactivex/rxjava3/internal/functions/a;->g:Lm3/q;

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    move-object v2, p0

    .line 30
    move-object v6, v10

    .line 31
    move-object v7, p1

    .line 32
    invoke-direct/range {v1 .. v10}, Lio/reactivex/rxjava3/internal/operators/parallel/m;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
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
.end method

.method public final j(Lm3/a;)Lio/reactivex/rxjava3/parallel/b;
    .locals 11
    .param p1    # Lm3/a;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/a;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onCancel is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    sget-object v7, Lio/reactivex/rxjava3/internal/functions/a;->c:Lm3/a;

    .line 21
    .line 22
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    sget-object v9, Lio/reactivex/rxjava3/internal/functions/a;->g:Lm3/q;

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    move-object v2, p0

    .line 30
    move-object v6, v7

    .line 31
    move-object v10, p1

    .line 32
    invoke-direct/range {v1 .. v10}, Lio/reactivex/rxjava3/internal/operators/parallel/m;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
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
.end method

.method public final k(Lm3/a;)Lio/reactivex/rxjava3/parallel/b;
    .locals 11
    .param p1    # Lm3/a;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/a;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onComplete is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    sget-object v10, Lio/reactivex/rxjava3/internal/functions/a;->c:Lm3/a;

    .line 21
    .line 22
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    sget-object v9, Lio/reactivex/rxjava3/internal/functions/a;->g:Lm3/q;

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    move-object v2, p0

    .line 30
    move-object v6, p1

    .line 31
    move-object v7, v10

    .line 32
    invoke-direct/range {v1 .. v10}, Lio/reactivex/rxjava3/internal/operators/parallel/m;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
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
.end method

.method public final l(Lm3/g;)Lio/reactivex/rxjava3/parallel/b;
    .locals 11
    .param p1    # Lm3/g;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onError is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    sget-object v10, Lio/reactivex/rxjava3/internal/functions/a;->c:Lm3/a;

    .line 17
    .line 18
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    sget-object v9, Lio/reactivex/rxjava3/internal/functions/a;->g:Lm3/q;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    move-object v2, p0

    .line 26
    move-object v5, p1

    .line 27
    move-object v6, v10

    .line 28
    move-object v7, v10

    .line 29
    invoke-direct/range {v1 .. v10}, Lio/reactivex/rxjava3/internal/operators/parallel/m;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
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
.end method

.method public final m(Lm3/g;)Lio/reactivex/rxjava3/parallel/b;
    .locals 11
    .param p1    # Lm3/g;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/g<",
            "-TT;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onNext is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    sget-object v10, Lio/reactivex/rxjava3/internal/functions/a;->c:Lm3/a;

    .line 17
    .line 18
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    sget-object v9, Lio/reactivex/rxjava3/internal/functions/a;->g:Lm3/q;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    move-object v2, p0

    .line 26
    move-object v3, p1

    .line 27
    move-object v6, v10

    .line 28
    move-object v7, v10

    .line 29
    invoke-direct/range {v1 .. v10}, Lio/reactivex/rxjava3/internal/operators/parallel/m;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
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
.end method

.method public final n(Lm3/g;Lio/reactivex/rxjava3/parallel/a;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/g;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/rxjava3/parallel/a;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/g<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onNext is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "errorHandler is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/c;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/c;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final o(Lm3/g;Lm3/c;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/g;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lm3/c;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/g<",
            "-TT;>;",
            "Lm3/c<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ">;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onNext is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "errorHandler is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/c;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/c;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final p(Lm3/q;)Lio/reactivex/rxjava3/parallel/b;
    .locals 11
    .param p1    # Lm3/q;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/q;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onRequest is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    sget-object v10, Lio/reactivex/rxjava3/internal/functions/a;->c:Lm3/a;

    .line 21
    .line 22
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    move-object v1, v0

    .line 27
    move-object v2, p0

    .line 28
    move-object v6, v10

    .line 29
    move-object v7, v10

    .line 30
    move-object v9, p1

    .line 31
    invoke-direct/range {v1 .. v10}, Lio/reactivex/rxjava3/internal/operators/parallel/m;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
.end method

.method public final q(Lm3/g;)Lio/reactivex/rxjava3/parallel/b;
    .locals 11
    .param p1    # Lm3/g;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/g<",
            "-",
            "Lorg/reactivestreams/q;",
            ">;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "onSubscribe is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/m;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    sget-object v10, Lio/reactivex/rxjava3/internal/functions/a;->c:Lm3/a;

    .line 21
    .line 22
    sget-object v9, Lio/reactivex/rxjava3/internal/functions/a;->g:Lm3/q;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    move-object v2, p0

    .line 26
    move-object v6, v10

    .line 27
    move-object v7, v10

    .line 28
    move-object v8, p1

    .line 29
    invoke-direct/range {v1 .. v10}, Lio/reactivex/rxjava3/internal/operators/parallel/m;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
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
.end method

.method public final r(Lm3/r;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/r;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/r<",
            "-TT;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "predicate is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/d;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/d;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/r;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final s(Lm3/r;Lio/reactivex/rxjava3/parallel/a;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/r;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/rxjava3/parallel/a;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/r<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ")",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "predicate is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "errorHandler is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/e;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/e;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/r;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final t(Lm3/r;Lm3/c;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/r;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p2    # Lm3/c;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/r<",
            "-TT;>;",
            "Lm3/c<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ">;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "predicate is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "errorHandler is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/e;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/e;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/r;Lm3/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final u(Lm3/o;)Lio/reactivex/rxjava3/parallel/b;
    .locals 3
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v0, v1}, Lio/reactivex/rxjava3/parallel/b;->x(Lm3/o;ZII)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p1

    return-object p1
.end method

.method public final v(Lm3/o;Z)Lio/reactivex/rxjava3/parallel/b;
    .locals 2
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;Z)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v1

    invoke-virtual {p0, p1, p2, v0, v1}, Lio/reactivex/rxjava3/parallel/b;->x(Lm3/o;ZII)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lm3/o;ZI)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;ZI)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lio/reactivex/rxjava3/parallel/b;->x(Lm3/o;ZII)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lm3/o;ZII)Lio/reactivex/rxjava3/parallel/b;
    .locals 7
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;ZII)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "maxConcurrency"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    const-string v0, "prefetch"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/f;

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    move-object v2, p0

    .line 20
    move-object v3, p1

    .line 21
    move v4, p2

    .line 22
    move v5, p3

    .line 23
    move v6, p4

    .line 24
    invoke-direct/range {v1 .. v6}, Lio/reactivex/rxjava3/internal/operators/parallel/f;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;ZII)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final y(Lm3/o;)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TU;>;>;)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TU;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/parallel/b;->z(Lm3/o;I)Lio/reactivex/rxjava3/parallel/b;

    move-result-object p1

    return-object p1
.end method

.method public final z(Lm3/o;I)Lio/reactivex/rxjava3/parallel/b;
    .locals 1
    .param p1    # Lm3/o;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Lm3/o<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TU;>;>;I)",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TU;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->FULL:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "mapper is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "bufferSize"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/g;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/parallel/g;-><init>(Lio/reactivex/rxjava3/parallel/b;Lm3/o;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->V(Lio/reactivex/rxjava3/parallel/b;)Lio/reactivex/rxjava3/parallel/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method
