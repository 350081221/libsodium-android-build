.class public Lcom/huawei/agconnect/common/api/AgcCrypto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/datastore/annotation/ICrypto;


# static fields
.field private static final INSTANCE:Lcom/huawei/agconnect/common/api/AgcCrypto;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/common/api/AgcCrypto;

    invoke-direct {v0}, Lcom/huawei/agconnect/common/api/AgcCrypto;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/common/api/AgcCrypto;->INSTANCE:Lcom/huawei/agconnect/common/api/AgcCrypto;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/huawei/agconnect/datastore/annotation/ICrypto;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/common/api/AgcCrypto;->INSTANCE:Lcom/huawei/agconnect/common/api/AgcCrypto;

    return-object v0
.end method


# virtual methods
.method public decrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/agconnect/common/api/AgcCrypto;->getKeyV2()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/secure/android/common/encrypt/aes/a;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/agconnect/common/api/AgcCrypto;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/secure/android/common/encrypt/aes/a;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method

.method public encrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/agconnect/common/api/AgcCrypto;->getKeyV2()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/common/api/AgcCrypto;->getKeyV2()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/secure/android/common/encrypt/aes/a;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/credential/obs/h;->a:Lcom/huawei/agconnect/credential/obs/h;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/h;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getKeyV2()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/credential/obs/h;->a:Lcom/huawei/agconnect/credential/obs/h;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/h;->b()Ljavax/crypto/SecretKey;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/secure/android/common/util/c;->b([B)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
