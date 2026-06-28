.class Lorg/jdeferred/impl/a$a;
.super Lorg/jdeferred/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jdeferred/impl/a;->e(Ljava/util/concurrent/Future;)Lorg/jdeferred/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jdeferred/c<",
        "TD;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c:Ljava/util/concurrent/Future;

.field final synthetic d:Lorg/jdeferred/impl/a;


# direct methods
.method constructor <init>(Lorg/jdeferred/impl/a;Lorg/jdeferred/e$a;Ljava/util/concurrent/Future;)V
    .locals 0

    iput-object p1, p0, Lorg/jdeferred/impl/a$a;->d:Lorg/jdeferred/impl/a;

    iput-object p3, p0, Lorg/jdeferred/impl/a$a;->c:Ljava/util/concurrent/Future;

    invoke-direct {p0, p2}, Lorg/jdeferred/c;-><init>(Lorg/jdeferred/e$a;)V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/jdeferred/impl/a$a;->c:Ljava/util/concurrent/Future;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v1, v1, Ljava/lang/Exception;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Exception;

    .line 22
    .line 23
    throw v0

    .line 24
    :cond_0
    throw v0

    .line 25
    :catch_1
    move-exception v0

    .line 26
    throw v0
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
