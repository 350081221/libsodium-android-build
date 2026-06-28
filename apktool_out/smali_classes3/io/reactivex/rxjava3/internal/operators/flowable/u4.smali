.class public final Lio/reactivex/rxjava3/internal/operators/flowable/u4;
.super Lio/reactivex/rxjava3/core/r0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/u4$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U::",
        "Ljava/util/Collection<",
        "-TT;>;>",
        "Lio/reactivex/rxjava3/core/r0<",
        "TU;>;",
        "Lio/reactivex/rxjava3/internal/fuseable/d<",
        "TU;>;"
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

.field final b:Lm3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/s<",
            "TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lio/reactivex/rxjava3/internal/util/b;->asSupplier()Lm3/s;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/u4;-><init>(Lio/reactivex/rxjava3/core/o;Lm3/s;)V

    return-void
.end method

.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Lm3/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Lm3/s<",
            "TU;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/r0;-><init>()V

    .line 3
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u4;->a:Lio/reactivex/rxjava3/core/o;

    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u4;->b:Lm3/s;

    return-void
.end method


# virtual methods
.method protected M1(Lio/reactivex/rxjava3/core/u0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-TU;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u4;->b:Lm3/s;

    .line 2
    .line 3
    invoke-interface {v0}, Lm3/s;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "The collectionSupplier returned a null Collection."

    .line 8
    .line 9
    invoke-static {v0, v1}, Lio/reactivex/rxjava3/internal/util/k;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u4;->a:Lio/reactivex/rxjava3/core/o;

    .line 16
    .line 17
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/flowable/u4$a;

    .line 18
    .line 19
    invoke-direct {v2, p1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/u4$a;-><init>(Lio/reactivex/rxjava3/core/u0;Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/u0;)V

    .line 31
    .line 32
    .line 33
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public d()Lio/reactivex/rxjava3/core/o;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/o<",
            "TU;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/t4;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u4;->a:Lio/reactivex/rxjava3/core/o;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u4;->b:Lm3/s;

    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/t4;-><init>(Lio/reactivex/rxjava3/core/o;Lm3/s;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    move-result-object v0

    return-object v0
.end method
