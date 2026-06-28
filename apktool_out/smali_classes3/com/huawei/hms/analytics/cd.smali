.class public final Lcom/huawei/hms/analytics/cd;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static klm(Lcom/huawei/hms/analytics/cc;)Lcom/huawei/hms/analytics/database/APIEvent;
    .locals 12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lcom/huawei/hms/analytics/database/APIEvent;

    const-string v3, "rpt_api_dist"

    const-string v5, "0"

    iget-object v6, p0, Lcom/huawei/hms/analytics/cc;->ikl:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iget-object v8, p0, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    iget-object v9, p0, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    const-string v10, "1"

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/cc;->lmn()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/huawei/hms/analytics/database/APIEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static declared-synchronized lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/cd;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/huawei/hms/analytics/cc;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/cc;-><init>()V

    iput-object p0, v1, Lcom/huawei/hms/analytics/cc;->ikl:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized lmn(Lcom/huawei/hms/analytics/cc;)V
    .locals 3

    const-class v0, Lcom/huawei/hms/analytics/cd;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v1, :cond_0

    const-string p0, "APIEvtRecordHolder"

    const-string v1, "The Analytics Kit is disabled, don\'t record"

    invoke-static {p0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_0
    if-eqz p0, :cond_1

    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Lcom/huawei/hms/analytics/cd;->klm(Lcom/huawei/hms/analytics/cc;)Lcom/huawei/hms/analytics/database/APIEvent;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance p0, Lcom/huawei/hms/analytics/cg;

    invoke-direct {p0, v1}, Lcom/huawei/hms/analytics/cg;-><init>(Ljava/util/List;)V

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->klm()Lcom/huawei/hms/analytics/cx;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catch_0
    :try_start_3
    const-string p0, "APIEvtRecordHolder"

    const-string v1, "IE-004"

    const-string v2, "HMSBIInitializer init failed,Missing hms sdk"

    invoke-static {p0, v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    const-string p0, "APIEvtRecordHolder"

    const-string v1, "HMSBIInitializer init failed"

    invoke-static {p0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static lmn(Ljava/util/Map;Ljava/lang/String;JI)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            "JI)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "APIEvtRecordHolder"

    if-nez v0, :cond_0

    const-string v0, "The Analytics Kit is disabled, don\'t record"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/16 v4, 0xc8

    move/from16 v15, p4

    if-ne v15, v4, :cond_1

    const-string v4, "0"

    goto :goto_1

    :cond_1
    const-string v4, "1"

    :goto_1
    move-object v10, v4

    new-instance v4, Lcom/huawei/hms/analytics/database/APIEvent;

    const-string v6, "rpt_api_dist"

    const-string v8, "1"

    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v14

    move-object v5, v4

    move-object/from16 v9, p1

    invoke-direct/range {v5 .. v14}, Lcom/huawei/hms/analytics/database/APIEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :try_start_0
    new-instance v0, Lcom/huawei/hms/analytics/cg;

    invoke-direct {v0, v2}, Lcom/huawei/hms/analytics/cg;-><init>(Ljava/util/List;)V

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->klm()Lcom/huawei/hms/analytics/cx;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "IE-004"

    const-string v2, "HMSBIInitializer init failed,Missing hms sdk!"

    invoke-static {v1, v0, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_1
    const-string v0, "HMSBIInitializer init failed!"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
