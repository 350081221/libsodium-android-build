.class public final Lio/reactivex/rxjava3/internal/operators/maybe/u0;
.super Lio/reactivex/rxjava3/core/r0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/h;
.implements Lio/reactivex/rxjava3/internal/fuseable/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/maybe/u0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/r0<",
        "Ljava/lang/Boolean;",
        ">;",
        "Lio/reactivex/rxjava3/internal/fuseable/h<",
        "TT;>;",
        "Lio/reactivex/rxjava3/internal/fuseable/e<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/d0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/d0<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/r0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/u0;->a:Lio/reactivex/rxjava3/core/d0;

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
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/u0;->a:Lio/reactivex/rxjava3/core/d0;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/maybe/u0$a;

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/u0$a;-><init>(Lio/reactivex/rxjava3/core/u0;)V

    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/d0;->a(Lio/reactivex/rxjava3/core/a0;)V

    return-void
.end method

.method public c()Lio/reactivex/rxjava3/core/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/x<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/t0;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/u0;->a:Lio/reactivex/rxjava3/core/d0;

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/operators/maybe/t0;-><init>(Lio/reactivex/rxjava3/core/d0;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->Q(Lio/reactivex/rxjava3/core/x;)Lio/reactivex/rxjava3/core/x;

    move-result-object v0

    return-object v0
.end method

.method public source()Lio/reactivex/rxjava3/core/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/d0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/u0;->a:Lio/reactivex/rxjava3/core/d0;

    return-object v0
.end method
