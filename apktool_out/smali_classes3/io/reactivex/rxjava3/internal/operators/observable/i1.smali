.class public final Lio/reactivex/rxjava3/internal/operators/observable/i1;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/i1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/i0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/o<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/reactivestreams/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/o<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/i1;->a:Lorg/reactivestreams/o;

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
.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/i1;->a:Lorg/reactivestreams/o;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/observable/i1$a;

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/internal/operators/observable/i1$a;-><init>(Lio/reactivex/rxjava3/core/p0;)V

    invoke-interface {v0, v1}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    return-void
.end method
