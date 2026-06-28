.class public final Lcom/huawei/hms/analytics/framework/f/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/framework/f/a$a;
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/hms/analytics/framework/f/a;

.field private static b:Lcom/huawei/hms/analytics/framework/f/a;


# instance fields
.field private c:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/hms/analytics/framework/f/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/framework/f/a;-><init>(I)V

    sput-object v0, Lcom/huawei/hms/analytics/framework/f/a;->a:Lcom/huawei/hms/analytics/framework/f/a;

    new-instance v0, Lcom/huawei/hms/analytics/framework/f/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/framework/f/a;-><init>(I)V

    sput-object v0, Lcom/huawei/hms/analytics/framework/f/a;->b:Lcom/huawei/hms/analytics/framework/f/a;

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

    const-wide/16 v3, 0x2710

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v0, v7

    move v2, p1

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v7, p0, Lcom/huawei/hms/analytics/framework/f/a;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static a()Lcom/huawei/hms/analytics/framework/f/a;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/f/a;->a:Lcom/huawei/hms/analytics/framework/f/a;

    return-object v0
.end method

.method public static b()Lcom/huawei/hms/analytics/framework/f/a;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/f/a;->b:Lcom/huawei/hms/analytics/framework/f/a;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/f/a;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/analytics/framework/f/a$a;

    invoke-direct {v1, p1}, Lcom/huawei/hms/analytics/framework/f/a$a;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "MissionThread"

    const-string v0, "addToQueue() Exception has happened! From rejected execution"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
