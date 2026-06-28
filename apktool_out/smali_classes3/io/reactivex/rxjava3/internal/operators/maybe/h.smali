.class public final Lio/reactivex/rxjava3/internal/operators/maybe/h;
.super Lio/reactivex/rxjava3/core/r0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/maybe/h$a;
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

.field final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/d0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/d0<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/r0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/h;->a:Lio/reactivex/rxjava3/core/d0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/h;->b:Ljava/lang/Object;

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
.method protected M1(Lio/reactivex/rxjava3/core/u0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/h;->a:Lio/reactivex/rxjava3/core/d0;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/maybe/h$a;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/h;->b:Ljava/lang/Object;

    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/operators/maybe/h$a;-><init>(Lio/reactivex/rxjava3/core/u0;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/d0;->a(Lio/reactivex/rxjava3/core/a0;)V

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

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/h;->a:Lio/reactivex/rxjava3/core/d0;

    return-object v0
.end method
