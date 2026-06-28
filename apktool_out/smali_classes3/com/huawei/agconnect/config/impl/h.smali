.class public Lcom/huawei/agconnect/config/impl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/config/AesDecrypt;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private c:Lcom/huawei/agconnect/config/IDecrypt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "AGC_FlexibleDecrypt"

    const-string v1, "init"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/h;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/agconnect/config/impl/h;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/h;->c:Lcom/huawei/agconnect/config/IDecrypt;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/agconnect/config/impl/h;->decryptComponent()Lcom/huawei/agconnect/config/IDecrypt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/h;->c:Lcom/huawei/agconnect/config/IDecrypt;

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/h;->c:Lcom/huawei/agconnect/config/IDecrypt;

    if-nez v0, :cond_1

    const-string v0, "AGC_FlexibleDecrypt"

    const-string v1, "decrypt Flexible Decrypt error, use old instead"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/huawei/agconnect/config/impl/g;

    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/h;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/h;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/huawei/agconnect/config/impl/g;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/huawei/agconnect/config/impl/g;->decryptComponent()Lcom/huawei/agconnect/config/IDecrypt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/h;->c:Lcom/huawei/agconnect/config/IDecrypt;

    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/h;->c:Lcom/huawei/agconnect/config/IDecrypt;

    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/h;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/h;->b:Ljava/lang/String;

    const-string v3, "agc_plugin_"

    invoke-static {v1, v2, v3, p1}, Lcom/huawei/agconnect/config/impl/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/huawei/agconnect/config/IDecrypt;->decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public decryptComponent()Lcom/huawei/agconnect/config/IDecrypt;
    .locals 9

    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/h;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/h;->b:Ljava/lang/String;

    const-string v2, "agc_plugin_"

    const-string v3, "crypto_component"

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/agconnect/config/impl/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v1, Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/agconnect/config/impl/Hex;->decodeHexString(Ljava/lang/String;)[B

    move-result-object v0

    const-string v2, "utf-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "rx"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "ry"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "rz"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "salt"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "iterationCount"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    const-string v1, "algorithm"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v0, Lcom/huawei/agconnect/config/impl/d;

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/huawei/agconnect/config/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v1, Lcom/huawei/agconnect/config/impl/f;

    invoke-direct {v1, v0}, Lcom/huawei/agconnect/config/impl/f;-><init>(Lcom/huawei/agconnect/config/impl/d;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FlexibleDecrypt exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AGC_FlexibleDecrypt"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
