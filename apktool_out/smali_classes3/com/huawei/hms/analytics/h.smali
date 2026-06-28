.class public final Lcom/huawei/hms/analytics/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/h$klm;,
        Lcom/huawei/hms/analytics/h$lmn;
    }
.end annotation


# instance fields
.field hij:Lcom/huawei/hms/analytics/j;

.field ijk:Lcom/huawei/hms/analytics/cc$lmn;

.field ikl:Lcom/huawei/hms/analytics/o;

.field klm:Landroid/content/Context;

.field lmn:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/bh;Lcom/huawei/hms/analytics/cc$lmn;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/h;->klm:Landroid/content/Context;

    new-instance v0, Lcom/huawei/hms/analytics/j;

    invoke-direct {v0, p2}, Lcom/huawei/hms/analytics/j;-><init>(Lcom/huawei/hms/analytics/bh;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/h;->hij:Lcom/huawei/hms/analytics/j;

    new-instance p2, Lcom/huawei/hms/analytics/o;

    invoke-direct {p2, p1}, Lcom/huawei/hms/analytics/o;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/huawei/hms/analytics/h;->ikl:Lcom/huawei/hms/analytics/o;

    iput-object p3, p0, Lcom/huawei/hms/analytics/h;->ijk:Lcom/huawei/hms/analytics/cc$lmn;

    return-void
.end method

.method private static lmn(Lcom/huawei/hms/analytics/at;)Ljava/lang/String;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "_restriction_enabled"

    iget-boolean v2, p0, Lcom/huawei/hms/analytics/at;->efg:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "_restriction_shared"

    iget-boolean v2, p0, Lcom/huawei/hms/analytics/at;->def:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "_region"

    iget-object p0, p0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    const-string v2, "_openness_config_tag"

    invoke-virtual {p0, v2}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method


# virtual methods
.method public final lmn()V
    .locals 2

    const-string v0, "HAServiceCommander"

    const-string v1, "unBindService is running"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->abc:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/h;->klm:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/hms/analytics/at;->abc:Z

    :cond_0
    return-void
.end method

.method public final onBindingDied(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "HAServiceCommander"

    const-string v0, "onBindingDied"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/huawei/hms/analytics/at;->abc:Z

    return-void
.end method

.method public final onNullBinding(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lcom/huawei/hms/analytics/h;->ijk:Lcom/huawei/hms/analytics/cc$lmn;

    if-eqz p1, :cond_0

    const-string v0, "1"

    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/cc$lmn;->lmn(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    const-string p1, "onServiceConnected"

    const-string v0, "HAServiceCommander"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/h;->ijk:Lcom/huawei/hms/analytics/cc$lmn;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/huawei/hms/analytics/cc$lmn;->lmn()V

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const/4 v1, 0x1

    iput-boolean v1, p1, Lcom/huawei/hms/analytics/at;->abc:Z

    :try_start_0
    invoke-static {p2}, Lcom/huawei/hms/analytics/def$lmn;->lmn(Landroid/os/IBinder;)Lcom/huawei/hms/analytics/def;

    move-result-object p2

    iput-object p2, p1, Lcom/huawei/hms/analytics/at;->b:Lcom/huawei/hms/analytics/def;

    new-instance v1, Lcom/huawei/hms/analytics/UploadInfo;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/UploadInfo;-><init>()V

    iget-object v2, p1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/huawei/hms/analytics/UploadInfo;->lmn:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/cy;->klm()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/huawei/hms/analytics/UploadInfo;->klm:Ljava/lang/String;

    iget-object v2, p1, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, v2, Lcom/huawei/hms/analytics/ay;->klm:Ljava/lang/String;

    iput-object v2, v1, Lcom/huawei/hms/analytics/UploadInfo;->ikl:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/h;->lmn(Lcom/huawei/hms/analytics/at;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/huawei/hms/analytics/UploadInfo;->ijk:Ljava/lang/String;

    iget-object p1, p1, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, p1, Lcom/huawei/hms/analytics/ay;->lmn:Ljava/util/Map;

    const-string v3, "_openness_config_tag"

    invoke-virtual {p1, v3}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/huawei/hms/analytics/UploadInfo;->lmn([Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/UploadInfo;->klm:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, v1, Lcom/huawei/hms/analytics/UploadInfo;->lmn:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "Upload info is correct"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/h;->hij:Lcom/huawei/hms/analytics/j;

    invoke-interface {p2, p1, v1}, Lcom/huawei/hms/analytics/def;->lmn(Lcom/huawei/hms/analytics/efg;Lcom/huawei/hms/analytics/UploadInfo;)V

    goto :goto_0

    :cond_1
    const-string p1, "Upload info is not correct"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object p1, p0, Lcom/huawei/hms/analytics/h;->lmn:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    const-string p2, "registerCallback error"

    invoke-static {v0, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    const-string p1, "registerCallback RemoteException"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    iget-object p2, p0, Lcom/huawei/hms/analytics/h;->lmn:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "HAServiceCommander"

    const-string v0, "onServiceDisconnected"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/huawei/hms/analytics/at;->abc:Z

    iget-object p1, p0, Lcom/huawei/hms/analytics/h;->ijk:Lcom/huawei/hms/analytics/cc$lmn;

    if-eqz p1, :cond_0

    const-string v0, "2"

    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/cc$lmn;->lmn(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
