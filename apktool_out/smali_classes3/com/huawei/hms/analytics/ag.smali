.class public final Lcom/huawei/hms/analytics/ag;
.super Lcom/huawei/hms/analytics/ad;
.source "SourceFile"


# instance fields
.field private ijk:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V
    .locals 3

    new-instance v0, Lcom/huawei/hms/analytics/v;

    invoke-direct {v0, p1, p2}, Lcom/huawei/hms/analytics/v;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hms/analytics/ad;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;Lcom/huawei/hms/analytics/ad;)V

    new-instance p2, Landroid/content/Intent;

    const-string v0, "action.com.heytap.openid.OPEN_ID_SERVICE"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.heytap.openid"

    const-string v2, "com.heytap.openid.IdentifyService"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    new-instance v0, Lcom/huawei/hms/analytics/x;

    invoke-direct {v0, p1, p2, p0}, Lcom/huawei/hms/analytics/x;-><init>(Landroid/content/Context;Landroid/content/Intent;Lcom/huawei/hms/analytics/w;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/ad;->ikl:Lcom/huawei/hms/analytics/x;

    return-void
.end method


# virtual methods
.method public final klm()Z
    .locals 1

    const-string v0, "com.heytap.openid"

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/ad;->klm(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final lmn()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/ad;->ikl:Lcom/huawei/hms/analytics/x;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/x;->lmn()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "OPPO getOaid,bindService error, begin get gaid"

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/ad;->lmn(Ljava/lang/String;)V

    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/x$lmn;)V
    .locals 9

    :try_start_0
    new-instance v0, Lcom/huawei/hms/analytics/ae;

    const-string v1, "com.heytap.openid.IOpenID"

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/x$lmn;->lmn()Landroid/os/IBinder;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/huawei/hms/analytics/ae;-><init>(Ljava/lang/String;Landroid/os/IBinder;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/ad;->klm:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/huawei/hms/analytics/ag;->ijk:Ljava/lang/String;

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/huawei/hms/analytics/ad;->klm:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v5, 0x40

    invoke-virtual {v1, p1, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    const-string v5, "SHA1"

    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    array-length v6, v1

    move v7, v4

    :goto_0
    if-ge v7, v6, :cond_0

    aget-byte v8, v1, v7

    and-int/lit16 v8, v8, 0xff

    or-int/lit16 v8, v8, 0x100

    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/hms/analytics/ag;->ijk:Ljava/lang/String;

    :cond_1
    new-array v1, v2, [Ljava/lang/String;

    aput-object p1, v1, v4

    iget-object p1, p0, Lcom/huawei/hms/analytics/ag;->ijk:Ljava/lang/String;

    aput-object p1, v1, v3

    const-string p1, "OUID"

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/ae;->lmn([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/huawei/hms/analytics/ad;->lmn:Lcom/huawei/hms/analytics/i$lmn;

    const-string v1, ""

    const-string v2, "oaid"

    invoke-interface {v0, p1, v1, v2}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->ikl()V

    return-void

    :catchall_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalAccessException;

    const-string v0, "get sign error"

    invoke-direct {p1, v0}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/ad;->ikl()V

    throw p1
.end method
