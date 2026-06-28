.class public final Lcom/huawei/hms/analytics/framework/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/hms/analytics/framework/d/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/hms/analytics/framework/d/a;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/d/a;->a:Lcom/huawei/hms/analytics/framework/d/a;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->b()V

    :cond_0
    sget-object v0, Lcom/huawei/hms/analytics/framework/d/a;->a:Lcom/huawei/hms/analytics/framework/d/a;

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;J)V"
        }
    .end annotation

    new-instance v6, Lcom/huawei/hms/analytics/framework/c/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hms/analytics/framework/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V

    invoke-virtual {v6}, Lcom/huawei/hms/analytics/framework/c/d;->run()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    invoke-static {p0}, Lcom/huawei/hms/analytics/framework/a/a;->b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->NETWORK:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v1, ""

    invoke-interface {p0, v0, v1}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static declared-synchronized b()V
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/framework/d/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/framework/d/a;->a:Lcom/huawei/hms/analytics/framework/d/a;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/framework/d/a;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/framework/d/a;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/framework/d/a;->a:Lcom/huawei/hms/analytics/framework/d/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/huawei/hms/analytics/framework/c/d;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/hms/analytics/framework/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    const/4 p0, 0x1

    iput-boolean p0, v0, Lcom/huawei/hms/analytics/framework/c/d;->a:Z

    iput-object p3, v0, Lcom/huawei/hms/analytics/framework/c/d;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->a()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            "J)V"
        }
    .end annotation

    new-instance v6, Lcom/huawei/hms/analytics/framework/c/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hms/analytics/framework/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V

    const/4 p0, 0x1

    iput-boolean p0, v6, Lcom/huawei/hms/analytics/framework/c/d;->a:Z

    iput-object p3, v6, Lcom/huawei/hms/analytics/framework/c/d;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->a()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object p0

    invoke-virtual {p0, v6}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/huawei/hms/analytics/framework/c/d;

    invoke-direct {v0, p1, p2, p3}, Lcom/huawei/hms/analytics/framework/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iput-object p4, v0, Lcom/huawei/hms/analytics/framework/c/d;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->a()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            "J)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v6, Lcom/huawei/hms/analytics/framework/c/d;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hms/analytics/framework/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V

    iput-object p4, v6, Lcom/huawei/hms/analytics/framework/c/d;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->a()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object p1

    invoke-virtual {p1, v6}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/huawei/hms/analytics/framework/c/d;

    invoke-direct {v0, p1}, Lcom/huawei/hms/analytics/framework/c/d;-><init>(Ljava/util/List;)V

    iput-object p2, v0, Lcom/huawei/hms/analytics/framework/c/d;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->a()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/huawei/hms/analytics/framework/a/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->deleteAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
