.class public final Lcom/huawei/hms/analytics/ah;
.super Lcom/huawei/hms/analytics/ad;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V
    .locals 2

    new-instance v0, Lcom/huawei/hms/analytics/v;

    invoke-direct {v0, p1, p2}, Lcom/huawei/hms/analytics/v;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hms/analytics/ad;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;Lcom/huawei/hms/analytics/ad;)V

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    const-string v0, "com.samsung.android.deviceidservice"

    const-string v1, "com.samsung.android.deviceidservice.DeviceIdService"

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance v0, Lcom/huawei/hms/analytics/x;

    invoke-direct {v0, p1, p2, p0}, Lcom/huawei/hms/analytics/x;-><init>(Landroid/content/Context;Landroid/content/Intent;Lcom/huawei/hms/analytics/w;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/ad;->ikl:Lcom/huawei/hms/analytics/x;

    return-void
.end method


# virtual methods
.method public final klm()Z
    .locals 1

    const-string v0, "com.samsung.android.deviceidservice"

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

    const-string v1, "com.samsung.android.deviceidservice.IDeviceIdService"

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/x$lmn;->lmn()Landroid/os/IBinder;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/huawei/hms/analytics/ae;-><init>(Ljava/lang/String;Landroid/os/IBinder;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/ae;->lmn([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/ad;->lmn:Lcom/huawei/hms/analytics/i$lmn;

    const-string v1, ""

    const-string v2, "oaid"

    invoke-interface {v0, p1, v1, v2}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->ikl()V

    return-void

    :cond_0
    :try_start_1
    const-string p1, "SamSungDeviceIdHelper"

    const-string v0, "oaid is empty"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "get oaid error"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->ikl()V

    throw p1
.end method
