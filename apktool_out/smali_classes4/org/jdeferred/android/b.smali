.class public Lorg/jdeferred/android/b;
.super Lorg/jdeferred/impl/c;
.source "SourceFile"


# static fields
.field private static e:[Ljava/lang/Void;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Void;

    .line 3
    .line 4
    sput-object v0, Lorg/jdeferred/android/b;->e:[Ljava/lang/Void;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/jdeferred/impl/c;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/jdeferred/impl/c;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method


# virtual methods
.method public varargs A(Lorg/jdeferred/android/e;[Lorg/jdeferred/p;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/android/e;",
            "[",
            "Lorg/jdeferred/p;",
            ")",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/android/c;

    invoke-super {p0, p2}, Lorg/jdeferred/impl/a;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Lorg/jdeferred/android/c;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/android/e;)V

    invoke-virtual {v0}, Lorg/jdeferred/impl/d;->c()Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public varargs B(Lorg/jdeferred/android/e;[Lorg/jdeferred/android/i;)Lorg/jdeferred/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/android/e;",
            "[",
            "Lorg/jdeferred/android/i<",
            "Ljava/lang/Void;",
            "**>;)",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p2

    .line 5
    new-array v0, v0, [Lorg/jdeferred/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p2

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, p2, v1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lorg/jdeferred/android/b;->C(Lorg/jdeferred/android/i;)Lorg/jdeferred/p;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, p1, v0}, Lorg/jdeferred/android/b;->A(Lorg/jdeferred/android/e;[Lorg/jdeferred/p;)Lorg/jdeferred/p;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public C(Lorg/jdeferred/android/i;)Lorg/jdeferred/p;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Progress:",
            "Ljava/lang/Object;",
            "Result:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/android/i<",
            "Ljava/lang/Void;",
            "TProgress;TResult;>;)",
            "Lorg/jdeferred/p<",
            "TResult;",
            "Ljava/lang/Throwable;",
            "TProgress;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lorg/jdeferred/android/i;->b()Lorg/jdeferred/e$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/jdeferred/e$a;->AUTO:Lorg/jdeferred/e$a;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lorg/jdeferred/android/i;->b()Lorg/jdeferred/e$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lorg/jdeferred/e$a;->DEFAULT:Lorg/jdeferred/e$a;

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/jdeferred/impl/c;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lorg/jdeferred/impl/c;->t()Ljava/util/concurrent/ExecutorService;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Lorg/jdeferred/android/b;->e:[Ljava/lang/Void;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p1}, Lorg/jdeferred/android/i;->d()Lorg/jdeferred/p;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
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
.end method

.method public varargs D([Lorg/jdeferred/android/i;)Lorg/jdeferred/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/jdeferred/android/i<",
            "Ljava/lang/Void;",
            "**>;)",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/jdeferred/impl/a;->o([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    new-array v0, v0, [Lorg/jdeferred/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p1

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lorg/jdeferred/android/b;->C(Lorg/jdeferred/android/i;)Lorg/jdeferred/p;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lorg/jdeferred/android/b;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public b(Lorg/jdeferred/p;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "F:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lorg/jdeferred/android/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, Lorg/jdeferred/android/c;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lorg/jdeferred/android/c;-><init>(Lorg/jdeferred/p;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/jdeferred/impl/d;->c()Lorg/jdeferred/p;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public varargs c([Lorg/jdeferred/p;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/jdeferred/p;",
            ")",
            "Lorg/jdeferred/p<",
            "Lorg/jdeferred/multiple/c;",
            "Lorg/jdeferred/multiple/e;",
            "Lorg/jdeferred/multiple/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/android/c;

    invoke-super {p0, p1}, Lorg/jdeferred/impl/a;->c([Lorg/jdeferred/p;)Lorg/jdeferred/p;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/jdeferred/android/c;-><init>(Lorg/jdeferred/p;)V

    invoke-virtual {v0}, Lorg/jdeferred/impl/d;->c()Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public j(Lorg/jdeferred/d;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/d<",
            "TD;TP;>;)",
            "Lorg/jdeferred/p<",
            "TD;",
            "Ljava/lang/Throwable;",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lorg/jdeferred/android/c;

    invoke-super {p0, p1}, Lorg/jdeferred/impl/a;->j(Lorg/jdeferred/d;)Lorg/jdeferred/p;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/jdeferred/android/c;-><init>(Lorg/jdeferred/p;)V

    invoke-virtual {v0}, Lorg/jdeferred/impl/d;->c()Lorg/jdeferred/p;

    move-result-object p1

    return-object p1
.end method

.method public z(Lorg/jdeferred/p;Lorg/jdeferred/android/e;)Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "F:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;",
            "Lorg/jdeferred/android/e;",
            ")",
            "Lorg/jdeferred/p<",
            "TD;TF;TP;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lorg/jdeferred/android/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, Lorg/jdeferred/android/c;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lorg/jdeferred/android/c;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/android/e;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/jdeferred/impl/d;->c()Lorg/jdeferred/p;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method
