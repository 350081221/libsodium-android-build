.class public final Lcom/umeng/cconfig/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static declared-synchronized a(Lcom/umeng/cconfig/b/c;Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 7

    const-class v0, Lcom/umeng/cconfig/b/e;

    monitor-enter v0

    const/4 v1, 0x0

    if-eqz p0, :cond_4

    if-eqz p1, :cond_4

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    new-instance v4, Lcom/umeng/cconfig/b/a;

    invoke-direct {v4}, Lcom/umeng/cconfig/b/a;-><init>()V

    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getUMId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    iput-object v5, v4, Lcom/umeng/cconfig/b/a;->i:Ljava/lang/String;

    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    :try_start_2
    iput-object v5, v4, Lcom/umeng/cconfig/b/a;->h:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v4, Lcom/umeng/cconfig/b/a;->l:Ljava/lang/Long;

    iget-object v5, p0, Lcom/umeng/cconfig/b/c;->c:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lcom/umeng/cconfig/b/a;->j:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/umeng/cconfig/b/c;->d:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lcom/umeng/cconfig/b/a;->k:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/umeng/cconfig/b/c;->a:Ljava/lang/String;

    iput-object v5, v4, Lcom/umeng/cconfig/b/a;->m:Ljava/lang/String;

    iget-object p0, p0, Lcom/umeng/cconfig/b/c;->b:Ljava/lang/String;

    iput-object p0, v4, Lcom/umeng/cconfig/b/a;->n:Ljava/lang/String;

    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    sget-object v1, Lcom/umeng/cconfig/b/a;->a:Ljava/lang/String;

    iget-object v6, v4, Lcom/umeng/cconfig/b/a;->h:Ljava/lang/String;

    invoke-virtual {p0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/umeng/cconfig/b/a;->e:Ljava/lang/String;

    iget-object v6, v4, Lcom/umeng/cconfig/b/a;->l:Ljava/lang/Long;

    invoke-virtual {p0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/umeng/cconfig/b/a;->c:Ljava/lang/String;

    iget-object v6, v4, Lcom/umeng/cconfig/b/a;->j:Ljava/lang/Integer;

    invoke-virtual {p0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/umeng/cconfig/b/a;->d:Ljava/lang/String;

    iget-object v6, v4, Lcom/umeng/cconfig/b/a;->k:Ljava/lang/Integer;

    invoke-virtual {p0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/umeng/cconfig/b/a;->b:Ljava/lang/String;

    iget-object v6, v4, Lcom/umeng/cconfig/b/a;->i:Ljava/lang/String;

    invoke-virtual {p0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/umeng/cconfig/b/a;->f:Ljava/lang/String;

    iget-object v6, v4, Lcom/umeng/cconfig/b/a;->m:Ljava/lang/String;

    invoke-virtual {p0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/umeng/cconfig/b/a;->g:Ljava/lang/String;

    iget-object v4, v4, Lcom/umeng/cconfig/b/a;->n:Ljava/lang/String;

    invoke-virtual {p0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v5, v2, p0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    invoke-static {p1}, Lcom/umeng/cconfig/b/e;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    move v1, v3

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-gt v1, v4, :cond_2

    add-int/lit8 v4, v1, -0x1

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :try_start_4
    invoke-static {p1}, Lcom/umeng/cconfig/a/c;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string p1, "abtest_sp_last_request_data"

    const-string v1, ""

    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    :cond_3
    monitor-exit v0

    return-object v5

    :catch_1
    :try_start_5
    const-string p0, "jessie"

    new-array p1, v3, [Ljava/lang/Object;

    const-string v1, "[getUpdateAbEventLogParam] error i"

    aput-object v1, p1, v2

    invoke-static {p0, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object v1, v5

    goto :goto_3

    :catch_2
    move-object v1, v5

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_3
    :goto_1
    :try_start_6
    const-string p0, "jessie"

    new-array p1, v3, [Ljava/lang/Object;

    const-string v3, "[getUpdateAbEventLogParam] error ii"

    aput-object v3, p1, v2

    invoke-static {p0, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_3

    :goto_2
    monitor-exit v0

    throw p0

    :cond_4
    :goto_3
    monitor-exit v0

    return-object v1
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 7

    const-class v0, Lcom/umeng/cconfig/b/e;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Lcom/umeng/cconfig/b/b;

    invoke-direct {v4}, Lcom/umeng/cconfig/b/b;-><init>()V

    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getUMId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_0

    monitor-exit v0

    return-object v3

    :cond_0
    :try_start_1
    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->n:Ljava/lang/String;

    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_1

    monitor-exit v0

    return-object v3

    :cond_1
    :try_start_2
    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->o:Ljava/lang/String;

    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->p:Ljava/lang/String;

    const-string v5, "9.3.3"

    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->q:Ljava/lang/String;

    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->r:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->s:Ljava/lang/String;

    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->t:Ljava/lang/String;

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->u:Ljava/lang/String;

    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getLocaleInfo(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v5

    aget-object v6, v5, v2

    iput-object v6, v4, Lcom/umeng/cconfig/b/b;->v:Ljava/lang/String;

    aget-object v5, v5, v1

    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->y:Ljava/lang/String;

    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getResolutionArray(Landroid/content/Context;)[I

    move-result-object v5

    aget v6, v5, v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v4, Lcom/umeng/cconfig/b/b;->x:Ljava/lang/Integer;

    aget v5, v5, v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lcom/umeng/cconfig/b/b;->w:Ljava/lang/Integer;

    const-string v5, "install_datetime"

    const-string v6, ""

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0, v5, v6}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :goto_0
    iput-object v6, v4, Lcom/umeng/cconfig/b/b;->z:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    sget-object v3, Lcom/umeng/cconfig/b/b;->a:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->n:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->c:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->p:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->b:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->o:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->d:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->q:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->e:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->r:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->f:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->s:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->g:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->t:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->h:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->u:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->k:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->x:Ljava/lang/Integer;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->j:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->w:Ljava/lang/Integer;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->l:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->y:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->i:Ljava/lang/String;

    iget-object v5, v4, Lcom/umeng/cconfig/b/b;->v:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v3, Lcom/umeng/cconfig/b/b;->m:Ljava/lang/String;

    iget-object v4, v4, Lcom/umeng/cconfig/b/b;->z:Ljava/lang/String;

    invoke-virtual {p0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-object p0

    :catch_0
    move-object v3, p0

    goto :goto_1

    :catch_1
    move-object v3, p0

    :catch_2
    :try_start_5
    const-string p0, "jessie"

    new-array v4, v2, [Ljava/lang/Object;

    const-string v5, "[getCloudConfigParam] error i"

    aput-object v5, v4, v1

    invoke-static {p0, v4}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :catch_3
    :goto_1
    :try_start_6
    const-string p0, "jessie"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v4, "[getCloudConfigParam] error ii"

    aput-object v4, v2, v1

    invoke-static {p0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_2
    monitor-exit v0

    return-object v3

    :goto_3
    monitor-exit v0

    throw p0
.end method

.method private static b(Landroid/content/Context;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-static {p0}, Lcom/umeng/cconfig/a/c;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v1, "abtest_sp_last_request_data"

    const-string v2, ""

    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v1, :cond_1

    :try_start_1
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p0, :cond_1

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_1
    return-object v0
.end method
