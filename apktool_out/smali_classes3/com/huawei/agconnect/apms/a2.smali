.class public final Lcom/huawei/agconnect/apms/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/a;


# instance fields
.field public abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

.field public bcd:Lcom/huawei/agconnect/apms/c2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/agconnect/apms/c2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2}, Lcom/huawei/agconnect/apms/a2;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/c2;)V

    return-void
.end method


# virtual methods
.method public final abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/c2;)V
    .locals 3

    iput-object p2, p0, Lcom/huawei/agconnect/apms/a2;->bcd:Lcom/huawei/agconnect/apms/c2;

    :try_start_0
    iget-object v0, p2, Lcom/huawei/agconnect/apms/c2;->cde:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/connector/ConnectorManager;

    iget-object v1, p2, Lcom/huawei/agconnect/apms/c2;->abc:Ljava/lang/String;

    iget-object p2, p2, Lcom/huawei/agconnect/apms/c2;->bcd:Ljava/lang/String;

    invoke-direct {v0, p1, v1, p2}, Lcom/huawei/hms/analytics/connector/ConnectorManager;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/hms/analytics/connector/ConnectorManager;

    iget-object v1, p2, Lcom/huawei/agconnect/apms/c2;->abc:Ljava/lang/String;

    iget-object v2, p2, Lcom/huawei/agconnect/apms/c2;->bcd:Ljava/lang/String;

    iget-object p2, p2, Lcom/huawei/agconnect/apms/c2;->cde:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2, p2}, Lcom/huawei/hms/analytics/connector/ConnectorManager;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "BridgeInstance"

    const-string p2, "createInstance error"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    return-void
.end method

.method public final getUserProfiles(Z)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->getUserProfiles(Z)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method public final onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->onEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onReport()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->onReport()V

    :cond_0
    return-void
.end method

.method public final setAnalyticsEnabled(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->setAnalyticsEnabled(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setAnalyticsEnabled: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BridgeInstance"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final setEnableAndroidID(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->setEnableAndroidID(Ljava/lang/Boolean;)V

    :cond_0
    return-void
.end method

.method public final syncOaid(Lcom/huawei/agconnect/apms/y1;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a2;->abc:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    if-eqz v0, :cond_1

    :try_start_0
    new-instance p1, Lcom/huawei/agconnect/apms/a2$abc;

    invoke-direct {p1, p0}, Lcom/huawei/agconnect/apms/a2$abc;-><init>(Lcom/huawei/agconnect/apms/a2;)V

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->syncOaid(Lcom/huawei/hms/analytics/instance/CallBack;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "syncOaid error, "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BridgeInstance"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/16 v0, -0x65

    const-string v1, "Ha sdk init failed"

    invoke-interface {p1, v0, v1}, Lcom/huawei/agconnect/apms/y1;->abc(ILjava/lang/String;)V

    return-void
.end method
