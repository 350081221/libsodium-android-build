.class public final Lcom/huawei/hms/analytics/aj;
.super Lcom/huawei/hms/analytics/ad;
.source "SourceFile"


# instance fields
.field private hij:Ljava/lang/Object;

.field private ijk:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/v;

    invoke-direct {v0, p1, p2}, Lcom/huawei/hms/analytics/v;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hms/analytics/ad;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;Lcom/huawei/hms/analytics/ad;)V

    :try_start_0
    const-string p1, "com.android.id.impl.IdProviderImpl"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/aj;->ijk:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/aj;->hij:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "miOaid"

    const-string p2, "invoke class Exception"

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private ijk()Ljava/lang/String;
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/aj;->ijk:Ljava/lang/Class;

    const-string v1, "getOAID"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Landroid/content/Context;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/aj;->hij:Ljava/lang/Object;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/hms/analytics/ad;->klm:Landroid/content/Context;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "miOaid"

    const-string v1, "invoke method Exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v0, ""

    return-object v0
.end method


# virtual methods
.method public final klm()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/aj;->hij:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lmn()V
    .locals 4

    invoke-direct {p0}, Lcom/huawei/hms/analytics/aj;->ijk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "false"

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/ad;->lmn:Lcom/huawei/hms/analytics/i$lmn;

    const-string v3, "oaid"

    invoke-interface {v2, v0, v1, v3}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
