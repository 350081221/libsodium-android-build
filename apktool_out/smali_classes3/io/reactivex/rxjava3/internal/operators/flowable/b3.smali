.class public final Lio/reactivex/rxjava3/internal/operators/flowable/b3;
.super Lio/reactivex/rxjava3/core/x;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/j;
.implements Lio/reactivex/rxjava3/internal/fuseable/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/b3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/x<",
        "TT;>;",
        "Lio/reactivex/rxjava3/internal/fuseable/j<",
        "TT;>;",
        "Lio/reactivex/rxjava3/internal/fuseable/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Lm3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/c<",
            "TT;TT;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Lm3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Lm3/c<",
            "TT;TT;TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/x;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/b3;->a:Lio/reactivex/rxjava3/core/o;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/b3;->b:Lm3/c;

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
.method protected U1(Lio/reactivex/rxjava3/core/a0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/b3;->a:Lio/reactivex/rxjava3/core/o;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/b3$a;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/b3;->b:Lm3/c;

    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/b3$a;-><init>(Lio/reactivex/rxjava3/core/a0;Lm3/c;)V

    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    return-void
.end method

.method public d()Lio/reactivex/rxjava3/core/o;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/a3;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/b3;->a:Lio/reactivex/rxjava3/core/o;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/b3;->b:Lm3/c;

    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/a3;-><init>(Lio/reactivex/rxjava3/core/o;Lm3/c;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    move-result-object v0

    return-object v0
.end method

.method public source()Lorg/reactivestreams/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/reactivestreams/o<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/b3;->a:Lio/reactivex/rxjava3/core/o;

    return-object v0
.end method
