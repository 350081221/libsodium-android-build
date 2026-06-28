.class final Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;
.super Lio/reactivex/rxjava3/internal/subscribers/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "K:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/subscribers/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final f:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;TK;>;"
        }
    .end annotation
.end field

.field final g:Lm3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/d<",
            "-TK;-TK;>;"
        }
    .end annotation
.end field

.field h:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field i:Z


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/fuseable/c;Lm3/o;Lm3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/fuseable/c<",
            "-TT;>;",
            "Lm3/o<",
            "-TT;TK;>;",
            "Lm3/d<",
            "-TK;-TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/subscribers/a;-><init>(Lio/reactivex/rxjava3/internal/fuseable/c;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->f:Lm3/o;

    .line 5
    .line 6
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->g:Lm3/d;

    .line 7
    .line 8
    return-void
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
.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->tryOnNext(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/subscribers/a;->b:Lorg/reactivestreams/q;

    .line 8
    .line 9
    const-wide/16 v0, 0x1

    .line 10
    .line 11
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public poll()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Ll3/g;
    .end annotation

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscribers/a;->c:Lio/reactivex/rxjava3/internal/fuseable/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_1
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->f:Lm3/o;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->i:Z

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    iput-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->i:Z

    .line 23
    .line 24
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->h:Ljava/lang/Object;

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->g:Lm3/d;

    .line 28
    .line 29
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-interface {v2, v4, v1}, Lm3/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->h:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_3
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->h:Ljava/lang/Object;

    .line 41
    .line 42
    iget v0, p0, Lio/reactivex/rxjava3/internal/subscribers/a;->e:I

    .line 43
    .line 44
    if-eq v0, v3, :cond_0

    .line 45
    .line 46
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscribers/a;->b:Lorg/reactivestreams/q;

    .line 47
    .line 48
    const-wide/16 v1, 0x1

    .line 49
    .line 50
    invoke-interface {v0, v1, v2}, Lorg/reactivestreams/q;->request(J)V

    .line 51
    .line 52
    .line 53
    goto :goto_0
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

.method public requestFusion(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/subscribers/a;->d(I)I

    move-result p1

    return p1
.end method

.method public tryOnNext(Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/subscribers/a;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Lio/reactivex/rxjava3/internal/subscribers/a;->e:I

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscribers/a;->a:Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/c;->tryOnNext(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    :try_start_0
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->f:Lm3/o;

    .line 20
    .line 21
    invoke-interface {v2, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->i:Z

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->g:Lm3/d;

    .line 30
    .line 31
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->h:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-interface {v3, v4, v2}, Lm3/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iput-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->h:Ljava/lang/Object;

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    return v1

    .line 42
    :cond_2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->i:Z

    .line 43
    .line 44
    iput-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/n0$a;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    :cond_3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/subscribers/a;->a:Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 47
    .line 48
    invoke-interface {v1, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return v0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/subscribers/a;->c(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    return v0
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
