.class public final Lcom/google/android/material/color/utilities/DynamicColor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# instance fields
.field public final background:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/DynamicColor;",
            ">;"
        }
    .end annotation
.end field

.field public final contrastCurve:Lcom/google/android/material/color/utilities/ContrastCurve;

.field private final hctCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/Hct;",
            ">;"
        }
    .end annotation
.end field

.field public final isBackground:Z

.field public final name:Ljava/lang/String;

.field public final opacity:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field public final palette:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/TonalPalette;",
            ">;"
        }
    .end annotation
.end field

.field public final secondBackground:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/DynamicColor;",
            ">;"
        }
    .end annotation
.end field

.field public final tone:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field public final toneDeltaPair:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/ToneDeltaPair;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/google/android/material/color/utilities/ContrastCurve;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/TonalPalette;",
            ">;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Ljava/lang/Double;",
            ">;Z",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/DynamicColor;",
            ">;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/DynamicColor;",
            ">;",
            "Lcom/google/android/material/color/utilities/ContrastCurve;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/ToneDeltaPair;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/color/utilities/DynamicColor;->hctCache:Ljava/util/HashMap;

    .line 3
    iput-object p1, p0, Lcom/google/android/material/color/utilities/DynamicColor;->name:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/google/android/material/color/utilities/DynamicColor;->palette:Ljava/util/function/Function;

    .line 5
    iput-object p3, p0, Lcom/google/android/material/color/utilities/DynamicColor;->tone:Ljava/util/function/Function;

    .line 6
    iput-boolean p4, p0, Lcom/google/android/material/color/utilities/DynamicColor;->isBackground:Z

    .line 7
    iput-object p5, p0, Lcom/google/android/material/color/utilities/DynamicColor;->background:Ljava/util/function/Function;

    .line 8
    iput-object p6, p0, Lcom/google/android/material/color/utilities/DynamicColor;->secondBackground:Ljava/util/function/Function;

    .line 9
    iput-object p7, p0, Lcom/google/android/material/color/utilities/DynamicColor;->contrastCurve:Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 10
    iput-object p8, p0, Lcom/google/android/material/color/utilities/DynamicColor;->toneDeltaPair:Ljava/util/function/Function;

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/google/android/material/color/utilities/DynamicColor;->opacity:Ljava/util/function/Function;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;Ljava/util/function/Function;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/google/android/material/color/utilities/ContrastCurve;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/TonalPalette;",
            ">;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Ljava/lang/Double;",
            ">;Z",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/DynamicColor;",
            ">;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/DynamicColor;",
            ">;",
            "Lcom/google/android/material/color/utilities/ContrastCurve;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/ToneDeltaPair;",
            ">;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/color/utilities/DynamicColor;->hctCache:Ljava/util/HashMap;

    .line 14
    iput-object p1, p0, Lcom/google/android/material/color/utilities/DynamicColor;->name:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/google/android/material/color/utilities/DynamicColor;->palette:Ljava/util/function/Function;

    .line 16
    iput-object p3, p0, Lcom/google/android/material/color/utilities/DynamicColor;->tone:Ljava/util/function/Function;

    .line 17
    iput-boolean p4, p0, Lcom/google/android/material/color/utilities/DynamicColor;->isBackground:Z

    .line 18
    iput-object p5, p0, Lcom/google/android/material/color/utilities/DynamicColor;->background:Ljava/util/function/Function;

    .line 19
    iput-object p6, p0, Lcom/google/android/material/color/utilities/DynamicColor;->secondBackground:Ljava/util/function/Function;

    .line 20
    iput-object p7, p0, Lcom/google/android/material/color/utilities/DynamicColor;->contrastCurve:Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 21
    iput-object p8, p0, Lcom/google/android/material/color/utilities/DynamicColor;->toneDeltaPair:Ljava/util/function/Function;

    .line 22
    iput-object p9, p0, Lcom/google/android/material/color/utilities/DynamicColor;->opacity:Ljava/util/function/Function;

    return-void
.end method

.method public static synthetic a(Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->lambda$fromArgb$0(Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/android/material/color/utilities/Hct;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->lambda$fromArgb$1(Lcom/google/android/material/color/utilities/Hct;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static enableLightForeground(D)D
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->tonePrefersLightForeground(D)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->toneAllowsLightForeground(D)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide p0, 0x4048800000000000L    # 49.0

    :cond_0
    return-wide p0
.end method

.method public static foregroundTone(DD)D
    .locals 10

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/color/utilities/Contrast;->lighterUnsafe(DD)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/color/utilities/Contrast;->darkerUnsafe(DD)D

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v0, v1, p0, p1}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfTones(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-static {v2, v3, p0, p1}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfTones(DD)D

    .line 14
    .line 15
    .line 16
    move-result-wide v6

    .line 17
    invoke-static {p0, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->tonePrefersLightForeground(D)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    sub-double p0, v4, v6

    .line 24
    .line 25
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    const-wide v8, 0x3fb999999999999aL    # 0.1

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmpg-double p0, p0, v8

    .line 35
    .line 36
    if-gez p0, :cond_0

    .line 37
    .line 38
    cmpg-double p0, v4, p2

    .line 39
    .line 40
    if-gez p0, :cond_0

    .line 41
    .line 42
    cmpg-double p0, v6, p2

    .line 43
    .line 44
    if-gez p0, :cond_0

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p0, 0x0

    .line 49
    :goto_0
    cmpl-double p1, v4, p2

    .line 50
    .line 51
    if-gez p1, :cond_2

    .line 52
    .line 53
    cmpl-double p1, v4, v6

    .line 54
    .line 55
    if-gez p1, :cond_2

    .line 56
    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    return-wide v2

    .line 61
    :cond_2
    :goto_1
    return-wide v0

    .line 62
    :cond_3
    cmpl-double p0, v6, p2

    .line 63
    .line 64
    if-gez p0, :cond_4

    .line 65
    .line 66
    cmpl-double p0, v6, v4

    .line 67
    .line 68
    if-ltz p0, :cond_5

    .line 69
    .line 70
    :cond_4
    move-wide v0, v2

    .line 71
    :cond_5
    return-wide v0
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
.end method

.method public static fromArgb(Ljava/lang/String;I)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/android/material/color/utilities/Hct;->fromInt(I)Lcom/google/android/material/color/utilities/Hct;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/google/android/material/color/utilities/TonalPalette;->fromInt(I)Lcom/google/android/material/color/utilities/TonalPalette;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Lcom/google/android/material/color/utilities/a;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Lcom/google/android/material/color/utilities/a;-><init>(Lcom/google/android/material/color/utilities/TonalPalette;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lcom/google/android/material/color/utilities/b;

    .line 15
    .line 16
    invoke-direct {p1, v0}, Lcom/google/android/material/color/utilities/b;-><init>(Lcom/google/android/material/color/utilities/Hct;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v1, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
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
.end method

.method public static fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 10
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/TonalPalette;",
            ">;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/google/android/material/color/utilities/DynamicColor;"
        }
    .end annotation

    .line 1
    new-instance v9, Lcom/google/android/material/color/utilities/DynamicColor;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    return-object v9
.end method

.method public static fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;Z)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 10
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/function/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Lcom/google/android/material/color/utilities/TonalPalette;",
            ">;",
            "Ljava/util/function/Function<",
            "Lcom/google/android/material/color/utilities/DynamicScheme;",
            "Ljava/lang/Double;",
            ">;Z)",
            "Lcom/google/android/material/color/utilities/DynamicColor;"
        }
    .end annotation

    .line 2
    new-instance v9, Lcom/google/android/material/color/utilities/DynamicColor;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    return-object v9
.end method

.method private static synthetic lambda$fromArgb$0(Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    return-object p0
.end method

.method private static synthetic lambda$fromArgb$1(Lcom/google/android/material/color/utilities/Hct;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static toneAllowsLightForeground(D)Z
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    const-wide/16 v0, 0x31

    cmp-long p0, p0, v0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static tonePrefersLightForeground(D)Z
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    const-wide/16 v0, 0x3c

    cmp-long p0, p0, v0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public getArgb(Lcom/google/android/material/color/utilities/DynamicScheme;)I
    .locals 5
    .param p1    # Lcom/google/android/material/color/utilities/DynamicScheme;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->getHct(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/Hct;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/Hct;->toInt()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/google/android/material/color/utilities/DynamicColor;->opacity:Ljava/util/function/Function;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Double;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    const-wide v3, 0x406fe00000000000L    # 255.0

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    mul-double/2addr v1, v3

    .line 30
    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    long-to-int p1, v1

    .line 35
    const/4 v1, 0x0

    .line 36
    const/16 v2, 0xff

    .line 37
    .line 38
    invoke-static {v1, v2, p1}, Lcom/google/android/material/color/utilities/MathUtils;->clampInt(III)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const v1, 0xffffff

    .line 43
    .line 44
    .line 45
    and-int/2addr v0, v1

    .line 46
    shl-int/lit8 p1, p1, 0x18

    .line 47
    .line 48
    or-int/2addr p1, v0

    .line 49
    return p1
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
.end method

.method public getHct(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/Hct;
    .locals 3
    .param p1    # Lcom/google/android/material/color/utilities/DynamicScheme;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/color/utilities/DynamicColor;->hctCache:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/color/utilities/Hct;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/color/utilities/DynamicColor;->getTone(Lcom/google/android/material/color/utilities/DynamicScheme;)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-object v2, p0, Lcom/google/android/material/color/utilities/DynamicColor;->palette:Ljava/util/function/Function;

    .line 17
    .line 18
    invoke-interface {v2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/google/android/material/color/utilities/TonalPalette;

    .line 23
    .line 24
    invoke-virtual {v2, v0, v1}, Lcom/google/android/material/color/utilities/TonalPalette;->getHct(D)Lcom/google/android/material/color/utilities/Hct;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lcom/google/android/material/color/utilities/DynamicColor;->hctCache:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x4

    .line 35
    if-le v1, v2, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lcom/google/android/material/color/utilities/DynamicColor;->hctCache:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v1, p0, Lcom/google/android/material/color/utilities/DynamicColor;->hctCache:Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-object v0
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
.end method

.method public getTone(Lcom/google/android/material/color/utilities/DynamicScheme;)D
    .locals 30
    .param p1    # Lcom/google/android/material/color/utilities/DynamicScheme;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    cmpg-double v2, v2, v4

    .line 10
    .line 11
    if-gez v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v2, 0x0

    .line 16
    :goto_0
    iget-object v7, v0, Lcom/google/android/material/color/utilities/DynamicColor;->toneDeltaPair:Ljava/util/function/Function;

    .line 17
    .line 18
    if-eqz v7, :cond_12

    .line 19
    .line 20
    invoke-interface {v7, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    check-cast v7, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 25
    .line 26
    invoke-virtual {v7}, Lcom/google/android/material/color/utilities/ToneDeltaPair;->getRoleA()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 27
    .line 28
    .line 29
    move-result-object v16

    .line 30
    invoke-virtual {v7}, Lcom/google/android/material/color/utilities/ToneDeltaPair;->getRoleB()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 31
    .line 32
    .line 33
    move-result-object v17

    .line 34
    invoke-virtual {v7}, Lcom/google/android/material/color/utilities/ToneDeltaPair;->getDelta()D

    .line 35
    .line 36
    .line 37
    move-result-wide v18

    .line 38
    invoke-virtual {v7}, Lcom/google/android/material/color/utilities/ToneDeltaPair;->getPolarity()Lcom/google/android/material/color/utilities/TonePolarity;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v7}, Lcom/google/android/material/color/utilities/ToneDeltaPair;->getStayTogether()Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    iget-object v3, v0, Lcom/google/android/material/color/utilities/DynamicColor;->background:Ljava/util/function/Function;

    .line 47
    .line 48
    invoke-interface {v3, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->getTone(Lcom/google/android/material/color/utilities/DynamicScheme;)D

    .line 55
    .line 56
    .line 57
    move-result-wide v8

    .line 58
    sget-object v3, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 59
    .line 60
    if-eq v6, v3, :cond_3

    .line 61
    .line 62
    sget-object v3, Lcom/google/android/material/color/utilities/TonePolarity;->LIGHTER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 63
    .line 64
    if-ne v6, v3, :cond_1

    .line 65
    .line 66
    iget-boolean v3, v1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 67
    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    :cond_1
    sget-object v3, Lcom/google/android/material/color/utilities/TonePolarity;->DARKER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 71
    .line 72
    if-ne v6, v3, :cond_2

    .line 73
    .line 74
    iget-boolean v3, v1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const/4 v3, 0x0

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 82
    :goto_2
    if-eqz v3, :cond_4

    .line 83
    .line 84
    move-object/from16 v6, v16

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    move-object/from16 v6, v17

    .line 88
    .line 89
    :goto_3
    if-eqz v3, :cond_5

    .line 90
    .line 91
    move-object/from16 v3, v17

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_5
    move-object/from16 v3, v16

    .line 95
    .line 96
    :goto_4
    iget-object v12, v0, Lcom/google/android/material/color/utilities/DynamicColor;->name:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v13, v6, Lcom/google/android/material/color/utilities/DynamicColor;->name:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    iget-boolean v13, v1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 105
    .line 106
    if-eqz v13, :cond_6

    .line 107
    .line 108
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_6
    const-wide/high16 v20, -0x4010000000000000L    # -1.0

    .line 112
    .line 113
    :goto_5
    iget-object v13, v6, Lcom/google/android/material/color/utilities/DynamicColor;->contrastCurve:Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 114
    .line 115
    iget-wide v4, v1, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 116
    .line 117
    invoke-virtual {v13, v4, v5}, Lcom/google/android/material/color/utilities/ContrastCurve;->getContrast(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    iget-object v13, v3, Lcom/google/android/material/color/utilities/DynamicColor;->contrastCurve:Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 122
    .line 123
    iget-wide v14, v1, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 124
    .line 125
    invoke-virtual {v13, v14, v15}, Lcom/google/android/material/color/utilities/ContrastCurve;->getContrast(D)D

    .line 126
    .line 127
    .line 128
    move-result-wide v13

    .line 129
    iget-object v6, v6, Lcom/google/android/material/color/utilities/DynamicColor;->tone:Ljava/util/function/Function;

    .line 130
    .line 131
    invoke-interface {v6, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    check-cast v6, Ljava/lang/Double;

    .line 136
    .line 137
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 138
    .line 139
    .line 140
    move-result-wide v10

    .line 141
    invoke-static {v8, v9, v10, v11}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfTones(DD)D

    .line 142
    .line 143
    .line 144
    move-result-wide v22

    .line 145
    cmpl-double v6, v22, v4

    .line 146
    .line 147
    if-ltz v6, :cond_7

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_7
    invoke-static {v8, v9, v4, v5}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 151
    .line 152
    .line 153
    move-result-wide v10

    .line 154
    :goto_6
    iget-object v3, v3, Lcom/google/android/material/color/utilities/DynamicColor;->tone:Ljava/util/function/Function;

    .line 155
    .line 156
    invoke-interface {v3, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Ljava/lang/Double;

    .line 161
    .line 162
    move-wide/from16 v22, v10

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 165
    .line 166
    .line 167
    move-result-wide v10

    .line 168
    invoke-static {v8, v9, v10, v11}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfTones(DD)D

    .line 169
    .line 170
    .line 171
    move-result-wide v24

    .line 172
    cmpl-double v1, v24, v13

    .line 173
    .line 174
    if-ltz v1, :cond_8

    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_8
    invoke-static {v8, v9, v13, v14}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 178
    .line 179
    .line 180
    move-result-wide v10

    .line 181
    :goto_7
    if-eqz v2, :cond_9

    .line 182
    .line 183
    invoke-static {v8, v9, v4, v5}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 184
    .line 185
    .line 186
    move-result-wide v10

    .line 187
    invoke-static {v8, v9, v13, v14}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    move-wide/from16 v22, v10

    .line 192
    .line 193
    move-wide v10, v1

    .line 194
    :cond_9
    sub-double v1, v10, v22

    .line 195
    .line 196
    mul-double v1, v1, v20

    .line 197
    .line 198
    cmpg-double v1, v1, v18

    .line 199
    .line 200
    if-gez v1, :cond_a

    .line 201
    .line 202
    const-wide/16 v24, 0x0

    .line 203
    .line 204
    const-wide/high16 v26, 0x4059000000000000L    # 100.0

    .line 205
    .line 206
    mul-double v1, v18, v20

    .line 207
    .line 208
    add-double v28, v22, v1

    .line 209
    .line 210
    invoke-static/range {v24 .. v29}, Lcom/google/android/material/color/utilities/MathUtils;->clampDouble(DDD)D

    .line 211
    .line 212
    .line 213
    move-result-wide v10

    .line 214
    sub-double v3, v10, v22

    .line 215
    .line 216
    mul-double v3, v3, v20

    .line 217
    .line 218
    cmpg-double v3, v3, v18

    .line 219
    .line 220
    if-gez v3, :cond_a

    .line 221
    .line 222
    const-wide/16 v24, 0x0

    .line 223
    .line 224
    const-wide/high16 v26, 0x4059000000000000L    # 100.0

    .line 225
    .line 226
    sub-double v28, v10, v1

    .line 227
    .line 228
    invoke-static/range {v24 .. v29}, Lcom/google/android/material/color/utilities/MathUtils;->clampDouble(DDD)D

    .line 229
    .line 230
    .line 231
    move-result-wide v22

    .line 232
    :cond_a
    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    .line 233
    .line 234
    cmpg-double v3, v1, v22

    .line 235
    .line 236
    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    .line 237
    .line 238
    if-gtz v3, :cond_c

    .line 239
    .line 240
    cmpg-double v3, v22, v1

    .line 241
    .line 242
    if-gez v3, :cond_c

    .line 243
    .line 244
    const-wide/16 v3, 0x0

    .line 245
    .line 246
    cmpl-double v3, v20, v3

    .line 247
    .line 248
    if-lez v3, :cond_b

    .line 249
    .line 250
    mul-double v18, v18, v20

    .line 251
    .line 252
    add-double v3, v18, v1

    .line 253
    .line 254
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 255
    .line 256
    .line 257
    move-result-wide v3

    .line 258
    move-wide/from16 v22, v1

    .line 259
    .line 260
    move-wide v1, v3

    .line 261
    goto :goto_9

    .line 262
    :cond_b
    mul-double v18, v18, v20

    .line 263
    .line 264
    const-wide v1, 0x4048800000000000L    # 49.0

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    add-double v3, v18, v1

    .line 270
    .line 271
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 272
    .line 273
    .line 274
    move-result-wide v1

    .line 275
    :goto_8
    const-wide v22, 0x4048800000000000L    # 49.0

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_c
    const-wide/high16 v3, 0x4049000000000000L    # 50.0

    .line 282
    .line 283
    cmpg-double v3, v3, v10

    .line 284
    .line 285
    if-gtz v3, :cond_10

    .line 286
    .line 287
    cmpg-double v3, v10, v1

    .line 288
    .line 289
    if-gez v3, :cond_10

    .line 290
    .line 291
    if-eqz v7, :cond_e

    .line 292
    .line 293
    const-wide/16 v3, 0x0

    .line 294
    .line 295
    cmpl-double v3, v20, v3

    .line 296
    .line 297
    if-lez v3, :cond_d

    .line 298
    .line 299
    mul-double v18, v18, v20

    .line 300
    .line 301
    add-double v3, v18, v1

    .line 302
    .line 303
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 304
    .line 305
    .line 306
    move-result-wide v1

    .line 307
    const-wide/high16 v22, 0x404e000000000000L    # 60.0

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_d
    mul-double v18, v18, v20

    .line 311
    .line 312
    const-wide v1, 0x4048800000000000L    # 49.0

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    add-double v3, v18, v1

    .line 318
    .line 319
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 320
    .line 321
    .line 322
    move-result-wide v1

    .line 323
    goto :goto_8

    .line 324
    :cond_e
    const-wide/16 v3, 0x0

    .line 325
    .line 326
    cmpl-double v1, v20, v3

    .line 327
    .line 328
    if-lez v1, :cond_f

    .line 329
    .line 330
    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    .line 331
    .line 332
    goto :goto_9

    .line 333
    :cond_f
    const-wide v1, 0x4048800000000000L    # 49.0

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_10
    move-wide v1, v10

    .line 340
    :goto_9
    if-eqz v12, :cond_11

    .line 341
    .line 342
    move-wide/from16 v1, v22

    .line 343
    .line 344
    :cond_11
    return-wide v1

    .line 345
    :cond_12
    move-wide v3, v4

    .line 346
    iget-object v5, v0, Lcom/google/android/material/color/utilities/DynamicColor;->tone:Ljava/util/function/Function;

    .line 347
    .line 348
    invoke-interface {v5, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    check-cast v5, Ljava/lang/Double;

    .line 353
    .line 354
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 355
    .line 356
    .line 357
    move-result-wide v5

    .line 358
    iget-object v7, v0, Lcom/google/android/material/color/utilities/DynamicColor;->background:Ljava/util/function/Function;

    .line 359
    .line 360
    if-nez v7, :cond_13

    .line 361
    .line 362
    return-wide v5

    .line 363
    :cond_13
    invoke-interface {v7, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    check-cast v7, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 368
    .line 369
    invoke-virtual {v7, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->getTone(Lcom/google/android/material/color/utilities/DynamicScheme;)D

    .line 370
    .line 371
    .line 372
    move-result-wide v7

    .line 373
    iget-object v9, v0, Lcom/google/android/material/color/utilities/DynamicColor;->contrastCurve:Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 374
    .line 375
    iget-wide v10, v1, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 376
    .line 377
    invoke-virtual {v9, v10, v11}, Lcom/google/android/material/color/utilities/ContrastCurve;->getContrast(D)D

    .line 378
    .line 379
    .line 380
    move-result-wide v9

    .line 381
    invoke-static {v7, v8, v5, v6}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfTones(DD)D

    .line 382
    .line 383
    .line 384
    move-result-wide v11

    .line 385
    cmpl-double v11, v11, v9

    .line 386
    .line 387
    if-ltz v11, :cond_14

    .line 388
    .line 389
    goto :goto_a

    .line 390
    :cond_14
    invoke-static {v7, v8, v9, v10}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 391
    .line 392
    .line 393
    move-result-wide v5

    .line 394
    :goto_a
    if-eqz v2, :cond_15

    .line 395
    .line 396
    invoke-static {v7, v8, v9, v10}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 397
    .line 398
    .line 399
    move-result-wide v5

    .line 400
    :cond_15
    iget-boolean v2, v0, Lcom/google/android/material/color/utilities/DynamicColor;->isBackground:Z

    .line 401
    .line 402
    if-eqz v2, :cond_17

    .line 403
    .line 404
    const-wide/high16 v11, 0x4049000000000000L    # 50.0

    .line 405
    .line 406
    cmpg-double v2, v11, v5

    .line 407
    .line 408
    if-gtz v2, :cond_17

    .line 409
    .line 410
    const-wide/high16 v11, 0x404e000000000000L    # 60.0

    .line 411
    .line 412
    cmpg-double v2, v5, v11

    .line 413
    .line 414
    if-gez v2, :cond_17

    .line 415
    .line 416
    const-wide v13, 0x4048800000000000L    # 49.0

    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    invoke-static {v13, v14, v7, v8}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfTones(DD)D

    .line 422
    .line 423
    .line 424
    move-result-wide v5

    .line 425
    cmpl-double v2, v5, v9

    .line 426
    .line 427
    if-ltz v2, :cond_16

    .line 428
    .line 429
    move-wide v12, v13

    .line 430
    goto :goto_b

    .line 431
    :cond_16
    move-wide v12, v11

    .line 432
    goto :goto_b

    .line 433
    :cond_17
    move-wide v12, v5

    .line 434
    :goto_b
    iget-object v2, v0, Lcom/google/android/material/color/utilities/DynamicColor;->secondBackground:Ljava/util/function/Function;

    .line 435
    .line 436
    if-eqz v2, :cond_21

    .line 437
    .line 438
    iget-object v2, v0, Lcom/google/android/material/color/utilities/DynamicColor;->background:Ljava/util/function/Function;

    .line 439
    .line 440
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    check-cast v2, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 445
    .line 446
    invoke-virtual {v2, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->getTone(Lcom/google/android/material/color/utilities/DynamicScheme;)D

    .line 447
    .line 448
    .line 449
    move-result-wide v5

    .line 450
    iget-object v2, v0, Lcom/google/android/material/color/utilities/DynamicColor;->secondBackground:Ljava/util/function/Function;

    .line 451
    .line 452
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    check-cast v2, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 457
    .line 458
    invoke-virtual {v2, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->getTone(Lcom/google/android/material/color/utilities/DynamicScheme;)D

    .line 459
    .line 460
    .line 461
    move-result-wide v1

    .line 462
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(DD)D

    .line 463
    .line 464
    .line 465
    move-result-wide v7

    .line 466
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->min(DD)D

    .line 467
    .line 468
    .line 469
    move-result-wide v14

    .line 470
    invoke-static {v7, v8, v12, v13}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfTones(DD)D

    .line 471
    .line 472
    .line 473
    move-result-wide v16

    .line 474
    cmpl-double v11, v16, v9

    .line 475
    .line 476
    if-ltz v11, :cond_18

    .line 477
    .line 478
    invoke-static {v14, v15, v12, v13}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfTones(DD)D

    .line 479
    .line 480
    .line 481
    move-result-wide v16

    .line 482
    cmpl-double v11, v16, v9

    .line 483
    .line 484
    if-ltz v11, :cond_18

    .line 485
    .line 486
    return-wide v12

    .line 487
    :cond_18
    invoke-static {v7, v8, v9, v10}, Lcom/google/android/material/color/utilities/Contrast;->lighter(DD)D

    .line 488
    .line 489
    .line 490
    move-result-wide v7

    .line 491
    invoke-static {v14, v15, v9, v10}, Lcom/google/android/material/color/utilities/Contrast;->darker(DD)D

    .line 492
    .line 493
    .line 494
    move-result-wide v9

    .line 495
    new-instance v11, Ljava/util/ArrayList;

    .line 496
    .line 497
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 498
    .line 499
    .line 500
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 501
    .line 502
    cmpl-double v14, v7, v12

    .line 503
    .line 504
    if-eqz v14, :cond_19

    .line 505
    .line 506
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 507
    .line 508
    .line 509
    move-result-object v15

    .line 510
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    :cond_19
    cmpl-double v12, v9, v12

    .line 514
    .line 515
    if-eqz v12, :cond_1a

    .line 516
    .line 517
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 518
    .line 519
    .line 520
    move-result-object v13

    .line 521
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    :cond_1a
    invoke-static {v5, v6}, Lcom/google/android/material/color/utilities/DynamicColor;->tonePrefersLightForeground(D)Z

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    if-nez v5, :cond_1c

    .line 529
    .line 530
    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/DynamicColor;->tonePrefersLightForeground(D)Z

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    if-eqz v1, :cond_1b

    .line 535
    .line 536
    goto :goto_c

    .line 537
    :cond_1b
    const/4 v1, 0x0

    .line 538
    goto :goto_d

    .line 539
    :cond_1c
    :goto_c
    const/4 v1, 0x1

    .line 540
    :goto_d
    if-eqz v1, :cond_1e

    .line 541
    .line 542
    if-nez v14, :cond_1d

    .line 543
    .line 544
    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    .line 545
    .line 546
    :cond_1d
    return-wide v7

    .line 547
    :cond_1e
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    const/4 v2, 0x1

    .line 552
    if-ne v1, v2, :cond_1f

    .line 553
    .line 554
    const/4 v1, 0x0

    .line 555
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, Ljava/lang/Double;

    .line 560
    .line 561
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 562
    .line 563
    .line 564
    move-result-wide v1

    .line 565
    return-wide v1

    .line 566
    :cond_1f
    if-nez v12, :cond_20

    .line 567
    .line 568
    move-wide v4, v3

    .line 569
    goto :goto_e

    .line 570
    :cond_20
    move-wide v4, v9

    .line 571
    :goto_e
    return-wide v4

    .line 572
    :cond_21
    return-wide v12
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method
