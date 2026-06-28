.class public final Lio/reactivex/rxjava3/internal/operators/completable/q0;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:Lio/reactivex/rxjava3/core/i;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/q0;->b:Lio/reactivex/rxjava3/core/i;

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
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/q0;->b:Lio/reactivex/rxjava3/core/i;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/k1$a;

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/k1$a;-><init>(Lorg/reactivestreams/p;)V

    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V

    return-void
.end method
