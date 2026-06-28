.class public final Lio/reactivex/rxjava3/internal/operators/flowable/q2;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"

# interfaces
.implements Lm3/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/q2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/flowable/a<",
        "TT;TT;>;",
        "Lm3/g<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final c:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-TT;>;"
        }
    .end annotation
.end field


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

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 2
    iput-object p0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q2;->c:Lm3/g;

    return-void
.end method

.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Lm3/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Lm3/g<",
            "-TT;>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q2;->c:Lm3/g;

    return-void
.end method


# virtual methods
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/q2$a;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/q2;->c:Lm3/g;

    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/q2$a;-><init>(Lorg/reactivestreams/p;Lm3/g;)V

    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method
