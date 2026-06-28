.class public final Lcom/lody/virtual/remote/InstalledAppInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/remote/InstalledAppInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public appId:I

.field public dynamic:Z

.field public flag:I

.field public is64bit:Z

.field public packageName:Ljava/lang/String;

.field public primaryCpuAbi:Ljava/lang/String;

.field public secondaryCpuAbi:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/remote/InstalledAppInfo$1;

    invoke-direct {v0}, Lcom/lody/virtual/remote/InstalledAppInfo$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/remote/InstalledAppInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->dynamic:Z

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->flag:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->appId:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->primaryCpuAbi:Ljava/lang/String;

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->secondaryCpuAbi:Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iput-boolean v1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->is64bit:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->dynamic:Z

    .line 4
    iput p3, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->flag:I

    .line 5
    iput p4, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->appId:I

    .line 6
    iput-object p5, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->primaryCpuAbi:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->secondaryCpuAbi:Ljava/lang/String;

    .line 8
    iput-boolean p7, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->is64bit:Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getApkPath()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackage()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/lody/virtual/remote/InstalledAppInfo;->getApkPath(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getApkPath(Z)Ljava/lang/String;
    .locals 3

    .line 2
    iget-boolean v0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->dynamic:Z

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    move-result-object p1

    iget-object v0, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/lody/virtual/client/env/HostPackageManager;->getApplicationInfo(Ljava/lang/String;J)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    .line 4
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    invoke-static {p1}, Lcom/lody/virtual/os/VEnvironment;->getPackageFileExt(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    invoke-static {p1}, Lcom/lody/virtual/os/VEnvironment;->getPackageFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getApplicationInfo(I)Landroid/content/pm/ApplicationInfo;
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lcom/lody/virtual/client/ipc/VPackageManager;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isVAppProcess()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Ljava/io/File;

    .line 25
    .line 26
    iget-object v1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/lody/virtual/remote/InstalledAppInfo;->getApkPath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v0, p1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 44
    .line 45
    :cond_0
    return-object p1
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

.method public getInstalledUsers()[I
    .locals 2

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    iget-object v1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->getPackageInstalledUsers(Ljava/lang/String;)[I

    move-result-object v0

    return-object v0
.end method

.method public getOatFile()Ljava/io/File;
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackage()Z

    move-result v0

    sget-object v1, Lmirror/dalvik/system/VMRuntime;->getCurrentInstructionSet:Lmirror/RefStaticMethod;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/remote/InstalledAppInfo;->getOatFile(ZLjava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public getOatFile(ZLjava/lang/String;)Ljava/io/File;
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/lody/virtual/os/VEnvironment;->getOatFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/lody/virtual/os/VEnvironment;->getOatFileExt(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getOatPath()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/lody/virtual/remote/InstalledAppInfo;->getOatFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPackageInfo(I)Landroid/content/pm/PackageInfo;
    .locals 3

    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lcom/lody/virtual/client/ipc/VPackageManager;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1
.end method

.method public getSplitNames()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    iget-object v1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->getInstalledSplitNames(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public isLaunched(I)Z
    .locals 2

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    iget-object v1, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/lody/virtual/client/core/VirtualCore;->isPackageLaunched(ILjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p2, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->dynamic:Z

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->flag:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->appId:I

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->primaryCpuAbi:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->secondaryCpuAbi:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-boolean p2, p0, Lcom/lody/virtual/remote/InstalledAppInfo;->is64bit:Z

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 34
    .line 35
    .line 36
    return-void
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
