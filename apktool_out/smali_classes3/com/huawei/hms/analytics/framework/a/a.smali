.class public final Lcom/huawei/hms/analytics/framework/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hms/analytics/framework/b/b;->b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/b/c;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/huawei/hms/analytics/framework/b/c;->b:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/b/b;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/huawei/hms/analytics/framework/b/a;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/huawei/hms/analytics/framework/b/a;->b:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
