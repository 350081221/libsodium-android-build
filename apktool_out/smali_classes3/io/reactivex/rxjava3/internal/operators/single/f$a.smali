.class final Lio/reactivex/rxjava3/internal/operators/single/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/u0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/single/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/single/f$a$a;,
        Lio/reactivex/rxjava3/internal/operators/single/f$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/u0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lio/reactivex/rxjava3/internal/disposables/f;

.field final b:Lio/reactivex/rxjava3/core/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/u0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lio/reactivex/rxjava3/internal/operators/single/f;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/single/f;Lio/reactivex/rxjava3/internal/disposables/f;Lio/reactivex/rxjava3/core/u0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/disposables/f;",
            "Lio/reactivex/rxjava3/core/u0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->c:Lio/reactivex/rxjava3/internal/operators/single/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->a:Lio/reactivex/rxjava3/internal/disposables/f;

    .line 7
    .line 8
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->b:Lio/reactivex/rxjava3/core/u0;

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
.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->a:Lio/reactivex/rxjava3/internal/disposables/f;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->c:Lio/reactivex/rxjava3/internal/operators/single/f;

    iget-object v1, v1, Lio/reactivex/rxjava3/internal/operators/single/f;->d:Lio/reactivex/rxjava3/core/q0;

    new-instance v2, Lio/reactivex/rxjava3/internal/operators/single/f$a$a;

    invoke-direct {v2, p0, p1}, Lio/reactivex/rxjava3/internal/operators/single/f$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/single/f$a;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->c:Lio/reactivex/rxjava3/internal/operators/single/f;

    iget-boolean v3, p1, Lio/reactivex/rxjava3/internal/operators/single/f;->e:Z

    if-eqz v3, :cond_0

    iget-wide v3, p1, Lio/reactivex/rxjava3/internal/operators/single/f;->b:J

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    :goto_0
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/operators/single/f;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4, p1}, Lio/reactivex/rxjava3/core/q0;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->a:Lio/reactivex/rxjava3/internal/disposables/f;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->a:Lio/reactivex/rxjava3/internal/disposables/f;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->c:Lio/reactivex/rxjava3/internal/operators/single/f;

    iget-object v1, v1, Lio/reactivex/rxjava3/internal/operators/single/f;->d:Lio/reactivex/rxjava3/core/q0;

    new-instance v2, Lio/reactivex/rxjava3/internal/operators/single/f$a$b;

    invoke-direct {v2, p0, p1}, Lio/reactivex/rxjava3/internal/operators/single/f$a$b;-><init>(Lio/reactivex/rxjava3/internal/operators/single/f$a;Ljava/lang/Object;)V

    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->c:Lio/reactivex/rxjava3/internal/operators/single/f;

    iget-wide v3, p1, Lio/reactivex/rxjava3/internal/operators/single/f;->b:J

    iget-object p1, p1, Lio/reactivex/rxjava3/internal/operators/single/f;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4, p1}, Lio/reactivex/rxjava3/core/q0;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/disposables/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method
