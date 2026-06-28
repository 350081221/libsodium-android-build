.class public final Lcom/huawei/hms/analytics/de;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final lmn:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "SHA-384"

    const-string v1, "SHA-512"

    const-string v2, "SHA-256"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/de;->lmn:[Ljava/lang/String;

    return-void
.end method

.method public static lmn(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "SHA-256"

    invoke-static {p0, v0}, Lcom/huawei/hms/analytics/de;->lmn(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static lmn(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    const-string v2, "SHA"

    if-nez v0, :cond_6

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/huawei/hms/analytics/de;->lmn:[Ljava/lang/String;

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/4 v6, 0x1

    if-ge v5, v3, :cond_1

    aget-object v7, v0, v5

    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    move v0, v6

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_1
    if-nez v0, :cond_2

    const-string p0, "algorithm is not safe or legal"

    :goto_2
    invoke-static {v2, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_2
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    if-eqz p0, :cond_5

    array-length p1, p0

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    array-length v0, p0

    :goto_3
    if-ge v4, v0, :cond_4

    aget-byte v3, p0, v4

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v5, v6, :cond_3

    const/16 v5, 0x30

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_5
    return-object v1

    :catch_0
    const-string p0, "Error in generate SHA NoSuchAlgorithmException"

    goto :goto_2

    :catch_1
    const-string p0, "Error in generate SHA UnsupportedEncodingException"

    goto :goto_2

    :goto_4
    return-object v1

    :cond_6
    const-string p0, "content or algorithm is null."

    invoke-static {v2, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
