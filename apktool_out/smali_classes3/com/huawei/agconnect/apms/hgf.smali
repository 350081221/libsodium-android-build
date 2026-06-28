.class public Lcom/huawei/agconnect/apms/hgf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static abc:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;

    const-string v1, "ApmsHiLog"

    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/hgf;->abc:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static abc(Ljava/lang/Runnable;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static bcd(Ljava/lang/Runnable;)V
    .locals 1

    if-eqz p0, :cond_0

    sget-object v0, Lcom/huawei/agconnect/apms/hgf;->abc:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
