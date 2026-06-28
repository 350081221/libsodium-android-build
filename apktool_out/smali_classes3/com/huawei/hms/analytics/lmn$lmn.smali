.class public abstract Lcom/huawei/hms/analytics/lmn$lmn;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/lmn;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/lmn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "lmn"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/lmn$lmn$lmn;
    }
.end annotation


# direct methods
.method public static klm()Lcom/huawei/hms/analytics/lmn;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/lmn$lmn$lmn;->lmn:Lcom/huawei/hms/analytics/lmn;

    return-object v0
.end method

.method public static lmn(Landroid/os/IBinder;)Lcom/huawei/hms/analytics/lmn;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.huawei.android.hms.ppskit.IPPSChannelInfoService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/huawei/hms/analytics/lmn;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/huawei/hms/analytics/lmn;

    return-object v0

    :cond_1
    new-instance v0, Lcom/huawei/hms/analytics/lmn$lmn$lmn;

    invoke-direct {v0, p0}, Lcom/huawei/hms/analytics/lmn$lmn$lmn;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const/4 v0, 0x1

    const-string v1, "com.huawei.android.hms.ppskit.IPPSChannelInfoService"

    if-eq p1, v0, :cond_1

    const v2, 0x5f4e5446

    if-eq p1, v2, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v0

    :cond_1
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/huawei/hms/analytics/lmn;->lmn()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v0
.end method
