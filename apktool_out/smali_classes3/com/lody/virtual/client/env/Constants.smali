.class public Lcom/lody/virtual/client/env/Constants;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static ACTION_BADGER_CHANGE:Ljava/lang/String; = null

.field public static final ACTION_GMS_INITIALIZED:Ljava/lang/String; = "android.intent.action.GMS_INITIALIZED"

.field public static final ACTION_LAUNCH_HELPER_PROCESS:Ljava/lang/String; = "android.intent.action.LAUNCH_HELPER"

.field public static final ACTION_NEW_TASK_CREATED:Ljava/lang/String; = "virtual.intent.action.APP_LAUNCHED"

.field public static final ACTION_PACKAGE_ADDED:Ljava/lang/String; = "virtual.android.intent.action.PACKAGE_ADDED"

.field public static final ACTION_PACKAGE_CHANGED:Ljava/lang/String; = "virtual.android.intent.action.PACKAGE_CHANGED"

.field public static final ACTION_PACKAGE_REMOVED:Ljava/lang/String; = "virtual.android.intent.action.PACKAGE_REMOVED"

.field public static final ACTION_PACKAGE_WILL_ADDED:Ljava/lang/String; = "virtual.intent.action.PACKAGE_WILL_ADDED"

.field public static ACTION_SHORTCUT:Ljava/lang/String; = null

.field public static final ACTION_USER_ADDED:Ljava/lang/String; = "virtual.android.intent.action.USER_ADDED"

.field public static final ACTION_USER_INFO_CHANGED:Ljava/lang/String; = "virtual.android.intent.action.USER_CHANGED"

.field public static final ACTION_USER_REMOVED:Ljava/lang/String; = "virtual.android.intent.action.USER_REMOVED"

.field public static final ACTION_USER_STARTED:Ljava/lang/String; = "Virtual.android.intent.action.USER_STARTED"

.field public static final EXTRA_PACKAGE_NAME:Ljava/lang/String; = "android.intent.extra.package_name"

.field public static final EXTRA_USER_HANDLE:Ljava/lang/String; = "android.intent.extra.user_handle"

.field public static final FEATURE_FAKE_SIGNATURE:Ljava/lang/String; = "fake-signature"

.field public static HELPER_PROCESS_NAME:Ljava/lang/String; = ":va_helper"

.field public static NOTIFICATION_CHANNEL:Ljava/lang/String; = null

.field public static NOTIFICATION_DAEMON_CHANNEL:Ljava/lang/String; = null

.field public static SERVER_PROCESS_NAME:Ljava/lang/String; = ":va_core"

.field public static SHORTCUT_PROXY_ACTIVITY_NAME:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/lody/virtual/client/stub/ShortcutHandleActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/lody/virtual/client/env/Constants;->SHORTCUT_PROXY_ACTIVITY_NAME:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, ".virtual.action.shortcut"

    .line 10
    .line 11
    sput-object v0, Lcom/lody/virtual/client/env/Constants;->ACTION_SHORTCUT:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, ".virtual.action.BADGER_CHANGE"

    .line 14
    .line 15
    sput-object v0, Lcom/lody/virtual/client/env/Constants;->ACTION_BADGER_CHANGE:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "virtual_default"

    .line 18
    .line 19
    sput-object v0, Lcom/lody/virtual/client/env/Constants;->NOTIFICATION_CHANNEL:Ljava/lang/String;

    .line 20
    .line 21
    const-string v0, "virtual_daemon"

    .line 22
    .line 23
    sput-object v0, Lcom/lody/virtual/client/env/Constants;->NOTIFICATION_DAEMON_CHANNEL:Ljava/lang/String;

    .line 24
    .line 25
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
