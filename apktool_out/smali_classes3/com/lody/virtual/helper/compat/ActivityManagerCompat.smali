.class public Lcom/lody/virtual/helper/compat/ActivityManagerCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INTENT_SENDER_ACTIVITY:I = 0x2

.field public static final INTENT_SENDER_ACTIVITY_RESULT:I = 0x3

.field public static final INTENT_SENDER_BROADCAST:I = 0x1

.field public static final INTENT_SENDER_SERVICE:I = 0x4

.field public static final SERVICE_DONE_EXECUTING_ANON:I = 0x0

.field public static final SERVICE_DONE_EXECUTING_START:I = 0x1

.field public static final SERVICE_DONE_EXECUTING_STOP:I = 0x2

.field public static final START_INTENT_NOT_RESOLVED:I

.field public static final START_NOT_CURRENT_USER_ACTIVITY:I

.field public static final START_TASK_TO_FRONT:I

.field public static final USER_OP_SUCCESS:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/app/ActivityManager;->START_INTENT_NOT_RESOLVED:Lmirror/RefStaticInt;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lmirror/RefStaticInt;->get()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    sput v0, Lcom/lody/virtual/helper/compat/ActivityManagerCompat;->START_INTENT_NOT_RESOLVED:I

    .line 12
    .line 13
    sget-object v0, Lmirror/android/app/ActivityManager;->START_NOT_CURRENT_USER_ACTIVITY:Lmirror/RefStaticInt;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, -0x8

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {v0}, Lmirror/RefStaticInt;->get()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :goto_1
    sput v0, Lcom/lody/virtual/helper/compat/ActivityManagerCompat;->START_NOT_CURRENT_USER_ACTIVITY:I

    .line 24
    .line 25
    sget-object v0, Lmirror/android/app/ActivityManager;->START_TASK_TO_FRONT:Lmirror/RefStaticInt;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual {v0}, Lmirror/RefStaticInt;->get()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    :goto_2
    sput v0, Lcom/lody/virtual/helper/compat/ActivityManagerCompat;->START_TASK_TO_FRONT:I

    .line 36
    .line 37
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static finishActivity(Landroid/os/IBinder;ILandroid/content/Intent;)Z
    .locals 4

    .line 1
    sget-object v0, Lmirror/android/app/IActivityManagerN;->finishActivity:Lmirror/RefMethod;

    .line 2
    .line 3
    sget-object v1, Lmirror/android/app/ActivityManagerNative;->getDefault:Lmirror/RefStaticMethod;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {v1, v3}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v3, 0x4

    .line 13
    new-array v3, v3, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p0, v3, v2

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    aput-object p1, v3, p0

    .line 23
    .line 24
    const/4 p0, 0x2

    .line 25
    aput-object p2, v3, p0

    .line 26
    .line 27
    const/4 p0, 0x3

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    aput-object p1, v3, p0

    .line 33
    .line 34
    invoke-virtual {v0, v1, v3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0
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

.method public static setActivityOrientation(Landroid/app/Activity;I)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_1

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lmirror/android/app/Activity;->mParent:Lmirror/RefObject;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/app/Activity;

    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lmirror/android/app/Activity;->mParent:Lmirror/RefObject;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Landroid/app/Activity;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object v0, Lmirror/android/app/Activity;->mToken:Lmirror/RefObject;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Landroid/os/IBinder;

    .line 35
    .line 36
    :try_start_1
    sget-object v0, Lmirror/android/app/IActivityManager;->setRequestedOrientation:Lmirror/RefMethod;

    .line 37
    .line 38
    sget-object v1, Lmirror/android/app/ActivityManagerNative;->getDefault:Lmirror/RefStaticMethod;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    new-array v3, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v3, 0x2

    .line 48
    new-array v3, v3, [Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p0, v3, v2

    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const/4 p1, 0x1

    .line 57
    aput-object p0, v3, p1

    .line 58
    .line 59
    invoke-virtual {v0, v1, v3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 65
    .line 66
    .line 67
    :goto_1
    return-void
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
