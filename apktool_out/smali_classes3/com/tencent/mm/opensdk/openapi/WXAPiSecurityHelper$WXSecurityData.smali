.class Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "WXSecurityData"
.end annotation


# instance fields
.field appid:Ljava/lang/String;

.field lastStoreTimeStampSecond:J

.field respDataJson:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;->appid:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;->respDataJson:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;-><init>()V

    return-void
.end method


# virtual methods
.method public isBasicParamsAllowed()Z
    .locals 9

    iget-wide v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;->lastStoreTimeStampSecond:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lez v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    div-long/2addr v5, v7

    cmp-long v0, v0, v5

    if-gez v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget-object v1, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;->appid:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/mm/opensdk/utils/b;->b(Ljava/lang/String;)Z

    move-result v1

    xor-int/2addr v1, v4

    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;->respDataJson:Ljava/lang/String;

    invoke-static {v2}, Lcom/tencent/mm/opensdk/utils/b;->b(Ljava/lang/String;)Z

    move-result v2

    xor-int/2addr v2, v4

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    move v3, v4

    :cond_1
    return v3
.end method
