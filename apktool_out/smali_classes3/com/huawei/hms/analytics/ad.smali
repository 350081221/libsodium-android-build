.class public abstract Lcom/huawei/hms/analytics/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/w;


# instance fields
.field private final ijk:Lcom/huawei/hms/analytics/ad;

.field protected ikl:Lcom/huawei/hms/analytics/x;

.field protected final klm:Landroid/content/Context;

.field protected final lmn:Lcom/huawei/hms/analytics/i$lmn;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;Lcom/huawei/hms/analytics/ad;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/ad;->klm:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/hms/analytics/ad;->lmn:Lcom/huawei/hms/analytics/i$lmn;

    iput-object p3, p0, Lcom/huawei/hms/analytics/ad;->ijk:Lcom/huawei/hms/analytics/ad;

    return-void
.end method

.method private lmn(Lcom/huawei/hms/analytics/ad;)Z
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/ad;->klm()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/ad;->lmn()V

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p1, p1, Lcom/huawei/hms/analytics/ad;->ijk:Lcom/huawei/hms/analytics/ad;

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/ad;->lmn(Lcom/huawei/hms/analytics/ad;)Z

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ikl()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/ad;->ikl:Lcom/huawei/hms/analytics/x;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, v0, Lcom/huawei/hms/analytics/x;->klm:Lcom/huawei/hms/analytics/x$lmn;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/huawei/hms/analytics/x;->lmn:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    const-string v0, "oaidHelper"

    const-string v1, "unBind service exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public abstract klm()Z
.end method

.method public final klm(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/ad;->klm:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v2, 0x4000

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    return v0
.end method

.method public abstract lmn()V
.end method

.method public lmn(Lcom/huawei/hms/analytics/x$lmn;)V
    .locals 0

    return-void
.end method

.method public lmn(Ljava/lang/String;)V
    .locals 1

    const-string v0, "oaidHelper"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/ad;->ijk:Lcom/huawei/hms/analytics/ad;

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/ad;->lmn(Lcom/huawei/hms/analytics/ad;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/huawei/hms/analytics/ad;->lmn:Lcom/huawei/hms/analytics/i$lmn;

    const-string v0, ""

    invoke-interface {p1, v0, v0, v0}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
