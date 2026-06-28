.class final Lio/reactivex/rxjava3/internal/operators/observable/n0$a;
.super Lio/reactivex/rxjava3/internal/observers/b;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/observers/b<",
        "TT;>;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x3907ba0b13897e3dL


# instance fields
.field final downstream:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final onFinally:Lm3/a;

.field qd:Lio/reactivex/rxjava3/internal/fuseable/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/l<",
            "TT;>;"
        }
    .end annotation
.end field

.field syncFused:Z

.field upstream:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/p0;Lm3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;",
            "Lm3/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/observers/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->onFinally:Lm3/a;

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
.method public clear()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->qd:Lio/reactivex/rxjava3/internal/fuseable/l;

    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    return-void
.end method

.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->runFinally()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->qd:Lio/reactivex/rxjava3/internal/fuseable/l;

    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->runFinally()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onError(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->runFinally()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->validate(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 16
    .line 17
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->qd:Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 20
    .line 21
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public poll()Ljava/lang/Object;
    .locals 2
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

    .annotation build Ll3/g;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->qd:Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->syncFused:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->runFinally()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public requestFusion(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->qd:Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    and-int/lit8 v2, p1, 0x4

    .line 7
    .line 8
    if-nez v2, :cond_2

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/m;->requestFusion(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    move v1, v0

    .line 20
    :cond_0
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->syncFused:Z

    .line 21
    .line 22
    :cond_1
    return p1

    .line 23
    :cond_2
    return v1
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method runFinally()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n0$a;->onFinally:Lm3/a;

    .line 10
    .line 11
    invoke-interface {v0}, Lm3/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    return-void
    .line 23
.end method
