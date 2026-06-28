.class public final Lio/reactivex/rxjava3/internal/operators/flowable/h1;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"

# interfaces
.implements Lm3/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TT;>;",
        "Lm3/s<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:Lm3/a;


# direct methods
.method public constructor <init>(Lm3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/h1;->b:Lm3/a;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/fuseable/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/fuseable/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/fuseable/b;->isDisposed()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/h1;->b:Lm3/a;

    .line 16
    .line 17
    invoke-interface {v1}, Lm3/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/fuseable/b;->isDisposed()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Lorg/reactivestreams/p;->onComplete()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    invoke-static {v1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/fuseable/b;->isDisposed()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    invoke-interface {p1, v1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
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

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/h1;->b:Lm3/a;

    invoke-interface {v0}, Lm3/a;->run()V

    const/4 v0, 0x0

    return-object v0
.end method
