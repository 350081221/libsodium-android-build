.class public final Lcom/huawei/hms/analytics/framework/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

.field public b:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

.field c:Lcom/huawei/hms/analytics/framework/b/c;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;Lcom/huawei/hms/analytics/core/storage/IStorageHandler;Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/b/a;->a:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    new-instance p1, Lcom/huawei/hms/analytics/framework/b/c;

    invoke-direct {p1}, Lcom/huawei/hms/analytics/framework/b/c;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/b/a;->c:Lcom/huawei/hms/analytics/framework/b/c;

    iput-object p2, p1, Lcom/huawei/hms/analytics/framework/b/c;->b:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    iput-object p3, p0, Lcom/huawei/hms/analytics/framework/b/a;->b:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    return-void
.end method
