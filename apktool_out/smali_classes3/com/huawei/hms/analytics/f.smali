.class public final Lcom/huawei/hms/analytics/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static klm(Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object p0

    const-string v0, "_openness_config_tag"

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object p0

    instance-of v0, p0, Lcom/huawei/hms/analytics/ghi;

    if-eqz v0, :cond_0

    const-string v0, "t"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lcom/huawei/hms/analytics/ghi;

    new-instance v0, Lcom/huawei/hms/analytics/dj;

    const-string v1, "$CampaignPushClick"

    invoke-direct {v0, v1, p1}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/huawei/hms/analytics/ijk;->klm(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "_openness_config_tag_region"

    const-string v0, ""

    const-string v1, "Privacy_MY"

    invoke-static {p0, v1, p1, v0}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/huawei/hms/analytics/HiAnalytics;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    return-void

    :cond_2
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/HiAnalytics;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    return-void
.end method

.method private static lmn(Lcom/huawei/hms/analytics/bw;Landroid/content/Context;)Lcom/huawei/hms/analytics/d;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/z;->ghi()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/e;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hms/analytics/e;-><init>(Lcom/huawei/hms/analytics/bw;Landroid/content/Context;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/huawei/hms/analytics/c;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hms/analytics/c;-><init>(Lcom/huawei/hms/analytics/bw;Landroid/content/Context;)V

    return-object v0
.end method

.method private static lmn(Lcom/huawei/hms/analytics/bw;)Lorg/json/JSONObject;
    .locals 4

    const-string v0, "PshCamp"

    invoke-static {p0}, Lcom/huawei/hms/analytics/cz;->lmn(Lcom/huawei/hms/analytics/bw;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x5000

    if-le v1, v3, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "t"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "The time key is missing."

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v2

    :cond_1
    return-object v1

    :catchall_0
    const-string p0, "JSONException: Failed to format Json."

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-object v2
.end method

.method public static lmn(Landroid/content/Context;Lcom/huawei/hms/analytics/bw;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lcom/huawei/hms/analytics/cz;->klm(Lcom/huawei/hms/analytics/bw;)V

    invoke-static {p1}, Lcom/huawei/hms/analytics/f;->lmn(Lcom/huawei/hms/analytics/bw;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/huawei/hms/analytics/c;

    invoke-direct {v1, p1, p0}, Lcom/huawei/hms/analytics/c;-><init>(Lcom/huawei/hms/analytics/bw;Landroid/content/Context;)V

    const/4 p0, 0x0

    invoke-interface {v1, v0, p0}, Lcom/huawei/hms/analytics/d;->lmn(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    return-void

    :cond_1
    invoke-static {p1, p0}, Lcom/huawei/hms/analytics/f;->lmn(Lcom/huawei/hms/analytics/bw;Landroid/content/Context;)Lcom/huawei/hms/analytics/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/huawei/hms/analytics/d;->lmn()Lcom/huawei/hms/analytics/ao;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/d;->lmn(Lcom/huawei/hms/analytics/ao;)Lcom/huawei/hms/analytics/ap;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/ap;->lmn()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/ao;->lmn()Lorg/json/JSONObject;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hms/analytics/d;->lmn(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    invoke-static {p0, v1}, Lcom/huawei/hms/analytics/f;->lmn(Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method

.method private static lmn(Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/f;->klm(Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method
