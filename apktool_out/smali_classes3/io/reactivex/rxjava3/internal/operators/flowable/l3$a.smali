.class final Lio/reactivex/rxjava3/internal/operators/flowable/l3$a;
.super Lio/reactivex/rxjava3/internal/operators/flowable/h3$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/l3;
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
        "Lio/reactivex/rxjava3/internal/operators/flowable/h3$c<",
        "TT;",
        "Ljava/lang/Throwable;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x2531bbef65964705L


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/processors/c;Lorg/reactivestreams/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/processors/c<",
            "Ljava/lang/Throwable;",
            ">;",
            "Lorg/reactivestreams/q;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lio/reactivex/rxjava3/internal/operators/flowable/h3$c;-><init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/processors/c;Lorg/reactivestreams/q;)V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/h3$c;->receiver:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/h3$c;->downstream:Lorg/reactivestreams/p;

    .line 7
    .line 8
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

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
    .locals 0

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/h3$c;->again(Ljava/lang/Object;)V

    return-void
.end method
