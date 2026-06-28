.class public final Lcom/huawei/hms/analytics/cx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/cx$lmn;
    }
.end annotation


# static fields
.field private static final ijk:Lcom/huawei/hms/analytics/cx;

.field private static final ikl:Lcom/huawei/hms/analytics/cx;

.field private static final klm:Lcom/huawei/hms/analytics/cx;

.field private static final lmn:Lcom/huawei/hms/analytics/cx;


# instance fields
.field private final hij:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/hms/analytics/cx;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/cx;-><init>(I)V

    sput-object v0, Lcom/huawei/hms/analytics/cx;->lmn:Lcom/huawei/hms/analytics/cx;

    new-instance v0, Lcom/huawei/hms/analytics/cx;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Lcom/huawei/hms/analytics/cx;-><init>(I)V

    sput-object v0, Lcom/huawei/hms/analytics/cx;->klm:Lcom/huawei/hms/analytics/cx;

    new-instance v0, Lcom/huawei/hms/analytics/cx;

    invoke-direct {v0, v2}, Lcom/huawei/hms/analytics/cx;-><init>(I)V

    sput-object v0, Lcom/huawei/hms/analytics/cx;->ikl:Lcom/huawei/hms/analytics/cx;

    new-instance v0, Lcom/huawei/hms/analytics/cx;

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/cx;-><init>(I)V

    sput-object v0, Lcom/huawei/hms/analytics/cx;->ijk:Lcom/huawei/hms/analytics/cx;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0x1388

    invoke-direct {v6, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x0

    const-wide/32 v3, 0xea60

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v0, v7

    move v2, p1

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v7, p0, Lcom/huawei/hms/analytics/cx;->hij:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static ijk()Lcom/huawei/hms/analytics/cx;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/cx;->ijk:Lcom/huawei/hms/analytics/cx;

    return-object v0
.end method

.method public static ikl()Lcom/huawei/hms/analytics/cx;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/cx;->ikl:Lcom/huawei/hms/analytics/cx;

    return-object v0
.end method

.method public static klm()Lcom/huawei/hms/analytics/cx;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/cx;->klm:Lcom/huawei/hms/analytics/cx;

    return-object v0
.end method

.method public static lmn()Lcom/huawei/hms/analytics/cx;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/cx;->lmn:Lcom/huawei/hms/analytics/cx;

    return-object v0
.end method


# virtual methods
.method public final lmn(Ljava/lang/Runnable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/cx;->hij:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/analytics/cx$lmn;

    invoke-direct {v1, p1}, Lcom/huawei/hms/analytics/cx$lmn;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "ThreadStock"

    const-string v0, "addToQueue() Exception has happened!Form rejected execution"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
