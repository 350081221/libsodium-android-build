.class public Lcom/bytedance/sdk/openadsdk/api/plugin/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;,
        Lcom/bytedance/sdk/openadsdk/api/plugin/e$c;,
        Lcom/bytedance/sdk/openadsdk/api/plugin/e$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/openadsdk/TTPluginListener;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile d:Ldalvik/system/BaseDexClassLoader;

.field private static volatile e:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

.field private static volatile l:Lcom/bytedance/sdk/openadsdk/TTPluginListener;


# instance fields
.field private final f:Ljava/util/concurrent/CountDownLatch;

.field private volatile g:Z

.field private volatile h:Ljava/lang/String;

.field private final i:Landroid/content/Context;

.field private j:Lorg/json/JSONObject;

.field private k:Lcom/bykv/vk/openvk/api/proto/EventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "next"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c:Ljava/util/HashMap;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    sput-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->e:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    .line 38
    .line 39
    return-void
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

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->f:Ljava/util/concurrent/CountDownLatch;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->g:Z

    .line 14
    .line 15
    const-string v0, "none"

    .line 16
    .line 17
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->h:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->j:Lorg/json/JSONObject;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->k:Lcom/bykv/vk/openvk/api/proto/EventListener;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->i:Landroid/content/Context;

    .line 34
    .line 35
    :try_start_0
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, v1}, Lcom/bytedance/pangle/GlobalParam;->closeHookHuaweiOnInit(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    const-string v1, "TTPluginManager"

    .line 45
    .line 46
    const-string v2, "Unexpected error for closeHookHuaweiOnInit."

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    return-void
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
.end method

.method private static a(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 62
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;-><init>()V

    const-string v1, "package_name"

    .line 63
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    const-string/jumbo v1, "version_code"

    .line 64
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mVersionCode:I

    const-string v1, "download_url"

    .line 65
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mUrl:Ljava/lang/String;

    const-string v1, "md5"

    .line 66
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mMd5:Ljava/lang/String;

    const-string v1, "min_version"

    .line 67
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mApiVersionMin:I

    const-string v1, "max_version"

    .line 68
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mApiVersionMax:I

    const-string v1, "sign"

    .line 69
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;->a:Ljava/lang/String;

    const-string v1, "is_revert"

    .line 70
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    iput v1, v0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mFlag:I

    .line 71
    new-instance v1, Ljava/io/File;

    const-string v2, "plugin_file"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;->b:Ljava/io/File;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/api/plugin/e;
    .locals 2

    .line 7
    sget-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->e:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    if-nez v0, :cond_1

    .line 8
    const-class v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    monitor-enter v0

    .line 9
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->e:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    if-nez v1, :cond_0

    .line 10
    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->e:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    .line 11
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 12
    :cond_1
    :goto_0
    sget-object p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->e:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    return-object p0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 3

    .line 72
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 75
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 76
    aget-char v2, p0, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    const-string v2, "."

    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 44
    :try_start_0
    invoke-static {p0}, Lcom/bytedance/pangle/Zeus;->isPluginInstalled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/bytedance/pangle/Zeus;->getPlugin(Ljava/lang/String;)Lcom/bytedance/pangle/plugin/Plugin;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 45
    invoke-virtual {p0}, Lcom/bytedance/pangle/plugin/Plugin;->getVersion()I

    move-result p0

    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const-string p0, "TTPluginManager"

    const-string v0, "Get local version failed"

    .line 46
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/plugin/e;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->j:Lorg/json/JSONObject;

    return-object p0
.end method

.method static synthetic a(Lcom/bytedance/pangle/plugin/Plugin;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Lcom/bytedance/pangle/plugin/Plugin;)V

    return-void
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/plugin/e;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/plugin/e;Ljava/lang/String;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Ljava/lang/String;I)V
    .locals 0

    .line 5
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 1

    .line 101
    instance-of p0, p0, Ljava/lang/AbstractMethodError;

    if-eqz p0, :cond_0

    const-string p0, "com.byted.pangle"

    .line 102
    invoke-static {p0}, Lcom/bytedance/pangle/Zeus;->unInstallPlugin(Ljava/lang/String;)V

    const-string p0, "TTPluginManager"

    const-string v0, "AbstractMethodError, rollback to builtin version."

    .line 103
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static a(ZLjava/lang/String;)V
    .locals 8

    .line 82
    sget-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Install dl plugin "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p0, :cond_0

    const-string v3, " success"

    goto :goto_0

    :cond_0
    const-string v3, " failed"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", need notify: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "TTPluginManager"

    invoke-static {v3, v2}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    sget-object v2, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Handler;

    if-eqz p0, :cond_7

    .line 85
    sget-object p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->l:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    .line 86
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/sdk/openadsdk/TTPluginListener;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    if-eqz v1, :cond_2

    if-nez v4, :cond_3

    :cond_2
    return-void

    .line 87
    :cond_3
    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->loadPlugin(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 88
    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->getPlugin(Ljava/lang/String;)Lcom/bytedance/pangle/plugin/Plugin;

    move-result-object v3

    .line 89
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Lcom/bytedance/pangle/plugin/Plugin;)V

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    .line 90
    invoke-virtual {v4, v5}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_4
    const/16 v4, 0x3e8

    if-eqz v1, :cond_5

    .line 91
    iget-object v6, v3, Lcom/bytedance/pangle/plugin/Plugin;->mClassLoader:Lcom/bytedance/pangle/PluginClassLoader;

    iget-object v7, v3, Lcom/bytedance/pangle/plugin/Plugin;->mResources:Landroid/content/res/Resources;

    invoke-interface {v1, v4, v6, v7, v5}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V

    .line 92
    :cond_5
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/sdk/openadsdk/TTPluginListener;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 93
    iget-object v1, v3, Lcom/bytedance/pangle/plugin/Plugin;->mClassLoader:Lcom/bytedance/pangle/PluginClassLoader;

    iget-object v3, v3, Lcom/bytedance/pangle/plugin/Plugin;->mResources:Landroid/content/res/Resources;

    invoke-interface {p0, v4, v1, v3, v5}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V

    .line 94
    sput-object v5, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->l:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    goto :goto_2

    :cond_6
    const-string p0, "handle installed, load failed"

    .line 95
    invoke-static {v3, p0}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p0, 0x3ea

    .line 96
    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c(Ljava/lang/String;I)V

    goto :goto_2

    :cond_7
    const-string p0, "handle installed failed"

    .line 97
    invoke-static {v3, p0}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p0, 0x3eb

    .line 98
    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c(Ljava/lang/String;I)V

    .line 99
    :cond_8
    :goto_2
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static a(Lcom/bytedance/sdk/openadsdk/TTPluginListener;Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_1

    .line 80
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->packageName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 81
    :cond_0
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->packageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;)Z
    .locals 0

    .line 6
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/bytedance/sdk/openadsdk/api/plugin/e;)Lcom/bykv/vk/openvk/api/proto/EventListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->k:Lcom/bykv/vk/openvk/api/proto/EventListener;

    return-object p0
.end method

.method static synthetic b(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->d(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;

    move-result-object p0

    return-object p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 3

    .line 3
    :try_start_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/e;)V

    .line 4
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    move-result-object v1

    .line 5
    invoke-virtual {v1, v0}, Lcom/bytedance/pangle/GlobalParam;->setReporter(Lcom/bytedance/pangle/log/IZeusReporter;)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {v1, v0}, Lcom/bytedance/pangle/GlobalParam;->setCheckPermission(Z)V

    .line 7
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bytedance/pangle/GlobalParam;->setDownloadDir(Ljava/io/File;)V

    .line 8
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$b;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$b;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/e$1;)V

    invoke-virtual {v1, v0}, Lcom/bytedance/pangle/GlobalParam;->setLogger(Lcom/bytedance/pangle/log/IZeusLogger;)V

    const-string v0, "com.byted.pangle"

    const-string v2, "MIIDfTCCAmWgAwIBAgIEfRwYPjANBgkqhkiG9w0BAQsFADBvMQswCQYDVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzESMBAGA1UEChMJQnl0ZURhbmNlMQ8wDQYDVQQLEwZQYW5nbGUxFzAVBgNVBAMTDkNodWFuIFNoYW4gSmlhMB4XDTIxMTEwODA2MjQzOVoXDTQ2MTEwMjA2MjQzOVowbzELMAkGA1UEBhMCQ04xEDAOBgNVBAgTB0JlaWppbmcxEDAOBgNVBAcTB0JlaWppbmcxEjAQBgNVBAoTCUJ5dGVEYW5jZTEPMA0GA1UECxMGUGFuZ2xlMRcwFQYDVQQDEw5DaHVhbiBTaGFuIEppYTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIBKeRL+4mfCn1SLYv6OemfwwItkjlLPyqOEugkV6lanFTcZgLwEl5LIkL0y28UncPtMX1Mii6DzCdJ/plw7S9+RT/hYDneu339IKWojaU2qai/5FokHlQ0MMnYl5yry00ghVPsl1u+03cQA2ZnjIMiFhrBJpQzHt7IYvq2aEEMBcY8uT7iFoBI848e1mL1joVS2z02C3NliP7ZNARkXH+rTQAlCJulT5IZk+V/PTaKqzgNrkhsKh0/tBmU7m8u79x/xpgGsE19H18AgS4P/9/MDCRe2Z35boZeccaUy2MXCwv3djzUcDk3rRzQPYzdpyyRnrFMuhiKesc5VHgUMs9kCAwEAAaMhMB8wHQYDVR0OBBYEFENENrNWGzc2WhxdvhoMDs57U70zMA0GCSqGSIb3DQEBCwUAA4IBAQAHqDCrmvyBBmIGXwuL1rwS/Qv9ZJIZykBIaNMm+H1IfitCl4yXd9N2n+PjE0UZtxZ21UZOt9wAr+RFiSl5YRXqpt7WLARTy4YW3RiQ+wiL7bshzeSYBoSiC427Bfeq0WjwY0/jHlr8uouppyJOz++6U9hrYX2EW/6UjH5XlWiKQJ6b2ZzPcP8Xpg/TJn4tWvXJP6jw9kRRP2GmMttY78leWQst2QEZILmWJubXRLPj9O+qx2uP9oGTD4sc1vb9hzkOHBIHzGaalqLFbbGaeFpLFHoGTsnOfPTwUVKDZYmxbkcmR1bp7eYOW+nSQNMLn0FjDewZl5l37Sa/gz0WVHon"

    .line 9
    invoke-virtual {v1, v0, v2}, Lcom/bytedance/pangle/GlobalParam;->setSignature(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.byted.csj.ext"

    const-string v2, "MIIDezCCAmOgAwIBAgIENkE1KDANBgkqhkiG9w0BAQsFADBtMQswCQYDVQQGEwI4NjEQMA4GA1UECBMHYmVpamluZzEQMA4GA1UEBxMHYmVpamluZzESMBAGA1UEChMJYnl0ZWRhbmNlMRIwEAYDVQQLEwlieXRlZGFuY2UxEjAQBgNVBAMTCWJ5dGVkYW5jZTAgFw0yMjExMDIwODI3MzlaGA8yMDUwMDMyMDA4MjczOVowbTELMAkGA1UEBhMCODYxEDAOBgNVBAgTB2JlaWppbmcxEDAOBgNVBAcTB2JlaWppbmcxEjAQBgNVBAoTCWJ5dGVkYW5jZTESMBAGA1UECxMJYnl0ZWRhbmNlMRIwEAYDVQQDEwlieXRlZGFuY2UwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCc9Z2F3xxOMX1qTXMy2aPmS9OSkqrp8C8bHwS1hkNVR4umKREuqOn73INNo+R706jaCVnlPwxDwWjtX6H74DE4CveivyM9f2wNC3yIyDW+5j7lW/keTQcOlGLDEJQv4O/6FbB/jNU6epjyNaNIZhgZcvTpgaSixbdyHzRTFmvMh+WovdVK/J9LnHOQ+pmPZj7NB6MQRGMUrPEotLHQca3cmnLrnPAaZQaVoaFE9lOt9syyqEuf361SprNIGDtbkJuX3EqV/QOKWFwZX94IS7ZGSvfyCojcD4kaUSbaSoZC7zEuBb7l69g+ZMrJ/v6wkm01wxsNNssUwF7k6Sp0zubbAgMBAAGjITAfMB0GA1UdDgQWBBSxk+gVdDco1dP65hP67qoKNlMEYDANBgkqhkiG9w0BAQsFAAOCAQEAfosExl/AYEbS2xqHBTHa28cvnp/SElUQuzW6aWLqkfk9cxmFSI/euUV3/eB8RN+U2X47Y05u6+XUxTv0tSSEtyXNawm0qWH8jkR4gZY38YqBChKjhea668oT5X3Uocrw7SYXO/BfI8SKPa0uI/U8Cyl3uctbmmq/pPUkd3mKAy+HgyJoThD6K0oyiADlygngUMVTv6Uvid4qPj/bBnxI+LvVeX4l1dxGqWkiafQW9sz+RbFdge3X2XsSH4eo01BsCwOYEv1lHO2FrbAtFNpnIsSqrERdFaAJZ3tlJmg9bA03png8A2AajEjkhaOhduJB8zkSlvHNpoQMIAS9WtkG/w=="

    .line 10
    invoke-virtual {v1, v0, v2}, Lcom/bytedance/pangle/GlobalParam;->setSignature(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.byted.live.lite"

    const-string v2, "MIIDSTCCAjGgAwIBAgIEaLy5tzANBgkqhkiG9w0BAQsFADBVMQswCQYDVQQGEwIxMTEMMAoGA1UECBMDMTExMQ4wDAYDVQQHEwUxMTExMTEMMAoGA1UEChMDMTExMQwwCgYDVQQLEwMxMTExDDAKBgNVBAMTAzExMTAeFw0yMDEyMDMxMjQyMTJaFw00NTExMjcxMjQyMTJaMFUxCzAJBgNVBAYTAjExMQwwCgYDVQQIEwMxMTExDjAMBgNVBAcTBTExMTExMQwwCgYDVQQKEwMxMTExDDAKBgNVBAsTAzExMTEMMAoGA1UEAxMDMTExMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA45E52YdkJm4gPCXZq7KDoM1h6pgSswllC/CwDOmh8pDGvX4ROaYP1vr2biRlXMHg7G0iXpxWVdlTtx+4QFd3dC+cGJQk0f6apGo2n2RpMA0zIsSf0VO1a3GjWLei5INo+4RDdciqJ4jfsoqBIjZETRkky+UU4eO/oyrAwOu4KdMln3Bg3u7eHWU4kMFrXxrRruT3Q/9gzlO90yQa0CZPWVDrk6cGJtJwJGhWm+62S3U8D26HE++eGP7ve83QBDGtKqx7HpCAFWUiYBgXGq12H0amQDkKcPcr/EFCaBlombSgkN0t6zBX80m+wcUPC75IBTmMV/DT2dXcgjZ2I1JSCQIDAQABoyEwHzAdBgNVHQ4EFgQUPDyIeKI0KhZFPHyn36gMMIYrpukwDQYJKoZIhvcNAQELBQADggEBAHkl0DoCRwn+XKsDJE+wGMpBBqUDzL6DSOnJx4SNqb7YZZU0ThcDK7jY4If3QRkvMio6ODrVZc2U/m/Tc3VeMk5h2W2UZRUWHNH3k9Xe0720uL20ZeH2Y6IG4L5HG8kIbTbFtX3gJpPG/xAcez+CzyCFLWQAZt1N+csG0syWkXJ0Nryq8VrgSCyCXD1KzFxrOe+65wtu50Vi68Vlbk7BZe/G8Qm0RhKmxq5BPMBJ4uY3be+03Ba5qC//o1XQHOEAjrJKXcN5wqHdFZTkmuxVyIPogZOzx4JlNl0zOrYGDJxp7aZfKF9FkXQyF7x0Ns3mZEtjx/+flXRzAAU9MDhPr/0="

    .line 11
    invoke-virtual {v1, v0, v2}, Lcom/bytedance/pangle/GlobalParam;->setSignature(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$2;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$2;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/e;)V

    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->registerPluginStateListener(Lcom/bytedance/pangle/ZeusPluginStateListener;)V

    const/4 v0, 0x1

    .line 13
    invoke-virtual {v1, v0}, Lcom/bytedance/pangle/GlobalParam;->closeBgDex2oat(Z)V

    .line 14
    check-cast p1, Landroid/app/Application;

    invoke-static {p1, v0}, Lcom/bytedance/pangle/Zeus;->init(Landroid/app/Application;Z)V

    .line 15
    new-instance p1, Lcom/bytedance/sdk/openadsdk/api/plugin/e$3;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$3;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/e;)V

    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->registerPluginInstallListener(Lcom/bytedance/pangle/ZeusPluginInstallListener;)V

    .line 16
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "TTPluginManager"

    const-string v1, "Unexpected error for init zeus."

    .line 17
    invoke-static {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->h:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method private static b(Lcom/bytedance/pangle/plugin/Plugin;)V
    .locals 3

    if-nez p0, :cond_0

    const-string p0, "TTPluginManager"

    const-string v0, "plugin is null."

    .line 24
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 25
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "action"

    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "plugin_pkg_name"

    .line 27
    iget-object v2, p0, Lcom/bytedance/pangle/plugin/Plugin;->mPkgName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/bytedance/pangle/plugin/Plugin;->getVersion()I

    move-result p0

    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "plugin_version"

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 30
    const-class v1, Landroid/os/Bundle;

    invoke-interface {p0, v1, v0}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private b(Ljava/lang/String;I)V
    .locals 3

    const-string v0, "com.byted.pangle"

    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x6

    if-eqz v0, :cond_0

    if-ne p2, v1, :cond_0

    const-string v0, "TTPluginManager"

    const-string v2, "notify to end wait"

    .line 20
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->f:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    if-ne p2, v1, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 22
    :goto_0
    invoke-static {p2, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(ZLjava/lang/String;)V

    return-void
.end method

.method private static b(Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;)Z
    .locals 2

    if-eqz p0, :cond_1

    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;->b:Ljava/io/File;

    if-nez v0, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, p0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/bytedance/pangle/Zeus;->syncInstallPlugin(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 33
    iget-object p0, p0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(ZLjava/lang/String;)V

    return v0

    :cond_1
    :goto_0
    const-string p0, "TTPluginManager"

    const-string v0, "plugin config is null"

    .line 34
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method static synthetic c(Lcom/bytedance/sdk/openadsdk/TTPluginListener;)Lcom/bytedance/sdk/openadsdk/TTPluginListener;
    .locals 0

    .line 1
    sput-object p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->l:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    return-object p0
.end method

.method private static c(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    const-string/jumbo v0, "tt_pangle_bykv_file"

    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    .line 9
    new-instance v0, Ljava/io/File;

    const-string v1, "pangle_com.byted.pangle"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    new-instance p0, Ljava/io/File;

    sget-object v1, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object p0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lcom/bytedance/pangle/Zeus;->getPlugin(Ljava/lang/String;Z)Lcom/bytedance/pangle/plugin/Plugin;

    move-result-object v1

    .line 3
    :try_start_0
    iget-object v2, v1, Lcom/bytedance/pangle/plugin/Plugin;->mClassLoader:Lcom/bytedance/pangle/PluginClassLoader;

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    .line 4
    invoke-static {v2}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    invoke-virtual {v0, v3, p1}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    iget-object v1, v1, Lcom/bytedance/pangle/plugin/Plugin;->mClassLoader:Lcom/bytedance/pangle/PluginClassLoader;

    const/4 v2, 0x2

    .line 5
    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initPluginService failed in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TTPluginManager"

    invoke-static {v1, p1, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private static c(Ljava/lang/String;I)V
    .locals 2

    const-string v0, "TTPluginManager"

    const-string v1, "plugin update failed"

    .line 11
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "code"

    .line 13
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 14
    sget-object p1, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b:Ljava/util/HashMap;

    invoke-virtual {p1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    if-eqz p0, :cond_0

    const/16 p1, 0x3e9

    const/4 v1, 0x0

    .line 15
    invoke-interface {p0, p1, v1, v1, v0}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method private static d(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/api/plugin/e$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :goto_0
    return-object v0

    .line 19
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Invalid plugin info:"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v1, "TTPluginManager"

    .line 37
    .line 38
    invoke-static {v1, p0}, Lcom/bytedance/sdk/openadsdk/api/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v0
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
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    .line 37
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "plugin_version"

    .line 39
    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 41
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 42
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string p2, "_pl_config_info_"

    .line 43
    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object p1
.end method

.method public a(Lcom/bytedance/sdk/openadsdk/api/plugin/d;)Ldalvik/system/BaseDexClassLoader;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const v0, 0xea60

    .line 14
    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/sdk/openadsdk/api/plugin/d;I)Ldalvik/system/BaseDexClassLoader;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/bytedance/sdk/openadsdk/api/plugin/d;I)Ldalvik/system/BaseDexClassLoader;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 15
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->g:Z

    const-string v1, "TTPluginManager"

    if-eqz v0, :cond_6

    const-string v0, "com.byted.pangle"

    .line 16
    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->isPluginInstalled(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "install wait timeout"

    const/16 v4, 0x8

    const-string v5, "Install wait time out"

    if-nez v2, :cond_0

    :try_start_0
    const-string/jumbo v2, "wait start"

    .line 17
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->f:Ljava/util/concurrent/CountDownLatch;

    int-to-long v6, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v6, v7, p2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string/jumbo p2, "wait done"

    .line 19
    invoke-static {v1, p2}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo p2, "wait_install_cost"

    .line 20
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J

    goto :goto_0

    .line 21
    :catch_0
    invoke-static {v1, v5}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    new-instance p1, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    invoke-direct {p1, v4, v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;-><init>(ILjava/lang/String;)V

    throw p1

    .line 23
    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->isPluginLoaded(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->loadPlugin(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    goto :goto_2

    .line 24
    :cond_2
    :goto_1
    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->getPlugin(Ljava/lang/String;)Lcom/bytedance/pangle/plugin/Plugin;

    move-result-object p2

    iget-object p2, p2, Lcom/bytedance/pangle/plugin/Plugin;->mClassLoader:Lcom/bytedance/pangle/PluginClassLoader;

    sput-object p2, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->d:Ldalvik/system/BaseDexClassLoader;

    const/4 p2, 0x1

    :goto_2
    const-string v0, "get_classloader_cost"

    .line 25
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J

    .line 26
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->installFromDownloadDir()V

    .line 27
    sget-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->d:Ldalvik/system/BaseDexClassLoader;

    if-nez v0, :cond_5

    .line 28
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->f:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v0, v6, v8

    if-nez v0, :cond_4

    if-nez p2, :cond_3

    goto :goto_3

    :cond_3
    const-string p1, "Get null after load"

    .line 29
    invoke-static {v1, p1}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    new-instance p2, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    const/16 v0, 0x9

    invoke-direct {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;-><init>(ILjava/lang/String;)V

    throw p2

    .line 31
    :cond_4
    invoke-static {v1, v5}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    new-instance p1, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    invoke-direct {p1, v4, v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_5
    :goto_3
    const-string p2, "get_classloader_done"

    .line 33
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/d;->b(Ljava/lang/String;)J

    .line 34
    sget-object p1, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->d:Ldalvik/system/BaseDexClassLoader;

    return-object p1

    :cond_6
    const-string p1, "Zeus init failed."

    .line 35
    invoke-static {v1, p1}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    new-instance p1, Lcom/bytedance/sdk/openadsdk/api/plugin/a;

    const/4 p2, 0x4

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->h:Ljava/lang/String;

    invoke-direct {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/a;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public a()Lorg/json/JSONObject;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->j:Lorg/json/JSONObject;

    return-object v0
.end method

.method public a(Lcom/bytedance/sdk/openadsdk/TTPluginListener;)V
    .locals 7

    .line 47
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->g:Z

    const-string v1, "TTPluginManager"

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const-string v0, "Zeus init failed."

    .line 48
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/16 v0, 0x3ea

    .line 49
    invoke-interface {p1, v0, v2, v2, v2}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V

    :cond_0
    return-void

    .line 50
    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    new-instance v3, Lcom/bytedance/sdk/openadsdk/api/plugin/e$4;

    invoke-direct {v3, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$4;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/e;Lcom/bytedance/sdk/openadsdk/TTPluginListener;)V

    const-wide/32 v4, 0x2bf20

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->packageName()Ljava/lang/String;

    move-result-object v3

    .line 53
    invoke-static {v3}, Lcom/bytedance/pangle/Zeus;->isPluginInstalled(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 54
    invoke-static {v3}, Lcom/bytedance/pangle/Zeus;->isPluginLoaded(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lcom/bytedance/pangle/Zeus;->loadPlugin(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 55
    :cond_2
    invoke-static {v3}, Lcom/bytedance/pangle/Zeus;->getPlugin(Ljava/lang/String;)Lcom/bytedance/pangle/plugin/Plugin;

    move-result-object v4

    goto :goto_0

    :cond_3
    move-object v4, v2

    .line 56
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Find plugin:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v4, :cond_4

    const/4 v6, 0x1

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v4, :cond_5

    .line 57
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Lcom/bytedance/pangle/plugin/Plugin;)V

    .line 58
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 59
    iget-object v0, v4, Lcom/bytedance/pangle/plugin/Plugin;->mClassLoader:Lcom/bytedance/pangle/PluginClassLoader;

    iget-object v1, v4, Lcom/bytedance/pangle/plugin/Plugin;->mResources:Landroid/content/res/Resources;

    const/16 v3, 0x3e8

    invoke-interface {p1, v3, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V

    goto :goto_2

    .line 60
    :cond_5
    sget-object v1, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b:Ljava/util/HashMap;

    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object p1, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c:Ljava/util/HashMap;

    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    return-void
.end method

.method public b()V
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->k:Lcom/bykv/vk/openvk/api/proto/EventListener;

    if-eqz v0, :cond_0

    .line 36
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/bykv/a/a/a/a/a;->e(Z)Lcom/bykv/a/a/a/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/bykv/vk/openvk/api/proto/EventListener;->onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    :cond_0
    return-void
.end method

.method public b(Lcom/bytedance/sdk/openadsdk/TTPluginListener;)V
    .locals 2

    .line 23
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/e/a;->a()Lcom/bytedance/sdk/openadsdk/e/a;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/plugin/e$5;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/e$5;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/e;Lcom/bytedance/sdk/openadsdk/TTPluginListener;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/e/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method
