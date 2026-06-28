.class public Lcom/lody/virtual/helper/ApkLibraryHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ABI_32BIT:[Ljava/lang/String;

.field public static final ABI_64BIT:[Ljava/lang/String;

.field public static final DEFAULT_SUPPORTED_ABI_32BIT:[Ljava/lang/String;

.field public static final DEFAULT_SUPPORTED_ABI_64BIT:[Ljava/lang/String;

.field public static final INSTALL_FAILED_INVALID_APK:I = -0x2

.field public static final INSTALL_FAILED_NO_MATCHING_ABIS:I = -0x71

.field public static final INSTALL_SUCCEEDED:I = 0x1

.field public static final NO_NATIVE_LIBRARIES:I = -0x72


# instance fields
.field private apkFile:Ljava/util/zip/ZipFile;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "armeabi"

    .line 2
    .line 3
    const-string v1, "armeabi-v7a"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sput-object v2, Lcom/lody/virtual/helper/ApkLibraryHelper;->DEFAULT_SUPPORTED_ABI_32BIT:[Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "arm64-v8a"

    .line 12
    .line 13
    filled-new-array {v2}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sput-object v3, Lcom/lody/virtual/helper/ApkLibraryHelper;->DEFAULT_SUPPORTED_ABI_64BIT:[Ljava/lang/String;

    .line 18
    .line 19
    const-string v3, "x86"

    .line 20
    .line 21
    filled-new-array {v0, v1, v3}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/lody/virtual/helper/ApkLibraryHelper;->ABI_32BIT:[Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "x86_64"

    .line 28
    .line 29
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lcom/lody/virtual/helper/ApkLibraryHelper;->ABI_64BIT:[Ljava/lang/String;

    .line 34
    .line 35
    return-void
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

.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance v0, Ljava/util/zip/ZipFile;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p1, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/lody/virtual/helper/ApkLibraryHelper;->apkFile:Ljava/util/zip/ZipFile;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
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
.method public copyNativeBinaries(Ljava/io/File;Ljava/lang/String;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/ApkLibraryHelper;->apkFile:Ljava/util/zip/ZipFile;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x2

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v1, 0x2000

    .line 12
    .line 13
    new-array v1, v1, [B

    .line 14
    .line 15
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/util/zip/ZipEntry;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v5, "lib/"

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v5, "/"

    .line 52
    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    new-instance v4, Ljava/io/File;

    .line 75
    .line 76
    invoke-direct {v4, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v5, "Writing: "

    .line 85
    .line 86
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v5, "ApkLibraryHelper"

    .line 97
    .line 98
    invoke-static {v5, v3}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    .line 102
    .line 103
    .line 104
    new-instance v3, Ljava/io/BufferedOutputStream;

    .line 105
    .line 106
    new-instance v5, Ljava/io/FileOutputStream;

    .line 107
    .line 108
    invoke-direct {v5, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v3, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 112
    .line 113
    .line 114
    iget-object v4, p0, Lcom/lody/virtual/helper/ApkLibraryHelper;->apkFile:Ljava/util/zip/ZipFile;

    .line 115
    .line 116
    invoke-virtual {v4, v2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    :goto_1
    const/16 v4, 0x64

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    invoke-virtual {v2, v1, v5, v4}, Ljava/io/InputStream;->read([BII)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-lez v4, :cond_3

    .line 128
    .line 129
    invoke-virtual {v3, v1, v5, v4}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->flush()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :catch_0
    move-exception p1

    .line 141
    new-instance p2, Ljava/lang/RuntimeException;

    .line 142
    .line 143
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    throw p2

    .line 147
    :cond_4
    const/4 p1, 0x1

    .line 148
    return p1
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

.method public findSupportedAbi([Ljava/lang/String;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/ApkLibraryHelper;->apkFile:Ljava/util/zip/ZipFile;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x2

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v1, -0x72

    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/zip/ZipEntry;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "lib/"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/4 v3, 0x0

    .line 46
    :goto_1
    array-length v4, p1

    .line 47
    if-ge v3, v4, :cond_4

    .line 48
    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    aget-object v5, p1, v3

    .line 58
    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    return v3

    .line 73
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    :goto_2
    const/16 v1, -0x71

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    return v1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
