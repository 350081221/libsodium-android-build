.class public abstract Lcom/huawei/hms/analytics/aq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/bo$lmn;


# instance fields
.field private final ijk:Ljava/lang/String;

.field protected ikl:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected final klm:Landroid/content/Context;

.field protected final lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/aq;->klm:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/hms/analytics/aq;->lmn:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/aq;->ijk:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object p1

    iget-object p2, p1, Lcom/huawei/hms/analytics/bo;->lmn:Ljava/util/List;

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p1, Lcom/huawei/hms/analytics/bo;->lmn:Ljava/util/List;

    :cond_0
    iget-object p1, p1, Lcom/huawei/hms/analytics/bo;->lmn:Ljava/util/List;

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->lmn()V

    return-void
.end method

.method private static efg()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected static klm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/aq;->efg()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p0}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->gcmEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1, p0}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->encryptCbc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected static lmn(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/aq;->efg()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p0}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->gcmDecrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1, p0}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->decryptCbc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected final fgh()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, ""

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lorg/json/JSONStringer;

    invoke-direct {v0}, Lorg/json/JSONStringer;-><init>()V

    :try_start_0
    invoke-virtual {v0}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    iget-object v2, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    invoke-virtual {v0}, Lorg/json/JSONStringer;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    return-object v0

    :catch_0
    :cond_3
    :goto_1
    return-object v1
.end method

.method public final ghi()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->hij()V

    return-void
.end method

.method public final hij()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->klm:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/analytics/aq;->lmn:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/huawei/hms/analytics/aq;->ijk:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final ijk()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->klm:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/analytics/aq;->lmn:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hms/analytics/aq;->ijk:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ikl()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->fgh()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final klm()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public final klm(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->lmn()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/aq;->fgh()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/aq;->klm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/aq;->lmn(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public lmn()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_0
    return-void
.end method

.method public abstract lmn(Landroid/os/Bundle;)V
.end method

.method public final lmn(Ljava/lang/String;)V
    .locals 5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->klm:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/analytics/aq;->lmn:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/huawei/hms/analytics/aq;->ijk:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public abstract lmn(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method protected final lmn(Lorg/json/JSONObject;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected final lmn(I)Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/aq;->ikl:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-ge v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const-string p1, "The number of customized parameters exceeds the upper limit.Current Number: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "cusParams"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method
