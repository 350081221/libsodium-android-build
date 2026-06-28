.class public Lcom/lody/virtual/helper/compat/BuildCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;
    }
.end annotation


# static fields
.field private static sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getPreviewSDKInt()I
    .locals 1

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    const/4 v0, 0x0

    return v0
.end method

.method public static getROMType()Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isEMUI()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->EMUI:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 12
    .line 13
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isMIUI()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->MIUI:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 23
    .line 24
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isFlyme()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->FLYME:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 34
    .line 35
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isColorOS()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->COLOR_OS:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 45
    .line 46
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->is360UI()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->_360:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 56
    .line 57
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isLetv()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->LETV:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 67
    .line 68
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_5
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isVivo()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->VIVO:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 78
    .line 79
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isSamsung()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_7

    .line 87
    .line 88
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->SAMSUNG:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 89
    .line 90
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_7
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;->OTHER:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 94
    .line 95
    sput-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 96
    .line 97
    :cond_8
    :goto_0
    sget-object v0, Lcom/lody/virtual/helper/compat/BuildCompat;->sRomType:Lcom/lody/virtual/helper/compat/BuildCompat$ROMType;

    .line 98
    .line 99
    return-object v0
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public static is360UI()Z
    .locals 2

    .line 1
    const-string v0, "ro.build.uiversion"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/helper/compat/SystemPropertiesCompat;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "360UI"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    return v0
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

.method public static isColorOS()Z
    .locals 1

    .line 1
    const-string v0, "ro.build.version.opporom"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/helper/compat/SystemPropertiesCompat;->isExist(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "ro.rom.different.version"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/lody/virtual/helper/compat/SystemPropertiesCompat;->isExist(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    return v0
    .line 22
    .line 23
.end method

.method public static isEMUI()Z
    .locals 3

    .line 1
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "EMUI"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    const-string v0, "ro.build.version.emui"

    .line 18
    .line 19
    invoke-static {v0}, Lcom/lody/virtual/helper/compat/SystemPropertiesCompat;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-string v2, "EmotionUI"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    :goto_0
    return v1
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

.method public static isFlyme()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "flyme"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public static isLetv()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "Letv"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isMIUI()Z
    .locals 2

    .line 1
    const-string v0, "ro.miui.ui.version.code"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/compat/SystemPropertiesCompat;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :cond_0
    return v1
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

.method public static isOreo()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getPreviewSDKInt()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isPie()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getPreviewSDKInt()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isQ()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getPreviewSDKInt()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isR()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getPreviewSDKInt()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isS()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getPreviewSDKInt()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isSL()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getPreviewSDKInt()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isSamsung()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v1, "samsung"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isTiramisu()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getPreviewSDKInt()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isUpsideDownCake()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->getPreviewSDKInt()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isVivo()Z
    .locals 1

    .line 1
    const-string v0, "ro.vivo.os.build.display.id"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/helper/compat/SystemPropertiesCompat;->isExist(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
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
