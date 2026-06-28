.class public Lcom/lody/virtual/os/VUserInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/os/VUserInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLAG_ADMIN:I = 0x2

.field public static final FLAG_DISABLED:I = 0x40

.field public static final FLAG_GUEST:I = 0x4

.field public static final FLAG_INITIALIZED:I = 0x10

.field public static final FLAG_MANAGED_PROFILE:I = 0x20

.field public static final FLAG_MASK_USER_TYPE:I = 0xff

.field public static final FLAG_PRIMARY:I = 0x1

.field public static final FLAG_RESTRICTED:I = 0x8

.field public static final NO_PROFILE_GROUP_ID:I = -0x1


# instance fields
.field public creationTime:J

.field public flags:I

.field public guestToRemove:Z

.field public iconPath:Ljava/lang/String;

.field public id:I

.field public lastLoggedInTime:J

.field public name:Ljava/lang/String;

.field public partial:Z

.field public profileGroupId:I

.field public serialNumber:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/os/VUserInfo$1;

    invoke-direct {v0}, Lcom/lody/virtual/os/VUserInfo$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/os/VUserInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput p1, p0, Lcom/lody/virtual/os/VUserInfo;->id:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/lody/virtual/os/VUserInfo;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 5
    iput-object p2, p0, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    .line 7
    iput-object p3, p0, Lcom/lody/virtual/os/VUserInfo;->iconPath:Ljava/lang/String;

    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/lody/virtual/os/VUserInfo;->profileGroupId:I

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/os/VUserInfo;->iconPath:Ljava/lang/String;

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/lody/virtual/os/VUserInfo;->creationTime:J

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/lody/virtual/os/VUserInfo;->lastLoggedInTime:J

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/os/VUserInfo;->profileGroupId:I

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iput-boolean v1, p0, Lcom/lody/virtual/os/VUserInfo;->guestToRemove:Z

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/lody/virtual/os/VUserInfo$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lody/virtual/os/VUserInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/lody/virtual/os/VUserInfo;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iget-object v0, p1, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 14
    iget-object v0, p1, Lcom/lody/virtual/os/VUserInfo;->iconPath:Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/os/VUserInfo;->iconPath:Ljava/lang/String;

    .line 15
    iget v0, p1, Lcom/lody/virtual/os/VUserInfo;->id:I

    iput v0, p0, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 16
    iget v0, p1, Lcom/lody/virtual/os/VUserInfo;->flags:I

    iput v0, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    .line 17
    iget v0, p1, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    iput v0, p0, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    .line 18
    iget-wide v0, p1, Lcom/lody/virtual/os/VUserInfo;->creationTime:J

    iput-wide v0, p0, Lcom/lody/virtual/os/VUserInfo;->creationTime:J

    .line 19
    iget-wide v0, p1, Lcom/lody/virtual/os/VUserInfo;->lastLoggedInTime:J

    iput-wide v0, p0, Lcom/lody/virtual/os/VUserInfo;->lastLoggedInTime:J

    .line 20
    iget-boolean v0, p1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    iput-boolean v0, p0, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 21
    iget v0, p1, Lcom/lody/virtual/os/VUserInfo;->profileGroupId:I

    iput v0, p0, Lcom/lody/virtual/os/VUserInfo;->profileGroupId:I

    .line 22
    iget-boolean p1, p1, Lcom/lody/virtual/os/VUserInfo;->guestToRemove:Z

    iput-boolean p1, p0, Lcom/lody/virtual/os/VUserInfo;->guestToRemove:Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isAdmin()Z
    .locals 2

    iget v0, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEnabled()Z
    .locals 2

    iget v0, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isGuest()Z
    .locals 2

    iget v0, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isManagedProfile()Z
    .locals 2

    iget v0, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPrimary()Z
    .locals 2

    iget v0, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isRestricted()Z
    .locals 2

    iget v0, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserInfo{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/lody/virtual/os/VUserInfo;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget p2, p0, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/lody/virtual/os/VUserInfo;->iconPath:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lcom/lody/virtual/os/VUserInfo;->flags:I

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget-wide v0, p0, Lcom/lody/virtual/os/VUserInfo;->creationTime:J

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 29
    .line 30
    .line 31
    iget-wide v0, p0, Lcom/lody/virtual/os/VUserInfo;->lastLoggedInTime:J

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 34
    .line 35
    .line 36
    iget-boolean p2, p0, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    iget p2, p0, Lcom/lody/virtual/os/VUserInfo;->profileGroupId:I

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    iget-boolean p2, p0, Lcom/lody/virtual/os/VUserInfo;->guestToRemove:Z

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 49
    .line 50
    .line 51
    return-void
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
.end method
