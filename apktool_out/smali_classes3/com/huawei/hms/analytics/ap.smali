.class public final Lcom/huawei/hms/analytics/ap;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final ghi:Ljava/lang/String;

.field private final hij:Ljava/lang/String;

.field private final ijk:Ljava/lang/String;

.field private final ikl:Ljava/lang/String;

.field private final klm:Ljava/lang/String;

.field private final lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/ao;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    if-nez p1, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lcom/huawei/hms/analytics/ap;->lmn:Ljava/lang/String;

    if-nez p2, :cond_1

    move-object p2, v0

    :cond_1
    iput-object p2, p0, Lcom/huawei/hms/analytics/ap;->klm:Ljava/lang/String;

    if-nez p3, :cond_2

    move-object p3, v0

    :cond_2
    iput-object p3, p0, Lcom/huawei/hms/analytics/ap;->ikl:Ljava/lang/String;

    iget-object p1, p4, Lcom/huawei/hms/analytics/ao;->lmn:Ljava/lang/String;

    iput-object p1, p0, Lcom/huawei/hms/analytics/ap;->hij:Ljava/lang/String;

    iget-object p1, p4, Lcom/huawei/hms/analytics/ao;->klm:Ljava/lang/String;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lcom/huawei/hms/analytics/ap;->ijk:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->getInstance()Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    move-result-object p1

    const/16 p2, 0x10

    invoke-virtual {p1, p2}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->generateSecureRandomStr(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/ap;->ghi:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final lmn()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "$PushMsgId"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ap;->lmn:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "$PushCmdType"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ap;->klm:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "$PushNotifyId"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ap;->ikl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "$CampaignPushInfo"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ap;->ijk:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "t"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ap;->hij:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "f"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ap;->ghi:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
