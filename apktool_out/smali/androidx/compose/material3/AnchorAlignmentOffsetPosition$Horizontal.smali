.class public final Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/material3/MenuPosition$Horizontal;


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/material3/AnchorAlignmentOffsetPosition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Horizontal"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0008\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\t\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\n\u001a\u00020\u0006H\u00c2\u0003J\'\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00d6\u0001J2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;",
        "Landroidx/compose/material3/MenuPosition$Horizontal;",
        "menuAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "anchorAlignment",
        "offset",
        "",
        "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)V",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "position",
        "anchorBounds",
        "Landroidx/compose/ui/unit/IntRect;",
        "windowSize",
        "Landroidx/compose/ui/unit/IntSize;",
        "menuWidth",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "position-95KtPRI",
        "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I",
        "toString",
        "",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final offset:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)V
    .locals 0
    .param p1    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    .line 9
    .line 10
    return-void
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
.end method

.method private final component1()Landroidx/compose/ui/Alignment$Horizontal;
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    return-object v0
.end method

.method private final component2()Landroidx/compose/ui/Alignment$Horizontal;
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    return-object v0
.end method

.method private final component3()I
    .locals 1

    iget v0, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    return v0
.end method

.method public static synthetic copy$default(Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILjava/lang/Object;)Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->copy(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;
    .locals 1
    .param p1    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;

    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;-><init>(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;

    iget-object v1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iget-object v3, p1, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iget-object v3, p1, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    iget p1, p1, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public position-95KtPRI(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I
    .locals 1
    .param p1    # Landroidx/compose/ui/unit/IntRect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object p2, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntRect;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-interface {p2, v0, p3, p5}, Landroidx/compose/ui/Alignment$Horizontal;->align(IILandroidx/compose/ui/unit/LayoutDirection;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget-object p3, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    .line 13
    .line 14
    invoke-interface {p3, v0, p4, p5}, Landroidx/compose/ui/Alignment$Horizontal;->align(IILandroidx/compose/ui/unit/LayoutDirection;)I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    neg-int p3, p3

    .line 19
    sget-object p4, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 20
    .line 21
    if-ne p5, p4, :cond_0

    .line 22
    .line 23
    iget p4, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget p4, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    .line 27
    .line 28
    neg-int p4, p4

    .line 29
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntRect;->getLeft()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    add-int/2addr p1, p2

    .line 34
    add-int/2addr p1, p3

    .line 35
    add-int/2addr p1, p4

    .line 36
    return p1
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

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Horizontal(menuAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->menuAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", anchorAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->anchorAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
