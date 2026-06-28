.class public abstract Lorg/jdeferred/android/i;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Progress:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/os/AsyncTask<",
        "TParams;TProgress;TResult;>;"
    }
.end annotation


# instance fields
.field protected final a:Lorg/slf4j/a;

.field private final b:Lorg/jdeferred/impl/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdeferred/impl/d<",
            "TResult;",
            "Ljava/lang/Throwable;",
            "TProgress;>;"
        }
    .end annotation
.end field

.field private final c:Lorg/jdeferred/e$a;

.field private d:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    const-class v0, Lorg/jdeferred/android/i;

    invoke-static {v0}, Lorg/slf4j/b;->f(Ljava/lang/Class;)Lorg/slf4j/a;

    move-result-object v0

    iput-object v0, p0, Lorg/jdeferred/android/i;->a:Lorg/slf4j/a;

    .line 3
    new-instance v0, Lorg/jdeferred/impl/d;

    invoke-direct {v0}, Lorg/jdeferred/impl/d;-><init>()V

    iput-object v0, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    .line 4
    sget-object v0, Lorg/jdeferred/e$a;->DEFAULT:Lorg/jdeferred/e$a;

    iput-object v0, p0, Lorg/jdeferred/android/i;->c:Lorg/jdeferred/e$a;

    return-void
.end method

.method public constructor <init>(Lorg/jdeferred/e$a;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 6
    const-class v0, Lorg/jdeferred/android/i;

    invoke-static {v0}, Lorg/slf4j/b;->f(Ljava/lang/Class;)Lorg/slf4j/a;

    move-result-object v0

    iput-object v0, p0, Lorg/jdeferred/android/i;->a:Lorg/slf4j/a;

    .line 7
    new-instance v0, Lorg/jdeferred/impl/d;

    invoke-direct {v0}, Lorg/jdeferred/impl/d;-><init>()V

    iput-object v0, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    .line 8
    iput-object p1, p0, Lorg/jdeferred/android/i;->c:Lorg/jdeferred/e$a;

    return-void
.end method


# virtual methods
.method protected varargs abstract a([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public b()Lorg/jdeferred/e$a;
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/android/i;->c:Lorg/jdeferred/e$a;

    return-object v0
.end method

.method protected final c(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TProgress;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-object p1, v0, v1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    .line 8
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
.end method

.method public d()Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdeferred/p<",
            "TResult;",
            "Ljava/lang/Throwable;",
            "TProgress;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    invoke-virtual {v0}, Lorg/jdeferred/impl/d;->c()Lorg/jdeferred/p;

    move-result-object v0

    return-object v0
.end method

.method protected final varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)TResult;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/jdeferred/android/i;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    return-object p1

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    iput-object p1, p0, Lorg/jdeferred/android/i;->d:Ljava/lang/Throwable;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1
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
.end method

.method protected final onCancelled()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    invoke-direct {v1}, Ljava/util/concurrent/CancellationException;-><init>()V

    invoke-virtual {v0, v1}, Lorg/jdeferred/impl/d;->h(Ljava/lang/Object;)Lorg/jdeferred/b;

    return-void
.end method

.method protected final onCancelled(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    invoke-virtual {p1, v0}, Lorg/jdeferred/impl/d;->h(Ljava/lang/Object;)Lorg/jdeferred/b;

    return-void
.end method

.method protected final onPostExecute(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/jdeferred/android/i;->d:Ljava/lang/Throwable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lorg/jdeferred/impl/d;->h(Ljava/lang/Object;)Lorg/jdeferred/b;

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lorg/jdeferred/impl/d;->g(Ljava/lang/Object;)Lorg/jdeferred/b;

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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

.method protected final varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    if-lez v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Lorg/jdeferred/android/i;->a:Lorg/slf4j/a;

    .line 11
    .line 12
    const-string v1, "There were multiple progress values.  Only the first one was used!"

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lorg/slf4j/a;->warn(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    aget-object p1, p1, v1

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lorg/jdeferred/impl/d;->q(Ljava/lang/Object;)Lorg/jdeferred/b;

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    iget-object p1, p0, Lorg/jdeferred/android/i;->b:Lorg/jdeferred/impl/d;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p1, v0}, Lorg/jdeferred/impl/d;->q(Ljava/lang/Object;)Lorg/jdeferred/b;

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_1
    return-void
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
