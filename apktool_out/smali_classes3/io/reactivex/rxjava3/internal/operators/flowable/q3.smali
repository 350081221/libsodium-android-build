.class public final Lio/reactivex/rxjava3/internal/operators/flowable/q3;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/q3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/flowable/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field final c:Lm3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/c<",
            "TR;-TT;TR;>;"
        }
    .end annotation
.end field

.field final d:Lm3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/s<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Lm3/s;Lm3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Lm3/s<",
            "TR;>;",
            "Lm3/c<",
            "TR;-TT;TR;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q3;->c:Lm3/c;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q3;->d:Lm3/s;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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


# virtual methods
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q3;->d:Lm3/s;

    .line 2
    .line 3
    invoke-interface {v0}, Lm3/s;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "The seed supplied is null"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 13
    .line 14
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/flowable/q3$a;

    .line 15
    .line 16
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q3;->c:Lm3/c;

    .line 17
    .line 18
    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-direct {v2, p1, v3, v0, v4}, Lio/reactivex/rxjava3/internal/operators/flowable/q3$a;-><init>(Lorg/reactivestreams/p;Lm3/c;Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 34
    .line 35
    .line 36
    return-void
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
