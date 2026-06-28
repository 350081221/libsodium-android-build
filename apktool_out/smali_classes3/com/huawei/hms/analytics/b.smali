.class public abstract Lcom/huawei/hms/analytics/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/d;


# instance fields
.field protected ikl:Lcom/huawei/hms/analytics/bw;

.field protected klm:Landroid/content/Context;

.field protected lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "BaseCampHandler"

    iput-object v0, p0, Lcom/huawei/hms/analytics/b;->lmn:Ljava/lang/String;

    return-void
.end method

.method private static klm(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result p0

    const/16 v1, 0x14

    if-lt p0, v1, :cond_1

    invoke-static {v0}, Lcom/huawei/hms/analytics/dd;->klm(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Lcom/huawei/hms/analytics/df$lmn;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/df$lmn;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    invoke-static {p0}, Lcom/huawei/hms/analytics/dd;->lmn(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    :cond_1
    :goto_0
    return-object v0
.end method

.method private lmn(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/b;->klm:Landroid/content/Context;

    const-string v1, "global_v2"

    const-string v2, ""

    invoke-static {v0, v1, p2, v2}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p2, Lorg/json/JSONArray;

    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p2, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/huawei/hms/analytics/b;->klm(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public static lmn(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v0, 0x5000

    if-le p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final lmn(Lcom/huawei/hms/analytics/ao;)Lcom/huawei/hms/analytics/ap;
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/b;->ikl:Lcom/huawei/hms/analytics/bw;

    const-string v1, "_push_msgid"

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/bw;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/b;->ikl:Lcom/huawei/hms/analytics/bw;

    const-string v2, "_push_cmd_type"

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/bw;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/analytics/b;->ikl:Lcom/huawei/hms/analytics/bw;

    const-string v3, "_push_notifyid"

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/bw;->ikl(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/hms/analytics/ap;

    invoke-direct {v3, v0, v1, v2, p1}, Lcom/huawei/hms/analytics/ap;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/ao;)V

    return-object v3
.end method

.method public final lmn(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "camp_info"

    invoke-direct {p0, p1, v0}, Lcom/huawei/hms/analytics/b;->lmn(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const-string v1, "camp_evt"

    invoke-direct {p0, p2, v1}, Lcom/huawei/hms/analytics/b;->lmn(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    iget-object v2, p0, Lcom/huawei/hms/analytics/b;->klm:Landroid/content/Context;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v0

    const/4 p1, 0x2

    aput-object v1, v3, p1

    const/4 p1, 0x3

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v3, p1

    const-string p1, "global_v2"

    invoke-static {v2, p1, v3}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
