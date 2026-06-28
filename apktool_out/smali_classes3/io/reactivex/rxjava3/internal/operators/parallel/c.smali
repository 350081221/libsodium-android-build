.class public final Lio/reactivex/rxjava3/internal/operators/parallel/c;
.super Lio/reactivex/rxjava3/parallel/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/parallel/c$b;,
        Lio/reactivex/rxjava3/internal/operators/parallel/c$c;
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
.field final a:Lio/reactivex/rxjava3/parallel/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final c:Lm3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/c<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;",
            "Lm3/g<",
            "-TT;>;",
            "Lm3/c<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/rxjava3/parallel/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/parallel/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->a:Lio/reactivex/rxjava3/parallel/b;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->b:Lm3/g;

    .line 7
    .line 8
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->c:Lm3/c;

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

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->a:Lio/reactivex/rxjava3/parallel/b;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/parallel/b;->M()I

    move-result v0

    return v0
.end method

.method public X([Lorg/reactivestreams/p;)V
    .locals 7
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
    array-length v0, p1

    .line 9
    new-array v1, v0, [Lorg/reactivestreams/p;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    aget-object v3, p1, v2

    .line 15
    .line 16
    instance-of v4, v3, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    new-instance v4, Lio/reactivex/rxjava3/internal/operators/parallel/c$b;

    .line 21
    .line 22
    check-cast v3, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 23
    .line 24
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->b:Lm3/g;

    .line 25
    .line 26
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->c:Lm3/c;

    .line 27
    .line 28
    invoke-direct {v4, v3, v5, v6}, Lio/reactivex/rxjava3/internal/operators/parallel/c$b;-><init>(Lio/reactivex/rxjava3/internal/fuseable/c;Lm3/g;Lm3/c;)V

    .line 29
    .line 30
    .line 31
    aput-object v4, v1, v2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance v4, Lio/reactivex/rxjava3/internal/operators/parallel/c$c;

    .line 35
    .line 36
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->b:Lm3/g;

    .line 37
    .line 38
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->c:Lm3/c;

    .line 39
    .line 40
    invoke-direct {v4, v3, v5, v6}, Lio/reactivex/rxjava3/internal/operators/parallel/c$c;-><init>(Lorg/reactivestreams/p;Lm3/g;Lm3/c;)V

    .line 41
    .line 42
    .line 43
    aput-object v4, v1, v2

    .line 44
    .line 45
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/c;->a:Lio/reactivex/rxjava3/parallel/b;

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Lio/reactivex/rxjava3/parallel/b;->X([Lorg/reactivestreams/p;)V

    .line 51
    .line 52
    .line 53
    return-void
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
