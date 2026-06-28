.class public Lcom/huawei/agconnect/common/network/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/agconnect/common/network/c;


# instance fields
.field private b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

.field private c:Lcom/huawei/agconnect/datastore/core/CryptoUtil;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->getInstance()Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/common/network/c;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/agconnect/common/network/c;
    .locals 2

    const-class v0, Lcom/huawei/agconnect/common/network/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/common/network/c;->a:Lcom/huawei/agconnect/common/network/c;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/agconnect/common/network/c;

    invoke-direct {v1}, Lcom/huawei/agconnect/common/network/c;-><init>()V

    sput-object v1, Lcom/huawei/agconnect/common/network/c;->a:Lcom/huawei/agconnect/common/network/c;

    :cond_0
    sget-object v1, Lcom/huawei/agconnect/common/network/c;->a:Lcom/huawei/agconnect/common/network/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a(Lcom/huawei/agconnect/common/network/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/common/network/c;->b(Lcom/huawei/agconnect/common/network/b;)V

    return-void
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/agconnect/common/network/c;->c()V

    return-void
.end method

.method public b(Lcom/huawei/agconnect/common/network/b;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/common/network/c;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "AGConnectAccessNetwork"

    const-string v2, "enableAccessNetwork"

    const-class v3, Ljava/lang/Boolean;

    iget-boolean p1, p1, Lcom/huawei/agconnect/common/network/b;->enableAccessNetwork:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/agconnect/common/network/c;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "AGConnectAccessNetwork"

    const-string v2, "enableAccessNetwork"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/huawei/agconnect/common/network/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/common/network/c;->d(Lcom/huawei/agconnect/common/network/b;)V

    return-void
.end method

.method public d(Lcom/huawei/agconnect/common/network/b;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/common/network/c;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "AGConnectAccessNetwork"

    const-string v2, "enableAccessNetwork"

    const-class v3, Ljava/lang/Boolean;

    iget-boolean v4, p1, Lcom/huawei/agconnect/common/network/b;->enableAccessNetwork:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p1, Lcom/huawei/agconnect/common/network/b;->enableAccessNetwork:Z

    :cond_0
    return-void
.end method
