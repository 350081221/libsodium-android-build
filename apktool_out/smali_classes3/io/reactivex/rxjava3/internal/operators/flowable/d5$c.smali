.class final Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/d5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lorg/reactivestreams/q;",
        ">;",
        "Lio/reactivex/rxjava3/core/t<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2d3210de62c61a18L


# instance fields
.field hasValue:Z

.field final index:I

.field final parent:Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/d5$b<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/d5$b<",
            "**>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->index:I

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
.method dispose()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onComplete()V
    .locals 3

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;

    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->index:I

    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->hasValue:Z

    invoke-virtual {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;->innerComplete(IZ)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;

    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->index:I

    invoke-virtual {v0, v1, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;->innerError(ILjava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->hasValue:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->hasValue:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;

    .line 9
    .line 10
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d5$c;->index:I

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/d5$b;->innerNext(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
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
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {p0, p1, v0, v1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lorg/reactivestreams/q;J)Z

    return-void
.end method
