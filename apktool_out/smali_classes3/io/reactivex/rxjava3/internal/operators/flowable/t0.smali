.class public final Lio/reactivex/rxjava3/internal/operators/flowable/t0;
.super Lio/reactivex/rxjava3/core/x;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/t0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/x<",
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

.field final b:J


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;J)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/x;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t0;->a:Lio/reactivex/rxjava3/core/o;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t0;->b:J

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
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t0;->a:Lio/reactivex/rxjava3/core/o;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/t0$a;

    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t0;->b:J

    invoke-direct {v1, p1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/t0$a;-><init>(Lio/reactivex/rxjava3/core/a0;J)V

    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    return-void
.end method

.method public d()Lio/reactivex/rxjava3/core/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    new-instance v6, Lio/reactivex/rxjava3/internal/operators/flowable/s0;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t0;->a:Lio/reactivex/rxjava3/core/o;

    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/t0;->b:J

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/reactivex/rxjava3/internal/operators/flowable/s0;-><init>(Lio/reactivex/rxjava3/core/o;JLjava/lang/Object;Z)V

    invoke-static {v6}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    move-result-object v0

    return-object v0
.end method
