.class public Lcom/huawei/agconnect/credential/obs/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/agconnect/credential/obs/b;


# instance fields
.field private b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

.field private c:Lcom/huawei/agconnect/datastore/core/CryptoUtil;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->getInstance()Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/b;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/agconnect/credential/obs/b;
    .locals 2

    const-class v0, Lcom/huawei/agconnect/credential/obs/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/credential/obs/b;->a:Lcom/huawei/agconnect/credential/obs/b;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/agconnect/credential/obs/b;

    invoke-direct {v1}, Lcom/huawei/agconnect/credential/obs/b;-><init>()V

    sput-object v1, Lcom/huawei/agconnect/credential/obs/b;->a:Lcom/huawei/agconnect/credential/obs/b;

    :cond_0
    sget-object v1, Lcom/huawei/agconnect/credential/obs/b;->a:Lcom/huawei/agconnect/credential/obs/b;
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
.method public a(Lcom/huawei/agconnect/credential/obs/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/b;->b(Lcom/huawei/agconnect/credential/obs/a;)V

    return-void
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/agconnect/credential/obs/b;->c()V

    return-void
.end method

.method public b(Lcom/huawei/agconnect/credential/obs/a;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/b;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.agconnect"

    const-string v2, "aaid"

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/a;->aaidString:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/common/api/AgcCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/b;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.agconnect"

    const-string v2, "aaid"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/huawei/agconnect/credential/obs/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/b;->d(Lcom/huawei/agconnect/credential/obs/a;)V

    return-void
.end method

.method public d(Lcom/huawei/agconnect/credential/obs/a;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/b;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.agconnect"

    const-string v2, "aaid"

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/a;->aaidString:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/common/api/AgcCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lcom/huawei/agconnect/credential/obs/a;->aaidString:Ljava/lang/String;

    :cond_0
    return-void
.end method
