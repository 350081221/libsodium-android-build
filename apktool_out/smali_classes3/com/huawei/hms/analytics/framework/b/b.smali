.class public final Lcom/huawei/hms/analytics/framework/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lcom/huawei/hms/analytics/framework/b/b;


# instance fields
.field public a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/hms/analytics/framework/b/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/framework/b/b;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/framework/b/b;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/framework/b/b;->c:Lcom/huawei/hms/analytics/framework/b/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/b/b;->b:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/huawei/hms/analytics/framework/b/b;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/b/b;->c:Lcom/huawei/hms/analytics/framework/b/b;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/b/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/hms/analytics/framework/b/a;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/huawei/hms/analytics/framework/b/a;->a:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;Lcom/huawei/hms/analytics/framework/b/a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/b/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;
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

.method public final b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/b/c;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/b/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/hms/analytics/framework/b/a;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/huawei/hms/analytics/framework/b/a;->c:Lcom/huawei/hms/analytics/framework/b/c;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
