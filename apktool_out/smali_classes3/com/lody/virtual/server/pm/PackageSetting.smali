.class public Lcom/lody/virtual/server/pm/PackageSetting;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/server/pm/PackageSetting;",
            ">;"
        }
    .end annotation
.end field

.field public static final CURRENT_VERSION:I = 0x7

.field private static final DEFAULT_USER_STATE:Lcom/lody/virtual/server/pm/PackageUserState;

.field public static final PKG_INI_VERSION_SEVEN:I = 0x7

.field public static final PKG_INI_VERSION_SIX:I = 0x6


# instance fields
.field public appId:I

.field public dynamic:Z

.field public firstInstallTime:J

.field public flag:I

.field public is64bitPackage:Z

.field public lastUpdateTime:J

.field public packageName:Ljava/lang/String;

.field public primaryCpuAbi:Ljava/lang/String;

.field public secondaryCpuAbi:Ljava/lang/String;

.field userState:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/lody/virtual/server/pm/PackageUserState;",
            ">;"
        }
    .end annotation
.end field

.field public version:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/lody/virtual/server/pm/PackageUserState;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/PackageUserState;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lody/virtual/server/pm/PackageSetting;->DEFAULT_USER_STATE:Lcom/lody/virtual/server/pm/PackageUserState;

    .line 7
    .line 8
    new-instance v0, Lcom/lody/virtual/server/pm/PackageSetting$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/PackageSetting$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/lody/virtual/server/pm/PackageSetting;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    const/4 v0, 0x7

    .line 3
    iput v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->version:I

    return-void
.end method

.method constructor <init>(ILandroid/os/Parcel;)V
    .locals 4

    .line 4
    const-class v0, Lcom/lody/virtual/server/pm/PackageUserState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 6
    iput p1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->version:I

    .line 7
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 8
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    .line 9
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->primaryCpuAbi:Ljava/lang/String;

    .line 10
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->secondaryCpuAbi:Ljava/lang/String;

    .line 11
    invoke-virtual {p2}, Landroid/os/Parcel;->readByte()B

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iput-boolean v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->is64bitPackage:Z

    .line 12
    invoke-virtual {p2}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    iput-boolean v2, p0, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 13
    invoke-virtual {p2}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    const/4 v2, 0x6

    if-gt p1, v2, :cond_2

    .line 14
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->readSparseArray(Ljava/lang/ClassLoader;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 15
    :catchall_0
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 16
    new-instance p1, Lcom/lody/virtual/helper/compat/ParcelCompat;

    invoke-direct {p1, p2}, Lcom/lody/virtual/helper/compat/ParcelCompat;-><init>(Landroid/os/Parcel;)V

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/compat/ParcelCompat;->readSparseArray(Ljava/lang/ClassLoader;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    goto :goto_3

    .line 18
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    :goto_2
    if-ge v3, p1, :cond_3

    .line 19
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Lcom/lody/virtual/server/pm/PackageUserState;

    invoke-direct {v2, p2}, Lcom/lody/virtual/server/pm/PackageUserState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 20
    :cond_3
    :goto_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->flag:I

    .line 21
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->firstInstallTime:J

    .line 22
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->lastUpdateTime:J

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAppInfo()Lcom/lody/virtual/remote/InstalledAppInfo;
    .locals 9

    new-instance v8, Lcom/lody/virtual/remote/InstalledAppInfo;

    iget-object v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    iget v3, p0, Lcom/lody/virtual/server/pm/PackageSetting;->flag:I

    iget v4, p0, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    iget-object v5, p0, Lcom/lody/virtual/server/pm/PackageSetting;->primaryCpuAbi:Ljava/lang/String;

    iget-object v6, p0, Lcom/lody/virtual/server/pm/PackageSetting;->secondaryCpuAbi:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/lody/virtual/server/pm/PackageSetting;->is64bitPackage:Z

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/lody/virtual/remote/InstalledAppInfo;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;Z)V

    return-object v8
.end method

.method public getPackagePath()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lcom/lody/virtual/client/env/HostPackageManager;->getApplicationInfo(Ljava/lang/String;J)Landroid/content/pm/ApplicationInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    return-object v0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackage()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getPackageFileExt(Ljava/lang/String;)Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getPackageFile(Ljava/lang/String;)Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public is64bitPackage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->is64bitPackage:Z

    return v0
.end method

.method public isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z
    .locals 1

    and-int/lit16 v0, p2, 0x200

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-static {p1, p2, p3}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->isEnabledLPr(Landroid/content/pm/ComponentInfo;II)Z

    move-result p1

    return p1
.end method

.method public isHidden(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    move-result-object p1

    iget-boolean p1, p1, Lcom/lody/virtual/server/pm/PackageUserState;->hidden:Z

    return p1
.end method

.method public isInstalled(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    move-result-object p1

    iget-boolean p1, p1, Lcom/lody/virtual/server/pm/PackageUserState;->installed:Z

    return p1
.end method

.method public isLaunched(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    move-result-object p1

    iget-boolean p1, p1, Lcom/lody/virtual/server/pm/PackageUserState;->launched:Z

    return p1
.end method

.method public isRunInExtProcess()Z
    .locals 1

    invoke-virtual {p0}, Lcom/lody/virtual/server/pm/PackageSetting;->is64bitPackage()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method modifyUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/lody/virtual/server/pm/PackageUserState;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/lody/virtual/server/pm/PackageUserState;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/PackageUserState;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/lody/virtual/server/pm/PackageUserState;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lcom/lody/virtual/server/pm/PackageSetting;->DEFAULT_USER_STATE:Lcom/lody/virtual/server/pm/PackageUserState;

    .line 13
    .line 14
    return-object p1
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

.method removeUser(I)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->delete(I)V

    return-void
.end method

.method public setHidden(IZ)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->modifyUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    move-result-object p1

    iput-boolean p2, p1, Lcom/lody/virtual/server/pm/PackageUserState;->hidden:Z

    return-void
.end method

.method public setInstalled(IZ)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->modifyUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    move-result-object p1

    iput-boolean p2, p1, Lcom/lody/virtual/server/pm/PackageUserState;->installed:Z

    return-void
.end method

.method public setLaunched(IZ)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->modifyUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    move-result-object p1

    iput-boolean p2, p1, Lcom/lody/virtual/server/pm/PackageUserState;->launched:Z

    return-void
.end method

.method setUserState(IZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->modifyUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-boolean p2, p1, Lcom/lody/virtual/server/pm/PackageUserState;->launched:Z

    .line 6
    .line 7
    iput-boolean p3, p1, Lcom/lody/virtual/server/pm/PackageUserState;->hidden:Z

    .line 8
    .line 9
    iput-boolean p4, p1, Lcom/lody/virtual/server/pm/PackageUserState;->installed:Z

    .line 10
    .line 11
    return-void
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
    .line 28
    .line 29
    .line 30
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->primaryCpuAbi:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->secondaryCpuAbi:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->is64bitPackage:Z

    .line 22
    .line 23
    int-to-byte v0, v0

    .line 24
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 25
    .line 26
    .line 27
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 28
    .line 29
    int-to-byte v0, v0

    .line 30
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 31
    .line 32
    .line 33
    iget v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->version:I

    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    if-gt v0, v1, :cond_0

    .line 37
    .line 38
    iget-object p2, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSparseArray(Landroid/util/SparseArray;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    :goto_0
    if-ge v1, v0, :cond_1

    .line 55
    .line 56
    iget-object v2, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lcom/lody/virtual/server/pm/PackageUserState;

    .line 72
    .line 73
    invoke-virtual {v2, p1, p2}, Lcom/lody/virtual/server/pm/PackageUserState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    :goto_1
    iget p2, p0, Lcom/lody/virtual/server/pm/PackageSetting;->flag:I

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 82
    .line 83
    .line 84
    iget-wide v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->firstInstallTime:J

    .line 85
    .line 86
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 87
    .line 88
    .line 89
    iget-wide v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->lastUpdateTime:J

    .line 90
    .line 91
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 92
    .line 93
    .line 94
    return-void
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
