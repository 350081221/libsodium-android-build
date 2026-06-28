.class public final Landroidx/compose/ui/text/TextMeasurerHelperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0001H\u0007\u00a2\u0006\u0002\u0010\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "DefaultCacheSize",
        "",
        "rememberTextMeasurer",
        "Landroidx/compose/ui/text/TextMeasurer;",
        "cacheSize",
        "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextMeasurer;",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n74#2:56\n74#2:57\n74#2:58\n83#3,3:59\n1116#4,6:62\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n47#1:56\n48#1:57\n49#1:58\n51#1:59,3\n51#1:62,6\n*E\n"
    }
.end annotation


# static fields
.field private static final DefaultCacheSize:I = 0x8


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final rememberTextMeasurer(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextMeasurer;
    .locals 6
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, 0x5bae9057

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    and-int/2addr p3, v1

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    sget p0, Landroidx/compose/ui/text/TextMeasurerHelperKt;->DefaultCacheSize:I

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    const/4 p3, -0x1

    .line 20
    const-string v2, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)"

    .line 21
    .line 22
    invoke-static {v0, p2, p3, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFontFamilyResolver()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 34
    .line 35
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    invoke-interface {p1, p3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    check-cast p3, Landroidx/compose/ui/unit/Density;

    .line 44
    .line 45
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroidx/compose/ui/unit/LayoutDirection;

    .line 54
    .line 55
    const/4 v2, 0x4

    .line 56
    new-array v3, v2, [Ljava/lang/Object;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    aput-object p2, v3, v4

    .line 60
    .line 61
    aput-object p3, v3, v1

    .line 62
    .line 63
    const/4 v1, 0x2

    .line 64
    aput-object v0, v3, v1

    .line 65
    .line 66
    const/4 v1, 0x3

    .line 67
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    aput-object v5, v3, v1

    .line 72
    .line 73
    const v1, -0x21de6e89

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 77
    .line 78
    .line 79
    move v1, v4

    .line 80
    :goto_0
    if-ge v4, v2, :cond_2

    .line 81
    .line 82
    aget-object v5, v3, v4

    .line 83
    .line 84
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    or-int/2addr v1, v5

    .line 89
    add-int/lit8 v4, v4, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-nez v1, :cond_3

    .line 97
    .line 98
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 99
    .line 100
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-ne v2, v1, :cond_4

    .line 105
    .line 106
    :cond_3
    new-instance v2, Landroidx/compose/ui/text/TextMeasurer;

    .line 107
    .line 108
    invoke-direct {v2, p2, p3, v0, p0}, Landroidx/compose/ui/text/TextMeasurer;-><init>(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 115
    .line 116
    .line 117
    check-cast v2, Landroidx/compose/ui/text/TextMeasurer;

    .line 118
    .line 119
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_5

    .line 124
    .line 125
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 126
    .line 127
    .line 128
    :cond_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 129
    .line 130
    .line 131
    return-object v2
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
.end method
