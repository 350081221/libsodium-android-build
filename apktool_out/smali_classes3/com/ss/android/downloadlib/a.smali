.class public Lcom/ss/android/downloadlib/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadad/api/a;
.implements Lcom/ss/android/socialbase/appdownloader/b$c;
.implements Lcom/ss/android/socialbase/downloader/a/a$a;
.implements Lcom/ss/android/socialbase/downloader/depend/ag;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/a$a;,
        Lcom/ss/android/downloadlib/a$b;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String; = "a"

.field private static volatile d:Lcom/ss/android/downloadlib/a;


# instance fields
.field private b:J

.field private c:Lcom/ss/android/downloadlib/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/b;->a(Lcom/ss/android/socialbase/appdownloader/b$c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/ss/android/socialbase/downloader/a/a;->a()Lcom/ss/android/socialbase/downloader/a/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a$a;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lorg/json/JSONObject;)I
    .locals 5

    .line 179
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    .line 180
    invoke-static {v0, p2}, Lcom/ss/android/socialbase/appdownloader/c;->b(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)I

    move-result v0

    .line 181
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p3}, Lcom/ss/android/downloadlib/g/m;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-lez v0, :cond_1

    if-lez v1, :cond_1

    if-eq v0, v1, :cond_1

    if-le v1, v0, :cond_0

    const/16 p1, 0xbc3

    goto :goto_0

    :cond_0
    const/16 p1, 0xbc2

    :goto_0
    return p1

    .line 182
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "install_finish_check_ttmd5"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v2, :cond_4

    .line 183
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sp_ttdownloader_md5"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 184
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 185
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    .line 186
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTargetFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/downloadlib/g/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 187
    :cond_2
    invoke-static {p3}, Lcom/ss/android/downloadlib/g/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/ss/android/downloadlib/g/a;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    :try_start_0
    const-string p2, "ttmd5_status"

    .line 188
    invoke-virtual {p4, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    if-nez p1, :cond_3

    const/16 p1, 0xbb8

    return p1

    :cond_3
    if-ne p1, v2, :cond_4

    const/16 p1, 0xbba

    return p1

    :cond_4
    const/16 p1, 0xbb9

    return p1
.end method

.method public static a()Lcom/ss/android/downloadlib/a;
    .locals 2

    .line 2
    sget-object v0, Lcom/ss/android/downloadlib/a;->d:Lcom/ss/android/downloadlib/a;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/ss/android/downloadlib/a;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/a;->d:Lcom/ss/android/downloadlib/a;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/ss/android/downloadlib/a;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/a;-><init>()V

    sput-object v1, Lcom/ss/android/downloadlib/a;->d:Lcom/ss/android/downloadlib/a;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/downloadlib/a;->d:Lcom/ss/android/downloadlib/a;

    return-object v0
.end method

.method private static a(Ljava/util/List;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 98
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 99
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-nez v1, :cond_2

    goto :goto_0

    .line 100
    :cond_2
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v1

    .line 101
    :cond_3
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTargetFilePath()Ljava/lang/String;

    move-result-object v2

    .line 102
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2, p1}, Lcom/ss/android/downloadlib/g/m;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_4
    :goto_1
    return-object v0
.end method

.method private a(Lcom/ss/android/downloadad/api/a/b;Ljava/lang/String;I)Lorg/json/JSONObject;
    .locals 10

    .line 235
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 236
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v1

    const-string v2, "scene"

    .line 237
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, v2, p3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 238
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result p3

    invoke-static {v0, p3}, Lcom/ss/android/downloadlib/g/f;->a(Lorg/json/JSONObject;I)V

    .line 239
    invoke-static {p1, v0}, Lcom/ss/android/downloadlib/g/f;->a(Lcom/ss/android/downloadad/api/a/b;Lorg/json/JSONObject;)V

    const-string p3, "is_update_download"

    .line 240
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->V()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-virtual {v0, p3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p3, "install_after_back_app"

    .line 241
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->ab()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-virtual {v0, p3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p3, "clean_space_install_params"

    .line 242
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->R()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "1"

    goto :goto_2

    :cond_2
    const-string v2, "2"

    :goto_2
    invoke-virtual {v0, p3, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 p3, 0x0

    if-eqz v1, :cond_5

    .line 243
    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/a;->a(Lorg/json/JSONObject;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "uninstall_resume_count"

    .line 244
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUninstallResumeCount()I

    move-result v5

    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 245
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->C()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-lez v2, :cond_4

    .line 246
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->C()J

    move-result-wide v7

    sub-long/2addr v5, v7

    const-string v2, "install_time"

    .line 247
    invoke-virtual {v0, v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 248
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v2

    const-string v7, "check_install_finish_expired_duration"

    const-wide/32 v8, 0x5265c00

    invoke-virtual {v2, v7, v8, v9}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;J)J

    move-result-wide v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v2, v5, v7

    const-string v5, "install_expired"

    if-lez v2, :cond_3

    .line 249
    :try_start_2
    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_3

    .line 250
    :cond_3
    invoke-virtual {v0, v5, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 251
    :catchall_0
    :cond_4
    :goto_3
    :try_start_3
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempCacheData()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    const-string v5, "ah_attempt"

    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v2, v5}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 252
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 253
    invoke-static {v2}, Lcom/ss/android/socialbase/appdownloader/a;->a(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/a;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 254
    invoke-virtual {v2, v0}, Lcom/ss/android/socialbase/appdownloader/a;->a(Lorg/json/JSONObject;)V

    .line 255
    :cond_5
    invoke-direct {p0, p1, v1, p2, v0}, Lcom/ss/android/downloadlib/a;->a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result p1

    const-string p2, "fail_status"

    .line 256
    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 p2, 0xbb8

    const-string v1, "hijack"

    if-ne p1, p2, :cond_6

    .line 257
    :try_start_4
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_4

    :cond_6
    const/16 p2, 0xbb9

    if-ne p1, p2, :cond_7

    .line 258
    invoke-virtual {v0, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_4

    .line 259
    :cond_7
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    .line 260
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_4
    return-object v0
.end method

.method public static a(Lorg/json/JSONObject;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lorg/json/JSONObject;
    .locals 9

    if-eqz p0, :cond_10

    if-nez p1, :cond_0

    goto/16 :goto_c

    .line 103
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "download_event_opt"

    const/4 v2, 0x1

    .line 104
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    :try_start_0
    const-string v0, "download_id"

    .line 105
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "name"

    .line 106
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "cur_bytes"

    .line 107
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v3

    invoke-virtual {p0, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "total_bytes"

    .line 108
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    invoke-virtual {p0, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "network_quality"

    .line 109
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getNetworkQuality()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/k;->a()Lcom/ss/android/socialbase/downloader/network/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/k;->b()Lcom/ss/android/socialbase/downloader/network/l;

    move-result-object v0

    const-string v1, "current_network_quality"

    .line 111
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "only_wifi"

    .line 112
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isOnlyWifi()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_0
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "need_https_degrade"

    .line 113
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedHttpsToHttpRetry()Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "https_degrade_retry_used"

    .line 114
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isHttpsToHttpRetryUsed()Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_2

    :cond_4
    move v1, v3

    :goto_2
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "chunk_count"

    .line 115
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "retry_count"

    .line 116
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "cur_retry_time"

    .line 117
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurRetryTime()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "need_retry_delay"

    .line 118
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedRetryDelay()Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v2

    goto :goto_3

    :cond_5
    move v1, v3

    :goto_3
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "backup_url_used"

    .line 119
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isBackUpUrlUsed()Z

    move-result v1

    if-eqz v1, :cond_6

    move v1, v2

    goto :goto_4

    :cond_6
    move v1, v3

    :goto_4
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "head_connection_error_msg"

    .line 120
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getHeadConnectionException()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getHeadConnectionException()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_7
    const-string v1, ""

    :goto_5
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "need_independent_process"

    .line 121
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedIndependentProcess()Z

    move-result v1

    if-eqz v1, :cond_8

    move v1, v2

    goto :goto_6

    :cond_8
    move v1, v3

    :goto_6
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "total_retry_count"

    .line 122
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalRetryCount()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "cur_retry_time_in_total"

    .line 123
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurRetryTimeInTotal()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "real_download_time"

    .line 124
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealDownloadTime()J

    move-result-wide v4

    invoke-virtual {p0, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "first_speed_time"

    .line 125
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getFirstSpeedTime()J

    move-result-wide v4

    invoke-virtual {p0, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "all_connect_time"

    .line 126
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getAllConnectTime()J

    move-result-wide v4

    invoke-virtual {p0, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "download_prepare_time"

    .line 127
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDownloadPrepareTime()J

    move-result-wide v4

    invoke-virtual {p0, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "download_time"

    .line 128
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealDownloadTime()J

    move-result-wide v4

    .line 129
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getAllConnectTime()J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDownloadPrepareTime()J

    move-result-wide v6

    add-long/2addr v4, v6

    .line 130
    invoke-virtual {p0, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "chunk_downgrade_retry_used"

    .line 131
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkDowngradeRetryUsed()Z

    move-result v1

    if-eqz v1, :cond_9

    move v1, v2

    goto :goto_7

    :cond_9
    move v1, v3

    :goto_7
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "need_chunk_downgrade_retry"

    .line 132
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedChunkDowngradeRetry()Z

    move-result v1

    if-eqz v1, :cond_a

    move v1, v2

    goto :goto_8

    :cond_a
    move v1, v3

    :goto_8
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "failed_resume_count"

    .line 133
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getFailedResumeCount()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 134
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getPreconnectLevel()I

    move-result v0

    const-string v1, "preconnect_level"

    .line 135
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "md5"

    .line 136
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMd5()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "expect_file_length"

    .line 137
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v4

    invoke-virtual {p0, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "retry_schedule_count"

    .line 138
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryScheduleCount()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "rw_concurrent"

    .line 139
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isRwConcurrent()Z

    move-result v1

    if-eqz v1, :cond_b

    move v1, v2

    goto :goto_9

    :cond_b
    move v1, v3

    :goto_9
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 140
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v4, 0x4130000000000000L    # 1048576.0

    div-double/2addr v0, v4

    .line 141
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealDownloadTime()J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    const-wide/16 v6, 0x0

    cmpl-double v8, v0, v6

    if-lez v8, :cond_c

    cmpl-double v6, v4, v6

    if-lez v6, :cond_c

    div-double/2addr v0, v4

    :try_start_1
    const-string v4, "download_speed"

    .line 142
    invoke-virtual {p0, v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :catch_0
    :try_start_2
    sget-object v4, Lcom/ss/android/downloadlib/a;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "download speed : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, "MB/s"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    :cond_c
    :try_start_3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    .line 145
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->isDownloadServiceForeground(I)Z

    move-result v0

    const-string v1, "is_download_service_foreground"

    if-eqz v0, :cond_d

    move v3, v2

    .line 146
    :cond_d
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_a

    :catch_1
    move-exception v0

    .line 147
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 148
    :goto_a
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrls()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_e

    const-string v0, "backup_url_count"

    .line 149
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrls()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "cur_backup_url_index"

    .line 150
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBackUpUrlIndex()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_e
    const-string v0, "clear_space_restart_times"

    .line 151
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/c/d;->a()Lcom/ss/android/downloadlib/addownload/c/d;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ss/android/downloadlib/addownload/c/d;->b(Ljava/lang/String;)I

    move-result v1

    .line 152
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "mime_type"

    .line 153
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "network_available"

    .line 154
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/f;->c(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_b

    :cond_f
    const/4 v2, 0x2

    :goto_b
    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "status_code"

    .line 155
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getHttpStatusCode()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 156
    invoke-static {p0, p1}, Lcom/ss/android/downloadlib/a;->b(Lorg/json/JSONObject;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_c

    :catchall_0
    move-exception p1

    .line 157
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_10
    :goto_c
    return-object p0
.end method

.method private static a(Lcom/ss/android/downloadad/api/a/b;)V
    .locals 9

    if-nez p0, :cond_0

    return-void

    .line 158
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/a/b;->P()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/a/b;->P()Ljava/lang/String;

    move-result-object v0

    .line 159
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v2

    .line 160
    invoke-virtual {p0, v1}, Lcom/ss/android/downloadad/api/a/b;->l(Ljava/lang/String;)V

    .line 161
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 162
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/a;->a(Lorg/json/JSONObject;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v3, 0x1

    :try_start_0
    const-string v4, "finish_reason"

    .line 163
    invoke-virtual {v1, v4, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "finish_from_reserve_wifi"

    .line 164
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloadFromReserveWifi()Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 165
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 166
    :goto_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/a/b;

    move-result-object v0

    .line 167
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v4

    invoke-static {v1, v4}, Lcom/ss/android/downloadlib/g/f;->a(Lorg/json/JSONObject;I)V

    :try_start_1
    const-string v4, "download_failed_times"

    .line 168
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->x()I

    move-result v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "can_show_notification"

    .line 169
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e/d;->a()Z

    move-result v5

    const/4 v6, 0x2

    if-eqz v5, :cond_3

    move v5, v3

    goto :goto_3

    :cond_3
    move v5, v6

    :goto_3
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 170
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v4

    const-wide/16 v7, 0x0

    cmp-long v4, v4, v7

    if-lez v4, :cond_4

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v4

    cmp-long v4, v4, v7

    if-lez v4, :cond_4

    .line 171
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v4

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v7

    sub-long/2addr v4, v7

    const-string v7, "file_length_gap"

    .line 172
    invoke-virtual {v1, v7, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_4
    const-string v4, "ttmd5_status"

    .line 173
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTTMd5CheckStatus()I

    move-result v2

    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "has_send_download_failed_finally"

    .line 174
    iget-object v4, v0, Lcom/ss/android/downloadad/api/a/b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v3

    goto :goto_4

    :cond_5
    move v4, v6

    :goto_4
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "is_update_download"

    .line 175
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->V()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    move v3, v6

    :goto_5
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 176
    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/g/f;->a(Lcom/ss/android/downloadad/api/a/b;Lorg/json/JSONObject;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    .line 177
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 178
    :goto_6
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    const-string v2, "download_finish"

    invoke-virtual {v0, v2, v1, p0}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/a;Ljava/util/concurrent/ConcurrentHashMap;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ss/android/downloadlib/a;->a(Ljava/util/concurrent/ConcurrentHashMap;I)V

    return-void
.end method

.method public static declared-synchronized a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadad/api/a/b;)V
    .locals 14
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    const-class v0, Lcom/ss/android/downloadlib/a;

    monitor-enter v0

    if-nez p0, :cond_0

    .line 8
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p0

    const-string p1, "onDownloadFinish info null"

    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto/16 :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 10
    :try_start_1
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p0

    const-string p1, "onDownloadFinish nativeModel null"

    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    monitor-exit v0

    return-void

    .line 12
    :cond_1
    :try_start_2
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->G()I

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    .line 13
    monitor-exit v0

    return-void

    .line 14
    :cond_2
    :try_start_3
    invoke-static {}, Lcom/ss/android/downloadlib/c/h;->a()Lcom/ss/android/downloadlib/c/h;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ss/android/downloadlib/c/h;->d(Lcom/ss/android/downloadad/api/a/b;)V

    .line 15
    invoke-static {p0, p1}, Lcom/ss/android/downloadlib/a;->c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadad/api/a/b;)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v3

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Lcom/ss/android/downloadlib/addownload/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v3

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Lcom/ss/android/downloadad/api/a/b;->f(J)V

    const/4 v4, 0x2

    .line 19
    invoke-virtual {p1, v4}, Lcom/ss/android/downloadad/api/a/b;->e(I)V

    .line 20
    invoke-virtual {p1, v1}, Lcom/ss/android/downloadad/api/a/b;->b(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v3, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Ljava/util/Collection;)V

    .line 23
    invoke-static {p1}, Lcom/ss/android/downloadlib/a;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 24
    invoke-static {}, Lcom/ss/android/downloadlib/g;->a()Lcom/ss/android/downloadlib/g;

    move-result-object v3

    invoke-virtual {v3, p0, v1}, Lcom/ss/android/downloadlib/g;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V

    const-string v3, "application/vnd.android.package-archive"

    .line 25
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 26
    invoke-static {p1}, Lcom/ss/android/downloadlib/g/e;->a(Lcom/ss/android/downloadad/api/a/a;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v3

    const-string v4, "enable_app_install_receiver"

    invoke-virtual {v3, v4, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v3

    if-eq v3, v2, :cond_3

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "enable_app_install_receiver"

    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    if-eq v3, v2, :cond_3

    .line 27
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/l;->a()Lcom/ss/android/downloadlib/addownload/l;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/ss/android/downloadlib/addownload/l;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 28
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/a;->a()Lcom/ss/android/downloadlib/a;

    move-result-object v2

    invoke-virtual {v2, p0, p1}, Lcom/ss/android/downloadlib/a;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadad/api/a/b;)V

    .line 29
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->L()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 30
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/a/a;->a()Lcom/ss/android/downloadlib/addownload/a/a;

    move-result-object v3

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v6

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->l()J

    move-result-wide v8

    .line 31
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->d()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTargetFilePath()Ljava/lang/String;

    move-result-object v13

    move-object v10, v1

    .line 32
    invoke-virtual/range {v3 .. v13}, Lcom/ss/android/downloadlib/addownload/a/a;->a(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    :cond_4
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v2, v3, p1, v1}, Lcom/ss/android/downloadlib/addownload/e/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;JLjava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    :cond_5
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0

    throw p0
.end method

.method private a(Ljava/util/concurrent/ConcurrentHashMap;I)V
    .locals 9
    .param p1    # Ljava/util/concurrent/ConcurrentHashMap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Long;",
            "Lcom/ss/android/downloadad/api/a/b;",
            ">;I)V"
        }
    .end annotation

    .line 193
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 194
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 195
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/downloadad/api/a/b;

    .line 196
    iget-object v4, v3, Lcom/ss/android/downloadad/api/a/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    const-string v5, "start_event_expire_hours"

    const/16 v6, 0xa8

    if-eqz v4, :cond_1

    .line 197
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->H()J

    move-result-wide v7

    sub-long v7, v1, v7

    .line 198
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v4

    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v4

    invoke-virtual {v4, v5, v6}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x3c

    mul-int/lit8 v4, v4, 0x3c

    mul-int/lit16 v4, v4, 0x3e8

    int-to-long v4, v4

    cmp-long v4, v7, v4

    if-ltz v4, :cond_0

    .line 199
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 200
    :cond_1
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->G()I

    move-result v4

    const/4 v7, 0x1

    if-ne v4, v7, :cond_2

    .line 201
    invoke-direct {p0, v3}, Lcom/ss/android/downloadlib/a;->b(Lcom/ss/android/downloadad/api/a/b;)I

    move-result v4

    if-gtz v4, :cond_0

    .line 202
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->H()J

    move-result-wide v7

    sub-long v7, v1, v7

    .line 203
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v4

    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v4

    invoke-virtual {v4, v5, v6}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x3c

    mul-int/lit8 v4, v4, 0x3c

    mul-int/lit16 v4, v4, 0x3e8

    int-to-long v4, v4

    cmp-long v4, v7, v4

    if-ltz v4, :cond_0

    .line 204
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 205
    :cond_2
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->G()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_8

    .line 206
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->Y()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_0

    .line 207
    :cond_3
    invoke-static {v3}, Lcom/ss/android/downloadlib/g/m;->b(Lcom/ss/android/downloadad/api/a/b;)Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_5

    .line 208
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->K()I

    move-result v4

    if-ne v4, v5, :cond_4

    .line 209
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->K()I

    move-result p2

    :cond_4
    const/4 v4, 0x0

    .line 210
    invoke-virtual {v3, v4}, Lcom/ss/android/downloadad/api/a/b;->j(Z)V

    .line 211
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4, p2}, Lcom/ss/android/downloadlib/a;->a(Lcom/ss/android/downloadad/api/a/b;Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v4

    .line 212
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v5

    invoke-virtual {v5, v4, v3}, Lcom/ss/android/downloadlib/d/a;->a(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/b;)V

    .line 213
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    invoke-static {v3}, Lcom/ss/android/downloadlib/addownload/c/d;->a(Lcom/ss/android/downloadad/api/a/b;)V

    goto/16 :goto_0

    .line 215
    :cond_5
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->Y()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->K()I

    move-result v4

    if-ne v4, v5, :cond_6

    if-ne p2, v7, :cond_6

    invoke-static {v3}, Lcom/ss/android/downloadlib/g/m;->b(Lcom/ss/android/downloadad/api/a/b;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 216
    invoke-static {}, Lcom/ss/android/downloadlib/g/l;->a()Lcom/ss/android/downloadlib/g/l;

    move-result-object v4

    sget-object v5, Lcom/ss/android/downloadlib/a;->a:Ljava/lang/String;

    const-string v6, "trySendAndRefreshAdEvent"

    const-string v7, "\u547d\u4e2d\u515c\u5e95\u903b\u8f91,\u5c1d\u8bd5\u5bf9\u5e7f\u64ad\u76d1\u542c\u6267\u884c\u51b7\u542f\u515c\u5e95\u903b\u8f91"

    invoke-virtual {v4, v5, v6, v7}, Lcom/ss/android/downloadlib/g/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    invoke-static {}, Lcom/ss/android/downloadlib/h;->a()Lcom/ss/android/downloadlib/h;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/ss/android/downloadlib/h;->a(Lcom/ss/android/downloadad/api/a/b;)V

    goto/16 :goto_0

    .line 218
    :cond_6
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->H()J

    move-result-wide v4

    sub-long v4, v1, v4

    .line 219
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v7

    invoke-static {v7}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v7

    const-string v8, "finish_event_expire_hours"

    invoke-virtual {v7, v8, v6}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v6

    mul-int/lit8 v6, v6, 0x3c

    mul-int/lit8 v6, v6, 0x3c

    mul-int/lit16 v6, v6, 0x3e8

    int-to-long v6, v6

    cmp-long v4, v4, v6

    if-ltz v4, :cond_7

    .line 220
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 221
    :cond_7
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 222
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 223
    :cond_8
    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 224
    :cond_9
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Ljava/util/List;)V

    return-void
.end method

.method private b(Lcom/ss/android/downloadad/api/a/b;)I
    .locals 9

    .line 16
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "download_failed_finally_hours"

    const-wide/high16 v2, 0x4048000000000000L    # 48.0

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;D)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    const/4 v3, -0x1

    if-gtz v2, :cond_0

    return v3

    .line 17
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 18
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->H()J

    move-result-wide v6

    sub-long/2addr v4, v6

    long-to-double v4, v4

    const-wide/high16 v6, 0x404e000000000000L    # 60.0

    mul-double/2addr v0, v6

    mul-double/2addr v0, v6

    const-wide v6, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v6

    cmpg-double v0, v4, v0

    const/4 v1, 0x1

    if-gez v0, :cond_1

    return v1

    .line 19
    :cond_1
    iget-object v0, p1, Lcom/ss/android/downloadad/api/a/b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    return v2

    .line 20
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    if-nez v0, :cond_3

    return v3

    .line 21
    :cond_3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    move-result v4

    const/4 v5, -0x3

    if-eq v4, v5, :cond_9

    const/4 v5, -0x4

    if-ne v4, v5, :cond_4

    goto/16 :goto_1

    .line 22
    :cond_4
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/constants/DownloadStatus;->isDownloading(I)Z

    move-result v3

    if-eqz v3, :cond_5

    return v1

    .line 23
    :cond_5
    iget-object v3, p1, Lcom/ss/android/downloadad/api/a/b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 24
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 25
    invoke-static {v3, v0}, Lcom/ss/android/downloadlib/a;->a(Lorg/json/JSONObject;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lorg/json/JSONObject;

    const-string v5, "download_status"

    .line 26
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "fail_status"

    .line 27
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->E()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "fail_msg"

    .line 28
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "download_failed_times"

    .line 29
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->x()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 30
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-lez v4, :cond_6

    const-string v4, "download_percent"

    .line 31
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v5

    long-to-double v5, v5

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v7

    long-to-double v7, v7

    div-double/2addr v5, v7

    invoke-virtual {v3, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    :cond_6
    const-string v0, "is_update_download"

    .line 32
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->V()Z

    move-result v4

    if-eqz v4, :cond_7

    move v4, v1

    goto :goto_0

    :cond_7
    const/4 v4, 0x2

    :goto_0
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 33
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->j()Ljava/lang/String;

    move-result-object v4

    const-string v5, "download_failed_finally"

    invoke-virtual {v0, v4, v5, v3, p1}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    .line 34
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Lcom/ss/android/downloadad/api/a/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    :catchall_0
    move-exception p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_8
    return v1

    :cond_9
    :goto_1
    return v3
.end method

.method private b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/a;)Lorg/json/JSONObject;
    .locals 3
    .param p1    # Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 36
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/a/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 37
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 38
    invoke-virtual {p2, v1}, Lcom/ss/android/socialbase/appdownloader/a;->a(Lorg/json/JSONObject;)V

    :try_start_0
    const-string p2, "download_id"

    .line 39
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v1, p2, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "name"

    .line 40
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    .line 41
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    :goto_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-static {v1, p1}, Lcom/ss/android/downloadlib/g/f;->a(Lorg/json/JSONObject;I)V

    .line 43
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    const-string p2, "embeded_ad"

    const-string v2, "ah_result"

    invoke-virtual {p1, p2, v2, v1, v0}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    return-object v1
.end method

.method public static b(Lorg/json/JSONObject;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lorg/json/JSONObject;
    .locals 13

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "download_event_opt"

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    const-wide/16 v0, 0x0

    .line 3
    :try_start_0
    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/g/m;->b(J)J

    move-result-wide v2

    const-string v4, "available_space"

    long-to-double v5, v2

    const-wide/high16 v7, 0x4130000000000000L    # 1048576.0

    div-double v9, v5, v7

    .line 4
    invoke-virtual {p0, v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 5
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v9

    const-string p1, "apk_size"

    long-to-double v11, v9

    div-double v7, v11, v7

    .line 6
    invoke-virtual {p0, p1, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    cmp-long p1, v2, v0

    if-lez p1, :cond_2

    cmp-long p1, v9, v0

    if-lez p1, :cond_2

    const-string p1, "available_space_ratio"

    div-double/2addr v5, v11

    .line 7
    invoke-virtual {p0, p1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadad/api/a/b;)Ljava/lang/String;
    .locals 4
    .param p0    # Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/ss/android/downloadad/api/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 3
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/c;->a()I

    move-result v3

    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    :cond_0
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 8
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    const-string v1, "real_package_name"

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "input_package_name"

    .line 10
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    :goto_1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p0

    const-string v1, "embeded_ad"

    const-string v3, "package_name_error"

    invoke-virtual {p0, v1, v3, v0, p1}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    return-object v2

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getPackageName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/a;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 8

    .line 189
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 190
    iget-wide v2, p0, Lcom/ss/android/downloadlib/a;->b:J

    sub-long v2, v0, v2

    const-wide/32 v4, 0x1d4c0

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    return-void

    .line 191
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/d;->a()Lcom/ss/android/downloadlib/d;

    move-result-object v2

    new-instance v3, Lcom/ss/android/downloadlib/a$a;

    invoke-direct {v3, p0, p1}, Lcom/ss/android/downloadlib/a$a;-><init>(Lcom/ss/android/downloadlib/a;I)V

    iget-wide v4, p0, Lcom/ss/android/downloadlib/a;->b:J

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-lez p1, :cond_1

    const-wide/16 v4, 0x7d0

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x1f40

    :goto_0
    invoke-virtual {v2, v3, v4, v5}, Lcom/ss/android/downloadlib/d;->a(Ljava/lang/Runnable;J)V

    .line 192
    iput-wide v0, p0, Lcom/ss/android/downloadlib/a;->b:J

    return-void
.end method

.method public a(J)V
    .locals 5

    .line 77
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/b/f;->d(J)Lcom/ss/android/downloadad/api/a/b;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 78
    invoke-static {p1}, Lcom/ss/android/downloadlib/g/m;->b(Lcom/ss/android/downloadad/api/a/b;)Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p1, Lcom/ss/android/downloadad/api/a/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    .line 79
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/d;->a()Lcom/ss/android/downloadlib/addownload/b/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ss/android/downloadlib/addownload/b/d;->b(Lcom/ss/android/downloadad/api/a/b;)Landroid/util/Pair;

    move-result-object p2

    const/4 v0, -0x1

    if-eqz p2, :cond_1

    .line 80
    iget-object v1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lcom/ss/android/downloadlib/addownload/b/d$a;

    .line 81
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    .line 82
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/d;->a()Lcom/ss/android/downloadlib/addownload/b/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ss/android/downloadlib/addownload/b/d;->a(Lcom/ss/android/downloadad/api/a/b;)Lcom/ss/android/downloadlib/addownload/b/d$a;

    move-result-object v1

    move p2, v0

    :goto_0
    if-nez v1, :cond_2

    return-void

    .line 83
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/d;->a()Lcom/ss/android/downloadlib/addownload/b/d;

    move-result-object v2

    iget-object v3, v1, Lcom/ss/android/downloadlib/addownload/b/d$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/ss/android/downloadlib/addownload/b/d;->b(Ljava/lang/String;)V

    .line 84
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "installed_app_name"

    .line 85
    iget-object v4, v1, Lcom/ss/android/downloadlib/addownload/b/d$a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "installed_pkg_name"

    .line 86
    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/d$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eq p2, v0, :cond_3

    const-string v0, "error_code"

    .line 87
    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 88
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result p2

    invoke-static {v2, p2}, Lcom/ss/android/downloadlib/g/f;->a(Lorg/json/JSONObject;I)V

    .line 89
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p2

    const-string v0, "install_finish_hijack"

    invoke-virtual {p2, v0, v2, p1}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    goto :goto_2

    .line 90
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p2

    const-string v0, "install_finish_may_hijack"

    invoke-virtual {p2, v0, v2, p1}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_4
    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 91
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p2

    const-string v0, "trySendInstallFinishHijack"

    invoke-virtual {p2, p1, v0}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public a(JI)V
    .locals 4

    .line 73
    invoke-static {p3}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p3

    const-string v0, "check_install_finish_hijack_delay_time"

    const-wide/32 v1, 0xdbba0

    .line 74
    invoke-virtual {p3, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-gez p3, :cond_0

    return-void

    :cond_0
    const-wide/32 v2, 0x493e0

    .line 75
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 76
    invoke-static {}, Lcom/ss/android/downloadlib/d;->a()Lcom/ss/android/downloadlib/d;

    move-result-object p3

    new-instance v2, Lcom/ss/android/downloadlib/a$2;

    invoke-direct {v2, p0, p1, p2}, Lcom/ss/android/downloadlib/a$2;-><init>(Lcom/ss/android/downloadlib/a;J)V

    invoke-virtual {p3, v2, v0, v1}, Lcom/ss/android/downloadlib/d;->a(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;JJJJJZ)V
    .locals 10

    move-object v0, p1

    move-wide v1, p2

    .line 261
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/a/b;

    move-result-object v3

    if-nez v3, :cond_0

    .line 262
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object v0

    const-string v1, "trySendClearSpaceEvent nativeModel null"

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    return-void

    .line 263
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "space_before"

    long-to-double v6, v1

    const-wide/high16 v8, 0x4130000000000000L    # 1048576.0

    div-double/2addr v6, v8

    .line 264
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "space_cleaned"

    sub-long v1, p4, v1

    long-to-double v1, v1

    div-double/2addr v1, v8

    .line 265
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "clean_up_time_cost"

    .line 266
    invoke-static/range {p8 .. p9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "is_download_restarted"

    if-eqz p12, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 267
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "byte_required"

    .line 268
    invoke-static/range {p6 .. p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "byte_required_after"

    sub-long v5, p6, p4

    long-to-double v5, v5

    div-double/2addr v5, v8

    .line 269
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "clear_sleep_time"

    .line 270
    invoke-static/range {p10 .. p11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 271
    invoke-static {p1, v4}, Lcom/ss/android/downloadlib/g/f;->c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lorg/json/JSONObject;)V

    .line 272
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    const-string v1, "cleanup"

    invoke-virtual {v0, v1, v4, v3}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 273
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    return-void
.end method

.method a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadad/api/a/b;I)V
    .locals 11

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_2

    .line 63
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/a;->d()V

    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 65
    invoke-virtual {p2, v4, v5}, Lcom/ss/android/downloadad/api/a/b;->b(J)V

    .line 66
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    const-wide/16 v1, -0x1

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/g/m;->a(Ljava/io/File;J)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/ss/android/downloadad/api/a/b;->g(J)V

    const/16 v0, 0x7d0

    if-eq p3, v0, :cond_1

    const-wide/16 v0, 0x7d0

    :goto_0
    move-wide v8, v0

    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "check_install_failed_delay_time"

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gez v2, :cond_2

    return-void

    :cond_2
    const-wide/16 v2, 0x7530

    .line 68
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_0

    .line 69
    :goto_1
    new-instance v10, Lcom/ss/android/downloadlib/a$b;

    invoke-virtual {p2}, Lcom/ss/android/downloadad/api/a/b;->b()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    const/4 v7, 0x0

    move-object v0, v10

    move v6, p3

    invoke-direct/range {v0 .. v7}, Lcom/ss/android/downloadlib/a$b;-><init>(JIJILcom/ss/android/downloadlib/a$1;)V

    .line 70
    invoke-static {}, Lcom/ss/android/downloadlib/d;->a()Lcom/ss/android/downloadlib/d;

    move-result-object p1

    invoke-virtual {p1, v10, v8, v9}, Lcom/ss/android/downloadlib/d;->a(Ljava/lang/Runnable;J)V

    .line 71
    iput-object v10, p0, Lcom/ss/android/downloadlib/a;->c:Lcom/ss/android/downloadlib/a$b;

    .line 72
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Lcom/ss/android/downloadad/api/a/b;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/a;)V
    .locals 3

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 225
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "ah_report_config"

    .line 226
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/g/a;->e(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 227
    iget v1, p2, Lcom/ss/android/socialbase/appdownloader/a;->b:I

    if-eqz v1, :cond_1

    .line 228
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempCacheData()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    const-string v2, "intent"

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz v0, :cond_2

    .line 229
    invoke-direct {p0, p1, p2}, Lcom/ss/android/downloadlib/a;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/a;)Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 230
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempCacheData()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    const-string v0, "ah_ext_json"

    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 231
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    const-string p2, "info is null"

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    return-void

    .line 232
    :cond_0
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/g/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p2

    const-string v0, "check_applink_mode"

    invoke-virtual {p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result p2

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    .line 233
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempCacheData()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    const-string v0, "ah_ext_json"

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/json/JSONObject;

    .line 234
    invoke-static {}, Lcom/ss/android/downloadlib/b/e;->a()Lcom/ss/android/downloadlib/b/e;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/a$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/downloadlib/a$4;-><init>(Lcom/ss/android/downloadlib/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/b/e;->b(Lcom/ss/android/downloadlib/b/d;)V

    :cond_1
    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 6
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    monitor-enter p0

    .line 35
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 36
    monitor-exit p0

    return-void

    .line 37
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/ss/android/downloadlib/g/m;->b()Z

    move-result v0

    if-nez v0, :cond_7

    .line 38
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Ljava/lang/String;)Lcom/ss/android/downloadad/api/a/b;

    move-result-object v0

    if-nez v0, :cond_1

    .line 39
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/d;->a()Lcom/ss/android/downloadlib/addownload/b/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/b/d;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    monitor-exit p0

    return-void

    .line 41
    :cond_1
    :try_start_2
    invoke-static {}, Lcom/ss/android/downloadlib/g;->a()Lcom/ss/android/downloadlib/g;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ss/android/downloadlib/g;->a(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/e;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 42
    invoke-virtual {v1}, Lcom/ss/android/downloadlib/addownload/e;->f()V

    .line 43
    :cond_2
    iget-object v1, v0, Lcom/ss/android/downloadad/api/a/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    .line 44
    monitor-exit p0

    return-void

    .line 45
    :cond_3
    :try_start_3
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v1

    const-string v2, "notification_opt_2"

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    .line 46
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/b;->a()Lcom/ss/android/socialbase/downloader/notification/b;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/notification/b;->f(I)V

    .line 47
    :cond_4
    new-instance v1, Lcom/ss/android/downloadlib/b/b;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/b/b;-><init>()V

    .line 48
    invoke-static {v0}, Lcom/ss/android/downloadlib/g/e;->a(Lcom/ss/android/downloadad/api/a/a;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v3

    const-string v4, "try_applink_delay_after_installed"

    const/4 v5, 0x0

    .line 49
    invoke-virtual {v3, v4, v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v3

    .line 50
    new-instance v4, Lcom/ss/android/downloadlib/a$1;

    invoke-direct {v4, p0, v0, p1}, Lcom/ss/android/downloadlib/a$1;-><init>(Lcom/ss/android/downloadlib/a;Lcom/ss/android/downloadad/api/a/b;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v4, v3}, Lcom/ss/android/downloadlib/b/b;->a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/b/g;I)V

    .line 51
    invoke-static {}, Lcom/ss/android/downloadlib/c/h;->a()Lcom/ss/android/downloadlib/c/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ss/android/downloadlib/c/h;->f(Lcom/ss/android/downloadad/api/a/b;)V

    .line 52
    invoke-virtual {p0, p1, v0}, Lcom/ss/android/downloadlib/a;->a(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/b;)V

    .line 53
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/a/a;->a()Lcom/ss/android/downloadlib/addownload/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/a/a;->b(Ljava/lang/String;)V

    .line 54
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    const-string v1, "application/vnd.android.package-archive"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getSuccessedDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 55
    invoke-static {v0, p1}, Lcom/ss/android/downloadlib/a;->a(Ljava/util/List;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 56
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v1

    const-string v3, "no_hide_notification"

    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v2, :cond_5

    .line 57
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/b;->a()Lcom/ss/android/socialbase/downloader/notification/b;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/notification/b;->a(I)V

    .line 58
    :cond_5
    invoke-static {}, Lcom/ss/android/downloadlib/g;->a()Lcom/ss/android/downloadlib/g;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/ss/android/downloadlib/g;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V

    .line 59
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/c/d;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto :goto_0

    .line 60
    :cond_6
    invoke-static {}, Lcom/ss/android/downloadlib/g;->a()Lcom/ss/android/downloadlib/g;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/ss/android/downloadlib/g;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 61
    :goto_0
    monitor-exit p0

    return-void

    .line 62
    :cond_7
    :try_start_4
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "handleAppInstalled in main thread."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/b;)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    .line 92
    :cond_0
    invoke-static {p2}, Lcom/ss/android/downloadlib/g/m;->b(Lcom/ss/android/downloadad/api/a/b;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 93
    :cond_1
    iget-object v0, p2, Lcom/ss/android/downloadad/api/a/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 94
    invoke-virtual {p2}, Lcom/ss/android/downloadad/api/a/b;->K()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    .line 95
    :goto_0
    invoke-direct {p0, p2, p1, v1}, Lcom/ss/android/downloadlib/a;->a(Lcom/ss/android/downloadad/api/a/b;Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object p1

    .line 96
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ss/android/downloadad/api/a/b;->j()Ljava/lang/String;

    move-result-object v1

    const-string v2, "install_finish"

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    .line 97
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Lcom/ss/android/downloadad/api/a/b;)V

    :cond_3
    return-void
.end method

.method public b()V
    .locals 2

    .line 13
    sget-object v0, Lcom/ss/android/downloadlib/a;->a:Ljava/lang/String;

    const-string v1, "onAppForeground()"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/a;->d()V

    const/4 v0, 0x5

    .line 15
    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/a;->a(I)V

    return-void
.end method

.method public b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadad/api/a/b;)V
    .locals 3

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "install_finish_check_ttmd5"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 10
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTargetFilePath()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 12
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/d;->a()Lcom/ss/android/downloadlib/d;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/a$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/downloadlib/a$3;-><init>(Lcom/ss/android/downloadlib/a;Ljava/lang/String;Lcom/ss/android/downloadad/api/a/b;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/d;->b(Ljava/lang/Runnable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 14
    sget-object v0, Lcom/ss/android/downloadlib/a;->a:Ljava/lang/String;

    const-string v1, "onAppBackground()"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x6

    .line 15
    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/a;->a(I)V

    return-void
.end method

.method declared-synchronized d()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/a;->c:Lcom/ss/android/downloadlib/a$b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0}, Lcom/ss/android/downloadlib/a$b;->a(Lcom/ss/android/downloadlib/a$b;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/ss/android/downloadlib/a;->c:Lcom/ss/android/downloadlib/a$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    :cond_0
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    monitor-exit p0

    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
