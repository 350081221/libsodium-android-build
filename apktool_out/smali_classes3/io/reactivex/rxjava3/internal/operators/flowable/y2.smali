.class public final Lio/reactivex/rxjava3/internal/operators/flowable/y2;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/y2$b;,
        Lio/reactivex/rxjava3/internal/operators/flowable/y2$c;,
        Lio/reactivex/rxjava3/internal/operators/flowable/y2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/o<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final b:I

.field final c:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y2;->b:I

    .line 5
    .line 6
    add-int/2addr p1, p2

    .line 7
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y2;->c:I

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
.method public O6(Lorg/reactivestreams/p;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/y2$b;

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 9
    .line 10
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y2;->b:I

    .line 11
    .line 12
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y2;->c:I

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/y2$b;-><init>(Lio/reactivex/rxjava3/internal/fuseable/c;II)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/y2$c;

    .line 22
    .line 23
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y2;->b:I

    .line 24
    .line 25
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y2;->c:I

    .line 26
    .line 27
    invoke-direct {v0, p1, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/y2$c;-><init>(Lorg/reactivestreams/p;II)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 31
    .line 32
    .line 33
    :goto_0
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
