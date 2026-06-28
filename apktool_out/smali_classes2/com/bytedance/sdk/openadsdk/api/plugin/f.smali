.class public Lcom/bytedance/sdk/openadsdk/api/plugin/f;
.super Lcom/bytedance/sdk/openadsdk/api/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/api/plugin/f$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/bytedance/sdk/openadsdk/api/plugin/f$a;


# instance fields
.field private volatile b:Lcom/bykv/vk/openvk/api/proto/Initializer;

.field private c:Lcom/bytedance/sdk/openadsdk/api/plugin/d;

.field private d:Lcom/bytedance/sdk/openadsdk/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/f$a;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/f$1;)V

    sput-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/f$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/api/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/f$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/f$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/f;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->d:Lcom/bytedance/sdk/openadsdk/a/b;

    .line 10
    .line 11
    return-void
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

.method private a(I)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 9
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/api/plugin/a/a;->a()Lcom/bytedance/sdk/openadsdk/api/plugin/a/a;

    move-result-object p1

    return-object p1

    .line 10
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/downloadnew/d;

    move-result-object p1

    return-object p1

    .line 11
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/live/c;->a()Lcom/bytedance/sdk/openadsdk/live/c;

    move-result-object p1

    return-object p1
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/plugin/f;I)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->a(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/bytedance/sdk/openadsdk/api/plugin/d;)Lcom/bykv/vk/openvk/api/proto/Initializer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bytedance/sdk/openadsdk/api/plugin/a;
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b:Lcom/bykv/vk/openvk/api/proto/Initializer;

    if-nez v0, :cond_1

    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b:Lcom/bykv/vk/openvk/api/proto/Initializer;

    if-nez v0, :cond_0

    const-string v0, "TTPluginManager"

    const-string v1, "Create initializer"

    .line 18
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b(Lcom/bytedance/sdk/openadsdk/api/plugin/d;)Lcom/bykv/vk/openvk/api/proto/Initializer;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b:Lcom/bykv/vk/openvk/api/proto/Initializer;

    .line 20
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 21
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b:Lcom/bykv/vk/openvk/api/proto/Initializer;

    return-object p1
.end method

.method private static b(Lcom/bytedance/sdk/openadsdk/api/plugin/d;)Lcom/bykv/vk/openvk/api/proto/Initializer;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bytedance/sdk/openadsdk/api/plugin/a;
        }
    .end annotation

    const/16 v0, 0x106d

    :try_start_0
    const-string v1, "call_create_initializer"

    .line 24
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J

    .line 25
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    move-result-object v1

    .line 26
    invoke-virtual {v1, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/sdk/openadsdk/api/plugin/d;)Ldalvik/system/BaseDexClassLoader;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "com.bytedance.sdk.openadsdk.core.AdSdkInitializerHolder"

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "get_init_class_cost"

    .line 28
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J

    .line 29
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "call_init_time"

    .line 30
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "_pl_update_event_listener_"

    .line 31
    new-instance v4, Lcom/bytedance/sdk/openadsdk/api/plugin/e$c;

    invoke-direct {v4}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$c;-><init>()V

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v3, "create_bundle_cost"

    .line 32
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J

    const-string v3, "getNewInstance"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    .line 33
    const-class v6, Landroid/os/Bundle;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v3, "get_init_method_cost"

    .line 34
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v7

    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bykv/vk/openvk/api/proto/Initializer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v2, "get_init_instance_cost"

    .line 36
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J

    const-string p0, "TTPluginManager"

    const-string v2, "Create initializer success"

    .line 37
    invoke-static {p0, v2}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :catchall_0
    move-exception p0

    const-string v1, "com.byted.pangle"

    .line 38
    invoke-static {v1}, Lcom/bytedance/pangle/Zeus;->unInstallPlugin(Ljava/lang/String;)V

    .line 39
    throw p0

    .line 40
    :cond_0
    new-instance p0, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    const-string v1, "Get initializer failed"

    invoke-direct {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;-><init>(ILjava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p0

    .line 41
    instance-of v1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    if-eqz v1, :cond_1

    .line 42
    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v3, p0

    check-cast v3, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;-><init>(ILjava/lang/String;)V

    throw v1

    .line 43
    :cond_1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    const/16 v1, 0x106e

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;-><init>(ILjava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected a(Lcom/bykv/vk/openvk/api/proto/Result;)V
    .locals 3

    .line 2
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "action"

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 5
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    if-eqz p1, :cond_0

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/e/a;->a()Lcom/bytedance/sdk/openadsdk/e/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Ljava/util/concurrent/ExecutorService;)V

    .line 7
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/api/plugin/c;->a()V

    goto :goto_0

    .line 8
    :cond_1
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->code()I

    move-result v0

    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->message()Ljava/lang/String;

    move-result-object p1

    const-wide/16 v1, 0x0

    invoke-static {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/c;->a(ILjava/lang/String;J)V

    :goto_0
    return-void
.end method

.method public a()Z
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b:Lcom/bykv/vk/openvk/api/proto/Initializer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b:Lcom/bykv/vk/openvk/api/proto/Initializer;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Initializer;->isInitSuccess()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a(Landroid/content/Context;Lcom/bykv/a/a/a/a/b;)Z
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b:Lcom/bykv/vk/openvk/api/proto/Initializer;

    if-eqz v0, :cond_0

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->b:Lcom/bykv/vk/openvk/api/proto/Initializer;

    invoke-virtual {p2}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/bykv/vk/openvk/api/proto/Initializer;->init(Landroid/content/Context;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()Lcom/bytedance/sdk/openadsdk/api/a$c;
    .locals 1

    .line 23
    sget-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/f$a;

    return-object v0
.end method

.method public b(Landroid/content/Context;Lcom/bykv/a/a/a/a/b;)V
    .locals 7

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->c:Lcom/bytedance/sdk/openadsdk/api/plugin/d;

    if-nez v0, :cond_0

    const-string v0, "duration"

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->a(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/d;

    move-result-object v0

    :cond_0
    const-string/jumbo v1, "wait_asyn_cost"

    .line 6
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J

    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->a(Lcom/bytedance/sdk/openadsdk/api/plugin/d;)Lcom/bykv/vk/openvk/api/proto/Initializer;

    move-result-object v2
    :try_end_0
    .catch Lcom/bytedance/sdk/openadsdk/api/plugin/a; {:try_start_0 .. :try_end_0} :catch_1

    const-string v3, "Init error"

    if-eqz v2, :cond_1

    .line 8
    :try_start_1
    invoke-interface {v2}, Lcom/bykv/vk/openvk/api/proto/Initializer;->getManager()Lcom/bykv/vk/openvk/api/proto/Manager;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/openadsdk/api/a;->a(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :try_start_2
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->a()J

    .line 10
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-wide/16 v5, 0x14

    .line 11
    invoke-virtual {v0, v4, v5, v6}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->a(Lorg/json/JSONObject;J)V

    const-string/jumbo v0, "zeus"

    .line 12
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a()Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/16 v0, 0x9

    .line 13
    invoke-virtual {p2, v0, v4}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    invoke-interface {v2, p1, p2}, Lcom/bykv/vk/openvk/api/proto/Initializer;->init(Landroid/content/Context;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    if-eqz p1, :cond_2

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->hookHuaWeiVerifier(Landroid/app/Application;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_3
    const-string p2, "com.byted.pangle"

    .line 15
    invoke-static {p2}, Lcom/bytedance/pangle/Zeus;->unInstallPlugin(Ljava/lang/String;)V

    .line 16
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/bykv/a/a/a/a/a;->e(Z)Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    const/16 v0, 0x106f

    invoke-virtual {p2, v0}, Lcom/bykv/a/a/a/a/a;->b(I)Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/bykv/a/a/a/a/a;->d(Ljava/lang/String;)Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/bytedance/sdk/openadsdk/api/a;->b(Lcom/bykv/vk/openvk/api/proto/Result;)V

    .line 17
    throw p1

    .line 18
    :cond_1
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/bykv/a/a/a/a/a;->e(Z)Lcom/bykv/a/a/a/a/a;

    move-result-object p1

    const/16 p2, 0x1069

    invoke-virtual {p1, p2}, Lcom/bykv/a/a/a/a/a;->b(I)Lcom/bykv/a/a/a/a/a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/bykv/a/a/a/a/a;->d(Ljava/lang/String;)Lcom/bykv/a/a/a/a/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a;->b(Lcom/bykv/vk/openvk/api/proto/Result;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/bykv/a/a/a/a/a;->e(Z)Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    const/16 v0, 0x106b

    invoke-virtual {p2, v0}, Lcom/bykv/a/a/a/a/a;->b(I)Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UnExpected initializer error :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bykv/a/a/a/a/a;->d(Ljava/lang/String;)Lcom/bykv/a/a/a/a/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a;->b(Lcom/bykv/vk/openvk/api/proto/Result;)V

    :cond_2
    :goto_0
    return-void

    :catch_1
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/bykv/a/a/a/a/a;->e(Z)Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/bykv/a/a/a/a/a;->b(I)Lcom/bykv/a/a/a/a/a;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bykv/a/a/a/a/a;->d(Ljava/lang/String;)Lcom/bykv/a/a/a/a/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a;->b(Lcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method

.method protected b(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/api/a;->b(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)Z

    const-string p1, "duration"

    .line 2
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->a(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/d;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->c:Lcom/bytedance/sdk/openadsdk/api/plugin/d;

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/android/openliveplugin/process/LiveProcessUtils;->inLiveProcess(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 4
    :cond_0
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/c;->a(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected c()Lcom/bytedance/sdk/openadsdk/a/b;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->d:Lcom/bytedance/sdk/openadsdk/a/b;

    return-object v0
.end method
