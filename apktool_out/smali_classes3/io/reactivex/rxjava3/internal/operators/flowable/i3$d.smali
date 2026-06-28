.class final Lio/reactivex/rxjava3/internal/operators/flowable/i3$d;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/i3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/i3$d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final b:Lm3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/s<",
            "+",
            "Lio/reactivex/rxjava3/flowables/a<",
            "TU;>;>;"
        }
    .end annotation
.end field

.field private final c:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-",
            "Lio/reactivex/rxjava3/core/o<",
            "TU;>;+",
            "Lorg/reactivestreams/o<",
            "TR;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm3/s;Lm3/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/s<",
            "+",
            "Lio/reactivex/rxjava3/flowables/a<",
            "TU;>;>;",
            "Lm3/o<",
            "-",
            "Lio/reactivex/rxjava3/core/o<",
            "TU;>;+",
            "Lorg/reactivestreams/o<",
            "TR;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$d;->b:Lm3/s;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$d;->c:Lm3/o;

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
.end method


# virtual methods
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$d;->b:Lm3/s;

    .line 2
    .line 3
    invoke-interface {v0}, Lm3/s;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "The connectableFactory returned a null ConnectableFlowable."

    .line 8
    .line 9
    invoke-static {v0, v1}, Lio/reactivex/rxjava3/internal/util/k;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lio/reactivex/rxjava3/flowables/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    .line 15
    :try_start_1
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$d;->c:Lm3/o;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "The selector returned a null Publisher."

    .line 22
    .line 23
    invoke-static {v1, v2}, Lio/reactivex/rxjava3/internal/util/k;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lorg/reactivestreams/o;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    new-instance v2, Lio/reactivex/rxjava3/internal/subscribers/v;

    .line 30
    .line 31
    invoke-direct {v2, p1}, Lio/reactivex/rxjava3/internal/subscribers/v;-><init>(Lorg/reactivestreams/p;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v2}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$d$a;

    .line 38
    .line 39
    invoke-direct {p1, p0, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$d$a;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/i3$d;Lio/reactivex/rxjava3/internal/subscribers/v;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/flowables/a;->r9(Lm3/g;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 59
    .line 60
    .line 61
    return-void
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
