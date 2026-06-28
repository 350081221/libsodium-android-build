.class public Lcom/umeng/pagesdk/PageConfigManger;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APM_FPSPERF_COLLECT_INTERVAL:Ljava/lang/String; = "apm_pageperf_collect_interval"

.field public static final APM_FPSPERF_COLLECT_INTERVAL_TOGETHER:Ljava/lang/String; = "apm_pageperf_collect_interval_together"

.field public static final APM_FPSPERF_COLLECT_MAX_PERIOD_SEC:Ljava/lang/String; = "apm_pageperf_collect_max_period_sec"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:Lcom/efs/sdk/base/EfsReporter;

.field private d:I

.field private final e:I

.field private f:I

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 19

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "PageConfigManager"

    iput-object v1, v0, Lcom/umeng/pagesdk/PageConfigManger;->a:Ljava/lang/String;

    const/16 v2, 0x64

    iput v2, v0, Lcom/umeng/pagesdk/PageConfigManger;->d:I

    const/4 v3, 0x0

    iput v3, v0, Lcom/umeng/pagesdk/PageConfigManger;->e:I

    iput-boolean v3, v0, Lcom/umeng/pagesdk/PageConfigManger;->g:Z

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    iput-object v4, v0, Lcom/umeng/pagesdk/PageConfigManger;->b:Landroid/content/Context;

    move-object/from16 v5, p2

    iput-object v5, v0, Lcom/umeng/pagesdk/PageConfigManger;->c:Lcom/efs/sdk/base/EfsReporter;

    const-string v5, "efs_page"

    invoke-virtual {v4, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v6, "apm_pageperf_sampling_rate_last"

    if-eqz v4, :cond_0

    invoke-interface {v4, v6, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v0, Lcom/umeng/pagesdk/PageConfigManger;->f:I

    :cond_0
    iget-object v4, v0, Lcom/umeng/pagesdk/PageConfigManger;->b:Landroid/content/Context;

    invoke-virtual {v4, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v7, "apm_pageperf_sampling_rate"

    const/4 v8, -0x1

    if-eqz v4, :cond_1

    invoke-interface {v4, v7, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    goto :goto_0

    :cond_1
    move v4, v8

    :goto_0
    iget-object v9, v0, Lcom/umeng/pagesdk/PageConfigManger;->c:Lcom/efs/sdk/base/EfsReporter;

    const-string v10, "apm_pageperf_collect_interval_together"

    const-string v11, "apm_pageperf_collect_max_period_sec"

    const-string v12, "apm_pageperf_collect_interval"

    filled-new-array {v7, v12, v10, v11}, [Ljava/lang/String;

    move-result-object v7

    new-instance v10, Lcom/umeng/pagesdk/PageConfigManger$1;

    invoke-direct {v10, v0}, Lcom/umeng/pagesdk/PageConfigManger$1;-><init>(Lcom/umeng/pagesdk/PageConfigManger;)V

    invoke-virtual {v9, v7, v10}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V

    if-eq v4, v8, :cond_2

    iput v4, v0, Lcom/umeng/pagesdk/PageConfigManger;->d:I

    :cond_2
    invoke-static {}, Lcom/efs/sdk/base/samplingwhitelist/SamplingWhiteListUtil;->isHitWL()Z

    move-result v4

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    goto/16 :goto_9

    :cond_3
    iget-object v4, v0, Lcom/umeng/pagesdk/PageConfigManger;->b:Landroid/content/Context;

    invoke-virtual {v4, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v8, "03f870871950c148387b251894ed3e88"

    const-wide/16 v9, 0x0

    if-eqz v4, :cond_4

    invoke-interface {v4, v8, v9, v10}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    goto :goto_1

    :cond_4
    move-wide v11, v9

    :goto_1
    const-string v13, "8f2f54c08600aa25915617fa1371441b"

    if-eqz v4, :cond_5

    invoke-interface {v4, v13, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v14

    goto :goto_2

    :cond_5
    move v14, v3

    :goto_2
    iget v15, v0, Lcom/umeng/pagesdk/PageConfigManger;->d:I

    if-nez v15, :cond_8

    if-eqz v14, :cond_6

    if-eqz v4, :cond_6

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v1, v13, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_6
    cmp-long v1, v11, v9

    if-eqz v1, :cond_7

    if-eqz v4, :cond_7

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-interface {v1, v8, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_7
    :goto_3
    move v7, v3

    goto/16 :goto_9

    :cond_8
    iget v4, v0, Lcom/umeng/pagesdk/PageConfigManger;->f:I

    if-eq v15, v4, :cond_9

    move v4, v7

    goto :goto_4

    :cond_9
    move v4, v3

    :goto_4
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iget v10, v0, Lcom/umeng/pagesdk/PageConfigManger;->d:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    sub-long v15, v15, v17

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-wide/32 v15, 0x5265c00

    if-eqz v14, :cond_a

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    cmp-long v12, v17, v15

    if-gez v12, :cond_a

    if-nez v4, :cond_a

    sget-boolean v2, Lcom/umeng/pagesdk/PageManger;->isDebug:Z

    if-eqz v2, :cond_13

    const-string v2, "check in page rate. check in allready."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_9

    :cond_a
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    cmp-long v9, v17, v15

    if-gez v9, :cond_c

    if-eqz v4, :cond_b

    goto :goto_5

    :cond_b
    sget-boolean v2, Lcom/umeng/pagesdk/PageManger;->isDebug:Z

    if-eqz v2, :cond_7

    const-string v2, "check in page rate. un repeat check in 24 hour!"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_c
    :goto_5
    if-eqz v10, :cond_e

    if-ne v10, v2, :cond_d

    :goto_6
    move v2, v7

    goto :goto_7

    :cond_d
    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    invoke-virtual {v4, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    if-gt v2, v10, :cond_e

    goto :goto_6

    :cond_e
    move v2, v3

    :goto_7
    if-eqz v2, :cond_f

    sget-boolean v2, Lcom/umeng/pagesdk/PageManger;->isDebug:Z

    if-eqz v2, :cond_11

    const-string v2, "check in page rate. random check in"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :cond_f
    sget-boolean v2, Lcom/umeng/pagesdk/PageManger;->isDebug:Z

    if-eqz v2, :cond_10

    const-string v2, "check in page rate. random not check in!"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_10
    move v7, v3

    :cond_11
    :goto_8
    iget-object v1, v0, Lcom/umeng/pagesdk/PageConfigManger;->b:Landroid/content/Context;

    invoke-virtual {v1, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-interface {v2, v13, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_12
    if-eqz v1, :cond_13

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_13

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-interface {v1, v8, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_13
    :goto_9
    iput-boolean v7, v0, Lcom/umeng/pagesdk/PageConfigManger;->g:Z

    iget-object v1, v0, Lcom/umeng/pagesdk/PageConfigManger;->b:Landroid/content/Context;

    invoke-virtual {v1, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_14

    iget v2, v0, Lcom/umeng/pagesdk/PageConfigManger;->d:I

    invoke-interface {v1, v6, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_14
    return-void
.end method

.method static synthetic a(Lcom/umeng/pagesdk/PageConfigManger;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/umeng/pagesdk/PageConfigManger;->b:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public enableTracer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/umeng/pagesdk/PageConfigManger;->g:Z

    return v0
.end method
