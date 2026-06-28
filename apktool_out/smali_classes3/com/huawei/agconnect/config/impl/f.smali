.class public Lcom/huawei/agconnect/config/impl/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/config/IDecrypt;


# instance fields
.field private a:Ljavax/crypto/SecretKey;

.field private final b:Lcom/huawei/agconnect/config/impl/d;

.field private c:Z


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/config/impl/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/agconnect/config/impl/f;->c:Z

    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/f;->b:Lcom/huawei/agconnect/config/impl/d;

    return-void
.end method

.method private a()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/f;->b:Lcom/huawei/agconnect/config/impl/d;

    invoke-static {v0}, Lcom/huawei/agconnect/config/impl/j;->a(Lcom/huawei/agconnect/config/impl/d;)Ljavax/crypto/SecretKey;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/f;->a:Ljavax/crypto/SecretKey;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

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

    const-string v2, "Exception when reading the \'K&I\' for \'Config\'. error is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AGC_LocalResource"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/f;->a:Ljavax/crypto/SecretKey;

    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/agconnect/config/impl/f;->c:Z

    return-void
.end method


# virtual methods
.method public decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/agconnect/config/impl/f;->c:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/agconnect/config/impl/f;->a()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/f;->a:Ljavax/crypto/SecretKey;

    const-string v1, "AGC_LocalResource"

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/f;->a:Ljavax/crypto/SecretKey;

    invoke-static {p1}, Lcom/huawei/agconnect/config/impl/Hex;->decodeHexString(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {v2, p1}, Lcom/huawei/agconnect/config/impl/j;->a(Ljavax/crypto/SecretKey;[B)[B

    move-result-object p1

    const-string v2, "UTF-8"

    invoke-direct {v0, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "decrypt exception:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object p2

    :cond_2
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "decrypt exception: secretKey = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/f;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "raw = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method
