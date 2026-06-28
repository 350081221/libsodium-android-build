.class public final Lcom/huawei/hms/analytics/framework/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/huawei/hms/analytics/framework/b/e;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/hms/analytics/framework/b/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/framework/b/e;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/framework/b/e;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/framework/b/e;->b:Lcom/huawei/hms/analytics/framework/b/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/b/e;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/huawei/hms/analytics/framework/b/e;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/b/e;->b:Lcom/huawei/hms/analytics/framework/b/e;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    invoke-interface {v0, p0}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getPubKeyVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/huawei/hms/analytics/framework/b/d;Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getRsaPublicKey(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    array-length v1, v0

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->getInstance()Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->generateSecureRandomStr(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/crypto/RsaCipher;->encrypt([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/huawei/hms/analytics/framework/b/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/b/d;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/framework/b/d;->a([B)V

    iput-object v2, p0, Lcom/huawei/hms/analytics/framework/b/d;->b:Ljava/lang/String;

    iput-object v1, p0, Lcom/huawei/hms/analytics/framework/b/d;->a:Ljava/lang/String;

    iput-wide v3, p0, Lcom/huawei/hms/analytics/framework/b/d;->c:J

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "pub key is error"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
