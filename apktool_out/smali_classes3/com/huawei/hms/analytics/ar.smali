.class public final Lcom/huawei/hms/analytics/ar;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final klm:Lcom/huawei/hms/analytics/ar;


# instance fields
.field private volatile fgh:Lcom/huawei/hms/analytics/aq;

.field private volatile ghi:Lcom/huawei/hms/analytics/aq;

.field private hij:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/hms/analytics/au;",
            ">;"
        }
    .end annotation
.end field

.field private final ijk:Ljava/lang/Object;

.field private final ikl:Ljava/lang/Object;

.field public lmn:Lcom/huawei/hms/analytics/at;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/ar;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/ar;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/ar;->klm:Lcom/huawei/hms/analytics/ar;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/ar;->ikl:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/ar;->ijk:Ljava/lang/Object;

    new-instance v0, Lcom/huawei/hms/analytics/at;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/at;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/ar;->hij:Ljava/util/Map;

    return-void
.end method

.method public static lmn()Lcom/huawei/hms/analytics/ar;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/ar;->klm:Lcom/huawei/hms/analytics/ar;

    return-object v0
.end method


# virtual methods
.method public final ikl()Lcom/huawei/hms/analytics/aq;
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/ar;->fgh:Lcom/huawei/hms/analytics/aq;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/ar;->ikl:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/ar;->fgh:Lcom/huawei/hms/analytics/aq;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/as;

    iget-object v2, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/huawei/hms/analytics/as;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/huawei/hms/analytics/ar;->fgh:Lcom/huawei/hms/analytics/aq;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/ar;->fgh:Lcom/huawei/hms/analytics/aq;

    return-object v0
.end method

.method public final klm()Lcom/huawei/hms/analytics/aq;
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/ar;->ghi:Lcom/huawei/hms/analytics/aq;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/ar;->ijk:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/ar;->ghi:Lcom/huawei/hms/analytics/aq;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/bb;

    iget-object v2, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/huawei/hms/analytics/bb;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/huawei/hms/analytics/ar;->ghi:Lcom/huawei/hms/analytics/aq;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/ar;->ghi:Lcom/huawei/hms/analytics/aq;

    return-object v0
.end method

.method public final lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/ar;->hij:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/analytics/au;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/au;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/au;-><init>()V

    iget-object v1, p0, Lcom/huawei/hms/analytics/ar;->hij:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
