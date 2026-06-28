.class public final Lcom/huawei/hms/analytics/bb;
.super Lcom/huawei/hms/analytics/aq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "global_v2"

    const-string v1, "common_prop"

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/hms/analytics/aq;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->ijk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "userPro"

    if-eqz v1, :cond_0

    const-string v0, "commonprop is empty"

    invoke-static {v2, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/bo;->klm()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/aq;->lmn(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->decryptCbc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    invoke-static {v1, v3}, Lcom/huawei/hms/analytics/aq;->klm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/aq;->lmn(Ljava/lang/String;)V

    :cond_2
    move-object v0, v3

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "customParams is error"

    :goto_1
    invoke-static {v2, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->hij()V

    goto :goto_2

    :cond_3
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/huawei/hms/analytics/aq;->lmn(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string v0, "cache user properties is no json"

    goto :goto_1

    :cond_4
    :goto_2
    invoke-super {p0}, Lcom/huawei/hms/analytics/aq;->lmn()V

    return-void
.end method

.method public final lmn(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    return-void

    :cond_1
    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    const/16 v0, 0x19

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/aq;->lmn(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->fgh()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object p2

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/bo;->klm()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/huawei/hms/analytics/aq;->klm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/aq;->lmn(Ljava/lang/String;)V

    :cond_4
    return-void
.end method
