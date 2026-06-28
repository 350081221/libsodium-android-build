.class public Lcom/huawei/agconnect/datastore/core/Platform;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final PLATFORM:Lcom/huawei/agconnect/datastore/core/Platform;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/datastore/core/Platform;->findPlatform()Lcom/huawei/agconnect/datastore/core/Platform;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/datastore/core/Platform;->PLATFORM:Lcom/huawei/agconnect/datastore/core/Platform;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static findPlatform()Lcom/huawei/agconnect/datastore/core/Platform;
    .locals 2

    const-string v0, "ohos.app.Context"

    invoke-static {v0}, Lcom/huawei/agconnect/datastore/core/Platform;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, "com.huawei.agconnect.datastore.core.HarmonyPlatform"

    invoke-static {v0}, Lcom/huawei/agconnect/datastore/core/Platform;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/datastore/core/Platform;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "cannot create HarmonyPlatform instance: InstantiationException"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "cannot create HarmonyPlatform instance: IllegalAccessException"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/huawei/agconnect/datastore/core/Platform;

    invoke-direct {v0}, Lcom/huawei/agconnect/datastore/core/Platform;-><init>()V

    return-object v0

    :cond_1
    new-instance v0, Lcom/huawei/agconnect/datastore/core/Platform;

    invoke-direct {v0}, Lcom/huawei/agconnect/datastore/core/Platform;-><init>()V

    return-object v0
.end method

.method public static get()Lcom/huawei/agconnect/datastore/core/Platform;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/datastore/core/Platform;->PLATFORM:Lcom/huawei/agconnect/datastore/core/Platform;

    return-object v0
.end method

.method private static getClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public declared-synchronized get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, Lcom/huawei/agconnect/datastore/core/AndroidSharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getAll(Ljava/lang/String;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/huawei/agconnect/datastore/core/AndroidSharedPrefUtil;->getAll(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public init(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Lcom/huawei/agconnect/datastore/core/AndroidSharedPrefUtil;->init(Ljava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, Lcom/huawei/agconnect/datastore/core/AndroidSharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public remove(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/huawei/agconnect/datastore/core/AndroidSharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
