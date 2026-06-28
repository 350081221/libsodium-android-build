.class public final Lcom/huawei/hms/analytics/dj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final bcd:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private cde:Ljava/lang/String;

.field private def:Ljava/lang/String;

.field private efg:Z

.field private fgh:Ljava/lang/String;

.field private ghi:Ljava/lang/String;

.field private hij:I

.field public ijk:Lorg/json/JSONObject;

.field public final ikl:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field public klm:Landroid/os/Bundle;

.field public lmn:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->def:Ljava/lang/String;

    const-string v0, "_openness_config_tag"

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->cde:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/huawei/hms/analytics/dj;->bcd:Ljava/util/Map;

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/dj;->lmn(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/huawei/hms/analytics/dj;->lmn:Landroid/os/Bundle;

    invoke-static {p2}, Lcom/huawei/hms/analytics/dm;->lmn(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object p2, p0, Lcom/huawei/hms/analytics/dj;->ghi:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hms/analytics/dj;->fgh:Ljava/lang/String;

    const-string v2, ""

    invoke-direct {p0, p1, p2, v1, v2}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->def:Ljava/lang/String;

    const-string v0, "_openness_config_tag"

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->cde:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->bcd:Ljava/util/Map;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/dj;->efg:Z

    iput-object p2, p0, Lcom/huawei/hms/analytics/dj;->cde:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/dj;->lmn(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->def:Ljava/lang/String;

    const-string v0, "_openness_config_tag"

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->cde:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/huawei/hms/analytics/dj;->bcd:Ljava/util/Map;

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/dj;->lmn(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/dj;->fgh:Ljava/lang/String;

    const-string v2, ""

    invoke-direct {p0, p2, p1, v1, v2}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->def:Ljava/lang/String;

    const-string v0, "_openness_config_tag"

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->cde:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/dj;->bcd:Ljava/util/Map;

    iput-boolean p2, p0, Lcom/huawei/hms/analytics/dj;->efg:Z

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/dj;->lmn(Ljava/lang/String;)V

    return-void
.end method

.method private static ghi(Landroid/os/Bundle;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            ")",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/ax;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroid/os/BaseBundle;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    new-instance v3, Lcom/huawei/hms/analytics/ax;

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/huawei/hms/analytics/ax;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v2, "P_CEvtHandler"

    const-string v3, "event params key is null"

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/huawei/hms/analytics/df;

    invoke-direct {p0}, Lcom/huawei/hms/analytics/df;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method private hij(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 10

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1}, Lcom/huawei/hms/analytics/dj;->ghi(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/hms/analytics/ax;

    const/16 v6, 0x800

    const-string v7, "P_CEvtHandler"

    if-lt v2, v6, :cond_2

    const-string p1, "PE-005"

    const-string v2, "The bundle size exceeds the limit.Unnecessary data is discarded.Limit size: 2048"

    invoke-static {v7, p1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    iget-object v6, v5, Lcom/huawei/hms/analytics/ax;->klm:Ljava/lang/Object;

    instance-of v8, v6, Landroid/os/Bundle;

    const/4 v9, 0x1

    if-eqz v8, :cond_3

    if-nez v3, :cond_1

    iget v3, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    add-int/2addr v3, v9

    iput v3, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    check-cast v6, Landroid/os/Bundle;

    invoke-static {v6}, Lcom/huawei/hms/analytics/dj;->ghi(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v3

    iget-object v6, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    invoke-direct {p0, v6, v3}, Lcom/huawei/hms/analytics/dj;->klm(Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;

    move-result-object v3

    iget-object v5, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    invoke-virtual {v1, v5, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    move v3, v9

    goto :goto_1

    :cond_3
    instance-of v8, v6, Ljava/util/List;

    if-eqz v8, :cond_4

    if-nez v4, :cond_1

    iget-object v4, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    check-cast v6, Ljava/util/List;

    invoke-direct {p0, v4, v6}, Lcom/huawei/hms/analytics/dj;->lmn(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v4

    iget-object v6, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/hms/analytics/dj;->def:Ljava/lang/String;

    invoke-static {v0, v6, v7}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v5, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    invoke-virtual {v1, v5, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    move v4, v9

    goto :goto_1

    :cond_4
    invoke-static {v6}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v7, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    invoke-direct {p0, v7}, Lcom/huawei/hms/analytics/dj;->klm(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    move-object v8, v6

    check-cast v8, Ljava/io/Serializable;

    invoke-virtual {v1, v7, v8}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    iget-object v5, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    invoke-static {v0, v5, v6}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "The current data type is invalid.Key:"

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v5, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    :goto_2
    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method private ijk(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/dj;->ijk:Lorg/json/JSONObject;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/dj;->ijk:Lorg/json/JSONObject;

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/Serializable;

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "P_CEvtHandler"

    const-string v2, "def event params error"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method private klm(Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/ax;",
            ">;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hms/analytics/ax;

    const/16 v4, 0x800

    if-ge v2, v4, :cond_2

    iget-object v4, v3, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    invoke-direct {p0, v4}, Lcom/huawei/hms/analytics/dj;->klm(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    iget-object v4, v3, Lcom/huawei/hms/analytics/ax;->lmn:Ljava/lang/String;

    iget-object v3, v3, Lcom/huawei/hms/analytics/ax;->klm:Ljava/lang/Object;

    invoke-static {v3}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v5, v3

    check-cast v5, Ljava/io/Serializable;

    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {v1, v4, v3}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v3, "P_CEvtHandler"

    const-string v4, "bundle value is error"

    invoke-static {v3, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lcom/huawei/hms/analytics/dj;->fgh:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "$sub_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/dj;->ghi:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->getInstance()Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    move-result-object v2

    const/16 v3, 0x10

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->generateSecureRandomStr(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "$sub_evt_rel_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/hms/analytics/dj;->bcd:Ljava/util/Map;

    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v4, v3}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, v1, p1, v2, p2}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private klm(Ljava/lang/String;)Z
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/dj;->efg:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v0, "bundleKey"

    sget-object v2, Lcom/huawei/hms/analytics/am;->klm:Ljava/util/regex/Pattern;

    invoke-static {v0, p1, v2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "bundle key check failed! "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "P_CEvtHandler"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    return v1
.end method

.method private lmn(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/util/ArrayList<",
            "*>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_3

    const/16 v5, 0x32

    if-ge v4, v5, :cond_3

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Landroid/os/Bundle;

    if-eqz v6, :cond_0

    iget v6, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    add-int/lit8 v6, v6, 0x1

    iput v6, p0, Lcom/huawei/hms/analytics/dj;->hij:I

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Landroid/os/Bundle;

    invoke-static {v5}, Lcom/huawei/hms/analytics/dj;->ghi(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, p1, v5}, Lcom/huawei/hms/analytics/dj;->klm(Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v5}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v4, v4, 0x1

    if-nez v2, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/dj;->def:Ljava/lang/String;

    :cond_4
    return-object v0
.end method

.method private lmn(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/huawei/hms/analytics/dj;->ghi:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->getInstance()Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    move-result-object p1

    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->generateSecureRandomStr(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/dj;->fgh:Ljava/lang/String;

    return-void
.end method

.method private lmn(Lorg/json/JSONObject;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/dj;->bcd:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v1}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/dj;->ghi:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hms/analytics/dj;->fgh:Ljava/lang/String;

    const-string v2, ""

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p0, "P_CEvtHandler"

    const-string p1, "put json exception "

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "^eventId"

    invoke-static {p1, v0, p2}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "^id"

    invoke-static {p1, v0, p3}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string p3, "^pid"

    invoke-static {p1, p3, p4}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string p3, "_openness_config_tag"

    iget-object p4, p0, Lcom/huawei/hms/analytics/dj;->cde:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    const-string p3, "AGC_TAG"

    iget-object p4, p0, Lcom/huawei/hms/analytics/dj;->cde:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p3

    iget-object p3, p3, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p3, p3, Lcom/huawei/hms/analytics/at;->e:Ljava/lang/String;

    const-string p4, "$TaskId"

    invoke-static {p1, p4, p3}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string p3, "$EnterScreen"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    const-string p3, "$ExitScreen"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object p2

    iget-object p2, p2, Lcom/huawei/hms/analytics/bcd;->cde:Landroid/os/Bundle;

    const-string p3, "$PrevActivityClass"

    const-string p4, ""

    invoke-virtual {p2, p3, p4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "$PrePageId"

    invoke-static {p1, v0, p3}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string p3, "$CurActivityClass"

    invoke-virtual {p2, p3, p4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "$CurrPageId"

    invoke-static {p1, p3, p2}, Lcom/huawei/hms/analytics/dj;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final ikl(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/dj;->ijk(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/dj;->klm:Landroid/os/Bundle;

    return-void
.end method

.method public final klm(Landroid/os/Bundle;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/dj;->hij(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/dj;->lmn:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const v0, 0x32000

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final lmn(Landroid/os/Bundle;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/dj;->ijk(Landroid/os/Bundle;)Landroid/os/Bundle;

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/dj;->hij(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/dj;->lmn:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const v0, 0x32000

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
