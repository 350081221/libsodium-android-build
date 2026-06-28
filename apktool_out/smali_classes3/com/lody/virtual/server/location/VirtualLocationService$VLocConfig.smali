.class Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/location/VirtualLocationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "VLocConfig"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field allCell:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/vloc/VCell;",
            ">;"
        }
    .end annotation
.end field

.field cell:Lcom/lody/virtual/remote/vloc/VCell;

.field location:Lcom/lody/virtual/remote/vloc/VLocation;

.field mode:I

.field neighboringCell:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/vloc/VCell;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig$1;

    invoke-direct {v0}, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 4
    const-class v0, Lcom/lody/virtual/remote/vloc/VCell;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/remote/vloc/VCell;

    iput-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->cell:Lcom/lody/virtual/remote/vloc/VCell;

    .line 5
    sget-object v0, Lcom/lody/virtual/remote/vloc/VCell;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->allCell:Ljava/util/List;

    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->neighboringCell:Ljava/util/List;

    .line 7
    const-class v0, Lcom/lody/virtual/remote/vloc/VLocation;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/lody/virtual/remote/vloc/VLocation;

    iput-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public set(Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 2
    .line 3
    iput v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 4
    .line 5
    iget-object v0, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->cell:Lcom/lody/virtual/remote/vloc/VCell;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->cell:Lcom/lody/virtual/remote/vloc/VCell;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->allCell:Ljava/util/List;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->allCell:Ljava/util/List;

    .line 12
    .line 13
    iget-object v0, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->neighboringCell:Ljava/util/List;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->neighboringCell:Ljava/util/List;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->cell:Lcom/lody/virtual/remote/vloc/VCell;

    .line 7
    .line 8
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->allCell:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->neighboringCell:Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 22
    .line 23
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 24
    .line 25
    .line 26
    return-void
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
