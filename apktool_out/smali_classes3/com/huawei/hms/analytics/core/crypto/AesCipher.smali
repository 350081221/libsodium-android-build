.class public Lcom/huawei/hms/analytics/core/crypto/AesCipher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/core/crypto/AesCipher$AesLen;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static aesKsDecrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lc2/b;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static aesKsEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lc2/b;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static decryptCbc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->getCBCIv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->getCbcEncryptWord(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1, v0}, Lcom/huawei/secure/android/common/encrypt/aes/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static encryptCbc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p1}, Lcom/huawei/hms/analytics/core/crypto/HAHexUtil;->hexString2ByteArray(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p0, p1}, Lcom/huawei/secure/android/common/encrypt/aes/a;->x([B[B)[B

    move-result-object p0

    invoke-static {p0}, Lcom/huawei/hms/analytics/core/crypto/HAHexUtil;->byteArray2HexString([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static encryptCbc([BLjava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, ""

    const-string v1, "AesCypher"

    if-eqz p0, :cond_2

    array-length v2, p0

    if-eqz v2, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/huawei/hms/analytics/core/crypto/HAHexUtil;->hexString2ByteArray(Ljava/lang/String;)[B

    move-result-object p1

    array-length v2, p1

    const/16 v3, 0x10

    if-ge v2, v3, :cond_1

    const-string p0, "key length is not right"

    :goto_0
    invoke-static {v1, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    invoke-static {p0, p1}, Lcom/huawei/secure/android/common/encrypt/aes/a;->x([B[B)[B

    move-result-object p0

    invoke-static {p0}, Lcom/huawei/hms/analytics/core/crypto/HAHexUtil;->byteArray2HexString([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    const-string p0, "cbc encrypt(byte) param is not right"

    goto :goto_0
.end method

.method public static gcmDecrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/secure/android/common/encrypt/aes/b;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static gcmEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/secure/android/common/encrypt/aes/b;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getCBCIv(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const-string p0, "AesCypher"

    const-string v0, "cbc IV is invalid."

    invoke-static {p0, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, ""

    return-object p0
.end method

.method public static getCbcEncryptWord(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method
