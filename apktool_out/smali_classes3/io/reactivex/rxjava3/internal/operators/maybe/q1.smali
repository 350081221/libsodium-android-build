.class public final Lio/reactivex/rxjava3/internal/operators/maybe/q1;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/maybe/q1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/i0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/internal/fuseable/h<",
        "TT;>;"
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
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/q1;->a:Lio/reactivex/rxjava3/core/d0;

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

.method public static I8(Lio/reactivex/rxjava3/core/p0;)Lio/reactivex/rxjava3/core/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)",
            "Lio/reactivex/rxjava3/core/a0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/q1$a;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/maybe/q1$a;-><init>(Lio/reactivex/rxjava3/core/p0;)V

    return-object v0
.end method


# virtual methods
.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/q1;->a:Lio/reactivex/rxjava3/core/d0;

    invoke-static {p1}, Lio/reactivex/rxjava3/internal/operators/maybe/q1;->I8(Lio/reactivex/rxjava3/core/p0;)Lio/reactivex/rxjava3/core/a0;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/d0;->a(Lio/reactivex/rxjava3/core/a0;)V

    return-void
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

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/q1;->a:Lio/reactivex/rxjava3/core/d0;

    return-object v0
.end method
