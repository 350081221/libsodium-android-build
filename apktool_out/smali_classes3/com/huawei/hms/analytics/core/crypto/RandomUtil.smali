.class public final Lcom/huawei/hms/analytics/core/crypto/RandomUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/hms/analytics/core/crypto/RandomUtil;


# instance fields
.field private final b:Ljava/security/SecureRandom;


# direct methods
.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Lf2/b;->i(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setBouncycastleFlag exception. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RandomUtil"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-static {}, Lf2/b;->c()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->b:Ljava/security/SecureRandom;

    return-void
.end method

.method private static declared-synchronized a()V
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->a:Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->a:Lcom/huawei/hms/analytics/core/crypto/RandomUtil;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static getInstance()Lcom/huawei/hms/analytics/core/crypto/RandomUtil;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->a:Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->a()V

    :cond_0
    sget-object v0, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->a:Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    return-object v0
.end method


# virtual methods
.method public final generateSecureRandom(I)[B
    .locals 1

    new-array p1, p1, [B

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->b:Ljava/security/SecureRandom;

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object p1
.end method

.method public final generateSecureRandomStr(I)Ljava/lang/String;
    .locals 1

    new-array p1, p1, [B

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->b:Ljava/security/SecureRandom;

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {p1}, Lcom/huawei/hms/analytics/core/crypto/HAHexUtil;->byteArray2HexString([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
