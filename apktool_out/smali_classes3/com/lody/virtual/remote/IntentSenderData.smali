.class public Lcom/lody/virtual/remote/IntentSenderData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/remote/IntentSenderData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public targetPkg:Ljava/lang/String;

.field public token:Landroid/os/IBinder;

.field public type:I

.field public userId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/remote/IntentSenderData$1;

    invoke-direct {v0}, Lcom/lody/virtual/remote/IntentSenderData$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/remote/IntentSenderData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/IntentSenderData;->targetPkg:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/IntentSenderData;->token:Landroid/os/IBinder;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/IntentSenderData;->type:I

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/remote/IntentSenderData;->userId:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/IBinder;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lody/virtual/remote/IntentSenderData;->targetPkg:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/remote/IntentSenderData;->token:Landroid/os/IBinder;

    .line 4
    iput p3, p0, Lcom/lody/virtual/remote/IntentSenderData;->type:I

    .line 5
    iput p4, p0, Lcom/lody/virtual/remote/IntentSenderData;->userId:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getPendingIntent()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/remote/IntentSenderData;->token:Landroid/os/IBinder;

    invoke-static {v0}, Lcom/lody/virtual/helper/compat/PendingIntentCompat;->readPendingIntent(Landroid/os/IBinder;)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method public update(Lcom/lody/virtual/remote/IntentSenderData;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/lody/virtual/remote/IntentSenderData;->targetPkg:Ljava/lang/String;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/lody/virtual/remote/IntentSenderData;->targetPkg:Ljava/lang/String;

    .line 4
    .line 5
    iget p1, p1, Lcom/lody/virtual/remote/IntentSenderData;->type:I

    .line 6
    .line 7
    iput p1, p0, Lcom/lody/virtual/remote/IntentSenderData;->type:I

    .line 8
    .line 9
    return-void
    .line 10
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

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/remote/IntentSenderData;->targetPkg:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/lody/virtual/remote/IntentSenderData;->token:Landroid/os/IBinder;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lcom/lody/virtual/remote/IntentSenderData;->type:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lcom/lody/virtual/remote/IntentSenderData;->userId:I

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    .line 20
    .line 21
    return-void
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
