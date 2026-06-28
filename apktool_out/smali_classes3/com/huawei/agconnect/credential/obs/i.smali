.class public Lcom/huawei/agconnect/credential/obs/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/agconnect/credential/obs/i;


# instance fields
.field private b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

.field private c:Lcom/huawei/agconnect/datastore/core/CryptoUtil;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->getInstance()Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/agconnect/credential/obs/i;
    .locals 2

    const-class v0, Lcom/huawei/agconnect/credential/obs/i;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/credential/obs/i;->a:Lcom/huawei/agconnect/credential/obs/i;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/agconnect/credential/obs/i;

    invoke-direct {v1}, Lcom/huawei/agconnect/credential/obs/i;-><init>()V

    sput-object v1, Lcom/huawei/agconnect/credential/obs/i;->a:Lcom/huawei/agconnect/credential/obs/i;

    :cond_0
    sget-object v1, Lcom/huawei/agconnect/credential/obs/i;->a:Lcom/huawei/agconnect/credential/obs/i;
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
.method public a(Lcom/huawei/agconnect/credential/obs/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/i;->b(Lcom/huawei/agconnect/credential/obs/h;)V

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/i;->c(Lcom/huawei/agconnect/credential/obs/h;)V

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/i;->d(Lcom/huawei/agconnect/credential/obs/h;)V

    return-void
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/agconnect/credential/obs/i;->c()V

    invoke-virtual {p0}, Lcom/huawei/agconnect/credential/obs/i;->d()V

    invoke-virtual {p0}, Lcom/huawei/agconnect/credential/obs/i;->e()V

    return-void
.end method

.method public b(Lcom/huawei/agconnect/credential/obs/h;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.appgallery.datastore"

    const-string v2, "key"

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/h;->randmonKey:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.appgallery.datastore"

    const-string v2, "key"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/huawei/agconnect/credential/obs/h;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.agconnect.internal"

    const-string v2, "jerry"

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/h;->jerry:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.agconnect.internal"

    const-string v2, "jerry"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(Lcom/huawei/agconnect/credential/obs/h;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.appgallery.datastore"

    const-string v2, "fish"

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/h;->fish:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.appgallery.datastore"

    const-string v2, "fish"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e(Lcom/huawei/agconnect/credential/obs/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/i;->f(Lcom/huawei/agconnect/credential/obs/h;)V

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/i;->g(Lcom/huawei/agconnect/credential/obs/h;)V

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/i;->h(Lcom/huawei/agconnect/credential/obs/h;)V

    return-void
.end method

.method public f(Lcom/huawei/agconnect/credential/obs/h;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.appgallery.datastore"

    const-string v2, "key"

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/h;->randmonKey:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lcom/huawei/agconnect/credential/obs/h;->randmonKey:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public g(Lcom/huawei/agconnect/credential/obs/h;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.agconnect.internal"

    const-string v2, "jerry"

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/h;->jerry:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lcom/huawei/agconnect/credential/obs/h;->jerry:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public h(Lcom/huawei/agconnect/credential/obs/h;)V
    .locals 6

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/i;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "com.huawei.appgallery.datastore"

    const-string v2, "fish"

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/h;->fish:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lcom/huawei/agconnect/credential/obs/h;->fish:Ljava/lang/String;

    :cond_0
    return-void
.end method
