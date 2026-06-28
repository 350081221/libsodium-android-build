.class public final Lio/reactivex/rxjava3/internal/jdk8/e0;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final b:Lio/reactivex/rxjava3/core/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/r0<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Ljava/util/stream/Stream<",
            "+TR;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/r0;Lm3/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/r0<",
            "TT;>;",
            "Lm3/o<",
            "-TT;+",
            "Ljava/util/stream/Stream<",
            "+TR;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/e0;->b:Lio/reactivex/rxjava3/core/r0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/jdk8/e0;->c:Lm3/o;

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
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 3
    .param p1    # Lorg/reactivestreams/p;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/e0;->b:Lio/reactivex/rxjava3/core/r0;

    new-instance v1, Lio/reactivex/rxjava3/internal/jdk8/m$a;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/jdk8/e0;->c:Lm3/o;

    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/jdk8/m$a;-><init>(Lorg/reactivestreams/p;Lm3/o;)V

    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/r0;->a(Lio/reactivex/rxjava3/core/u0;)V

    return-void
.end method
