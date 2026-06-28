.class public final Lio/reactivex/rxjava3/internal/operators/parallel/i;
.super Lio/reactivex/rxjava3/parallel/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/parallel/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/parallel/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/o<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final b:I

.field final c:I


# direct methods
.method public constructor <init>(Lorg/reactivestreams/o;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/o<",
            "+TT;>;II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/parallel/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i;->a:Lorg/reactivestreams/o;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i;->b:I

    .line 7
    .line 8
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i;->c:I

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
.method public M()I
    .locals 1

    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i;->b:I

    return v0
.end method

.method public X([Lorg/reactivestreams/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/parallel/b;->b0([Lorg/reactivestreams/p;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i;->a:Lorg/reactivestreams/o;

    .line 9
    .line 10
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;

    .line 11
    .line 12
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/i;->c:I

    .line 13
    .line 14
    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/operators/parallel/i$a;-><init>([Lorg/reactivestreams/p;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
