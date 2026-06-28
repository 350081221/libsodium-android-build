.class public final Lcom/huawei/hms/analytics/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/i$lmn;


# static fields
.field private static klm:Lcom/huawei/hms/analytics/ad;

.field private static final lmn:Lcom/huawei/hms/analytics/af;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/af;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/af;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static klm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p0, v0, Lcom/huawei/hms/analytics/at;->h:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p1, p0, Lcom/huawei/hms/analytics/at;->j:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p2, p0, Lcom/huawei/hms/analytics/at;->i:Ljava/lang/String;

    return-void
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    const-string v0, "start get oaid"

    const-string v1, "oaidMg"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "CN"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_1

    const-string v0, "RU"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SG"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/by;

    invoke-direct {v0, p1}, Lcom/huawei/hms/analytics/by;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/by;->klm()V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean p1, p1, Lcom/huawei/hms/analytics/at;->m:Z

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    if-nez p1, :cond_1

    invoke-static {v3, v3, v3}, Lcom/huawei/hms/analytics/af;->klm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "The current region does not support oaid collection."

    invoke-static {v1, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean p1, p1, Lcom/huawei/hms/analytics/at;->k:Z

    const-string v0, ""

    if-nez p1, :cond_2

    invoke-static {v0, v0, v0}, Lcom/huawei/hms/analytics/af;->klm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "Stopped collecting oaid."

    invoke-static {v1, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-wide v6, p1, Lcom/huawei/hms/analytics/at;->w:J

    sub-long v6, v4, v6

    const-wide/32 v8, 0x5265c00

    cmp-long p1, v6, v8

    if-gtz p1, :cond_3

    return-void

    :cond_3
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-wide v4, p1, Lcom/huawei/hms/analytics/at;->w:J

    sget-object p1, Lcom/huawei/hms/analytics/af;->klm:Lcom/huawei/hms/analytics/ad;

    if-eqz p1, :cond_4

    move-object v3, p1

    goto/16 :goto_7

    :cond_4
    invoke-static {}, Lcom/huawei/hms/analytics/z;->lmn()Z

    move-result p1

    if-nez p1, :cond_14

    invoke-static {}, Lcom/huawei/hms/analytics/z;->klm()Z

    move-result p1

    if-nez p1, :cond_14

    sget-object p1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "COOLPAD"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_14

    const-string v1, "XIAOLAJIAO"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_14

    const-string v1, "GIONEE"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto/16 :goto_6

    :cond_5
    invoke-static {}, Lcom/huawei/hms/analytics/z;->ikl()Z

    move-result v1

    if-nez v1, :cond_13

    const-string v1, "ONEPLUS"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v1, "MOTOROLA"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v3, Lcom/huawei/hms/analytics/aa;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/aa;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    goto/16 :goto_7

    :cond_7
    invoke-static {}, Lcom/huawei/hms/analytics/z;->ijk()Z

    move-result v1

    if-nez v1, :cond_12

    invoke-static {}, Lcom/huawei/hms/analytics/z;->ghi()Z

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v1, "NUBIA"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v3, Lcom/huawei/hms/analytics/ac;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/ac;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    goto/16 :goto_7

    :cond_9
    const-string v1, "DOOV"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_11

    const-string v1, "FREEMEOS"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x1

    if-nez v1, :cond_b

    const-string v1, "ro.build.freeme.label"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/dg;->lmn(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_1

    :cond_a
    move v1, v2

    goto :goto_2

    :cond_b
    :goto_1
    move v1, v4

    :goto_2
    if-eqz v1, :cond_c

    goto :goto_3

    :cond_c
    const-string v1, "SAMSUNG"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v3, Lcom/huawei/hms/analytics/ah;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/ah;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    goto :goto_7

    :cond_d
    invoke-static {}, Lcom/huawei/hms/analytics/z;->hij()Z

    move-result v1

    if-eqz v1, :cond_e

    new-instance v3, Lcom/huawei/hms/analytics/ai;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/ai;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    goto :goto_7

    :cond_e
    const-string v1, "MEIZU"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_f

    const-string p1, "FLYME"

    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    :cond_f
    move v2, v4

    :cond_10
    if-eqz v2, :cond_15

    new-instance v3, Lcom/huawei/hms/analytics/ab;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/ab;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    goto :goto_7

    :cond_11
    :goto_3
    new-instance v3, Lcom/huawei/hms/analytics/y;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/y;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    goto :goto_7

    :cond_12
    :goto_4
    new-instance v3, Lcom/huawei/hms/analytics/aj;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/aj;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    goto :goto_7

    :cond_13
    :goto_5
    new-instance v3, Lcom/huawei/hms/analytics/ag;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/ag;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    goto :goto_7

    :cond_14
    :goto_6
    new-instance v3, Lcom/huawei/hms/analytics/y;

    sget-object p1, Lcom/huawei/hms/analytics/af;->lmn:Lcom/huawei/hms/analytics/af;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hms/analytics/y;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    :cond_15
    :goto_7
    sput-object v3, Lcom/huawei/hms/analytics/af;->klm:Lcom/huawei/hms/analytics/ad;

    if-nez v3, :cond_16

    invoke-static {v0, v0, v0}, Lcom/huawei/hms/analytics/af;->klm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_16
    invoke-virtual {v3}, Lcom/huawei/hms/analytics/ad;->klm()Z

    move-result p0

    if-eqz p0, :cond_17

    sget-object p0, Lcom/huawei/hms/analytics/af;->klm:Lcom/huawei/hms/analytics/ad;

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->lmn()V

    return-void

    :cond_17
    sget-object p0, Lcom/huawei/hms/analytics/af;->klm:Lcom/huawei/hms/analytics/ad;

    const-string p1, "No support collect oid"

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/ad;->lmn(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/cy;->klm()Ljava/lang/String;

    move-result-object p1

    const-string p2, ""

    const-string p3, "aaid"

    :cond_0
    invoke-static {p1, p2, p3}, Lcom/huawei/hms/analytics/af;->klm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
