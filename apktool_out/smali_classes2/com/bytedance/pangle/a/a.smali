.class public final Lcom/bytedance/pangle/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/pangle/a/a$a;
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/CountDownLatch;

.field b:Ljava/lang/Throwable;


# direct methods
.method private constructor <init>([Lcom/bytedance/pangle/a/a$a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/pangle/a/a;->a:Ljava/util/concurrent/CountDownLatch;

    .line 11
    .line 12
    array-length v0, p1

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_0

    .line 15
    .line 16
    aget-object v2, p1, v1

    .line 17
    .line 18
    new-instance v3, Lcom/bytedance/pangle/a/a$1;

    .line 19
    .line 20
    invoke-direct {v3, p0, v2}, Lcom/bytedance/pangle/a/a$1;-><init>(Lcom/bytedance/pangle/a/a;Lcom/bytedance/pangle/a/a$a;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Lcom/bytedance/pangle/d/e;->a(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
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
.end method

.method public static varargs a([Lcom/bytedance/pangle/a/a$a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/pangle/a/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/pangle/a/a;-><init>([Lcom/bytedance/pangle/a/a$a;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p0, v0, Lcom/bytedance/pangle/a/a;->a:Ljava/util/concurrent/CountDownLatch;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    iget-object p0, v0, Lcom/bytedance/pangle/a/a;->b:Ljava/lang/Throwable;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    throw p0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    new-instance v0, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw v0
    .line 24
.end method
