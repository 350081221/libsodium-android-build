.class final Lio/reactivex/rxjava3/internal/operators/flowable/m3$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/m3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/t<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/m3$c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/m3$c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/m3$d;->a:Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;

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
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/m3$d;->a:Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;->complete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/m3$d;->a:Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;->error(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/m3$d;->a:Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;

    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;->run()V

    return-void
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/m3$d;->a:Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/m3$c;->setOther(Lorg/reactivestreams/q;)V

    return-void
.end method
