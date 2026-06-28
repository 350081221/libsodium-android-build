.class public Lcom/huawei/hms/analytics/internal/filter/EventFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/bk;


# instance fields
.field private ghi:Landroid/content/Context;

.field private hij:Ljava/lang/reflect/Method;

.field private ijk:Ljava/lang/Object;

.field private ikl:Ljava/lang/reflect/Method;

.field private klm:Ljava/lang/reflect/Method;

.field private lmn:Lcom/huawei/hms/analytics/bl;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private klm(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 5

    const-string v0, "IncidentFilter"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->klm:Ljava/lang/reflect/Method;

    iget-object v3, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ijk:Ljava/lang/Object;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    const/4 p1, 0x1

    aput-object p2, v4, p1

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move v1, p1

    goto :goto_1

    :catch_0
    const-string p1, "Invocation target warning"

    goto :goto_0

    :catch_1
    const-string p1, "Illegal access warning"

    :goto_0
    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_1
    if-nez v1, :cond_1

    invoke-static {p2}, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn(Landroid/os/Bundle;)V

    :cond_1
    return v1
.end method

.method private static lmn(Ljava/lang/String;)J
    .locals 2

    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private static lmn(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "$HA_FIXED_TAG"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "$HA_FIXED_TYPE"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "$HA_FIXED_SOURCE"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "$HA_FIXED_TIMESTAMP"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    return-void
.end method

.method private static lmn(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "oper"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const-string p0, "IncidentFilter"

    const-string p1, "third callback params invalid"

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public getUserProfile(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "get user property#"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "IncidentFilter"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn:Lcom/huawei/hms/analytics/bl;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/bl;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final lmn(Landroid/content/Context;)V
    .locals 12

    const-class v0, Landroid/os/Bundle;

    const-class v1, Ljava/lang/String;

    const-string v2, "Illegal access warning"

    const-string v3, "IncidentFilter"

    iput-object p1, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ghi:Landroid/content/Context;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    :try_start_0
    const-string v7, "com.huawei.hms.dtm.EventFilter"

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ijk:Ljava/lang/Object;

    const-string v8, "setLogCallback"

    new-array v9, v5, [Ljava/lang/Class;

    const-class v10, Ljava/lang/Object;

    aput-object v10, v9, v4

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_4

    :try_start_1
    const-string v9, "initialize"

    new-array v10, v5, [Ljava/lang/Class;

    const-class v11, Landroid/content/Context;

    aput-object v11, v10, v4

    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const-string v9, "logEvent"

    const/4 v10, 0x2

    new-array v11, v10, [Ljava/lang/Class;

    aput-object v1, v11, v4

    aput-object v0, v11, v5

    invoke-virtual {v7, v9, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    iput-object v9, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->klm:Ljava/lang/reflect/Method;

    const-string v9, "logAutoEvent"

    new-array v10, v10, [Ljava/lang/Class;

    aput-object v1, v10, v4

    aput-object v0, v10, v5

    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ikl:Ljava/lang/reflect/Method;

    const-string v0, "setParameter"

    new-array v1, v5, [Ljava/lang/Class;

    const-class v9, Ljava/util/Map;

    aput-object v9, v1, v4

    invoke-virtual {v7, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->hij:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_6

    :catch_0
    move-object v0, v6

    move-object v6, v8

    goto :goto_0

    :catch_1
    move-object v0, v6

    move-object v6, v8

    goto :goto_1

    :catch_2
    move-object v0, v6

    move-object v6, v8

    goto :goto_2

    :catch_3
    move-object v0, v6

    move-object v6, v8

    goto :goto_3

    :catch_4
    move-object v0, v6

    :goto_0
    const-string v1, "No such method warning"

    goto :goto_4

    :catch_5
    move-object v0, v6

    :goto_1
    const-string v1, "Instantiation warning"

    goto :goto_4

    :catch_6
    move-object v0, v6

    :goto_2
    invoke-static {v3, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :catch_7
    move-object v0, v6

    :goto_3
    const-string v1, "Class not found warning"

    :goto_4
    invoke-static {v3, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    move-object v8, v6

    move-object v6, v0

    :goto_6
    if-eqz v8, :cond_0

    :try_start_2
    iget-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ijk:Ljava/lang/Object;

    new-array v1, v5, [Ljava/lang/Object;

    aput-object p0, v1, v4

    invoke-virtual {v8, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz v6, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ijk:Ljava/lang/Object;

    new-array v1, v5, [Ljava/lang/Object;

    aput-object p1, v1, v4

    invoke-virtual {v6, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_8

    goto :goto_7

    :catch_8
    const-string p1, "Invocation target warning"

    invoke-static {v3, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_9
    invoke-static {v3, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_7
    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/bl;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn:Lcom/huawei/hms/analytics/bl;

    return-void
.end method

.method public final lmn(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    const-string v0, "IncidentFilter"

    iget-object v1, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ikl:Ljava/lang/reflect/Method;

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ijk:Ljava/lang/Object;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object p2, v3, p1

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Invocation target warning"

    :goto_0
    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_1
    const-string p1, "Illegal access warning"

    goto :goto_0
.end method

.method public final lmn(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->hij:Ljava/lang/reflect/Method;

    const-string v1, "IncidentFilter"

    if-nez v0, :cond_0

    const-string p1, "analytics callback init failed, pls check log."

    :goto_0
    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_1

    const-string p1, "params is empty,Not need notify DTM"

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->hij:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ijk:Ljava/lang/Object;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Invocation target warning"

    goto :goto_0

    :catch_1
    const-string p1, "Illegal access warning"

    goto :goto_0
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->klm:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "$HA_FIXED_TAG"

    invoke-virtual {p4, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_FIXED_TYPE"

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_FIXED_SOURCE"

    const-string p2, "Event"

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p3, p4}, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->klm(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->klm:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "$HA_FIXED_TAG"

    invoke-virtual {p4, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_FIXED_TYPE"

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_FIXED_SOURCE"

    const-string p2, "StreamEvent"

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_FIXED_TIMESTAMP"

    invoke-static {p5, p6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p3, p4}, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->klm(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public logFilteredEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 10

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "log filtered evtID#"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "IncidentFilter"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn:Lcom/huawei/hms/analytics/bl;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_6

    const-string v0, "$HA_FIXED_SOURCE"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "$HA_FIXED_TAG"

    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x100

    if-gt v2, v3, :cond_5

    const-string v2, "eventId"

    sget-object v3, Lcom/huawei/hms/analytics/am;->klm:Ljava/util/regex/Pattern;

    invoke-static {v2, p1, v3}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string v2, "$HA_FIXED_TYPE"

    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "$HA_FIXED_TIMESTAMP"

    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn(Ljava/lang/String;)J

    invoke-static {p2}, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn(Landroid/os/Bundle;)V

    new-instance v3, Lcom/huawei/hms/analytics/dj;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v5}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v3, p2}, Lcom/huawei/hms/analytics/dj;->lmn(Landroid/os/Bundle;)Z

    move-result p2

    if-nez p2, :cond_2

    const-string p1, "bundle params is invalid."

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p2, "Event"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const-string v5, "oper"

    if-eqz p2, :cond_3

    const-string p2, "begin onEventFiltered"

    invoke-static {v1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v2}, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn:Lcom/huawei/hms/analytics/bl;

    iget-object v0, v3, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    invoke-interface {p2, v4, p1, v0}, Lcom/huawei/hms/analytics/bl;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iget-object p2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ghi:Landroid/content/Context;

    invoke-static {p2}, Lcom/huawei/hms/analytics/bj;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/bj;

    invoke-static {}, Lcom/huawei/hms/analytics/bj;->klm()Lcom/huawei/hms/analytics/bm;

    move-result-object p2

    iget-object v0, v3, Lcom/huawei/hms/analytics/dj;->lmn:Landroid/os/Bundle;

    invoke-virtual {p2, v4, v5, p1, v0}, Lcom/huawei/hms/analytics/bm;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :cond_3
    const-string p2, "StreamEvent"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "begin onStreamEventFiltered"

    invoke-static {v1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v2}, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn:Lcom/huawei/hms/analytics/bl;

    iget-object v0, v3, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    invoke-interface {p2, v4, p1, v0}, Lcom/huawei/hms/analytics/bl;->klm(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iget-object p2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ghi:Landroid/content/Context;

    invoke-static {p2}, Lcom/huawei/hms/analytics/bj;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/bj;

    invoke-static {}, Lcom/huawei/hms/analytics/bj;->klm()Lcom/huawei/hms/analytics/bm;

    move-result-object p2

    const-string v5, "oper"

    iget-object v7, v3, Lcom/huawei/hms/analytics/dj;->lmn:Landroid/os/Bundle;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    move-object v3, p2

    move-object v6, p1

    invoke-virtual/range {v3 .. v9}, Lcom/huawei/hms/analytics/bm;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void

    :cond_4
    const-string p2, "begin onEventFiltered with default"

    invoke-static {v1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->lmn:Lcom/huawei/hms/analytics/bl;

    const-string v0, "_openness_config_tag"

    iget-object v1, v3, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    invoke-interface {p2, v0, p1, v1}, Lcom/huawei/hms/analytics/bl;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iget-object p2, p0, Lcom/huawei/hms/analytics/internal/filter/EventFilter;->ghi:Landroid/content/Context;

    invoke-static {p2}, Lcom/huawei/hms/analytics/bj;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/bj;

    invoke-static {}, Lcom/huawei/hms/analytics/bj;->klm()Lcom/huawei/hms/analytics/bm;

    move-result-object p2

    iget-object v0, v3, Lcom/huawei/hms/analytics/dj;->lmn:Landroid/os/Bundle;

    invoke-virtual {p2, v4, v5, p1, v0}, Lcom/huawei/hms/analytics/bm;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    :goto_0
    return-void

    :cond_6
    const-string p1, "the params is null"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
