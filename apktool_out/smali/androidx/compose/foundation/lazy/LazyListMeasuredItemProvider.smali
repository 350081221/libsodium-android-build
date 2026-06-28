.class public abstract Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008 \u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J0\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H&R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u00020\u00128\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006 "
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
        "",
        "",
        "index",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "getAndMeasure",
        "key",
        "contentType",
        "",
        "Landroidx/compose/ui/layout/Placeable;",
        "placeables",
        "createItem",
        "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "measureScope",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "childConstraints",
        "J",
        "getChildConstraints-msEJaDk",
        "()J",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;",
        "getKeyIndexMap",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;",
        "keyIndexMap",
        "constraints",
        "",
        "isVertical",
        "<init>",
        "(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/internal/w;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final childConstraints:J

.field private final itemProvider:Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final measureScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->itemProvider:Landroidx/compose/foundation/lazy/LazyListItemProvider;

    .line 5
    .line 6
    iput-object p5, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->measureScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const p4, 0x7fffffff

    .line 10
    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 15
    .line 16
    .line 17
    move-result p5

    .line 18
    move v1, p5

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, p4

    .line 21
    :goto_0
    const/4 v2, 0x0

    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    move v3, p1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v3, p4

    .line 31
    :goto_1
    const/4 v4, 0x5

    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    iput-wide p1, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->childConstraints:J

    .line 38
    .line 39
    return-void
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

.method public synthetic constructor <init>(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/internal/w;)V
    .locals 0
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;-><init>(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;)V

    return-void
.end method


# virtual methods
.method public abstract createItem(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;)",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public final getAndMeasure(I)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .locals 5
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->itemProvider:Landroidx/compose/foundation/lazy/LazyListItemProvider;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getKey(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->itemProvider:Landroidx/compose/foundation/lazy/LazyListItemProvider;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getContentType(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->measureScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    .line 14
    .line 15
    iget-wide v3, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->childConstraints:J

    .line 16
    .line 17
    invoke-interface {v2, p1, v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->measure-0kLqBqw(IJ)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0, p1, v0, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->createItem(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final getChildConstraints-msEJaDk()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->childConstraints:J

    return-wide v0
.end method

.method public final getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->itemProvider:Landroidx/compose/foundation/lazy/LazyListItemProvider;

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/LazyListItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v0

    return-object v0
.end method
