.class final Lio/reactivex/rxjava3/internal/operators/observable/g3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/g3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/internal/operators/observable/g3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/observable/g3$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Lio/reactivex/rxjava3/internal/queue/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/queue/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:I

.field volatile d:Z

.field e:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/observable/g3$a;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/observable/g3$a<",
            "TT;>;II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->a:Lio/reactivex/rxjava3/internal/operators/observable/g3$a;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->c:I

    .line 7
    .line 8
    new-instance p1, Lio/reactivex/rxjava3/internal/queue/c;

    .line 9
    .line 10
    invoke-direct {p1, p3}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->b:Lio/reactivex/rxjava3/internal/queue/c;

    .line 14
    .line 15
    return-void
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
.method public onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->a:Lio/reactivex/rxjava3/internal/operators/observable/g3$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/g3$a;->drain()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->e:Ljava/lang/Throwable;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->d:Z

    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->a:Lio/reactivex/rxjava3/internal/operators/observable/g3$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/observable/g3$a;->drain()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->b:Lio/reactivex/rxjava3/internal/queue/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/queue/c;->offer(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->a:Lio/reactivex/rxjava3/internal/operators/observable/g3$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/observable/g3$a;->drain()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->a:Lio/reactivex/rxjava3/internal/operators/observable/g3$a;

    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/g3$b;->c:I

    invoke-virtual {v0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/observable/g3$a;->setDisposable(Lio/reactivex/rxjava3/disposables/e;I)Z

    return-void
.end method
