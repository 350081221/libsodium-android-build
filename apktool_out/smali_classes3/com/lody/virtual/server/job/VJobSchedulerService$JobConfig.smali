.class public final Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/job/VJobSchedulerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "JobConfig"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public extras:Landroid/os/PersistableBundle;

.field public serviceName:Ljava/lang/String;

.field public virtualJobId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig$1;

    invoke-direct {v0}, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Landroid/os/PersistableBundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->virtualJobId:I

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->serviceName:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->extras:Landroid/os/PersistableBundle;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->virtualJobId:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->serviceName:Ljava/lang/String;

    .line 8
    const-class v0, Landroid/os/PersistableBundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/PersistableBundle;

    iput-object p1, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->extras:Landroid/os/PersistableBundle;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->virtualJobId:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->serviceName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->extras:Landroid/os/PersistableBundle;

    .line 12
    .line 13
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

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
