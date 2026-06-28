.class public final Lio/reactivex/rxjava3/internal/operators/observable/t3;
.super Lio/reactivex/rxjava3/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/t3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/observable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final b:I


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/n0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/n0<",
            "TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/a;-><init>(Lio/reactivex/rxjava3/core/n0;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/t3;->b:I

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
.method public l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/a;->a:Lio/reactivex/rxjava3/core/n0;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/observable/t3$a;

    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/t3;->b:I

    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/operators/observable/t3$a;-><init>(Lio/reactivex/rxjava3/core/p0;I)V

    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    return-void
.end method
