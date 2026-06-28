.class public abstract Lcom/huawei/hms/analytics/framework/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation
.end field

.field protected b:Lcom/huawei/hms/analytics/framework/config/ICallback;

.field protected c:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

.field protected d:Lcom/huawei/hms/analytics/framework/c/a/a;

.field private e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

.field private f:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/c/a/a;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/huawei/hms/analytics/framework/c/a;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object p1

    iget-object p3, p2, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-virtual {p1, p3}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    iget-object p3, p2, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    invoke-interface {p1, p3}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->setRegion(Ljava/lang/String;)V

    iget-object p1, p2, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/framework/a/a;->b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->f:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    iget-object p1, p2, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/framework/a/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->c:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/c/a/c;
    .locals 10

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/e;->a()Lcom/huawei/hms/analytics/framework/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v1, v1, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    iget-object v2, v0, Lcom/huawei/hms/analytics/framework/b/e;->a:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hms/analytics/framework/b/d;

    if-nez v2, :cond_0

    new-instance v2, Lcom/huawei/hms/analytics/framework/b/d;

    invoke-direct {v2}, Lcom/huawei/hms/analytics/framework/b/d;-><init>()V

    invoke-static {v2, v1}, Lcom/huawei/hms/analytics/framework/b/e;->a(Lcom/huawei/hms/analytics/framework/b/d;Ljava/lang/String;)V

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/b/e;->a:Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/huawei/hms/analytics/framework/b/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, v2, Lcom/huawei/hms/analytics/framework/b/d;->d:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v2, v1}, Lcom/huawei/hms/analytics/framework/b/e;->a(Lcom/huawei/hms/analytics/framework/b/d;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v3, v2, Lcom/huawei/hms/analytics/framework/b/d;->c:J

    sub-long/2addr v0, v3

    const-wide/32 v3, 0x2932e00

    cmp-long v0, v0, v3

    if-lez v0, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->getInstance()Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->generateSecureRandomStr(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/framework/b/d;->a()[B

    move-result-object v1

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/crypto/RsaCipher;->encrypt([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v0, v2, Lcom/huawei/hms/analytics/framework/b/d;->a:Ljava/lang/String;

    iput-object v1, v2, Lcom/huawei/hms/analytics/framework/b/d;->b:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v2, Lcom/huawei/hms/analytics/framework/b/d;->c:J

    :cond_2
    :goto_0
    iget-object v0, v2, Lcom/huawei/hms/analytics/framework/b/d;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->syncOaid()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getAppId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/a;->e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v3, v3, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-interface {v1, v3}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getDeviceAttribute(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;

    move-result-object v5

    iget-object v1, v2, Lcom/huawei/hms/analytics/framework/b/d;->b:Ljava/lang/String;

    new-instance v3, Lcom/huawei/hms/analytics/framework/c/a/b;

    invoke-direct {v3}, Lcom/huawei/hms/analytics/framework/c/a/b;-><init>()V

    iput-object v0, v3, Lcom/huawei/hms/analytics/framework/c/a/b;->b:Ljava/lang/String;

    iput-object v1, v3, Lcom/huawei/hms/analytics/framework/c/a/b;->a:Ljava/lang/String;

    iput-object p1, v3, Lcom/huawei/hms/analytics/framework/c/a/b;->e:Ljava/lang/String;

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object p1, p1, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    iput-object p1, v3, Lcom/huawei/hms/analytics/framework/c/a/b;->c:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuffer;

    const-string v0, "hmshi"

    invoke-direct {p1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "qrt"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v3, Lcom/huawei/hms/analytics/framework/c/a/b;->f:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v3, Lcom/huawei/hms/analytics/framework/c/a/b;->d:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/huawei/hms/analytics/framework/c/a/b;->a()Lorg/json/JSONObject;

    move-result-object p1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v1, v1, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getEvtCustomHeader(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;

    move-result-object v6

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getRomAttribute(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;

    move-result-object v7

    new-instance p1, Lcom/huawei/hms/analytics/framework/c/a/c;

    iget-object v8, v2, Lcom/huawei/hms/analytics/framework/b/d;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v9, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lcom/huawei/hms/analytics/framework/c/a/c;-><init>(Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method private a([BLjava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iput-object p2, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->d:Ljava/lang/String;

    new-instance p2, Lcom/huawei/hms/analytics/framework/c/i;

    invoke-direct {p2, p1, v0, p3}, Lcom/huawei/hms/analytics/framework/c/i;-><init>([BLcom/huawei/hms/analytics/framework/c/a/a;Ljava/util/List;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    iput-object p1, p2, Lcom/huawei/hms/analytics/framework/c/i;->a:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/framework/c/i;->run()V

    return-void
.end method

.method private static a(Ljava/util/List;Lcom/huawei/hms/analytics/framework/c/a/c;Z)[B
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/c/a/c;",
            "Z)[B"
        }
    .end annotation

    const-string v0, "ReportAssignment"

    :try_start_0
    invoke-virtual {p1, p0, p2}, Lcom/huawei/hms/analytics/framework/c/a/c;->a(Ljava/util/List;Z)Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "UTF-8"

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p0}, Lcom/huawei/hms/analytics/framework/g/a;->a([B)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, "json exception"

    goto :goto_0

    :catch_1
    const-string p0, "sendData(): getBytes - Unsupported coding format!!"

    :goto_0
    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0
.end method

.method public static b(J)J
    .locals 4

    const-wide/16 v0, 0x12c

    div-long v2, p0, v0

    rem-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-lez p0, :cond_0

    const-wide/16 p0, 0x1

    add-long/2addr v2, p0

    :cond_0
    return-wide v2
.end method


# virtual methods
.method public final a()Lcom/huawei/hms/analytics/core/storage/Event;
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v1, v1, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getSpecialEvent(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/Event;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit16 v2, p1, 0x12c

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/util/List;Z)V

    return-object p1
.end method

.method public final a(J)V
    .locals 6

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    const/4 v4, -0x1

    iget-object v5, p0, Lcom/huawei/hms/analytics/framework/c/a;->a:Ljava/util/List;

    move-wide v2, p1

    invoke-interface/range {v0 .. v5}, Lcom/huawei/hms/analytics/framework/config/ICallback;->onResult(IJILjava/util/List;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->getInstance()Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->generateSecureRandomStr(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/c/a/c;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-boolean v2, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->e:Z

    invoke-static {p1, v1, v2}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/util/List;Lcom/huawei/hms/analytics/framework/c/a/c;Z)[B

    move-result-object v1

    array-length v2, v1

    if-eqz v2, :cond_0

    invoke-direct {p0, v1, v0, p1}, Lcom/huawei/hms/analytics/framework/c/a;->a([BLjava/lang/String;Ljava/util/List;)V

    return-void

    :cond_0
    const-string p1, "ReportAssignment"

    const-string v0, "request body is empty"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "body length is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "uploadEvtModel is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;Z)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hms/analytics/core/storage/Event;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a;->f:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    sget-object v3, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->STORAGECYCLY:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/core/storage/Event;->getEvtTime()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-interface {v2, v3, v4, v5}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->c:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "delete events: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReportAssignment"

    invoke-static {p2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a;->c:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->deleteEvents(Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public final a(ZLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->e:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->serviceListener(ZLjava/lang/String;)V

    return-void
.end method

.method public final b()Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->f:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    sget-object v1, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->PARAMS:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v2, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->a:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/util/List;)V

    return-void
.end method
