.class public final Lcom/huawei/hms/analytics/m$lmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "lmn"
.end annotation


# instance fields
.field final synthetic lmn:Lcom/huawei/hms/analytics/m;


# direct methods
.method private constructor <init>(Lcom/huawei/hms/analytics/m;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/huawei/hms/analytics/m;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/m$lmn;-><init>(Lcom/huawei/hms/analytics/m;)V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    const-string p1, "onServiceConnected"

    const-string v0, "PpsServiceCommander"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p2}, Lcom/huawei/hms/analytics/lmn$lmn;->lmn(Landroid/os/IBinder;)Lcom/huawei/hms/analytics/lmn;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    iget-object p1, p1, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    const-string p2, "pps service is null"

    const-string v1, "006"

    :goto_0
    invoke-interface {p1, p2, v1}, Lcom/huawei/hms/analytics/l;->lmn(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iget-object p1, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/m;->lmn()V

    return-void

    :cond_0
    :try_start_1
    invoke-interface {p1}, Lcom/huawei/hms/analytics/lmn;->lmn()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    iget-object p1, p1, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    const-string p2, "channelInfo is empty"

    const-string v1, "007"

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    iget-object p2, p2, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "channelInfo"

    const-string v2, ""

    invoke-virtual {v1, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/huawei/hms/analytics/l;->lmn(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :try_start_2
    iget-object p1, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    iget-object p1, p1, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    const-string p2, "parseChannelJson: json exception"

    const-string v0, "102"

    invoke-interface {p1, p2, v0}, Lcom/huawei/hms/analytics/l;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception p1

    const-string p2, "getChannelInfo Exception"

    invoke-static {v0, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    iget-object p2, p2, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "998"

    invoke-interface {p2, p1, v0}, Lcom/huawei/hms/analytics/l;->lmn(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_2
    iget-object p2, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/m;->lmn()V

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string p1, "PpsServiceCommander"

    const-string v0, "onServiceDisconnected"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/m$lmn;->lmn:Lcom/huawei/hms/analytics/m;

    iget-object p1, p1, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    const-string v1, "008"

    invoke-interface {p1, v0, v1}, Lcom/huawei/hms/analytics/l;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
