.class final Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/x2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/t<",
        "TR;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# instance fields
.field final a:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TR;>;"
        }
    .end annotation
.end field

.field final b:Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/x2$a<",
            "*>;"
        }
    .end annotation
.end field

.field c:Lorg/reactivestreams/q;


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;",
            "Lio/reactivex/rxjava3/internal/operators/flowable/x2$a<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->a:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->b:Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;

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
.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->c:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->b:Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;->dispose()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->a:Lorg/reactivestreams/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->b:Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;->dispose()V

    .line 9
    .line 10
    .line 11
    return-void
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->a:Lorg/reactivestreams/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->b:Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/x2$a;->dispose()V

    .line 9
    .line 10
    .line 11
    return-void
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
            "(TR;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->a:Lorg/reactivestreams/p;

    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->c:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(Lorg/reactivestreams/q;Lorg/reactivestreams/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->c:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->a:Lorg/reactivestreams/p;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/x2$c;->c:Lorg/reactivestreams/q;

    invoke-interface {v0, p1, p2}, Lorg/reactivestreams/q;->request(J)V

    return-void
.end method
