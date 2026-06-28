.class Lcom/lody/virtual/server/vs/VSPersistenceLayer;
.super Lcom/lody/virtual/helper/PersistenceLayer;
.source "SourceFile"


# static fields
.field private static final CURRENT_VERSION:I = 0x1

.field private static final MAGIC:[C


# instance fields
.field private final mService:Lcom/lody/virtual/server/vs/VirtualStorageService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/lody/virtual/server/vs/VSPersistenceLayer;->MAGIC:[C

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 2
        0x76s
        0x73s
        0x61s
    .end array-data
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

.method constructor <init>(Lcom/lody/virtual/server/vs/VirtualStorageService;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getVSConfigFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/lody/virtual/helper/PersistenceLayer;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/lody/virtual/server/vs/VSPersistenceLayer;->mService:Lcom/lody/virtual/server/vs/VirtualStorageService;

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public getCurrentVersion()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onPersistenceFileDamage()V
    .locals 0

    return-void
.end method

.method public readPersistenceData(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/server/vs/VSPersistenceLayer;->mService:Lcom/lody/virtual/server/vs/VirtualStorageService;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->getConfigs()Landroid/util/SparseArray;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-class v2, Lcom/lody/virtual/server/vs/VSConfig;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p2, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move v0, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
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

.method public verifyMagic(Landroid/os/Parcel;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/os/Parcel;->createCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/lody/virtual/server/vs/VSPersistenceLayer;->MAGIC:[C

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([C[C)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public writeMagic(Landroid/os/Parcel;)V
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/vs/VSPersistenceLayer;->MAGIC:[C

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeCharArray([C)V

    return-void
.end method

.method public writePersistenceData(Landroid/os/Parcel;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/vs/VSPersistenceLayer;->mService:Lcom/lody/virtual/server/vs/VirtualStorageService;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lody/virtual/server/vs/VirtualStorageService;->getConfigs()Landroid/util/SparseArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    move v1, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
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
