.class public final Lcom/huawei/hms/analytics/di;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static klm:Landroid/content/Context;

.field private static final lmn:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/di;->lmn:Ljava/util/Set;

    return-void
.end method

.method private static lmn()Ljava/lang/String;
    .locals 6

    const-string v0, "android"

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iget-object v3, v1, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    const-string v4, ""

    if-eqz v3, :cond_0

    iget-object v3, v3, Lcom/huawei/hms/analytics/ay;->klm:Ljava/lang/String;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    :try_start_0
    const-string v5, "app_id"

    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "lib_ver"

    const-string v5, "6.7.0.300"

    invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "app_ver"

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->klm:Ljava/lang/String;

    if-nez v1, :cond_1

    sget-object v1, Lcom/huawei/hms/analytics/di;->klm:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/hms/analytics/dg;->hij(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "package_name"

    sget-object v3, Lcom/huawei/hms/analytics/di;->klm:Landroid/content/Context;

    if-nez v3, :cond_2

    move-object v3, v4

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "model"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "manufacturer"

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "lib_type"

    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "os"

    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "os_ver"

    invoke-static {}, Lcom/huawei/hms/analytics/dg;->ijk()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    return-object v4
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 0

    sput-object p0, Lcom/huawei/hms/analytics/di;->klm:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static declared-synchronized lmn(Ljava/lang/Throwable;)V
    .locals 9

    const-class v0, Lcom/huawei/hms/analytics/di;

    monitor-enter v0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/di;->klm:Landroid/content/Context;

    if-nez v1, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    sput-object v1, Lcom/huawei/hms/analytics/di;->klm:Landroid/content/Context;

    :cond_1
    instance-of v1, p0, Landroid/database/sqlite/SQLiteBlobTooBigException;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    instance-of v1, p0, Landroid/database/sqlite/SQLiteFullException;

    if-nez v1, :cond_2

    instance-of v1, p0, Ljava/lang/NoClassDefFoundError;

    if-nez v1, :cond_2

    instance-of v1, p0, Ljava/lang/NoSuchMethodError;

    if-eqz v1, :cond_4

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    sget-object v4, Lcom/huawei/hms/analytics/di;->lmn:Ljava/util/Set;

    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    move v1, v2

    goto :goto_1

    :cond_5
    :goto_0
    move v1, v3

    :goto_1
    if-eqz v1, :cond_6

    monitor-exit v0

    return-void

    :cond_6
    :try_start_1
    sget-object v1, Lcom/huawei/hms/analytics/di;->klm:Landroid/content/Context;

    const-string v4, "global_v2"

    const-string v5, "is_analytics_enabled"

    invoke-static {v1, v4, v5, v3}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_7

    monitor-exit v0

    return-void

    :cond_7
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    goto :goto_2

    :cond_8
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    :goto_2
    array-length v5, p0

    :goto_3
    if-ge v2, v5, :cond_9

    aget-object v6, p0, v2

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    const v8, 0x32000

    if-ge v7, v8, :cond_9

    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "line.separator"

    invoke-static {v6}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_4

    :cond_a
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v4, "service"

    const-string v5, "AnalyticsKit"

    invoke-virtual {v2, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "exception_type"

    invoke-virtual {v2, v4, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "exception_message"

    invoke-virtual {v2, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "exception_stack"

    invoke-virtual {v2, v1, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "common_prop"

    invoke-static {}, Lcom/huawei/hms/analytics/di;->lmn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, p0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :cond_b
    :goto_4
    const/4 v2, 0x0

    :goto_5
    if-nez v2, :cond_c

    monitor-exit v0

    return-void

    :cond_c
    :try_start_3
    sget-object p0, Lcom/huawei/hms/analytics/di;->klm:Landroid/content/Context;

    invoke-static {p0}, Lcom/huawei/hms/utils/HMSBIInitializer;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSBIInitializer;

    move-result-object p0

    invoke-virtual {p0}, Lcom/huawei/hms/utils/HMSBIInitializer;->isInit()Z

    move-result p0

    if-nez p0, :cond_d

    sget-object p0, Lcom/huawei/hms/analytics/di;->klm:Landroid/content/Context;

    invoke-static {p0}, Lcom/huawei/hms/utils/HMSBIInitializer;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSBIInitializer;

    move-result-object p0

    invoke-virtual {p0}, Lcom/huawei/hms/utils/HMSBIInitializer;->initBI()V

    :cond_d
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    move-result-object p0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v3, "$HAExceptionEvent"

    invoke-virtual {p0, v1, v3, v2}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->onNewEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
