.class public final Lcom/huawei/hms/analytics/bt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAppVer()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->klm:Ljava/lang/String;

    return-object v0
.end method

.method public final getCipherType()Lcom/huawei/hms/analytics/framework/config/CipherType;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/config/CipherType;->AESGCM:Lcom/huawei/hms/analytics/framework/config/CipherType;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    return-object v0
.end method

.method public final getLoadWorkKey()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bo;->klm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public final getPubKeyVersion(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/at;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getRsaPublicKey(Ljava/lang/String;)[B
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v0, [B

    :try_start_0
    invoke-static {p1}, Lcom/huawei/hms/analytics/da;->lmn(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "OpennessDutyParams"

    const-string v1, "decode failed"

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_0
    new-array p1, v0, [B

    return-object p1
.end method
