.class public final Lcom/huawei/agconnect/apms/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/agconnect/apms/a2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/apms/b2;->abc:Ljava/util/Map;

    return-void
.end method

.method public static declared-synchronized abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/c2;)Lv1/a;
    .locals 4

    const-class v0, Lcom/huawei/agconnect/apms/b2;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    const-string v1, "HAInstanceManager"

    const-string v2, "init must be called in the main thread"

    :goto_0
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_0
    if-nez p0, :cond_1

    const-string v1, "HAInstanceManager"

    const-string v2, "context cannot be null to init HiAnalyticsInstanceEx."

    goto :goto_0

    :cond_1
    iget-object v1, p1, Lcom/huawei/agconnect/apms/c2;->abc:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/huawei/agconnect/apms/c2;->abc:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x100

    if-le v1, v2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p1, Lcom/huawei/agconnect/apms/c2;->bcd:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/huawei/agconnect/apms/c2;->bcd:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    :goto_1
    const-string v1, "HAInstanceManager"

    const-string v2, "httpheader check failed"

    goto :goto_0

    :cond_5
    :goto_2
    const-string v1, "HAInstanceManager"

    const-string v2, "serviceTag check failed"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_3
    if-nez v3, :cond_6

    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :cond_6
    :try_start_1
    sget-object v1, Lcom/huawei/agconnect/apms/b2;->abc:Ljava/util/Map;

    iget-object v2, p1, Lcom/huawei/agconnect/apms/c2;->abc:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/agconnect/apms/a2;

    if-nez v2, :cond_7

    new-instance v2, Lcom/huawei/agconnect/apms/a2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/agconnect/apms/a2;-><init>(Landroid/content/Context;Lcom/huawei/agconnect/apms/c2;)V

    iget-object p0, p1, Lcom/huawei/agconnect/apms/c2;->abc:Ljava/lang/String;

    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v2

    :cond_7
    :try_start_2
    iget-object v1, p1, Lcom/huawei/agconnect/apms/c2;->cde:Ljava/lang/String;

    iget-object v3, v2, Lcom/huawei/agconnect/apms/a2;->bcd:Lcom/huawei/agconnect/apms/c2;

    iget-object v3, v3, Lcom/huawei/agconnect/apms/c2;->cde:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_8

    monitor-exit v0

    return-object v2

    :cond_8
    :try_start_3
    invoke-virtual {v2, p0, p1}, Lcom/huawei/agconnect/apms/a2;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/c2;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
