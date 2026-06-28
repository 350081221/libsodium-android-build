.class final Lio/reactivex/rxjava3/internal/operators/flowable/k4$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
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
.field private static final serialVersionUID:J = -0x31dc445a260f2f32L


# instance fields
.field final synthetic this$0:Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;->upstream:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;

    .line 9
    .line 10
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;->downstream:Lorg/reactivestreams/p;

    .line 11
    .line 12
    iget-object v2, v0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 13
    .line 14
    invoke-static {v1, v0, v2}, Lio/reactivex/rxjava3/internal/util/l;->b(Lorg/reactivestreams/p;Ljava/util/concurrent/atomic/AtomicInteger;Lio/reactivex/rxjava3/internal/util/c;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;->upstream:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;

    .line 9
    .line 10
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;->downstream:Lorg/reactivestreams/p;

    .line 11
    .line 12
    iget-object v2, v0, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 13
    .line 14
    invoke-static {v1, p1, v0, v2}, Lio/reactivex/rxjava3/internal/util/l;->d(Lorg/reactivestreams/p;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lio/reactivex/rxjava3/internal/util/c;)V

    .line 15
    .line 16
    .line 17
    return-void
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
    .locals 0

    .line 1
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/k4$a$a;->onComplete()V

    .line 5
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {p0, p1, v0, v1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lorg/reactivestreams/q;J)Z

    return-void
.end method
