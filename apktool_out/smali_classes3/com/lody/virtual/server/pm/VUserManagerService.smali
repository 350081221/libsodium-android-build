.class public Lcom/lody/virtual/server/pm/VUserManagerService;
.super Lcom/lody/virtual/server/interfaces/IUserManager$Stub;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# static fields
.field private static final ATTR_CREATION_TIME:Ljava/lang/String; = "created"

.field private static final ATTR_FLAGS:Ljava/lang/String; = "flags"

.field private static final ATTR_ICON_PATH:Ljava/lang/String; = "icon"

.field private static final ATTR_ID:Ljava/lang/String; = "id"

.field private static final ATTR_LAST_LOGGED_IN_TIME:Ljava/lang/String; = "lastLoggedIn"

.field private static final ATTR_NEXT_SERIAL_NO:Ljava/lang/String; = "nextSerialNumber"

.field private static final ATTR_PARTIAL:Ljava/lang/String; = "partial"

.field private static final ATTR_SERIAL_NO:Ljava/lang/String; = "serialNumber"

.field private static final ATTR_USER_VERSION:Ljava/lang/String; = "version"

.field private static final DBG:Z = false

.field private static final EPOCH_PLUS_30_YEARS:J = 0xdc46c32800L

.field private static final LOG_TAG:Ljava/lang/String; = "VUserManagerService"

.field private static final MIN_USER_ID:I = 0x1

.field private static final TAG_NAME:Ljava/lang/String; = "name"

.field private static final TAG_USER:Ljava/lang/String; = "user"

.field private static final TAG_USERS:Ljava/lang/String; = "users"

.field private static final USER_INFO_DIR:Ljava/lang/String;

.field private static final USER_LIST_FILENAME:Ljava/lang/String; = "userlist.xml"

.field private static final USER_PHOTO_FILENAME:Ljava/lang/String; = "photo.png"

.field private static final USER_VERSION:I = 0x1

.field private static sInstance:Lcom/lody/virtual/server/pm/VUserManagerService;


# instance fields
.field private final mBaseUserPath:Ljava/io/File;

.field private final mContext:Landroid/content/Context;

.field private mGuestEnabled:Z

.field private final mInstallLock:Ljava/lang/Object;

.field private mNextSerialNumber:I

.field private mNextUserId:I

.field private final mPackagesLock:Ljava/lang/Object;

.field private final mPm:Lcom/lody/virtual/server/pm/VPackageManagerService;

.field private mRemovingUserIds:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mUserIds:[I

.field private final mUserListFile:Ljava/io/File;

.field private mUserVersion:I

.field private mUsers:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/lody/virtual/os/VUserInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mUsersDir:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "system"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "users"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/lody/virtual/server/pm/VUserManagerService;->USER_INFO_DIR:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/lody/virtual/server/pm/VPackageManagerService;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    new-instance v6, Ljava/io/File;

    .line 2
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    const-string v1, "user"

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 3
    invoke-direct/range {v0 .. v6}, Lcom/lody/virtual/server/pm/VUserManagerService;-><init>(Landroid/content/Context;Lcom/lody/virtual/server/pm/VPackageManagerService;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/File;Ljava/io/File;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/lody/virtual/server/pm/VPackageManagerService;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/File;Ljava/io/File;)V
    .locals 3

    .line 4
    invoke-direct {p0}, Lcom/lody/virtual/server/interfaces/IUserManager$Stub;-><init>()V

    .line 5
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 6
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mRemovingUserIds:Ljava/util/HashSet;

    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextUserId:I

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserVersion:I

    .line 9
    iput-object p1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mContext:Landroid/content/Context;

    .line 10
    iput-object p2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPm:Lcom/lody/virtual/server/pm/VPackageManagerService;

    .line 11
    iput-object p3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mInstallLock:Ljava/lang/Object;

    .line 12
    iput-object p4, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 13
    monitor-enter p3

    .line 14
    :try_start_0
    monitor-enter p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    new-instance p1, Ljava/io/File;

    sget-object p2, Lcom/lody/virtual/server/pm/VUserManagerService;->USER_INFO_DIR:Ljava/lang/String;

    invoke-direct {p1, p5, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsersDir:Ljava/io/File;

    .line 16
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 17
    new-instance p2, Ljava/io/File;

    const-string p5, "0"

    invoke-direct {p2, p1, p5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 19
    iput-object p6, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mBaseUserPath:Ljava/io/File;

    .line 20
    new-instance p2, Ljava/io/File;

    const-string p5, "userlist.xml"

    invoke-direct {p2, p1, p5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserListFile:Ljava/io/File;

    .line 21
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->readUserListLocked()V

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    move p2, v0

    .line 23
    :goto_0
    iget-object p5, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    invoke-virtual {p5}, Landroid/util/SparseArray;->size()I

    move-result p5

    if-ge p2, p5, :cond_1

    .line 24
    iget-object p5, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    invoke-virtual {p5, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/lody/virtual/os/VUserInfo;

    .line 25
    iget-boolean p6, p5, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    if-eqz p6, :cond_0

    if-eqz p2, :cond_0

    .line 26
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    move p2, v0

    .line 27
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p5

    if-ge p2, p5, :cond_2

    .line 28
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/lody/virtual/os/VUserInfo;

    const-string p6, "VUserManagerService"

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Removing partially created user #"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " (name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p5, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p6, v1, v2}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    iget p5, p5, Lcom/lody/virtual/os/VUserInfo;->id:I

    invoke-direct {p0, p5}, Lcom/lody/virtual/server/pm/VUserManagerService;->removeUserStateLocked(I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 31
    :cond_2
    sput-object p0, Lcom/lody/virtual/server/pm/VUserManagerService;->sInstance:Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 32
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :try_start_2
    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    .line 34
    :try_start_3
    monitor-exit p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    .line 35
    monitor-exit p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method static synthetic access$000(Lcom/lody/virtual/server/pm/VUserManagerService;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mInstallLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$100(Lcom/lody/virtual/server/pm/VUserManagerService;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$200(Lcom/lody/virtual/server/pm/VUserManagerService;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->removeUserStateLocked(I)V

    return-void
.end method

.method private fallbackToSingleUserLocked()V
    .locals 5

    .line 1
    new-instance v0, Lcom/lody/virtual/os/VUserInfo;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mContext:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget v2, Lcom/lody/virtual/R$string;->owner_name:I

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/16 v3, 0x13

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/lody/virtual/os/VUserInfo;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-virtual {v1, v4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextSerialNumber:I

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->updateUserIdsLocked()V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserListLocked()V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method public static get()Lcom/lody/virtual/server/pm/VUserManagerService;
    .locals 2

    .line 1
    const-class v0, Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/lody/virtual/server/pm/VUserManagerService;->sInstance:Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
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
.end method

.method private getNextAvailableIdLocked()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextUserId:I

    .line 5
    .line 6
    :goto_0
    const v2, 0x7fffffff

    .line 7
    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-gez v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mRemovingUserIds:Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    iput v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextUserId:I

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return v1

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw v1
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

.method private getUserInfoLocked(I)Lcom/lody/virtual/os/VUserInfo;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/lody/virtual/os/VUserInfo;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v1, v0, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mRemovingUserIds:Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "getUserInfo: unknown user #"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 v0, 0x0

    .line 45
    new-array v0, v0, [Ljava/lang/Object;

    .line 46
    .line 47
    const-string v1, "VUserManagerService"

    .line 48
    .line 49
    invoke-static {v1, p1, v0}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    return-object p1

    .line 54
    :cond_0
    return-object v0
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

.method private isUserLimitReachedLocked()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->getMaxSupportedUsers()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private readIntAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return p3

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return p1

    .line 14
    :catch_0
    return p3
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
.end method

.method private readLongAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-wide p3

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-wide p1

    .line 14
    :catch_0
    return-wide p3
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
.end method

.method private readUser(I)Lcom/lody/virtual/os/VUserInfo;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    new-instance v3, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 7
    .line 8
    new-instance v4, Ljava/io/File;

    .line 9
    .line 10
    iget-object v5, v1, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsersDir:Ljava/io/File;

    .line 11
    .line 12
    new-instance v6, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v7, ".xml"

    .line 25
    .line 26
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v3, v4}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Lcom/lody/virtual/helper/utils/AtomicFile;->openRead()Ljava/io/FileInputStream;

    .line 40
    .line 41
    .line 42
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    :try_start_1
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-interface {v4, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 51
    .line 52
    .line 53
    move-result v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    const/4 v6, 0x1

    .line 55
    const/4 v7, 0x2

    .line 56
    if-eq v5, v7, :cond_0

    .line 57
    .line 58
    if-eq v5, v6, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string v8, "VUserManagerService"

    .line 62
    .line 63
    if-eq v5, v7, :cond_2

    .line 64
    .line 65
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v5, "Unable to read user "

    .line 71
    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v8, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    .line 84
    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    :try_start_3
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 88
    .line 89
    .line 90
    :catch_0
    :cond_1
    return-object v2

    .line 91
    :cond_2
    :try_start_4
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const-string v9, "user"

    .line 96
    .line 97
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    const/4 v9, 0x0

    .line 102
    const-wide/16 v10, 0x0

    .line 103
    .line 104
    if-eqz v5, :cond_8

    .line 105
    .line 106
    const-string v5, "id"

    .line 107
    .line 108
    const/4 v12, -0x1

    .line 109
    invoke-direct {v1, v4, v5, v12}, Lcom/lody/virtual/server/pm/VUserManagerService;->readIntAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eq v5, v0, :cond_4

    .line 114
    .line 115
    const-string v0, "User id does not match the file name"

    .line 116
    .line 117
    invoke-static {v8, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 118
    .line 119
    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    :try_start_5
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 123
    .line 124
    .line 125
    :catch_1
    :cond_3
    return-object v2

    .line 126
    :cond_4
    :try_start_6
    const-string v5, "serialNumber"

    .line 127
    .line 128
    invoke-direct {v1, v4, v5, v0}, Lcom/lody/virtual/server/pm/VUserManagerService;->readIntAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    const-string v8, "flags"

    .line 133
    .line 134
    invoke-direct {v1, v4, v8, v9}, Lcom/lody/virtual/server/pm/VUserManagerService;->readIntAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    const-string v12, "icon"

    .line 139
    .line 140
    invoke-interface {v4, v2, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    const-string v13, "created"

    .line 145
    .line 146
    invoke-direct {v1, v4, v13, v10, v11}, Lcom/lody/virtual/server/pm/VUserManagerService;->readLongAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 147
    .line 148
    .line 149
    move-result-wide v13

    .line 150
    const-string v15, "lastLoggedIn"

    .line 151
    .line 152
    invoke-direct {v1, v4, v15, v10, v11}, Lcom/lody/virtual/server/pm/VUserManagerService;->readLongAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v10

    .line 156
    const-string v15, "partial"

    .line 157
    .line 158
    invoke-interface {v4, v2, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    const-string v9, "true"

    .line 163
    .line 164
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_5

    .line 169
    .line 170
    move v9, v6

    .line 171
    goto :goto_1

    .line 172
    :cond_5
    const/4 v9, 0x0

    .line 173
    :goto_1
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    if-eq v15, v7, :cond_6

    .line 178
    .line 179
    if-eq v15, v6, :cond_6

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_6
    if-ne v15, v7, :cond_7

    .line 183
    .line 184
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    const-string v7, "name"

    .line 189
    .line 190
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_7

    .line 195
    .line 196
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    const/4 v7, 0x4

    .line 201
    if-ne v6, v7, :cond_7

    .line 202
    .line 203
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    goto :goto_2

    .line 208
    :cond_7
    move-object v4, v2

    .line 209
    :goto_2
    move v6, v9

    .line 210
    move v9, v8

    .line 211
    move-wide v7, v10

    .line 212
    move-wide v10, v13

    .line 213
    goto :goto_3

    .line 214
    :cond_8
    move v5, v0

    .line 215
    move-object v4, v2

    .line 216
    move-object v12, v4

    .line 217
    move-wide v7, v10

    .line 218
    const/4 v6, 0x0

    .line 219
    const/4 v9, 0x0

    .line 220
    :goto_3
    new-instance v13, Lcom/lody/virtual/os/VUserInfo;

    .line 221
    .line 222
    invoke-direct {v13, v0, v4, v12, v9}, Lcom/lody/virtual/os/VUserInfo;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    .line 223
    .line 224
    .line 225
    iput v5, v13, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    .line 226
    .line 227
    iput-wide v10, v13, Lcom/lody/virtual/os/VUserInfo;->creationTime:J

    .line 228
    .line 229
    iput-wide v7, v13, Lcom/lody/virtual/os/VUserInfo;->lastLoggedInTime:J

    .line 230
    .line 231
    iput-boolean v6, v13, Lcom/lody/virtual/os/VUserInfo;->partial:Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 232
    .line 233
    if-eqz v3, :cond_9

    .line 234
    .line 235
    :try_start_7
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 236
    .line 237
    .line 238
    :catch_2
    :cond_9
    return-object v13

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    move-object v2, v3

    .line 241
    goto :goto_4

    .line 242
    :catchall_1
    move-exception v0

    .line 243
    :goto_4
    if-eqz v2, :cond_a

    .line 244
    .line 245
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 246
    .line 247
    .line 248
    :catch_3
    :cond_a
    throw v0

    .line 249
    :catch_4
    move-object v3, v2

    .line 250
    :catch_5
    if-eqz v3, :cond_b

    .line 251
    .line 252
    :goto_5
    :try_start_9
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :catch_6
    move-object v3, v2

    .line 257
    :catch_7
    if-eqz v3, :cond_b

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :catch_8
    :cond_b
    :goto_6
    return-object v2
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method private readUserList()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->readUserListLocked()V

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
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
.end method

.method private readUserListLocked()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mGuestEnabled:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserListFile:Ljava/io/File;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->fallbackToSingleUserLocked()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserListFile:Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    :try_start_0
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->openRead()Ljava/io/FileInputStream;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    :try_start_1
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x2

    .line 40
    const/4 v5, 0x1

    .line 41
    if-eq v3, v4, :cond_1

    .line 42
    .line 43
    if-eq v3, v5, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    if-eq v3, v4, :cond_3

    .line 47
    .line 48
    const-string v1, "VUserManagerService"

    .line 49
    .line 50
    const-string v2, "Unable to read user list"

    .line 51
    .line 52
    invoke-static {v1, v2}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->fallbackToSingleUserLocked()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catch_0
    move-exception v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_1
    return-void

    .line 69
    :cond_3
    const/4 v3, -0x1

    .line 70
    :try_start_3
    iput v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextSerialNumber:I

    .line 71
    .line 72
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const-string v6, "users"

    .line 77
    .line 78
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    const-string v3, "nextSerialNumber"

    .line 85
    .line 86
    invoke-interface {v2, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    iput v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextSerialNumber:I

    .line 97
    .line 98
    :cond_4
    const-string v3, "version"

    .line 99
    .line 100
    invoke-interface {v2, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    iput v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserVersion:I

    .line 111
    .line 112
    :cond_5
    :goto_2
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eq v3, v5, :cond_8

    .line 117
    .line 118
    if-ne v3, v4, :cond_5

    .line 119
    .line 120
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const-string v6, "user"

    .line 125
    .line 126
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    const-string v3, "id"

    .line 133
    .line 134
    invoke-interface {v2, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-direct {p0, v3}, Lcom/lody/virtual/server/pm/VUserManagerService;->readUser(I)Lcom/lody/virtual/os/VUserInfo;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-eqz v3, :cond_5

    .line 147
    .line 148
    iget-object v6, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 149
    .line 150
    iget v7, v3, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 151
    .line 152
    invoke-virtual {v6, v7, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Lcom/lody/virtual/os/VUserInfo;->isGuest()Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-eqz v6, :cond_6

    .line 160
    .line 161
    iput-boolean v5, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mGuestEnabled:Z

    .line 162
    .line 163
    :cond_6
    iget v6, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextSerialNumber:I

    .line 164
    .line 165
    if-ltz v6, :cond_7

    .line 166
    .line 167
    iget v7, v3, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 168
    .line 169
    if-gt v6, v7, :cond_5

    .line 170
    .line 171
    :cond_7
    iget v3, v3, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 172
    .line 173
    add-int/2addr v3, v5

    .line 174
    iput v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextSerialNumber:I

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_8
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->updateUserIdsLocked()V

    .line 178
    .line 179
    .line 180
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->upgradeIfNecessary()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 181
    .line 182
    .line 183
    if-eqz v0, :cond_9

    .line 184
    .line 185
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :catchall_0
    move-exception v1

    .line 190
    goto :goto_6

    .line 191
    :catch_1
    move-object v1, v0

    .line 192
    goto :goto_3

    .line 193
    :catch_2
    move-object v1, v0

    .line 194
    goto :goto_4

    .line 195
    :catchall_1
    move-exception v0

    .line 196
    move-object v8, v1

    .line 197
    move-object v1, v0

    .line 198
    move-object v0, v8

    .line 199
    goto :goto_6

    .line 200
    :catch_3
    :goto_3
    :try_start_5
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->fallbackToSingleUserLocked()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 201
    .line 202
    .line 203
    if-eqz v1, :cond_9

    .line 204
    .line 205
    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 206
    .line 207
    .line 208
    goto :goto_5

    .line 209
    :catch_4
    :goto_4
    :try_start_7
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->fallbackToSingleUserLocked()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 210
    .line 211
    .line 212
    if-eqz v1, :cond_9

    .line 213
    .line 214
    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :catch_5
    move-exception v0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 220
    .line 221
    .line 222
    :cond_9
    :goto_5
    return-void

    .line 223
    :goto_6
    if-eqz v0, :cond_a

    .line 224
    .line 225
    :try_start_9
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 226
    .line 227
    .line 228
    goto :goto_7

    .line 229
    :catch_6
    move-exception v0

    .line 230
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 231
    .line 232
    .line 233
    :cond_a
    :goto_7
    throw v1
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private removeDirectoryRecursive(Ljava/io/File;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    aget-object v3, v0, v2

    .line 16
    .line 17
    new-instance v4, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v4, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v4}, Lcom/lody/virtual/server/pm/VUserManagerService;->removeDirectoryRecursive(Ljava/io/File;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 29
    .line 30
    .line 31
    return-void
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
.end method

.method private removeUserStateLocked(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPm:Lcom/lody/virtual/server/pm/VPackageManagerService;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/lody/virtual/server/pm/VPackageManagerService;->cleanUpUser(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mRemovingUserIds:Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 21
    .line 22
    new-instance v1, Ljava/io/File;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsersDir:Ljava/io/File;

    .line 25
    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v4, ".xml"

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->delete()V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserListLocked()V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->updateUserIdsLocked()V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDirectory(I)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->removeDirectoryRecursive(Ljava/io/File;)V

    .line 63
    .line 64
    .line 65
    return-void
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

.method private sendUserInfoChangedBroadcast(I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "virtual.android.intent.action.USER_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "android.intent.extra.user_handle"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const/high16 v1, 0x40000000    # 2.0f

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lcom/lody/virtual/os/VUserHandle;

    .line 23
    .line 24
    invoke-direct {v2, p1}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0, v2}, Lcom/lody/virtual/server/am/VActivityManagerService;->sendBroadcastAsUser(Landroid/content/Intent;Lcom/lody/virtual/os/VUserHandle;)V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method private updateUserIdsLocked()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-ge v1, v3, :cond_1

    .line 11
    .line 12
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lcom/lody/virtual/os/VUserInfo;

    .line 19
    .line 20
    iget-boolean v3, v3, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-array v1, v2, [I

    .line 30
    .line 31
    move v2, v0

    .line 32
    :goto_1
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-ge v0, v3, :cond_3

    .line 39
    .line 40
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lcom/lody/virtual/os/VUserInfo;

    .line 47
    .line 48
    iget-boolean v3, v3, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 49
    .line 50
    if-nez v3, :cond_2

    .line 51
    .line 52
    add-int/lit8 v3, v2, 0x1

    .line 53
    .line 54
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 55
    .line 56
    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    aput v4, v1, v2

    .line 61
    .line 62
    move v2, v3

    .line 63
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iput-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserIds:[I

    .line 67
    .line 68
    return-void
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

.method private upgradeIfNecessary()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserVersion:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/lody/virtual/os/VUserInfo;

    .line 14
    .line 15
    iget-object v3, v0, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "Primary"

    .line 18
    .line 19
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const-string v3, "Admin"

    .line 26
    .line 27
    iput-object v3, v0, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    move v0, v2

    .line 33
    :cond_1
    if-ge v0, v2, :cond_2

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "User version "

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserVersion:I

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v3, " didn\'t upgrade as expected to "

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-array v1, v1, [Ljava/lang/Object;

    .line 63
    .line 64
    const-string v2, "VUserManagerService"

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iput v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserVersion:I

    .line 71
    .line 72
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserListLocked()V

    .line 73
    .line 74
    .line 75
    :goto_0
    return-void
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

.method private writeBitmapLocked(Lcom/lody/virtual/os/VUserInfo;Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsersDir:Ljava/io/File;

    .line 4
    .line 5
    iget v2, p1, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/io/File;

    .line 15
    .line 16
    const-string v2, "photo.png"

    .line 17
    .line 18
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 31
    .line 32
    new-instance v2, Ljava/io/FileOutputStream;

    .line 33
    .line 34
    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 35
    .line 36
    .line 37
    const/16 v3, 0x64

    .line 38
    .line 39
    invoke-virtual {p2, v0, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iput-object p2, p1, Lcom/lody/virtual/os/VUserInfo;->iconPath:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception p1

    .line 56
    const/4 p2, 0x1

    .line 57
    new-array p2, p2, [Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    aput-object p1, p2, v0

    .line 61
    .line 62
    const-string p1, "VUserManagerService"

    .line 63
    .line 64
    const-string v0, "Error setting photo for user "

    .line 65
    .line 66
    invoke-static {p1, v0, p2}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :catch_1
    :goto_0
    return-void
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

.method private writeUserListLocked()V
    .locals 9

    .line 1
    const-string v0, "user"

    .line 2
    .line 3
    const-string v1, "users"

    .line 4
    .line 5
    new-instance v2, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserListFile:Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {v2, v3}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v2}, Lcom/lody/virtual/helper/utils/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 14
    .line 15
    .line 16
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    :try_start_1
    new-instance v5, Ljava/io/BufferedOutputStream;

    .line 18
    .line 19
    invoke-direct {v5, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 20
    .line 21
    .line 22
    new-instance v6, Lcom/lody/virtual/helper/utils/FastXmlSerializer;

    .line 23
    .line 24
    invoke-direct {v6}, Lcom/lody/virtual/helper/utils/FastXmlSerializer;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v7, "utf-8"

    .line 28
    .line 29
    invoke-interface {v6, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-interface {v6, v3, v5}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 35
    .line 36
    .line 37
    const-string v5, "http://xmlpull.org/v1/doc/features.html#indent-output"

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    invoke-interface {v6, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->setFeature(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v6, v3, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 44
    .line 45
    .line 46
    const-string v5, "nextSerialNumber"

    .line 47
    .line 48
    iget v7, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextSerialNumber:I

    .line 49
    .line 50
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-interface {v6, v3, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 55
    .line 56
    .line 57
    const-string v5, "version"

    .line 58
    .line 59
    iget v7, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserVersion:I

    .line 60
    .line 61
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-interface {v6, v3, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 66
    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    :goto_0
    iget-object v7, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 70
    .line 71
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-ge v5, v7, :cond_0

    .line 76
    .line 77
    iget-object v7, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 78
    .line 79
    invoke-virtual {v7, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, Lcom/lody/virtual/os/VUserInfo;

    .line 84
    .line 85
    invoke-interface {v6, v3, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 86
    .line 87
    .line 88
    const-string v8, "id"

    .line 89
    .line 90
    iget v7, v7, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 91
    .line 92
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-interface {v6, v3, v8, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 97
    .line 98
    .line 99
    invoke-interface {v6, v3, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 100
    .line 101
    .line 102
    add-int/lit8 v5, v5, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    invoke-interface {v6, v3, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 106
    .line 107
    .line 108
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4}, Lcom/lody/virtual/helper/utils/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catch_0
    move-object v3, v4

    .line 116
    :catch_1
    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/utils/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 117
    .line 118
    .line 119
    const-string v0, "VUserManagerService"

    .line 120
    .line 121
    const-string v1, "Error writing user list"

    .line 122
    .line 123
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V
    .locals 9

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    const-string v1, "user"

    .line 4
    .line 5
    new-instance v2, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 6
    .line 7
    new-instance v3, Ljava/io/File;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsersDir:Ljava/io/File;

    .line 10
    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget v6, p1, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 17
    .line 18
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v6, ".xml"

    .line 22
    .line 23
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v3}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    :try_start_0
    invoke-virtual {v2}, Lcom/lody/virtual/helper/utils/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 38
    .line 39
    .line 40
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 41
    :try_start_1
    new-instance v5, Ljava/io/BufferedOutputStream;

    .line 42
    .line 43
    invoke-direct {v5, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 44
    .line 45
    .line 46
    new-instance v6, Lcom/lody/virtual/helper/utils/FastXmlSerializer;

    .line 47
    .line 48
    invoke-direct {v6}, Lcom/lody/virtual/helper/utils/FastXmlSerializer;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v7, "utf-8"

    .line 52
    .line 53
    invoke-interface {v6, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-interface {v6, v3, v5}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 59
    .line 60
    .line 61
    const-string v5, "http://xmlpull.org/v1/doc/features.html#indent-output"

    .line 62
    .line 63
    const/4 v7, 0x1

    .line 64
    invoke-interface {v6, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->setFeature(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v6, v3, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 68
    .line 69
    .line 70
    const-string v5, "id"

    .line 71
    .line 72
    iget v7, p1, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 73
    .line 74
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-interface {v6, v3, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 79
    .line 80
    .line 81
    const-string v5, "serialNumber"

    .line 82
    .line 83
    iget v7, p1, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    .line 84
    .line 85
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-interface {v6, v3, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 90
    .line 91
    .line 92
    const-string v5, "flags"

    .line 93
    .line 94
    iget v7, p1, Lcom/lody/virtual/os/VUserInfo;->flags:I

    .line 95
    .line 96
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-interface {v6, v3, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 101
    .line 102
    .line 103
    const-string v5, "created"

    .line 104
    .line 105
    iget-wide v7, p1, Lcom/lody/virtual/os/VUserInfo;->creationTime:J

    .line 106
    .line 107
    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-interface {v6, v3, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 112
    .line 113
    .line 114
    const-string v5, "lastLoggedIn"

    .line 115
    .line 116
    iget-wide v7, p1, Lcom/lody/virtual/os/VUserInfo;->lastLoggedInTime:J

    .line 117
    .line 118
    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-interface {v6, v3, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 123
    .line 124
    .line 125
    iget-object v5, p1, Lcom/lody/virtual/os/VUserInfo;->iconPath:Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v5, :cond_0

    .line 128
    .line 129
    const-string v7, "icon"

    .line 130
    .line 131
    invoke-interface {v6, v3, v7, v5}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 132
    .line 133
    .line 134
    :cond_0
    iget-boolean v5, p1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 135
    .line 136
    if-eqz v5, :cond_1

    .line 137
    .line 138
    const-string v5, "partial"

    .line 139
    .line 140
    const-string v7, "true"

    .line 141
    .line 142
    invoke-interface {v6, v3, v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 143
    .line 144
    .line 145
    :cond_1
    invoke-interface {v6, v3, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 146
    .line 147
    .line 148
    iget-object v5, p1, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 149
    .line 150
    invoke-interface {v6, v5}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 151
    .line 152
    .line 153
    invoke-interface {v6, v3, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 154
    .line 155
    .line 156
    invoke-interface {v6, v3, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 157
    .line 158
    .line 159
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v4}, Lcom/lody/virtual/helper/utils/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :catch_0
    move-exception v0

    .line 167
    move-object v3, v4

    .line 168
    goto :goto_0

    .line 169
    :catch_1
    move-exception v0

    .line 170
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v4, "Error writing user info "

    .line 176
    .line 177
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    iget p1, p1, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 181
    .line 182
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string p1, "\n"

    .line 186
    .line 187
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    const-string v0, "VUserManagerService"

    .line 198
    .line 199
    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/utils/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 203
    .line 204
    .line 205
    :goto_1
    return-void
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method


# virtual methods
.method public createUser(Ljava/lang/String;I)Lcom/lody/virtual/os/VUserInfo;
    .locals 11

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mInstallLock:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    :try_start_1
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11
    :try_start_2
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->isUserLimitReachedLocked()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 20
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 21
    .line 22
    .line 23
    return-object v5

    .line 24
    :cond_0
    :try_start_4
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->getNextAvailableIdLocked()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    new-instance v6, Lcom/lody/virtual/os/VUserInfo;

    .line 29
    .line 30
    invoke-direct {v6, v4, p1, v5, p2}, Lcom/lody/virtual/os/VUserInfo;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Ljava/io/File;

    .line 34
    .line 35
    iget-object p2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mBaseUserPath:Ljava/io/File;

    .line 36
    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-direct {p1, p2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget p2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextSerialNumber:I

    .line 45
    .line 46
    add-int/lit8 v7, p2, 0x1

    .line 47
    .line 48
    iput v7, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mNextSerialNumber:I

    .line 49
    .line 50
    iput p2, v6, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    .line 51
    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    const-wide v9, 0xdc46c32800L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    cmp-long p2, v7, v9

    .line 62
    .line 63
    if-lez p2, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const-wide/16 v7, 0x0

    .line 67
    .line 68
    :goto_0
    iput-wide v7, v6, Lcom/lody/virtual/os/VUserInfo;->creationTime:J

    .line 69
    .line 70
    const/4 p2, 0x1

    .line 71
    iput-boolean p2, v6, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 72
    .line 73
    invoke-static {}, Lcom/lody/virtual/server/pm/VAppManagerService;->get()Lcom/lody/virtual/server/pm/VAppManagerService;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2, v6}, Lcom/lody/virtual/server/pm/VAppManagerService;->onUserCreated(Lcom/lody/virtual/os/VUserInfo;)V

    .line 78
    .line 79
    .line 80
    iget-object p2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 81
    .line 82
    invoke-virtual {p2, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserListLocked()V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, v6}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 89
    .line 90
    .line 91
    iget-object p2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPm:Lcom/lody/virtual/server/pm/VPackageManagerService;

    .line 92
    .line 93
    invoke-virtual {p2, v4, p1}, Lcom/lody/virtual/server/pm/VPackageManagerService;->createNewUser(ILjava/io/File;)V

    .line 94
    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    iput-boolean p1, v6, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 98
    .line 99
    invoke-direct {p0, v6}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VUserManagerService;->updateUserIdsLocked()V

    .line 103
    .line 104
    .line 105
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 107
    :try_start_6
    new-instance p1, Landroid/content/Intent;

    .line 108
    .line 109
    const-string p2, "virtual.android.intent.action.USER_ADDED"

    .line 110
    .line 111
    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string p2, "android.intent.extra.user_handle"

    .line 115
    .line 116
    iget v2, v6, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 117
    .line 118
    invoke-virtual {p1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    sget-object v2, Lcom/lody/virtual/os/VUserHandle;->ALL:Lcom/lody/virtual/os/VUserHandle;

    .line 126
    .line 127
    invoke-virtual {p2, p1, v2, v5}, Lcom/lody/virtual/server/am/VActivityManagerService;->sendBroadcastAsUser(Landroid/content/Intent;Lcom/lody/virtual/os/VUserHandle;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 131
    .line 132
    .line 133
    new-instance p1, Ljava/lang/Thread;

    .line 134
    .line 135
    new-instance p2, Lcom/lody/virtual/server/pm/VUserManagerService$1;

    .line 136
    .line 137
    invoke-direct {p2, p0, v6}, Lcom/lody/virtual/server/pm/VUserManagerService$1;-><init>(Lcom/lody/virtual/server/pm/VUserManagerService;Lcom/lody/virtual/os/VUserInfo;)V

    .line 138
    .line 139
    .line 140
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 144
    .line 145
    .line 146
    return-object v6

    .line 147
    :catchall_0
    move-exception p1

    .line 148
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 149
    :try_start_8
    throw p1

    .line 150
    :catchall_1
    move-exception p1

    .line 151
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 152
    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 153
    :catchall_2
    move-exception p1

    .line 154
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 155
    .line 156
    .line 157
    throw p1
.end method

.method public exists(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserIds:[I

    .line 5
    .line 6
    invoke-static {v1, p1}, Lcom/lody/virtual/helper/utils/ArrayUtils;->contains([II)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    monitor-exit v0

    .line 11
    return p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p1
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

.method finishRemoveUser(I)V
    .locals 11

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    .line 6
    .line 7
    const-string v2, "virtual.android.intent.action.USER_REMOVED"

    .line 8
    .line 9
    invoke-direct {v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "android.intent.extra.user_handle"

    .line 13
    .line 14
    invoke-virtual {v3, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v4, Lcom/lody/virtual/os/VUserHandle;->ALL:Lcom/lody/virtual/os/VUserHandle;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    new-instance v6, Lcom/lody/virtual/server/pm/VUserManagerService$3;

    .line 25
    .line 26
    invoke-direct {v6, p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService$3;-><init>(Lcom/lody/virtual/server/pm/VUserManagerService;I)V

    .line 27
    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, -0x1

    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    invoke-virtual/range {v2 .. v10}, Lcom/lody/virtual/server/am/VActivityManagerService;->sendOrderedBroadcastAsUser(Landroid/content/Intent;Lcom/lody/virtual/os/VUserHandle;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 42
    .line 43
    .line 44
    throw p1
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
.end method

.method public getUserHandle(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserIds:[I

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v2, :cond_1

    .line 9
    .line 10
    aget v4, v1, v3

    .line 11
    .line 12
    invoke-direct {p0, v4}, Lcom/lody/virtual/server/pm/VUserManagerService;->getUserInfoLocked(I)Lcom/lody/virtual/os/VUserInfo;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    iget v5, v5, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    .line 17
    .line 18
    if-ne v5, p1, :cond_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return v4

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    monitor-exit v0

    .line 26
    const/4 p1, -0x1

    .line 27
    return p1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
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
.end method

.method public getUserIcon(I)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/os/VUserInfo;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-boolean v3, v1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, v1, Lcom/lody/virtual/os/VUserInfo;->iconPath:Ljava/lang/String;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object v2

    .line 26
    :cond_1
    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    monitor-exit v0

    .line 31
    return-object p1

    .line 32
    :cond_2
    :goto_0
    const-string v1, "VUserManagerService"

    .line 33
    .line 34
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v4, "getUserIcon: unknown user #"

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v3, 0x0

    .line 52
    new-array v3, v3, [Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v1, p1, v3}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-object v2

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw p1
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

.method public getUserIds()[I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserIds:[I

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
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
.end method

.method getUserIdsLPr()[I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUserIds:[I

    return-object v0
.end method

.method public getUserInfo(I)Lcom/lody/virtual/os/VUserInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->getUserInfoLocked(I)Lcom/lody/virtual/os/VUserInfo;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    monitor-exit v0

    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p1
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

.method public getUserSerialNumber(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->exists(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    const/4 p1, -0x1

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->getUserInfoLocked(I)Lcom/lody/virtual/os/VUserInfo;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget p1, p1, Lcom/lody/virtual/os/VUserInfo;->serialNumber:I

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getUsers(Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/os/VUserInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ge v2, v3, :cond_3

    .line 23
    .line 24
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lcom/lody/virtual/os/VUserInfo;

    .line 31
    .line 32
    iget-boolean v4, v3, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mRemovingUserIds:Ljava/util/HashSet;

    .line 40
    .line 41
    iget v5, v3, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 42
    .line 43
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_2

    .line 52
    .line 53
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    monitor-exit v0

    .line 60
    return-object v1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    throw p1
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

.method public isGuestEnabled()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mGuestEnabled:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
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
.end method

.method public makeInitialized(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/os/VUserInfo;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-boolean v2, v1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    :cond_0
    const-string v2, "VUserManagerService"

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v4, "makeInitialized: unknown user #"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v3, 0x0

    .line 38
    new-array v3, v3, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {v2, p1, v3}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget p1, v1, Lcom/lody/virtual/os/VUserInfo;->flags:I

    .line 44
    .line 45
    and-int/lit8 v2, p1, 0x10

    .line 46
    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    or-int/lit8 p1, p1, 0x10

    .line 50
    .line 51
    iput p1, v1, Lcom/lody/virtual/os/VUserInfo;->flags:I

    .line 52
    .line 53
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw p1
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

.method public removeUser(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/os/VUserInfo;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mRemovingUserIds:Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    iput-boolean v3, v1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 29
    .line 30
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 31
    .line 32
    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcom/lody/virtual/server/pm/VUserManagerService$2;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/lody/virtual/server/pm/VUserManagerService$2;-><init>(Lcom/lody/virtual/server/pm/VUserManagerService;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1, v1}, Lcom/lody/virtual/server/am/VActivityManagerService;->stopUser(ILandroid/app/IStopUserCallback$Stub;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    move v2, v3

    .line 50
    :cond_1
    return v2

    .line 51
    :cond_2
    :goto_0
    :try_start_1
    monitor-exit v0

    .line 52
    return v2

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p1
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

.method public setGuestEnabled(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mGuestEnabled:Z

    .line 5
    .line 6
    if-eq v1, p1, :cond_3

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mGuestEnabled:Z

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/lody/virtual/os/VUserInfo;

    .line 26
    .line 27
    iget-boolean v3, v2, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/lody/virtual/os/VUserInfo;->isGuest()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    iget p1, v2, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->removeUser(I)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const-string p1, "Guest"

    .line 52
    .line 53
    const/4 v1, 0x4

    .line 54
    invoke-virtual {p0, p1, v1}, Lcom/lody/virtual/server/pm/VUserManagerService;->createUser(Ljava/lang/String;I)Lcom/lody/virtual/os/VUserInfo;

    .line 55
    .line 56
    .line 57
    :cond_3
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw p1
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

.method public setUserIcon(ILandroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/os/VUserInfo;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-boolean v2, v1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-direct {p0, v1, p2}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeBitmapLocked(Lcom/lody/virtual/os/VUserInfo;Landroid/graphics/Bitmap;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 23
    .line 24
    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->sendUserInfoChangedBroadcast(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    :try_start_1
    const-string p2, "VUserManagerService"

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v2, "setUserIcon: unknown user #"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v1, 0x0

    .line 50
    new-array v1, v1, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p2, p1, v1}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p1
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

.method public setUserName(ILjava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/os/VUserInfo;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    iget-boolean v3, v1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-eqz p2, :cond_1

    .line 21
    .line 22
    iget-object v3, v1, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    iput-object p2, v1, Lcom/lody/virtual/os/VUserInfo;->name:Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->sendUserInfoChangedBroadcast(I)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void

    .line 43
    :cond_3
    :goto_0
    :try_start_1
    const-string p2, "VUserManagerService"

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v3, "setUserName: unknown user #"

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-array v1, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {p2, p1, v1}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw p1
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

.method public userForeground(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mPackagesLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VUserManagerService;->mUsers:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/os/VUserInfo;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-boolean v4, v1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-wide v4, 0xdc46c32800L

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long p1, v2, v4

    .line 29
    .line 30
    if-lez p1, :cond_1

    .line 31
    .line 32
    iput-wide v2, v1, Lcom/lody/virtual/os/VUserInfo;->lastLoggedInTime:J

    .line 33
    .line 34
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/pm/VUserManagerService;->writeUserLocked(Lcom/lody/virtual/os/VUserInfo;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :cond_2
    :goto_0
    const-string v1, "VUserManagerService"

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v3, "userForeground: unknown user #"

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 v2, 0x0

    .line 59
    new-array v2, v2, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {v1, p1, v2}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    monitor-exit v0

    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p1
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

.method public wipeUser(I)V
    .locals 0

    return-void
.end method
