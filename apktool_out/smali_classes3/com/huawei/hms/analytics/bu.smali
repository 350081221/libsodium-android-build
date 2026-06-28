.class public final Lcom/huawei/hms/analytics/bu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;


# instance fields
.field protected lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/bu;->lmn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;J)Z
    .locals 5

    sget-object v0, Lcom/huawei/hms/analytics/bu$1;->lmn:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    return v2

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-wide v3, p1, Lcom/huawei/hms/analytics/at;->c:J

    cmp-long p1, p2, v3

    if-ltz p1, :cond_1

    return v1

    :cond_1
    return v2

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, p2

    const-wide/32 p1, 0x240c8400

    cmp-long p1, v3, p1

    if-lez p1, :cond_3

    return v1

    :cond_3
    return v2
.end method

.method public final decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;Ljava/lang/String;)Z
    .locals 4

    sget-object v0, Lcom/huawei/hms/analytics/bu$1;->lmn:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_4

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    const/4 v2, 0x3

    if-eq p1, v2, :cond_0

    return v1

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/cy;->klm()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2}, Lcom/huawei/hms/analytics/bu;->lmn(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    return v0

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p1, p1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/hms/analytics/dg;->cde(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "ReportPolicy"

    const-string p2, "The network is unavailable."

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_3
    return v1

    :cond_4
    new-instance p1, Ljava/io/File;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-virtual {v2, p2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide p1

    const-wide/32 v2, 0xa00000

    cmp-long p1, p1, v2

    if-lez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final lmn(Ljava/lang/String;)Z
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/dn;->klm()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/dn;->lmn()Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "ReportPolicy"

    const-string v1, "Interrupted Exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    new-instance v0, Lcom/huawei/hms/analytics/do;

    new-instance v1, Lcom/huawei/hms/analytics/bz;

    iget-object v2, p0, Lcom/huawei/hms/analytics/bu;->lmn:Ljava/lang/String;

    invoke-direct {v1, v2, p1}, Lcom/huawei/hms/analytics/bz;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/do;-><init>(Lcom/huawei/hms/analytics/cb;)V

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/dn;->ikl()V

    new-instance v0, Lcom/huawei/hms/analytics/do;

    invoke-static {}, Lcom/huawei/hms/analytics/dn;->lmn()Ljava/util/concurrent/CountDownLatch;

    move-result-object v1

    new-instance v2, Lcom/huawei/hms/analytics/bz;

    iget-object v3, p0, Lcom/huawei/hms/analytics/bu;->lmn:Ljava/lang/String;

    invoke-direct {v2, v3, p1}, Lcom/huawei/hms/analytics/bz;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/analytics/do;-><init>(Ljava/util/concurrent/CountDownLatch;Lcom/huawei/hms/analytics/cb;)V

    :goto_1
    invoke-virtual {v0}, Lcom/huawei/hms/analytics/do;->lmn()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
