.class public Lcom/uc/crashsdk/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/RuntimeException; = null

.field public static b:Ljava/lang/RuntimeException; = null

.field static final synthetic c:Z = true

.field private static d:Lcom/uc/crashsdk/export/CustomInfo;

.field private static e:Lcom/uc/crashsdk/export/VersionInfo;

.field private static final f:Ljava/lang/Object;

.field private static g:Ljava/lang/String;

.field private static h:Ljava/lang/String;

.field private static i:Ljava/lang/String;

.field private static j:Ljava/lang/String;

.field private static final k:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/uc/crashsdk/g;->f:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/uc/crashsdk/g;->k:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static A()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxBytesLimit:I

    return v0
.end method

.method static B()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxUploadBytesLimit:I

    return v0
.end method

.method static C()J
    .locals 2

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-wide v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBytesPerDay:J

    return-wide v0
.end method

.method static D()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBuiltinLogCountPerDay:I

    return v0
.end method

.method static E()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadCustomLogCountPerDay:I

    return v0
.end method

.method static F()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogCountPerTypePerDay:I

    return v0
.end method

.method static G()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mInfoUpdateInterval:I

    return v0
.end method

.method static H()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mInfoSaveFrequency:I

    return v0
.end method

.method static I()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mReservedJavaFileHandleCount:I

    return v0
.end method

.method static J()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mFdDumpMinLimit:I

    return v0
.end method

.method static K()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mThreadsDumpMinLimit:I

    return v0
.end method

.method static L()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mAutoDetectLifeCycle:Z

    return v0
.end method

.method static M()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMonitorBattery:Z

    return v0
.end method

.method static N()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mAnrTraceStrategy:I

    return v0
.end method

.method public static O()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mDebug:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static P()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mPrintStackInfos:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static Q()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatReport:Z

    return v0
.end method

.method public static R()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mIsInternational:Z

    return v0
.end method

.method public static S()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mAddPvForNewDay:Z

    return v0
.end method

.method public static T()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/uc/crashsdk/export/VersionInfo;->mVersion:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/uc/crashsdk/a;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/uc/crashsdk/export/VersionInfo;->mVersion:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
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

.method public static U()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/uc/crashsdk/export/VersionInfo;->mSubVersion:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "release"

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/uc/crashsdk/export/VersionInfo;->mSubVersion:Ljava/lang/String;

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static V()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/uc/crashsdk/export/VersionInfo;->mBuildId:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/uc/crashsdk/g;->ad()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/uc/crashsdk/export/VersionInfo;->mBuildId:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
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

.method public static W()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/uc/crashsdk/a/g;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    sget-char v1, Ljava/io/File;->separatorChar:C

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    sget-object v1, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 23
    .line 24
    iget-object v1, v1, Lcom/uc/crashsdk/export/CustomInfo;->mTagFilesFolderName:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    sget-char v1, Ljava/io/File;->separatorChar:C

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/uc/crashsdk/g;->h:Ljava/lang/String;

    .line 39
    .line 40
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/g;->h:Ljava/lang/String;

    .line 41
    .line 42
    return-object v0
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

.method static X()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/uc/crashsdk/a/g;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    sget-char v1, Ljava/io/File;->separatorChar:C

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    sget-object v1, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 23
    .line 24
    iget-object v1, v1, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogsFolderName:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    sget-char v1, Ljava/io/File;->separatorChar:C

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/uc/crashsdk/g;->i:Ljava/lang/String;

    .line 39
    .line 40
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/g;->i:Ljava/lang/String;

    .line 41
    .line 42
    return-object v0
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

.method static Y()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->j:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mLogsBackupPathName:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mLogsBackupPathName:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_0
    sput-object v0, Lcom/uc/crashsdk/g;->j:Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/uc/crashsdk/a/g;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    sget-char v1, Ljava/io/File;->separatorChar:C

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, "msdb"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    sget-char v1, Ljava/io/File;->separatorChar:C

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 94
    .line 95
    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogsFolderName:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sput-object v0, Lcom/uc/crashsdk/g;->j:Ljava/lang/String;

    .line 110
    .line 111
    :cond_2
    :goto_0
    sget-object v0, Lcom/uc/crashsdk/g;->j:Ljava/lang/String;

    .line 112
    .line 113
    return-object v0
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

.method public static Z()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableCrpStat:Z

    return v0
.end method

.method public static a(Lcom/uc/crashsdk/export/CustomInfo;Landroid/os/Bundle;)Lcom/uc/crashsdk/export/CustomInfo;
    .locals 7

    if-nez p0, :cond_1

    .line 26
    sget-object p0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    if-nez p0, :cond_0

    .line 27
    new-instance p0, Lcom/uc/crashsdk/export/CustomInfo;

    invoke-direct {p0}, Lcom/uc/crashsdk/export/CustomInfo;-><init>()V

    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Lcom/uc/crashsdk/export/CustomInfo;

    invoke-direct {v0, p0}, Lcom/uc/crashsdk/export/CustomInfo;-><init>(Lcom/uc/crashsdk/export/CustomInfo;)V

    move-object p0, v0

    .line 29
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .line 30
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 31
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 32
    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    aget-object v5, v0, v4

    .line 33
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 34
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 35
    :try_start_0
    invoke-virtual {v5, p0, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    .line 36
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    .line 37
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Field "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " must be a "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but give a "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v6, :cond_3

    .line 39
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    const-string v0, "(null)"

    :goto_2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-object p0
.end method

.method public static a(Landroid/os/Bundle;)Lcom/uc/crashsdk/export/VersionInfo;
    .locals 3

    .line 40
    sget-object v0, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lcom/uc/crashsdk/export/VersionInfo;

    invoke-direct {v0}, Lcom/uc/crashsdk/export/VersionInfo;-><init>()V

    goto :goto_0

    .line 42
    :cond_0
    new-instance v1, Lcom/uc/crashsdk/export/VersionInfo;

    invoke-direct {v1, v0}, Lcom/uc/crashsdk/export/VersionInfo;-><init>(Lcom/uc/crashsdk/export/VersionInfo;)V

    move-object v0, v1

    :goto_0
    const-string v1, "mVersion"

    .line 43
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-static {v1}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 45
    iput-object v1, v0, Lcom/uc/crashsdk/export/VersionInfo;->mVersion:Ljava/lang/String;

    :cond_1
    const-string v1, "mSubVersion"

    .line 46
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 47
    invoke-static {v1}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 48
    iput-object v1, v0, Lcom/uc/crashsdk/export/VersionInfo;->mSubVersion:Ljava/lang/String;

    :cond_2
    const-string v1, "mBuildId"

    .line 49
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-static {v1}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 51
    iput-object v1, v0, Lcom/uc/crashsdk/export/VersionInfo;->mBuildId:Ljava/lang/String;

    :cond_3
    const-string v1, "crver"

    .line 52
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 53
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 54
    sput-object p0, Lcom/uc/crashsdk/a;->b:Ljava/lang/String;

    .line 55
    invoke-static {}, Lcom/uc/crashsdk/g;->ae()V

    :cond_4
    return-object v0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "_"

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "-"

    .line 25
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method static a()V
    .locals 2

    .line 18
    invoke-static {}, Lcom/uc/crashsdk/b;->y()Z

    .line 19
    invoke-static {}, Lcom/uc/crashsdk/b;->x()Z

    .line 20
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mBackupLogs:Z

    if-eqz v0, :cond_0

    .line 21
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/uc/crashsdk/g;->Y()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 23
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-void
.end method

.method public static a(Lcom/uc/crashsdk/export/CustomInfo;)V
    .locals 2

    .line 11
    sget-boolean v0, Lcom/uc/crashsdk/g;->c:Z

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mTagFilesFolderName:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :cond_1
    :goto_0
    if-nez v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogsFolderName:Ljava/lang/String;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 13
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mTagFilesFolderName:Ljava/lang/String;

    iget-object p0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogsFolderName:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    return-void

    .line 14
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/uc/crashsdk/export/CustomInfo;

    invoke-direct {v0, p0}, Lcom/uc/crashsdk/export/CustomInfo;-><init>(Lcom/uc/crashsdk/export/CustomInfo;)V

    .line 2
    sput-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    invoke-static {v0}, Lcom/uc/crashsdk/g;->c(Lcom/uc/crashsdk/export/CustomInfo;)V

    .line 3
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "initialize set mZipLog to false, info.mZipLog: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/uc/crashsdk/g;->a:Ljava/lang/RuntimeException;

    .line 5
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mEncryptLog:Z

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "initialize set mEncryptLog to true, info.mEncryptLog: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean p0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mEncryptLog:Z

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/uc/crashsdk/g;->b:Ljava/lang/RuntimeException;

    .line 7
    :cond_1
    new-instance p0, Lcom/uc/crashsdk/export/VersionInfo;

    invoke-direct {p0, p1}, Lcom/uc/crashsdk/export/VersionInfo;-><init>(Lcom/uc/crashsdk/export/VersionInfo;)V

    sput-object p0, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    .line 8
    invoke-static {}, Lcom/uc/crashsdk/b;->L()Z

    move-result p0

    if-nez p0, :cond_2

    .line 9
    :try_start_0
    invoke-static {}, Lcom/uc/crashsdk/g;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 10
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public static a(Lcom/uc/crashsdk/export/VersionInfo;)V
    .locals 2

    .line 15
    sget-object v0, Lcom/uc/crashsdk/g;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 16
    :try_start_0
    new-instance v1, Lcom/uc/crashsdk/export/VersionInfo;

    invoke-direct {v1, p0}, Lcom/uc/crashsdk/export/VersionInfo;-><init>(Lcom/uc/crashsdk/export/VersionInfo;)V

    sput-object v1, Lcom/uc/crashsdk/g;->e:Lcom/uc/crashsdk/export/VersionInfo;

    invoke-static {}, Lcom/uc/crashsdk/e;->c()V

    sget-boolean p0, Lcom/uc/crashsdk/b;->d:Z

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/uc/crashsdk/g;->T()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x6d

    invoke-static {v1, p0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    invoke-static {}, Lcom/uc/crashsdk/g;->U()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x6e

    invoke-static {v1, p0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    invoke-static {}, Lcom/uc/crashsdk/g;->V()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x6f

    invoke-static {v1, p0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const-string p0, "211215141717"

    const/16 v1, 0x70

    invoke-static {v1, p0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/4 p0, 0x2

    invoke-static {p0}, Lcom/uc/crashsdk/JNIBridge;->cmd(I)J

    .line 17
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    if-eqz p0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static aa()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatToWPKDirect:Z

    return v0
.end method

.method public static ab()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mUserId:Ljava/lang/String;

    return-object v0
.end method

.method public static ac()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mChannel:Ljava/lang/String;

    return-object v0
.end method

.method private static ad()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->g:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :try_start_0
    new-instance v1, Ljava/util/zip/ZipFile;

    .line 8
    .line 9
    invoke-static {}, Lcom/uc/crashsdk/a/g;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    .line 15
    .line 16
    :try_start_1
    const-string v0, "classes.dex"

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getCrc()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-static {v2, v3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/uc/crashsdk/g;->g:Ljava/lang/String;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "version unique build id: "

    .line 35
    .line 36
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Lcom/uc/crashsdk/g;->g:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v2, "crashsdk"

    .line 49
    .line 50
    invoke-static {v2, v0}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    :try_start_2
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_0

    .line 59
    :catchall_1
    move-exception v1

    .line 60
    move-object v4, v1

    .line 61
    move-object v1, v0

    .line 62
    move-object v0, v4

    .line 63
    :goto_0
    :try_start_3
    const-string v2, ""

    .line 64
    .line 65
    sput-object v2, Lcom/uc/crashsdk/g;->g:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 68
    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    :try_start_4
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 73
    .line 74
    .line 75
    :catchall_2
    :cond_1
    :goto_1
    sget-object v0, Lcom/uc/crashsdk/g;->g:Ljava/lang/String;

    .line 76
    .line 77
    return-object v0

    .line 78
    :catchall_3
    move-exception v0

    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    :try_start_5
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 82
    .line 83
    .line 84
    :catchall_4
    :cond_2
    throw v0
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

.method private static ae()V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/uc/crashsdk/b;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/uc/crashsdk/a;->b:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x18

    .line 9
    .line 10
    const-wide/16 v3, 0x1

    .line 11
    .line 12
    invoke-static {v2, v3, v4, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->nativeSet(IJLjava/lang/String;[Ljava/lang/Object;)J

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static b(Lcom/uc/crashsdk/export/CustomInfo;)I
    .locals 9

    .line 25
    sget-object v0, Lcom/uc/crashsdk/g;->k:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    goto/16 :goto_4

    .line 26
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/uc/crashsdk/g;->c(Lcom/uc/crashsdk/export/CustomInfo;)V

    sget-object v2, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    if-nez v2, :cond_1

    new-instance v2, Lcom/uc/crashsdk/export/CustomInfo;

    invoke-direct {v2}, Lcom/uc/crashsdk/export/CustomInfo;-><init>()V

    sput-object v2, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    :cond_1
    sget-object v2, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v3, p0, Lcom/uc/crashsdk/export/CustomInfo;->mAppId:Ljava/lang/String;

    iget-object v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mAppId:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/uc/crashsdk/export/CustomInfo;->mAppId:Ljava/lang/String;

    iput-object v3, v2, Lcom/uc/crashsdk/export/CustomInfo;->mAppId:Ljava/lang/String;

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_2

    const/16 v5, 0x66

    invoke-static {v5, v3}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    :cond_2
    move v3, v4

    goto :goto_0

    :cond_3
    move v3, v1

    :goto_0
    move v5, v3

    iget-object v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mJavaCrashLogFileName:Ljava/lang/String;

    iget-object v7, v2, Lcom/uc/crashsdk/export/CustomInfo;->mJavaCrashLogFileName:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_4

    iget-object v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mJavaCrashLogFileName:Ljava/lang/String;

    iput-object v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mJavaCrashLogFileName:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    :cond_4
    iget-object v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mNativeCrashLogFileName:Ljava/lang/String;

    iget-object v7, v2, Lcom/uc/crashsdk/export/CustomInfo;->mNativeCrashLogFileName:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_6

    iget-object v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mNativeCrashLogFileName:Ljava/lang/String;

    iput-object v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mNativeCrashLogFileName:Ljava/lang/String;

    sget-boolean v6, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v6, :cond_5

    const/16 v6, 0x64

    invoke-static {v6, v5}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    :cond_5
    add-int/lit8 v3, v3, 0x1

    move v5, v4

    :cond_6
    iget-object v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpCrashLogFileName:Ljava/lang/String;

    iget-object v7, v2, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpCrashLogFileName:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_8

    iget-object v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpCrashLogFileName:Ljava/lang/String;

    iput-object v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpCrashLogFileName:Ljava/lang/String;

    sget-boolean v6, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v6, :cond_7

    const/16 v6, 0x65

    invoke-static {v6, v5}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    :cond_7
    add-int/lit8 v3, v3, 0x1

    move v5, v4

    :cond_8
    if-eqz v5, :cond_9

    invoke-static {}, Lcom/uc/crashsdk/e;->c()V

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_9

    const/4 v5, 0x2

    invoke-static {v5}, Lcom/uc/crashsdk/JNIBridge;->cmd(I)J

    :cond_9
    iget-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mPrintStackInfos:Z

    iget-boolean v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mPrintStackInfos:Z

    if-eq v5, v6, :cond_b

    iput-boolean v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mPrintStackInfos:Z

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_a

    const/16 v5, 0xb

    invoke-static {v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_a
    add-int/lit8 v3, v3, 0x1

    :cond_b
    iget-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mDebug:Z

    iget-boolean v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mDebug:Z

    if-eq v5, v6, :cond_d

    iput-boolean v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mDebug:Z

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_c

    const/16 v5, 0x12

    invoke-static {v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_c
    add-int/lit8 v3, v3, 0x1

    :cond_d
    iget-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mBackupLogs:Z

    iget-boolean v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mBackupLogs:Z

    if-eq v5, v6, :cond_f

    iput-boolean v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mBackupLogs:Z

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_e

    const/16 v5, 0xc

    invoke-static {v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_e
    add-int/lit8 v3, v3, 0x1

    :cond_f
    iget-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mOmitNativeCrash:Z

    iget-boolean v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mOmitNativeCrash:Z

    if-eq v5, v6, :cond_11

    iput-boolean v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mOmitNativeCrash:Z

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_10

    const/16 v5, 0x15

    invoke-static {v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_10
    add-int/lit8 v3, v3, 0x1

    :cond_11
    iget v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRestartInterval:I

    iget v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRestartInterval:I

    if-eq v5, v6, :cond_14

    iput v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRestartInterval:I

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_12

    int-to-long v5, v6

    const/16 v7, 0xd

    invoke-static {v7, v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_12
    iget v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRestartInterval:I

    if-ltz v5, :cond_13

    invoke-static {}, Lcom/uc/crashsdk/b;->M()V

    :cond_13
    add-int/lit8 v3, v3, 0x1

    :cond_14
    iget v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxBuiltinLogFilesCount:I

    iget v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxBuiltinLogFilesCount:I

    if-eq v5, v6, :cond_16

    iput v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxBuiltinLogFilesCount:I

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_15

    int-to-long v5, v6

    const/16 v7, 0xe

    invoke-static {v7, v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_15
    add-int/lit8 v3, v3, 0x1

    :cond_16
    iget v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxNativeLogcatLineCount:I

    iget v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxNativeLogcatLineCount:I

    if-eq v5, v6, :cond_18

    iput v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxNativeLogcatLineCount:I

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_17

    int-to-long v5, v6

    const/16 v7, 0xf

    invoke-static {v7, v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_17
    add-int/lit8 v3, v3, 0x1

    :cond_18
    iget v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxJavaLogcatLineCount:I

    iget v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxJavaLogcatLineCount:I

    if-eq v5, v6, :cond_19

    iput v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxJavaLogcatLineCount:I

    add-int/lit8 v3, v3, 0x1

    :cond_19
    iget v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUnexpLogcatLineCount:I

    iget v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUnexpLogcatLineCount:I

    if-eq v5, v6, :cond_1b

    iput v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUnexpLogcatLineCount:I

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_1a

    int-to-long v5, v6

    const/16 v7, 0x10

    invoke-static {v7, v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_1a
    add-int/lit8 v3, v3, 0x1

    :cond_1b
    iget v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogcatLineCount:I

    iget v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogcatLineCount:I

    if-eq v5, v6, :cond_1d

    iput v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogcatLineCount:I

    sget-boolean v5, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v5, :cond_1c

    int-to-long v5, v6

    const/16 v7, 0x1f

    invoke-static {v7, v5, v6}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_1c
    add-int/lit8 v3, v3, 0x1

    :cond_1d
    iget-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    iget-boolean v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    if-eq v5, v6, :cond_1f

    iput-boolean v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    if-nez v6, :cond_1e

    const-string v5, "DEBUG"

    const-string v6, "updateCustomInfoImpl set mZipLog to false"

    invoke-static {v5, v6}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Ljava/lang/RuntimeException;

    const-string v6, "updateCustomInfoImpl set mZipLog to false"

    invoke-direct {v5, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    sput-object v5, Lcom/uc/crashsdk/g;->a:Ljava/lang/RuntimeException;

    :cond_1e
    add-int/lit8 v3, v3, 0x1

    move v5, v4

    goto :goto_1

    :cond_1f
    move v5, v1

    :goto_1
    iget-object v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    iget-object v7, v2, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_20

    iget-object v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    iput-object v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_20
    move v4, v5

    :goto_2
    if-eqz v4, :cond_22

    sget-boolean v4, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v4, :cond_22

    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    if-eqz v4, :cond_21

    const-wide/16 v4, 0x1

    goto :goto_3

    :cond_21
    const-wide/16 v4, 0x0

    :goto_3
    iget-object v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x3

    invoke-static {v8, v4, v5, v6, v7}, Lcom/uc/crashsdk/JNIBridge;->nativeSet(IJLjava/lang/String;[Ljava/lang/Object;)J

    :cond_22
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxBytesLimit:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxBytesLimit:I

    if-eq v4, v5, :cond_24

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxBytesLimit:I

    sget-boolean v4, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v4, :cond_23

    int-to-long v4, v5

    const/4 v6, 0x4

    invoke-static {v6, v4, v5}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_23
    add-int/lit8 v3, v3, 0x1

    :cond_24
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEncryptLog:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mEncryptLog:Z

    if-eq v4, v5, :cond_26

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEncryptLog:Z

    if-eqz v5, :cond_25

    const-string v4, "DEBUG"

    const-string v5, "updateCustomInfoImpl set mEncryptLog to true"

    invoke-static {v4, v5}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/RuntimeException;

    const-string v5, "updateCustomInfoImpl set mEncryptLog to true"

    invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    sput-object v4, Lcom/uc/crashsdk/g;->b:Ljava/lang/RuntimeException;

    :cond_25
    add-int/lit8 v3, v3, 0x1

    :cond_26
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadSetupCrashLogs:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadSetupCrashLogs:Z

    if-eq v4, v5, :cond_27

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadSetupCrashLogs:Z

    add-int/lit8 v3, v3, 0x1

    :cond_27
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadLogs:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadLogs:Z

    if-eq v4, v5, :cond_28

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadLogs:Z

    add-int/lit8 v3, v3, 0x1

    :cond_28
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogFilesCount:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogFilesCount:I

    if-eq v4, v5, :cond_29

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogFilesCount:I

    add-int/lit8 v3, v3, 0x1

    :cond_29
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mOmitJavaCrash:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mOmitJavaCrash:Z

    if-eq v4, v5, :cond_2a

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mOmitJavaCrash:Z

    add-int/lit8 v3, v3, 0x1

    :cond_2a
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxUploadBytesLimit:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxUploadBytesLimit:I

    if-eq v4, v5, :cond_2b

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxUploadBytesLimit:I

    add-int/lit8 v3, v3, 0x1

    :cond_2b
    iget-wide v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBytesPerDay:J

    iget-wide v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBytesPerDay:J

    cmp-long v4, v4, v6

    if-eqz v4, :cond_2c

    iput-wide v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBytesPerDay:J

    add-int/lit8 v3, v3, 0x1

    :cond_2c
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBuiltinLogCountPerDay:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBuiltinLogCountPerDay:I

    if-eq v4, v5, :cond_2d

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBuiltinLogCountPerDay:I

    add-int/lit8 v3, v3, 0x1

    :cond_2d
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadCustomLogCountPerDay:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadCustomLogCountPerDay:I

    if-eq v4, v5, :cond_2e

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadCustomLogCountPerDay:I

    add-int/lit8 v3, v3, 0x1

    :cond_2e
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogCountPerTypePerDay:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogCountPerTypePerDay:I

    if-eq v4, v5, :cond_2f

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogCountPerTypePerDay:I

    add-int/lit8 v3, v3, 0x1

    :cond_2f
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogCountPerProcess:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogCountPerProcess:I

    if-eq v4, v5, :cond_31

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogCountPerProcess:I

    sget-boolean v4, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v4, :cond_30

    sget-object v4, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v4, v4, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogCountPerProcess:I

    int-to-long v4, v4

    const/16 v6, 0x20

    invoke-static {v6, v4, v5}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_30
    add-int/lit8 v3, v3, 0x1

    :cond_31
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCallJavaDefaultHandler:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCallJavaDefaultHandler:Z

    if-eq v4, v5, :cond_32

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCallJavaDefaultHandler:Z

    add-int/lit8 v3, v3, 0x1

    :cond_32
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCallNativeDefaultHandler:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCallNativeDefaultHandler:Z

    if-eq v4, v5, :cond_33

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCallNativeDefaultHandler:Z

    add-int/lit8 v3, v3, 0x1

    sget-boolean v4, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v4, :cond_33

    sget-object v4, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v4, v4, Lcom/uc/crashsdk/export/CustomInfo;->mCallNativeDefaultHandler:Z

    const/4 v5, 0x5

    invoke-static {v5, v4}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_33
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mDumpUserSolibBuildId:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mDumpUserSolibBuildId:Z

    if-eq v4, v5, :cond_34

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mDumpUserSolibBuildId:Z

    add-int/lit8 v3, v3, 0x1

    sget-boolean v4, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v4, :cond_34

    sget-object v4, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v4, v4, Lcom/uc/crashsdk/export/CustomInfo;->mDumpUserSolibBuildId:Z

    const/4 v5, 0x6

    invoke-static {v5, v4}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_34
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mDumpHprofDataForJavaOOM:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mDumpHprofDataForJavaOOM:Z

    if-eq v4, v5, :cond_35

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mDumpHprofDataForJavaOOM:Z

    add-int/lit8 v3, v3, 0x1

    :cond_35
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mRenameFileToDefaultName:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mRenameFileToDefaultName:Z

    if-eq v4, v5, :cond_36

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mRenameFileToDefaultName:Z

    add-int/lit8 v3, v3, 0x1

    :cond_36
    iget-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mAutoDeleteOldVersionStats:Z

    iget-boolean v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mAutoDeleteOldVersionStats:Z

    if-eq v4, v5, :cond_37

    iput-boolean v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mAutoDeleteOldVersionStats:Z

    add-int/lit8 v3, v3, 0x1

    :cond_37
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mFdDumpMinLimit:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mFdDumpMinLimit:I

    if-eq v4, v5, :cond_39

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mFdDumpMinLimit:I

    sget-boolean v4, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v4, :cond_38

    int-to-long v4, v5

    const/16 v6, 0xa

    invoke-static {v6, v4, v5}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_38
    add-int/lit8 v3, v3, 0x1

    :cond_39
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mThreadsDumpMinLimit:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mThreadsDumpMinLimit:I

    if-eq v4, v5, :cond_3b

    iput v5, v2, Lcom/uc/crashsdk/export/CustomInfo;->mThreadsDumpMinLimit:I

    sget-boolean v4, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v4, :cond_3a

    int-to-long v4, v5

    const/16 v6, 0x16

    invoke-static {v6, v4, v5}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_3a
    add-int/lit8 v3, v3, 0x1

    :cond_3b
    iget v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mInfoUpdateInterval:I

    iget v5, p0, Lcom/uc/crashsdk/export/CustomInfo;->mInfoUpdateInterval:I

    if-eq v4, v5, :cond_3d

    if-gtz v4, :cond_3c

    if-lez v5, :cond_3c

    invoke-static {v1}, Lcom/uc/crashsdk/a;->a(Z)Z

    :cond_3c
    iget v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mInfoUpdateInterval:I

    iput v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mInfoUpdateInterval:I

    add-int/lit8 v3, v3, 0x1

    :cond_3d
    iget v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mInfoSaveFrequency:I

    iget v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mInfoSaveFrequency:I

    if-eq v1, v4, :cond_3e

    iput v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mInfoSaveFrequency:I

    add-int/lit8 v3, v3, 0x1

    :cond_3e
    iget-wide v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mDisableBackgroundSignals:J

    iget-wide v6, p0, Lcom/uc/crashsdk/export/CustomInfo;->mDisableBackgroundSignals:J

    cmp-long v1, v4, v6

    if-eqz v1, :cond_40

    iput-wide v6, v2, Lcom/uc/crashsdk/export/CustomInfo;->mDisableBackgroundSignals:J

    sget-boolean v1, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v1, :cond_3f

    const/16 v1, 0x9

    invoke-static {v1, v6, v7}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    :cond_3f
    add-int/lit8 v3, v3, 0x1

    :cond_40
    iget-boolean v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatReport:Z

    iget-boolean v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatReport:Z

    if-eq v1, v4, :cond_42

    iput-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatReport:Z

    if-eqz v4, :cond_41

    invoke-static {}, Lcom/uc/crashsdk/e;->B()V

    :cond_41
    add-int/lit8 v3, v3, 0x1

    :cond_42
    iget-boolean v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableCrpStat:Z

    iget-boolean v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableCrpStat:Z

    if-eq v1, v4, :cond_43

    iput-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableCrpStat:Z

    add-int/lit8 v3, v3, 0x1

    :cond_43
    iget-boolean v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatToWPKDirect:Z

    iget-boolean v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatToWPKDirect:Z

    if-eq v1, v4, :cond_44

    iput-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatToWPKDirect:Z

    add-int/lit8 v3, v3, 0x1

    :cond_44
    iget-boolean v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mIsInternational:Z

    iget-boolean v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mIsInternational:Z

    if-eq v1, v4, :cond_46

    iput-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mIsInternational:Z

    sget-boolean v1, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v1, :cond_45

    const/16 v1, 0x17

    invoke-static {v1, v4}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_45
    invoke-static {}, Lcom/uc/crashsdk/e;->l()V

    invoke-static {}, Lcom/uc/crashsdk/a/d;->c()V

    invoke-static {}, Lcom/uc/crashsdk/a/h;->k()V

    add-int/lit8 v3, v3, 0x1

    :cond_46
    iget-boolean v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mAutoDetectLifeCycle:Z

    iget-boolean v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mAutoDetectLifeCycle:Z

    if-eq v1, v4, :cond_48

    iput-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mAutoDetectLifeCycle:Z

    if-eqz v4, :cond_47

    invoke-static {}, Lcom/uc/crashsdk/b;->C()V

    :cond_47
    add-int/lit8 v3, v3, 0x1

    :cond_48
    iget-boolean v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMonitorBattery:Z

    iget-boolean v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMonitorBattery:Z

    if-eq v1, v4, :cond_49

    iput-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mMonitorBattery:Z

    invoke-static {}, Lcom/uc/crashsdk/b;->B()Z

    move-result v1

    invoke-static {v1}, Lcom/uc/crashsdk/e;->c(Z)V

    add-int/lit8 v3, v3, 0x1

    :cond_49
    iget v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpSubTypes:I

    iget v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpSubTypes:I

    if-eq v1, v4, :cond_4a

    iput v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpSubTypes:I

    add-int/lit8 v3, v3, 0x1

    :cond_4a
    iget-boolean v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableMemoryGroup:Z

    iget-boolean v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableMemoryGroup:Z

    if-eq v1, v4, :cond_4c

    iput-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableMemoryGroup:Z

    sget-boolean v1, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v1, :cond_4b

    const/16 v1, 0x23

    invoke-static {v1, v4}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_4b
    add-int/lit8 v3, v3, 0x1

    :cond_4c
    iget-boolean v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableLibcMallocDetail:Z

    iget-boolean v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableLibcMallocDetail:Z

    if-eq v1, v4, :cond_4e

    iput-boolean v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mEnableLibcMallocDetail:Z

    sget-boolean v1, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v1, :cond_4d

    const/16 v1, 0x24

    invoke-static {v1, v4}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    :cond_4d
    add-int/lit8 v3, v3, 0x1

    :cond_4e
    iget-object v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mLibcMallocDetailConfig:Ljava/lang/String;

    iget-object v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mLibcMallocDetailConfig:Ljava/lang/String;

    if-eq v1, v4, :cond_50

    iput-object v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mLibcMallocDetailConfig:Ljava/lang/String;

    sget-boolean v1, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v1, :cond_4f

    const/16 v1, 0x83

    invoke-static {v1, v4}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    :cond_4f
    add-int/lit8 v3, v3, 0x1

    :cond_50
    iget-object v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mUserId:Ljava/lang/String;

    iget-object v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mUserId:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_51

    iget-object v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mUserId:Ljava/lang/String;

    iput-object v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mUserId:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    :cond_51
    iget-object v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mChannel:Ljava/lang/String;

    iget-object v4, v2, Lcom/uc/crashsdk/export/CustomInfo;->mChannel:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_52

    iget-object v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mChannel:Ljava/lang/String;

    iput-object v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mChannel:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    :cond_52
    iget-object v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogUploadUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogUploadUrl:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_53

    iget-object v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogUploadUrl:Ljava/lang/String;

    iput-object v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogUploadUrl:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    :cond_53
    iget-object v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRateUploadUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRateUploadUrl:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_54

    iget-object v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRateUploadUrl:Ljava/lang/String;

    iput-object v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRateUploadUrl:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    sget-boolean v4, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v4, :cond_54

    const/16 v4, 0x26

    invoke-static {v4, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    :cond_54
    iget-object v1, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashSDKAuthUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashSDKAuthUrl:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/uc/crashsdk/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_55

    iget-object p0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashSDKAuthUrl:Ljava/lang/String;

    iput-object p0, v2, Lcom/uc/crashsdk/export/CustomInfo;->mCrashSDKAuthUrl:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    sget-boolean v1, Lcom/uc/crashsdk/b;->d:Z

    if-eqz v1, :cond_55

    const/16 v1, 0x27

    invoke-static {v1, p0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    :cond_55
    move v1, v3

    :goto_4
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p0

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static b()V
    .locals 3

    const/16 v0, 0x67

    .line 1
    invoke-static {}, Lcom/uc/crashsdk/a/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 2
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mTagFilesFolderName:Ljava/lang/String;

    const/16 v1, 0x68

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 3
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogsFolderName:Ljava/lang/String;

    const/16 v1, 0x69

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x6a

    .line 4
    invoke-static {}, Lcom/uc/crashsdk/g;->Y()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x6b

    .line 5
    invoke-static {}, Lcom/uc/crashsdk/e;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x6c

    .line 6
    invoke-static {}, Lcom/uc/crashsdk/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x6d

    .line 7
    invoke-static {}, Lcom/uc/crashsdk/g;->T()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x6e

    .line 8
    invoke-static {}, Lcom/uc/crashsdk/g;->U()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x6f

    .line 9
    invoke-static {}, Lcom/uc/crashsdk/g;->V()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x70

    const-string v1, "211215141717"

    .line 10
    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x74

    .line 11
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x75

    .line 12
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    const/16 v0, 0x76

    .line 13
    invoke-static {}, Lcom/uc/crashsdk/e;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 14
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCallNativeDefaultHandler:Z

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 15
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mDumpUserSolibBuildId:Z

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 16
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-wide v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mReservedNativeMemoryBytes:J

    const/4 v2, 0x7

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 17
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mNativeCrashLogFileName:Ljava/lang/String;

    const/16 v1, 0x64

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 18
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpCrashLogFileName:Ljava/lang/String;

    const/16 v1, 0x65

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 19
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableMemoryGroup:Z

    const/16 v1, 0x23

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 20
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableLibcMallocDetail:Z

    const/16 v1, 0x24

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 21
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mLibcMallocDetailConfig:Ljava/lang/String;

    const/16 v1, 0x83

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 22
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mAppId:Ljava/lang/String;

    const/16 v1, 0x66

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 23
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRateUploadUrl:Ljava/lang/String;

    const/16 v1, 0x26

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 24
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashSDKAuthUrl:Ljava/lang/String;

    const/16 v1, 0x27

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    return-void
.end method

.method public static c()V
    .locals 5

    const/16 v0, 0xb

    .line 23
    invoke-static {}, Lcom/uc/crashsdk/g;->P()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 24
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mBackupLogs:Z

    const/16 v1, 0xc

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 25
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRestartInterval:I

    int-to-long v0, v0

    const/16 v2, 0xd

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 26
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxBuiltinLogFilesCount:I

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 27
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxNativeLogcatLineCount:I

    int-to-long v0, v0

    const/16 v2, 0xf

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 28
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUnexpLogcatLineCount:I

    int-to-long v0, v0

    const/16 v2, 0x10

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 29
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogcatLineCount:I

    int-to-long v0, v0

    const/16 v2, 0x1f

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    const/16 v0, 0x12

    .line 30
    invoke-static {}, Lcom/uc/crashsdk/g;->O()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    int-to-long v0, v0

    const/16 v2, 0x14

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 32
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mOmitNativeCrash:Z

    const/16 v1, 0x15

    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 33
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogCountPerProcess:I

    int-to-long v0, v0

    const/16 v2, 0x20

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 34
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-wide v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mDisableSignals:J

    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 35
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-wide v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mDisableBackgroundSignals:J

    const/16 v2, 0x9

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 36
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v1, v0, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    .line 37
    :goto_0
    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x3

    .line 38
    invoke-static {v4, v1, v2, v0, v3}, Lcom/uc/crashsdk/JNIBridge;->nativeSet(IJLjava/lang/String;[Ljava/lang/Object;)J

    .line 39
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mLogMaxBytesLimit:I

    int-to-long v0, v0

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    const/16 v0, 0x77

    .line 40
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    return-void
.end method

.method private static c(Lcom/uc/crashsdk/export/CustomInfo;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    const-string v1, ".tmp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 4
    iget-boolean v0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mOmitJavaCrash:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 5
    iput-boolean v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCallJavaDefaultHandler:Z

    .line 6
    :cond_1
    iget-boolean v0, p0, Lcom/uc/crashsdk/export/CustomInfo;->mOmitNativeCrash:Z

    if-eqz v0, :cond_2

    .line 7
    iput-boolean v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mCallNativeDefaultHandler:Z

    .line 8
    :cond_2
    invoke-static {}, Lcom/uc/crashsdk/e;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v2, v0, v2

    if-ltz v2, :cond_3

    const/16 v2, 0xc8

    .line 9
    iput v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxBuiltinLogFilesCount:I

    const/16 v2, 0x64

    .line 10
    iput v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogFilesCount:I

    const-wide/32 v3, 0x10000000

    .line 11
    iput-wide v3, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBytesPerDay:J

    const/16 v3, 0x7d0

    .line 12
    iput v3, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadBuiltinLogCountPerDay:I

    .line 13
    iput v3, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxUploadCustomLogCountPerDay:I

    .line 14
    iput v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogCountPerTypePerDay:I

    .line 15
    iput v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxAnrLogCountPerProcess:I

    const/4 v2, 0x2

    .line 16
    iput v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mAnrTraceStrategy:I

    const-wide/16 v2, 0x2

    cmp-long v2, v0, v2

    if-ltz v2, :cond_3

    const/4 v2, 0x1

    .line 17
    iput-boolean v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadSetupCrashLogs:Z

    .line 18
    iput-boolean v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadLogs:Z

    const-wide/16 v3, 0x3

    cmp-long v0, v0, v3

    if-ltz v0, :cond_3

    .line 19
    iput-boolean v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mBackupLogs:Z

    .line 20
    iput-boolean v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mPrintStackInfos:Z

    .line 21
    iput-boolean v2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mDebug:Z

    :cond_3
    return-void

    .line 22
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "mZippedLogExtension can not be \'.tmp\'!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d()V
    .locals 5

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mIsInternational:Z

    .line 4
    .line 5
    const/16 v1, 0x17

    .line 6
    .line 7
    invoke-static {v1, v0}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/uc/crashsdk/b;->H()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x22

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/e;->i()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {v1, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 29
    .line 30
    .line 31
    :cond_1
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 32
    .line 33
    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mFdDumpMinLimit:I

    .line 34
    .line 35
    int-to-long v2, v0

    .line 36
    const/16 v0, 0xa

    .line 37
    .line 38
    invoke-static {v0, v2, v3}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 39
    .line 40
    .line 41
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 42
    .line 43
    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mReservedNativeFileHandleCount:I

    .line 44
    .line 45
    int-to-long v2, v0

    .line 46
    const/4 v0, 0x3

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static {v0, v2, v3, v4, v4}, Lcom/uc/crashsdk/JNIBridge;->nativeCmd(IJLjava/lang/String;[Ljava/lang/Object;)J

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/uc/crashsdk/b;->B()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {v0}, Lcom/uc/crashsdk/JNIBridge;->nativeSetForeground(Z)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    invoke-static {}, Lcom/uc/crashsdk/b;->F()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-static {v0, v2}, Lcom/uc/crashsdk/JNIBridge;->set(IZ)J

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lcom/uc/crashsdk/a;->e()V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lcom/uc/crashsdk/a;->g()V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lcom/uc/crashsdk/a;->i()V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lcom/uc/crashsdk/a;->k()V

    .line 76
    .line 77
    .line 78
    const/16 v0, 0x71

    .line 79
    .line 80
    sget-object v2, Lcom/uc/crashsdk/a;->a:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v0, v2}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lcom/uc/crashsdk/JNIBridge;->cmd(I)J

    .line 86
    .line 87
    .line 88
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 89
    .line 90
    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mThreadsDumpMinLimit:I

    .line 91
    .line 92
    int-to-long v0, v0

    .line 93
    const/16 v2, 0x16

    .line 94
    .line 95
    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 96
    .line 97
    .line 98
    const/16 v0, 0x7a

    .line 99
    .line 100
    invoke-static {}, Lcom/uc/crashsdk/a;->a()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(ILjava/lang/String;)J

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lcom/uc/crashsdk/a;->c()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    int-to-long v0, v0

    .line 112
    const/16 v2, 0x21

    .line 113
    .line 114
    invoke-static {v2, v0, v1}, Lcom/uc/crashsdk/JNIBridge;->set(IJ)J

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lcom/uc/crashsdk/g;->ae()V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lcom/uc/crashsdk/b;->K()V

    .line 121
    .line 122
    .line 123
    invoke-static {}, Lcom/uc/crashsdk/b;->D()V

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lcom/uc/crashsdk/a/g;->k()V

    .line 127
    .line 128
    .line 129
    return-void
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

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mAppId:Ljava/lang/String;

    return-object v0
.end method

.method static f()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mJavaCrashLogFileName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->b(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mNativeCrashLogFileName:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->b(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpCrashLogFileName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/uc/crashsdk/a/g;->b(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
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

.method static g()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mJavaCrashLogFileName:Ljava/lang/String;

    return-object v0
.end method

.method static h()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRestartInterval:I

    return v0
.end method

.method static i()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCallJavaDefaultHandler:Z

    return v0
.end method

.method static j()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mDumpHprofDataForJavaOOM:Z

    return v0
.end method

.method static k()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mRenameFileToDefaultName:Z

    return v0
.end method

.method static l()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxBuiltinLogFilesCount:I

    return v0
.end method

.method static m()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxCustomLogFilesCount:I

    return v0
.end method

.method static n()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mMaxJavaLogcatLineCount:I

    return v0
.end method

.method static o()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpDelayMillSeconds:I

    return v0
.end method

.method static p()I
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mUnexpSubTypes:I

    return v0
.end method

.method static q()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mBackupLogs:Z

    return v0
.end method

.method public static r()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadSetupCrashLogs:Z

    return v0
.end method

.method static s()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mSyncUploadLogs:Z

    return v0
.end method

.method static t()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mOmitJavaCrash:Z

    return v0
.end method

.method static u()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mAutoDeleteOldVersionStats:Z

    return v0
.end method

.method static v()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    return v0
.end method

.method static w()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mZippedLogExtension:Ljava/lang/String;

    return-object v0
.end method

.method static x()Z
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-boolean v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mEncryptLog:Z

    return v0
.end method

.method public static y()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashLogUploadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static z()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/g;->d:Lcom/uc/crashsdk/export/CustomInfo;

    iget-object v0, v0, Lcom/uc/crashsdk/export/CustomInfo;->mCrashRateUploadUrl:Ljava/lang/String;

    return-object v0
.end method
