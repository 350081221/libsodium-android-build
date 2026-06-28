.class public final Lio/reactivex/rxjava3/internal/operators/flowable/d0;
.super Lio/reactivex/rxjava3/core/r0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/d0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/r0<",
        "Ljava/lang/Long;",
        ">;",
        "Lio/reactivex/rxjava3/internal/fuseable/d<",
        "Ljava/lang/Long;",
        ">;"
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
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/r0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d0;->a:Lio/reactivex/rxjava3/core/o;

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
.method protected M1(Lio/reactivex/rxjava3/core/u0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d0;->a:Lio/reactivex/rxjava3/core/o;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/d0$a;

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/d0$a;-><init>(Lio/reactivex/rxjava3/core/u0;)V

    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    return-void
.end method

.method public d()Lio/reactivex/rxjava3/core/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/o<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/c0;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/d0;->a:Lio/reactivex/rxjava3/core/o;

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/c0;-><init>(Lio/reactivex/rxjava3/core/o;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    move-result-object v0

    return-object v0
.end method
