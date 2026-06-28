.class public Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;",
            ">;"
        }
    .end annotation
.end field

.field public static final CURRENT_VERSION:I = 0x5

.field private static final DEFAULT_USER_STATE:Lcom/lody/virtual/server/pm/PackageUserState;

.field public static final MODE_APP_COPY_APK:I = 0x0

.field public static final MODE_APP_USE_OUTSIDE_APK:I = 0x1


# instance fields
.field public appId:I

.field public appMode:I

.field public firstInstallTime:J

.field public flag:I

.field public lastUpdateTime:J

.field public packageName:Ljava/lang/String;

.field public userState:Landroid/util/SparseArray;
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
    sput-object v0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->DEFAULT_USER_STATE:Lcom/lody/virtual/server/pm/PackageUserState;

    .line 7
    .line 8
    new-instance v0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->CREATOR:Landroid/os/Parcelable$Creator;

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

    iput-object v0, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->userState:Landroid/util/SparseArray;

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->version:I

    return-void
.end method

.method public constructor <init>(ILandroid/os/Parcel;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->userState:Landroid/util/SparseArray;

    .line 6
    iput p1, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->version:I

    .line 7
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->packageName:Ljava/lang/String;

    .line 8
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->appId:I

    .line 9
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->appMode:I

    .line 10
    const-class p1, Lcom/lody/virtual/server/pm/PackageUserState;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->readSparseArray(Ljava/lang/ClassLoader;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->userState:Landroid/util/SparseArray;

    .line 11
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->flag:I

    .line 12
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->firstInstallTime:J

    .line 13
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->lastUpdateTime:J

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->appId:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->appMode:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->userState:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSparseArray(Landroid/util/SparseArray;)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->flag:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget-wide v0, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->firstInstallTime:J

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 29
    .line 30
    .line 31
    iget-wide v0, p0, Lcom/lody/virtual/server/pm/legacy/PackageSettingV5;->lastUpdateTime:J

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

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
