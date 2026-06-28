.class final Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field final synthetic b:Lio/reactivex/rxjava3/internal/operators/observable/d$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/observable/d$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->b:Lio/reactivex/rxjava3/internal/operators/observable/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->b:Lio/reactivex/rxjava3/internal/operators/observable/d$a;

    .line 2
    .line 3
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/observable/d$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/q;->isComplete(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0
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

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->b:Lio/reactivex/rxjava3/internal/operators/observable/d$a;

    .line 7
    .line 8
    iget-object v1, v1, Lio/reactivex/rxjava3/internal/operators/observable/d$a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v1}, Lio/reactivex/rxjava3/internal/util/q;->isComplete(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {v1}, Lio/reactivex/rxjava3/internal/util/q;->isError(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {v1}, Lio/reactivex/rxjava3/internal/util/q;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_1
    :try_start_1
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1}, Lio/reactivex/rxjava3/internal/util/q;->getError(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    throw v1

    .line 48
    :cond_2
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/d$a$a;->a:Ljava/lang/Object;

    .line 56
    .line 57
    throw v1
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
