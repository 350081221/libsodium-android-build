.class public final Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private collectorConfig:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

.field private parameters:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

.field private storageHandler:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

.field private storagePolicy:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->parameters:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/b/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "serviceTag check failed : "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "HAFrameworkCase"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    new-instance v0, Lcom/huawei/hms/analytics/framework/b/a;

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->collectorConfig:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->storageHandler:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->storagePolicy:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/framework/b/a;-><init>(Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;Lcom/huawei/hms/analytics/core/storage/IStorageHandler;Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->parameters:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    invoke-virtual {v1, p1, v2, v0}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;Lcom/huawei/hms/analytics/framework/b/a;)V

    new-instance v0, Lcom/huawei/hms/analytics/framework/a;

    invoke-direct {v0, p1}, Lcom/huawei/hms/analytics/framework/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final setCollectorConfig(Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;)Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->collectorConfig:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    return-object p0
.end method

.method public final setMandatoryParameters(Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;)Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->parameters:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    return-object p0
.end method

.method public final setStorageHandler(Lcom/huawei/hms/analytics/core/storage/IStorageHandler;)Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->storageHandler:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    return-object p0
.end method

.method public final setStoragePolicy(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;)Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->storagePolicy:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    return-object p0
.end method
