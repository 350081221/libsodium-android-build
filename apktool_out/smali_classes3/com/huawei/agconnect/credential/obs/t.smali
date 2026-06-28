.class public Lcom/huawei/agconnect/credential/obs/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/agconnect/credential/obs/t;


# instance fields
.field private b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

.field private c:Lcom/huawei/agconnect/datastore/core/CryptoUtil;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->getInstance()Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/agconnect/credential/obs/t;
    .locals 2

    const-class v0, Lcom/huawei/agconnect/credential/obs/t;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/credential/obs/t;->a:Lcom/huawei/agconnect/credential/obs/t;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/agconnect/credential/obs/t;

    invoke-direct {v1}, Lcom/huawei/agconnect/credential/obs/t;-><init>()V

    sput-object v1, Lcom/huawei/agconnect/credential/obs/t;->a:Lcom/huawei/agconnect/credential/obs/t;

    :cond_0
    sget-object v1, Lcom/huawei/agconnect/credential/obs/t;->a:Lcom/huawei/agconnect/credential/obs/t;
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
.method public a(Lcom/huawei/agconnect/credential/obs/s;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/huawei/agconnect/credential/obs/s;Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "agc_site"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "main_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/s;->mainUrl:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "main_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "agc_site"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public b(Lcom/huawei/agconnect/credential/obs/s;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/huawei/agconnect/credential/obs/s;Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "agc_site"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "backup_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/agconnect/credential/obs/s;->backUrl:Ljava/lang/String;

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "backup_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "agc_site"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/huawei/agconnect/credential/obs/s;Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "agc_site"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "validTime_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/Long;

    iget-wide p1, p1, Lcom/huawei/agconnect/credential/obs/s;->validTime:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->put(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "validTime_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "agc_site"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->remove(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(Lcom/huawei/agconnect/credential/obs/s;Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "agc_site"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "main_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Lcom/huawei/agconnect/credential/obs/s;->mainUrl:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/agconnect/credential/obs/s;Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "agc_site"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "backup_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Lcom/huawei/agconnect/credential/obs/s;->backUrl:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public f(Lcom/huawei/agconnect/credential/obs/s;Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/t;->b:Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;

    const-string v1, "agc_site"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "validTime_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/Long;

    const/4 v4, 0x0

    const-class v5, Lcom/huawei/agconnect/datastore/annotation/DefaultCrypto;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/agconnect/datastore/core/SharedPrefUtil;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/huawei/agconnect/credential/obs/s;->validTime:J

    :cond_0
    return-void
.end method
