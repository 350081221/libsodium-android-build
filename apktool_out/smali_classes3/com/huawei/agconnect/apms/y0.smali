.class public Lcom/huawei/agconnect/apms/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/y0$bcd;
    }
.end annotation


# instance fields
.field public abc:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;

    .line 5
    .line 6
    const-string v1, "UIBackgroundListener"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/huawei/agconnect/apms/y0;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public onTrimMemory(I)V
    .locals 2

    const/16 v0, 0x14

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/huawei/agconnect/apms/y0;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/huawei/agconnect/apms/y0$bcd;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/y0$bcd;-><init>(Lcom/huawei/agconnect/apms/y0$abc;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method
