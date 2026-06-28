.class public Lcom/lody/virtual/remote/VAppInstallerParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/remote/VAppInstallerParams;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLAG_INSTALL_NOTIFY:I = 0x1

.field public static final FLAG_INSTALL_OVERRIDE_DONT_KILL_APP:I = 0x8

.field public static final FLAG_INSTALL_OVERRIDE_FORBIDDEN:I = 0x4

.field public static final FLAG_INSTALL_OVERRIDE_NO_CHECK:I = 0x2

.field public static final FLAG_INSTALL_OVERRIDE_SKIP_ODEX:I = 0x10

.field public static final MODE_FULL_INSTALL:I = 0x1

.field public static final MODE_INHERIT_EXISTING:I = 0x2


# instance fields
.field private cpuAbiOverride:Ljava/lang/String;

.field private installFlags:I

.field private mode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/remote/VAppInstallerParams$1;

    invoke-direct {v0}, Lcom/lody/virtual/remote/VAppInstallerParams$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/remote/VAppInstallerParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->mode:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->mode:I

    .line 6
    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    .line 9
    iput p2, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->mode:I

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    const/4 v0, 0x1

    .line 12
    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->mode:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->mode:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->cpuAbiOverride:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public addInstallFlags(I)V
    .locals 1

    iget v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    or-int/2addr p1, v0

    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCpuAbiOverride()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->cpuAbiOverride:Ljava/lang/String;

    return-object v0
.end method

.method public getInstallFlags()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    return v0
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->mode:I

    return v0
.end method

.method public removeInstallFlags(I)V
    .locals 1

    iget v0, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    not-int p1, p1

    and-int/2addr p1, v0

    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    return-void
.end method

.method public setCpuAbiOverride(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->cpuAbiOverride:Ljava/lang/String;

    return-void
.end method

.method public setInstallFlags(I)V
    .locals 0

    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    return-void
.end method

.method public setMode(I)V
    .locals 0

    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->mode:I

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->installFlags:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->mode:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/lody/virtual/remote/VAppInstallerParams;->cpuAbiOverride:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
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
.end method
