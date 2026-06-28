.class public final Lio/reactivex/rxjava3/internal/operators/flowable/z2;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/z2$b;,
        Lio/reactivex/rxjava3/internal/operators/flowable/z2$c;,
        Lio/reactivex/rxjava3/internal/operators/flowable/z2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/rxjava3/core/o<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final b:J

.field final c:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z2;->b:J

    .line 5
    .line 6
    add-long/2addr p1, p3

    .line 7
    iput-wide p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z2;->c:J

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
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-",
            "Ljava/lang/Long;",
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
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/z2$b;

    .line 6
    .line 7
    move-object v2, p1

    .line 8
    check-cast v2, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 9
    .line 10
    iget-wide v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z2;->b:J

    .line 11
    .line 12
    iget-wide v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z2;->c:J

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    invoke-direct/range {v1 .. v6}, Lio/reactivex/rxjava3/internal/operators/flowable/z2$b;-><init>(Lio/reactivex/rxjava3/internal/fuseable/c;JJ)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/z2$c;

    .line 23
    .line 24
    iget-wide v9, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z2;->b:J

    .line 25
    .line 26
    iget-wide v11, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z2;->c:J

    .line 27
    .line 28
    move-object v7, v0

    .line 29
    move-object v8, p1

    .line 30
    invoke-direct/range {v7 .. v12}, Lio/reactivex/rxjava3/internal/operators/flowable/z2$c;-><init>(Lorg/reactivestreams/p;JJ)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
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
