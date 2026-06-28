.class final Lio/reactivex/rxjava3/internal/operators/flowable/i2$a;
.super Lio/reactivex/rxjava3/internal/subscribers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/i2;
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
        "Lio/reactivex/rxjava3/internal/subscribers/t<",
        "TT;",
        "Lio/reactivex/rxjava3/core/f0<",
        "TT;>;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x33ea157c2cf0a1deL


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-",
            "Lio/reactivex/rxjava3/core/f0<",
            "TT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/subscribers/t;-><init>(Lorg/reactivestreams/p;)V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    invoke-static {}, Lio/reactivex/rxjava3/core/f0;->a()Lio/reactivex/rxjava3/core/f0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/subscribers/t;->complete(Ljava/lang/Object;)V

    return-void
.end method

.method protected onDrop(Lio/reactivex/rxjava3/core/f0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/f0<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lio/reactivex/rxjava3/core/f0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lio/reactivex/rxjava3/core/f0;->d()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onDrop(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lio/reactivex/rxjava3/core/f0;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/i2$a;->onDrop(Lio/reactivex/rxjava3/core/f0;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1}, Lio/reactivex/rxjava3/core/f0;->b(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/f0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/subscribers/t;->complete(Ljava/lang/Object;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/subscribers/t;->produced:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/subscribers/t;->produced:J

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscribers/t;->downstream:Lorg/reactivestreams/p;

    .line 9
    .line 10
    invoke-static {p1}, Lio/reactivex/rxjava3/core/f0;->c(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/f0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

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
