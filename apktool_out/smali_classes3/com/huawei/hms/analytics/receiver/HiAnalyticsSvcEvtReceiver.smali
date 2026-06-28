.class public Lcom/huawei/hms/analytics/receiver/HiAnalyticsSvcEvtReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private static lmn(Landroid/content/Intent;)Z
    .locals 3

    const/4 v0, 0x1

    const-string v1, "HiAnalyticsSvcEvtAccepter"

    if-nez p0, :cond_0

    const-string p0, "intent is null"

    invoke-static {v1, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v2, p0, Lcom/huawei/hms/analytics/receiver/SafeIntent;

    if-eqz v2, :cond_1

    const-string v0, "safe intent"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p0, Lcom/huawei/hms/analytics/receiver/SafeIntent;

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/receiver/SafeIntent;->lmn()Z

    move-result v0

    goto :goto_0

    :cond_1
    :try_start_0
    const-string v1, "ANYTHING"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    :catchall_0
    :goto_0
    return v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    const-string v0, "onReceive is running"

    const-string v1, "HiAnalyticsSvcEvtAccepter"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/dq;->lmn()Lcom/huawei/hms/analytics/dq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/dq;->lmn(Landroid/content/Context;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_1

    const-string v0, "isAnalyticsEnabled is false"

    :goto_0
    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "openness init failed"

    goto :goto_0

    :cond_2
    invoke-static {p2}, Lcom/huawei/hms/analytics/receiver/HiAnalyticsSvcEvtReceiver;->lmn(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "hasIntentBomb"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_4

    return-void

    :cond_4
    const-string v0, "SvcEvtReceiverHolder"

    if-eqz p1, :cond_14

    if-nez p2, :cond_5

    goto/16 :goto_6

    :cond_5
    :try_start_1
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p1, p1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    if-nez p1, :cond_6

    const-string p1, "Check whether the SDK is initialized."

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_6
    new-instance p1, Lcom/huawei/hms/analytics/receiver/SafeIntent;

    invoke-direct {p1, p2}, Lcom/huawei/hms/analytics/receiver/SafeIntent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/receiver/SafeIntent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    new-instance v2, Lcom/huawei/hms/analytics/bw;

    invoke-direct {v2, p2}, Lcom/huawei/hms/analytics/bw;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/receiver/SafeIntent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "com.huawei.hms.analytics.pps.event"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    const-string p1, "onReceive : event is ads"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "SvcEvtReceiverHandler#handlerADSEvt(Bundle)"

    const-string p2, "event_detail"

    invoke-virtual {v2, p2}, Lcom/huawei/hms/analytics/bw;->lmn(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    new-instance v2, Lcom/huawei/hms/analytics/bw;

    invoke-direct {v2, p2}, Lcom/huawei/hms/analytics/bw;-><init>(Landroid/os/Bundle;)V

    const-string p2, "event_type"

    invoke-virtual {v2, p2}, Lcom/huawei/hms/analytics/bw;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v4, ""

    if-eqz v3, :cond_8

    :cond_7
    move-object p2, v4

    goto :goto_2

    :cond_8
    :try_start_2
    const-string v3, "$RequestAd"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "$DisplayAd"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_2

    :cond_a
    const-string v3, "$ClickAd"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_2

    :cond_b
    const-string v3, "$ObtainAdAward"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_2
    const-string v3, "package_name"

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/bw;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object p1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_12

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    goto/16 :goto_5

    :cond_c
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v5

    iget-object v5, v5, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v5, v5, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v5, "slot_id"

    invoke-virtual {v2, v5}, Lcom/huawei/hms/analytics/bw;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "activity_name"

    invoke-virtual {v2, v6}, Lcom/huawei/hms/analytics/bw;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "sub_type"

    invoke-virtual {v2, v7}, Lcom/huawei/hms/analytics/bw;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "$MaterialSlot"

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_3

    :cond_d
    move-object v5, v4

    :goto_3
    invoke-virtual {v3, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "$CurActivityName"

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_e

    goto :goto_4

    :cond_e
    move-object v6, v4

    :goto_4
    invoke-virtual {v3, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "$EvtType"

    const-string v6, "Supplier"

    invoke-virtual {v3, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "$AdReqType"

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_f

    move-object v4, v2

    :cond_f
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "start onEvent"

    invoke-static {v0, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    const-string v2, "_openness_config_tag"

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v2, Lcom/huawei/hms/analytics/dj;

    invoke-direct {v2, p2, v3}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v0, p2, v2, v3, v4}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    :cond_10
    iput-object p2, p1, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    const-string p2, "0"

    iput-object p2, p1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_11
    const-string v2, "3rd package names are not equal"

    invoke-static {v0, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p1, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_12
    :goto_5
    const-string v2, "event_type or package_name is empty"

    invoke-static {v0, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p1, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_13
    const-string p1, "onReceive : event is not ads"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_14
    :goto_6
    const-string p1, "context or intent is null"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "SvcEvtReceiver onReceive error."

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    return-void
.end method
