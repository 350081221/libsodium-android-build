.class public Lcom/umeng/commonsdk/statistics/idtracking/Envelope;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final dummyID1:Ljava/lang/String; = "1234567890987654321"

.field private static final dummyID2:Ljava/lang/String; = "02:00:00:00:00:00"


# instance fields
.field private final CODEX_ENCRYPT:I

.field private final CODEX_NORMAL:I

.field private final SEED:[B

.field private encrypt:Z

.field private identity:[B

.field private mAddress:Ljava/lang/String;

.field private mChecksum:[B

.field private mEntity:[B

.field private mGuid:[B

.field private mLength:I

.field private mSerialNo:I

.field private mSignature:[B

.field private mTimestamp:I

.field private mVersion:Ljava/lang/String;


# direct methods
.method private constructor <init>([BLjava/lang/String;[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    fill-array-data v0, :array_0

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->SEED:[B

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->CODEX_ENCRYPT:I

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->CODEX_NORMAL:I

    .line 18
    .line 19
    const-string v1, "1.0"

    .line 20
    .line 21
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mVersion:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mAddress:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 27
    .line 28
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mGuid:[B

    .line 29
    .line 30
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mChecksum:[B

    .line 31
    .line 32
    iput v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSerialNo:I

    .line 33
    .line 34
    iput v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mTimestamp:I

    .line 35
    .line 36
    iput v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mLength:I

    .line 37
    .line 38
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mEntity:[B

    .line 39
    .line 40
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->identity:[B

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->encrypt:Z

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    array-length v0, p1

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    iput-object p2, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mAddress:Ljava/lang/String;

    .line 50
    .line 51
    array-length p2, p1

    .line 52
    iput p2, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mLength:I

    .line 53
    .line 54
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/b;->a([B)[B

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mEntity:[B

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    const-wide/16 v0, 0x3e8

    .line 65
    .line 66
    div-long/2addr p1, v0

    .line 67
    long-to-int p1, p1

    .line 68
    iput p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mTimestamp:I

    .line 69
    .line 70
    iput-object p3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->identity:[B

    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 74
    .line 75
    const-string p2, "entity is null or empty"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
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

.method private genCheckSum()[B
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 7
    .line 8
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSerialNo:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mTimestamp:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mLength:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mGuid:[B

    .line 31
    .line 32
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->hash([B)[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
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

.method public static genEncryptEnvelope(Landroid/content/Context;Ljava/lang/String;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;
    .locals 9

    .line 1
    const-string v0, "serial"

    .line 2
    .line 3
    const-string v1, "signature"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v5, 0x1

    .line 15
    invoke-interface {v3, v0, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    new-instance v7, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    .line 20
    .line 21
    const-string v8, "123456789098765432102:00:00:00:00:00"

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-direct {v7, p2, p1, v8}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;-><init>([BLjava/lang/String;[B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7, v5}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->setEncrypt(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7, v4}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->setSignature(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7, v6}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->setSerialNumber(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->seal()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    add-int/2addr v6, v5

    .line 47
    invoke-interface {p1, v0, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v7}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->getSignature()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, p0}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->export(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    return-object v7

    .line 66
    :catch_0
    move-exception p1

    .line 67
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-object v2
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

.method public static genEnvelope(Landroid/content/Context;Ljava/lang/String;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;
    .locals 9

    .line 1
    const-string v0, "serial"

    .line 2
    .line 3
    const-string v1, "signature"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v5, 0x1

    .line 15
    invoke-interface {v3, v0, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    new-instance v7, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    .line 20
    .line 21
    const-string v8, "123456789098765432102:00:00:00:00:00"

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-direct {v7, p2, p1, v8}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;-><init>([BLjava/lang/String;[B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7, v4}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->setSignature(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7, v6}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->setSerialNumber(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->seal()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    add-int/2addr v6, v5

    .line 44
    invoke-interface {p1, v0, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v7}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->getSignature()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, p0}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->export(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-object v7

    .line 63
    :catch_0
    move-exception p1

    .line 64
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-object v2
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

.method private genGuid([BI)[B
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->identity:[B

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->hash([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mEntity:[B

    .line 8
    .line 9
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->hash([B)[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    array-length v2, v0

    .line 14
    mul-int/lit8 v3, v2, 0x2

    .line 15
    .line 16
    new-array v4, v3, [B

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move v6, v5

    .line 20
    :goto_0
    const/4 v7, 0x1

    .line 21
    if-ge v6, v2, :cond_0

    .line 22
    .line 23
    mul-int/lit8 v8, v6, 0x2

    .line 24
    .line 25
    aget-byte v9, v1, v6

    .line 26
    .line 27
    aput-byte v9, v4, v8

    .line 28
    .line 29
    add-int/2addr v8, v7

    .line 30
    aget-byte v7, v0, v6

    .line 31
    .line 32
    aput-byte v7, v4, v8

    .line 33
    .line 34
    add-int/lit8 v6, v6, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v0, v5

    .line 38
    :goto_1
    const/4 v1, 0x2

    .line 39
    if-ge v0, v1, :cond_1

    .line 40
    .line 41
    aget-byte v1, p1, v0

    .line 42
    .line 43
    aput-byte v1, v4, v0

    .line 44
    .line 45
    sub-int v1, v3, v0

    .line 46
    .line 47
    sub-int/2addr v1, v7

    .line 48
    array-length v2, p1

    .line 49
    sub-int/2addr v2, v0

    .line 50
    sub-int/2addr v2, v7

    .line 51
    aget-byte v2, p1, v2

    .line 52
    .line 53
    aput-byte v2, v4, v1

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 p1, 0x4

    .line 59
    new-array p1, p1, [B

    .line 60
    .line 61
    and-int/lit16 v0, p2, 0xff

    .line 62
    .line 63
    int-to-byte v0, v0

    .line 64
    aput-byte v0, p1, v5

    .line 65
    .line 66
    shr-int/lit8 v0, p2, 0x8

    .line 67
    .line 68
    and-int/lit16 v0, v0, 0xff

    .line 69
    .line 70
    int-to-byte v0, v0

    .line 71
    aput-byte v0, p1, v7

    .line 72
    .line 73
    shr-int/lit8 v0, p2, 0x10

    .line 74
    .line 75
    and-int/lit16 v0, v0, 0xff

    .line 76
    .line 77
    int-to-byte v0, v0

    .line 78
    aput-byte v0, p1, v1

    .line 79
    .line 80
    ushr-int/lit8 p2, p2, 0x18

    .line 81
    .line 82
    int-to-byte p2, p2

    .line 83
    const/4 v0, 0x3

    .line 84
    aput-byte p2, p1, v0

    .line 85
    .line 86
    :goto_2
    if-ge v5, v3, :cond_2

    .line 87
    .line 88
    aget-byte p2, v4, v5

    .line 89
    .line 90
    rem-int/lit8 v0, v5, 0x4

    .line 91
    .line 92
    aget-byte v0, p1, v0

    .line 93
    .line 94
    xor-int/2addr p2, v0

    .line 95
    int-to-byte p2, p2

    .line 96
    aput-byte p2, v4, v5

    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    return-object v4
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

.method private genSignature()[B
    .locals 5

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->SEED:[B

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    long-to-int v1, v1

    invoke-direct {p0, v0, v1}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->genGuid([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public static getSignature(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "signature"

    .line 2
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public export(Landroid/content/Context;)V
    .locals 10

    .line 1
    const-string v0, "appkey"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mAddress:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "umid"

    .line 7
    .line 8
    invoke-static {p1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v4, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 13
    .line 14
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/16 v5, 0x10

    .line 19
    .line 20
    new-array v6, v5, [B

    .line 21
    .line 22
    iget-object v7, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 23
    .line 24
    const/4 v8, 0x2

    .line 25
    const/4 v9, 0x0

    .line 26
    invoke-static {v7, v8, v6, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->hash([B)[B

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 38
    .line 39
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    :cond_0
    const-string v7, "signature"

    .line 51
    .line 52
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    const-string v4, "checksum"

    .line 56
    .line 57
    invoke-virtual {v6, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lcom/umeng/analytics/pro/au;->b()Lcom/umeng/analytics/pro/au;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const-string v5, "exp"

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Lcom/umeng/analytics/pro/au;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    new-instance v5, Ljava/io/File;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-direct {v5, v7, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_1

    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/io/File;->mkdir()Z

    .line 86
    .line 87
    .line 88
    :cond_1
    new-instance v4, Ljava/io/File;

    .line 89
    .line 90
    const-string v7, "exchangeIdentity.json"

    .line 91
    .line 92
    invoke-direct {v4, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v4, v5}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->writeFile(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception v4

    .line 104
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 105
    .line 106
    .line 107
    :goto_0
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    .line 108
    .line 109
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    const-string v0, "channel"

    .line 116
    .line 117
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    if-eqz v2, :cond_2

    .line 125
    .line 126
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->getUmengMD5(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    :cond_2
    invoke-static {}, Lcom/umeng/analytics/pro/au;->b()Lcom/umeng/analytics/pro/au;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const-string v1, "exid"

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/au;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    new-instance v1, Ljava/io/File;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {v1, p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->writeFile(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :catchall_1
    move-exception p1

    .line 161
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 162
    .line 163
    .line 164
    :goto_1
    return-void
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
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public seal()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->genSignature()[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->encrypt:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    new-array v1, v0, [B

    .line 18
    .line 19
    :try_start_0
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mEntity:[B

    .line 27
    .line 28
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->encrypt([B[B)[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mEntity:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    :catch_0
    :cond_1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 35
    .line 36
    iget v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mTimestamp:I

    .line 37
    .line 38
    invoke-direct {p0, v0, v1}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->genGuid([BI)[B

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mGuid:[B

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->genCheckSum()[B

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mChecksum:[B

    .line 49
    .line 50
    return-void
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

.method public setEncrypt(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->encrypt:Z

    return-void
.end method

.method public setSerialNumber(I)V
    .locals 0

    iput p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSerialNo:I

    return-void
.end method

.method public setSignature(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->reverseHexString(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    return-void
.end method

.method public toBinary()[B
    .locals 2

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/bj;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/umeng/analytics/pro/bj;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mVersion:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->a(Ljava/lang/String;)Lcom/umeng/analytics/pro/bj;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mAddress:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->b(Ljava/lang/String;)Lcom/umeng/analytics/pro/bj;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 17
    .line 18
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->c(Ljava/lang/String;)Lcom/umeng/analytics/pro/bj;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSerialNo:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->a(I)Lcom/umeng/analytics/pro/bj;

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mTimestamp:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->b(I)Lcom/umeng/analytics/pro/bj;

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mLength:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->c(I)Lcom/umeng/analytics/pro/bj;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mEntity:[B

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->a([B)Lcom/umeng/analytics/pro/bj;

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->encrypt:Z

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->d(I)Lcom/umeng/analytics/pro/bj;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mGuid:[B

    .line 51
    .line 52
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->d(Ljava/lang/String;)Lcom/umeng/analytics/pro/bj;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mChecksum:[B

    .line 60
    .line 61
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bj;->e(Ljava/lang/String;)Lcom/umeng/analytics/pro/bj;

    .line 66
    .line 67
    .line 68
    :try_start_0
    new-instance v1, Lcom/umeng/analytics/pro/ca;

    .line 69
    .line 70
    invoke-direct {v1}, Lcom/umeng/analytics/pro/ca;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lcom/umeng/analytics/pro/ca;->a(Lcom/umeng/analytics/pro/br;)[B

    .line 74
    .line 75
    .line 76
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    return-object v0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v2, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mVersion:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    aput-object v3, v2, v4

    .line 13
    .line 14
    const-string v3, "version : %s\n"

    .line 15
    .line 16
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    new-array v2, v1, [Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mAddress:Ljava/lang/String;

    .line 26
    .line 27
    aput-object v3, v2, v4

    .line 28
    .line 29
    const-string v3, "address : %s\n"

    .line 30
    .line 31
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    new-array v2, v1, [Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSignature:[B

    .line 41
    .line 42
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    aput-object v3, v2, v4

    .line 47
    .line 48
    const-string v3, "signature : %s\n"

    .line 49
    .line 50
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    new-array v2, v1, [Ljava/lang/Object;

    .line 58
    .line 59
    iget v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mSerialNo:I

    .line 60
    .line 61
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    aput-object v3, v2, v4

    .line 66
    .line 67
    const-string v3, "serial : %s\n"

    .line 68
    .line 69
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    new-array v2, v1, [Ljava/lang/Object;

    .line 77
    .line 78
    iget v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mTimestamp:I

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    aput-object v3, v2, v4

    .line 85
    .line 86
    const-string v3, "timestamp : %d\n"

    .line 87
    .line 88
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    new-array v2, v1, [Ljava/lang/Object;

    .line 96
    .line 97
    iget v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mLength:I

    .line 98
    .line 99
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    aput-object v3, v2, v4

    .line 104
    .line 105
    const-string v3, "length : %d\n"

    .line 106
    .line 107
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    new-array v2, v1, [Ljava/lang/Object;

    .line 115
    .line 116
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mGuid:[B

    .line 117
    .line 118
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    aput-object v3, v2, v4

    .line 123
    .line 124
    const-string v3, "guid : %s\n"

    .line 125
    .line 126
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    new-array v2, v1, [Ljava/lang/Object;

    .line 134
    .line 135
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->mChecksum:[B

    .line 136
    .line 137
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->toHexString([B)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    aput-object v3, v2, v4

    .line 142
    .line 143
    const-string v3, "checksum : %s "

    .line 144
    .line 145
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    new-array v1, v1, [Ljava/lang/Object;

    .line 153
    .line 154
    iget-boolean v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->encrypt:Z

    .line 155
    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    aput-object v2, v1, v4

    .line 161
    .line 162
    const-string v2, "codex : %d"

    .line 163
    .line 164
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    return-object v0
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
