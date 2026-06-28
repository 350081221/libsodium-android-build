.class public final Landroidx/compose/material3/SheetState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material3/SheetState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B;\u0008\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0008\u0002\u00108\u001a\u00020\u000c\u0012\u0014\u0008\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u001809\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0018\u00a2\u0006\u0004\u0008;\u0010<BC\u0008\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u00108\u001a\u00020\u000c\u0012\u0014\u0008\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u001809\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0018\u00a2\u0006\u0004\u0008;\u0010=J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0010\u0010\n\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0010\u0010\u000b\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u0008J\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0004H\u0080@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0080@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0080@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001cR(\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001f8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u0011\u0010.\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-R\u0011\u0010\r\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010-R\u0011\u00100\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\u001cR\u0011\u00102\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010\u001cR\u0011\u00104\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010\u001cR\u0016\u00107\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u00106\u00a8\u0006?"
    }
    d2 = {
        "Landroidx/compose/material3/SheetState;",
        "",
        "Landroidx/compose/ui/unit/Density;",
        "requireDensity",
        "",
        "requireOffset",
        "Lkotlin/r2;",
        "expand",
        "(Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "partialExpand",
        "show",
        "hide",
        "Landroidx/compose/material3/SheetValue;",
        "targetValue",
        "velocity",
        "animateTo$material3_release",
        "(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/d;)Ljava/lang/Object;",
        "animateTo",
        "snapTo$material3_release",
        "(Landroidx/compose/material3/SheetValue;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "snapTo",
        "settle$material3_release",
        "(FLkotlin/coroutines/d;)Ljava/lang/Object;",
        "settle",
        "",
        "skipPartiallyExpanded",
        "Z",
        "getSkipPartiallyExpanded$material3_release",
        "()Z",
        "skipHiddenState",
        "getSkipHiddenState$material3_release",
        "Landroidx/compose/material3/AnchoredDraggableState;",
        "anchoredDraggableState",
        "Landroidx/compose/material3/AnchoredDraggableState;",
        "getAnchoredDraggableState$material3_release",
        "()Landroidx/compose/material3/AnchoredDraggableState;",
        "setAnchoredDraggableState$material3_release",
        "(Landroidx/compose/material3/AnchoredDraggableState;)V",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "getDensity$material3_release",
        "()Landroidx/compose/ui/unit/Density;",
        "setDensity$material3_release",
        "(Landroidx/compose/ui/unit/Density;)V",
        "getCurrentValue",
        "()Landroidx/compose/material3/SheetValue;",
        "currentValue",
        "getTargetValue",
        "isVisible",
        "getHasExpandedState",
        "hasExpandedState",
        "getHasPartiallyExpandedState",
        "hasPartiallyExpandedState",
        "getOffset$material3_release",
        "()Ljava/lang/Float;",
        "offset",
        "initialValue",
        "Lkotlin/Function1;",
        "confirmValueChange",
        "<init>",
        "(ZLandroidx/compose/material3/SheetValue;Lv3/l;Z)V",
        "(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lv3/l;Z)V",
        "Companion",
        "material3_release"
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

.field public static final Companion:Landroidx/compose/material3/SheetState$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/material3/AnchoredDraggableState<",
            "Landroidx/compose/material3/SheetValue;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private density:Landroidx/compose/ui/unit/Density;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final skipHiddenState:Z

.field private final skipPartiallyExpanded:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/material3/SheetState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/material3/SheetState$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/material3/SheetState;->Companion:Landroidx/compose/material3/SheetState$Companion;

    return-void
.end method

.method public constructor <init>(ZLandroidx/compose/material3/SheetValue;Lv3/l;Z)V
    .locals 6
    .param p2    # Landroidx/compose/material3/SheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/material3/SheetValue;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        message = "This constructor is deprecated. Please use the constructor that provides a [Density]"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "SheetState(skipPartiallyExpanded, LocalDensity.current, initialValue, confirmValueChange, skipHiddenState)"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Landroidx/compose/material3/SheetState;->skipPartiallyExpanded:Z

    .line 3
    iput-boolean p4, p0, Landroidx/compose/material3/SheetState;->skipHiddenState:Z

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 4
    sget-object p1, Landroidx/compose/material3/SheetValue;->PartiallyExpanded:Landroidx/compose/material3/SheetValue;

    if-eq p2, p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    if-eqz p4, :cond_5

    .line 5
    sget-object p1, Landroidx/compose/material3/SheetValue;->Hidden:Landroidx/compose/material3/SheetValue;

    if-eq p2, p1, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The initial value must not be set to Hidden if skipHiddenState is set to true."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_5
    :goto_3
    sget-object p1, Landroidx/compose/material3/AnchoredDraggableDefaults;->INSTANCE:Landroidx/compose/material3/AnchoredDraggableDefaults;

    invoke-virtual {p1}, Landroidx/compose/material3/AnchoredDraggableDefaults;->getAnimationSpec()Landroidx/compose/animation/core/SpringSpec;

    move-result-object v4

    .line 7
    new-instance p1, Landroidx/compose/material3/AnchoredDraggableState;

    .line 8
    new-instance v2, Landroidx/compose/material3/SheetState$anchoredDraggableState$1;

    invoke-direct {v2, p0}, Landroidx/compose/material3/SheetState$anchoredDraggableState$1;-><init>(Landroidx/compose/material3/SheetState;)V

    .line 9
    new-instance v3, Landroidx/compose/material3/SheetState$anchoredDraggableState$2;

    invoke-direct {v3, p0}, Landroidx/compose/material3/SheetState$anchoredDraggableState$2;-><init>(Landroidx/compose/material3/SheetState;)V

    move-object v0, p1

    move-object v1, p2

    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/AnchoredDraggableState;-><init>(Ljava/lang/Object;Lv3/l;Lv3/a;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;)V

    iput-object p1, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    return-void
.end method

.method public synthetic constructor <init>(ZLandroidx/compose/material3/SheetValue;Lv3/l;ZILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 11
    sget-object p2, Landroidx/compose/material3/SheetValue;->Hidden:Landroidx/compose/material3/SheetValue;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 12
    sget-object p3, Landroidx/compose/material3/SheetState$1;->INSTANCE:Landroidx/compose/material3/SheetState$1;

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/material3/SheetState;-><init>(ZLandroidx/compose/material3/SheetValue;Lv3/l;Z)V

    return-void
.end method

.method public constructor <init>(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lv3/l;Z)V
    .locals 0
    .param p2    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/material3/SheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/material3/SheetValue;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p3, p4, p5}, Landroidx/compose/material3/SheetState;-><init>(ZLandroidx/compose/material3/SheetValue;Lv3/l;Z)V

    .line 18
    iput-object p2, p0, Landroidx/compose/material3/SheetState;->density:Landroidx/compose/ui/unit/Density;

    return-void
.end method

.method public synthetic constructor <init>(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lv3/l;ZILkotlin/jvm/internal/w;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 14
    sget-object p3, Landroidx/compose/material3/SheetValue;->Hidden:Landroidx/compose/material3/SheetValue;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 15
    sget-object p4, Landroidx/compose/material3/SheetState$2;->INSTANCE:Landroidx/compose/material3/SheetState$2;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move v5, p5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/SheetState;-><init>(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lv3/l;Z)V

    return-void
.end method

.method public static final synthetic access$requireDensity(Landroidx/compose/material3/SheetState;)Landroidx/compose/ui/unit/Density;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/material3/SheetState;->requireDensity()Landroidx/compose/ui/unit/Density;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic animateTo$material3_release$default(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/compose/material3/AnchoredDraggableState;->getLastVelocity()F

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material3/SheetState;->animateTo$material3_release(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/d;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
.end method

.method private final requireDensity()Landroidx/compose/ui/unit/Density;
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->density:Landroidx/compose/ui/unit/Density;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final animateTo$material3_release(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroidx/compose/material3/SheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetValue;",
            "F",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-static {v0, p1, p2, p3}, Landroidx/compose/material3/AnchoredDraggableKt;->animateTo(Landroidx/compose/material3/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final expand(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    sget-object v1, Landroidx/compose/material3/SheetValue;->Expanded:Landroidx/compose/material3/SheetValue;

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Landroidx/compose/material3/AnchoredDraggableKt;->animateTo$default(Landroidx/compose/material3/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final getAnchoredDraggableState$material3_release()Landroidx/compose/material3/AnchoredDraggableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/material3/AnchoredDraggableState<",
            "Landroidx/compose/material3/SheetValue;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    return-object v0
.end method

.method public final getCurrentValue()Landroidx/compose/material3/SheetValue;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getCurrentValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material3/SheetValue;

    return-object v0
.end method

.method public final getDensity$material3_release()Landroidx/compose/ui/unit/Density;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->density:Landroidx/compose/ui/unit/Density;

    return-object v0
.end method

.method public final getHasExpandedState()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getAnchors()Landroidx/compose/material3/DraggableAnchors;

    move-result-object v0

    sget-object v1, Landroidx/compose/material3/SheetValue;->Expanded:Landroidx/compose/material3/SheetValue;

    invoke-interface {v0, v1}, Landroidx/compose/material3/DraggableAnchors;->hasAnchorFor(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final getHasPartiallyExpandedState()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getAnchors()Landroidx/compose/material3/DraggableAnchors;

    move-result-object v0

    sget-object v1, Landroidx/compose/material3/SheetValue;->PartiallyExpanded:Landroidx/compose/material3/SheetValue;

    invoke-interface {v0, v1}, Landroidx/compose/material3/DraggableAnchors;->hasAnchorFor(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final getOffset$material3_release()Ljava/lang/Float;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getOffset()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final getSkipHiddenState$material3_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/material3/SheetState;->skipHiddenState:Z

    return v0
.end method

.method public final getSkipPartiallyExpanded$material3_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/material3/SheetState;->skipPartiallyExpanded:Z

    return v0
.end method

.method public final getTargetValue()Landroidx/compose/material3/SheetValue;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getTargetValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material3/SheetValue;

    return-object v0
.end method

.method public final hide(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/compose/material3/SheetState;->skipHiddenState:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v2, Landroidx/compose/material3/SheetValue;->Hidden:Landroidx/compose/material3/SheetValue;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v1, p0

    .line 13
    move-object v4, p1

    .line 14
    invoke-static/range {v1 .. v6}, Landroidx/compose/material3/SheetState;->animateTo$material3_release$default(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function."

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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

.method public final isVisible()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->getCurrentValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Landroidx/compose/material3/SheetValue;->Hidden:Landroidx/compose/material3/SheetValue;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final partialExpand(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/compose/material3/SheetState;->skipPartiallyExpanded:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v2, Landroidx/compose/material3/SheetValue;->PartiallyExpanded:Landroidx/compose/material3/SheetValue;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v1, p0

    .line 13
    move-object v4, p1

    .line 14
    invoke-static/range {v1 .. v6}, Landroidx/compose/material3/SheetState;->animateTo$material3_release$default(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function."

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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

.method public final requireOffset()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0}, Landroidx/compose/material3/AnchoredDraggableState;->requireOffset()F

    move-result v0

    return v0
.end method

.method public final setAnchoredDraggableState$material3_release(Landroidx/compose/material3/AnchoredDraggableState;)V
    .locals 0
    .param p1    # Landroidx/compose/material3/AnchoredDraggableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/AnchoredDraggableState<",
            "Landroidx/compose/material3/SheetValue;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    return-void
.end method

.method public final setDensity$material3_release(Landroidx/compose/ui/unit/Density;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/material3/SheetState;->density:Landroidx/compose/ui/unit/Density;

    return-void
.end method

.method public final settle$material3_release(FLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/material3/AnchoredDraggableState;->settle(FLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final show(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/SheetState;->getHasPartiallyExpandedState()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/material3/SheetValue;->PartiallyExpanded:Landroidx/compose/material3/SheetValue;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Landroidx/compose/material3/SheetValue;->Expanded:Landroidx/compose/material3/SheetValue;

    .line 11
    .line 12
    :goto_0
    move-object v2, v0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v5, 0x2

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v1, p0

    .line 17
    move-object v4, p1

    .line 18
    invoke-static/range {v1 .. v6}, Landroidx/compose/material3/SheetState;->animateTo$material3_release$default(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 30
    .line 31
    return-object p1
    .line 32
.end method

.method public final snapTo$material3_release(Landroidx/compose/material3/SheetValue;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroidx/compose/material3/SheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetValue;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/SheetState;->anchoredDraggableState:Landroidx/compose/material3/AnchoredDraggableState;

    invoke-static {v0, p1, p2}, Landroidx/compose/material3/AnchoredDraggableKt;->snapTo(Landroidx/compose/material3/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method
