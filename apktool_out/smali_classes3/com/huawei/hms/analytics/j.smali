.class public final Lcom/huawei/hms/analytics/j;
.super Lcom/huawei/hms/analytics/efg$lmn;
.source "SourceFile"


# instance fields
.field private klm:Lcom/huawei/hms/analytics/bh;

.field lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/bh;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hms/analytics/efg$lmn;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/j;->klm:Lcom/huawei/hms/analytics/bh;

    return-void
.end method

.method private static lmn(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "$HA_METHOD"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "$Channel"

    :goto_1
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v3, "$HA_RESULT"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "$EvtResult"

    goto :goto_1

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final lmn(Ljava/util/List;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/CustomEvent;",
            ">;)I"
        }
    .end annotation

    const-string v0, "$HA_LOGIN"

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->fgh:Z

    const/4 v2, -0x1

    const-string v3, "ServiceRingback"

    if-nez v1, :cond_0

    const-string p1, "isAnalyticsEnabled is false"

    invoke-static {v3, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/huawei/hms/analytics/j;->lmn:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p1, "opennessInitComplete is false"

    invoke-static {v3, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_1
    const-string v1, "ServiceCallback#handleCustomEvent(List<CustomEvent>)"

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v4

    iput-object v1, v4, Lcom/huawei/hms/analytics/cc;->ikl:Ljava/lang/String;

    if-eqz p1, :cond_c

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, p0, Lcom/huawei/hms/analytics/j;->klm:Lcom/huawei/hms/analytics/bh;

    if-nez v1, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v1, "events got"

    invoke-static {v3, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/j;->lmn:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/huawei/hms/analytics/CustomEvent;

    iget-object v8, v6, Lcom/huawei/hms/analytics/CustomEvent;->lmn:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v9

    iget-object v9, v9, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v9, v9, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v8, v6, Lcom/huawei/hms/analytics/CustomEvent;->klm:Ljava/lang/String;

    iget-object v6, v6, Lcom/huawei/hms/analytics/CustomEvent;->ikl:Landroid/os/Bundle;

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v10, "$HA_LOGOUT"

    if-nez v9, :cond_5

    :try_start_1
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_1

    :cond_4
    move-object v9, v8

    goto :goto_3

    :cond_5
    :goto_1
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const-string v9, "$SignIn"

    goto :goto_2

    :cond_6
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const-string v9, "$SignOut"

    goto :goto_2

    :cond_7
    const/4 v9, 0x0

    :goto_2
    invoke-static {v6}, Lcom/huawei/hms/analytics/j;->lmn(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v6

    :goto_3
    new-instance v10, Lcom/huawei/hms/analytics/dj;

    invoke-direct {v10, v9, v7}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v10, v6}, Lcom/huawei/hms/analytics/dj;->lmn(Landroid/os/Bundle;)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "bundle params is invalid."

    invoke-static {v3, v6}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    if-eqz v1, :cond_9

    iget-object v6, p0, Lcom/huawei/hms/analytics/j;->klm:Lcom/huawei/hms/analytics/bh;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-interface {v6, v9, v10, v7, v8}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    goto :goto_0

    :cond_9
    invoke-interface {v5, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_a
    if-nez v1, :cond_b

    iget-object p1, p0, Lcom/huawei/hms/analytics/j;->klm:Lcom/huawei/hms/analytics/bh;

    iget-object v0, p0, Lcom/huawei/hms/analytics/j;->lmn:Ljava/lang/String;

    invoke-interface {p1, v0, v5}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Ljava/util/Map;)V

    const-string p1, ""

    iput-object p1, p0, Lcom/huawei/hms/analytics/j;->lmn:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_b
    const-string p1, "0"

    iput-object p1, v4, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v4}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return v7

    :catch_0
    const-string p1, "handleCustomEvent RuntimeException"

    invoke-static {v3, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return v2

    :cond_c
    :goto_4
    const-string p1, "events empty"

    invoke-static {v3, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return v2
.end method
