.class public final Lcom/huawei/hms/analytics/y;
.super Lcom/huawei/hms/analytics/ad;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V
    .locals 2

    new-instance v0, Lcom/huawei/hms/analytics/v;

    invoke-direct {v0, p1, p2}, Lcom/huawei/hms/analytics/v;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hms/analytics/ad;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;Lcom/huawei/hms/analytics/ad;)V

    new-instance p2, Lcom/huawei/hms/analytics/x;

    const-string v0, "com.uodis.opendevice.OPENIDS_SERVICE"

    const-string v1, "com.huawei.hwid"

    invoke-direct {p2, p1, v0, v1, p0}, Lcom/huawei/hms/analytics/x;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/w;)V

    iput-object p2, p0, Lcom/huawei/hms/analytics/ad;->ikl:Lcom/huawei/hms/analytics/x;

    return-void
.end method


# virtual methods
.method public final klm()Z
    .locals 1

    const-string v0, "com.huawei.hwid"

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/ad;->klm(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final lmn()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/ad;->ikl:Lcom/huawei/hms/analytics/x;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/x;->lmn()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "getOaid,bindService error, begin get gaid"

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/ad;->lmn(Ljava/lang/String;)V

    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/x$lmn;)V
    .locals 3

    :try_start_0
    new-instance v0, Lcom/huawei/hms/analytics/ae;

    const-string v1, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/x$lmn;->lmn()Landroid/os/IBinder;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/huawei/hms/analytics/ae;-><init>(Ljava/lang/String;Landroid/os/IBinder;)V

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/ae;->lmn()Z

    move-result p1

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/ae;->lmn([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "hwDeviceidHelper"

    const-string v0, "oaid is empty"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/ad;->lmn:Lcom/huawei/hms/analytics/i$lmn;

    if-nez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v1, "oaid"

    invoke-interface {v2, v0, p1, v1}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->ikl()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->ikl()V

    throw p1
.end method
