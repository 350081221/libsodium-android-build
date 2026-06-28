.class public final Lcom/huawei/hms/analytics/framework/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    const-string v1, ""

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getLoadWorkKey()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/huawei/hms/analytics/framework/c/b$1;->a:[I

    invoke-interface {v0}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getCipherType()Lcom/huawei/hms/analytics/framework/config/CipherType;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0, v2}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->encryptCbc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, v2}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->gcmEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static a(Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-eqz p1, :cond_2

    sget-object v1, Lcom/huawei/hms/analytics/framework/c/b$1;->a:[I

    invoke-interface {p1}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getCipherType()Lcom/huawei/hms/analytics/framework/config/CipherType;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getLoadWorkKey()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->decryptCbc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p1}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getLoadWorkKey()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->gcmDecrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method
