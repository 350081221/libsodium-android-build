.class public Lcom/lody/virtual/client/natives/NativeMethods;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static gAudioRecordMethodType:I

.field public static gAudioRecordNativeCheckPermission:Ljava/lang/reflect/Method;

.field public static gAudioRecordNativeSetup:Ljava/lang/reflect/Method;

.field public static gCameraMethodType:I

.field public static gCameraNativeSetup:Ljava/lang/reflect/Method;

.field public static gMediaRecorderNativeSetup:Ljava/lang/reflect/Method;

.field public static gNativeLoad:Ljava/lang/reflect/Method;

.field public static gNativeMask:Ljava/lang/reflect/Method;

.field public static gOpenDexFileNative:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/natives/NativeMethods;->init()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    .line 8
    .line 9
    :goto_0
    return-void
    .line 10
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getAudioRecordNativeSetup()Ljava/lang/reflect/Method;
    .locals 17
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "native_setup"

    .line 4
    .line 5
    const-class v2, Landroid/media/AudioRecord;

    .line 6
    .line 7
    const-class v3, [I

    .line 8
    .line 9
    const-class v4, Ljava/lang/Object;

    .line 10
    .line 11
    const/16 v5, 0x8

    .line 12
    .line 13
    const/4 v6, 0x7

    .line 14
    const/4 v7, 0x6

    .line 15
    const/4 v8, 0x5

    .line 16
    const/4 v9, 0x4

    .line 17
    const/4 v10, 0x3

    .line 18
    const/4 v11, 0x2

    .line 19
    const/16 v12, 0x9

    .line 20
    .line 21
    const/4 v13, 0x1

    .line 22
    const/4 v14, 0x0

    .line 23
    const/16 v15, 0xa

    .line 24
    .line 25
    :try_start_0
    new-array v15, v15, [Ljava/lang/Class;

    .line 26
    .line 27
    aput-object v4, v15, v14

    .line 28
    .line 29
    aput-object v4, v15, v13

    .line 30
    .line 31
    aput-object v3, v15, v11

    .line 32
    .line 33
    sget-object v16, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    aput-object v16, v15, v10

    .line 36
    .line 37
    aput-object v16, v15, v9

    .line 38
    .line 39
    aput-object v16, v15, v8

    .line 40
    .line 41
    aput-object v16, v15, v7

    .line 42
    .line 43
    aput-object v3, v15, v6

    .line 44
    .line 45
    aput-object v0, v15, v5

    .line 46
    .line 47
    sget-object v16, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    aput-object v16, v15, v12

    .line 50
    .line 51
    invoke-virtual {v2, v1, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v15
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    goto :goto_0

    .line 56
    :catch_0
    const/4 v15, 0x0

    .line 57
    :goto_0
    if-nez v15, :cond_0

    .line 58
    .line 59
    :try_start_1
    new-array v12, v12, [Ljava/lang/Class;

    .line 60
    .line 61
    aput-object v4, v12, v14

    .line 62
    .line 63
    aput-object v4, v12, v13

    .line 64
    .line 65
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    aput-object v4, v12, v11

    .line 68
    .line 69
    aput-object v4, v12, v10

    .line 70
    .line 71
    aput-object v4, v12, v9

    .line 72
    .line 73
    aput-object v4, v12, v8

    .line 74
    .line 75
    aput-object v4, v12, v7

    .line 76
    .line 77
    aput-object v3, v12, v6

    .line 78
    .line 79
    aput-object v0, v12, v5

    .line 80
    .line 81
    invoke-virtual {v2, v1, v12}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    move-result-object v15
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 85
    :catch_1
    :cond_0
    return-object v15
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

.method private static getCameraNativeSetup()Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    const-class v0, Landroid/hardware/Camera;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_1

    .line 12
    .line 13
    aget-object v3, v0, v2

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-string v5, "native_setup"

    .line 20
    .line 21
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    return-object v0
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

.method private static getMediaRecorderNativeSetup()Ljava/lang/reflect/Method;
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BlockedPrivateApi"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "native_setup"

    .line 4
    .line 5
    const-class v2, Landroid/media/MediaRecorder;

    .line 6
    .line 7
    const-class v3, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 13
    .line 14
    .line 15
    move-result v7
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 16
    const/4 v8, 0x3

    .line 17
    if-eqz v7, :cond_0

    .line 18
    .line 19
    :try_start_1
    new-array v7, v8, [Ljava/lang/Class;

    .line 20
    .line 21
    aput-object v0, v7, v6

    .line 22
    .line 23
    aput-object v3, v7, v4

    .line 24
    .line 25
    const-class v9, Landroid/os/Parcel;

    .line 26
    .line 27
    aput-object v9, v7, v5

    .line 28
    .line 29
    invoke-virtual {v2, v1, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    :try_start_2
    new-array v7, v8, [Ljava/lang/Class;

    .line 35
    .line 36
    aput-object v0, v7, v6

    .line 37
    .line 38
    aput-object v3, v7, v4

    .line 39
    .line 40
    const-class v8, Landroid/os/Parcelable;

    .line 41
    .line 42
    aput-object v8, v7, v5

    .line 43
    .line 44
    invoke-virtual {v2, v1, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-array v7, v8, [Ljava/lang/Class;

    .line 50
    .line 51
    aput-object v0, v7, v6

    .line 52
    .line 53
    aput-object v3, v7, v4

    .line 54
    .line 55
    aput-object v3, v7, v5

    .line 56
    .line 57
    invoke-virtual {v2, v1, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v7
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    .line 61
    goto :goto_0

    .line 62
    :catch_1
    const/4 v7, 0x0

    .line 63
    :goto_0
    if-nez v7, :cond_1

    .line 64
    .line 65
    :try_start_3
    new-array v5, v5, [Ljava/lang/Class;

    .line 66
    .line 67
    aput-object v0, v5, v6

    .line 68
    .line 69
    aput-object v3, v5, v4

    .line 70
    .line 71
    invoke-virtual {v2, v1, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 72
    .line 73
    .line 74
    move-result-object v7
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    .line 75
    :catch_2
    :cond_1
    return-object v7
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

.method private static init()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BlockedPrivateApi"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Lcom/lody/virtual/client/NativeEngine;

    .line 3
    .line 4
    const-string v2, "nativeMark"

    .line 5
    .line 6
    new-array v3, v0, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sput-object v1, Lcom/lody/virtual/client/natives/NativeMethods;->gNativeMask:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isR()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x2

    .line 24
    const-class v3, Ljava/lang/String;

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    :try_start_1
    const-class v1, Ljava/lang/Runtime;

    .line 30
    .line 31
    const-string v5, "nativeLoad"

    .line 32
    .line 33
    const/4 v6, 0x3

    .line 34
    new-array v6, v6, [Ljava/lang/Class;

    .line 35
    .line 36
    aput-object v3, v6, v0

    .line 37
    .line 38
    const-class v7, Ljava/lang/ClassLoader;

    .line 39
    .line 40
    aput-object v7, v6, v4

    .line 41
    .line 42
    const-class v7, Ljava/lang/Class;

    .line 43
    .line 44
    aput-object v7, v6, v2

    .line 45
    .line 46
    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sput-object v1, Lcom/lody/virtual/client/natives/NativeMethods;->gNativeLoad:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_1
    move-exception v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 55
    .line 56
    .line 57
    :cond_0
    :goto_1
    invoke-static {}, Lcom/lody/virtual/client/natives/NativeMethods;->getMediaRecorderNativeSetup()Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sput-object v1, Lcom/lody/virtual/client/natives/NativeMethods;->gMediaRecorderNativeSetup:Ljava/lang/reflect/Method;

    .line 62
    .line 63
    invoke-static {}, Lcom/lody/virtual/client/natives/NativeMethods;->getAudioRecordNativeSetup()Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sput-object v1, Lcom/lody/virtual/client/natives/NativeMethods;->gAudioRecordNativeSetup:Ljava/lang/reflect/Method;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    array-length v1, v1

    .line 76
    const/16 v5, 0xa

    .line 77
    .line 78
    if-ne v1, v5, :cond_1

    .line 79
    .line 80
    sput v2, Lcom/lody/virtual/client/natives/NativeMethods;->gAudioRecordMethodType:I

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    sput v4, Lcom/lody/virtual/client/natives/NativeMethods;->gAudioRecordMethodType:I

    .line 84
    .line 85
    :goto_2
    const-class v1, Ldalvik/system/DexFile;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    array-length v2, v1

    .line 92
    move v5, v0

    .line 93
    :goto_3
    const-string v6, "openDexFileNative"

    .line 94
    .line 95
    if-ge v5, v2, :cond_3

    .line 96
    .line 97
    aget-object v7, v1, v5

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_2

    .line 108
    .line 109
    sput-object v7, Lcom/lody/virtual/client/natives/NativeMethods;->gOpenDexFileNative:Ljava/lang/reflect/Method;

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    :goto_4
    sget-object v1, Lcom/lody/virtual/client/natives/NativeMethods;->gOpenDexFileNative:Ljava/lang/reflect/Method;

    .line 116
    .line 117
    if-eqz v1, :cond_7

    .line 118
    .line 119
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    const/4 v1, -0x1

    .line 123
    sput v1, Lcom/lody/virtual/client/natives/NativeMethods;->gCameraMethodType:I

    .line 124
    .line 125
    invoke-static {}, Lcom/lody/virtual/client/natives/NativeMethods;->getCameraNativeSetup()Ljava/lang/reflect/Method;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v2, v3}, Lcom/lody/virtual/client/hook/utils/MethodParameterUtils;->getParamsIndex([Ljava/lang/Class;Ljava/lang/Class;)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    sput-object v1, Lcom/lody/virtual/client/natives/NativeMethods;->gCameraNativeSetup:Ljava/lang/reflect/Method;

    .line 140
    .line 141
    add-int/lit8 v2, v2, 0x10

    .line 142
    .line 143
    sput v2, Lcom/lody/virtual/client/natives/NativeMethods;->gCameraMethodType:I

    .line 144
    .line 145
    :cond_4
    const-class v1, Landroid/media/AudioRecord;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    array-length v2, v1

    .line 152
    move v5, v0

    .line 153
    :goto_5
    if-ge v5, v2, :cond_6

    .line 154
    .line 155
    aget-object v6, v1, v5

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    const-string v8, "native_check_permission"

    .line 162
    .line 163
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_5

    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    array-length v7, v7

    .line 174
    if-ne v7, v4, :cond_5

    .line 175
    .line 176
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    aget-object v7, v7, v0

    .line 181
    .line 182
    if-ne v7, v3, :cond_5

    .line 183
    .line 184
    sput-object v6, Lcom/lody/virtual/client/natives/NativeMethods;->gAudioRecordNativeCheckPermission:Ljava/lang/reflect/Method;

    .line 185
    .line 186
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 187
    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_6
    :goto_6
    return-void

    .line 194
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 195
    .line 196
    new-instance v1, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v2, "Unable to find method : "

    .line 202
    .line 203
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v0
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
