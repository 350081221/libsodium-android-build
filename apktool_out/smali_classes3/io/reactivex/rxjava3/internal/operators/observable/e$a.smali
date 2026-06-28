.class final Lio/reactivex/rxjava3/internal/operators/observable/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lio/reactivex/rxjava3/internal/operators/observable/e$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/observable/e$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lio/reactivex/rxjava3/core/n0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/n0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/Throwable;

.field private g:Z


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/n0;Lio/reactivex/rxjava3/internal/operators/observable/e$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/n0<",
            "TT;>;",
            "Lio/reactivex/rxjava3/internal/operators/observable/e$b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->d:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->e:Z

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->b:Lio/reactivex/rxjava3/core/n0;

    .line 10
    .line 11
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/e$b;

    .line 12
    .line 13
    return-void
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

.method private a()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->g:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/e$b;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/e$b;->c()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/observable/c2;

    .line 14
    .line 15
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->b:Lio/reactivex/rxjava3/core/n0;

    .line 16
    .line 17
    invoke-direct {v0, v2}, Lio/reactivex/rxjava3/internal/operators/observable/c2;-><init>(Lio/reactivex/rxjava3/core/n0;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/e$b;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lio/reactivex/rxjava3/core/i0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/e$b;

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/e$b;->d()Lio/reactivex/rxjava3/core/f0;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    invoke-virtual {v0}, Lio/reactivex/rxjava3/core/f0;->h()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iput-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->e:Z

    .line 39
    .line 40
    invoke-virtual {v0}, Lio/reactivex/rxjava3/core/f0;->e()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->c:Ljava/lang/Object;

    .line 45
    .line 46
    return v1

    .line 47
    :cond_1
    iput-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->d:Z

    .line 48
    .line 49
    invoke-virtual {v0}, Lio/reactivex/rxjava3/core/f0;->f()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    return v3

    .line 56
    :cond_2
    invoke-virtual {v0}, Lio/reactivex/rxjava3/core/f0;->d()Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->f:Ljava/lang/Throwable;

    .line 61
    .line 62
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    throw v0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/e$b;

    .line 69
    .line 70
    invoke-virtual {v1}, Lio/reactivex/rxjava3/observers/e;->dispose()V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->f:Ljava/lang/Throwable;

    .line 74
    .line 75
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    throw v0
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


# virtual methods
.method public hasNext()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->f:Ljava/lang/Throwable;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->d:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->e:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 v1, 0x1

    .line 22
    :cond_2
    return v1

    .line 23
    :cond_3
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    throw v0
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

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->f:Ljava/lang/Throwable;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->e:Z

    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/e$a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 18
    .line 19
    const-string v1, "No more elements"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    throw v0
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

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Read only iterator"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
