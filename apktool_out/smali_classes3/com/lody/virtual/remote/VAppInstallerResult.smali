.class public Lcom/lody/virtual/remote/VAppInstallerResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/remote/VAppInstallerResult;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLAG_IS_SPLIT_PACKAGE:I = 0x1

.field public static final FLAG_PACKAGE_UPDATED:I = 0x2

.field public static final STATUS_FAILURE_ABORTED:I = 0x3

.field public static final STATUS_FAILURE_BLOCKED:I = 0x2

.field public static final STATUS_FAILURE_CONFLICT:I = 0x5

.field public static final STATUS_FAILURE_INCOMPATIBLE:I = 0x7

.field public static final STATUS_FAILURE_INVALID:I = 0x4

.field public static final STATUS_FAILURE_NO_BASE_APK:I = 0x8

.field public static final STATUS_FAILURE_STORAGE:I = 0x6

.field public static final STATUS_SUCCESS:I


# instance fields
.field public flags:I

.field public packageName:Ljava/lang/String;

.field public status:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/remote/VAppInstallerResult$1;

    invoke-direct {v0}, Lcom/lody/virtual/remote/VAppInstallerResult$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/remote/VAppInstallerResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 7
    iput p2, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->flags:I

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->packageName:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->flags:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->packageName:Ljava/lang/String;

    .line 14
    iput p2, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->packageName:Ljava/lang/String;

    .line 10
    iput p2, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 11
    iput p3, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->flags:I

    return-void
.end method

.method public static create(I)Lcom/lody/virtual/remote/VAppInstallerResult;
    .locals 1

    .line 2
    new-instance v0, Lcom/lody/virtual/remote/VAppInstallerResult;

    invoke-direct {v0, p0}, Lcom/lody/virtual/remote/VAppInstallerResult;-><init>(I)V

    return-object v0
.end method

.method public static create(Ljava/lang/String;I)Lcom/lody/virtual/remote/VAppInstallerResult;
    .locals 1

    .line 1
    new-instance v0, Lcom/lody/virtual/remote/VAppInstallerResult;

    invoke-direct {v0, p0, p1}, Lcom/lody/virtual/remote/VAppInstallerResult;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lcom/lody/virtual/remote/VAppInstallerResult;->flags:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

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
