.class public Lcom/lody/virtual/remote/IntentSenderExtData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/remote/IntentSenderExtData;",
            ">;"
        }
    .end annotation
.end field

.field public static final EMPTY:Lcom/lody/virtual/remote/IntentSenderExtData;


# instance fields
.field public fillIn:Landroid/content/Intent;

.field public flagsMask:I

.field public flagsValues:I

.field public options:Landroid/os/Bundle;

.field public requestCode:I

.field public resultTo:Landroid/os/IBinder;

.field public resultWho:Ljava/lang/String;

.field public sender:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v9, Lcom/lody/virtual/remote/IntentSenderExtData;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    move-object v0, v9

    .line 12
    invoke-direct/range {v0 .. v8}, Lcom/lody/virtual/remote/IntentSenderExtData;-><init>(Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;ILandroid/os/Bundle;II)V

    .line 13
    .line 14
    .line 15
    sput-object v9, Lcom/lody/virtual/remote/IntentSenderExtData;->EMPTY:Lcom/lody/virtual/remote/IntentSenderExtData;

    .line 16
    .line 17
    new-instance v0, Lcom/lody/virtual/remote/IntentSenderExtData$1;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/lody/virtual/remote/IntentSenderExtData$1;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/lody/virtual/remote/IntentSenderExtData;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 23
    .line 24
    return-void
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
.end method

.method public constructor <init>(Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;ILandroid/os/Bundle;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->sender:Landroid/os/IBinder;

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->fillIn:Landroid/content/Intent;

    .line 4
    iput-object p3, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->resultTo:Landroid/os/IBinder;

    .line 5
    iput-object p4, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->resultWho:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->requestCode:I

    .line 7
    iput-object p6, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->options:Landroid/os/Bundle;

    .line 8
    iput p7, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->flagsMask:I

    .line 9
    iput p8, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->flagsValues:I

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->sender:Landroid/os/IBinder;

    .line 12
    const-class v0, Landroid/content/Intent;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iput-object v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->fillIn:Landroid/content/Intent;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->resultTo:Landroid/os/IBinder;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->resultWho:Ljava/lang/String;

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->requestCode:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->options:Landroid/os/Bundle;

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->flagsMask:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->flagsValues:I

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
    iget-object v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->sender:Landroid/os/IBinder;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->fillIn:Landroid/content/Intent;

    .line 7
    .line 8
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->resultTo:Landroid/os/IBinder;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->resultWho:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->requestCode:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->options:Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    iget p2, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->flagsMask:I

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    iget p2, p0, Lcom/lody/virtual/remote/IntentSenderExtData;->flagsValues:I

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    return-void
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
