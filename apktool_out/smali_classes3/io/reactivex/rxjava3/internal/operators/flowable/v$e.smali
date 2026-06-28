.class final Lio/reactivex/rxjava3/internal/operators/flowable/v$e;
.super Lio/reactivex/rxjava3/internal/subscriptions/i;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/subscriptions/i;",
        "Lio/reactivex/rxjava3/core/t<",
        "TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xc75368d015d6d3dL


# instance fields
.field final parent:Lio/reactivex/rxjava3/internal/operators/flowable/v$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/v$f<",
            "TR;>;"
        }
    .end annotation
.end field

.field produced:J


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/v$f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/v$f<",
            "TR;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lio/reactivex/rxjava3/internal/subscriptions/i;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/v$f;

    .line 6
    .line 7
    return-void
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
.method public onComplete()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->produced:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-eqz v4, :cond_0

    .line 8
    .line 9
    iput-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->produced:J

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lio/reactivex/rxjava3/internal/subscriptions/i;->produced(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/v$f;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/v$f;->innerComplete()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->produced:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-eqz v4, :cond_0

    .line 8
    .line 9
    iput-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->produced:J

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lio/reactivex/rxjava3/internal/subscriptions/i;->produced(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/v$f;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/v$f;->innerError(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void
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
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->produced:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->produced:J

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v$e;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/v$f;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/v$f;->innerNext(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/i;->setSubscription(Lorg/reactivestreams/q;)V

    return-void
.end method
