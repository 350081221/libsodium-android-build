.class final Landroidx/compose/ui/text/android/HorizontalPositionCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u000e\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/HorizontalPositionCache;",
        "",
        "layout",
        "Landroidx/compose/ui/text/android/TextLayout;",
        "(Landroidx/compose/ui/text/android/TextLayout;)V",
        "cachedKey",
        "",
        "cachedValue",
        "",
        "getLayout",
        "()Landroidx/compose/ui/text/android/TextLayout;",
        "get",
        "offset",
        "upstream",
        "",
        "cache",
        "primary",
        "getPrimaryDownstream",
        "getPrimaryUpstream",
        "getSecondaryDownstream",
        "getSecondaryUpstream",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private cachedKey:I

.field private cachedValue:F

.field private final layout:Landroidx/compose/ui/text/android/TextLayout;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/text/android/TextLayout;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/text/android/TextLayout;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->cachedKey:I

    .line 8
    .line 9
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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private final get(IZZZ)F
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/compose/ui/text/android/TextLayout;->getLayout()Landroid/text/Layout;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2, p1, p2}, Landroidx/compose/ui/text/android/LayoutCompatKt;->getLineForOffset(Landroid/text/Layout;IZ)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Landroidx/compose/ui/text/android/TextLayout;->getLineStart(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-object v4, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 22
    .line 23
    invoke-virtual {v4, v2}, Landroidx/compose/ui/text/android/TextLayout;->getLineEnd(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eq p1, v3, :cond_0

    .line 28
    .line 29
    if-ne p1, v2, :cond_1

    .line 30
    .line 31
    :cond_0
    move v2, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v2, v1

    .line 34
    :goto_0
    mul-int/lit8 v3, p1, 0x4

    .line 35
    .line 36
    if-eqz p4, :cond_2

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    move v0, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    if-eqz v2, :cond_3

    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const/4 v0, 0x3

    .line 47
    :cond_4
    :goto_1
    add-int/2addr v3, v0

    .line 48
    iget v0, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->cachedKey:I

    .line 49
    .line 50
    if-ne v0, v3, :cond_5

    .line 51
    .line 52
    iget p1, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->cachedValue:F

    .line 53
    .line 54
    return p1

    .line 55
    :cond_5
    if-eqz p4, :cond_6

    .line 56
    .line 57
    iget-object p4, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 58
    .line 59
    invoke-virtual {p4, p1, p2}, Landroidx/compose/ui/text/android/TextLayout;->getPrimaryHorizontal(IZ)F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    goto :goto_2

    .line 64
    :cond_6
    iget-object p4, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 65
    .line 66
    invoke-virtual {p4, p1, p2}, Landroidx/compose/ui/text/android/TextLayout;->getSecondaryHorizontal(IZ)F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    :goto_2
    if-eqz p3, :cond_7

    .line 71
    .line 72
    iput v3, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->cachedKey:I

    .line 73
    .line 74
    iput p1, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->cachedValue:F

    .line 75
    .line 76
    :cond_7
    return p1
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
.end method


# virtual methods
.method public final getLayout()Landroidx/compose/ui/text/android/TextLayout;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/HorizontalPositionCache;->layout:Landroidx/compose/ui/text/android/TextLayout;

    return-object v0
.end method

.method public final getPrimaryDownstream(I)F
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v0, v1}, Landroidx/compose/ui/text/android/HorizontalPositionCache;->get(IZZZ)F

    move-result p1

    return p1
.end method

.method public final getPrimaryUpstream(I)F
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0, v0}, Landroidx/compose/ui/text/android/HorizontalPositionCache;->get(IZZZ)F

    move-result p1

    return p1
.end method

.method public final getSecondaryDownstream(I)F
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0, v0}, Landroidx/compose/ui/text/android/HorizontalPositionCache;->get(IZZZ)F

    move-result p1

    return p1
.end method

.method public final getSecondaryUpstream(I)F
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v0, v1}, Landroidx/compose/ui/text/android/HorizontalPositionCache;->get(IZZZ)F

    move-result p1

    return p1
.end method
