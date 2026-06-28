.class public Lcom/lody/virtual/server/content/VSyncInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/server/content/VSyncInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static final REDACTED_ACCOUNT:Landroid/accounts/Account;


# instance fields
.field public final account:Landroid/accounts/Account;

.field public final authority:Ljava/lang/String;

.field public final authorityId:I

.field public final startTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/accounts/Account;

    .line 2
    .line 3
    const-string v1, "*****"

    .line 4
    .line 5
    invoke-direct {v0, v1, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/lody/virtual/server/content/VSyncInfo;->REDACTED_ACCOUNT:Landroid/accounts/Account;

    .line 9
    .line 10
    new-instance v0, Lcom/lody/virtual/server/content/VSyncInfo$1;

    .line 11
    .line 12
    invoke-direct {v0}, Lcom/lody/virtual/server/content/VSyncInfo$1;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/lody/virtual/server/content/VSyncInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>(ILandroid/accounts/Account;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authorityId:I

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/server/content/VSyncInfo;->account:Landroid/accounts/Account;

    .line 4
    iput-object p3, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authority:Ljava/lang/String;

    .line 5
    iput-wide p4, p0, Lcom/lody/virtual/server/content/VSyncInfo;->startTime:J

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authorityId:I

    .line 13
    const-class v0, Landroid/accounts/Account;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/accounts/Account;

    iput-object v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->account:Landroid/accounts/Account;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authority:Ljava/lang/String;

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->startTime:J

    return-void
.end method

.method public constructor <init>(Lcom/lody/virtual/server/content/VSyncInfo;)V
    .locals 3

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iget v0, p1, Lcom/lody/virtual/server/content/VSyncInfo;->authorityId:I

    iput v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authorityId:I

    .line 8
    new-instance v0, Landroid/accounts/Account;

    iget-object v1, p1, Lcom/lody/virtual/server/content/VSyncInfo;->account:Landroid/accounts/Account;

    iget-object v2, v1, Landroid/accounts/Account;->name:Ljava/lang/String;

    iget-object v1, v1, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->account:Landroid/accounts/Account;

    .line 9
    iget-object v0, p1, Lcom/lody/virtual/server/content/VSyncInfo;->authority:Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authority:Ljava/lang/String;

    .line 10
    iget-wide v0, p1, Lcom/lody/virtual/server/content/VSyncInfo;->startTime:J

    iput-wide v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->startTime:J

    return-void
.end method

.method public static createAccountRedacted(ILjava/lang/String;J)Lcom/lody/virtual/server/content/VSyncInfo;
    .locals 7

    new-instance v6, Lcom/lody/virtual/server/content/VSyncInfo;

    sget-object v2, Lcom/lody/virtual/server/content/VSyncInfo;->REDACTED_ACCOUNT:Landroid/accounts/Account;

    move-object v0, v6

    move v1, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/lody/virtual/server/content/VSyncInfo;-><init>(ILandroid/accounts/Account;Ljava/lang/String;J)V

    return-object v6
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toSyncInfo()Landroid/content/SyncInfo;
    .locals 4

    sget-object v0, Lmirror/android/content/SyncInfo;->ctor:Lmirror/RefConstructor;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authorityId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/lody/virtual/server/content/VSyncInfo;->account:Landroid/accounts/Account;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authority:Ljava/lang/String;

    aput-object v3, v1, v2

    iget-wide v2, p0, Lcom/lody/virtual/server/content/VSyncInfo;->startTime:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SyncInfo;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authorityId:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->account:Landroid/accounts/Account;

    .line 7
    .line 8
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/lody/virtual/server/content/VSyncInfo;->authority:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, Lcom/lody/virtual/server/content/VSyncInfo;->startTime:J

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

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
