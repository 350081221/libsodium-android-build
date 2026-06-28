.class public final Lcom/huawei/hms/analytics/v;
.super Lcom/huawei/hms/analytics/ad;
.source "SourceFile"


# instance fields
.field private final ijk:Lcom/huawei/hms/analytics/i$lmn;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hms/analytics/ad;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;Lcom/huawei/hms/analytics/ad;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.ads.identifier.service.START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.android.gms"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v1, Lcom/huawei/hms/analytics/x;

    invoke-direct {v1, p1, v0, p0}, Lcom/huawei/hms/analytics/x;-><init>(Landroid/content/Context;Landroid/content/Intent;Lcom/huawei/hms/analytics/w;)V

    iput-object v1, p0, Lcom/huawei/hms/analytics/ad;->ikl:Lcom/huawei/hms/analytics/x;

    iput-object p2, p0, Lcom/huawei/hms/analytics/v;->ijk:Lcom/huawei/hms/analytics/i$lmn;

    return-void
.end method


# virtual methods
.method public final klm()Z
    .locals 1

    const-string v0, "com.android.vending"

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
    const-string v0, "GMS getOaid,bindService error, begin get gaid"

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/v;->lmn(Ljava/lang/String;)V

    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/x$lmn;)V
    .locals 3

    :try_start_0
    new-instance v0, Lcom/huawei/hms/analytics/ae;

    const-string v1, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/x$lmn;->lmn()Landroid/os/IBinder;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/huawei/hms/analytics/ae;-><init>(Ljava/lang/String;Landroid/os/IBinder;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/ae;->lmn([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/ae;->lmn()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->ikl()V

    iget-object v1, p0, Lcom/huawei/hms/analytics/v;->ijk:Lcom/huawei/hms/analytics/i$lmn;

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "gaid"

    invoke-interface {v1, p1, v0, v2}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "get gaid error"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->ikl()V

    throw p1
.end method

.method public final lmn(Ljava/lang/String;)V
    .locals 1

    const-string p1, "gaidHepler"

    const-string v0, "bind service error"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/v;->ijk:Lcom/huawei/hms/analytics/i$lmn;

    const-string v0, ""

    invoke-interface {p1, v0, v0, v0}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
