.class public final Lcom/huawei/hms/analytics/framework/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/hms/analytics/framework/e/a;


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/hms/analytics/framework/e/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/e/a;->b:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/huawei/hms/analytics/framework/e/a;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/e/a;->a:Lcom/huawei/hms/analytics/framework/e/a;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/framework/e/a;->b()V

    :cond_0
    sget-object v0, Lcom/huawei/hms/analytics/framework/e/a;->a:Lcom/huawei/hms/analytics/framework/e/a;

    return-object v0
.end method

.method private static declared-synchronized b()V
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/framework/e/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/framework/e/a;->a:Lcom/huawei/hms/analytics/framework/e/a;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/framework/e/a;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/framework/e/a;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/framework/e/a;->a:Lcom/huawei/hms/analytics/framework/e/a;
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


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/e/b;
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/e/a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/framework/e/b;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/framework/e/b;-><init>()V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/e/a;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/e/a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/hms/analytics/framework/e/b;

    return-object p1
.end method

.method public final a(Ljava/lang/String;J)Lcom/huawei/hms/analytics/framework/e/b;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/framework/e/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/e/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hms/analytics/framework/e/b;->a(Ljava/lang/String;J)V

    return-object v0
.end method
