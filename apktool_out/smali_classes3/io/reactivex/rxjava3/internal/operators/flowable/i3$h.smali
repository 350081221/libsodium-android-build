.class final Lio/reactivex/rxjava3/internal/operators/flowable/i3$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/reactivestreams/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/i3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/reactivestreams/o<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$i<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final b:Lm3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/s<",
            "+",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$f<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lm3/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$i<",
            "TT;>;>;",
            "Lm3/s<",
            "+",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$f<",
            "TT;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$h;->b:Lm3/s;

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
.method public subscribe(Lorg/reactivestreams/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$h;->b:Lm3/s;

    .line 12
    .line 13
    invoke-interface {v0}, Lm3/s;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v0, v2, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v0, v1

    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    :goto_1
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 45
    .line 46
    invoke-direct {v1, v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;Lorg/reactivestreams/p;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->add(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->isDisposed()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->remove(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->manageRequests()V

    .line 66
    .line 67
    .line 68
    iget-object p1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 69
    .line 70
    invoke-interface {p1, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;->replay(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)V

    .line 71
    .line 72
    .line 73
    return-void
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
