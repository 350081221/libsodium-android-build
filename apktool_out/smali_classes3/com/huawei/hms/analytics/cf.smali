.class public final Lcom/huawei/hms/analytics/cf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private hij:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field private ijk:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private ikl:Landroid/os/Bundle;

.field private klm:Landroid/os/Bundle;

.field private lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroid/os/Bundle;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/cf;->lmn:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hms/analytics/cf;->klm:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/huawei/hms/analytics/cf;->ikl:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/huawei/hms/analytics/cf;->ijk:Ljava/util/Map;

    iput-object p5, p0, Lcom/huawei/hms/analytics/cf;->hij:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const-string v0, "EventAdapterTask is running"

    const-string v1, "EventAdapterMission"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/cf;->ijk:Ljava/util/Map;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/huawei/hms/analytics/cf;->hij:Ljava/util/Map;

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/hms/analytics/cf;->hij:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    if-nez v3, :cond_1

    const-string v2, "mOnEvent is null"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/huawei/hms/analytics/cf;->lmn:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    iget-object v5, p0, Lcom/huawei/hms/analytics/cf;->klm:Landroid/os/Bundle;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    iget-object v5, p0, Lcom/huawei/hms/analytics/cf;->ikl:Landroid/os/Bundle;

    const/4 v6, 0x2

    aput-object v5, v4, v6

    invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v2, "InvocationTargetException"

    goto :goto_1

    :catch_1
    const-string v2, "IllegalAccessException"

    :goto_1
    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method
