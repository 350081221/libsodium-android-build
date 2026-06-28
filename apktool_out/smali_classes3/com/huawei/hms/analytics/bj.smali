.class public final Lcom/huawei/hms/analytics/bj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/bj$lmn;
    }
.end annotation


# static fields
.field private static ijk:Lcom/huawei/hms/analytics/bm;

.field private static ikl:Lcom/huawei/hms/analytics/bk;

.field private static klm:Landroid/content/Context;

.field private static lmn:Lcom/huawei/hms/analytics/bj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/internal/filter/EventFilter;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/bj;->ikl:Lcom/huawei/hms/analytics/bk;

    new-instance v0, Lcom/huawei/hms/analytics/bm;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/bm;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/bj;->ijk:Lcom/huawei/hms/analytics/bm;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic ikl()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/bj;->klm:Landroid/content/Context;

    return-object v0
.end method

.method public static klm()Lcom/huawei/hms/analytics/bm;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/bj;->ijk:Lcom/huawei/hms/analytics/bm;

    return-object v0
.end method

.method private static declared-synchronized klm(Landroid/content/Context;)V
    .locals 13

    const-class v0, Lcom/huawei/hms/analytics/bj;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/bj;->lmn:Lcom/huawei/hms/analytics/bj;

    if-nez v1, :cond_1

    new-instance v1, Lcom/huawei/hms/analytics/bj;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/bj;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/bj;->lmn:Lcom/huawei/hms/analytics/bj;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    sput-object p0, Lcom/huawei/hms/analytics/bj;->klm:Landroid/content/Context;

    sget-object v1, Lcom/huawei/hms/analytics/bj;->ikl:Lcom/huawei/hms/analytics/bk;

    invoke-interface {v1, p0}, Lcom/huawei/hms/analytics/bk;->lmn(Landroid/content/Context;)V

    sget-object v1, Lcom/huawei/hms/analytics/bj;->ikl:Lcom/huawei/hms/analytics/bk;

    new-instance v2, Lcom/huawei/hms/analytics/bj$lmn;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/huawei/hms/analytics/bj$lmn;-><init>(B)V

    invoke-interface {v1, v2}, Lcom/huawei/hms/analytics/bk;->lmn(Lcom/huawei/hms/analytics/bl;)V

    sget-object v1, Lcom/huawei/hms/analytics/bj;->ijk:Lcom/huawei/hms/analytics/bm;

    sget-object v2, Lcom/huawei/hms/analytics/bm;->lmn:[Ljava/lang/String;

    array-length v4, v2

    move v5, v3

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v2, v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v8

    iget-object v9, v1, Lcom/huawei/hms/analytics/bm;->ikl:Ljava/util/Map;

    invoke-interface {v9, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "initialize"

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Class;

    const-class v12, Landroid/content/Context;

    aput-object v12, v11, v3

    invoke-virtual {v7, v9, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    new-array v11, v10, [Ljava/lang/Object;

    aput-object p0, v11, v3

    invoke-virtual {v9, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "onEvent"

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Class;

    const-class v11, Ljava/lang/String;

    aput-object v11, v9, v3

    const-class v11, Landroid/os/Bundle;

    aput-object v11, v9, v10

    const-class v10, Landroid/os/Bundle;

    const/4 v11, 0x2

    aput-object v10, v9, v11

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    iget-object v8, v1, Lcom/huawei/hms/analytics/bm;->klm:Ljava/util/Map;

    invoke-interface {v8, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catch_0
    :try_start_3
    const-string v6, "IncidentAdapter"

    const-string v7, "Invocation target warning"

    :goto_1
    invoke-static {v6, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    const-string v6, "IncidentAdapter"

    const-string v7, "No such method warning"

    goto :goto_1

    :catch_2
    const-string v6, "IncidentAdapter"

    const-string v7, "Instantiation warning"

    goto :goto_1

    :catch_3
    const-string v6, "IncidentAdapter"

    const-string v7, "Illegal access warning"

    goto :goto_1

    :catch_4
    const-string v6, "IncidentAdapter"

    const-string v7, "Class not found warning"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/bj;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/bj;->lmn:Lcom/huawei/hms/analytics/bj;

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/huawei/hms/analytics/bj;->klm(Landroid/content/Context;)V

    :cond_0
    sget-object p0, Lcom/huawei/hms/analytics/bj;->lmn:Lcom/huawei/hms/analytics/bj;

    return-object p0
.end method

.method public static lmn()Lcom/huawei/hms/analytics/bk;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/bj;->ikl:Lcom/huawei/hms/analytics/bk;

    return-object v0
.end method
