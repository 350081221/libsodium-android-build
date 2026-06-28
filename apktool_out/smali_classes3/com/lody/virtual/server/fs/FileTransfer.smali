.class public Lcom/lody/virtual/server/fs/FileTransfer;
.super Lcom/lody/virtual/server/fs/IFileTransfer$Stub;
.source "SourceFile"


# static fields
.field private static final sInstance:Lcom/lody/virtual/server/fs/FileTransfer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/fs/FileTransfer;

    invoke-direct {v0}, Lcom/lody/virtual/server/fs/FileTransfer;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/fs/FileTransfer;->sInstance:Lcom/lody/virtual/server/fs/FileTransfer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/fs/IFileTransfer$Stub;-><init>()V

    return-void
.end method

.method public static get()Lcom/lody/virtual/server/fs/FileTransfer;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/fs/FileTransfer;->sInstance:Lcom/lody/virtual/server/fs/FileTransfer;

    return-object v0
.end method


# virtual methods
.method public listFiles(Ljava/lang/String;)[Lcom/lody/virtual/remote/FileInfo;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    array-length v0, p1

    .line 15
    new-array v0, v0, [Lcom/lody/virtual/remote/FileInfo;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    array-length v2, p1

    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    aget-object v2, p1, v1

    .line 22
    .line 23
    new-instance v3, Lcom/lody/virtual/remote/FileInfo;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Lcom/lody/virtual/remote/FileInfo;-><init>(Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    aput-object v3, v0, v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v0
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

.method public openFile(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/high16 p1, 0x10000000

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p1

    .line 13
    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1
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
