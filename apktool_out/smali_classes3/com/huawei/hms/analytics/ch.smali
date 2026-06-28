.class public final Lcom/huawei/hms/analytics/ch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private klm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation
.end field

.field private lmn:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/ch;->lmn:Landroid/content/Context;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/ch;->klm:Ljava/util/List;

    return-void
.end method

.method private static klm(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bo;->klm()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->decryptCbc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "HistoricalDataMovement"

    const-string v0, "decryptCbc content is empty"

    invoke-static {p0, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bo;->klm()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->gcmEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private lmn(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/hms/analytics/ch;->lmn:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/ch;->lmn:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/dl;->ikl(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    const-wide/32 v3, 0x500000

    cmp-long v1, v1, v3

    const-string v2, "HistoricalDataMovement"

    if-lez v1, :cond_2

    const-string p1, "sp stat file length > 5M,begin delete it"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/ch;->lmn:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/dl;->ijk(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "sp stat file delete success"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    iget-object v1, p0, Lcom/huawei/hms/analytics/ch;->lmn:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lcom/huawei/hms/analytics/ch;->lmn:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/dl;->ijk(Landroid/content/Context;Ljava/lang/String;)Z

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "-"

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x2

    if-ne v3, v4, :cond_4

    const/4 v3, 0x0

    aget-object v3, v1, v3

    const/4 v4, 0x1

    aget-object v1, v1, v4

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    :try_start_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v3, v0}, Lcom/huawei/hms/analytics/ch;->lmn(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "cache data is not json format"

    invoke-static {v2, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    return-void
.end method

.method private lmn(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_3

    check-cast p2, Ljava/lang/String;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result p2

    const/16 v1, 0x1388

    const-string v2, "HistoricalDataMovement"

    if-le p2, v1, :cond_0

    const-string p1, "migratingData(): array size is too long"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_3

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "eventtime"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :try_start_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v4

    const-wide/32 v4, 0x240c8400

    cmp-long v4, v6, v4

    if-gtz v4, :cond_2

    const-string v4, "properties"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/huawei/hms/analytics/ch;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v3, "content is empty"

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v5, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-direct {v5}, Lcom/huawei/hms/analytics/core/storage/Event;-><init>()V

    invoke-virtual {v5, v3}, Lcom/huawei/hms/analytics/core/storage/Event;->formJson(Lorg/json/JSONObject;)V

    invoke-virtual {v5, p1}, Lcom/huawei/hms/analytics/core/storage/Event;->setServiceTag(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lcom/huawei/hms/analytics/core/storage/Event;->setContent(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/ch;->klm:Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :catch_0
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    const-string v0, "handler historical data..."

    const-string v1, "HistoricalDataMovement"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "stat_v2_1"

    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/ch;->lmn(Ljava/lang/String;)V

    const-string v0, "cached_v2_1"

    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/ch;->lmn(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/ch;->lmn:Landroid/content/Context;

    const-string v2, "hyaline_v2_1"

    invoke-static {v0, v2}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/huawei/hms/analytics/dl;->ijk(Landroid/content/Context;Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/huawei/hms/analytics/ch;->klm:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "insert events..."

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/ch;->lmn:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/analytics/bc;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/bc;

    move-result-object v0

    iget-object v2, p0, Lcom/huawei/hms/analytics/ch;->klm:Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/bc;->lmn(Ljava/util/List;)V
    :try_end_0
    .catch Lcom/huawei/hms/analytics/bc$lmn; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "DBException"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
