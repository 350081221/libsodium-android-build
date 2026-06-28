.class public final Lcom/huawei/hms/analytics/dk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static lmn(Landroid/content/Context;Ljava/lang/String;II)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p2

    if-ne p2, v0, :cond_1

    return v0

    :cond_1
    invoke-static {p1}, Lcom/huawei/hms/analytics/dk;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_2

    return p2

    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, p3}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_4

    array-length v1, p3

    if-gtz v1, :cond_3

    goto :goto_0

    :cond_3
    aget-object v1, p3, p2

    goto :goto_1

    :cond_4
    :goto_0
    return v0

    :cond_5
    :goto_1
    invoke-static {p0, p1, v1}, Lcom/huawei/hms/analytics/dk;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    if-eqz p0, :cond_6

    const/4 p0, -0x2

    return p0

    :cond_6
    return p2
.end method

.method private static lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-class v0, Landroid/app/AppOpsManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    if-nez p0, :cond_0

    const/4 p0, -0x2

    return p0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/app/AppOpsManager;->noteProxyOpNoThrow(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static lmn(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Landroid/app/AppOpsManager;->permissionToOp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
