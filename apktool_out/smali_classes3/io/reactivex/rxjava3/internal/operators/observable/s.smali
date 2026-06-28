.class public final Lio/reactivex/rxjava3/internal/operators/observable/s;
.super Lio/reactivex/rxjava3/core/r0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/r0<",
        "TU;>;",
        "Lio/reactivex/rxjava3/internal/fuseable/f<",
        "TU;>;"
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

.field final b:Lm3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/s<",
            "+TU;>;"
        }
    .end annotation
.end field

.field final c:Lm3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/b<",
            "-TU;-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/n0;Lm3/s;Lm3/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/n0<",
            "TT;>;",
            "Lm3/s<",
            "+TU;>;",
            "Lm3/b<",
            "-TU;-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/r0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->a:Lio/reactivex/rxjava3/core/n0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->b:Lm3/s;

    .line 7
    .line 8
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->c:Lm3/b;

    .line 9
    .line 10
    return-void
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method protected M1(Lio/reactivex/rxjava3/core/u0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-TU;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->b:Lm3/s;

    .line 2
    .line 3
    invoke-interface {v0}, Lm3/s;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "The initialSupplier returned a null value"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->a:Lio/reactivex/rxjava3/core/n0;

    .line 13
    .line 14
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/observable/s$a;

    .line 15
    .line 16
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->c:Lm3/b;

    .line 17
    .line 18
    invoke-direct {v2, p1, v0, v3}, Lio/reactivex/rxjava3/internal/operators/observable/s$a;-><init>(Lio/reactivex/rxjava3/core/u0;Ljava/lang/Object;Lm3/b;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, v2}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/u0;)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public b()Lio/reactivex/rxjava3/core/i0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/i0<",
            "TU;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/observable/r;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->a:Lio/reactivex/rxjava3/core/n0;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->b:Lm3/s;

    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/s;->c:Lm3/b;

    invoke-direct {v0, v1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/observable/r;-><init>(Lio/reactivex/rxjava3/core/n0;Lm3/s;Lm3/b;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->R(Lio/reactivex/rxjava3/core/i0;)Lio/reactivex/rxjava3/core/i0;

    move-result-object v0

    return-object v0
.end method
