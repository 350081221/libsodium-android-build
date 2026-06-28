.class public final Lcom/huawei/hms/analytics/dn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static ikl:Z

.field private static final klm:Ljava/util/concurrent/CountDownLatch;

.field private static final lmn:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/dn;->lmn:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sput-object v0, Lcom/huawei/hms/analytics/dn;->klm:Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hms/analytics/dn;->ikl:Z

    return-void
.end method

.method public static ikl()V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/dn;->lmn:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    sput-boolean v1, Lcom/huawei/hms/analytics/dn;->ikl:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static klm()Z
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/dn;->lmn:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/huawei/hms/analytics/dn;->ikl:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static lmn()Ljava/util/concurrent/CountDownLatch;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/dn;->klm:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method
