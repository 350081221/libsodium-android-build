.class public Lio/reactivex/rxjava3/internal/schedulers/q;
.super Lio/reactivex/rxjava3/core/q0;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/schedulers/q$g;,
        Lio/reactivex/rxjava3/internal/schedulers/q$e;,
        Lio/reactivex/rxjava3/internal/schedulers/q$a;,
        Lio/reactivex/rxjava3/internal/schedulers/q$d;,
        Lio/reactivex/rxjava3/internal/schedulers/q$b;,
        Lio/reactivex/rxjava3/internal/schedulers/q$c;,
        Lio/reactivex/rxjava3/internal/schedulers/q$f;
    }
.end annotation


# static fields
.field static final e:Lio/reactivex/rxjava3/disposables/e;

.field static final f:Lio/reactivex/rxjava3/disposables/e;


# instance fields
.field private final b:Lio/reactivex/rxjava3/core/q0;

.field private final c:Lio/reactivex/rxjava3/processors/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/processors/c<",
            "Lio/reactivex/rxjava3/core/o<",
            "Lio/reactivex/rxjava3/core/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/q$g;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/schedulers/q$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/reactivex/rxjava3/internal/schedulers/q;->e:Lio/reactivex/rxjava3/disposables/e;

    .line 7
    .line 8
    invoke-static {}, Lio/reactivex/rxjava3/disposables/e;->h()Lio/reactivex/rxjava3/disposables/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lio/reactivex/rxjava3/internal/schedulers/q;->f:Lio/reactivex/rxjava3/disposables/e;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>(Lm3/o;Lio/reactivex/rxjava3/core/q0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/o<",
            "Lio/reactivex/rxjava3/core/o<",
            "Lio/reactivex/rxjava3/core/o<",
            "Lio/reactivex/rxjava3/core/c;",
            ">;>;",
            "Lio/reactivex/rxjava3/core/c;",
            ">;",
            "Lio/reactivex/rxjava3/core/q0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/schedulers/q;->b:Lio/reactivex/rxjava3/core/q0;

    .line 5
    .line 6
    invoke-static {}, Lio/reactivex/rxjava3/processors/h;->t9()Lio/reactivex/rxjava3/processors/h;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2}, Lio/reactivex/rxjava3/processors/c;->r9()Lio/reactivex/rxjava3/processors/c;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/schedulers/q;->c:Lio/reactivex/rxjava3/processors/c;

    .line 15
    .line 16
    :try_start_0
    invoke-interface {p1, p2}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lio/reactivex/rxjava3/core/c;

    .line 21
    .line 22
    invoke-virtual {p1}, Lio/reactivex/rxjava3/core/c;->V0()Lio/reactivex/rxjava3/disposables/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/q;->d:Lio/reactivex/rxjava3/disposables/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1
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
.method public c()Lio/reactivex/rxjava3/core/q0$c;
    .locals 4
    .annotation build Ll3/f;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/q;->b:Lio/reactivex/rxjava3/core/q0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/core/q0;->c()Lio/reactivex/rxjava3/core/q0$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lio/reactivex/rxjava3/processors/h;->t9()Lio/reactivex/rxjava3/processors/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lio/reactivex/rxjava3/processors/c;->r9()Lio/reactivex/rxjava3/processors/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lio/reactivex/rxjava3/internal/schedulers/q$a;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lio/reactivex/rxjava3/internal/schedulers/q$a;-><init>(Lio/reactivex/rxjava3/core/q0$c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lio/reactivex/rxjava3/core/o;->g4(Lm3/o;)Lio/reactivex/rxjava3/core/o;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, Lio/reactivex/rxjava3/internal/schedulers/q$e;

    .line 25
    .line 26
    invoke-direct {v3, v1, v0}, Lio/reactivex/rxjava3/internal/schedulers/q$e;-><init>(Lio/reactivex/rxjava3/processors/c;Lio/reactivex/rxjava3/core/q0$c;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/q;->c:Lio/reactivex/rxjava3/processors/c;

    .line 30
    .line 31
    invoke-interface {v0, v2}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object v3
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/q;->d:Lio/reactivex/rxjava3/disposables/e;

    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/schedulers/q;->d:Lio/reactivex/rxjava3/disposables/e;

    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->isDisposed()Z

    move-result v0

    return v0
.end method
