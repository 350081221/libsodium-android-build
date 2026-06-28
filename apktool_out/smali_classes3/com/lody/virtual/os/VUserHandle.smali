.class public final Lcom/lody/virtual/os/VUserHandle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final ALL:Lcom/lody/virtual/os/VUserHandle;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/os/VUserHandle;",
            ">;"
        }
    .end annotation
.end field

.field public static final CURRENT:Lcom/lody/virtual/os/VUserHandle;

.field public static final CURRENT_OR_SELF:Lcom/lody/virtual/os/VUserHandle;

.field public static final FIRST_ISOLATED_UID:I = 0x182b8

.field public static final FIRST_SHARED_APPLICATION_GID:I = 0xc350

.field public static final LAST_ISOLATED_UID:I = 0x1869f

.field public static final LAST_SHARED_APPLICATION_GID:I = 0xea5f

.field public static final MU_ENABLED:Z = true

.field public static final OWNER:Lcom/lody/virtual/os/VUserHandle;

.field public static final PER_USER_RANGE:I = 0x186a0

.field public static final USER_ALL:I = -0x1

.field public static final USER_CURRENT:I = -0x2

.field public static final USER_CURRENT_OR_SELF:I = -0x3

.field public static final USER_NULL:I = -0x2710

.field public static final USER_OWNER:I

.field private static final userHandles:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/lody/virtual/os/VUserHandle;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mHandle:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/lody/virtual/os/VUserHandle;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/lody/virtual/os/VUserHandle;->ALL:Lcom/lody/virtual/os/VUserHandle;

    .line 8
    .line 9
    new-instance v0, Lcom/lody/virtual/os/VUserHandle;

    .line 10
    .line 11
    const/4 v1, -0x2

    .line 12
    invoke-direct {v0, v1}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/lody/virtual/os/VUserHandle;->CURRENT:Lcom/lody/virtual/os/VUserHandle;

    .line 16
    .line 17
    new-instance v0, Lcom/lody/virtual/os/VUserHandle;

    .line 18
    .line 19
    const/4 v1, -0x3

    .line 20
    invoke-direct {v0, v1}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/lody/virtual/os/VUserHandle;->CURRENT_OR_SELF:Lcom/lody/virtual/os/VUserHandle;

    .line 24
    .line 25
    new-instance v0, Lcom/lody/virtual/os/VUserHandle;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/lody/virtual/os/VUserHandle;->OWNER:Lcom/lody/virtual/os/VUserHandle;

    .line 32
    .line 33
    new-instance v0, Lcom/lody/virtual/os/VUserHandle$1;

    .line 34
    .line 35
    invoke-direct {v0}, Lcom/lody/virtual/os/VUserHandle$1;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lcom/lody/virtual/os/VUserHandle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 39
    .line 40
    new-instance v0, Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lcom/lody/virtual/os/VUserHandle;->userHandles:Landroid/util/SparseArray;

    .line 46
    .line 47
    return-void
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

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/lody/virtual/os/VUserHandle;->mHandle:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/lody/virtual/os/VUserHandle;->mHandle:I

    return-void
.end method

.method public static accept(I)Z
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    move-result v0

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static formatUid(I)Ljava/lang/String;
    .locals 1

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    invoke-static {v0, p0}, Lcom/lody/virtual/os/VUserHandle;->formatUid(Ljava/lang/StringBuilder;I)V

    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatUid(Ljava/io/PrintWriter;I)V
    .locals 3

    const/16 v0, 0x2710

    if-ge p1, v0, :cond_0

    .line 14
    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->print(I)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x75

    .line 15
    invoke-virtual {p0, v1}, Ljava/io/PrintWriter;->print(C)V

    .line 16
    invoke-static {p1}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 17
    invoke-static {p1}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    move-result p1

    const v1, 0x182b8

    if-lt p1, v1, :cond_1

    const v2, 0x1869f

    if-gt p1, v2, :cond_1

    const/16 v0, 0x69

    .line 18
    invoke-virtual {p0, v0}, Ljava/io/PrintWriter;->print(C)V

    sub-int/2addr p1, v1

    .line 19
    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->print(I)V

    goto :goto_0

    :cond_1
    if-lt p1, v0, :cond_2

    const/16 v1, 0x61

    .line 20
    invoke-virtual {p0, v1}, Ljava/io/PrintWriter;->print(C)V

    sub-int/2addr p1, v0

    .line 21
    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->print(I)V

    goto :goto_0

    :cond_2
    const/16 v0, 0x73

    .line 22
    invoke-virtual {p0, v0}, Ljava/io/PrintWriter;->print(C)V

    .line 23
    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->print(I)V

    :goto_0
    return-void
.end method

.method public static formatUid(Ljava/lang/StringBuilder;I)V
    .locals 3

    const/16 v0, 0x2710

    if-ge p1, v0, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/16 v1, 0x75

    .line 2
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3
    invoke-static {p1}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 4
    invoke-static {p1}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    move-result p1

    const v1, 0x182b8

    if-lt p1, v1, :cond_1

    const v2, 0x1869f

    if-gt p1, v2, :cond_1

    const/16 v0, 0x69

    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sub-int/2addr p1, v1

    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    if-lt p1, v0, :cond_2

    const/16 v1, 0x61

    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sub-int/2addr p1, v0

    .line 8
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    const/16 v0, 0x73

    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public static getAppId(I)I
    .locals 1

    const v0, 0x186a0

    rem-int/2addr p0, v0

    return p0
.end method

.method public static getAppIdFromSharedAppGid(I)I
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xc350

    .line 6
    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const v2, 0xea5f

    .line 11
    .line 12
    .line 13
    if-gt v0, v2, :cond_0

    .line 14
    .line 15
    add-int/lit16 v0, v0, 0x2710

    .line 16
    .line 17
    sub-int/2addr v0, v1

    .line 18
    return v0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, " is not a shared app gid"

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
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
.end method

.method public static getCallingUserHandle()Lcom/lody/virtual/os/VUserHandle;
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VBinder;->getCallingUid()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Lcom/lody/virtual/os/VUserHandle;->userHandles:Landroid/util/SparseArray;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lcom/lody/virtual/os/VUserHandle;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    new-instance v2, Lcom/lody/virtual/os/VUserHandle;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v2
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

.method public static getCallingUserId()I
    .locals 1

    invoke-static {}, Lcom/lody/virtual/os/VBinder;->getCallingUid()I

    move-result v0

    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result v0

    return v0
.end method

.method public static getUid(II)I
    .locals 1

    const v0, 0x186a0

    mul-int/2addr p0, v0

    rem-int/2addr p1, v0

    add-int/2addr p0, p1

    return p0
.end method

.method public static getUserId(I)I
    .locals 1

    if-gez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const v0, 0x186a0

    div-int/2addr p0, v0

    return p0
.end method

.method public static isApp(I)Z
    .locals 2

    const/4 v0, 0x0

    if-lez p0, :cond_0

    invoke-static {p0}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    move-result p0

    const/16 v1, 0x2710

    if-lt p0, v1, :cond_0

    const/16 v1, 0x4e1f

    if-gt p0, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public static final isIsolated(I)Z
    .locals 2

    const/4 v0, 0x0

    if-lez p0, :cond_0

    invoke-static {p0}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    move-result p0

    const v1, 0x182b8

    if-lt p0, v1, :cond_0

    const v1, 0x1869f

    if-gt p0, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public static final isSameApp(II)Z
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    move-result p0

    invoke-static {p1}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameUser(II)Z
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result p0

    invoke-static {p1}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static myAppId()I
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/VClient;->getVUid()I

    move-result v0

    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    move-result v0

    return v0
.end method

.method public static myUserHandle()Lcom/lody/virtual/os/VUserHandle;
    .locals 2

    new-instance v0, Lcom/lody/virtual/os/VUserHandle;

    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    return-object v0
.end method

.method public static myUserId()I
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/VClient;->getVUid()I

    move-result v0

    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result v0

    return v0
.end method

.method public static readFromParcel(Landroid/os/Parcel;)Lcom/lody/virtual/os/VUserHandle;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, -0x2710

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/lody/virtual/os/VUserHandle;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    return-object v0
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

.method public static realUserId()I
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->myUid()I

    move-result v0

    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result v0

    return v0
.end method

.method public static writeToParcel(Lcom/lody/virtual/os/VUserHandle;Landroid/os/Parcel;)V
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/lody/virtual/os/VUserHandle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    const/16 p0, -0x2710

    .line 2
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    check-cast p1, Lcom/lody/virtual/os/VUserHandle;

    .line 5
    .line 6
    iget v1, p0, Lcom/lody/virtual/os/VUserHandle;->mHandle:I

    .line 7
    .line 8
    iget p1, p1, Lcom/lody/virtual/os/VUserHandle;->mHandle:I
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    :catch_0
    :cond_0
    return v0
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

.method public getIdentifier()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/os/VUserHandle;->mHandle:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/os/VUserHandle;->mHandle:I

    return v0
.end method

.method public final isOwner()Z
    .locals 1

    sget-object v0, Lcom/lody/virtual/os/VUserHandle;->OWNER:Lcom/lody/virtual/os/VUserHandle;

    invoke-virtual {p0, v0}, Lcom/lody/virtual/os/VUserHandle;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VUserHandle{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/lody/virtual/os/VUserHandle;->mHandle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 3
    iget p2, p0, Lcom/lody/virtual/os/VUserHandle;->mHandle:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
