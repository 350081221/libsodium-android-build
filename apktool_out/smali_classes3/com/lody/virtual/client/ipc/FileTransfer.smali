.class public Lcom/lody/virtual/client/ipc/FileTransfer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sInstance:Lcom/lody/virtual/client/ipc/FileTransfer;


# instance fields
.field private mTransfer:Lcom/lody/virtual/server/fs/IFileTransfer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/ipc/FileTransfer;

    invoke-direct {v0}, Lcom/lody/virtual/client/ipc/FileTransfer;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/ipc/FileTransfer;->sInstance:Lcom/lody/virtual/client/ipc/FileTransfer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/lody/virtual/client/ipc/FileTransfer;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/ipc/FileTransfer;->sInstance:Lcom/lody/virtual/client/ipc/FileTransfer;

    return-object v0
.end method

.method private getStubInterface()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "file-transfer"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/lody/virtual/server/fs/IFileTransfer$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/fs/IFileTransfer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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


# virtual methods
.method public copyDirectory(Ljava/io/File;Ljava/io/File;)V
    .locals 6

    .line 1
    invoke-virtual {p1, p2}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/ipc/FileTransfer;->listFiles(Ljava/io/File;)[Lcom/lody/virtual/remote/FileInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    invoke-static {p2}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 16
    .line 17
    .line 18
    array-length v0, p1

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, v0, :cond_3

    .line 21
    .line 22
    aget-object v2, p1, v1

    .line 23
    .line 24
    new-instance v3, Ljava/io/File;

    .line 25
    .line 26
    iget-object v4, v2, Lcom/lody/virtual/remote/FileInfo;->path:Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-direct {v4, p2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-boolean v2, v2, Lcom/lody/virtual/remote/FileInfo;->isDirectory:Z

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, v3, v4}, Lcom/lody/virtual/client/ipc/FileTransfer;->copyDirectory(Ljava/io/File;Ljava/io/File;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {p0, v3, v4}, Lcom/lody/virtual/client/ipc/FileTransfer;->copyFile(Ljava/io/File;Ljava/io/File;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    return-void
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

.method public copyFile(Ljava/io/File;Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/ipc/FileTransfer;->openFile(Ljava/io/File;)Landroid/os/ParcelFileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-static {v0, p2}, Lcom/lody/virtual/helper/utils/FileUtils;->writeToFile(Ljava/io/InputStream;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/FileUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public getService()Lcom/lody/virtual/server/fs/IFileTransfer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/FileTransfer;->mTransfer:Lcom/lody/virtual/server/fs/IFileTransfer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/IInterfaceUtils;->isAlive(Landroid/os/IInterface;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-class v0, Lcom/lody/virtual/client/ipc/FileTransfer;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/client/ipc/FileTransfer;->getStubInterface()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-class v2, Lcom/lody/virtual/server/fs/IFileTransfer;

    .line 17
    .line 18
    invoke-static {v2, v1}, Lcom/lody/virtual/client/ipc/LocalProxyUtils;->genProxy(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/lody/virtual/server/fs/IFileTransfer;

    .line 23
    .line 24
    iput-object v1, p0, Lcom/lody/virtual/client/ipc/FileTransfer;->mTransfer:Lcom/lody/virtual/server/fs/IFileTransfer;

    .line 25
    .line 26
    monitor-exit v0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1

    .line 31
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/FileTransfer;->mTransfer:Lcom/lody/virtual/server/fs/IFileTransfer;

    .line 32
    .line 33
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

.method public listFiles(Ljava/io/File;)[Lcom/lody/virtual/remote/FileInfo;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/ipc/FileTransfer;->listFiles(Ljava/lang/String;)[Lcom/lody/virtual/remote/FileInfo;

    move-result-object p1

    return-object p1
.end method

.method public listFiles(Ljava/lang/String;)[Lcom/lody/virtual/remote/FileInfo;
    .locals 1

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/FileTransfer;->getService()Lcom/lody/virtual/server/fs/IFileTransfer;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/lody/virtual/server/fs/IFileTransfer;->listFiles(Ljava/lang/String;)[Lcom/lody/virtual/remote/FileInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/lody/virtual/remote/FileInfo;

    return-object p1
.end method

.method public openFile(Ljava/io/File;)Landroid/os/ParcelFileDescriptor;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/ipc/FileTransfer;->openFile(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    return-object p1
.end method

.method public openFile(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/FileTransfer;->getService()Lcom/lody/virtual/server/fs/IFileTransfer;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/lody/virtual/server/fs/IFileTransfer;->openFile(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    return-object p1
.end method
