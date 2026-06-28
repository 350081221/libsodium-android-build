.class public final Lcom/huawei/hms/analytics/framework/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object v0

    invoke-interface {v0, v4, v5}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getCustomEventJson(J)Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v7, Lcom/huawei/hms/analytics/framework/c/d;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hms/analytics/framework/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V

    iput-boolean p2, v7, Lcom/huawei/hms/analytics/framework/c/d;->a:Z

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/json/JSONObject;

    invoke-virtual {v7, p0, p2}, Lcom/huawei/hms/analytics/framework/c/d;->a(Ljava/util/List;Lorg/json/JSONObject;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
