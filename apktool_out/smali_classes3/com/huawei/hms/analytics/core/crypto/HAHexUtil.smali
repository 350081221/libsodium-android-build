.class public abstract Lcom/huawei/hms/analytics/core/crypto/HAHexUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static byteArray2HexString([B)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lf2/c;->b([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static hexString2ByteArray(Ljava/lang/String;)[B
    .locals 0

    invoke-static {p0}, Lf2/c;->c(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method
