.class public final Lio/reactivex/rxjava3/internal/operators/flowable/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/e$b;,
        Lio/reactivex/rxjava3/internal/operators/flowable/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e;->a:Lorg/reactivestreams/o;

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
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e$b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/e$a;

    .line 7
    .line 8
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e;->a:Lorg/reactivestreams/o;

    .line 9
    .line 10
    invoke-direct {v1, v2, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e$a;-><init>(Lorg/reactivestreams/o;Lio/reactivex/rxjava3/internal/operators/flowable/e$b;)V

    .line 11
    .line 12
    .line 13
    return-object v1
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
