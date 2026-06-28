.class public final Lio/reactivex/rxjava3/internal/operators/flowable/u1;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/u1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/flowable/a<",
        "TT;TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    return-void
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

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/u1$a;

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/u1$a;-><init>(Lorg/reactivestreams/p;)V

    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    return-void
.end method
