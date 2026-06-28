.class public final Lcom/huawei/hms/analytics/hij;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final efg:Ljava/lang/String;

.field private fgh:Ljava/lang/String;

.field private final ghi:Ljava/lang/String;

.field private final hij:Lcom/huawei/hms/analytics/at;

.field private final ijk:Lcom/huawei/hms/analytics/klm;

.field private final ikl:Landroid/content/Context;

.field klm:Lcom/huawei/hms/analytics/cc;

.field lmn:Lcom/huawei/hms/analytics/ikl;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/klm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/hms/analytics/hij;->ijk:Lcom/huawei/hms/analytics/klm;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p1, p0, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-object p3, p0, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/hms/analytics/hij;->efg:Ljava/lang/String;

    return-void
.end method

.method private lmn(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/ba;->lmn(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 33

    move-object/from16 v1, p0

    const-string v2, "is_enabled_adsid"

    const-string v3, "push_token_collection_enable"

    const-string v4, "api_channel"

    const-string v5, "$UpdateApp"

    const-string v6, "is_restriction_enabled"

    const-string v7, "app_ver"

    const-string v8, "onCacheThreshold"

    const-string v9, "onScheduledTime"

    const-string v10, "policies"

    const-string v11, "firstRunTime"

    const-string v12, "_openness_config_tag"

    const-string v13, "6.7.0.300"

    const-string v14, "lib_ver"

    const-string v15, "global_v2"

    move-object/from16 v16, v13

    iget-object v13, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-static {v13}, Lcom/huawei/hms/analytics/ba;->lmn(Ljava/lang/String;)Z

    move-result v13

    move-object/from16 v17, v14

    const-string v14, "InitTask"

    if-eqz v13, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    iget-object v13, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    move-object/from16 v18, v5

    iget-object v5, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-static {v13, v5}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " init complete ,region is not change"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    move-object/from16 v18, v5

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v5

    iget-object v13, v1, Lcom/huawei/hms/analytics/hij;->efg:Ljava/lang/String;

    invoke-virtual {v5, v13}, Lcom/huawei/hms/analytics/framework/SyncManager;->start(Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/ba;->klm()Z

    move-result v13
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_d
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const-string v5, "UNKNOWN"

    move-object/from16 v19, v11

    const-string v11, ""

    if-eqz v13, :cond_3

    :try_start_1
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, v2, Lcom/huawei/hms/analytics/ay;->ghi:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    :goto_0
    iput-object v2, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v20, v8

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    move-object v6, v11

    move-object/from16 v23, v12

    move-object/from16 v24, v14

    move-object v5, v15

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    move-object v2, v0

    move-object v5, v15

    :goto_1
    move-object/from16 v6, v16

    move-object/from16 v3, v17

    goto/16 :goto_19

    :catch_0
    move-exception v0

    move-object v2, v0

    move-object v4, v14

    move-object v5, v15

    :goto_2
    move-object/from16 v6, v16

    move-object/from16 v3, v17

    goto/16 :goto_18

    :cond_3
    :try_start_2
    iget-object v13, v1, Lcom/huawei/hms/analytics/hij;->ijk:Lcom/huawei/hms/analytics/klm;

    move-object/from16 v20, v8

    iget-object v8, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-static {v8}, Lcom/huawei/hms/analytics/klm;->lmn(Landroid/content/Context;)Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object v8

    if-eqz v8, :cond_1e

    move-object/from16 v21, v9

    const-string v9, "client/app_id"

    invoke-interface {v8, v9}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v22, v10

    const-string v10, "client/product_id"

    invoke-interface {v8, v10, v11}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v23, v12

    const-string v12, "service/analytics/resource_id"

    invoke-interface {v8, v12, v11}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_d
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    move-object/from16 v24, v14

    :try_start_3
    const-string v14, "client/client_id"

    invoke-interface {v8, v14, v11}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v25, v2

    const-string v2, "region"

    invoke-interface {v8, v2, v11}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v26

    if-nez v26, :cond_1d

    move-object/from16 v26, v3

    new-instance v3, Lcom/huawei/hms/analytics/ay;

    invoke-direct {v3}, Lcom/huawei/hms/analytics/ay;-><init>()V

    move-object/from16 v27, v4

    iget-boolean v4, v13, Lcom/huawei/hms/analytics/klm;->lmn:Z

    move-object/from16 v28, v6

    const-string v6, "service/analytics/collector_url"

    invoke-interface {v8, v6}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v29, v7

    const-string v7, "service/analytics/collector_url_cn"

    invoke-interface {v8, v7, v11}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_b
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    move-object/from16 v30, v15

    :try_start_4
    const-string v15, "service/analytics/collector_url_de"

    invoke-interface {v8, v15, v11}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v31, v5

    const-string v5, "service/analytics/collector_url_ru"

    invoke-interface {v8, v5, v11}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_a
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    :try_start_5
    const-string v1, "service/analytics/collector_url_sg"

    invoke-interface {v8, v1, v11}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    move-object/from16 v32, v11

    const-string v11, "CN"

    invoke-static {v7}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v11, v7}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/util/Map;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v7, "DE"

    invoke-static {v15}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v7, v11}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/util/Map;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v7, "RU"

    invoke-static {v5}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v7, v5}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/util/Map;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v5, "SG"

    invoke-static {v1}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v5, v1}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/util/Map;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-static {v8, v2, v6}, Lcom/huawei/hms/analytics/klm;->lmn(Ljava/util/Map;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_9
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    if-eqz v4, :cond_5

    :try_start_6
    iget-object v1, v13, Lcom/huawei/hms/analytics/klm;->klm:Ljava/lang/String;

    invoke-interface {v8, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_5

    :cond_4
    new-instance v1, Ljava/lang/IllegalAccessException;

    const-string v2, "RoutePolicy collect urls check failed, please update agconnect-services.json"

    invoke-direct {v1, v2}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    :goto_3
    move-object v2, v0

    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v5, v30

    goto/16 :goto_19

    :catch_1
    move-exception v0

    move-object/from16 v1, p0

    :goto_4
    move-object v2, v0

    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v24

    move-object/from16 v5, v30

    goto/16 :goto_18

    :cond_5
    :try_start_7
    array-length v1, v6

    if-eqz v1, :cond_1c

    :goto_5
    iput-object v8, v3, Lcom/huawei/hms/analytics/ay;->lmn:Ljava/util/Map;

    iput-object v9, v3, Lcom/huawei/hms/analytics/ay;->klm:Ljava/lang/String;

    iput-object v2, v3, Lcom/huawei/hms/analytics/ay;->ghi:Ljava/lang/String;

    iput-object v10, v3, Lcom/huawei/hms/analytics/ay;->ikl:Ljava/lang/String;

    iput-object v14, v3, Lcom/huawei/hms/analytics/ay;->fgh:Ljava/lang/String;

    iput-object v12, v3, Lcom/huawei/hms/analytics/ay;->ijk:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_9
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-object/from16 v1, p0

    :try_start_8
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-object v3, v2, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    move-object/from16 v3, v31

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_a
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    if-eqz v2, :cond_6

    :try_start_9
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, v2, Lcom/huawei/hms/analytics/ay;->ghi:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_4

    :cond_6
    :try_start_a
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    :goto_6
    iput-object v2, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-static {v2}, Lcom/huawei/hms/analytics/dg;->hij(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const-string v4, "ab_info"
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    move-object/from16 v5, v30

    move-object/from16 v6, v32

    :try_start_b
    invoke-static {v3, v5, v4, v6}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    move-object/from16 v7, v29

    invoke-static {v4, v5, v7, v6}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v8, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-static {v8, v5, v7, v2}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v7, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const-string v8, "is_analytics_enabled"

    const/4 v9, 0x1

    invoke-static {v7, v5, v8, v9}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    iget-object v8, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    move-object/from16 v9, v28

    invoke-static {v8, v5, v9}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    if-eqz v8, :cond_7

    :try_start_c
    iget-object v8, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const/4 v10, 0x0

    invoke-static {v8, v5, v9, v10}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_7

    :catch_3
    move-exception v0

    move-object v2, v0

    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v24

    goto/16 :goto_18

    :cond_7
    if-nez v7, :cond_8

    const/4 v8, 0x1

    goto :goto_7

    :cond_8
    const/4 v8, 0x0

    :goto_7
    :try_start_d
    iget-object v9, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const-string v10, "is_restriction_shared"

    const/4 v11, 0x0

    invoke-static {v9, v5, v10, v11}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    iget-object v10, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const-string v11, "w_app_id"

    invoke-static {v10, v5, v11, v6}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iget-object v11, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const-string v12, "dis_pros"

    invoke-static {v11, v5, v12}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    if-nez v12, :cond_9

    :try_start_e
    invoke-static {v11}, Lcom/huawei/hms/analytics/dg;->ijk(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_9

    const/16 v13, 0x100

    invoke-static {v12, v13}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v13

    if-eqz v13, :cond_9

    sget-object v13, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v12, v13}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/huawei/hms/analytics/dh;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lcom/huawei/hms/analytics/dh;->lmn(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    :cond_9
    :try_start_f
    iget-object v11, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-object v2, v11, Lcom/huawei/hms/analytics/at;->klm:Ljava/lang/String;

    iput-object v4, v11, Lcom/huawei/hms/analytics/at;->ikl:Ljava/lang/String;

    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-static {v2}, Lcom/huawei/hms/analytics/dg;->ikl(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    move-object/from16 v11, v27

    invoke-static {v4, v5, v11, v6}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v12, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-object v4, v12, Lcom/huawei/hms/analytics/at;->v:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    if-nez v12, :cond_b

    :try_start_10
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_a

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-static {v4, v5, v11, v6}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-object v6, v4, Lcom/huawei/hms/analytics/at;->v:Ljava/lang/String;

    :cond_a
    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-object v2, v4, Lcom/huawei/hms/analytics/at;->ijk:Ljava/lang/String;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :cond_b
    :try_start_11
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-object v3, v2, Lcom/huawei/hms/analytics/at;->g:Ljava/lang/String;

    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    move-object/from16 v3, v26

    invoke-static {v2, v5, v3}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    if-eqz v2, :cond_c

    :try_start_12
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const/4 v4, 0x1

    invoke-static {v2, v5, v3, v4}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-boolean v2, v3, Lcom/huawei/hms/analytics/at;->x:Z
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    goto :goto_8

    :cond_c
    :try_start_13
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const-string v4, "analyticskit_pushtoken_collection_enabled"

    invoke-static {v3, v4}, Lcom/huawei/hms/analytics/dg;->lmn(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, v2, Lcom/huawei/hms/analytics/at;->x:Z

    :goto_8
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    move-object/from16 v3, v25

    invoke-static {v2, v5, v3}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_8
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    if-eqz v2, :cond_d

    :try_start_14
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const/4 v4, 0x1

    invoke-static {v2, v5, v3, v4}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-boolean v2, v3, Lcom/huawei/hms/analytics/at;->k:Z
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_3
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    goto :goto_9

    :cond_d
    :try_start_15
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    const-string v4, "analyticskit_adsid_collection_enabled"

    invoke-static {v3, v4}, Lcom/huawei/hms/analytics/dg;->lmn(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, v2, Lcom/huawei/hms/analytics/at;->k:Z

    :goto_9
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->hij:Lcom/huawei/hms/analytics/at;

    iput-boolean v7, v2, Lcom/huawei/hms/analytics/at;->fgh:Z

    iput-boolean v8, v2, Lcom/huawei/hms/analytics/at;->efg:Z

    iput-boolean v9, v2, Lcom/huawei/hms/analytics/at;->def:Z

    iput-object v10, v2, Lcom/huawei/hms/analytics/at;->u:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object v2

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/cy;->lmn(Landroid/content/Context;)V

    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/huawei/hms/analytics/ch;

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/huawei/hms/analytics/ch;-><init>(Landroid/content/Context;)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    new-instance v2, Lcom/huawei/hms/analytics/cm;

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/huawei/hms/analytics/cm;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/cm;->run()V

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->ikl()V

    :goto_a
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/cde;->lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/cde;

    move-result-object v2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v3

    iget-object v3, v3, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v3, v3, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v3, v3, Lcom/huawei/hms/analytics/ay;->lmn:Ljava/util/Map;

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1b

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/cde;->lmn(Ljava/lang/String;)Z

    move-result v3
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_8
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    if-eqz v3, :cond_e

    :try_start_16
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "change region: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_5
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    move-object/from16 v4, v24

    :try_start_17
    invoke-static {v4, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/cde;->lmn()V

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    iget-object v7, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {v3, v7, v8, v9}, Lcom/huawei/hms/analytics/ca;->lmn(Landroid/content/Context;Ljava/lang/String;J)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_4
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    goto :goto_c

    :catch_4
    move-exception v0

    goto :goto_b

    :catchall_3
    move-exception v0

    move-object v2, v0

    goto/16 :goto_1

    :catch_5
    move-exception v0

    move-object/from16 v4, v24

    :goto_b
    move-object v2, v0

    goto/16 :goto_2

    :cond_e
    move-object/from16 v4, v24

    :goto_c
    :try_start_18
    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    iput-object v3, v2, Lcom/huawei/hms/analytics/cde;->klm:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v7

    iget-object v7, v7, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v7, v7, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v8, v2, Lcom/huawei/hms/analytics/cde;->lmn:Ljava/lang/String;

    iget-object v7, v7, Lcom/huawei/hms/analytics/ay;->hij:Ljava/util/Map;

    invoke-interface {v7, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v7

    iget-object v7, v7, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v7, v7, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v8, "Privacy_MY"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/huawei/hms/analytics/cde;->lmn:Ljava/lang/String;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_region"

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v8, v2, v3}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/huawei/hms/analytics/hij;->lmn(Z)V

    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    move-object/from16 v3, v23

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_7
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    if-eqz v2, :cond_13

    :try_start_19
    invoke-static {}, Lcom/huawei/hms/analytics/bp;->lmn()Lcom/huawei/hms/analytics/bp;

    move-result-object v2

    iget-boolean v7, v2, Lcom/huawei/hms/analytics/bp;->klm:Z

    if-nez v7, :cond_13

    const/4 v7, 0x1

    iput-boolean v7, v2, Lcom/huawei/hms/analytics/bp;->klm:Z

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v8

    iget-object v8, v8, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v8, v8, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    move-object/from16 v9, v22

    invoke-static {v8, v5, v9, v6}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_f

    :goto_d
    invoke-virtual {v2}, Lcom/huawei/hms/analytics/bp;->klm()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_4
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    goto :goto_e

    :cond_f
    :try_start_1a
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v11, v2, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    const-string v10, "onAppLaunch"

    invoke-virtual {v11, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/bp;->ikl()V

    :cond_10
    iget-object v10, v2, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    const-string v11, "onMoveBackgroundPolicy"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_11

    const/4 v10, 0x0

    invoke-static {v10}, Lcom/huawei/hms/analytics/bp;->lmn(Z)V

    :cond_11
    iget-object v10, v2, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    move-object/from16 v11, v21

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_12

    iget-object v10, v2, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    const-wide/16 v12, 0x3c

    invoke-virtual {v10, v11, v12, v13}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v10

    invoke-virtual {v2, v10, v11}, Lcom/huawei/hms/analytics/bp;->klm(J)V

    :cond_12
    iget-object v10, v2, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    move-object/from16 v11, v20

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_14

    iget-object v10, v2, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    const-wide/16 v12, 0x1e

    invoke-virtual {v10, v11, v12, v13}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/huawei/hms/analytics/bp;->lmn(J)V
    :try_end_1a
    .catch Lorg/json/JSONException; {:try_start_1a .. :try_end_1a} :catch_6
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_4
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    goto :goto_e

    :catch_6
    :try_start_1b
    const-string v10, "PoliceCommander"

    const-string v11, "cache policies is error, begin clear it"

    invoke-static {v10, v11}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v5, v9}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_4
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    goto :goto_d

    :cond_13
    const/4 v7, 0x1

    :cond_14
    :goto_e
    :try_start_1c
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_7
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    if-nez v2, :cond_15

    :try_start_1d
    const-string v2, "AGC_TAG"

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_4
    .catchall {:try_start_1d .. :try_end_1d} :catchall_3

    if-eqz v2, :cond_16

    :cond_15
    :try_start_1e
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    move-object/from16 v3, v19

    invoke-static {v2, v5, v3, v6}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_7
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    if-eqz v2, :cond_16

    :try_start_1f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    iget-object v6, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-static {v6, v5, v3, v2}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_4
    .catchall {:try_start_1f .. :try_end_1f} :catchall_3

    :cond_16
    :try_start_20
    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->lmn:Lcom/huawei/hms/analytics/ikl;
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_7
    .catchall {:try_start_20 .. :try_end_20} :catchall_4

    if-eqz v2, :cond_1a

    :try_start_21
    iget-object v2, v2, Lcom/huawei/hms/analytics/ikl;->lmn:Lcom/huawei/hms/analytics/bh;

    if-eqz v2, :cond_1a

    instance-of v3, v2, Lcom/huawei/hms/analytics/ghi;

    if-eqz v3, :cond_1a

    check-cast v2, Lcom/huawei/hms/analytics/ghi;

    iget-object v3, v2, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v6, "isFirstRun"

    const/4 v8, 0x0

    invoke-static {v3, v5, v6, v8}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    iget-object v6, v2, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    invoke-static {v6}, Lcom/huawei/hms/analytics/dg;->ghi(Landroid/content/Context;)Z

    move-result v6
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_4
    .catchall {:try_start_21 .. :try_end_21} :catchall_3

    if-nez v6, :cond_18

    if-nez v3, :cond_17

    goto :goto_f

    :cond_17
    const/4 v11, 0x0

    goto :goto_10

    :cond_18
    :goto_f
    move v11, v7

    :goto_10
    const-string v3, "instanceimpl"

    if-eqz v11, :cond_19

    :try_start_22
    const-string v6, "start to report referrer"

    invoke-static {v3, v6}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->ikl()Lcom/huawei/hms/analytics/cx;

    move-result-object v6

    new-instance v7, Lcom/huawei/hms/analytics/ck;

    iget-object v8, v2, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    invoke-direct {v7, v8, v2}, Lcom/huawei/hms/analytics/ck;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/bh;)V

    invoke-virtual {v6, v7}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_19
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v6

    iget-object v6, v6, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v6, v6, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-eqz v6, :cond_1a

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v6

    iget-object v6, v6, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v7, v6, Lcom/huawei/hms/analytics/at;->klm:Ljava/lang/String;

    iget-object v6, v6, Lcom/huawei/hms/analytics/at;->ikl:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1a

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1a

    const-string v8, "app version changed"

    invoke-static {v3, v8}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v8, "$PrevVersion"

    invoke-virtual {v3, v8, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "$CurrVersion"

    invoke-virtual {v3, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Lcom/huawei/hms/analytics/dj;

    move-object/from16 v7, v18

    invoke-direct {v6, v7, v3}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v2, v7, v6, v8, v9}, Lcom/huawei/hms/analytics/ijk;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_4
    .catchall {:try_start_22 .. :try_end_22} :catchall_3

    :cond_1a
    :try_start_23
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Instance config init success. tag: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_7
    .catchall {:try_start_23 .. :try_end_23} :catchall_4

    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    move-object/from16 v6, v16

    move-object/from16 v3, v17

    invoke-static {v2, v5, v3, v6}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v2

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->efg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/framework/SyncManager;->countDown(Ljava/lang/String;)V

    return-void

    :catch_7
    move-exception v0

    goto/16 :goto_16

    :cond_1b
    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v24

    :try_start_24
    invoke-virtual {v2}, Lcom/huawei/hms/analytics/cde;->lmn()V

    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Config json error, please check collector url from region: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, v1, Lcom/huawei/hms/analytics/hij;->fgh:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_4
    move-exception v0

    goto/16 :goto_14

    :catch_8
    move-exception v0

    :goto_11
    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v24

    goto/16 :goto_17

    :cond_1c
    move-object/from16 v1, p0

    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v24

    move-object/from16 v5, v30

    new-instance v2, Ljava/lang/IllegalAccessException;

    const-string v7, "collect urls check failed"

    invoke-direct {v2, v7}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_5
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_12

    :catch_9
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_13

    :catchall_6
    move-exception v0

    :goto_12
    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v5, v30

    goto :goto_15

    :catch_a
    move-exception v0

    :goto_13
    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v24

    move-object/from16 v5, v30

    goto :goto_17

    :cond_1d
    move-object v5, v15

    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v24

    const-string v2, "jsonParses"

    const-string v7, "CE-001"

    const-string v8, "Cannot find productId from agconnect-services.json"

    invoke-static {v2, v7, v8}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/IllegalAccessException;

    const-string v7, "config params is error"

    invoke-direct {v2, v7}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v2

    :catch_b
    move-exception v0

    move-object v5, v15

    goto :goto_11

    :cond_1e
    move-object v4, v14

    move-object v5, v15

    move-object/from16 v6, v16

    move-object/from16 v3, v17

    new-instance v2, Ljava/lang/IllegalAccessException;

    const-string v7, "options is null"

    invoke-direct {v2, v7}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_c
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    :catch_c
    move-exception v0

    goto :goto_17

    :catchall_7
    move-exception v0

    move-object v5, v15

    :goto_14
    move-object/from16 v6, v16

    move-object/from16 v3, v17

    :goto_15
    move-object v2, v0

    goto :goto_19

    :catch_d
    move-exception v0

    move-object v4, v14

    move-object v5, v15

    :goto_16
    move-object/from16 v6, v16

    move-object/from16 v3, v17

    :goto_17
    move-object v2, v0

    :goto_18
    :try_start_25
    const-string v7, "SE-001"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v1, Lcom/huawei/hms/analytics/hij;->ghi:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " instance config init failed! "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v7, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->klm:Lcom/huawei/hms/analytics/cc;

    if-eqz v2, :cond_1f

    const-string v4, "SE-001:001"

    iput-object v4, v2, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {v2}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_1f
    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/hms/analytics/hij;->lmn(Z)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_8

    iget-object v2, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-static {v2, v5, v3, v6}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v2

    iget-object v3, v1, Lcom/huawei/hms/analytics/hij;->efg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/framework/SyncManager;->countDown(Ljava/lang/String;)V

    return-void

    :catchall_8
    move-exception v0

    goto :goto_15

    :goto_19
    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->ikl:Landroid/content/Context;

    invoke-static {v4, v5, v3, v6}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v3

    iget-object v4, v1, Lcom/huawei/hms/analytics/hij;->efg:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/huawei/hms/analytics/framework/SyncManager;->countDown(Ljava/lang/String;)V

    throw v2
.end method
