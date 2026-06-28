.class public Lcom/huawei/hms/analytics/framework/SyncManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/framework/SyncManager$TaskNames;
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/huawei/hms/analytics/framework/SyncManager;


# instance fields
.field private final countDownLatchMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/CountDownLatch;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/framework/SyncManager;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/framework/SyncManager;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/framework/SyncManager;->INSTANCE:Lcom/huawei/hms/analytics/framework/SyncManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/SyncManager;->countDownLatchMap:Ljava/util/Map;

    return-void
.end method

.method private getCountDownLatch(Ljava/lang/String;)Ljava/util/concurrent/CountDownLatch;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/SyncManager;->countDownLatchMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    return-object p1
.end method

.method public static getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/SyncManager;->INSTANCE:Lcom/huawei/hms/analytics/framework/SyncManager;

    return-object v0
.end method

.method private removeDownLatch(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/SyncManager;->countDownLatchMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private setCountDownLatch(Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/SyncManager;->countDownLatchMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public await(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/framework/SyncManager;->getCountDownLatch(Ljava/lang/String;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->await()V

    :cond_0
    return-void
.end method

.method public await(Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/framework/SyncManager;->getCountDownLatch(Ljava/lang/String;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    :cond_0
    return-void
.end method

.method public countDown(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/framework/SyncManager;->getCountDownLatch(Ljava/lang/String;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/framework/SyncManager;->removeDownLatch(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public start(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/SyncManager;->countDownLatchMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-direct {p0, p1, v0}, Lcom/huawei/hms/analytics/framework/SyncManager;->setCountDownLatch(Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V

    :cond_0
    return-void
.end method
