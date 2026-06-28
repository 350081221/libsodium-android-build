.class public final Lcom/bytedance/sdk/openadsdk/downloadnew/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# static fields
.field private static volatile a:Lcom/bytedance/sdk/openadsdk/downloadnew/d;


# instance fields
.field private final b:Landroid/content/Context;

.field private c:Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

.field private d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

.field private e:Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

.field private f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

.field private g:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

.field private h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static a(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/downloadnew/d;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a:Lcom/bytedance/sdk/openadsdk/downloadnew/d;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a:Lcom/bytedance/sdk/openadsdk/downloadnew/d;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/sdk/openadsdk/downloadnew/d;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a:Lcom/bytedance/sdk/openadsdk/downloadnew/d;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 6
    :cond_1
    :goto_0
    sget-object p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a:Lcom/bytedance/sdk/openadsdk/downloadnew/d;

    return-object p0
.end method

.method private a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/download/api/model/DeepLink;
    .locals 1

    .line 312
    new-instance v0, Lcom/ss/android/download/api/model/DeepLink;

    invoke-direct {v0}, Lcom/ss/android/download/api/model/DeepLink;-><init>()V

    .line 313
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/download/api/model/DeepLink;->setId(J)V

    .line 314
    invoke-virtual {v0, p3}, Lcom/ss/android/download/api/model/DeepLink;->setOpenUrl(Ljava/lang/String;)V

    .line 315
    invoke-virtual {v0, p4}, Lcom/ss/android/download/api/model/DeepLink;->setWebTitle(Ljava/lang/String;)V

    .line 316
    invoke-virtual {v0, p5}, Lcom/ss/android/download/api/model/DeepLink;->setWebUrl(Ljava/lang/String;)V

    return-object v0
.end method

.method private a(JLjava/lang/String;ZZLjava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;
    .locals 6

    move-object v0, p8

    .line 291
    new-instance v1, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    invoke-direct {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;-><init>()V

    move-wide v2, p1

    .line 292
    invoke-virtual {v1, p1, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAdId(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    move-object v4, p3

    .line 293
    invoke-virtual {v1, p3}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppIcon(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    move v4, p4

    .line 294
    invoke-virtual {v1, p4}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setIsShowNotification(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    move v4, p5

    .line 295
    invoke-virtual {v1, p5}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAutoInstallWithoutNotification(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    move-object v4, p6

    .line 296
    invoke-virtual {v1, p6}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setLogExtra(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    move-object v4, p7

    .line 297
    invoke-virtual {v1, p7}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExtra(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    const/4 v4, 0x1

    .line 298
    invoke-virtual {v1, v4}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDistinctDir(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    .line 299
    invoke-virtual {v1, v4}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setIsAd(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    new-instance v4, Lcom/bytedance/sdk/openadsdk/downloadnew/d$1;

    move-object v5, p0

    invoke-direct {v4, p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d$1;-><init>(Lcom/bytedance/sdk/openadsdk/downloadnew/d;)V

    .line 300
    invoke-virtual {v1, v4}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setFileUriProvider(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 301
    invoke-virtual {v1, p8}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDownloadSettings(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 302
    :cond_0
    invoke-static {p9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p9

    .line 303
    invoke-virtual {v1, p9}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setFilePath(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 304
    :cond_1
    invoke-static/range {p10 .. p10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    move-object/from16 v0, p10

    .line 305
    invoke-virtual {v1, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDownloadUrl(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 306
    :cond_2
    invoke-static/range {p11 .. p11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    move-object/from16 v0, p11

    .line 307
    invoke-virtual {v1, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 308
    :cond_3
    invoke-static/range {p12 .. p12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    move-object/from16 v0, p12

    .line 309
    invoke-virtual {v1, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setPackageName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    :cond_4
    move/from16 v0, p13

    .line 310
    invoke-virtual {v1, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setNeedIndependentProcess(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-object p3, p0

    move-wide p4, p1

    move-object/from16 p6, p14

    move-object/from16 p7, p15

    move-object/from16 p8, p16

    .line 311
    invoke-direct/range {p3 .. p8}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDeepLink(Lcom/ss/android/download/api/model/DeepLink;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    return-object v1
.end method

.method private a(IIZZZ)V
    .locals 1

    .line 320
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;-><init>()V

    .line 321
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setLinkMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object p1

    .line 322
    invoke-virtual {p1, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setDownloadMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 323
    invoke-virtual {p1, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsEnableBackDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 324
    invoke-virtual {p1, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsAddToDownloadManage(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e:Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    if-eqz p3, :cond_0

    .line 325
    invoke-virtual {p1, p4}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAH(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 326
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e:Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    invoke-virtual {p1, p5}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAM(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 327
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e:Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadController;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c:Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    if-nez v0, :cond_0

    return-void

    .line 318
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppIcon(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object p1

    .line 319
    invoke-virtual {p1, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setPackageName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-void
.end method

.method private a(ZLjava/lang/Object;)V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    return-void

    .line 339
    :cond_0
    :try_start_0
    instance-of v1, p2, Lcom/ss/android/download/api/config/DownloadMarketInterceptor;

    if-eqz v1, :cond_1

    .line 340
    check-cast p2, Lcom/ss/android/download/api/config/DownloadMarketInterceptor;

    invoke-virtual {v0, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setDownloadMarketInterceptor(Lcom/ss/android/download/api/config/DownloadMarketInterceptor;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 341
    invoke-virtual {v0, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setDownloadMarketInterceptor(Lcom/ss/android/download/api/config/DownloadMarketInterceptor;)V

    .line 342
    :goto_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    invoke-virtual {p2, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setEnableOppoAutoDownload(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static a(Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method private av()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->getDownloadMode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private b(Ljava/util/Map;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    if-eqz v15, :cond_1

    .line 1
    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v1, "id"

    .line 2
    invoke-interface {v15, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string v3, "appIcon"

    .line 3
    invoke-interface {v15, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "isShowNotification"

    .line 4
    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const-string v5, "isAutoInstallWithoutNotification"

    .line 5
    invoke-interface {v15, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const-string v6, "logExtra"

    .line 6
    invoke-interface {v15, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "extraJson"

    .line 7
    invoke-interface {v15, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    const-string v8, "downloadSettings"

    .line 8
    invoke-interface {v15, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/json/JSONObject;

    const-string v9, "filePath"

    .line 9
    invoke-interface {v15, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const-string v10, "downloadUrl"

    .line 10
    invoke-interface {v15, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const-string v11, "appName"

    .line 11
    invoke-interface {v15, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "packageName"

    .line 12
    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const-string v13, "isNeedIndependentProcess"

    .line 13
    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    const-string v14, "openUrl"

    .line 14
    invoke-interface {v15, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    const-string/jumbo v0, "webTitle"

    .line 15
    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-wide/from16 v17, v1

    move-object v1, v15

    move-object v15, v0

    const-string/jumbo v0, "webUrl"

    .line 16
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/String;

    move-object/from16 v1, p0

    move-object/from16 v0, p0

    move-wide/from16 v1, v17

    .line 17
    invoke-direct/range {v0 .. v16}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(JLjava/lang/String;ZZLjava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c:Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 18
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object v0

    iput-object v0, v1, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-void

    :cond_1
    :goto_0
    move-object v1, v0

    return-void
.end method

.method private c(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadStatusChangeListener;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    return-object p1

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a/e;

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a/e;-><init>(Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private c(Ljava/util/Map;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 5
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v0, "linkMode"

    .line 6
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "downloadMode"

    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "isEnableBackDialog"

    .line 8
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const-string v3, "isAddToDownloadManage"

    .line 9
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v4, "extraOperation"

    .line 10
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "shouldUseNewWebView"

    .line 11
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const-string v5, "interceptFlag"

    .line 12
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const-string v6, "extraJson"

    .line 13
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/json/JSONObject;

    const-string v7, "extraObject"

    .line 14
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "enableShowComplianceDialog"

    .line 15
    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const-string v9, "isAutoDownloadOnCardShow"

    .line 16
    invoke-interface {p1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    const-string v10, "enableNewActivity"

    .line 17
    invoke-interface {p1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    const-string v11, "isEnableAH"

    .line 18
    invoke-interface {p1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    const-string v12, "isEnableAM"

    .line 19
    invoke-interface {p1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    const-string v13, "isEnableOppoAutoDownload"

    .line 20
    invoke-interface {p1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 21
    new-instance v13, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    invoke-direct {v13}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;-><init>()V

    .line 22
    invoke-virtual {v13, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setLinkMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 23
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setDownloadMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 24
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsEnableBackDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 25
    invoke-virtual {v0, v3}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsAddToDownloadManage(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 26
    invoke-virtual {v0, v4}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setShouldUseNewWebView(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 27
    invoke-virtual {v0, v5}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setInterceptFlag(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 28
    invoke-virtual {v0, v6}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setExtraJson(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 29
    invoke-virtual {v0, v7}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setExtraObject(Ljava/lang/Object;)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 30
    invoke-virtual {v0, v8}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableShowComplianceDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 31
    invoke-virtual {v0, v9}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsAutoDownloadOnCardShow(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 32
    invoke-virtual {v0, v10}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableNewActivity(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 33
    invoke-virtual {v0, v11}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAH(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 34
    invoke-virtual {v0, v12}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAM(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 35
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableOppoAutoDownload(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e:Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 36
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadController;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    :cond_1
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadModel;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/ss/android/download/api/download/DownloadModel;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private d(Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 3
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v0, "clickButtonTag"

    .line 4
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "clickItemTag"

    .line 5
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "clickStartLabel"

    .line 6
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "clickContinueLabel"

    .line 7
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "clickPauseLabel"

    .line 8
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "storageDenyLabel"

    .line 9
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "clickInstallLabel"

    .line 10
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "isEnableClickEvent"

    .line 11
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const-string v8, "isEnableV3Event"

    .line 12
    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const-string v9, "extraEventObject"

    .line 13
    invoke-interface {p1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    .line 14
    new-instance v9, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    invoke-direct {v9}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;-><init>()V

    .line 15
    invoke-virtual {v9, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickButtonTag(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 16
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickItemTag(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 17
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickStartLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 18
    invoke-virtual {v0, v3}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickContinueLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 19
    invoke-virtual {v0, v4}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickPauseLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 20
    invoke-virtual {v0, v5}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setStorageDenyLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 21
    invoke-virtual {v0, v6}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickInstallLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 22
    invoke-virtual {v0, v7}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setIsEnableClickEvent(Z)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 23
    invoke-virtual {v0, v8}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setIsEnableV3Event(Z)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->g:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    if-eqz p1, :cond_1

    .line 24
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setExtraEventObject(Ljava/lang/Object;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 25
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->g:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    :cond_2
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/ss/android/download/api/download/DownloadEventConfig;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/ss/android/download/api/download/DownloadEventConfig;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private e(Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_2

    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->size()I

    move-result v2

    if-gtz v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v2, "clickButtonTag"

    .line 4
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "clickItemTag"

    .line 5
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "clickLabel"

    .line 6
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "downloadScene"

    .line 7
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const-string v6, "refer"

    .line 8
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "extraJson"

    .line 9
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    const-string v8, "paramsJson"

    .line 10
    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/json/JSONObject;

    const-string v9, "clickStartLabel"

    .line 11
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const-string v10, "clickContinueLabel"

    .line 12
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const-string v11, "clickPauseLabel"

    .line 13
    invoke-interface {v1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "storageDenyLabel"

    .line 14
    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const-string v13, "clickInstallLabel"

    .line 15
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    const-string v14, "isEnableClickEvent"

    .line 16
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    const-string v15, "isEnableV3Event"

    .line 17
    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    const-string v0, "extraEventObject"

    .line 18
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 19
    new-instance v1, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    invoke-direct {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;-><init>()V

    .line 20
    invoke-virtual {v1, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickButtonTag(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 21
    invoke-virtual {v1, v3}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickItemTag(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 22
    invoke-virtual {v1, v4}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 23
    invoke-virtual {v1, v9}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickStartLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 24
    invoke-virtual {v1, v10}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickContinueLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 25
    invoke-virtual {v1, v11}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickPauseLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 26
    invoke-virtual {v1, v12}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setStorageDenyLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 27
    invoke-virtual {v1, v13}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickInstallLabel(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 28
    invoke-virtual {v1, v14}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setIsEnableClickEvent(Z)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 29
    invoke-virtual {v1, v5}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setDownloadScene(I)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 30
    invoke-virtual {v1, v15}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setIsEnableV3Event(Z)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 31
    invoke-virtual {v1, v6}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setRefer(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 32
    invoke-virtual {v1, v7}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setExtraJson(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    .line 33
    invoke-virtual {v1, v8}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setParamsJson(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v1

    move-object/from16 v2, p0

    iput-object v1, v2, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->g:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    if-eqz v0, :cond_1

    .line 34
    invoke-virtual {v1, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setExtraEventObject(Ljava/lang/Object;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 35
    :cond_1
    iget-object v0, v2, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->g:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    move-result-object v0

    iput-object v0, v2, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    return-void

    :cond_2
    :goto_0
    move-object v2, v0

    return-void
.end method

.method private f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/ss/android/download/api/download/DownloadController;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/ss/android/download/api/download/DownloadController;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private f(I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setDownloadMode(I)V

    return-void
.end method

.method private f(Ljava/util/Map;)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    if-eqz v0, :cond_6

    .line 7
    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v1, "expectFileLength"

    .line 8
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string v3, "md5"

    .line 9
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "extraValue"

    .line 10
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-string v7, "isAd"

    .line 11
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const-string v8, "modelType"

    .line 12
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const-string v9, "clickTrackUrl"

    .line 13
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    const-string v10, "backupUrls"

    .line 14
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    const-string v11, "notificationJumpUrl"

    .line 15
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "mimeType"

    .line 16
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const-string v13, "headers"

    .line 17
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map;

    const-string v14, "isShowToast"

    .line 18
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    const-string v15, "needWifi"

    .line 19
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    const-string v6, "fileName"

    .line 20
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v16, v6

    const-string/jumbo v6, "versionCode"

    .line 21
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move/from16 v17, v6

    const-string/jumbo v6, "versionName"

    .line 22
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v18, v6

    const-string v6, "quickAppModelOpenUrl"

    .line 23
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move/from16 v19, v15

    const-string v15, "quickAppModelExtraData"

    .line 24
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move/from16 v20, v14

    .line 25
    new-instance v14, Lcom/ss/android/download/api/model/d$a;

    invoke-direct {v14}, Lcom/ss/android/download/api/model/d$a;-><init>()V

    invoke-virtual {v14, v6}, Lcom/ss/android/download/api/model/d$a;->a(Ljava/lang/String;)Lcom/ss/android/download/api/model/d$a;

    move-result-object v6

    .line 26
    invoke-virtual {v6, v15}, Lcom/ss/android/download/api/model/d$a;->b(Ljava/lang/String;)Lcom/ss/android/download/api/model/d$a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ss/android/download/api/model/d$a;->a()Lcom/ss/android/download/api/model/d;

    move-result-object v6

    const-string v14, "executorGroup"

    .line 27
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    const-string v15, "startToast"

    .line 28
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v21, v15

    const-string v15, "sdkMonitorScene"

    .line 29
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v22, v15

    const-string v15, "autoInstall"

    .line 30
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    move/from16 v23, v15

    const-string v15, "distinctDir"

    .line 31
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    move/from16 v24, v15

    const-string v15, "enablePause"

    .line 32
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    move/from16 v25, v15

    const-string v15, "id"

    .line 33
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Long;

    move/from16 v26, v14

    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    move-object/from16 v27, v6

    const-string v6, "appIcon"

    .line 34
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v28, v13

    const-string v13, "isShowNotification"

    .line 35
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    move/from16 v29, v13

    const-string v13, "isAutoInstallWithoutNotification"

    .line 36
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    move/from16 v30, v13

    const-string v13, "logExtra"

    .line 37
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    move-object/from16 v31, v12

    const-string v12, "extraJson"

    .line 38
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/json/JSONObject;

    move-object/from16 v32, v12

    const-string v12, "downloadSettings"

    .line 39
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/json/JSONObject;

    move-object/from16 v33, v12

    const-string v12, "filePath"

    .line 40
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v34, v12

    const-string v12, "downloadUrl"

    .line 41
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v35, v12

    const-string v12, "appName"

    .line 42
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v36, v12

    const-string v12, "packageName"

    .line 43
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v37, v12

    const-string v12, "isNeedIndependentProcess"

    .line 44
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    move/from16 v38, v12

    const-string v12, "openUrl"

    .line 45
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v39, v12

    const-string/jumbo v12, "webTitle"

    .line 46
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v40, v12

    const-string/jumbo v12, "webUrl"

    .line 47
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 48
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;-><init>()V

    .line 49
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExpectFileLength(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 50
    invoke-virtual {v0, v3}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setMd5(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 51
    invoke-virtual {v0, v14, v15}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setId(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExtraValue(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 53
    invoke-virtual {v0, v7}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setIsAd(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 54
    invoke-virtual {v0, v8}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setModelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 55
    invoke-virtual {v0, v13}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setLogExtra(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 56
    invoke-virtual {v0, v6}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppIcon(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 57
    invoke-virtual {v0, v10}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setBackupUrls(Ljava/util/List;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 58
    invoke-virtual {v0, v11}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setNotificationJumpUrl(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 59
    invoke-virtual {v0, v9}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setClickTrackUrl(Ljava/util/List;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v1, v31

    .line 60
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setMimeType(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v13, v28

    .line 61
    invoke-virtual {v0, v13}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setHeaders(Ljava/util/Map;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v20

    .line 62
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setIsShowToast(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v29

    .line 63
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setIsShowNotification(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v19

    .line 64
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setNeedWifi(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v6, v16

    .line 65
    invoke-virtual {v0, v6}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setFileName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v17

    .line 66
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setVersionCode(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v6, v18

    .line 67
    invoke-virtual {v0, v6}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setVersionName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v1, v27

    .line 68
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setQuickAppModel(Lcom/ss/android/download/api/model/d;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v30

    .line 69
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAutoInstallWithoutNotification(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v26

    .line 70
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExecutorGroup(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v1, v21

    .line 71
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setStartToast(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v1, v22

    .line 72
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setSdkMonitorScene(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v23

    .line 73
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAutoInstall(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v24

    .line 74
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDistinctDir(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move/from16 v1, v25

    .line 75
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setEnablePause(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    move-object/from16 v1, v32

    .line 76
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExtra(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/downloadnew/d$2;

    move-object/from16 v6, p0

    invoke-direct {v1, v6}, Lcom/bytedance/sdk/openadsdk/downloadnew/d$2;-><init>(Lcom/bytedance/sdk/openadsdk/downloadnew/d;)V

    .line 77
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setFileUriProvider(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v7

    if-eqz v33, :cond_1

    move-object/from16 v0, v33

    .line 78
    invoke-virtual {v7, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDownloadSettings(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 79
    :cond_1
    invoke-static/range {v34 .. v34}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    move-object/from16 v0, v34

    .line 80
    invoke-virtual {v7, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setFilePath(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 81
    :cond_2
    invoke-static/range {v35 .. v35}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    move-object/from16 v0, v35

    .line 82
    invoke-virtual {v7, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDownloadUrl(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 83
    :cond_3
    invoke-static/range {v36 .. v36}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    move-object/from16 v0, v36

    .line 84
    invoke-virtual {v7, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 85
    :cond_4
    invoke-static/range {v37 .. v37}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    move-object/from16 v0, v37

    .line 86
    invoke-virtual {v7, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setPackageName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    :cond_5
    move/from16 v0, v38

    .line 87
    invoke-virtual {v7, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setNeedIndependentProcess(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-object/from16 v0, p0

    move-wide v1, v14

    move-object/from16 v3, v39

    move-object/from16 v4, v40

    move-object v5, v12

    .line 88
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDeepLink(Lcom/ss/android/download/api/model/DeepLink;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 89
    iget-object v0, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c:Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object v0

    iput-object v0, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    :cond_6
    :goto_0
    return-void
.end method

.method private g(Ljava/lang/Object;)Landroid/app/Activity;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroid/app/Activity;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private h(Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/ExitInstallListener;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/bytedance/sdk/openadsdk/downloadnew/core/ExitInstallListener;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/bytedance/sdk/openadsdk/downloadnew/core/ExitInstallListener;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private i(Ljava/lang/Object;)Lcom/ss/android/download/api/config/OnItemClickListener;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/ss/android/download/api/config/OnItemClickListener;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/ss/android/download/api/config/OnItemClickListener;

    return-object p1

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a/g;

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a/g;-><init>(Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private j(Ljava/lang/Object;)Lcom/ss/android/download/api/config/IDownloadButtonClickListener;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    return-object p1

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a/f;

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a/f;-><init>(Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getDownloadScene()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->isEnableClickEvent()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->isEnableV3Event()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public D()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getExtraJson()Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public E()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getParamsJson()Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public F()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getId()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public G()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getMd5()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public H()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getExpectFileLength()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public I()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getExtraValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public J()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getDownloadUrl()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public K()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getBackupUrls()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public L()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getNotificationJumpUrl()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public M()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public N()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getMimeType()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public O()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getHeaders()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public P()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->isShowToast()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public Q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->isShowNotification()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public R()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->isNeedWifi()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public S()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->isInExternalPublicDir()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public T()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->isInExternalPublicDir()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public U()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getFilePath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public V()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getFileName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public W()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->forceWifi()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public X()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getDownloadSettings()Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public Y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->forceHideToast()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public Z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->forceHideNotification()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public a()I
    .locals 1

    .line 328
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 329
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->getLinkMode()I

    move-result v0

    return v0
.end method

.method public a(Lcom/ss/android/download/api/model/d;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 352
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setQuickAppModel(Lcom/ss/android/download/api/model/d;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/util/List;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ss/android/downloadad/api/download/AdDownloadModel;"
        }
    .end annotation

    .line 347
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 348
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setClickTrackUrl(Ljava/util/List;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/util/Map;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ss/android/downloadad/api/download/AdDownloadModel;"
        }
    .end annotation

    .line 349
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 350
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setHeaders(Ljava/util/Map;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Class;ILjava/util/Map;)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v0, p3

    const-string v1, "action_type_button"

    const-string v2, "downloadStatusChangeListener"

    const-string v3, "logExtra"

    const-string v4, "extraJson"

    const-string v5, "downloadMode"

    const-string v7, "packageName"

    const-string v8, "appName"

    const-string v9, "appIcon"

    const-string/jumbo v10, "uri"

    const-string v11, "downloadButtonClickListener"

    const-string v12, "downloadModel"

    const-string v13, "downloadController"

    const-string v14, "downloadEventConfig"

    const-string v15, "hashCode"

    move-object/from16 p1, v2

    const-string v2, "downloadUrl"

    move-object/from16 v16, v12

    const-string v12, "id"

    const/16 v17, 0x0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    return-object v17

    :pswitch_1
    const-string v1, "funnelType"

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 8
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_2
    const-string v1, "isAutoInstallWithoutNotification"

    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 10
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->i(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_3
    const-string v1, "quickAppModelOpenUrl"

    .line 11
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "quickAppModelExtraData"

    .line 12
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 13
    new-instance v2, Lcom/ss/android/download/api/model/d$a;

    invoke-direct {v2}, Lcom/ss/android/download/api/model/d$a;-><init>()V

    invoke-virtual {v2, v1}, Lcom/ss/android/download/api/model/d$a;->a(Ljava/lang/String;)Lcom/ss/android/download/api/model/d$a;

    move-result-object v1

    .line 14
    invoke-virtual {v1, v0}, Lcom/ss/android/download/api/model/d$a;->b(Ljava/lang/String;)Lcom/ss/android/download/api/model/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/d$a;->a()Lcom/ss/android/download/api/model/d;

    move-result-object v0

    .line 15
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Lcom/ss/android/download/api/model/d;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_4
    const-string/jumbo v1, "versionName"

    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 17
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->q(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_5
    const-string/jumbo v1, "versionCode"

    .line 18
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 19
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_6
    const-string v1, "isNeedIndependentProcess"

    .line 20
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 21
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_7
    const-string v1, "fileName"

    .line 22
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 23
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->p(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_8
    const-string v1, "filePath"

    .line 24
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 25
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->o(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_9
    const-string v1, "isShowNotification"

    .line 26
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 27
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->g(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_a
    const-string v1, "headers"

    .line 28
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 29
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Ljava/util/Map;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_b
    const-string v1, "mimeType"

    .line 30
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 31
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->n(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_c
    const-string v1, "notificationJumpUrl"

    .line 32
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 33
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->m(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_d
    const-string v1, "backupUrls"

    .line 34
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 35
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b(Ljava/util/List;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    .line 36
    :pswitch_e
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 37
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->l(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_f
    const-string v1, "clickTrackUrl"

    .line 38
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 39
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Ljava/util/List;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    .line 40
    :pswitch_10
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 41
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->k(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    .line 42
    :pswitch_11
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 43
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->j(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    .line 44
    :pswitch_12
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 45
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->i(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_13
    const-string v1, "modelType"

    .line 46
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 47
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_14
    const-string v1, "isAd"

    .line 48
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 49
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    .line 50
    :pswitch_15
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 51
    invoke-virtual {v6, v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    :pswitch_16
    const-string v1, "sdkMonitorScene"

    .line 52
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 53
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h(Ljava/lang/String;)V

    return-object v17

    :pswitch_17
    const-string v1, "startToast"

    .line 54
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 55
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->g(Ljava/lang/String;)V

    return-object v17

    .line 56
    :pswitch_18
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 57
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Lorg/json/JSONObject;)V

    return-object v17

    .line 58
    :pswitch_19
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 59
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/String;)V

    return-object v17

    :pswitch_1a
    const-string v1, "extraValue"

    .line 60
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 61
    invoke-virtual {v6, v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b(J)V

    return-object v17

    :pswitch_1b
    const-string v1, "needWifi"

    .line 62
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 63
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Z)V

    return-object v17

    :pswitch_1c
    const-string v1, "expectFileLength"

    .line 64
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 65
    invoke-virtual {v6, v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(J)V

    return-object v17

    :pswitch_1d
    const-string v1, "md5"

    .line 66
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 67
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/String;)V

    return-object v17

    .line 68
    :pswitch_1e
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->au()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 69
    :pswitch_1f
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->at()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 70
    :pswitch_20
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->as()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 71
    :pswitch_21
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ar()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 72
    :pswitch_22
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->aq()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 73
    :pswitch_23
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ap()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 74
    :pswitch_24
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ao()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 75
    :pswitch_25
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->an()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 76
    :pswitch_26
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->am()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 77
    :pswitch_27
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->al()Lcom/ss/android/download/api/model/d;

    move-result-object v0

    return-object v0

    .line 78
    :pswitch_28
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ak()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 79
    :pswitch_29
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->aj()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 80
    :pswitch_2a
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ai()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 81
    :pswitch_2b
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ah()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    return-object v0

    .line 82
    :pswitch_2c
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ag()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 83
    :pswitch_2d
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->af()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 84
    :pswitch_2e
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ae()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 85
    :pswitch_2f
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ad()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 86
    :pswitch_30
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ac()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 87
    :pswitch_31
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->ab()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 88
    :pswitch_32
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->aa()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 89
    :pswitch_33
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->Z()V

    return-object v17

    .line 90
    :pswitch_34
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->Y()V

    return-object v17

    .line 91
    :pswitch_35
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->X()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 92
    :pswitch_36
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->W()V

    return-object v17

    .line 93
    :pswitch_37
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->V()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 94
    :pswitch_38
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->U()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 95
    :pswitch_39
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->T()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 96
    :pswitch_3a
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->S()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 97
    :pswitch_3b
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->R()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 98
    :pswitch_3c
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->Q()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 99
    :pswitch_3d
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->P()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 100
    :pswitch_3e
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->O()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 101
    :pswitch_3f
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->N()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 102
    :pswitch_40
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->M()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 103
    :pswitch_41
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->L()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 104
    :pswitch_42
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->K()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 105
    :pswitch_43
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->J()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 106
    :pswitch_44
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->I()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 107
    :pswitch_45
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->H()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 108
    :pswitch_46
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->G()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 109
    :pswitch_47
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->F()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 110
    :pswitch_48
    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/util/Map;)V

    return-object v17

    :pswitch_49
    const-string v1, "quickAppEventTag"

    .line 111
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 112
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Ljava/lang/String;)V

    return-object v17

    :pswitch_4a
    const-string v1, "refer"

    .line 113
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 114
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c(Ljava/lang/String;)V

    return-object v17

    :pswitch_4b
    const-string v1, "clickItemTag"

    .line 115
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 116
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b(Ljava/lang/String;)V

    return-object v17

    :pswitch_4c
    const-string v1, "paramsJson"

    .line 117
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 118
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c(Lorg/json/JSONObject;)V

    return-object v17

    :pswitch_4d
    const-string v1, "eventConfigExtraJson"

    .line 119
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 120
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b(Lorg/json/JSONObject;)V

    return-object v17

    :pswitch_4e
    const-string v1, "clickButtonTag"

    .line 121
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 122
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Ljava/lang/String;)V

    return-object v17

    :pswitch_4f
    const-string v1, "extraEventObject"

    .line 123
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 124
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b(Ljava/lang/Object;)V

    return-object v17

    .line 125
    :pswitch_50
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->E()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 126
    :pswitch_51
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->D()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 127
    :pswitch_52
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->C()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 128
    :pswitch_53
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->B()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 129
    :pswitch_54
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->A()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 130
    :pswitch_55
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->z()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 131
    :pswitch_56
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 132
    :pswitch_57
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 133
    :pswitch_58
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->w()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 134
    :pswitch_59
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->v()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 135
    :pswitch_5a
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 136
    :pswitch_5b
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 137
    :pswitch_5c
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 138
    :pswitch_5d
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 139
    :pswitch_5e
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 140
    :pswitch_5f
    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/util/Map;)V

    return-object v17

    .line 141
    :pswitch_60
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->p()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 142
    :pswitch_61
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 143
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Lorg/json/JSONObject;)V

    return-object v17

    :pswitch_62
    const-string v1, "extraObject"

    .line 144
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 145
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Ljava/lang/Object;)V

    return-object v17

    .line 146
    :pswitch_63
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->o()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 147
    :pswitch_64
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_65
    const-string v1, "enableNewActivity"

    .line 148
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 149
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c(Z)V

    return-object v17

    :pswitch_66
    const-string v1, "isAutoDownloadOnCardShow"

    .line 150
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 151
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b(Z)V

    return-object v17

    .line 152
    :pswitch_67
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->m()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 153
    :pswitch_68
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->l()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_69
    const-string v1, "enableShowComplianceDialog"

    .line 154
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 155
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Z)V

    return-object v17

    .line 156
    :pswitch_6a
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_6b
    const-string v1, "linkMode"

    .line 157
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 158
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(I)V

    return-object v17

    .line 159
    :pswitch_6c
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->j()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 160
    :pswitch_6d
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->i()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 161
    :pswitch_6e
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 162
    :pswitch_6f
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 163
    :pswitch_70
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 164
    :pswitch_71
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 165
    :pswitch_72
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 166
    :pswitch_73
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 167
    :pswitch_74
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 168
    :pswitch_75
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 169
    :pswitch_76
    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c(Ljava/util/Map;)V

    return-object v17

    :pswitch_77
    const-string v1, "isShowToast"

    .line 170
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 171
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Z)V

    return-object v17

    :pswitch_78
    const-string v1, "downloadScene"

    .line 172
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 173
    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b(I)V

    return-object v17

    .line 174
    :pswitch_79
    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Ljava/util/Map;)V

    return-object v17

    :pswitch_7a
    const-string v1, "isEnableOppoAutoDownload"

    .line 175
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "downloadMarketInterceptor"

    .line 176
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 177
    invoke-direct {v6, v1, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(ZLjava/lang/Object;)V

    return-object v17

    .line 178
    :pswitch_7b
    invoke-direct/range {p0 .. p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->av()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 179
    :pswitch_7c
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 180
    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(I)V

    return-object v17

    :pswitch_7d
    const-string v1, "autoOpen"

    .line 181
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 182
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "isHaveDownloadSdkConfig"

    .line 183
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v4, "isEnableAH"

    .line 184
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const-string v5, "isEnableAM"

    .line 185
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object/from16 v0, p0

    .line 186
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(IIZZZ)V

    return-object v17

    .line 187
    :pswitch_7e
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 188
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 189
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 190
    invoke-direct {v6, v1, v2, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v17

    :pswitch_7f
    const-string v1, "mateIsEmpty"

    .line 191
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 192
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;-><init>()V

    iput-object v0, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c:Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 193
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object v0

    iput-object v0, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    return-object v17

    .line 194
    :cond_0
    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b(Ljava/util/Map;)V

    return-object v17

    .line 195
    :pswitch_80
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v1, :cond_1

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getId()J

    move-result-wide v0

    .line 196
    :goto_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ss/android/downloadlib/i;->e()Lcom/ss/android/downloadad/api/b;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/ss/android/downloadad/api/b;->a(J)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 197
    :pswitch_81
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v1, :cond_2

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getId()J

    move-result-wide v1

    .line 198
    :goto_1
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 199
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ss/android/downloadlib/i;->e()Lcom/ss/android/downloadad/api/b;

    move-result-object v3

    invoke-interface {v3, v1, v2, v0}, Lcom/ss/android/downloadad/api/b;->a(JI)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 200
    :pswitch_82
    iget-object v3, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v3, :cond_3

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    :goto_2
    move-object/from16 v19, v2

    .line 201
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    .line 202
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v22

    .line 203
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v1, :cond_4

    .line 204
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v1

    goto :goto_3

    .line 205
    :cond_4
    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v1

    :goto_3
    move-object/from16 v23, v1

    .line 206
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v1, :cond_5

    .line 207
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v1

    goto :goto_4

    .line 208
    :cond_5
    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v1

    :goto_4
    move-object/from16 v24, v1

    const-string v1, "itemClickListener"

    .line 209
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->i(Ljava/lang/Object;)Lcom/ss/android/download/api/config/OnItemClickListener;

    move-result-object v25

    .line 210
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->j(Ljava/lang/Object;)Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    move-result-object v26

    .line 211
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v26}, Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V

    return-object v17

    .line 212
    :pswitch_83
    iget-object v3, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v3, :cond_6

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    :goto_5
    move-object/from16 v19, v2

    .line 213
    iget-object v2, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v2, :cond_7

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_6

    :cond_7
    invoke-virtual {v2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getId()J

    move-result-wide v2

    :goto_6
    move-wide/from16 v20, v2

    .line 214
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v22

    .line 215
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v1, :cond_8

    .line 216
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v1

    goto :goto_7

    .line 217
    :cond_8
    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v1

    :goto_7
    move-object/from16 v23, v1

    .line 218
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v1, :cond_9

    .line 219
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v0

    goto :goto_8

    .line 220
    :cond_9
    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v0

    :goto_8
    move-object/from16 v24, v0

    .line 221
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v24}, Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    return-object v17

    .line 222
    :pswitch_84
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 223
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(Landroid/net/Uri;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 224
    :pswitch_85
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v1, :cond_a

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_9

    :cond_a
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getId()J

    move-result-wide v1

    :goto_9
    move-wide v9, v1

    .line 225
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v1, :cond_b

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_a

    :cond_b
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v1

    :goto_a
    move-object v11, v1

    .line 226
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 227
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/i;->e()Lcom/ss/android/downloadad/api/b;

    move-result-object v7

    iget-object v8, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    const/4 v12, 0x0

    invoke-interface/range {v7 .. v13}, Lcom/ss/android/downloadad/api/b;->a(Landroid/content/Context;JLjava/lang/String;Lcom/ss/android/download/api/download/DownloadStatusChangeListener;I)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 228
    :pswitch_86
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v26

    const-string v1, "isDisableDialog"

    .line 229
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v21

    const-string/jumbo v1, "userAgent"

    .line 230
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v20, v1

    check-cast v20, Ljava/lang/String;

    .line 231
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v1, :cond_c

    move-object/from16 v2, v16

    .line 232
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v1

    goto :goto_b

    .line 233
    :cond_c
    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v1

    :goto_b
    move-object/from16 v22, v1

    .line 234
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v1, :cond_d

    .line 235
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v1

    goto :goto_c

    .line 236
    :cond_d
    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v1

    :goto_c
    move-object/from16 v23, v1

    .line 237
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v1, :cond_e

    .line 238
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v1

    goto :goto_d

    .line 239
    :cond_e
    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v1

    :goto_d
    move-object/from16 v24, v1

    move-object/from16 v1, p1

    .line 240
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    move-result-object v25

    .line 241
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->j(Ljava/lang/Object;)Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    move-result-object v27

    .line 242
    invoke-static/range {v27 .. v27}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 243
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/i;->e()Lcom/ss/android/downloadad/api/b;

    move-result-object v18

    iget-object v0, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    move-object/from16 v19, v0

    invoke-interface/range {v18 .. v27}, Lcom/ss/android/downloadad/api/b;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadStatusChangeListener;ILcom/ss/android/download/api/config/IDownloadButtonClickListener;)Landroid/app/Dialog;

    return-object v17

    .line 244
    :cond_f
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/i;->e()Lcom/ss/android/downloadad/api/b;

    move-result-object v18

    iget-object v0, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    move-object/from16 v19, v0

    invoke-interface/range {v18 .. v26}, Lcom/ss/android/downloadad/api/b;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadStatusChangeListener;I)Landroid/app/Dialog;

    return-object v17

    :pswitch_87
    move-object/from16 v2, v16

    .line 245
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    .line 246
    iget-object v3, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v3, :cond_10

    .line 247
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v6, v2}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v2

    goto :goto_e

    .line 248
    :cond_10
    invoke-direct {v6, v3}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v2

    .line 249
    :goto_e
    iget-object v3, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v3, :cond_11

    .line 250
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v6, v3}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v3

    goto :goto_f

    .line 251
    :cond_11
    invoke-direct {v6, v3}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->e(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v3

    .line 252
    :goto_f
    iget-object v4, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v4, :cond_12

    .line 253
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v6, v4}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v4

    goto :goto_10

    .line 254
    :cond_12
    invoke-direct {v6, v4}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v4

    .line 255
    :goto_10
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->j(Ljava/lang/Object;)Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    move-result-object v20

    .line 256
    invoke-static/range {v20 .. v20}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 257
    iget-object v15, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    invoke-static/range {v15 .. v20}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(Landroid/content/Context;Landroid/net/Uri;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 258
    :cond_13
    iget-object v0, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(Landroid/content/Context;Landroid/net/Uri;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_88
    const-string v1, "downloadPath"

    .line 259
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 260
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(Ljava/lang/String;)V

    return-object v17

    .line 261
    :pswitch_89
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "onEventLogHandler"

    .line 262
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTDownloadAdapter$OnEventLogHandler;

    .line 263
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(ILcom/bytedance/sdk/openadsdk/downloadnew/core/ITTDownloadAdapter$OnEventLogHandler;)V

    return-object v17

    .line 264
    :pswitch_8a
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v1, :cond_14

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_11

    :cond_14
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v1

    :goto_11
    const-string v2, "force"

    .line 265
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 266
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;Z)V

    return-object v17

    .line 267
    :pswitch_8b
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->b()V

    return-object v17

    .line 268
    :pswitch_8c
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v1, :cond_15

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_12

    :cond_15
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    .line 269
    :goto_12
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_8d
    move-object/from16 v1, p1

    move-object/from16 v2, v16

    .line 270
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 271
    iget-object v4, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v4, :cond_16

    .line 272
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v6, v2}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v2

    goto :goto_13

    .line 273
    :cond_16
    invoke-direct {v6, v4}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v2

    .line 274
    :goto_13
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->c(Ljava/lang/Object;)Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    move-result-object v0

    .line 275
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v1

    iget-object v4, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    invoke-virtual {v1, v4, v3, v0, v2}, Lcom/ss/android/downloadlib/i;->a(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V

    return-object v17

    .line 276
    :pswitch_8e
    iget-object v1, v6, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v1, :cond_17

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_14

    :cond_17
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v1

    .line 277
    :goto_14
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 278
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;I)V

    return-object v17

    :pswitch_8f
    const-string v1, "hid"

    .line 279
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 280
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(I)V

    return-object v17

    :pswitch_90
    :try_start_0
    const-string v1, "tagIntercept"

    .line 281
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "label"

    .line 282
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "meta"

    .line 283
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 284
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1, v2, v3, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 285
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    .line 286
    :pswitch_91
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/i;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_92
    const-string v1, "activity"

    .line 287
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->g(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v1

    const-string v2, "exitInstallListener"

    .line 288
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h(Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/ExitInstallListener;

    move-result-object v0

    .line 289
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/downloadnew/core/ExitInstallListener;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_92
        :pswitch_91
        :pswitch_90
        :pswitch_8f
        :pswitch_8e
        :pswitch_8d
        :pswitch_8c
        :pswitch_8b
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_0
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_0
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_0
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public a(I)V
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    return-void

    .line 331
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setLinkMode(I)V

    return-void
.end method

.method public a(J)V
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 346
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setExpectFileLength(J)V

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 0

    .line 290
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a(Landroid/content/Context;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    return-void

    .line 335
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setExtraObject(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    return-void

    .line 344
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->setClickButtonTag(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    return-void

    .line 337
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setExtraJson(Lorg/json/JSONObject;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    return-void

    .line 333
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setEnableShowComplianceDialog(Z)V

    return-void
.end method

.method public aa()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->needIndependentProcess()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ab()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getVersionCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ac()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getVersionName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ad()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->isAd()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ae()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getLogExtra()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public af()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getPackageName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getAppIcon()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ah()Lcom/ss/android/download/api/model/DeepLink;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ai()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getClickTrackUrl()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public aj()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getExtra()Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ak()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getModelType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public al()Lcom/ss/android/download/api/model/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public am()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->autoInstallWithoutNotification()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public an()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->X()Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/downloader/g/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->N()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lcom/ss/android/download/api/c/b;->a(Lcom/ss/android/socialbase/downloader/g/a;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->shouldDownloadWithPatchApply()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public ao()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getExecutorGroup()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ap()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getFunnelType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public aq()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getStartToast()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public ar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getStartToast()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public as()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->isAutoInstall()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public at()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->distinctDir()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public au()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->enablePause()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b(Ljava/util/List;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ss/android/downloadad/api/download/AdDownloadModel;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 34
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setBackupUrls(Ljava/util/List;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public b(I)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    return-void

    .line 30
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->setDownloadScene(I)V

    return-void
.end method

.method public b(J)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setExtraValue(J)V

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    return-void

    .line 24
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->setExtraEventObject(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    return-void

    .line 28
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->setClickItemTag(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    return-void

    .line 26
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->setExtraJson(Lorg/json/JSONObject;)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setIsAutoDownloadOnCardShow(Z)V

    return-void
.end method

.method public b()Z
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->isEnableBackDialog()Z

    move-result v0

    return v0
.end method

.method public c(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 48
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setModelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public c(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 46
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setId(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    return-void

    .line 44
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->setRefer(Ljava/lang/String;)V

    return-void
.end method

.method public c(Lorg/json/JSONObject;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->setParamsJson(Lorg/json/JSONObject;)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    return-void

    .line 40
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->setEnableNewActivity(Z)V

    return-void
.end method

.method public c()Z
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 38
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->isAddToDownloadManage()Z

    move-result v0

    return v0
.end method

.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const-class p1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-interface {p2, v1, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    if-eqz p2, :cond_1

    .line 20
    .line 21
    const-class v0, Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {p2, v1, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {p2, v1, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ljava/util/Map;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance p2, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {p0, p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Ljava/lang/Class;ILjava/util/Map;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public d(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 35
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setVersionCode(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 27
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->getExtraClickOperation()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    return-void

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->setQuickAppEventTag(Ljava/lang/String;)V

    return-void
.end method

.method public d(Lorg/json/JSONObject;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 33
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setExtra(Lorg/json/JSONObject;)V

    return-void
.end method

.method public d(Z)V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 31
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setNeedWifi(Z)V

    return-void
.end method

.method public e(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 43
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setFunnelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 39
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setMd5(Ljava/lang/String;)V

    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 41
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setIsShowToast(Z)V

    return-void
.end method

.method public e()Z
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 37
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->isEnableMultipleDownload()Z

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->getDowloadChunkCount()I

    move-result v0

    return v0
.end method

.method public f(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 93
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setIsAd(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 91
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setAppName(Ljava/lang/String;)V

    return-void
.end method

.method public g(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setIsShowNotification(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setStartToast(Ljava/lang/String;)V

    return-void
.end method

.method public g()Z
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->shouldUseNewWebView()Z

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->getInterceptFlag()I

    move-result v0

    return v0
.end method

.method public h(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setNeedIndependentProcess(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setSdkMonitorScene(Ljava/lang/String;)V

    return-void
.end method

.method public i(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setLogExtra(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public i(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setAutoInstallWithoutNotification(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public i()Lorg/json/JSONObject;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->getExtraJson()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public j(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setPackageName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->getExtraObject()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public k(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setAppIcon(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->enableShowComplianceDialog()Z

    move-result v0

    return v0
.end method

.method public l(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setDownloadUrl(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->isAutoDownloadOnCardShow()Z

    move-result v0

    return v0
.end method

.method public m(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setNotificationJumpUrl(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->enableNewActivity()Z

    move-result v0

    return v0
.end method

.method public n(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setMimeType(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->enableAH()Z

    move-result v0

    return v0
.end method

.method public o(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setFilePath(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->enableAM()Z

    move-result v0

    return v0
.end method

.method public p(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setFileName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->f:Lcom/ss/android/downloadad/api/download/AdDownloadController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController;->enableOppoAutoDownload()Z

    move-result v0

    return v0
.end method

.method public q(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->d:Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setVersionName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object p1

    return-object p1
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getRefer()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getClickButtonTag()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getClickItemTag()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getClickLabel()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getClickStartLabel()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getClickPauseLabel()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 3

    .line 1
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-boolean v1, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->b:Z

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v1, 0x2710

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    invoke-virtual {v0, v1, v2}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getClickPauseLabel()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getClickInstallLabel()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public y()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getStorageDenyLabel()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public z()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->h:Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;->getExtraEventObject()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
