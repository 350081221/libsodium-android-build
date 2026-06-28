.class public final Lio/reactivex/rxjava3/internal/operators/observable/b0;
.super Lio/reactivex/rxjava3/core/r0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/b0$a;
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
        "Lio/reactivex/rxjava3/internal/fuseable/f<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/n0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/n0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/n0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/n0<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/r0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/b0;->a:Lio/reactivex/rxjava3/core/n0;

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
.method public M1(Lio/reactivex/rxjava3/core/u0;)V
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

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b0;->a:Lio/reactivex/rxjava3/core/n0;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/observable/b0$a;

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/internal/operators/observable/b0$a;-><init>(Lio/reactivex/rxjava3/core/u0;)V

    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    return-void
.end method

.method public b()Lio/reactivex/rxjava3/core/i0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/i0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/observable/a0;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/b0;->a:Lio/reactivex/rxjava3/core/n0;

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/operators/observable/a0;-><init>(Lio/reactivex/rxjava3/core/n0;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->R(Lio/reactivex/rxjava3/core/i0;)Lio/reactivex/rxjava3/core/i0;

    move-result-object v0

    return-object v0
.end method
