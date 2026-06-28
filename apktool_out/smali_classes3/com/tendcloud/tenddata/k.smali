.class public Lcom/tendcloud/tenddata/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/k$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"

.field public static final b:Ljava/lang/String; = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"

.field public static final c:Ljava/lang/String; = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"

.field private static final d:I = 0x36ee80

.field private static final e:Ljava/util/regex/Pattern;

.field private static final f:Ljava/util/regex/Pattern;

.field private static g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static h:Z

.field private static i:[I

.field private static final j:Ljava/io/FileFilter;

.field private static k:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "([0-9]+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/tendcloud/tenddata/k;->e:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "\\s*([0-9]+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/tendcloud/tenddata/k;->f:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/tendcloud/tenddata/k;->g:Ljava/util/List;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    sput-boolean v0, Lcom/tendcloud/tenddata/k;->h:Z

    .line 26
    .line 27
    new-instance v0, Lcom/tendcloud/tenddata/k$1;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/tendcloud/tenddata/k$1;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/tendcloud/tenddata/k;->j:Ljava/io/FileFilter;

    .line 33
    .line 34
    new-instance v0, Lcom/tendcloud/tenddata/k$2;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/tendcloud/tenddata/k$2;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/tendcloud/tenddata/k;->k:Landroid/content/BroadcastReceiver;

    .line 40
    .line 41
    return-void
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

.method public static a(Ljava/lang/String;)I
    .locals 5

    .line 31
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 32
    :try_start_0
    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 33
    :try_start_1
    new-instance p0, Ljava/io/BufferedReader;

    invoke-direct {p0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    :try_start_2
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    const/high16 v4, 0x6400000

    if-gt v3, v4, :cond_1

    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 37
    :try_start_3
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    :catchall_0
    :goto_0
    :try_start_4
    invoke-virtual {p0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    goto :goto_2

    .line 39
    :cond_1
    :try_start_5
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "Input stream more than 100 MB size limit"

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_1
    move-object p0, v0

    :catchall_2
    move-object v0, v2

    goto :goto_1

    :catchall_3
    move-object p0, v0

    :goto_1
    if-eqz v0, :cond_2

    .line 40
    :try_start_6
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    :cond_2
    if-eqz p0, :cond_3

    goto :goto_0

    :catchall_5
    :cond_3
    :goto_2
    return v1
.end method

.method public static a()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    .line 3
    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v5

    .line 4
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object p1
.end method

.method private static a(Landroid/content/Context;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I)",
            "Ljava/util/List<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    sget-object v1, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isAppListEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 12
    :cond_0
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->S:Z

    if-eqz v1, :cond_1

    return-object v0

    .line 13
    :cond_1
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->d(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 14
    :catchall_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/4 v1, 0x0

    .line 15
    :try_start_1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    const-string v3, "pm list packages"

    invoke-virtual {v2, v3}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v2

    .line 16
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 17
    :goto_0
    :try_start_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const/16 v4, 0x3a

    .line 18
    invoke-virtual {v1, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-virtual {p0, v1, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 20
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Process;->waitFor()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 22
    :try_start_3
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    goto :goto_1

    :catchall_1
    move-object v1, v3

    :catchall_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    :cond_3
    :goto_1
    return-object v0
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    const-string v0, "*"

    .line 23
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 24
    iget v1, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 25
    iget v2, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    const-string v3, "pixel"

    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "densityDpi"

    .line 30
    iget p0, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {p1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object p1
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "adb_enabled"

    .line 9
    invoke-static {p0, v0, v1}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez p0, :cond_0

    const/4 v1, 0x1

    :catchall_0
    :cond_0
    return v1
.end method

.method private static a([I)[I
    .locals 4

    const/4 v0, 0x2

    .line 41
    :try_start_0
    new-instance v1, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    div-int/lit16 v3, v3, 0x200

    mul-int/2addr v2, v3

    div-int/2addr v2, v0

    const/4 v3, 0x0

    aput v2, p0, v3

    .line 43
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v1

    div-int/lit16 v1, v1, 0x200

    mul-int/2addr v2, v1

    div-int/2addr v2, v0

    const/4 v1, 0x1

    aput v2, p0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :catchall_0
    :try_start_1
    new-instance v1, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 45
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    div-int/lit16 v3, v3, 0x200

    mul-int/2addr v2, v3

    div-int/2addr v2, v0

    aput v2, p0, v0

    .line 46
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v1

    div-int/lit16 v1, v1, 0x200

    mul-int/2addr v2, v1

    div-int/2addr v2, v0

    const/4 v0, 0x3

    aput v2, p0, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-object p0
.end method

.method private static b(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, ""

    .line 23
    sget-object v2, Lcom/tendcloud/tenddata/k;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 25
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->toMatchResult()Ljava/util/regex/MatchResult;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 26
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "unknown"

    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "alps"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "android"

    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "sprd"

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "spreadtrum"

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "rockchip"

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "wondermedia"

    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "mtk"

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "mt65"

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "nvidia"

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "brcm"

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "marvell"

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :catchall_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 3

    .line 5
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "nfcStatus"

    .line 6
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->c(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "appsRegistedHCE"

    .line 7
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->t(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ssMode"

    .line 8
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->u(Landroid/content/Context;)I

    move-result p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1

    :try_start_0
    const-string v0, "brightness"

    .line 22
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->s(Landroid/content/Context;)I

    move-result p0

    invoke-virtual {p1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object p1
.end method

.method public static b()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.huawei.system.BuildEx"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getOsBrand"

    new-array v3, v0, [Ljava/lang/Class;

    .line 2
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    const-string v2, "harmony"

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "SA.HasHarmonyOS"

    aput-object v3, v2, v0

    const/4 v3, 0x1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v3

    invoke-static {v2}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    return v0
.end method

.method public static c(Landroid/content/Context;)I
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/16 v1, 0xa

    .line 2
    :try_start_0
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "nfc"

    .line 3
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/nfc/NfcManager;

    .line 4
    invoke-virtual {v1}, Landroid/nfc/NfcManager;->getDefaultAdapter()Landroid/nfc/NfcAdapter;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 5
    invoke-virtual {v1}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p0, 0x1

    :goto_0
    move v0, p0

    goto :goto_1

    :cond_1
    const/16 v1, 0x13

    .line 6
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v1, "android.hardware.nfc.hce"

    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    const/4 p0, 0x3

    goto :goto_0

    :cond_2
    const/4 p0, 0x2

    goto :goto_0

    :catchall_0
    :cond_3
    :goto_1
    return v0
.end method

.method public static c()Ljava/lang/String;
    .locals 2

    const-string v0, "hw_sc.build.platform.version"

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 7
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 8
    :try_start_0
    new-instance v1, Ljava/io/FileReader;

    invoke-direct {v1, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p0, 0x400

    :try_start_1
    new-array v2, p0, [C

    .line 9
    new-instance v3, Ljava/io/BufferedReader;

    invoke-direct {v3, v1, p0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :goto_0
    const/4 v4, 0x0

    .line 10
    invoke-virtual {v3, v2, v4, p0}, Ljava/io/BufferedReader;->read([CII)I

    move-result v5

    const/4 v6, -0x1

    if-eq v6, v5, :cond_0

    .line 11
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v2, v4, v5}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 13
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    :catch_0
    :catchall_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string v2, "uname -r"

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Ljava/lang/Process;->waitFor()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 3
    :goto_0
    :try_start_1
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 v5, 0x200

    invoke-direct {v3, v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 4
    :try_start_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 6
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 7
    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 8
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 10
    :goto_1
    :try_start_4
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    return-object v4

    :catchall_2
    move-exception v1

    goto :goto_3

    :catchall_3
    move-exception v1

    move-object v3, v0

    goto :goto_3

    :catchall_4
    move-exception v1

    move-object v2, v0

    move-object v3, v2

    .line 12
    :goto_3
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    if-eqz v2, :cond_1

    .line 13
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_4
    if-eqz v3, :cond_2

    .line 15
    :try_start_7
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_5

    :catchall_6
    move-exception v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_5
    return-object v0

    :catchall_7
    move-exception v0

    if-eqz v2, :cond_3

    .line 17
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_6

    :catchall_8
    move-exception v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_6
    if-eqz v3, :cond_4

    .line 19
    :try_start_9
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_7

    :catchall_9
    move-exception v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    :cond_4
    :goto_7
    throw v0
.end method

.method public static declared-synchronized d(Landroid/content/Context;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/tendcloud/tenddata/k;

    monitor-enter v0

    .line 22
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->isAppListEnabled()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 23
    monitor-exit v0

    return-object v2

    .line 24
    :cond_0
    :try_start_1
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->S:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_1

    .line 25
    monitor-exit v0

    return-object v2

    .line 26
    :cond_1
    :try_start_2
    sget-boolean v1, Lcom/tendcloud/tenddata/k;->h:Z

    if-eqz v1, :cond_2

    .line 27
    sget-object p0, Lcom/tendcloud/tenddata/k;->g:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object p0

    :cond_2
    const/16 v1, 0x1e

    .line 28
    :try_start_3
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/y;->a(Landroid/content/Context;I)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "android.permission.QUERY_ALL_PACKAGES"

    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/y;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 29
    sput-boolean v3, Lcom/tendcloud/tenddata/k;->h:Z

    .line 30
    sget-object p0, Lcom/tendcloud/tenddata/k;->g:Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-object p0

    .line 31
    :cond_3
    :try_start_4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/4 v1, 0x5

    .line 32
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object p0

    sput-object p0, Lcom/tendcloud/tenddata/k;->g:Ljava/util/List;

    .line 33
    sput-boolean v3, Lcom/tendcloud/tenddata/k;->h:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 34
    :catchall_0
    :try_start_5
    sget-object p0, Lcom/tendcloud/tenddata/k;->g:Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit v0

    return-object p0

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const-string v0, ""

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const-string v0, "*"

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 3
    iget v1, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 4
    iget v2, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static f(Landroid/content/Context;)I
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 2
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 3
    :cond_1
    :goto_0
    sget-object v1, Lcom/tendcloud/tenddata/k;->k:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "level"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    goto :goto_1

    :cond_2
    move v1, v0

    .line 5
    :goto_1
    sget-object v2, Lcom/tendcloud/tenddata/k;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v1

    :catchall_0
    return v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/content/Context;)I
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 2
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 3
    :cond_1
    :goto_0
    sget-object v1, Lcom/tendcloud/tenddata/k;->k:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "status"

    .line 4
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    goto :goto_1

    :cond_2
    move v1, v0

    .line 5
    :goto_1
    sget-object v2, Lcom/tendcloud/tenddata/k;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v1

    :catchall_0
    return v0
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 3

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "mobile"

    .line 3
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->o(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "wifi"

    .line 4
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->k(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "gps"

    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->j(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "telephone"

    .line 6
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->n(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "nfc"

    .line 7
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->m(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "bluetooth"

    .line 8
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->l(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "otg"

    .line 9
    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->i(Landroid/content/Context;)Z

    move-result p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i()I
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    const v1, 0x36ee80

    div-int/2addr v0, v1

    return v0
.end method

.method public static i(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 2
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 3
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v1, "android.hardware.usb.host"

    .line 4
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    move v0, p0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static j()Ljava/lang/String;
    .locals 4

    const-string v0, ""

    .line 1
    :try_start_0
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 2
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/tendcloud/tenddata/k;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/tendcloud/tenddata/k;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 5
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    if-nez v2, :cond_1

    move-object v2, v0

    :cond_1
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ":"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object v0
.end method

.method public static j(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 7
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 8
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v1, "android.hardware.location.gps"

    .line 9
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    move v0, p0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static k()Ljava/lang/String;
    .locals 2

    const-string v0, "unknown"

    const/16 v1, 0xe

    .line 1
    :try_start_0
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-static {}, Landroid/os/Build;->getRadioVersion()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v0
.end method

.method public static k(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 3
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 4
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v1, "android.hardware.wifi"

    .line 5
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    move v0, p0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static l()I
    .locals 1

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method public static l(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 2
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 3
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v1, "android.hardware.bluetooth"

    .line 4
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    move v0, p0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static m()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    return-object v0
.end method

.method public static m(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 2
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 3
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v1, "android.hardware.nfc"

    .line 4
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    move v0, p0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static n()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static n(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 2
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    :try_start_0
    const-string v1, "phone"

    .line 3
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    if-eqz p0, :cond_2

    .line 4
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    :catchall_0
    :cond_2
    return v0
.end method

.method public static o()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static o(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 2
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 3
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v1, "android.hardware.telephony"

    .line 4
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return v0
.end method

.method public static p(Landroid/content/Context;)I
    .locals 1

    const/4 v0, -0x1

    if-nez p0, :cond_1

    .line 21
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 23
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static p()[Ljava/lang/String;
    .locals 12

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    const-string v4, ""

    .line 1
    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    :try_start_0
    new-instance v3, Ljava/io/FileReader;

    const-string v4, "/proc/cpuinfo"

    invoke-direct {v3, v4}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance v4, Ljava/io/BufferedReader;

    const/16 v5, 0x400

    invoke-direct {v4, v3, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_1
    const/4 v5, 0x1

    .line 5
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 6
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    const/high16 v7, 0x6400000

    if-gt v6, v7, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    new-instance v6, Ljava/lang/RuntimeException;

    const-string v7, "List size more than 104857600 limit"

    invoke-direct {v6, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :cond_2
    :try_start_2
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    .line 10
    invoke-virtual {v3}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_0
    move v3, v5

    goto :goto_2

    .line 11
    :catchall_0
    :try_start_3
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    .line 12
    invoke-virtual {v3}, Ljava/io/Reader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catch_1
    move v3, v2

    :goto_2
    :try_start_4
    const-string v4, "Processor\\s*:\\s*(.*)"

    const-string v6, "CPU\\s*variant\\s*:\\s*0x(.*)"

    const-string v7, "Hardware\\s*:\\s*(.*)"

    .line 13
    filled-new-array {v4, v6, v7}, [Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x3

    if-eqz v3, :cond_5

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    move v7, v2

    :goto_3
    if-ge v7, v6, :cond_5

    .line 15
    aget-object v8, v4, v7

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    move v9, v2

    :goto_4
    if-ge v9, v3, :cond_4

    .line 16
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 17
    invoke-virtual {v8, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    .line 18
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    move-result v11

    if-eqz v11, :cond_3

    .line 19
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->toMatchResult()Ljava/util/regex/MatchResult;

    move-result-object v10

    invoke-interface {v10, v5}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v1, v7

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_5
    const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"

    .line 20
    invoke-static {v0}, Lcom/tendcloud/tenddata/k;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    return-object v1
.end method

.method public static q(Landroid/content/Context;)I
    .locals 1

    const/4 v0, -0x1

    if-nez p0, :cond_1

    .line 7
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static q()Lorg/json/JSONObject;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "name"

    .line 2
    invoke-static {}, Lcom/tendcloud/tenddata/k;->p()[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "coreNum"

    .line 3
    invoke-static {}, Lcom/tendcloud/tenddata/k;->r()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "maxFreq"

    const-string v2, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"

    .line 4
    invoke-static {v2}, Lcom/tendcloud/tenddata/k;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "minFreq"

    const-string v2, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"

    .line 5
    invoke-static {v2}, Lcom/tendcloud/tenddata/k;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "curFreq"

    const-string v2, "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"

    .line 6
    invoke-static {v2}, Lcom/tendcloud/tenddata/k;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static r()I
    .locals 3

    const/4 v0, 0x1

    .line 1
    :try_start_0
    new-instance v1, Ljava/io/File;

    const-string v2, "/sys/devices/system/cpu/"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/tendcloud/tenddata/k;->j:Ljava/io/FileFilter;

    invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    array-length v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return v0
.end method

.method public static r(Landroid/content/Context;)I
    .locals 1

    const/4 v0, -0x1

    if-nez p0, :cond_1

    .line 3
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 4
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 5
    iget p0, p0, Landroid/util/DisplayMetrics;->densityDpi:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static s(Landroid/content/Context;)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_1

    .line 11
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 12
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v1, "screen_brightness"

    invoke-static {p0, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return v0
.end method

.method public static s()[I
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 1
    fill-array-data v1, :array_0

    .line 2
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    const-string v3, "mounted"

    .line 3
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    .line 5
    new-instance v3, Landroid/os/StatFs;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I

    move-result v2

    .line 7
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCount()I

    move-result v4

    .line 8
    invoke-virtual {v3}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v3

    .line 9
    div-int/lit16 v5, v2, 0x200

    mul-int/2addr v4, v5

    div-int/2addr v4, v0

    const/4 v5, 0x0

    aput v4, v1, v5

    .line 10
    div-int/lit16 v2, v2, 0x200

    mul-int/2addr v3, v2

    div-int/2addr v3, v0

    const/4 v0, 0x1

    aput v3, v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v1

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method private static t(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 11

    const/16 v0, 0x13

    .line 1
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x4

    .line 3
    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/k;->a(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/PackageInfo;

    if-nez v3, :cond_2

    goto :goto_0

    .line 5
    :cond_2
    iget-object v4, v3, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    if-eqz v4, :cond_1

    .line 6
    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    new-instance v9, Landroid/content/ComponentName;

    iget-object v10, v7, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v7, v7, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v9, v10, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0x80

    invoke-virtual {v8, v9, v7}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object v7

    iget-object v7, v7, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz v7, :cond_3

    const-string v8, "android.nfc.cardemulation.host_apdu_service"

    .line 8
    invoke-virtual {v7, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 9
    iget-object v7, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    return-object v0

    :catchall_1
    return-object v1
.end method

.method public static t()[I
    .locals 11

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 10
    fill-array-data v1, :array_0

    const/4 v2, 0x4

    new-array v3, v2, [I

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_0

    .line 11
    aput v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    new-instance v5, Ljava/io/FileReader;

    const-string v6, "/proc/meminfo"

    invoke-direct {v5, v6}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 13
    new-instance v6, Ljava/io/BufferedReader;

    const/16 v7, 0x400

    invoke-direct {v6, v5, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move v7, v4

    :goto_1
    if-ge v7, v2, :cond_2

    .line 14
    :try_start_1
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v8

    .line 15
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    const/high16 v10, 0x6400000

    if-gt v9, v10, :cond_1

    .line 16
    invoke-static {v8}, Lcom/tendcloud/tenddata/k;->b(Ljava/lang/String;)I

    move-result v8

    aput v8, v3, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 17
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Input stream more than 100 MB size limit"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    aget v2, v3, v4

    aput v2, v1, v4

    const/4 v2, 0x1

    aget v4, v3, v2

    aget v0, v3, v0

    add-int/2addr v4, v0

    const/4 v0, 0x3

    aget v0, v3, v0

    add-int/2addr v4, v0

    aput v4, v1, v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :catch_0
    :try_start_2
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V

    .line 19
    invoke-virtual {v5}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 20
    :try_start_3
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V

    .line 21
    invoke-virtual {v5}, Ljava/io/Reader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 22
    :catch_1
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catch_2
    :catchall_1
    :goto_2
    return-object v1

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method private static u(Landroid/content/Context;)I
    .locals 2

    const/16 v0, 0x13

    const/4 v1, -0x1

    .line 1
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "nfc"

    .line 2
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/nfc/NfcManager;

    .line 3
    invoke-virtual {p0}, Landroid/nfc/NfcManager;->getDefaultAdapter()Landroid/nfc/NfcAdapter;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 4
    invoke-static {p0}, Landroid/nfc/cardemulation/CardEmulation;->getInstance(Landroid/nfc/NfcAdapter;)Landroid/nfc/cardemulation/CardEmulation;

    move-result-object p0

    const-string v0, "payment"

    .line 5
    invoke-virtual {p0, v0}, Landroid/nfc/cardemulation/CardEmulation;->getSelectionModeForCategory(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, p0

    :catchall_0
    :cond_0
    return v1
.end method

.method public static u()[I
    .locals 2

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 6
    sget-object v1, Lcom/tendcloud/tenddata/k;->i:[I

    if-eqz v1, :cond_0

    array-length v1, v1

    if-gtz v1, :cond_1

    .line 7
    :cond_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/k;->a([I)[I

    move-result-object v0

    sput-object v0, Lcom/tendcloud/tenddata/k;->i:[I

    .line 8
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/k;->i:[I

    return-object v0
.end method

.method public static v()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "/sys/class/power_supply/battery/full_bat"

    .line 3
    .line 4
    invoke-static {v1}, Lcom/tendcloud/tenddata/k;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Lcom/tendcloud/tenddata/k;->f:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->toMatchResult()Ljava/util/regex/MatchResult;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1, v0}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    :catch_0
    :cond_0
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
