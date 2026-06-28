.class public Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;
.super Lcom/lody/virtual/helper/PersistenceLayer;
.source "SourceFile"


# instance fields
.field private mService:Lcom/lody/virtual/server/device/VDeviceManagerService;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/device/VDeviceManagerService;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getDeviceInfoFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/lody/virtual/helper/PersistenceLayer;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;->mService:Lcom/lody/virtual/server/device/VDeviceManagerService;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public getCurrentVersion()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public onPersistenceFileDamage()V
    .locals 1

    invoke-virtual {p0}, Lcom/lody/virtual/helper/PersistenceLayer;->getPersistenceFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public readPersistenceData(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;->mService:Lcom/lody/virtual/server/device/VDeviceManagerService;

    .line 2
    .line 3
    iget-object p2, p2, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/lody/virtual/helper/collection/SparseArray;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v2, Lcom/lody/virtual/remote/VDeviceConfig;

    .line 21
    .line 22
    invoke-direct {v2, p1}, Lcom/lody/virtual/remote/VDeviceConfig;-><init>(Landroid/os/Parcel;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v0, v2}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move v0, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public verifyMagic(Landroid/os/Parcel;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public writeMagic(Landroid/os/Parcel;)V
    .locals 0

    return-void
.end method

.method public writePersistenceData(Landroid/os/Parcel;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;->mService:Lcom/lody/virtual/server/device/VDeviceManagerService;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/collection/SparseArray;->keyAt(I)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Lcom/lody/virtual/remote/VDeviceConfig;

    .line 25
    .line 26
    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, p1, v2}, Lcom/lody/virtual/remote/VDeviceConfig;->writeToParcel(Landroid/os/Parcel;I)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
